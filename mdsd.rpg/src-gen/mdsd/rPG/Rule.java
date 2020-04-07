/**
 * generated by Xtext 2.21.0
 */
package mdsd.rPG;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.rPG.Rule#getOperator <em>Operator</em>}</li>
 *   <li>{@link mdsd.rPG.Rule#getChange <em>Change</em>}</li>
 * </ul>
 *
 * @see mdsd.rPG.RPGPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends Effect
{
  /**
   * Returns the value of the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' containment reference.
   * @see #setOperator(Proposition)
   * @see mdsd.rPG.RPGPackage#getRule_Operator()
   * @model containment="true"
   * @generated
   */
  Proposition getOperator();

  /**
   * Sets the value of the '{@link mdsd.rPG.Rule#getOperator <em>Operator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' containment reference.
   * @see #getOperator()
   * @generated
   */
  void setOperator(Proposition value);

  /**
   * Returns the value of the '<em><b>Change</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Change</em>' containment reference.
   * @see #setChange(Sum)
   * @see mdsd.rPG.RPGPackage#getRule_Change()
   * @model containment="true"
   * @generated
   */
  Sum getChange();

  /**
   * Sets the value of the '{@link mdsd.rPG.Rule#getChange <em>Change</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Change</em>' containment reference.
   * @see #getChange()
   * @generated
   */
  void setChange(Sum value);

} // Rule
