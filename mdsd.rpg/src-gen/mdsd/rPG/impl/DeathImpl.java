/**
 * generated by Xtext 2.21.0
 */
package mdsd.rPG.impl;

import mdsd.rPG.Death;
import mdsd.rPG.RPGPackage;
import mdsd.rPG.Require;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Death</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdsd.rPG.impl.DeathImpl#getReq <em>Req</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeathImpl extends DeclarationImpl implements Death
{
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
  protected DeathImpl()
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
    return RPGPackage.Literals.DEATH;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RPGPackage.DEATH__REQ, oldReq, newReq);
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
        msgs = ((InternalEObject)req).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RPGPackage.DEATH__REQ, null, msgs);
      if (newReq != null)
        msgs = ((InternalEObject)newReq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RPGPackage.DEATH__REQ, null, msgs);
      msgs = basicSetReq(newReq, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPGPackage.DEATH__REQ, newReq, newReq));
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
      case RPGPackage.DEATH__REQ:
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
      case RPGPackage.DEATH__REQ:
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
      case RPGPackage.DEATH__REQ:
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
      case RPGPackage.DEATH__REQ:
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
      case RPGPackage.DEATH__REQ:
        return req != null;
    }
    return super.eIsSet(featureID);
  }

} //DeathImpl
