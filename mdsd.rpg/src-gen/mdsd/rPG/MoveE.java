/**
 * generated by Xtext 2.21.0
 */
package mdsd.rPG;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move E</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.rPG.MoveE#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see mdsd.rPG.RPGPackage#getMoveE()
 * @model
 * @generated
 */
public interface MoveE extends Effect
{
  /**
   * Returns the value of the '<em><b>Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' containment reference.
   * @see #setReference(AttributeReference)
   * @see mdsd.rPG.RPGPackage#getMoveE_Reference()
   * @model containment="true"
   * @generated
   */
  AttributeReference getReference();

  /**
   * Sets the value of the '{@link mdsd.rPG.MoveE#getReference <em>Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' containment reference.
   * @see #getReference()
   * @generated
   */
  void setReference(AttributeReference value);

} // MoveE
