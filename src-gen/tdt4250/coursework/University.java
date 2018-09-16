/**
 */
package tdt4250.coursework;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>University</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.coursework.University#getRoom <em>Room</em>}</li>
 *   <li>{@link tdt4250.coursework.University#getCourse <em>Course</em>}</li>
 *   <li>{@link tdt4250.coursework.University#getOrganisation <em>Organisation</em>}</li>
 *   <li>{@link tdt4250.coursework.University#getStudyProgram <em>Study Program</em>}</li>
 *   <li>{@link tdt4250.coursework.University#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see tdt4250.coursework.CourseworkPackage#getUniversity()
 * @model
 * @generated
 */
public interface University extends EObject {
	/**
	 * Returns the value of the '<em><b>Room</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.coursework.Room}.
	 * It is bidirectional and its opposite is '{@link tdt4250.coursework.Room#getUniversity <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' containment reference list.
	 * @see tdt4250.coursework.CourseworkPackage#getUniversity_Room()
	 * @see tdt4250.coursework.Room#getUniversity
	 * @model opposite="University" containment="true" required="true"
	 * @generated
	 */
	EList<Room> getRoom();

	/**
	 * Returns the value of the '<em><b>Course</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.coursework.Course}.
	 * It is bidirectional and its opposite is '{@link tdt4250.coursework.Course#getUniversity <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' containment reference list.
	 * @see tdt4250.coursework.CourseworkPackage#getUniversity_Course()
	 * @see tdt4250.coursework.Course#getUniversity
	 * @model opposite="University" containment="true" required="true"
	 * @generated
	 */
	EList<Course> getCourse();

	/**
	 * Returns the value of the '<em><b>Organisation</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.coursework.Organisation}.
	 * It is bidirectional and its opposite is '{@link tdt4250.coursework.Organisation#getUniversity <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organisation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organisation</em>' containment reference list.
	 * @see tdt4250.coursework.CourseworkPackage#getUniversity_Organisation()
	 * @see tdt4250.coursework.Organisation#getUniversity
	 * @model opposite="University" containment="true" required="true"
	 * @generated
	 */
	EList<Organisation> getOrganisation();

	/**
	 * Returns the value of the '<em><b>Study Program</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.coursework.StudyProgram}.
	 * It is bidirectional and its opposite is '{@link tdt4250.coursework.StudyProgram#getUniversity <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Study Program</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Program</em>' containment reference list.
	 * @see tdt4250.coursework.CourseworkPackage#getUniversity_StudyProgram()
	 * @see tdt4250.coursework.StudyProgram#getUniversity
	 * @model opposite="University" containment="true" required="true"
	 * @generated
	 */
	EList<StudyProgram> getStudyProgram();

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
	 * @see tdt4250.coursework.CourseworkPackage#getUniversity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.coursework.University#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // University
