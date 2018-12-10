/*
 * generated by Xtext
 */
package com.rockwellcollins.formatting2;

import com.google.inject.Inject;
import com.rockwellcollins.services.SpearGrammarAccess;
import com.rockwellcollins.spear.AbstractTypeDef;
import com.rockwellcollins.spear.AfterUntilExpr;
import com.rockwellcollins.spear.ArrayAccessExpr;
import com.rockwellcollins.spear.ArrayExpr;
import com.rockwellcollins.spear.ArrayTypeDef;
import com.rockwellcollins.spear.ArrayUpdateExpr;
import com.rockwellcollins.spear.BinaryExpr;
import com.rockwellcollins.spear.BinaryUnitExpr;
import com.rockwellcollins.spear.Constant;
import com.rockwellcollins.spear.Constraint;
import com.rockwellcollins.spear.Data;
import com.rockwellcollins.spear.Definitions;
import com.rockwellcollins.spear.DerivedUnit;
import com.rockwellcollins.spear.EnglishConstraint;
import com.rockwellcollins.spear.EnumTypeDef;
import com.rockwellcollins.spear.EnumValue;
import com.rockwellcollins.spear.Expr;
import com.rockwellcollins.spear.FieldExpr;
import com.rockwellcollins.spear.FieldType;
import com.rockwellcollins.spear.FieldlessRecordExpr;
import com.rockwellcollins.spear.FormalConstraint;
import com.rockwellcollins.spear.IfThenElseExpr;
import com.rockwellcollins.spear.Import;
import com.rockwellcollins.spear.IntegerCast;
import com.rockwellcollins.spear.IntervalExpr;
import com.rockwellcollins.spear.ListExpr;
import com.rockwellcollins.spear.LustreAssertion;
import com.rockwellcollins.spear.LustreEquation;
import com.rockwellcollins.spear.LustreProperty;
import com.rockwellcollins.spear.Macro;
import com.rockwellcollins.spear.NamedTypeDef;
import com.rockwellcollins.spear.NormalizedCall;
import com.rockwellcollins.spear.Pattern;
import com.rockwellcollins.spear.PatternCall;
import com.rockwellcollins.spear.PredicateSubTypeDef;
import com.rockwellcollins.spear.PreviousExpr;
import com.rockwellcollins.spear.RealCast;
import com.rockwellcollins.spear.RecordAccessExpr;
import com.rockwellcollins.spear.RecordExpr;
import com.rockwellcollins.spear.RecordTypeDef;
import com.rockwellcollins.spear.RecordUpdateExpr;
import com.rockwellcollins.spear.RespondsExpr;
import com.rockwellcollins.spear.SetExpr;
import com.rockwellcollins.spear.Specification;
import com.rockwellcollins.spear.SpecificationCall;
import com.rockwellcollins.spear.TypeDef;
import com.rockwellcollins.spear.UnaryExpr;
import com.rockwellcollins.spear.UnitDef;
import com.rockwellcollins.spear.Variable;
import com.rockwellcollins.spear.WhileExpr;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;

class SpearFormatter extends AbstractFormatter2 {
	
	@Inject extension SpearGrammarAccess

	def dispatch void format(Specification specification, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		
		for (Import imports : specification.getImports()) {
			format(imports, document);
		}
		for (UnitDef units : specification.getUnits()) {
			format(units, document);
		}
		for (TypeDef typedefs : specification.getTypedefs()) {
			format(typedefs, document);
		}
		for (Constant constants : specification.getConstants()) {
			format(constants, document);
		}
		for (Pattern patterns : specification.getPatterns()) {
			format(patterns, document);
		}
		for (Variable inputs : specification.getInputs()) {
			format(inputs, document);
		}
		for (Variable outputs : specification.getOutputs()) {
			format(outputs, document);
		}
		for (Variable state : specification.getState()) {
			format(state, document);
		}
		for (Macro macros : specification.getMacros()) {
			format(macros, document);
		}
		for (Constraint assumptions : specification.getAssumptions()) {
			format(assumptions, document);
		}
		for (Constraint requirements : specification.getRequirements()) {
			format(requirements, document);
		}
		for (Constraint behaviors : specification.getBehaviors()) {
			format(behaviors, document);
		}
	}

	def dispatch void format(Definitions definitions, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Import imports : definitions.getImports()) {
			format(imports, document);
		}
		for (UnitDef units : definitions.getUnits()) {
			format(units, document);
		}
		for (TypeDef typedefs : definitions.getTypedefs()) {
			format(typedefs, document);
		}
		for (Constant constants : definitions.getConstants()) {
			format(constants, document);
		}
		for (Pattern patterns : definitions.getPatterns()) {
			format(patterns, document);
		}
	}

	def dispatch void format(DerivedUnit derivedunit, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(derivedunit.getUnit(), document);
	}

	def dispatch void format(Pattern pattern, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Variable inputs : pattern.getInputs()) {
			format(inputs, document);
		}
		for (Variable outputs : pattern.getOutputs()) {
			format(outputs, document);
		}
		for (Variable locals : pattern.getLocals()) {
			format(locals, document);
		}
		for (LustreEquation equations : pattern.getEquations()) {
			format(equations, document);
		}
		for (LustreProperty properties : pattern.getProperties()) {
			format(properties, document);
		}
		for (LustreAssertion assertions : pattern.getAssertions()) {
			format(assertions, document);
		}
		for (Data data : pattern.getData()) {
			format(data, document);
		}
	}

	def dispatch void format(LustreEquation lustreequation, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(lustreequation.getRhs(), document);
	}

	def dispatch void format(LustreAssertion lustreassertion, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(lustreassertion.getAssertionExpr(), document);
	}

	def dispatch void format(BinaryUnitExpr binaryunitexpr, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(binaryunitexpr.getRight(), document);
		format(binaryunitexpr.getLeft(), document);
	}

	def dispatch void format(NamedTypeDef namedtypedef, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(namedtypedef.getType(), document);
		for (Data data : namedtypedef.getData()) {
			format(data, document);
		}
	}

	def dispatch void format(PredicateSubTypeDef predicatesubtypedef, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(predicatesubtypedef.getPredVar(), document);
		format(predicatesubtypedef.getPredExpr(), document);
		for (Data data : predicatesubtypedef.getData()) {
			format(data, document);
		}
	}

	def dispatch void format(AbstractTypeDef abstracttypedef, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Data data : abstracttypedef.getData()) {
			format(data, document);
		}
	}

	def dispatch void format(RecordTypeDef recordtypedef, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (FieldType fields : recordtypedef.getFields()) {
			format(fields, document);
		}
		for (Data data : recordtypedef.getData()) {
			format(data, document);
		}
	}

	def dispatch void format(ArrayTypeDef arraytypedef, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(arraytypedef.getBase(), document);
		format(arraytypedef.getSize(), document);
		for (Data data : arraytypedef.getData()) {
			format(data, document);
		}
	}

	def dispatch void format(EnumTypeDef enumtypedef, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (EnumValue values : enumtypedef.getValues()) {
			format(values, document);
		}
		for (Data data : enumtypedef.getData()) {
			format(data, document);
		}
	}

	def dispatch void format(FieldType fieldtype, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(fieldtype.getType(), document);
	}

	def dispatch void format(Variable variable, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(variable.getType(), document);
		for (Data data : variable.getData()) {
			format(data, document);
		}
	}

	def dispatch void format(Constant constant, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(constant.getType(), document);
		format(constant.getExpr(), document);
		for (Data data : constant.getData()) {
			format(data, document);
		}
	}

	def dispatch void format(Macro macro, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(macro.getType(), document);
		format(macro.getExpr(), document);
		for (Data data : macro.getData()) {
			format(data, document);
		}
	}

	def dispatch void format(FormalConstraint formalconstraint, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(formalconstraint.getFlag(), document);
		format(formalconstraint.getExpr(), document);
		for (Data data : formalconstraint.getData()) {
			format(data, document);
		}
	}

	def dispatch void format(EnglishConstraint englishconstraint, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Data data : englishconstraint.getData()) {
			format(data, document);
		}
	}

	def dispatch void format(WhileExpr whileexpr, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(whileexpr.getCond(), document);
		format(whileexpr.getThen(), document);
	}

	def dispatch void format(BinaryExpr binaryexpr, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(binaryexpr.getRight(), document);
		format(binaryexpr.getLeft(), document);
	}

	def dispatch void format(RespondsExpr respondsexpr, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(respondsexpr.getStimulus(), document);
		format(respondsexpr.getDelay(), document);
		format(respondsexpr.getResponse(), document);
	}

	def dispatch void format(AfterUntilExpr afteruntilexpr, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(afteruntilexpr.getAfter(), document);
		format(afteruntilexpr.getUntil(), document);
	}

	def dispatch void format(UnaryExpr unaryexpr, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(unaryexpr.getExpr(), document);
	}

	def dispatch void format(PreviousExpr previousexpr, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(previousexpr.getVar(), document);
		format(previousexpr.getInit(), document);
	}

	def dispatch void format(RecordUpdateExpr recordupdateexpr, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(recordupdateexpr.getValue(), document);
		format(recordupdateexpr.getRecord(), document);
	}

	def dispatch void format(ArrayAccessExpr arrayaccessexpr, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(arrayaccessexpr.getIndex(), document);
		format(arrayaccessexpr.getArray(), document);
	}

	def dispatch void format(ArrayUpdateExpr arrayupdateexpr, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(arrayupdateexpr.getValue(), document);
		format(arrayupdateexpr.getAccess(), document);
	}

	def dispatch void format(IntervalExpr intervalexpr, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(intervalexpr.getHigh(), document);
		format(intervalexpr.getLow(), document);
	}

	def dispatch void format(SetExpr setexpr, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Expr exprs : setexpr.getExprs()) {
			format(exprs, document);
		}
	}

	def dispatch void format(IntegerCast integercast, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(integercast.getExpr(), document);
	}

	def dispatch void format(RealCast realcast, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(realcast.getExpr(), document);
	}

	def dispatch void format(ListExpr listexpr, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Expr exprs : listexpr.getExprs()) {
			format(exprs, document);
		}
	}

	def dispatch void format(IfThenElseExpr ifthenelseexpr, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(ifthenelseexpr.getCond(), document);
		format(ifthenelseexpr.getThen(), document);
		format(ifthenelseexpr.getElse(), document);
	}

	def dispatch void format(RecordExpr recordexpr, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (FieldExpr fieldExprs : recordexpr.getFieldExprs()) {
			format(fieldExprs, document);
		}
	}

	def dispatch void format(FieldlessRecordExpr fieldlessrecordexpr, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Expr exprs : fieldlessrecordexpr.getExprs()) {
			format(exprs, document);
		}
	}

	def dispatch void format(ArrayExpr arrayexpr, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Expr exprs : arrayexpr.getExprs()) {
			format(exprs, document);
		}
	}

	def dispatch void format(PatternCall patterncall, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Expr args : patterncall.getArgs()) {
			format(args, document);
		}
	}

	def dispatch void format(SpecificationCall specificationcall, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Expr args : specificationcall.getArgs()) {
			format(args, document);
		}
	}

	def dispatch void format(NormalizedCall normalizedcall, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Expr args : normalizedcall.getArgs()) {
			format(args, document);
		}
	}

	def dispatch void format(FieldExpr fieldexpr, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(fieldexpr.getExpr(), document);
	}

	def dispatch void format(RecordAccessExpr recordaccessexpr, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(recordaccessexpr.getRecord(), document);
	}
}
