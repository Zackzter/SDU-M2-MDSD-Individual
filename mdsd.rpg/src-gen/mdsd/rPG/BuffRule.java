/**
 * generated by Xtext 2.21.0
 */
package mdsd.rPG;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Buff Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.rPG.BuffRule#getOr <em>Or</em>}</li>
 *   <li>{@link mdsd.rPG.BuffRule#getTarget <em>Target</em>}</li>
 *   <li>{@link mdsd.rPG.BuffRule#getSum <em>Sum</em>}</li>
 * </ul>
 *
 * @see mdsd.rPG.RPGPackage#getBuffRule()
 * @model
 * @generated
 */
public interface BuffRule extends EObject
{
  /**
   * Returns the value of the '<em><b>Or</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Or</em>' containment reference.
   * @see #setOr(Proposition)
   * @see mdsd.rPG.RPGPackage#getBuffRule_Or()
   * @model containment="true"
   * @generated
   */
  Proposition getOr();

  /**
   * Sets the value of the '{@link mdsd.rPG.BuffRule#getOr <em>Or</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Or</em>' containment reference.
   * @see #getOr()
   * @generated
   */
  void setOr(Proposition value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(Attribute)
   * @see mdsd.rPG.RPGPackage#getBuffRule_Target()
   * @model
   * @generated
   */
  Attribute getTarget();

  /**
   * Sets the value of the '{@link mdsd.rPG.BuffRule#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Attribute value);

  /**
   * Returns the value of the '<em><b>Sum</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sum</em>' containment reference.
   * @see #setSum(Sum)
   * @see mdsd.rPG.RPGPackage#getBuffRule_Sum()
   * @model containment="true"
   * @generated
   */
  Sum getSum();

  /**
   * Sets the value of the '{@link mdsd.rPG.BuffRule#getSum <em>Sum</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sum</em>' containment reference.
   * @see #getSum()
   * @generated
   */
  void setSum(Sum value);

} // BuffRule
