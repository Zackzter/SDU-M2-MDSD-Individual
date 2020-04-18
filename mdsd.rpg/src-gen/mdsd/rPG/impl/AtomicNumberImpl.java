/**
 * generated by Xtext 2.21.0
 */
package mdsd.rPG.impl;

import java.util.Collection;

import mdsd.rPG.AtomicAttribute;
import mdsd.rPG.AtomicNumber;
import mdsd.rPG.Attribute;
import mdsd.rPG.BattleSize;
import mdsd.rPG.Declaration;
import mdsd.rPG.Effect;
import mdsd.rPG.Proposition;
import mdsd.rPG.RPGPackage;
import mdsd.rPG.Require;
import mdsd.rPG.Rule;
import mdsd.rPG.Team;
import mdsd.rPG.Teams;
import mdsd.rPG.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdsd.rPG.impl.AtomicNumberImpl#getBs <em>Bs</em>}</li>
 *   <li>{@link mdsd.rPG.impl.AtomicNumberImpl#getTeam <em>Team</em>}</li>
 *   <li>{@link mdsd.rPG.impl.AtomicNumberImpl#getAttritbuteToSet <em>Attritbute To Set</em>}</li>
 *   <li>{@link mdsd.rPG.impl.AtomicNumberImpl#getChange <em>Change</em>}</li>
 *   <li>{@link mdsd.rPG.impl.AtomicNumberImpl#getType <em>Type</em>}</li>
 *   <li>{@link mdsd.rPG.impl.AtomicNumberImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link mdsd.rPG.impl.AtomicNumberImpl#getComp <em>Comp</em>}</li>
 *   <li>{@link mdsd.rPG.impl.AtomicNumberImpl#getRight <em>Right</em>}</li>
 *   <li>{@link mdsd.rPG.impl.AtomicNumberImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link mdsd.rPG.impl.AtomicNumberImpl#getReq <em>Req</em>}</li>
 *   <li>{@link mdsd.rPG.impl.AtomicNumberImpl#getFloat2 <em>Float2</em>}</li>
 *   <li>{@link mdsd.rPG.impl.AtomicNumberImpl#getInt2 <em>Int2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtomicNumberImpl extends AttributeValuesImpl implements AtomicNumber
{
  /**
   * The cached value of the '{@link #getBs() <em>Bs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBs()
   * @generated
   * @ordered
   */
  protected BattleSize bs;

  /**
   * The cached value of the '{@link #getTeam() <em>Team</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTeam()
   * @generated
   * @ordered
   */
  protected EList<Team> team;

  /**
   * The cached value of the '{@link #getAttritbuteToSet() <em>Attritbute To Set</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttritbuteToSet()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attritbuteToSet;

  /**
   * The cached value of the '{@link #getChange() <em>Change</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChange()
   * @generated
   * @ordered
   */
  protected EList<Proposition> change;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected Proposition left;

  /**
   * The default value of the '{@link #getComp() <em>Comp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComp()
   * @generated
   * @ordered
   */
  protected static final String COMP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getComp() <em>Comp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComp()
   * @generated
   * @ordered
   */
  protected String comp = COMP_EDEFAULT;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected Proposition right;

  /**
   * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected Attribute attribute;

  /**
   * The cached value of the '{@link #getReq() <em>Req</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReq()
   * @generated
   * @ordered
   */
  protected Require req;

  /**
   * The default value of the '{@link #getFloat2() <em>Float2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFloat2()
   * @generated
   * @ordered
   */
  protected static final String FLOAT2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFloat2() <em>Float2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFloat2()
   * @generated
   * @ordered
   */
  protected String float2 = FLOAT2_EDEFAULT;

  /**
   * The default value of the '{@link #getInt2() <em>Int2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInt2()
   * @generated
   * @ordered
   */
  protected static final int INT2_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getInt2() <em>Int2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInt2()
   * @generated
   * @ordered
   */
  protected int int2 = INT2_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AtomicNumberImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RPGPackage.Literals.ATOMIC_NUMBER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BattleSize getBs()
  {
    return bs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBs(BattleSize newBs, NotificationChain msgs)
  {
    BattleSize oldBs = bs;
    bs = newBs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RPGPackage.ATOMIC_NUMBER__BS, oldBs, newBs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBs(BattleSize newBs)
  {
    if (newBs != bs)
    {
      NotificationChain msgs = null;
      if (bs != null)
        msgs = ((InternalEObject)bs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RPGPackage.ATOMIC_NUMBER__BS, null, msgs);
      if (newBs != null)
        msgs = ((InternalEObject)newBs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RPGPackage.ATOMIC_NUMBER__BS, null, msgs);
      msgs = basicSetBs(newBs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPGPackage.ATOMIC_NUMBER__BS, newBs, newBs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Team> getTeam()
  {
    if (team == null)
    {
      team = new EObjectContainmentEList<Team>(Team.class, this, RPGPackage.ATOMIC_NUMBER__TEAM);
    }
    return team;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Attribute> getAttritbuteToSet()
  {
    if (attritbuteToSet == null)
    {
      attritbuteToSet = new EObjectResolvingEList<Attribute>(Attribute.class, this, RPGPackage.ATOMIC_NUMBER__ATTRITBUTE_TO_SET);
    }
    return attritbuteToSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Proposition> getChange()
  {
    if (change == null)
    {
      change = new EObjectContainmentEList<Proposition>(Proposition.class, this, RPGPackage.ATOMIC_NUMBER__CHANGE);
    }
    return change;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Type getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (Type)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RPGPackage.ATOMIC_NUMBER__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(Type newType)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPGPackage.ATOMIC_NUMBER__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Proposition getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(Proposition newLeft, NotificationChain msgs)
  {
    Proposition oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RPGPackage.ATOMIC_NUMBER__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLeft(Proposition newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RPGPackage.ATOMIC_NUMBER__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RPGPackage.ATOMIC_NUMBER__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPGPackage.ATOMIC_NUMBER__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getComp()
  {
    return comp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setComp(String newComp)
  {
    String oldComp = comp;
    comp = newComp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPGPackage.ATOMIC_NUMBER__COMP, oldComp, comp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Proposition getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(Proposition newRight, NotificationChain msgs)
  {
    Proposition oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RPGPackage.ATOMIC_NUMBER__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRight(Proposition newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RPGPackage.ATOMIC_NUMBER__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RPGPackage.ATOMIC_NUMBER__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPGPackage.ATOMIC_NUMBER__RIGHT, newRight, newRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Attribute getAttribute()
  {
    if (attribute != null && attribute.eIsProxy())
    {
      InternalEObject oldAttribute = (InternalEObject)attribute;
      attribute = (Attribute)eResolveProxy(oldAttribute);
      if (attribute != oldAttribute)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RPGPackage.ATOMIC_NUMBER__ATTRIBUTE, oldAttribute, attribute));
      }
    }
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute basicGetAttribute()
  {
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAttribute(Attribute newAttribute)
  {
    Attribute oldAttribute = attribute;
    attribute = newAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPGPackage.ATOMIC_NUMBER__ATTRIBUTE, oldAttribute, attribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Require getReq()
  {
    return req;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReq(Require newReq, NotificationChain msgs)
  {
    Require oldReq = req;
    req = newReq;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RPGPackage.ATOMIC_NUMBER__REQ, oldReq, newReq);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setReq(Require newReq)
  {
    if (newReq != req)
    {
      NotificationChain msgs = null;
      if (req != null)
        msgs = ((InternalEObject)req).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RPGPackage.ATOMIC_NUMBER__REQ, null, msgs);
      if (newReq != null)
        msgs = ((InternalEObject)newReq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RPGPackage.ATOMIC_NUMBER__REQ, null, msgs);
      msgs = basicSetReq(newReq, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPGPackage.ATOMIC_NUMBER__REQ, newReq, newReq));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFloat2()
  {
    return float2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFloat2(String newFloat2)
  {
    String oldFloat2 = float2;
    float2 = newFloat2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPGPackage.ATOMIC_NUMBER__FLOAT2, oldFloat2, float2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getInt2()
  {
    return int2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInt2(int newInt2)
  {
    int oldInt2 = int2;
    int2 = newInt2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPGPackage.ATOMIC_NUMBER__INT2, oldInt2, int2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RPGPackage.ATOMIC_NUMBER__BS:
        return basicSetBs(null, msgs);
      case RPGPackage.ATOMIC_NUMBER__TEAM:
        return ((InternalEList<?>)getTeam()).basicRemove(otherEnd, msgs);
      case RPGPackage.ATOMIC_NUMBER__CHANGE:
        return ((InternalEList<?>)getChange()).basicRemove(otherEnd, msgs);
      case RPGPackage.ATOMIC_NUMBER__LEFT:
        return basicSetLeft(null, msgs);
      case RPGPackage.ATOMIC_NUMBER__RIGHT:
        return basicSetRight(null, msgs);
      case RPGPackage.ATOMIC_NUMBER__REQ:
        return basicSetReq(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RPGPackage.ATOMIC_NUMBER__BS:
        return getBs();
      case RPGPackage.ATOMIC_NUMBER__TEAM:
        return getTeam();
      case RPGPackage.ATOMIC_NUMBER__ATTRITBUTE_TO_SET:
        return getAttritbuteToSet();
      case RPGPackage.ATOMIC_NUMBER__CHANGE:
        return getChange();
      case RPGPackage.ATOMIC_NUMBER__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case RPGPackage.ATOMIC_NUMBER__LEFT:
        return getLeft();
      case RPGPackage.ATOMIC_NUMBER__COMP:
        return getComp();
      case RPGPackage.ATOMIC_NUMBER__RIGHT:
        return getRight();
      case RPGPackage.ATOMIC_NUMBER__ATTRIBUTE:
        if (resolve) return getAttribute();
        return basicGetAttribute();
      case RPGPackage.ATOMIC_NUMBER__REQ:
        return getReq();
      case RPGPackage.ATOMIC_NUMBER__FLOAT2:
        return getFloat2();
      case RPGPackage.ATOMIC_NUMBER__INT2:
        return getInt2();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RPGPackage.ATOMIC_NUMBER__BS:
        setBs((BattleSize)newValue);
        return;
      case RPGPackage.ATOMIC_NUMBER__TEAM:
        getTeam().clear();
        getTeam().addAll((Collection<? extends Team>)newValue);
        return;
      case RPGPackage.ATOMIC_NUMBER__ATTRITBUTE_TO_SET:
        getAttritbuteToSet().clear();
        getAttritbuteToSet().addAll((Collection<? extends Attribute>)newValue);
        return;
      case RPGPackage.ATOMIC_NUMBER__CHANGE:
        getChange().clear();
        getChange().addAll((Collection<? extends Proposition>)newValue);
        return;
      case RPGPackage.ATOMIC_NUMBER__TYPE:
        setType((Type)newValue);
        return;
      case RPGPackage.ATOMIC_NUMBER__LEFT:
        setLeft((Proposition)newValue);
        return;
      case RPGPackage.ATOMIC_NUMBER__COMP:
        setComp((String)newValue);
        return;
      case RPGPackage.ATOMIC_NUMBER__RIGHT:
        setRight((Proposition)newValue);
        return;
      case RPGPackage.ATOMIC_NUMBER__ATTRIBUTE:
        setAttribute((Attribute)newValue);
        return;
      case RPGPackage.ATOMIC_NUMBER__REQ:
        setReq((Require)newValue);
        return;
      case RPGPackage.ATOMIC_NUMBER__FLOAT2:
        setFloat2((String)newValue);
        return;
      case RPGPackage.ATOMIC_NUMBER__INT2:
        setInt2((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RPGPackage.ATOMIC_NUMBER__BS:
        setBs((BattleSize)null);
        return;
      case RPGPackage.ATOMIC_NUMBER__TEAM:
        getTeam().clear();
        return;
      case RPGPackage.ATOMIC_NUMBER__ATTRITBUTE_TO_SET:
        getAttritbuteToSet().clear();
        return;
      case RPGPackage.ATOMIC_NUMBER__CHANGE:
        getChange().clear();
        return;
      case RPGPackage.ATOMIC_NUMBER__TYPE:
        setType((Type)null);
        return;
      case RPGPackage.ATOMIC_NUMBER__LEFT:
        setLeft((Proposition)null);
        return;
      case RPGPackage.ATOMIC_NUMBER__COMP:
        setComp(COMP_EDEFAULT);
        return;
      case RPGPackage.ATOMIC_NUMBER__RIGHT:
        setRight((Proposition)null);
        return;
      case RPGPackage.ATOMIC_NUMBER__ATTRIBUTE:
        setAttribute((Attribute)null);
        return;
      case RPGPackage.ATOMIC_NUMBER__REQ:
        setReq((Require)null);
        return;
      case RPGPackage.ATOMIC_NUMBER__FLOAT2:
        setFloat2(FLOAT2_EDEFAULT);
        return;
      case RPGPackage.ATOMIC_NUMBER__INT2:
        setInt2(INT2_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RPGPackage.ATOMIC_NUMBER__BS:
        return bs != null;
      case RPGPackage.ATOMIC_NUMBER__TEAM:
        return team != null && !team.isEmpty();
      case RPGPackage.ATOMIC_NUMBER__ATTRITBUTE_TO_SET:
        return attritbuteToSet != null && !attritbuteToSet.isEmpty();
      case RPGPackage.ATOMIC_NUMBER__CHANGE:
        return change != null && !change.isEmpty();
      case RPGPackage.ATOMIC_NUMBER__TYPE:
        return type != null;
      case RPGPackage.ATOMIC_NUMBER__LEFT:
        return left != null;
      case RPGPackage.ATOMIC_NUMBER__COMP:
        return COMP_EDEFAULT == null ? comp != null : !COMP_EDEFAULT.equals(comp);
      case RPGPackage.ATOMIC_NUMBER__RIGHT:
        return right != null;
      case RPGPackage.ATOMIC_NUMBER__ATTRIBUTE:
        return attribute != null;
      case RPGPackage.ATOMIC_NUMBER__REQ:
        return req != null;
      case RPGPackage.ATOMIC_NUMBER__FLOAT2:
        return FLOAT2_EDEFAULT == null ? float2 != null : !FLOAT2_EDEFAULT.equals(float2);
      case RPGPackage.ATOMIC_NUMBER__INT2:
        return int2 != INT2_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == BattleSize.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Effect.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Rule.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Declaration.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Teams.class)
    {
      switch (derivedFeatureID)
      {
        case RPGPackage.ATOMIC_NUMBER__BS: return RPGPackage.TEAMS__BS;
        case RPGPackage.ATOMIC_NUMBER__TEAM: return RPGPackage.TEAMS__TEAM;
        default: return -1;
      }
    }
    if (baseClass == Require.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Proposition.class)
    {
      switch (derivedFeatureID)
      {
        case RPGPackage.ATOMIC_NUMBER__ATTRITBUTE_TO_SET: return RPGPackage.PROPOSITION__ATTRITBUTE_TO_SET;
        case RPGPackage.ATOMIC_NUMBER__CHANGE: return RPGPackage.PROPOSITION__CHANGE;
        case RPGPackage.ATOMIC_NUMBER__TYPE: return RPGPackage.PROPOSITION__TYPE;
        case RPGPackage.ATOMIC_NUMBER__LEFT: return RPGPackage.PROPOSITION__LEFT;
        case RPGPackage.ATOMIC_NUMBER__COMP: return RPGPackage.PROPOSITION__COMP;
        case RPGPackage.ATOMIC_NUMBER__RIGHT: return RPGPackage.PROPOSITION__RIGHT;
        default: return -1;
      }
    }
    if (baseClass == AtomicAttribute.class)
    {
      switch (derivedFeatureID)
      {
        case RPGPackage.ATOMIC_NUMBER__ATTRIBUTE: return RPGPackage.ATOMIC_ATTRIBUTE__ATTRIBUTE;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == BattleSize.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Effect.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Rule.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Declaration.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Teams.class)
    {
      switch (baseFeatureID)
      {
        case RPGPackage.TEAMS__BS: return RPGPackage.ATOMIC_NUMBER__BS;
        case RPGPackage.TEAMS__TEAM: return RPGPackage.ATOMIC_NUMBER__TEAM;
        default: return -1;
      }
    }
    if (baseClass == Require.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Proposition.class)
    {
      switch (baseFeatureID)
      {
        case RPGPackage.PROPOSITION__ATTRITBUTE_TO_SET: return RPGPackage.ATOMIC_NUMBER__ATTRITBUTE_TO_SET;
        case RPGPackage.PROPOSITION__CHANGE: return RPGPackage.ATOMIC_NUMBER__CHANGE;
        case RPGPackage.PROPOSITION__TYPE: return RPGPackage.ATOMIC_NUMBER__TYPE;
        case RPGPackage.PROPOSITION__LEFT: return RPGPackage.ATOMIC_NUMBER__LEFT;
        case RPGPackage.PROPOSITION__COMP: return RPGPackage.ATOMIC_NUMBER__COMP;
        case RPGPackage.PROPOSITION__RIGHT: return RPGPackage.ATOMIC_NUMBER__RIGHT;
        default: return -1;
      }
    }
    if (baseClass == AtomicAttribute.class)
    {
      switch (baseFeatureID)
      {
        case RPGPackage.ATOMIC_ATTRIBUTE__ATTRIBUTE: return RPGPackage.ATOMIC_NUMBER__ATTRIBUTE;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (comp: ");
    result.append(comp);
    result.append(", float2: ");
    result.append(float2);
    result.append(", int2: ");
    result.append(int2);
    result.append(')');
    return result.toString();
  }

} //AtomicNumberImpl
