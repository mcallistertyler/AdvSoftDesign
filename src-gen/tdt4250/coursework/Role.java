/**
 */
package tdt4250.coursework;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.coursework.Role#getRoleKind <em>Role Kind</em>}</li>
 * </ul>
 *
 * @see tdt4250.coursework.CourseworkPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends EObject {
	/**
	 * Returns the value of the '<em><b>Role Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.coursework.RoleKinds}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Kind</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Kind</em>' attribute.
	 * @see tdt4250.coursework.RoleKinds
	 * @see #setRoleKind(RoleKinds)
	 * @see tdt4250.coursework.CourseworkPackage#getRole_RoleKind()
	 * @model required="true"
	 * @generated
	 */
	RoleKinds getRoleKind();

	/**
	 * Sets the value of the '{@link tdt4250.coursework.Role#getRoleKind <em>Role Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Kind</em>' attribute.
	 * @see tdt4250.coursework.RoleKinds
	 * @see #getRoleKind()
	 * @generated
	 */
	void setRoleKind(RoleKinds value);

} // Role
