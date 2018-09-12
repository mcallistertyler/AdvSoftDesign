/**
 */
package tdt4250.coursework;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.coursework.CourseInstance#getSemesterDate <em>Semester Date</em>}</li>
 *   <li>{@link tdt4250.coursework.CourseInstance#getCourse <em>Course</em>}</li>
 *   <li>{@link tdt4250.coursework.CourseInstance#getEvaluationform <em>Evaluationform</em>}</li>
 *   <li>{@link tdt4250.coursework.CourseInstance#getTimetable <em>Timetable</em>}</li>
 *   <li>{@link tdt4250.coursework.CourseInstance#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see tdt4250.coursework.CourseworkPackage#getCourseInstance()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hasCourseCoordinator'"
 * @generated
 */
public interface CourseInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Semester Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semester Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Date</em>' attribute.
	 * @see #setSemesterDate(Date)
	 * @see tdt4250.coursework.CourseworkPackage#getCourseInstance_SemesterDate()
	 * @model
	 * @generated
	 */
	Date getSemesterDate();

	/**
	 * Sets the value of the '{@link tdt4250.coursework.CourseInstance#getSemesterDate <em>Semester Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester Date</em>' attribute.
	 * @see #getSemesterDate()
	 * @generated
	 */
	void setSemesterDate(Date value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.coursework.Course#getSemesterSpecificCourseInstance <em>Semester Specific Course Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' container reference.
	 * @see #setCourse(Course)
	 * @see tdt4250.coursework.CourseworkPackage#getCourseInstance_Course()
	 * @see tdt4250.coursework.Course#getSemesterSpecificCourseInstance
	 * @model opposite="semesterSpecificCourseInstance" required="true" transient="false"
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link tdt4250.coursework.CourseInstance#getCourse <em>Course</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' container reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

	/**
	 * Returns the value of the '<em><b>Timetable</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.coursework.Timetable#getCourseinstance <em>Courseinstance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timetable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timetable</em>' containment reference.
	 * @see #setTimetable(Timetable)
	 * @see tdt4250.coursework.CourseworkPackage#getCourseInstance_Timetable()
	 * @see tdt4250.coursework.Timetable#getCourseinstance
	 * @model opposite="courseinstance" containment="true" required="true"
	 * @generated
	 */
	Timetable getTimetable();

	/**
	 * Sets the value of the '{@link tdt4250.coursework.CourseInstance#getTimetable <em>Timetable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timetable</em>' containment reference.
	 * @see #getTimetable()
	 * @generated
	 */
	void setTimetable(Timetable value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.coursework.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference list.
	 * @see tdt4250.coursework.CourseworkPackage#getCourseInstance_Role()
	 * @model required="true"
	 * @generated
	 */
	EList<Role> getRole();

	/**
	 * Returns the value of the '<em><b>Evaluationform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluationform</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluationform</em>' containment reference.
	 * @see #setEvaluationform(EvaluationForm)
	 * @see tdt4250.coursework.CourseworkPackage#getCourseInstance_Evaluationform()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EvaluationForm getEvaluationform();

	/**
	 * Sets the value of the '{@link tdt4250.coursework.CourseInstance#getEvaluationform <em>Evaluationform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluationform</em>' containment reference.
	 * @see #getEvaluationform()
	 * @generated
	 */
	void setEvaluationform(EvaluationForm value);

} // CourseInstance
