/**
 * generated by Xtext 2.21.0
 */
package mdsd.rPG.impl;

import mdsd.rPG.Attribute;
import mdsd.rPG.RPGPackage;
import mdsd.rPG.Sum;
import mdsd.rPG.Target;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdsd.rPG.impl.TargetImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link mdsd.rPG.impl.TargetImpl#getSum <em>Sum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetImpl extends MinimalEObjectImpl.Container implements Target
{
  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected Attribute target;

  /**
   * The cached value of the '{@link #getSum() <em>Sum</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSum()
   * @generated
   * @ordered
   */
  protected Sum sum;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TargetImpl()
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
    return RPGPackage.Literals.TARGET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Attribute getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (Attribute)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RPGPackage.TARGET__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTarget(Attribute newTarget)
  {
    Attribute oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPGPackage.TARGET__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Sum getSum()
  {
    return sum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSum(Sum newSum, NotificationChain msgs)
  {
    Sum oldSum = sum;
    sum = newSum;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RPGPackage.TARGET__SUM, oldSum, newSum);
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
  public void setSum(Sum newSum)
  {
    if (newSum != sum)
    {
      NotificationChain msgs = null;
      if (sum != null)
        msgs = ((InternalEObject)sum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RPGPackage.TARGET__SUM, null, msgs);
      if (newSum != null)
        msgs = ((InternalEObject)newSum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RPGPackage.TARGET__SUM, null, msgs);
      msgs = basicSetSum(newSum, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RPGPackage.TARGET__SUM, newSum, newSum));
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
      case RPGPackage.TARGET__SUM:
        return basicSetSum(null, msgs);
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
      case RPGPackage.TARGET__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case RPGPackage.TARGET__SUM:
        return getSum();
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
      case RPGPackage.TARGET__TARGET:
        setTarget((Attribute)newValue);
        return;
      case RPGPackage.TARGET__SUM:
        setSum((Sum)newValue);
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
      case RPGPackage.TARGET__TARGET:
        setTarget((Attribute)null);
        return;
      case RPGPackage.TARGET__SUM:
        setSum((Sum)null);
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
      case RPGPackage.TARGET__TARGET:
        return target != null;
      case RPGPackage.TARGET__SUM:
        return sum != null;
    }
    return super.eIsSet(featureID);
  }

} //TargetImpl
