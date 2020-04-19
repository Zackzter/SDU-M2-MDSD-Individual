/**
 * generated by Xtext 2.21.0
 */
package mdsd.rPG.impl;

import mdsd.rPG.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RPGFactoryImpl extends EFactoryImpl implements RPGFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RPGFactory init()
  {
    try
    {
      RPGFactory theRPGFactory = (RPGFactory)EPackage.Registry.INSTANCE.getEFactory(RPGPackage.eNS_URI);
      if (theRPGFactory != null)
      {
        return theRPGFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RPGFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RPGFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RPGPackage.SYSTEM_RPG: return createSystemRPG();
      case RPGPackage.DECLARATION: return createDeclaration();
      case RPGPackage.ENTITY_ATTRIBUTES: return createEntityAttributes();
      case RPGPackage.MOVE_ATTRIBUTES: return createMoveAttributes();
      case RPGPackage.ATTRIBUTES: return createAttributes();
      case RPGPackage.ATTRIBUTE: return createAttribute();
      case RPGPackage.LOCATIONS: return createLocations();
      case RPGPackage.LOC: return createLoc();
      case RPGPackage.RELATIONS: return createRelations();
      case RPGPackage.TYPE: return createType();
      case RPGPackage.TYPE_EXPRESSION: return createTypeExpression();
      case RPGPackage.MOVES: return createMoves();
      case RPGPackage.MOVE: return createMove();
      case RPGPackage.ETYPE: return createEType();
      case RPGPackage.EFFECT: return createEffect();
      case RPGPackage.ATTRIBUTE_VALUES: return createAttributeValues();
      case RPGPackage.ALT_ATTRIBUTE: return createAltAttribute();
      case RPGPackage.RULE: return createRule();
      case RPGPackage.CARL: return createCarl();
      case RPGPackage.SET: return createSet();
      case RPGPackage.ENTITIES: return createEntities();
      case RPGPackage.DEATH: return createDeath();
      case RPGPackage.ENTITY: return createEntity();
      case RPGPackage.ENTITY_MOVES: return createEntityMoves();
      case RPGPackage.TEAMS: return createTeams();
      case RPGPackage.TEAM: return createTeam();
      case RPGPackage.MEMBERS: return createMembers();
      case RPGPackage.BATTLE_SIZE: return createBattleSize();
      case RPGPackage.REQUIRE: return createRequire();
      case RPGPackage.PROPOSITION: return createProposition();
      case RPGPackage.NUMBER_COMPARING: return createNumberComparing();
      case RPGPackage.COMPARATOR: return createComparator();
      case RPGPackage.SUM: return createSum();
      case RPGPackage.MULTIPLY: return createMultiply();
      case RPGPackage.ATOMIC_NUMBER: return createAtomicNumber();
      case RPGPackage.NAME_ATTRIBUTE: return createNameAttribute();
      case RPGPackage.SELF_TARGETING: return createSelfTargeting();
      case RPGPackage.INT_NUM: return createIntNum();
      case RPGPackage.FLOAT_NUM: return createFloatNum();
      case RPGPackage.EQUAL: return createEqual();
      case RPGPackage.OR: return createOr();
      case RPGPackage.AND: return createAnd();
      case RPGPackage.SMALLER: return createSmaller();
      case RPGPackage.SMALLER_EQ: return createSmallerEq();
      case RPGPackage.EQ: return createEq();
      case RPGPackage.BIGGER_EQ: return createBiggerEq();
      case RPGPackage.BIGGER: return createBigger();
      case RPGPackage.NEQ: return createNEq();
      case RPGPackage.ADD: return createAdd();
      case RPGPackage.SUB: return createSub();
      case RPGPackage.MULT: return createMult();
      case RPGPackage.DIV: return createDiv();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SystemRPG createSystemRPG()
  {
    SystemRPGImpl systemRPG = new SystemRPGImpl();
    return systemRPG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EntityAttributes createEntityAttributes()
  {
    EntityAttributesImpl entityAttributes = new EntityAttributesImpl();
    return entityAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MoveAttributes createMoveAttributes()
  {
    MoveAttributesImpl moveAttributes = new MoveAttributesImpl();
    return moveAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Attributes createAttributes()
  {
    AttributesImpl attributes = new AttributesImpl();
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Locations createLocations()
  {
    LocationsImpl locations = new LocationsImpl();
    return locations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Loc createLoc()
  {
    LocImpl loc = new LocImpl();
    return loc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Relations createRelations()
  {
    RelationsImpl relations = new RelationsImpl();
    return relations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypeExpression createTypeExpression()
  {
    TypeExpressionImpl typeExpression = new TypeExpressionImpl();
    return typeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Moves createMoves()
  {
    MovesImpl moves = new MovesImpl();
    return moves;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Move createMove()
  {
    MoveImpl move = new MoveImpl();
    return move;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EType createEType()
  {
    ETypeImpl eType = new ETypeImpl();
    return eType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Effect createEffect()
  {
    EffectImpl effect = new EffectImpl();
    return effect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AttributeValues createAttributeValues()
  {
    AttributeValuesImpl attributeValues = new AttributeValuesImpl();
    return attributeValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AltAttribute createAltAttribute()
  {
    AltAttributeImpl altAttribute = new AltAttributeImpl();
    return altAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Rule createRule()
  {
    RuleImpl rule = new RuleImpl();
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Carl createCarl()
  {
    CarlImpl carl = new CarlImpl();
    return carl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Set createSet()
  {
    SetImpl set = new SetImpl();
    return set;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Entities createEntities()
  {
    EntitiesImpl entities = new EntitiesImpl();
    return entities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Death createDeath()
  {
    DeathImpl death = new DeathImpl();
    return death;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EntityMoves createEntityMoves()
  {
    EntityMovesImpl entityMoves = new EntityMovesImpl();
    return entityMoves;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Teams createTeams()
  {
    TeamsImpl teams = new TeamsImpl();
    return teams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Team createTeam()
  {
    TeamImpl team = new TeamImpl();
    return team;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Members createMembers()
  {
    MembersImpl members = new MembersImpl();
    return members;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BattleSize createBattleSize()
  {
    BattleSizeImpl battleSize = new BattleSizeImpl();
    return battleSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Require createRequire()
  {
    RequireImpl require = new RequireImpl();
    return require;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Proposition createProposition()
  {
    PropositionImpl proposition = new PropositionImpl();
    return proposition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NumberComparing createNumberComparing()
  {
    NumberComparingImpl numberComparing = new NumberComparingImpl();
    return numberComparing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Comparator createComparator()
  {
    ComparatorImpl comparator = new ComparatorImpl();
    return comparator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Sum createSum()
  {
    SumImpl sum = new SumImpl();
    return sum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Multiply createMultiply()
  {
    MultiplyImpl multiply = new MultiplyImpl();
    return multiply;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AtomicNumber createAtomicNumber()
  {
    AtomicNumberImpl atomicNumber = new AtomicNumberImpl();
    return atomicNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NameAttribute createNameAttribute()
  {
    NameAttributeImpl nameAttribute = new NameAttributeImpl();
    return nameAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SelfTargeting createSelfTargeting()
  {
    SelfTargetingImpl selfTargeting = new SelfTargetingImpl();
    return selfTargeting;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntNum createIntNum()
  {
    IntNumImpl intNum = new IntNumImpl();
    return intNum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FloatNum createFloatNum()
  {
    FloatNumImpl floatNum = new FloatNumImpl();
    return floatNum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Equal createEqual()
  {
    EqualImpl equal = new EqualImpl();
    return equal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Or createOr()
  {
    OrImpl or = new OrImpl();
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public And createAnd()
  {
    AndImpl and = new AndImpl();
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Smaller createSmaller()
  {
    SmallerImpl smaller = new SmallerImpl();
    return smaller;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SmallerEq createSmallerEq()
  {
    SmallerEqImpl smallerEq = new SmallerEqImpl();
    return smallerEq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Eq createEq()
  {
    EqImpl eq = new EqImpl();
    return eq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BiggerEq createBiggerEq()
  {
    BiggerEqImpl biggerEq = new BiggerEqImpl();
    return biggerEq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Bigger createBigger()
  {
    BiggerImpl bigger = new BiggerImpl();
    return bigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NEq createNEq()
  {
    NEqImpl nEq = new NEqImpl();
    return nEq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Add createAdd()
  {
    AddImpl add = new AddImpl();
    return add;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Sub createSub()
  {
    SubImpl sub = new SubImpl();
    return sub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Mult createMult()
  {
    MultImpl mult = new MultImpl();
    return mult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Div createDiv()
  {
    DivImpl div = new DivImpl();
    return div;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RPGPackage getRPGPackage()
  {
    return (RPGPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RPGPackage getPackage()
  {
    return RPGPackage.eINSTANCE;
  }

} //RPGFactoryImpl
