/**
 * generated by Xtext 2.21.0
 */
package mdsd.rPG;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.rPG.LocalTarget#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link mdsd.rPG.LocalTarget#getSum <em>Sum</em>}</li>
 * </ul>
 *
 * @see mdsd.rPG.RPGPackage#getLocalTarget()
 * @model
 * @generated
 */
public interface LocalTarget extends EObject
{
  /**
   * Returns the value of the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' reference.
   * @see #setAttribute(LocalAttribute)
   * @see mdsd.rPG.RPGPackage#getLocalTarget_Attribute()
   * @model
   * @generated
   */
  LocalAttribute getAttribute();

  /**
   * Sets the value of the '{@link mdsd.rPG.LocalTarget#getAttribute <em>Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' reference.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(LocalAttribute value);

  /**
   * Returns the value of the '<em><b>Sum</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sum</em>' containment reference.
   * @see #setSum(Sum)
   * @see mdsd.rPG.RPGPackage#getLocalTarget_Sum()
   * @model containment="true"
   * @generated
   */
  Sum getSum();

  /**
   * Sets the value of the '{@link mdsd.rPG.LocalTarget#getSum <em>Sum</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sum</em>' containment reference.
   * @see #getSum()
   * @generated
   */
  void setSum(Sum value);

} // LocalTarget