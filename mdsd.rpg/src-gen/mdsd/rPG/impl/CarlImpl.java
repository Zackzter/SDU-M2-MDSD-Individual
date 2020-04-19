/**
 * generated by Xtext 2.21.0
 */
package mdsd.rPG.impl;

import mdsd.rPG.Carl;
import mdsd.rPG.NameAttribute;
import mdsd.rPG.RPGPackage;
import mdsd.rPG.SelfTargeting;
import mdsd.rPG.Set;
import mdsd.rPG.Sum;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Carl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdsd.rPG.impl.CarlImpl#getZelf <em>Zelf</em>}</li>
 *   <li>{@link mdsd.rPG.impl.CarlImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link mdsd.rPG.impl.CarlImpl#getEqual <em>Equal</em>}</li>
 *   <li>{@link mdsd.rPG.impl.CarlImpl#getChange <em>Change</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarlImpl extends MinimalEObjectImpl.Container implements Carl
{
  /**
   * The cached value of the '{@link #getZelf() <em>Zelf</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZelf()
   * @generated
   * @ordered
   */
  protected SelfTargeting zelf;

  /**
   * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected NameAttribute attribute;

  /**
   * The cached value of the '{@link #getEqual() <em>Equal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEqual()
   * @generated
   * @ordered
   */
  protected Set equal;

  /**
   * The cached value of the '{@link #getChange() <em>Change</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChange()
   * @generated
   * @ordered
   */
  protected Sum change;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CarlImpl()
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
    return RPGPackage.Literals.CARL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SelfTargeting getZelf()
  {
    return zelf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetZelf(SelfTargeting newZelf, NotificationChain msgs)
  {
    SelfTargeting oldZelf = zelf;
    zelf = newZelf;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RPGPackage.CARL__ZELF, oldZelf, newZelf);
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
  public void setZelf(SelfTargeting newZelf)
  {
    if (newZelf != zelf)
    {
      NotificationChain msgs = null;
      if (zelf != null)
        msgs = ((InternalEObject)zelf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RPGPackage.CARL__ZELF, null, msgs);
      if (newZelf != null)
        msgs = ((InternalEObject)newZelf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RPGPackage.CARL__ZELF, null, msgs);
      msgs = basicSetZelf(newZelf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPGPackage.CARL__ZELF, newZelf, newZelf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NameAttribute getAttribute()
  {
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttribute(NameAttribute newAttribute, NotificationChain msgs)
  {
    NameAttribute oldAttribute = attribute;
    attribute = newAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RPGPackage.CARL__ATTRIBUTE, oldAttribute, newAttribute);
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
  public void setAttribute(NameAttribute newAttribute)
  {
    if (newAttribute != attribute)
    {
      NotificationChain msgs = null;
      if (attribute != null)
        msgs = ((InternalEObject)attribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RPGPackage.CARL__ATTRIBUTE, null, msgs);
      if (newAttribute != null)
        msgs = ((InternalEObject)newAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RPGPackage.CARL__ATTRIBUTE, null, msgs);
      msgs = basicSetAttribute(newAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPGPackage.CARL__ATTRIBUTE, newAttribute, newAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Set getEqual()
  {
    return equal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEqual(Set newEqual, NotificationChain msgs)
  {
    Set oldEqual = equal;
    equal = newEqual;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RPGPackage.CARL__EQUAL, oldEqual, newEqual);
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
  public void setEqual(Set newEqual)
  {
    if (newEqual != equal)
    {
      NotificationChain msgs = null;
      if (equal != null)
        msgs = ((InternalEObject)equal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RPGPackage.CARL__EQUAL, null, msgs);
      if (newEqual != null)
        msgs = ((InternalEObject)newEqual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RPGPackage.CARL__EQUAL, null, msgs);
      msgs = basicSetEqual(newEqual, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPGPackage.CARL__EQUAL, newEqual, newEqual));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Sum getChange()
  {
    return change;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChange(Sum newChange, NotificationChain msgs)
  {
    Sum oldChange = change;
    change = newChange;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RPGPackage.CARL__CHANGE, oldChange, newChange);
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
  public void setChange(Sum newChange)
  {
    if (newChange != change)
    {
      NotificationChain msgs = null;
      if (change != null)
        msgs = ((InternalEObject)change).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RPGPackage.CARL__CHANGE, null, msgs);
      if (newChange != null)
        msgs = ((InternalEObject)newChange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RPGPackage.CARL__CHANGE, null, msgs);
      msgs = basicSetChange(newChange, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPGPackage.CARL__CHANGE, newChange, newChange));
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
      case RPGPackage.CARL__ZELF:
        return basicSetZelf(null, msgs);
      case RPGPackage.CARL__ATTRIBUTE:
        return basicSetAttribute(null, msgs);
      case RPGPackage.CARL__EQUAL:
        return basicSetEqual(null, msgs);
      case RPGPackage.CARL__CHANGE:
        return basicSetChange(null, msgs);
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
      case RPGPackage.CARL__ZELF:
        return getZelf();
      case RPGPackage.CARL__ATTRIBUTE:
        return getAttribute();
      case RPGPackage.CARL__EQUAL:
        return getEqual();
      case RPGPackage.CARL__CHANGE:
        return getChange();
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
      case RPGPackage.CARL__ZELF:
        setZelf((SelfTargeting)newValue);
        return;
      case RPGPackage.CARL__ATTRIBUTE:
        setAttribute((NameAttribute)newValue);
        return;
      case RPGPackage.CARL__EQUAL:
        setEqual((Set)newValue);
        return;
      case RPGPackage.CARL__CHANGE:
        setChange((Sum)newValue);
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
      case RPGPackage.CARL__ZELF:
        setZelf((SelfTargeting)null);
        return;
      case RPGPackage.CARL__ATTRIBUTE:
        setAttribute((NameAttribute)null);
        return;
      case RPGPackage.CARL__EQUAL:
        setEqual((Set)null);
        return;
      case RPGPackage.CARL__CHANGE:
        setChange((Sum)null);
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
      case RPGPackage.CARL__ZELF:
        return zelf != null;
      case RPGPackage.CARL__ATTRIBUTE:
        return attribute != null;
      case RPGPackage.CARL__EQUAL:
        return equal != null;
      case RPGPackage.CARL__CHANGE:
        return change != null;
    }
    return super.eIsSet(featureID);
  }

} //CarlImpl