/**
 */
package tdt4250.coursework;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.coursework.Staff#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.coursework.Staff#getWorksIn <em>Works In</em>}</li>
 *   <li>{@link tdt4250.coursework.Staff#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see tdt4250.coursework.CourseworkPackage#getStaff()
 * @model
 * @generated
 */
public interface Staff extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.coursework.CourseworkPackage#getStaff_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.coursework.Staff#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Works In</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.coursework.Organisation#getStaff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Works In</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Works In</em>' container reference.
	 * @see #setWorksIn(Organisation)
	 * @see tdt4250.coursework.CourseworkPackage#getStaff_WorksIn()
	 * @see tdt4250.coursework.Organisation#getStaff
	 * @model opposite="staff" transient="false"
	 * @generated
	 */
	Organisation getWorksIn();

	/**
	 * Sets the value of the '{@link tdt4250.coursework.Staff#getWorksIn <em>Works In</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Works In</em>' container reference.
	 * @see #getWorksIn()
	 * @generated
	 */
	void setWorksIn(Organisation value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see tdt4250.coursework.CourseworkPackage#getStaff_Role()
	 * @model
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link tdt4250.coursework.Staff#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

} // Staff
