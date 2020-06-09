/**
 * generated by Xtext 2.21.0
 */
package mdsd.rPG;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.rPG.NameAttribute#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link mdsd.rPG.NameAttribute#getLocal <em>Local</em>}</li>
 * </ul>
 *
 * @see mdsd.rPG.RPGPackage#getNameAttribute()
 * @model
 * @generated
 */
public interface NameAttribute extends AtomicNumber
{
  /**
   * Returns the value of the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' reference.
   * @see #setAttribute(Attribute)
   * @see mdsd.rPG.RPGPackage#getNameAttribute_Attribute()
   * @model
   * @generated
   */
  Attribute getAttribute();

  /**
   * Sets the value of the '{@link mdsd.rPG.NameAttribute#getAttribute <em>Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' reference.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(Attribute value);

  /**
   * Returns the value of the '<em><b>Local</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Local</em>' reference.
   * @see #setLocal(LocalAttribute)
   * @see mdsd.rPG.RPGPackage#getNameAttribute_Local()
   * @model
   * @generated
   */
  LocalAttribute getLocal();

  /**
   * Sets the value of the '{@link mdsd.rPG.NameAttribute#getLocal <em>Local</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Local</em>' reference.
   * @see #getLocal()
   * @generated
   */
  void setLocal(LocalAttribute value);

} // NameAttribute
