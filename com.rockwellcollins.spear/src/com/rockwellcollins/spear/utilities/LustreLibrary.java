package com.rockwellcollins.spear.utilities;

import static jkind.lustre.LustreUtil.FALSE;
import static jkind.lustre.LustreUtil.TRUE;
import static jkind.lustre.LustreUtil.and;
import static jkind.lustre.LustreUtil.arrow;
import static jkind.lustre.LustreUtil.id;
import static jkind.lustre.LustreUtil.ite;
import static jkind.lustre.LustreUtil.not;
import static jkind.lustre.LustreUtil.or;
import static jkind.lustre.LustreUtil.pre;

import java.util.LinkedHashSet;
import java.util.Set;

import jkind.lustre.BinaryExpr;
import jkind.lustre.BinaryOp;
import jkind.lustre.CastExpr;
import jkind.lustre.Expr;
import jkind.lustre.IdExpr;
import jkind.lustre.IntExpr;
import jkind.lustre.NamedType;
import jkind.lustre.Node;
import jkind.lustre.VarDecl;
import jkind.lustre.builders.EquationBuilder;
import jkind.lustre.builders.NodeBuilder;

/**
 * PLTL is a utility that generates some commonly used PLTL expressions as
 * Lustre node because we need them to generate some of our autogenerated
 * properties.
 */
public class LustreLibrary {

	public static Expr integer(int iv) {
		return new IntExpr(iv);
	}
	
	public static Expr equal(Expr left, Expr right) {
		return new BinaryExpr(left, BinaryOp.EQUAL, right);
	}
	
	public static Expr less(Expr left, Expr right) {
		return new BinaryExpr(left, BinaryOp.LESS, right);
	}
	
	public static Expr plus(Expr left, Expr right) {
		return new BinaryExpr(left, BinaryOp.PLUS, right);
	}
	
	public static Expr greater(Expr left, Expr right) {
		return new BinaryExpr(left, BinaryOp.GREATER, right);
	}
	
	public static Expr greaterEqual(Expr left, Expr right) {
		return new BinaryExpr(left, BinaryOp.GREATEREQUAL, right);
	}

	/**
	 * Initially
	 * 
	 * node initially(signal : bool) returns (holds : bool);
	 * let
	 * 	  holds = signal -> true;
	 * tel;
	 */
	public static Node initially() {
		NodeBuilder initially = new NodeBuilder("initially");

		VarDecl signal = new VarDecl("signal", NamedType.BOOL);
		initially.addInput(signal);

		VarDecl holds = new VarDecl("holds", NamedType.BOOL);
		initially.addOutput(holds);

		// equations: holds = signal -> true
		EquationBuilder equation = new EquationBuilder();
		equation.addLhs(holds);
		equation.setExpr(arrow(id(signal),TRUE));

		initially.addEquation(equation.build());
		return initially.build();
	}

	/**
	 * Historically EXPR must be true on the current step and every previous
	 * step.
	 * 
	 * node historically(signal : bool) returns (holds : bool);
	 * let
	 * 	   holds = signal and (true -> pre holds);
	 * tel;
	 */
	public static Node historically() {
		NodeBuilder historically = new NodeBuilder("historically");

		VarDecl signal = new VarDecl("signal", NamedType.BOOL);
		historically.addInput(signal);

		VarDecl holds = new VarDecl("holds", NamedType.BOOL);
		historically.addOutput(holds);

		// equations: holds = signal and (true -> pre holds);
		EquationBuilder equation = new EquationBuilder();
		equation.addLhs(holds);
		equation.setExpr(and(id(signal), arrow(TRUE,pre(id(holds)))));

		historically.addEquation(equation.build());
		return historically.build();
	}

	/**
	 * O is the node that implements Once. Once EXPR must be true at least once
	 * on the current step and every previous step.
	 * 
	 * node once(signal : bool) returns (holds : bool);
	 * let
	 * 	   holds = signal or (false -> pre holds);
	 * tel;
	 */
	public static Node once() {
		NodeBuilder once = new NodeBuilder("once");

		VarDecl signal = new VarDecl("signal", NamedType.BOOL);
		once.addInput(signal);

		VarDecl holds = new VarDecl("holds", NamedType.BOOL);
		once.addOutput(holds);

		// equations: holds = signal or (false -> pre holds);
		EquationBuilder equation = new EquationBuilder();
		equation.addLhs(holds);
		equation.setExpr(or(id(signal), arrow(FALSE,pre(id(holds)))));
		
		once.addEquation(equation.build());
		return once.build();
	}

	/**
	 * S is the node that implements Since.
	 * 
	 * node since(a : bool; b : bool) returns (holds : bool);
	 * let
	 * 		holds = b or (a and (FALSE -> pre holds));
	 * tel;
	 */
	public static Node since() {
		NodeBuilder since = new NodeBuilder("since");

		VarDecl a = new VarDecl("a", NamedType.BOOL);
		VarDecl b = new VarDecl("b", NamedType.BOOL);
		since.addInput(a);
		since.addInput(b);

		VarDecl holds = new VarDecl("holds", NamedType.BOOL);
		since.addOutput(holds);

		EquationBuilder equation = new EquationBuilder();
		equation.addLhs(holds);
		equation.setExpr(or(id(b),and(id(a),arrow(FALSE,pre(id(holds))))));
		
		since.addEquation(equation.build());
		return since.build();
	}

	/**
	 * T is the node that implements Trigger (an alternate version that is false
	 * on the initial step.
	 * 
	 * node triggers(a : bool; b : bool) returns (holds : bool);
	 * let
	 * 		holds = b and (a or (FALSE -> pre holds));
	 * tel;
	 */
	public static Node triggers() {
		NodeBuilder triggers = new NodeBuilder("triggers");

		VarDecl a = new VarDecl("a", NamedType.BOOL);
		VarDecl b = new VarDecl("b", NamedType.BOOL);
		triggers.addInput(a);
		triggers.addInput(b);

		VarDecl holds = new VarDecl("holds", NamedType.BOOL);
		triggers.addOutput(holds);

		EquationBuilder equation = new EquationBuilder();
		equation.addLhs(holds);
		equation.setExpr(and(id(b),or(id(a),arrow(FALSE,pre(id(holds))))));
		
		triggers.addEquation(equation.build());
		return triggers.build();
	}

	/**
	 * Responds within shows causation of two variables a,b where A causes B to
	 * happen.
	 * 
	 * 	node responds(a : bool; b : bool; n : int) returns (holds : bool);
		var
		    state,pre_state,i,latch : int;
		let
		    --%MAIN;
		    latch = n -> pre latch;
		    pre_state = 0 -> pre state;

		    state =
		        if pre_state = 0
		        then
		            if (not b) or (b and a)
		            then 0
		            else 1
		        else if pre_state = 1
		        then
		            if (not a and i < latch)
		            then 1
		            else if (a and b)
		            then 1
		            else if (not a and i >= latch)
		            then 2
		            else 0
		        else 2;

		    i = 
		        if (pre_state = 0)
		        then 0
		        else if (pre_state = 1)
		        then
		            if (not a)
		            then pre i + 1
		            else if (a and b)
		            then 0
		            else pre i
		        else pre i;

		    holds = (state = 0) or (state = 1);
		tel;		
	 * 
	 */
	public static Node responds() {
		NodeBuilder responds = new NodeBuilder("responds");
		
		VarDecl a = new VarDecl("a", NamedType.BOOL);
		VarDecl b = new VarDecl("b", NamedType.BOOL);
		VarDecl n = new VarDecl("n", NamedType.INT);
		responds.addInput(a);
		responds.addInput(b);
		responds.addInput(n);
		
		VarDecl latch = new VarDecl("latch", NamedType.INT);
		VarDecl i = new VarDecl("i", NamedType.INT);
		VarDecl state = new VarDecl("state", NamedType.INT);
		VarDecl pre_state = new VarDecl("pre_state", NamedType.INT);
		responds.addLocal(latch);
		responds.addLocal(i);
		responds.addLocal(pre_state);
		responds.addLocal(state);

		VarDecl holds = new VarDecl("holds",NamedType.BOOL);
		responds.addOutput(holds);
		
		EquationBuilder latchEq = new EquationBuilder();
		latchEq.addLhs(latch);
		latchEq.setExpr(arrow(id(n),pre(id(latch))));
		
		EquationBuilder preStateEq = new EquationBuilder();
		preStateEq.addLhs(pre_state);
		preStateEq.setExpr(arrow(integer(0),pre(id(state))));
		
		EquationBuilder stateEq = new EquationBuilder();
		stateEq.addLhs(state);

		Expr ite6 = ite(and(not(id(a)), greaterEqual(id(i),id(latch))), integer(2), integer(0));
		Expr ite5 = ite(and(id(a),id(b)), integer(1), ite6);
		Expr ite4 = ite(and(not(id(a)),less(id(i),id(latch))), integer(1), ite5);
		Expr ite3 = ite(equal(id(pre_state),integer(1)), ite4, integer(2));
		Expr ite2 = ite(or(not(id(b)),and(id(a),id(b))), integer(0), integer(1));
		Expr ite1 = ite(equal(id(pre_state),integer(0)), ite2, ite3);
		stateEq.setExpr(ite1);
		
		EquationBuilder iEq = new EquationBuilder();
		iEq.addLhs(i);
		
		Expr ite10 = ite(and(id(a),id(b)), integer(0),pre(id(i)));
		Expr ite9 = ite(not(id(a)),plus(pre(id(i)),integer(1)),ite10);
		Expr ite8 = ite(equal(id(pre_state),integer(1)),ite9,pre(id(i)));
		Expr ite7 = ite(equal(id(pre_state),integer(0)),integer(0),ite8);
		iEq.setExpr(ite7);
		
		EquationBuilder holdsEq = new EquationBuilder();
		holdsEq.addLhs(holds);
		holdsEq.setExpr(or(equal(id(state),integer(0)), equal(id(state),integer(1))));
		
		responds.addEquation(latchEq.build());
		responds.addEquation(preStateEq.build());
		responds.addEquation(stateEq.build());
		responds.addEquation(iEq.build());
		responds.addEquation(holdsEq.build());		
		return responds.build();
	}

	/**
	 * fmod performs a floating point modulus
	 * node fmod(a : real; b : real) returns (x : real); 
	 * let 
	 * 		x = (a - (b * real(floor(a / b)))); 
	 * tel;
	 */
	public static Node fmod() {
		NodeBuilder fmod = new NodeBuilder("fmod");

		VarDecl a = new VarDecl("a", NamedType.REAL);
		VarDecl b = new VarDecl("b", NamedType.REAL);
		VarDecl x = new VarDecl("x", NamedType.REAL);
		fmod.addInput(a);
		fmod.addInput(b);
		fmod.addOutput(x);

		/* this is a bit gross, but easier to read this way */
		Expr inner_div = new BinaryExpr(new IdExpr(a.id), BinaryOp.DIVIDE, new IdExpr(b.id));
		Expr innercast = new CastExpr(NamedType.INT, inner_div);
		Expr outercast = new CastExpr(NamedType.REAL, innercast);
		Expr mult = new BinaryExpr(new IdExpr(b.id), BinaryOp.MULTIPLY, outercast);
		Expr finalExpr = new BinaryExpr(new IdExpr(a.id), BinaryOp.MINUS, mult);
		EquationBuilder eq = new EquationBuilder();
		eq.addLhs(x.id);
		eq.setExpr(finalExpr);

		fmod.addEquation(eq.build());
		return fmod.build();
	}
	
	/**
	 * precedes checks if event a occurred before (or simultaneously with) event B 
	 * 
	 * node precedes(a : bool; b : bool) returns (holds : bool);
	 *	var
	 *	    state,pre_state : int;
	 *	let
	 *	    pre_state = 0 -> pre state;
	 *
	 *	    state =
	 *	        if pre_state = 0 
	 *	        then
	 *	            if (a and b) or (not a and not b)
	 *	            then 0
	 *	            else if (a and not b)
	 *	            then 1
	 *	            else 2
	 *	        else if pre_state = 1 
	 *	        then
	 *	            if b 
	 *				then 0
	 *	            else 1
	 *	        else 2;
	 *
	 *	    holds = state = 0 or state = 1;
	 *	tel;
	 */
	public static Node precedes() {
		NodeBuilder precedes = new NodeBuilder("precedes");
		
		VarDecl a = new VarDecl("a",NamedType.BOOL);
		VarDecl b = new VarDecl("b",NamedType.BOOL);
		precedes.addInput(a);
		precedes.addInput(b);
		
		VarDecl state = new VarDecl("state",NamedType.INT);
		VarDecl pre_state = new VarDecl("pre_state",NamedType.INT);
		precedes.addLocal(state);
		precedes.addLocal(pre_state);
		
		VarDecl holds = new VarDecl("holds",NamedType.BOOL);
		precedes.addOutput(holds);
		
		EquationBuilder preStateEq = new EquationBuilder();
		preStateEq.addLhs(pre_state);
		preStateEq.setExpr(arrow(integer(0),pre(id(state))));
		precedes.addEquation(preStateEq.build());
		
		EquationBuilder stateEq = new EquationBuilder();
		stateEq.addLhs(state);

		Expr ite5 = ite(id(b),integer(0),integer(1));
		Expr ite4 = ite(equal(id(pre_state),integer(1)),ite5,integer(2));
		Expr ite3 = ite(and(id(a),not(id(b))),integer(1),integer(2));
		Expr ite2 = ite(or(and(id(a),id(b)),and(not(id(a)),not(id(b)))),integer(0),ite3);
		Expr ite1 = ite(equal(id(pre_state),integer(0)), ite2, ite4);
		stateEq.setExpr(ite1);
		precedes.addEquation(stateEq.build());
		
		EquationBuilder holdsEq = new EquationBuilder();
		holdsEq.addLhs(holds);
		holdsEq.setExpr(or(equal(id(state),integer(0)), equal(id(state),integer(1))));
		precedes.addEquation(holdsEq.build());
		
		return precedes.build();
	}
	
	/**
	 * node count(in : bool) returns (c : int);
	 *	let
	 *	    c = if in 
	 *	        then (0 -> pre c) + 1 
	 *	        else pre c;
	 *	tel;
	 */
	public static Node count() {
		NodeBuilder count = new NodeBuilder("count");
		
		VarDecl a = new VarDecl("a", NamedType.BOOL);
		count.addInput(a);
		
		VarDecl c = new VarDecl("c", NamedType.INT);
		count.addOutput(c);
		
		EquationBuilder cEq = new EquationBuilder();
		cEq.addLhs(c);
		cEq.setExpr(plus(arrow(integer(0),pre(id(c))),ite(id(a),integer(1),integer(0))));
		
		count.addEquation(cEq.build());
		return count.build();
	}

	/**
	 * node ccount(in : bool) returns (c : int);
	 *	let
	 *	    c = if in 
	 *	        then (0 -> pre c) + 1 
	 *	        else 0;
	 *	tel;
	 */
	public static Node ccount() {
		NodeBuilder ccount = new NodeBuilder("ccount");
		
		VarDecl a = new VarDecl("a", NamedType.BOOL);
		ccount.addInput(a);
		
		VarDecl c = new VarDecl("c", NamedType.INT);
		ccount.addOutput(c);
		
		EquationBuilder cEq = new EquationBuilder();
		cEq.addLhs(c);
		cEq.setExpr(ite(id(a),plus(arrow(integer(0),pre(id(c))),integer(1)),integer(0)));
		
		ccount.addEquation(cEq.build());
		return ccount.build();
	}
	
	/**
	 * node btoi(a : bool) returns (c : int);
	 * let
	 * 	   c = if a then 1 else 0;
	 * tel 
	 */
	public static Node btoi() {
		NodeBuilder btoi = new NodeBuilder("btoi");
		
		VarDecl a = new VarDecl("a", NamedType.BOOL);
		btoi.addInput(a);
		
		VarDecl c = new VarDecl("c", NamedType.INT);
		btoi.addOutput(c);
		
		EquationBuilder cEq = new EquationBuilder();
		cEq.addLhs(c);
		cEq.setExpr(ite(id(a),integer(1),integer(0)));
		
		btoi.addEquation(cEq.build());
		return btoi.build();
	}
	
	public static Set<Node> getLibraries() {
		Set<Node> nodes = new LinkedHashSet<>();
		nodes.add(initially());
		nodes.add(historically());
		nodes.add(once());
		nodes.add(since());
		nodes.add(triggers());
		nodes.add(responds());
		nodes.add(precedes());
		nodes.add(count());
		nodes.add(ccount());
		nodes.add(btoi());
		return nodes;
	}

	public static Set<Node> getNonlinearLibraries() {
		Set<Node> nodes = new LinkedHashSet<>();
		nodes.add(fmod());
		return nodes;
	}
}
