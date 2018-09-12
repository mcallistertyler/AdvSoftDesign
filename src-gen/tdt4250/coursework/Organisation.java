/**
 */
package tdt4250.coursework;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.coursework.Organisation#getDepartmentName <em>Department Name</em>}</li>
 *   <li>{@link tdt4250.coursework.Organisation#getStaff <em>Staff</em>}</li>
 *   <li>{@link tdt4250.coursework.Organisation#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @see tdt4250.coursework.CourseworkPackage#getOrganisation()
 * @model
 * @generated
 */
public interface Organisation extends EObject {
	/**
	 * Returns the value of the '<em><b>Department Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Department Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Department Name</em>' attribute.
	 * @see #setDepartmentName(String)
	 * @see tdt4250.coursework.CourseworkPackage#getOrganisation_DepartmentName()
	 * @model
	 * @generated
	 */
	String getDepartmentName();

	/**
	 * Sets the value of the '{@link tdt4250.coursework.Organisation#getDepartmentName <em>Department Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Department Name</em>' attribute.
	 * @see #getDepartmentName()
	 * @generated
	 */
	void setDepartmentName(String value);

	/**
	 * Returns the value of the '<em><b>Staff</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.coursework.Person}.
	 * It is bidirectional and its opposite is '{@link tdt4250.coursework.Person#getWorksIn <em>Works In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Staff</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff</em>' containment reference list.
	 * @see tdt4250.coursework.CourseworkPackage#getOrganisation_Staff()
	 * @see tdt4250.coursework.Person#getWorksIn
	 * @model opposite="worksIn" containment="true" required="true"
	 * @generated
	 */
	EList<Person> getStaff();

	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.coursework.Course}.
	 * It is bidirectional and its opposite is '{@link tdt4250.coursework.Course#getOrganisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference list.
	 * @see tdt4250.coursework.CourseworkPackage#getOrganisation_Course()
	 * @see tdt4250.coursework.Course#getOrganisation
	 * @model opposite="organisation"
	 * @generated
	 */
	EList<Course> getCourse();

} // Organisation
