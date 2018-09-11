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
 *   <li>{@link tdt4250.coursework.CourseInstance#getTimetable <em>Timetable</em>}</li>
 *   <li>{@link tdt4250.coursework.CourseInstance#getSemesterSpecificCourseInstance <em>Semester Specific Course Instance</em>}</li>
 *   <li>{@link tdt4250.coursework.CourseInstance#getStaff <em>Staff</em>}</li>
 *   <li>{@link tdt4250.coursework.CourseInstance#getEvaluationform <em>Evaluationform</em>}</li>
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
	 * Returns the value of the '<em><b>Timetable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timetable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timetable</em>' attribute.
	 * @see #setTimetable(String)
	 * @see tdt4250.coursework.CourseworkPackage#getCourseInstance_Timetable()
	 * @model
	 * @generated
	 */
	String getTimetable();

	/**
	 * Sets the value of the '{@link tdt4250.coursework.CourseInstance#getTimetable <em>Timetable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timetable</em>' attribute.
	 * @see #getTimetable()
	 * @generated
	 */
	void setTimetable(String value);

	/**
	 * Returns the value of the '<em><b>Semester Specific Course Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.coursework.Course#getCourseinstance <em>Courseinstance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semester Specific Course Instance</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Specific Course Instance</em>' container reference.
	 * @see #setSemesterSpecificCourseInstance(Course)
	 * @see tdt4250.coursework.CourseworkPackage#getCourseInstance_SemesterSpecificCourseInstance()
	 * @see tdt4250.coursework.Course#getCourseinstance
	 * @model opposite="courseinstance" required="true" transient="false"
	 * @generated
	 */
	Course getSemesterSpecificCourseInstance();

	/**
	 * Sets the value of the '{@link tdt4250.coursework.CourseInstance#getSemesterSpecificCourseInstance <em>Semester Specific Course Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester Specific Course Instance</em>' container reference.
	 * @see #getSemesterSpecificCourseInstance()
	 * @generated
	 */
	void setSemesterSpecificCourseInstance(Course value);

	/**
	 * Returns the value of the '<em><b>Staff</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.coursework.Staff}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Staff</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff</em>' reference list.
	 * @see tdt4250.coursework.CourseworkPackage#getCourseInstance_Staff()
	 * @model required="true"
	 * @generated
	 */
	EList<Staff> getStaff();

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
