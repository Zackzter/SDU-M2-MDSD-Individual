/**
 * generated by Xtext 2.21.0
 */
package mdsd.rPG.util;

import mdsd.rPG.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mdsd.rPG.RPGPackage
 * @generated
 */
public class RPGAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RPGPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RPGAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = RPGPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RPGSwitch<Adapter> modelSwitch =
    new RPGSwitch<Adapter>()
    {
      @Override
      public Adapter caseSystemRPG(SystemRPG object)
      {
        return createSystemRPGAdapter();
      }
      @Override
      public Adapter caseDeclaration(Declaration object)
      {
        return createDeclarationAdapter();
      }
      @Override
      public Adapter caseSpeed(Speed object)
      {
        return createSpeedAdapter();
      }
      @Override
      public Adapter caseEffects(Effects object)
      {
        return createEffectsAdapter();
      }
      @Override
      public Adapter caseEffect(Effect object)
      {
        return createEffectAdapter();
      }
      @Override
      public Adapter caseBuff(Buff object)
      {
        return createBuffAdapter();
      }
      @Override
      public Adapter caseMoveE(MoveE object)
      {
        return createMoveEAdapter();
      }
      @Override
      public Adapter caseRule(Rule object)
      {
        return createRuleAdapter();
      }
      @Override
      public Adapter caseAttributeBuff(AttributeBuff object)
      {
        return createAttributeBuffAdapter();
      }
      @Override
      public Adapter caseAttributeReference(AttributeReference object)
      {
        return createAttributeReferenceAdapter();
      }
      @Override
      public Adapter caseSelf(Self object)
      {
        return createSelfAdapter();
      }
      @Override
      public Adapter caseTarget(Target object)
      {
        return createTargetAdapter();
      }
      @Override
      public Adapter caseLocalTarget(LocalTarget object)
      {
        return createLocalTargetAdapter();
      }
      @Override
      public Adapter caseAttributes(Attributes object)
      {
        return createAttributesAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseLocations(Locations object)
      {
        return createLocationsAdapter();
      }
      @Override
      public Adapter caseLoc(Loc object)
      {
        return createLocAdapter();
      }
      @Override
      public Adapter caseTerrain(Terrain object)
      {
        return createTerrainAdapter();
      }
      @Override
      public Adapter caseRelations(Relations object)
      {
        return createRelationsAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseTypeExpression(TypeExpression object)
      {
        return createTypeExpressionAdapter();
      }
      @Override
      public Adapter caseMoves(Moves object)
      {
        return createMovesAdapter();
      }
      @Override
      public Adapter caseMove(Move object)
      {
        return createMoveAdapter();
      }
      @Override
      public Adapter caseMEffect(MEffect object)
      {
        return createMEffectAdapter();
      }
      @Override
      public Adapter caseBEffect(BEffect object)
      {
        return createBEffectAdapter();
      }
      @Override
      public Adapter caseEType(EType object)
      {
        return createETypeAdapter();
      }
      @Override
      public Adapter caseAttributeValues(AttributeValues object)
      {
        return createAttributeValuesAdapter();
      }
      @Override
      public Adapter caseAltAttribute(AltAttribute object)
      {
        return createAltAttributeAdapter();
      }
      @Override
      public Adapter caseEntities(Entities object)
      {
        return createEntitiesAdapter();
      }
      @Override
      public Adapter caseDeath(Death object)
      {
        return createDeathAdapter();
      }
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter caseEntityAttribute(EntityAttribute object)
      {
        return createEntityAttributeAdapter();
      }
      @Override
      public Adapter caseLocalAttribute(LocalAttribute object)
      {
        return createLocalAttributeAdapter();
      }
      @Override
      public Adapter caseEntityMoves(EntityMoves object)
      {
        return createEntityMovesAdapter();
      }
      @Override
      public Adapter caseTeams(Teams object)
      {
        return createTeamsAdapter();
      }
      @Override
      public Adapter caseTeamSize(TeamSize object)
      {
        return createTeamSizeAdapter();
      }
      @Override
      public Adapter caseTeam(Team object)
      {
        return createTeamAdapter();
      }
      @Override
      public Adapter caseMembers(Members object)
      {
        return createMembersAdapter();
      }
      @Override
      public Adapter caseRequire(Require object)
      {
        return createRequireAdapter();
      }
      @Override
      public Adapter caseProposition(Proposition object)
      {
        return createPropositionAdapter();
      }
      @Override
      public Adapter caseNumberComparing(NumberComparing object)
      {
        return createNumberComparingAdapter();
      }
      @Override
      public Adapter caseComparator(Comparator object)
      {
        return createComparatorAdapter();
      }
      @Override
      public Adapter caseSum(Sum object)
      {
        return createSumAdapter();
      }
      @Override
      public Adapter caseMultiply(Multiply object)
      {
        return createMultiplyAdapter();
      }
      @Override
      public Adapter caseAtomicNumber(AtomicNumber object)
      {
        return createAtomicNumberAdapter();
      }
      @Override
      public Adapter caseActualNumbers(ActualNumbers object)
      {
        return createActualNumbersAdapter();
      }
      @Override
      public Adapter caseNameAttribute(NameAttribute object)
      {
        return createNameAttributeAdapter();
      }
      @Override
      public Adapter caseIntNum(IntNum object)
      {
        return createIntNumAdapter();
      }
      @Override
      public Adapter caseFloatNum(FloatNum object)
      {
        return createFloatNumAdapter();
      }
      @Override
      public Adapter caseOr(Or object)
      {
        return createOrAdapter();
      }
      @Override
      public Adapter caseAnd(And object)
      {
        return createAndAdapter();
      }
      @Override
      public Adapter caseSmaller(Smaller object)
      {
        return createSmallerAdapter();
      }
      @Override
      public Adapter caseSmallerEq(SmallerEq object)
      {
        return createSmallerEqAdapter();
      }
      @Override
      public Adapter caseEq(Eq object)
      {
        return createEqAdapter();
      }
      @Override
      public Adapter caseBiggerEq(BiggerEq object)
      {
        return createBiggerEqAdapter();
      }
      @Override
      public Adapter caseBigger(Bigger object)
      {
        return createBiggerAdapter();
      }
      @Override
      public Adapter caseNEq(NEq object)
      {
        return createNEqAdapter();
      }
      @Override
      public Adapter caseAdd(Add object)
      {
        return createAddAdapter();
      }
      @Override
      public Adapter caseSub(Sub object)
      {
        return createSubAdapter();
      }
      @Override
      public Adapter caseMult(Mult object)
      {
        return createMultAdapter();
      }
      @Override
      public Adapter caseDiv(Div object)
      {
        return createDivAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.SystemRPG <em>System RPG</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.SystemRPG
   * @generated
   */
  public Adapter createSystemRPGAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.Declaration
   * @generated
   */
  public Adapter createDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.Speed <em>Speed</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.Speed
   * @generated
   */
  public Adapter createSpeedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.Effects <em>Effects</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.Effects
   * @generated
   */
  public Adapter createEffectsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.Effect <em>Effect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.Effect
   * @generated
   */
  public Adapter createEffectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.Buff <em>Buff</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.Buff
   * @generated
   */
  public Adapter createBuffAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.MoveE <em>Move E</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.MoveE
   * @generated
   */
  public Adapter createMoveEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.Rule
   * @generated
   */
  public Adapter createRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.AttributeBuff <em>Attribute Buff</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.AttributeBuff
   * @generated
   */
  public Adapter createAttributeBuffAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.AttributeReference <em>Attribute Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.AttributeReference
   * @generated
   */
  public Adapter createAttributeReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.Self <em>Self</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.Self
   * @generated
   */
  public Adapter createSelfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.Target <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.Target
   * @generated
   */
  public Adapter createTargetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.LocalTarget <em>Local Target</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.LocalTarget
   * @generated
   */
  public Adapter createLocalTargetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.Attributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.Attributes
   * @generated
   */
  public Adapter createAttributesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.Locations <em>Locations</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.Locations
   * @generated
   */
  public Adapter createLocationsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.Loc <em>Loc</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.Loc
   * @generated
   */
  public Adapter createLocAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.Terrain <em>Terrain</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.Terrain
   * @generated
   */
  public Adapter createTerrainAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.Relations <em>Relations</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.Relations
   * @generated
   */
  public Adapter createRelationsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.TypeExpression <em>Type Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.TypeExpression
   * @generated
   */
  public Adapter createTypeExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.Moves <em>Moves</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.Moves
   * @generated
   */
  public Adapter createMovesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.Move <em>Move</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.Move
   * @generated
   */
  public Adapter createMoveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.MEffect <em>MEffect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.MEffect
   * @generated
   */
  public Adapter createMEffectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.BEffect <em>BEffect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.BEffect
   * @generated
   */
  public Adapter createBEffectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.EType <em>EType</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.EType
   * @generated
   */
  public Adapter createETypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.AttributeValues <em>Attribute Values</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.AttributeValues
   * @generated
   */
  public Adapter createAttributeValuesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.AltAttribute <em>Alt Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.AltAttribute
   * @generated
   */
  public Adapter createAltAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.Entities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.Entities
   * @generated
   */
  public Adapter createEntitiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.Death <em>Death</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.Death
   * @generated
   */
  public Adapter createDeathAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.EntityAttribute <em>Entity Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.EntityAttribute
   * @generated
   */
  public Adapter createEntityAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.LocalAttribute <em>Local Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.LocalAttribute
   * @generated
   */
  public Adapter createLocalAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.EntityMoves <em>Entity Moves</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.EntityMoves
   * @generated
   */
  public Adapter createEntityMovesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.Teams <em>Teams</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.Teams
   * @generated
   */
  public Adapter createTeamsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.TeamSize <em>Team Size</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.TeamSize
   * @generated
   */
  public Adapter createTeamSizeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.Team <em>Team</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.Team
   * @generated
   */
  public Adapter createTeamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.Members <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.Members
   * @generated
   */
  public Adapter createMembersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.Require <em>Require</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.Require
   * @generated
   */
  public Adapter createRequireAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.Proposition <em>Proposition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.Proposition
   * @generated
   */
  public Adapter createPropositionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.NumberComparing <em>Number Comparing</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.NumberComparing
   * @generated
   */
  public Adapter createNumberComparingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.Comparator <em>Comparator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.Comparator
   * @generated
   */
  public Adapter createComparatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.Sum <em>Sum</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.Sum
   * @generated
   */
  public Adapter createSumAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.Multiply <em>Multiply</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.Multiply
   * @generated
   */
  public Adapter createMultiplyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.AtomicNumber <em>Atomic Number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.AtomicNumber
   * @generated
   */
  public Adapter createAtomicNumberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.ActualNumbers <em>Actual Numbers</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.ActualNumbers
   * @generated
   */
  public Adapter createActualNumbersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.NameAttribute <em>Name Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.NameAttribute
   * @generated
   */
  public Adapter createNameAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.IntNum <em>Int Num</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.IntNum
   * @generated
   */
  public Adapter createIntNumAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.FloatNum <em>Float Num</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.FloatNum
   * @generated
   */
  public Adapter createFloatNumAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.Or <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.Or
   * @generated
   */
  public Adapter createOrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.And
   * @generated
   */
  public Adapter createAndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.Smaller <em>Smaller</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.Smaller
   * @generated
   */
  public Adapter createSmallerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.SmallerEq <em>Smaller Eq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.SmallerEq
   * @generated
   */
  public Adapter createSmallerEqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.Eq <em>Eq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.Eq
   * @generated
   */
  public Adapter createEqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.BiggerEq <em>Bigger Eq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.BiggerEq
   * @generated
   */
  public Adapter createBiggerEqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.Bigger <em>Bigger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.Bigger
   * @generated
   */
  public Adapter createBiggerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.NEq <em>NEq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.NEq
   * @generated
   */
  public Adapter createNEqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.Add <em>Add</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.Add
   * @generated
   */
  public Adapter createAddAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.Sub <em>Sub</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.Sub
   * @generated
   */
  public Adapter createSubAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.Mult <em>Mult</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.Mult
   * @generated
   */
  public Adapter createMultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link mdsd.rPG.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see mdsd.rPG.Div
   * @generated
   */
  public Adapter createDivAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //RPGAdapterFactory
