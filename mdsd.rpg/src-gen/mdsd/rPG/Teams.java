/**
 * generated by Xtext 2.21.0
 */
package mdsd.rPG;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Teams</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.rPG.Teams#getSize <em>Size</em>}</li>
 *   <li>{@link mdsd.rPG.Teams#getTeam <em>Team</em>}</li>
 * </ul>
 *
 * @see mdsd.rPG.RPGPackage#getTeams()
 * @model
 * @generated
 */
public interface Teams extends Declaration
{
  /**
   * Returns the value of the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' containment reference.
   * @see #setSize(TeamSize)
   * @see mdsd.rPG.RPGPackage#getTeams_Size()
   * @model containment="true"
   * @generated
   */
  TeamSize getSize();

  /**
   * Sets the value of the '{@link mdsd.rPG.Teams#getSize <em>Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' containment reference.
   * @see #getSize()
   * @generated
   */
  void setSize(TeamSize value);

  /**
   * Returns the value of the '<em><b>Team</b></em>' containment reference list.
   * The list contents are of type {@link mdsd.rPG.Team}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Team</em>' containment reference list.
   * @see mdsd.rPG.RPGPackage#getTeams_Team()
   * @model containment="true"
   * @generated
   */
  EList<Team> getTeam();

} // Teams
