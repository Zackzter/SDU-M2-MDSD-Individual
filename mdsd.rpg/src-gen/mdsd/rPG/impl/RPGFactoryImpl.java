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
      case RPGPackage.SPEED: return createSpeed();
      case RPGPackage.EFFECTS: return createEffects();
      case RPGPackage.EFFECT: return createEffect();
      case RPGPackage.BUFF: return createBuff();
      case RPGPackage.MOVE_E: return createMoveE();
      case RPGPackage.RULE: return createRule();
      case RPGPackage.ATTRIBUTE_BUFF: return createAttributeBuff();
      case RPGPackage.ATTRIBUTE_REFERENCE: return createAttributeReference();
      case RPGPackage.SELF: return createSelf();
      case RPGPackage.TARGET: return createTarget();
      case RPGPackage.LOCAL_TARGET: return createLocalTarget();
      case RPGPackage.ATTRIBUTES: return createAttributes();
      case RPGPackage.ATTRIBUTE: return createAttribute();
      case RPGPackage.LOCATIONS: return createLocations();
      case RPGPackage.LOC: return createLoc();
      case RPGPackage.TERRAIN: return createTerrain();
      case RPGPackage.RELATIONS: return createRelations();
      case RPGPackage.TYPE: return createType();
      case RPGPackage.TYPE_EXPRESSION: return createTypeExpression();
      case RPGPackage.MOVES: return createMoves();
      case RPGPackage.MOVE: return createMove();
      case RPGPackage.MEFFECT: return createMEffect();
      case RPGPackage.BEFFECT: return createBEffect();
      case RPGPackage.ETYPE: return createEType();
      case RPGPackage.ATTRIBUTE_VALUES: return createAttributeValues();
      case RPGPackage.ALT_ATTRIBUTE: return createAltAttribute();
      case RPGPackage.ENTITIES: return createEntities();
      case RPGPackage.DEATH: return createDeath();
      case RPGPackage.ENTITY: return createEntity();
      case RPGPackage.ENTITY_ATTRIBUTE: return createEntityAttribute();
      case RPGPackage.LOCAL_ATTRIBUTE: return createLocalAttribute();
      case RPGPackage.ENTITY_MOVES: return createEntityMoves();
      case RPGPackage.TEAMS: return createTeams();
      case RPGPackage.TEAM_SIZE: return createTeamSize();
      case RPGPackage.TEAM: return createTeam();
      case RPGPackage.MEMBERS: return createMembers();
      case RPGPackage.REQUIRE: return createRequire();
      case RPGPackage.PROPOSITION: return createProposition();
      case RPGPackage.NUMBER_COMPARING: return createNumberComparing();
      case RPGPackage.COMPARATOR: return createComparator();
      case RPGPackage.SUM: return createSum();
      case RPGPackage.MULTIPLY: return createMultiply();
      case RPGPackage.ATOMIC_NUMBER: return createAtomicNumber();
      case RPGPackage.ACTUAL_NUMBERS: return createActualNumbers();
      case RPGPackage.NAME_ATTRIBUTE: return createNameAttribute();
      case RPGPackage.INT_NUM: return createIntNum();
      case RPGPackage.FLOAT_NUM: return createFloatNum();
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
  public Speed createSpeed()
  {
    SpeedImpl speed = new SpeedImpl();
    return speed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Effects createEffects()
  {
    EffectsImpl effects = new EffectsImpl();
    return effects;
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
  public Buff createBuff()
  {
    BuffImpl buff = new BuffImpl();
    return buff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MoveE createMoveE()
  {
    MoveEImpl moveE = new MoveEImpl();
    return moveE;
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
  public AttributeBuff createAttributeBuff()
  {
    AttributeBuffImpl attributeBuff = new AttributeBuffImpl();
    return attributeBuff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AttributeReference createAttributeReference()
  {
    AttributeReferenceImpl attributeReference = new AttributeReferenceImpl();
    return attributeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Self createSelf()
  {
    SelfImpl self = new SelfImpl();
    return self;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Target createTarget()
  {
    TargetImpl target = new TargetImpl();
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LocalTarget createLocalTarget()
  {
    LocalTargetImpl localTarget = new LocalTargetImpl();
    return localTarget;
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
  public Terrain createTerrain()
  {
    TerrainImpl terrain = new TerrainImpl();
    return terrain;
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
  public MEffect createMEffect()
  {
    MEffectImpl mEffect = new MEffectImpl();
    return mEffect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BEffect createBEffect()
  {
    BEffectImpl bEffect = new BEffectImpl();
    return bEffect;
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
  public EntityAttribute createEntityAttribute()
  {
    EntityAttributeImpl entityAttribute = new EntityAttributeImpl();
    return entityAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LocalAttribute createLocalAttribute()
  {
    LocalAttributeImpl localAttribute = new LocalAttributeImpl();
    return localAttribute;
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
  public TeamSize createTeamSize()
  {
    TeamSizeImpl teamSize = new TeamSizeImpl();
    return teamSize;
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
  public ActualNumbers createActualNumbers()
  {
    ActualNumbersImpl actualNumbers = new ActualNumbersImpl();
    return actualNumbers;
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
