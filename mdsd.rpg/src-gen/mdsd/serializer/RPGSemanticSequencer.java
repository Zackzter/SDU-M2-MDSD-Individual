/*
 * generated by Xtext 2.21.0
 */
package mdsd.serializer;

import com.google.inject.Inject;
import java.util.Set;
import mdsd.rPG.Add;
import mdsd.rPG.AltAttribute;
import mdsd.rPG.And;
import mdsd.rPG.Attribute;
import mdsd.rPG.AttributeValues;
import mdsd.rPG.Attributes;
import mdsd.rPG.Bigger;
import mdsd.rPG.BiggerEq;
import mdsd.rPG.Death;
import mdsd.rPG.Div;
import mdsd.rPG.EType;
import mdsd.rPG.Entities;
import mdsd.rPG.Entity;
import mdsd.rPG.EntityMoves;
import mdsd.rPG.Eq;
import mdsd.rPG.FloatNum;
import mdsd.rPG.IntNum;
import mdsd.rPG.Loc;
import mdsd.rPG.Locations;
import mdsd.rPG.Members;
import mdsd.rPG.Move;
import mdsd.rPG.Moves;
import mdsd.rPG.Mult;
import mdsd.rPG.NEq;
import mdsd.rPG.NameAttribute;
import mdsd.rPG.NumberComparing;
import mdsd.rPG.Or;
import mdsd.rPG.Proposition;
import mdsd.rPG.RPGPackage;
import mdsd.rPG.Relations;
import mdsd.rPG.Require;
import mdsd.rPG.SelfTargeting;
import mdsd.rPG.Smaller;
import mdsd.rPG.SmallerEq;
import mdsd.rPG.Sub;
import mdsd.rPG.SystemRPG;
import mdsd.rPG.Team;
import mdsd.rPG.Teams;
import mdsd.rPG.Type;
import mdsd.rPG.TypeExpression;
import mdsd.services.RPGGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class RPGSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RPGGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == RPGPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RPGPackage.ADD:
				sequence_Sum(context, (Add) semanticObject); 
				return; 
			case RPGPackage.ALT_ATTRIBUTE:
				sequence_AltAttribute(context, (AltAttribute) semanticObject); 
				return; 
			case RPGPackage.AND:
				if (rule == grammarAccess.getORconditionRule()
						|| action == grammarAccess.getORconditionAccess().getOrLeftAction_1_1()
						|| rule == grammarAccess.getANDconditionRule()
						|| action == grammarAccess.getANDconditionAccess().getAndLeftAction_1_1()
						|| rule == grammarAccess.getStatementRule()) {
					sequence_ANDcondition(context, (And) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getEffectRule()
						|| rule == grammarAccess.getAttributeValuesRule()
						|| rule == grammarAccess.getRuleRule()) {
					sequence_ANDcondition_Rule(context, (And) semanticObject); 
					return; 
				}
				else break;
			case RPGPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case RPGPackage.ATTRIBUTE_VALUES:
				sequence_AttributeValues(context, (AttributeValues) semanticObject); 
				return; 
			case RPGPackage.ATTRIBUTES:
				sequence_Attributes(context, (Attributes) semanticObject); 
				return; 
			case RPGPackage.BIGGER:
				sequence_Comparator(context, (Bigger) semanticObject); 
				return; 
			case RPGPackage.BIGGER_EQ:
				sequence_Comparator(context, (BiggerEq) semanticObject); 
				return; 
			case RPGPackage.DEATH:
				sequence_Death(context, (Death) semanticObject); 
				return; 
			case RPGPackage.DIV:
				sequence_Multiply(context, (Div) semanticObject); 
				return; 
			case RPGPackage.ETYPE:
				sequence_EType(context, (EType) semanticObject); 
				return; 
			case RPGPackage.ENTITIES:
				sequence_Entities(context, (Entities) semanticObject); 
				return; 
			case RPGPackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case RPGPackage.ENTITY_MOVES:
				sequence_EntityMoves(context, (EntityMoves) semanticObject); 
				return; 
			case RPGPackage.EQ:
				sequence_Comparator(context, (Eq) semanticObject); 
				return; 
			case RPGPackage.FLOAT_NUM:
				if (rule == grammarAccess.getBattleSizeRule()) {
					sequence_BattleSize_FloatNum(context, (FloatNum) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSumRule()
						|| action == grammarAccess.getSumAccess().getAddLeftAction_1_0_0_1()
						|| action == grammarAccess.getSumAccess().getSubLeftAction_1_0_1_1()
						|| rule == grammarAccess.getMultiplyRule()
						|| action == grammarAccess.getMultiplyAccess().getMultLeftAction_1_0_0_1()
						|| action == grammarAccess.getMultiplyAccess().getDivLeftAction_1_0_1_1()
						|| rule == grammarAccess.getAtomicNumberRule()
						|| rule == grammarAccess.getFloatNumRule()) {
					sequence_FloatNum(context, (FloatNum) semanticObject); 
					return; 
				}
				else break;
			case RPGPackage.INT_NUM:
				if (rule == grammarAccess.getBattleSizeRule()) {
					sequence_BattleSize_IntNum(context, (IntNum) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSumRule()
						|| action == grammarAccess.getSumAccess().getAddLeftAction_1_0_0_1()
						|| action == grammarAccess.getSumAccess().getSubLeftAction_1_0_1_1()
						|| rule == grammarAccess.getMultiplyRule()
						|| action == grammarAccess.getMultiplyAccess().getMultLeftAction_1_0_0_1()
						|| action == grammarAccess.getMultiplyAccess().getDivLeftAction_1_0_1_1()
						|| rule == grammarAccess.getAtomicNumberRule()
						|| rule == grammarAccess.getIntNumRule()) {
					sequence_IntNum(context, (IntNum) semanticObject); 
					return; 
				}
				else break;
			case RPGPackage.LOC:
				sequence_Loc(context, (Loc) semanticObject); 
				return; 
			case RPGPackage.LOCATIONS:
				sequence_Locations(context, (Locations) semanticObject); 
				return; 
			case RPGPackage.MEMBERS:
				sequence_Members(context, (Members) semanticObject); 
				return; 
			case RPGPackage.MOVE:
				sequence_Move(context, (Move) semanticObject); 
				return; 
			case RPGPackage.MOVES:
				sequence_Moves(context, (Moves) semanticObject); 
				return; 
			case RPGPackage.MULT:
				sequence_Multiply(context, (Mult) semanticObject); 
				return; 
			case RPGPackage.NEQ:
				sequence_Comparator(context, (NEq) semanticObject); 
				return; 
			case RPGPackage.NAME_ATTRIBUTE:
				if (rule == grammarAccess.getBattleSizeRule()) {
					sequence_BattleSize_NameAttribute(context, (NameAttribute) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSumRule()
						|| action == grammarAccess.getSumAccess().getAddLeftAction_1_0_0_1()
						|| action == grammarAccess.getSumAccess().getSubLeftAction_1_0_1_1()
						|| rule == grammarAccess.getMultiplyRule()
						|| action == grammarAccess.getMultiplyAccess().getMultLeftAction_1_0_0_1()
						|| action == grammarAccess.getMultiplyAccess().getDivLeftAction_1_0_1_1()
						|| rule == grammarAccess.getAtomicNumberRule()
						|| rule == grammarAccess.getNameAttributeRule()) {
					sequence_NameAttribute(context, (NameAttribute) semanticObject); 
					return; 
				}
				else break;
			case RPGPackage.NUMBER_COMPARING:
				if (rule == grammarAccess.getORconditionRule()
						|| action == grammarAccess.getORconditionAccess().getOrLeftAction_1_1()
						|| rule == grammarAccess.getANDconditionRule()
						|| action == grammarAccess.getANDconditionAccess().getAndLeftAction_1_1()
						|| rule == grammarAccess.getStatementRule()
						|| rule == grammarAccess.getNumberComparingRule()) {
					sequence_NumberComparing(context, (NumberComparing) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getEffectRule()
						|| rule == grammarAccess.getAttributeValuesRule()
						|| rule == grammarAccess.getRuleRule()) {
					sequence_NumberComparing_Rule(context, (NumberComparing) semanticObject); 
					return; 
				}
				else break;
			case RPGPackage.OR:
				if (rule == grammarAccess.getORconditionRule()
						|| action == grammarAccess.getORconditionAccess().getOrLeftAction_1_1()
						|| rule == grammarAccess.getANDconditionRule()
						|| action == grammarAccess.getANDconditionAccess().getAndLeftAction_1_1()
						|| rule == grammarAccess.getStatementRule()) {
					sequence_ORcondition(context, (Or) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getEffectRule()
						|| rule == grammarAccess.getAttributeValuesRule()
						|| rule == grammarAccess.getRuleRule()) {
					sequence_ORcondition_Rule(context, (Or) semanticObject); 
					return; 
				}
				else break;
			case RPGPackage.PROPOSITION:
				if (rule == grammarAccess.getEffectRule()
						|| rule == grammarAccess.getAttributeValuesRule()
						|| rule == grammarAccess.getRuleRule()) {
					sequence_Rule_Statement(context, (Proposition) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getORconditionRule()
						|| action == grammarAccess.getORconditionAccess().getOrLeftAction_1_1()
						|| rule == grammarAccess.getANDconditionRule()
						|| action == grammarAccess.getANDconditionAccess().getAndLeftAction_1_1()
						|| rule == grammarAccess.getStatementRule()) {
					sequence_Statement(context, (Proposition) semanticObject); 
					return; 
				}
				else break;
			case RPGPackage.RELATIONS:
				sequence_Relations(context, (Relations) semanticObject); 
				return; 
			case RPGPackage.REQUIRE:
				if (rule == grammarAccess.getAttributeValuesRule()
						|| rule == grammarAccess.getRequireRule()) {
					sequence_Require(context, (Require) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getDeclarationRule()
						|| rule == grammarAccess.getTeamsRule()) {
					sequence_Require_Teams(context, (Require) semanticObject); 
					return; 
				}
				else break;
			case RPGPackage.SELF_TARGETING:
				sequence_SelfTargeting(context, (SelfTargeting) semanticObject); 
				return; 
			case RPGPackage.SMALLER:
				sequence_Comparator(context, (Smaller) semanticObject); 
				return; 
			case RPGPackage.SMALLER_EQ:
				sequence_Comparator(context, (SmallerEq) semanticObject); 
				return; 
			case RPGPackage.SUB:
				sequence_Sum(context, (Sub) semanticObject); 
				return; 
			case RPGPackage.SYSTEM_RPG:
				sequence_SystemRPG(context, (SystemRPG) semanticObject); 
				return; 
			case RPGPackage.TEAM:
				sequence_Team(context, (Team) semanticObject); 
				return; 
			case RPGPackage.TEAMS:
				sequence_Teams(context, (Teams) semanticObject); 
				return; 
			case RPGPackage.TYPE:
				sequence_Type(context, (Type) semanticObject); 
				return; 
			case RPGPackage.TYPE_EXPRESSION:
				sequence_TypeExpression(context, (TypeExpression) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ORcondition returns And
	 *     ORcondition.Or_1_1 returns And
	 *     ANDcondition returns And
	 *     ANDcondition.And_1_1 returns And
	 *     Statement returns And
	 *
	 * Constraint:
	 *     (left=ANDcondition_And_1_1 right=Statement)
	 */
	protected void sequence_ANDcondition(ISerializationContext context, And semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RPGPackage.Literals.AND__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RPGPackage.Literals.AND__LEFT));
			if (transientValues.isValueTransient(semanticObject, RPGPackage.Literals.AND__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RPGPackage.Literals.AND__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getANDconditionAccess().getAndLeftAction_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getANDconditionAccess().getRightStatementParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Effect returns And
	 *     AttributeValues returns And
	 *     Rule returns And
	 *
	 * Constraint:
	 *     (left=ANDcondition_And_1_1 right=Statement (attritbuteToSet+=[Attribute|ID] change+=Sum+)*)
	 */
	protected void sequence_ANDcondition_Rule(ISerializationContext context, And semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AltAttribute returns AltAttribute
	 *
	 * Constraint:
	 *     (attribute=[Attribute|ID] av=AttributeValues?)
	 */
	protected void sequence_AltAttribute(ISerializationContext context, AltAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AttributeValues returns AttributeValues
	 *
	 * Constraint:
	 *     (lTypes=LegalType | an=AtomicNumber)
	 */
	protected void sequence_AttributeValues(ISerializationContext context, AttributeValues semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (name=ID aVal=AttributeValues)
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RPGPackage.Literals.ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RPGPackage.Literals.ATTRIBUTE__NAME));
			if (transientValues.isValueTransient(semanticObject, RPGPackage.Literals.ATTRIBUTE__AVAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RPGPackage.Literals.ATTRIBUTE__AVAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAttributeAccess().getAValAttributeValuesParserRuleCall_2_0(), semanticObject.getAVal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns Attributes
	 *     Attributes returns Attributes
	 *
	 * Constraint:
	 *     attribute+=Attribute+
	 */
	protected void sequence_Attributes(ISerializationContext context, Attributes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BattleSize returns FloatNum
	 *
	 * Constraint:
	 *     (i=INT decimal=INT req=Require?)
	 */
	protected void sequence_BattleSize_FloatNum(ISerializationContext context, FloatNum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BattleSize returns IntNum
	 *
	 * Constraint:
	 *     (value=INT req=Require?)
	 */
	protected void sequence_BattleSize_IntNum(ISerializationContext context, IntNum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BattleSize returns NameAttribute
	 *
	 * Constraint:
	 *     (attribute=[Attribute|ID] req=Require?)
	 */
	protected void sequence_BattleSize_NameAttribute(ISerializationContext context, NameAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Comparator returns Bigger
	 *
	 * Constraint:
	 *     {Bigger}
	 */
	protected void sequence_Comparator(ISerializationContext context, Bigger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Comparator returns BiggerEq
	 *
	 * Constraint:
	 *     {BiggerEq}
	 */
	protected void sequence_Comparator(ISerializationContext context, BiggerEq semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Comparator returns Eq
	 *
	 * Constraint:
	 *     {Eq}
	 */
	protected void sequence_Comparator(ISerializationContext context, Eq semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Comparator returns NEq
	 *
	 * Constraint:
	 *     {NEq}
	 */
	protected void sequence_Comparator(ISerializationContext context, NEq semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Comparator returns Smaller
	 *
	 * Constraint:
	 *     {Smaller}
	 */
	protected void sequence_Comparator(ISerializationContext context, Smaller semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Comparator returns SmallerEq
	 *
	 * Constraint:
	 *     {SmallerEq}
	 */
	protected void sequence_Comparator(ISerializationContext context, SmallerEq semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns Death
	 *     Death returns Death
	 *
	 * Constraint:
	 *     req=Require
	 */
	protected void sequence_Death(ISerializationContext context, Death semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RPGPackage.Literals.DEATH__REQ) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RPGPackage.Literals.DEATH__REQ));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDeathAccess().getReqRequireParserRuleCall_1_0(), semanticObject.getReq());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EType returns EType
	 *
	 * Constraint:
	 *     type=[Type|ID]
	 */
	protected void sequence_EType(ISerializationContext context, EType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RPGPackage.Literals.ETYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RPGPackage.Literals.ETYPE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getETypeAccess().getTypeTypeIDTerminalRuleCall_1_0_1(), semanticObject.eGet(RPGPackage.Literals.ETYPE__TYPE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns Entities
	 *     Entities returns Entities
	 *
	 * Constraint:
	 *     entity+=Entity+
	 */
	protected void sequence_Entities(ISerializationContext context, Entities semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EntityMoves returns EntityMoves
	 *
	 * Constraint:
	 *     move+=[Move|ID]+
	 */
	protected void sequence_EntityMoves(ISerializationContext context, EntityMoves semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Entity returns Entity
	 *
	 * Constraint:
	 *     (name=ID eType=EType att+=AltAttribute* eMoves+=EntityMoves*)
	 */
	protected void sequence_Entity(ISerializationContext context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Sum returns FloatNum
	 *     Sum.Add_1_0_0_1 returns FloatNum
	 *     Sum.Sub_1_0_1_1 returns FloatNum
	 *     Multiply returns FloatNum
	 *     Multiply.Mult_1_0_0_1 returns FloatNum
	 *     Multiply.Div_1_0_1_1 returns FloatNum
	 *     AtomicNumber returns FloatNum
	 *     FloatNum returns FloatNum
	 *
	 * Constraint:
	 *     (i=INT decimal=INT)
	 */
	protected void sequence_FloatNum(ISerializationContext context, FloatNum semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RPGPackage.Literals.FLOAT_NUM__I) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RPGPackage.Literals.FLOAT_NUM__I));
			if (transientValues.isValueTransient(semanticObject, RPGPackage.Literals.FLOAT_NUM__DECIMAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RPGPackage.Literals.FLOAT_NUM__DECIMAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFloatNumAccess().getIINTTerminalRuleCall_0_0(), semanticObject.getI());
		feeder.accept(grammarAccess.getFloatNumAccess().getDecimalINTTerminalRuleCall_2_0(), semanticObject.getDecimal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Sum returns IntNum
	 *     Sum.Add_1_0_0_1 returns IntNum
	 *     Sum.Sub_1_0_1_1 returns IntNum
	 *     Multiply returns IntNum
	 *     Multiply.Mult_1_0_0_1 returns IntNum
	 *     Multiply.Div_1_0_1_1 returns IntNum
	 *     AtomicNumber returns IntNum
	 *     IntNum returns IntNum
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_IntNum(ISerializationContext context, IntNum semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RPGPackage.Literals.INT_NUM__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RPGPackage.Literals.INT_NUM__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIntNumAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Loc returns Loc
	 *
	 * Constraint:
	 *     (name=ID team=[Team|ID])
	 */
	protected void sequence_Loc(ISerializationContext context, Loc semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RPGPackage.Literals.LOC__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RPGPackage.Literals.LOC__NAME));
			if (transientValues.isValueTransient(semanticObject, RPGPackage.Literals.LOC__TEAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RPGPackage.Literals.LOC__TEAM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLocAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getLocAccess().getTeamTeamIDTerminalRuleCall_2_0_1(), semanticObject.eGet(RPGPackage.Literals.LOC__TEAM, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns Locations
	 *     Locations returns Locations
	 *
	 * Constraint:
	 *     loc+=Loc+
	 */
	protected void sequence_Locations(ISerializationContext context, Locations semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Members returns Members
	 *
	 * Constraint:
	 *     entity+=[Entity|ID]+
	 */
	protected void sequence_Members(ISerializationContext context, Members semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Move returns Move
	 *
	 * Constraint:
	 *     (name=ID eType=EType? att+=AltAttribute* effect+=Effect*)
	 */
	protected void sequence_Move(ISerializationContext context, Move semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns Moves
	 *     Moves returns Moves
	 *
	 * Constraint:
	 *     move+=Move+
	 */
	protected void sequence_Moves(ISerializationContext context, Moves semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Sum returns Div
	 *     Sum.Add_1_0_0_1 returns Div
	 *     Sum.Sub_1_0_1_1 returns Div
	 *     Multiply returns Div
	 *     Multiply.Mult_1_0_0_1 returns Div
	 *     Multiply.Div_1_0_1_1 returns Div
	 *
	 * Constraint:
	 *     (left=Multiply_Div_1_0_1_1 right=AtomicNumber)
	 */
	protected void sequence_Multiply(ISerializationContext context, Div semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RPGPackage.Literals.DIV__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RPGPackage.Literals.DIV__LEFT));
			if (transientValues.isValueTransient(semanticObject, RPGPackage.Literals.DIV__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RPGPackage.Literals.DIV__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMultiplyAccess().getDivLeftAction_1_0_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultiplyAccess().getRightAtomicNumberParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Sum returns Mult
	 *     Sum.Add_1_0_0_1 returns Mult
	 *     Sum.Sub_1_0_1_1 returns Mult
	 *     Multiply returns Mult
	 *     Multiply.Mult_1_0_0_1 returns Mult
	 *     Multiply.Div_1_0_1_1 returns Mult
	 *
	 * Constraint:
	 *     (left=Multiply_Mult_1_0_0_1 right=AtomicNumber)
	 */
	protected void sequence_Multiply(ISerializationContext context, Mult semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RPGPackage.Literals.MULT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RPGPackage.Literals.MULT__LEFT));
			if (transientValues.isValueTransient(semanticObject, RPGPackage.Literals.MULT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RPGPackage.Literals.MULT__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMultiplyAccess().getMultLeftAction_1_0_0_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultiplyAccess().getRightAtomicNumberParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Sum returns NameAttribute
	 *     Sum.Add_1_0_0_1 returns NameAttribute
	 *     Sum.Sub_1_0_1_1 returns NameAttribute
	 *     Multiply returns NameAttribute
	 *     Multiply.Mult_1_0_0_1 returns NameAttribute
	 *     Multiply.Div_1_0_1_1 returns NameAttribute
	 *     AtomicNumber returns NameAttribute
	 *     NameAttribute returns NameAttribute
	 *
	 * Constraint:
	 *     attribute=[Attribute|ID]
	 */
	protected void sequence_NameAttribute(ISerializationContext context, NameAttribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RPGPackage.Literals.NAME_ATTRIBUTE__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RPGPackage.Literals.NAME_ATTRIBUTE__ATTRIBUTE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNameAttributeAccess().getAttributeAttributeIDTerminalRuleCall_0_1(), semanticObject.eGet(RPGPackage.Literals.NAME_ATTRIBUTE__ATTRIBUTE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ORcondition returns NumberComparing
	 *     ORcondition.Or_1_1 returns NumberComparing
	 *     ANDcondition returns NumberComparing
	 *     ANDcondition.And_1_1 returns NumberComparing
	 *     Statement returns NumberComparing
	 *     NumberComparing returns NumberComparing
	 *
	 * Constraint:
	 *     (left=Sum comp=Comparator right=Sum)
	 */
	protected void sequence_NumberComparing(ISerializationContext context, NumberComparing semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RPGPackage.Literals.NUMBER_COMPARING__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RPGPackage.Literals.NUMBER_COMPARING__LEFT));
			if (transientValues.isValueTransient(semanticObject, RPGPackage.Literals.NUMBER_COMPARING__COMP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RPGPackage.Literals.NUMBER_COMPARING__COMP));
			if (transientValues.isValueTransient(semanticObject, RPGPackage.Literals.NUMBER_COMPARING__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RPGPackage.Literals.NUMBER_COMPARING__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumberComparingAccess().getLeftSumParserRuleCall_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getNumberComparingAccess().getCompComparatorParserRuleCall_1_0(), semanticObject.getComp());
		feeder.accept(grammarAccess.getNumberComparingAccess().getRightSumParserRuleCall_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Effect returns NumberComparing
	 *     AttributeValues returns NumberComparing
	 *     Rule returns NumberComparing
	 *
	 * Constraint:
	 *     (left=Sum comp=Comparator right=Sum (attritbuteToSet+=[Attribute|ID] change+=Sum+)*)
	 */
	protected void sequence_NumberComparing_Rule(ISerializationContext context, NumberComparing semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ORcondition returns Or
	 *     ORcondition.Or_1_1 returns Or
	 *     ANDcondition returns Or
	 *     ANDcondition.And_1_1 returns Or
	 *     Statement returns Or
	 *
	 * Constraint:
	 *     (left=ORcondition_Or_1_1 right=ANDcondition)
	 */
	protected void sequence_ORcondition(ISerializationContext context, Or semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RPGPackage.Literals.OR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RPGPackage.Literals.OR__LEFT));
			if (transientValues.isValueTransient(semanticObject, RPGPackage.Literals.OR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RPGPackage.Literals.OR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getORconditionAccess().getOrLeftAction_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getORconditionAccess().getRightANDconditionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Effect returns Or
	 *     AttributeValues returns Or
	 *     Rule returns Or
	 *
	 * Constraint:
	 *     (left=ORcondition_Or_1_1 right=ANDcondition (attritbuteToSet+=[Attribute|ID] change+=Sum+)*)
	 */
	protected void sequence_ORcondition_Rule(ISerializationContext context, Or semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns Relations
	 *     Relations returns Relations
	 *
	 * Constraint:
	 *     type+=Type+
	 */
	protected void sequence_Relations(ISerializationContext context, Relations semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AttributeValues returns Require
	 *     Require returns Require
	 *
	 * Constraint:
	 *     log=ORcondition
	 */
	protected void sequence_Require(ISerializationContext context, Require semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RPGPackage.Literals.REQUIRE__LOG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RPGPackage.Literals.REQUIRE__LOG));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRequireAccess().getLogORconditionParserRuleCall_1_0(), semanticObject.getLog());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns Require
	 *     Teams returns Require
	 *
	 * Constraint:
	 *     (log=ORcondition bs=BattleSize team+=Team+)
	 */
	protected void sequence_Require_Teams(ISerializationContext context, Require semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Effect returns Proposition
	 *     AttributeValues returns Proposition
	 *     Rule returns Proposition
	 *
	 * Constraint:
	 *     (type=[Type|ID] (attritbuteToSet+=[Attribute|ID] change+=Sum+)*)
	 */
	protected void sequence_Rule_Statement(ISerializationContext context, Proposition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SelfTargeting returns SelfTargeting
	 *
	 * Constraint:
	 *     self='self.'
	 */
	protected void sequence_SelfTargeting(ISerializationContext context, SelfTargeting semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RPGPackage.Literals.SELF_TARGETING__SELF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RPGPackage.Literals.SELF_TARGETING__SELF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSelfTargetingAccess().getSelfSelfKeyword_0(), semanticObject.getSelf());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ORcondition returns Proposition
	 *     ORcondition.Or_1_1 returns Proposition
	 *     ANDcondition returns Proposition
	 *     ANDcondition.And_1_1 returns Proposition
	 *     Statement returns Proposition
	 *
	 * Constraint:
	 *     type=[Type|ID]
	 */
	protected void sequence_Statement(ISerializationContext context, Proposition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RPGPackage.Literals.PROPOSITION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RPGPackage.Literals.PROPOSITION__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStatementAccess().getTypeTypeIDTerminalRuleCall_2_0_1(), semanticObject.eGet(RPGPackage.Literals.PROPOSITION__TYPE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Sum returns Add
	 *     Sum.Add_1_0_0_1 returns Add
	 *     Sum.Sub_1_0_1_1 returns Add
	 *
	 * Constraint:
	 *     (left=Sum_Add_1_0_0_1 right=Multiply)
	 */
	protected void sequence_Sum(ISerializationContext context, Add semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RPGPackage.Literals.ADD__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RPGPackage.Literals.ADD__LEFT));
			if (transientValues.isValueTransient(semanticObject, RPGPackage.Literals.ADD__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RPGPackage.Literals.ADD__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSumAccess().getAddLeftAction_1_0_0_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSumAccess().getRightMultiplyParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Sum returns Sub
	 *     Sum.Add_1_0_0_1 returns Sub
	 *     Sum.Sub_1_0_1_1 returns Sub
	 *
	 * Constraint:
	 *     (left=Sum_Sub_1_0_1_1 right=Multiply)
	 */
	protected void sequence_Sum(ISerializationContext context, Sub semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RPGPackage.Literals.SUB__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RPGPackage.Literals.SUB__LEFT));
			if (transientValues.isValueTransient(semanticObject, RPGPackage.Literals.SUB__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RPGPackage.Literals.SUB__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSumAccess().getSubLeftAction_1_0_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSumAccess().getRightMultiplyParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SystemRPG returns SystemRPG
	 *
	 * Constraint:
	 *     (name=ID declarations+=Declaration*)
	 */
	protected void sequence_SystemRPG(ISerializationContext context, SystemRPG semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Team returns Team
	 *
	 * Constraint:
	 *     (name=ID members+=Members+)
	 */
	protected void sequence_Team(ISerializationContext context, Team semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns Teams
	 *     Teams returns Teams
	 *
	 * Constraint:
	 *     (bs=BattleSize team+=Team+)
	 */
	protected void sequence_Teams(ISerializationContext context, Teams semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypeExpression returns TypeExpression
	 *
	 * Constraint:
	 *     (strong=[Type|ID] strong2+=[Type|ID]* currentT=[Type|ID] weak=[Type|ID] weak2+=[Type|ID]*)
	 */
	protected void sequence_TypeExpression(ISerializationContext context, TypeExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Type
	 *
	 * Constraint:
	 *     (name=ID tExpression=TypeExpression?)
	 */
	protected void sequence_Type(ISerializationContext context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
