/*
 * generated by Xtext
 */
package com.rockwellcollins.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.rockwellcollins.services.SpearGrammarAccess;
import com.rockwellcollins.spear.ArrayAccessExpr;
import com.rockwellcollins.spear.ArrayExpr;
import com.rockwellcollins.spear.ArrayType;
import com.rockwellcollins.spear.ArrayUpdateExpr;
import com.rockwellcollins.spear.BaseUnit;
import com.rockwellcollins.spear.BinaryExpr;
import com.rockwellcollins.spear.BinaryUnitExpr;
import com.rockwellcollins.spear.BoolLiteral;
import com.rockwellcollins.spear.BoolType;
import com.rockwellcollins.spear.Constant;
import com.rockwellcollins.spear.Definitions;
import com.rockwellcollins.spear.DerivedUnit;
import com.rockwellcollins.spear.EnglishConstraint;
import com.rockwellcollins.spear.EnumType;
import com.rockwellcollins.spear.EnumValue;
import com.rockwellcollins.spear.FormalConstraint;
import com.rockwellcollins.spear.IdExpr;
import com.rockwellcollins.spear.IfThenElseExpr;
import com.rockwellcollins.spear.Import;
import com.rockwellcollins.spear.IntLiteral;
import com.rockwellcollins.spear.IntType;
import com.rockwellcollins.spear.MIdExpr;
import com.rockwellcollins.spear.Macro;
import com.rockwellcollins.spear.NamedType;
import com.rockwellcollins.spear.NamedUnitExpr;
import com.rockwellcollins.spear.Pattern;
import com.rockwellcollins.spear.PatternCall;
import com.rockwellcollins.spear.Patterns;
import com.rockwellcollins.spear.PreviousExpr;
import com.rockwellcollins.spear.RealLiteral;
import com.rockwellcollins.spear.RealType;
import com.rockwellcollins.spear.RecordAccessExpr;
import com.rockwellcollins.spear.RecordExpr;
import com.rockwellcollins.spear.RecordFieldExpr;
import com.rockwellcollins.spear.RecordType;
import com.rockwellcollins.spear.RecordTypeField;
import com.rockwellcollins.spear.RecordUpdateExpr;
import com.rockwellcollins.spear.SpearPackage;
import com.rockwellcollins.spear.Specification;
import com.rockwellcollins.spear.SpecificationCall;
import com.rockwellcollins.spear.UnaryExpr;
import com.rockwellcollins.spear.UserType;
import com.rockwellcollins.spear.Variable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class SpearSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SpearGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SpearPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SpearPackage.ARRAY_ACCESS_EXPR:
				sequence_AccessExpr(context, (ArrayAccessExpr) semanticObject); 
				return; 
			case SpearPackage.ARRAY_EXPR:
				sequence_AtomicExpr(context, (ArrayExpr) semanticObject); 
				return; 
			case SpearPackage.ARRAY_TYPE:
				sequence_TypeDef(context, (ArrayType) semanticObject); 
				return; 
			case SpearPackage.ARRAY_UPDATE_EXPR:
				sequence_AccessExpr(context, (ArrayUpdateExpr) semanticObject); 
				return; 
			case SpearPackage.BASE_UNIT:
				sequence_UnitDef(context, (BaseUnit) semanticObject); 
				return; 
			case SpearPackage.BINARY_EXPR:
				sequence_AndExpr_ImpliesExpr_MultiplyExpr_OrExpr_PlusExpr_RelationalExpr_SinceExpr_TriggersExpr(context, (BinaryExpr) semanticObject); 
				return; 
			case SpearPackage.BINARY_UNIT_EXPR:
				sequence_DivisionUnitExpr_ProductUnitExpr(context, (BinaryUnitExpr) semanticObject); 
				return; 
			case SpearPackage.BOOL_LITERAL:
				sequence_LiteralExpr(context, (BoolLiteral) semanticObject); 
				return; 
			case SpearPackage.BOOL_TYPE:
				sequence_Type(context, (BoolType) semanticObject); 
				return; 
			case SpearPackage.CONSTANT:
				sequence_Constant(context, (Constant) semanticObject); 
				return; 
			case SpearPackage.DEFINITIONS:
				sequence_Definitions(context, (Definitions) semanticObject); 
				return; 
			case SpearPackage.DERIVED_UNIT:
				sequence_UnitDef(context, (DerivedUnit) semanticObject); 
				return; 
			case SpearPackage.ENGLISH_CONSTRAINT:
				sequence_EnglishConstraint(context, (EnglishConstraint) semanticObject); 
				return; 
			case SpearPackage.ENUM_TYPE:
				sequence_TypeDef(context, (EnumType) semanticObject); 
				return; 
			case SpearPackage.ENUM_VALUE:
				sequence_EnumValue(context, (EnumValue) semanticObject); 
				return; 
			case SpearPackage.FORMAL_CONSTRAINT:
				sequence_FormalConstraint(context, (FormalConstraint) semanticObject); 
				return; 
			case SpearPackage.ID_EXPR:
				sequence_AtomicExpr(context, (IdExpr) semanticObject); 
				return; 
			case SpearPackage.IF_THEN_ELSE_EXPR:
				sequence_AtomicExpr(context, (IfThenElseExpr) semanticObject); 
				return; 
			case SpearPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case SpearPackage.INT_LITERAL:
				sequence_LiteralExpr(context, (IntLiteral) semanticObject); 
				return; 
			case SpearPackage.INT_TYPE:
				sequence_Type(context, (IntType) semanticObject); 
				return; 
			case SpearPackage.MID_EXPR:
				sequence_AtomicExpr(context, (MIdExpr) semanticObject); 
				return; 
			case SpearPackage.MACRO:
				sequence_Macro(context, (Macro) semanticObject); 
				return; 
			case SpearPackage.NAMED_TYPE:
				sequence_TypeDef(context, (NamedType) semanticObject); 
				return; 
			case SpearPackage.NAMED_UNIT_EXPR:
				sequence_AtomicUnitExpr(context, (NamedUnitExpr) semanticObject); 
				return; 
			case SpearPackage.PATTERN:
				sequence_Pattern(context, (Pattern) semanticObject); 
				return; 
			case SpearPackage.PATTERN_CALL:
				sequence_AtomicExpr(context, (PatternCall) semanticObject); 
				return; 
			case SpearPackage.PATTERNS:
				sequence_Patterns(context, (Patterns) semanticObject); 
				return; 
			case SpearPackage.PREVIOUS_EXPR:
				sequence_AtomicExpr(context, (PreviousExpr) semanticObject); 
				return; 
			case SpearPackage.REAL_LITERAL:
				sequence_LiteralExpr(context, (RealLiteral) semanticObject); 
				return; 
			case SpearPackage.REAL_TYPE:
				sequence_Type(context, (RealType) semanticObject); 
				return; 
			case SpearPackage.RECORD_ACCESS_EXPR:
				sequence_AccessExpr(context, (RecordAccessExpr) semanticObject); 
				return; 
			case SpearPackage.RECORD_EXPR:
				sequence_AtomicExpr(context, (RecordExpr) semanticObject); 
				return; 
			case SpearPackage.RECORD_FIELD_EXPR:
				sequence_RecordFieldExpr(context, (RecordFieldExpr) semanticObject); 
				return; 
			case SpearPackage.RECORD_TYPE:
				sequence_TypeDef(context, (RecordType) semanticObject); 
				return; 
			case SpearPackage.RECORD_TYPE_FIELD:
				sequence_RecordTypeField(context, (RecordTypeField) semanticObject); 
				return; 
			case SpearPackage.RECORD_UPDATE_EXPR:
				sequence_AccessExpr(context, (RecordUpdateExpr) semanticObject); 
				return; 
			case SpearPackage.SPECIFICATION:
				sequence_Specification(context, (Specification) semanticObject); 
				return; 
			case SpearPackage.SPECIFICATION_CALL:
				sequence_AtomicExpr(context, (SpecificationCall) semanticObject); 
				return; 
			case SpearPackage.UNARY_EXPR:
				sequence_PrefixExpr(context, (UnaryExpr) semanticObject); 
				return; 
			case SpearPackage.USER_TYPE:
				sequence_Type(context, (UserType) semanticObject); 
				return; 
			case SpearPackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (array=AccessExpr_ArrayAccessExpr_1_2_0_0_0 index=Expr)
	 */
	protected void sequence_AccessExpr(EObject context, ArrayAccessExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpearPackage.Literals.ARRAY_ACCESS_EXPR__ARRAY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpearPackage.Literals.ARRAY_ACCESS_EXPR__ARRAY));
			if(transientValues.isValueTransient(semanticObject, SpearPackage.Literals.ARRAY_ACCESS_EXPR__INDEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpearPackage.Literals.ARRAY_ACCESS_EXPR__INDEX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAccessExprAccess().getArrayAccessExprArrayAction_1_2_0_0_0(), semanticObject.getArray());
		feeder.accept(grammarAccess.getAccessExprAccess().getIndexExprParserRuleCall_1_2_1_0(), semanticObject.getIndex());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (access=AccessExpr_ArrayUpdateExpr_1_2_2_0_0_0 value=Expr)
	 */
	protected void sequence_AccessExpr(EObject context, ArrayUpdateExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpearPackage.Literals.ARRAY_UPDATE_EXPR__ACCESS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpearPackage.Literals.ARRAY_UPDATE_EXPR__ACCESS));
			if(transientValues.isValueTransient(semanticObject, SpearPackage.Literals.ARRAY_UPDATE_EXPR__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpearPackage.Literals.ARRAY_UPDATE_EXPR__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAccessExprAccess().getArrayUpdateExprAccessAction_1_2_2_0_0_0(), semanticObject.getAccess());
		feeder.accept(grammarAccess.getAccessExprAccess().getValueExprParserRuleCall_1_2_2_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (record=AccessExpr_RecordAccessExpr_1_0_0_0_0 field=[RecordFieldExpr|ID])
	 */
	protected void sequence_AccessExpr(EObject context, RecordAccessExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpearPackage.Literals.RECORD_ACCESS_EXPR__RECORD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpearPackage.Literals.RECORD_ACCESS_EXPR__RECORD));
			if(transientValues.isValueTransient(semanticObject, SpearPackage.Literals.RECORD_ACCESS_EXPR__FIELD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpearPackage.Literals.RECORD_ACCESS_EXPR__FIELD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAccessExprAccess().getRecordAccessExprRecordAction_1_0_0_0_0(), semanticObject.getRecord());
		feeder.accept(grammarAccess.getAccessExprAccess().getFieldRecordFieldExprIDTerminalRuleCall_1_0_1_0_1(), semanticObject.getField());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (record=AccessExpr_RecordUpdateExpr_1_1_0_0_0 field=[RecordFieldExpr|ID] value=Expr)
	 */
	protected void sequence_AccessExpr(EObject context, RecordUpdateExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpearPackage.Literals.RECORD_UPDATE_EXPR__RECORD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpearPackage.Literals.RECORD_UPDATE_EXPR__RECORD));
			if(transientValues.isValueTransient(semanticObject, SpearPackage.Literals.RECORD_UPDATE_EXPR__FIELD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpearPackage.Literals.RECORD_UPDATE_EXPR__FIELD));
			if(transientValues.isValueTransient(semanticObject, SpearPackage.Literals.RECORD_UPDATE_EXPR__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpearPackage.Literals.RECORD_UPDATE_EXPR__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAccessExprAccess().getRecordUpdateExprRecordAction_1_1_0_0_0(), semanticObject.getRecord());
		feeder.accept(grammarAccess.getAccessExprAccess().getFieldRecordFieldExprIDTerminalRuleCall_1_1_0_0_2_0_1(), semanticObject.getField());
		feeder.accept(grammarAccess.getAccessExprAccess().getValueExprParserRuleCall_1_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (left=PlusExpr_BinaryExpr_1_0_0_0 (op='+' | op='-') right=PlusExpr) | 
	 *         (left=MultiplyExpr_BinaryExpr_1_0_0_0 (op='*' | op='/') right=MultiplyExpr) | 
	 *         (left=RelationalExpr_BinaryExpr_1_0_0_0 op=RelationalOp right=RelationalExpr) | 
	 *         (left=SinceExpr_BinaryExpr_1_0_0_0 (op='S' | op='since') right=SinceExpr) | 
	 *         (left=TriggersExpr_BinaryExpr_1_0_0_0 (op='T' | op='triggers') right=TriggersExpr) | 
	 *         (left=AndExpr_BinaryExpr_1_0_0_0 op='and' right=AndExpr) | 
	 *         (left=OrExpr_BinaryExpr_1_0_0_0 (op='or' | op='xor') right=ImpliesExpr) | 
	 *         (left=ImpliesExpr_BinaryExpr_1_0_0_0 (op='=>' | op='implies') right=ImpliesExpr)
	 *     )
	 */
	protected void sequence_AndExpr_ImpliesExpr_MultiplyExpr_OrExpr_PlusExpr_RelationalExpr_SinceExpr_TriggersExpr(EObject context, BinaryExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[ArrayType|ID] exprs+=Expr exprs+=Expr*)
	 */
	protected void sequence_AtomicExpr(EObject context, ArrayExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     id=[IdRef|ID]
	 */
	protected void sequence_AtomicExpr(EObject context, IdExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpearPackage.Literals.ID_EXPR__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpearPackage.Literals.ID_EXPR__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicExprAccess().getIdIdRefIDTerminalRuleCall_1_1_0_1(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (cond=Expr then=Expr else=Expr)
	 */
	protected void sequence_AtomicExpr(EObject context, IfThenElseExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpearPackage.Literals.IF_THEN_ELSE_EXPR__COND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpearPackage.Literals.IF_THEN_ELSE_EXPR__COND));
			if(transientValues.isValueTransient(semanticObject, SpearPackage.Literals.IF_THEN_ELSE_EXPR__THEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpearPackage.Literals.IF_THEN_ELSE_EXPR__THEN));
			if(transientValues.isValueTransient(semanticObject, SpearPackage.Literals.IF_THEN_ELSE_EXPR__ELSE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpearPackage.Literals.IF_THEN_ELSE_EXPR__ELSE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicExprAccess().getCondExprParserRuleCall_4_2_0(), semanticObject.getCond());
		feeder.accept(grammarAccess.getAtomicExprAccess().getThenExprParserRuleCall_4_4_0(), semanticObject.getThen());
		feeder.accept(grammarAccess.getAtomicExprAccess().getElseExprParserRuleCall_4_6_0(), semanticObject.getElse());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (ids+=[IdRef|ID] ids+=[IdRef|ID]*)
	 */
	protected void sequence_AtomicExpr(EObject context, MIdExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pattern=[Pattern|ID] args+=Expr args+=Expr*)
	 */
	protected void sequence_AtomicExpr(EObject context, PatternCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (var=Expr init=Expr)
	 */
	protected void sequence_AtomicExpr(EObject context, PreviousExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpearPackage.Literals.PREVIOUS_EXPR__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpearPackage.Literals.PREVIOUS_EXPR__VAR));
			if(transientValues.isValueTransient(semanticObject, SpearPackage.Literals.PREVIOUS_EXPR__INIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpearPackage.Literals.PREVIOUS_EXPR__INIT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicExprAccess().getVarExprParserRuleCall_3_3_0(), semanticObject.getVar());
		feeder.accept(grammarAccess.getAtomicExprAccess().getInitExprParserRuleCall_3_5_0(), semanticObject.getInit());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=[RecordType|ID] fieldExprs+=RecordFieldExpr fieldExprs+=RecordFieldExpr*)
	 */
	protected void sequence_AtomicExpr(EObject context, RecordExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (spec=[Specification|ID] args+=Expr args+=Expr*)
	 */
	protected void sequence_AtomicExpr(EObject context, SpecificationCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     unit=[UnitDef|ID]
	 */
	protected void sequence_AtomicUnitExpr(EObject context, NamedUnitExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpearPackage.Literals.NAMED_UNIT_EXPR__UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpearPackage.Literals.NAMED_UNIT_EXPR__UNIT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicUnitExprAccess().getUnitUnitDefIDTerminalRuleCall_0_1_0_1(), semanticObject.getUnit());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=Type expr=Expr)
	 */
	protected void sequence_Constant(EObject context, Constant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpearPackage.Literals.ID_REF__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpearPackage.Literals.ID_REF__NAME));
			if(transientValues.isValueTransient(semanticObject, SpearPackage.Literals.CONSTANT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpearPackage.Literals.CONSTANT__TYPE));
			if(transientValues.isValueTransient(semanticObject, SpearPackage.Literals.CONSTANT__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpearPackage.Literals.CONSTANT__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getConstantAccess().getTypeTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getConstantAccess().getExprExprParserRuleCall_4_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID unitdefs+=UnitDef* typedefs+=TypeDef* constants+=Constant*)
	 */
	protected void sequence_Definitions(EObject context, Definitions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (left=ProductUnitExpr_BinaryUnitExpr_1_0_0_0 op='*' right=ProductUnitExpr) | 
	 *         (left=DivisionUnitExpr_BinaryUnitExpr_1_0_0_0 op='/' right=AtomicUnitExpr)
	 *     )
	 */
	protected void sequence_DivisionUnitExpr_ProductUnitExpr(EObject context, BinaryUnitExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID text=STRING)
	 */
	protected void sequence_EnglishConstraint(EObject context, EnglishConstraint semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpearPackage.Literals.CONSTRAINT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpearPackage.Literals.CONSTRAINT__NAME));
			if(transientValues.isValueTransient(semanticObject, SpearPackage.Literals.ENGLISH_CONSTRAINT__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpearPackage.Literals.ENGLISH_CONSTRAINT__TEXT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEnglishConstraintAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEnglishConstraintAccess().getTextSTRINGTerminalRuleCall_2_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_EnumValue(EObject context, EnumValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpearPackage.Literals.ID_REF__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpearPackage.Literals.ID_REF__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEnumValueAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID expr=Expr)
	 */
	protected void sequence_FormalConstraint(EObject context, FormalConstraint semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpearPackage.Literals.CONSTRAINT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpearPackage.Literals.CONSTRAINT__NAME));
			if(transientValues.isValueTransient(semanticObject, SpearPackage.Literals.FORMAL_CONSTRAINT__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpearPackage.Literals.FORMAL_CONSTRAINT__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFormalConstraintAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFormalConstraintAccess().getExprExprParserRuleCall_2_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpearPackage.Literals.IMPORT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpearPackage.Literals.IMPORT__IMPORT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=BOOL
	 */
	protected void sequence_LiteralExpr(EObject context, BoolLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpearPackage.Literals.BOOL_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpearPackage.Literals.BOOL_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralExprAccess().getValueBOOLParserRuleCall_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=INT unit=[UnitDef|ID]?)
	 */
	protected void sequence_LiteralExpr(EObject context, IntLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=REAL unit=[UnitDef|ID]?)
	 */
	protected void sequence_LiteralExpr(EObject context, RealLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=Type expr=Expr)
	 */
	protected void sequence_Macro(EObject context, Macro semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpearPackage.Literals.ID_REF__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpearPackage.Literals.ID_REF__NAME));
			if(transientValues.isValueTransient(semanticObject, SpearPackage.Literals.MACRO__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpearPackage.Literals.MACRO__TYPE));
			if(transientValues.isValueTransient(semanticObject, SpearPackage.Literals.MACRO__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpearPackage.Literals.MACRO__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMacroAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMacroAccess().getTypeTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getMacroAccess().getExprExprParserRuleCall_4_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         inputs+=Variable 
	 *         inputs+=Variable* 
	 *         outputs+=Variable 
	 *         outputs+=Variable* 
	 *         node=STRING 
	 *         english=STRING
	 *     )
	 */
	protected void sequence_Pattern(EObject context, Pattern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID patterns+=Pattern*)
	 */
	protected void sequence_Patterns(EObject context, Patterns semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             op='-' | 
	 *             op='not' | 
	 *             op='O' | 
	 *             op='once' | 
	 *             op='H' | 
	 *             op='historically'
	 *         ) 
	 *         expr=PrefixExpr
	 *     )
	 */
	protected void sequence_PrefixExpr(EObject context, UnaryExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID expr=Expr)
	 */
	protected void sequence_RecordFieldExpr(EObject context, RecordFieldExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpearPackage.Literals.RECORD_FIELD_EXPR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpearPackage.Literals.RECORD_FIELD_EXPR__NAME));
			if(transientValues.isValueTransient(semanticObject, SpearPackage.Literals.RECORD_FIELD_EXPR__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpearPackage.Literals.RECORD_FIELD_EXPR__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRecordFieldExprAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRecordFieldExprAccess().getExprExprParserRuleCall_2_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=Type)
	 */
	protected void sequence_RecordTypeField(EObject context, RecordTypeField semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpearPackage.Literals.RECORD_TYPE_FIELD__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpearPackage.Literals.RECORD_TYPE_FIELD__NAME));
			if(transientValues.isValueTransient(semanticObject, SpearPackage.Literals.RECORD_TYPE_FIELD__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpearPackage.Literals.RECORD_TYPE_FIELD__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRecordTypeFieldAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRecordTypeFieldAccess().getTypeTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         imports+=Import* 
	 *         units+=UnitDef* 
	 *         typedefs+=TypeDef* 
	 *         constants+=Constant* 
	 *         inputs+=Variable* 
	 *         outputs+=Variable* 
	 *         state+=Variable* 
	 *         macros+=Macro* 
	 *         assumptions+=Constraint* 
	 *         requirements+=Constraint* 
	 *         behaviors+=Constraint*
	 *     )
	 */
	protected void sequence_Specification(EObject context, Specification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID base=Type size=INT)
	 */
	protected void sequence_TypeDef(EObject context, ArrayType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpearPackage.Literals.TYPE_DEF__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpearPackage.Literals.TYPE_DEF__NAME));
			if(transientValues.isValueTransient(semanticObject, SpearPackage.Literals.ARRAY_TYPE__BASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpearPackage.Literals.ARRAY_TYPE__BASE));
			if(transientValues.isValueTransient(semanticObject, SpearPackage.Literals.ARRAY_TYPE__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpearPackage.Literals.ARRAY_TYPE__SIZE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_2_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTypeDefAccess().getBaseTypeParserRuleCall_2_3_0(), semanticObject.getBase());
		feeder.accept(grammarAccess.getTypeDefAccess().getSizeINTTerminalRuleCall_2_5_0(), semanticObject.getSize());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID values+=EnumValue values+=EnumValue*)
	 */
	protected void sequence_TypeDef(EObject context, EnumType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=Type unit=[UnitDef|ID]?)
	 */
	protected void sequence_TypeDef(EObject context, NamedType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID fields+=RecordTypeField fields+=RecordTypeField*)
	 */
	protected void sequence_TypeDef(EObject context, RecordType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {BoolType}
	 */
	protected void sequence_Type(EObject context, BoolType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {IntType}
	 */
	protected void sequence_Type(EObject context, IntType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {RealType}
	 */
	protected void sequence_Type(EObject context, RealType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     def=[TypeDef|ID]
	 */
	protected void sequence_Type(EObject context, UserType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpearPackage.Literals.USER_TYPE__DEF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpearPackage.Literals.USER_TYPE__DEF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeAccess().getDefTypeDefIDTerminalRuleCall_3_1_0_1(), semanticObject.getDef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING?)
	 */
	protected void sequence_UnitDef(EObject context, BaseUnit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID unit=UnitExpr description=STRING?)
	 */
	protected void sequence_UnitDef(EObject context, DerivedUnit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=Type)
	 */
	protected void sequence_Variable(EObject context, Variable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpearPackage.Literals.ID_REF__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpearPackage.Literals.ID_REF__NAME));
			if(transientValues.isValueTransient(semanticObject, SpearPackage.Literals.VARIABLE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpearPackage.Literals.VARIABLE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVariableAccess().getTypeTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
}
