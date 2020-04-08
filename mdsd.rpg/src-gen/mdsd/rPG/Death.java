/**
 * generated by Xtext 2.21.0
 */
package mdsd.rPG;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Death</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.rPG.Death#getCon <em>Con</em>}</li>
 * </ul>
 *
 * @see mdsd.rPG.RPGPackage#getDeath()
 * @model
 * @generated
 */
public interface Death extends Declaration
{
  /**
   * Returns the value of the '<em><b>Con</b></em>' containment reference list.
   * The list contents are of type {@link mdsd.rPG.Proposition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Con</em>' containment reference list.
   * @see mdsd.rPG.RPGPackage#getDeath_Con()
   * @model containment="true"
   * @generated
   */
  EList<Proposition> getCon();

} // Death