/**
 * generated by Xtext 2.21.0
 */
package mdsd.rPG;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.rPG.AttributeReference#getSelfT <em>Self T</em>}</li>
 *   <li>{@link mdsd.rPG.AttributeReference#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see mdsd.rPG.RPGPackage#getAttributeReference()
 * @model
 * @generated
 */
public interface AttributeReference extends EObject
{
  /**
   * Returns the value of the '<em><b>Self T</b></em>' containment reference list.
   * The list contents are of type {@link mdsd.rPG.Self}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Self T</em>' containment reference list.
   * @see mdsd.rPG.RPGPackage#getAttributeReference_SelfT()
   * @model containment="true"
   * @generated
   */
  EList<Self> getSelfT();

  /**
   * Returns the value of the '<em><b>Target</b></em>' containment reference list.
   * The list contents are of type {@link mdsd.rPG.Target}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' containment reference list.
   * @see mdsd.rPG.RPGPackage#getAttributeReference_Target()
   * @model containment="true"
   * @generated
   */
  EList<Target> getTarget();

} // AttributeReference
