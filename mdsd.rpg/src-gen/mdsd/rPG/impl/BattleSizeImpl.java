/**
 * generated by Xtext 2.21.0
 */
package mdsd.rPG.impl;

import mdsd.rPG.AtomicNumber;
import mdsd.rPG.BattleSize;
import mdsd.rPG.RPGPackage;
import mdsd.rPG.Require;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Battle Size</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdsd.rPG.impl.BattleSizeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link mdsd.rPG.impl.BattleSizeImpl#getReq <em>Req</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BattleSizeImpl extends MinimalEObjectImpl.Container implements BattleSize
{
  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected AtomicNumber value;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BattleSizeImpl()
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
    return RPGPackage.Literals.BATTLE_SIZE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AtomicNumber getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(AtomicNumber newValue, NotificationChain msgs)
  {
    AtomicNumber oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RPGPackage.BATTLE_SIZE__VALUE, oldValue, newValue);
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
  public void setValue(AtomicNumber newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RPGPackage.BATTLE_SIZE__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RPGPackage.BATTLE_SIZE__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPGPackage.BATTLE_SIZE__VALUE, newValue, newValue));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RPGPackage.BATTLE_SIZE__REQ, oldReq, newReq);
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
        msgs = ((InternalEObject)req).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RPGPackage.BATTLE_SIZE__REQ, null, msgs);
      if (newReq != null)
        msgs = ((InternalEObject)newReq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RPGPackage.BATTLE_SIZE__REQ, null, msgs);
      msgs = basicSetReq(newReq, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPGPackage.BATTLE_SIZE__REQ, newReq, newReq));
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
      case RPGPackage.BATTLE_SIZE__VALUE:
        return basicSetValue(null, msgs);
      case RPGPackage.BATTLE_SIZE__REQ:
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
      case RPGPackage.BATTLE_SIZE__VALUE:
        return getValue();
      case RPGPackage.BATTLE_SIZE__REQ:
        return getReq();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RPGPackage.BATTLE_SIZE__VALUE:
        setValue((AtomicNumber)newValue);
        return;
      case RPGPackage.BATTLE_SIZE__REQ:
        setReq((Require)newValue);
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
      case RPGPackage.BATTLE_SIZE__VALUE:
        setValue((AtomicNumber)null);
        return;
      case RPGPackage.BATTLE_SIZE__REQ:
        setReq((Require)null);
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
      case RPGPackage.BATTLE_SIZE__VALUE:
        return value != null;
      case RPGPackage.BATTLE_SIZE__REQ:
        return req != null;
    }
    return super.eIsSet(featureID);
  }

} //BattleSizeImpl