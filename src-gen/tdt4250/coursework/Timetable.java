/**
 */
package tdt4250.coursework;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timetable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.coursework.Timetable#getLecture <em>Lecture</em>}</li>
 *   <li>{@link tdt4250.coursework.Timetable#getLabHours <em>Lab Hours</em>}</li>
 *   <li>{@link tdt4250.coursework.Timetable#getLectureHours <em>Lecture Hours</em>}</li>
 *   <li>{@link tdt4250.coursework.Timetable#getCourseinstance <em>Courseinstance</em>}</li>
 * </ul>
 *
 * @see tdt4250.coursework.CourseworkPackage#getTimetable()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='maximumScheduledHours'"
 * @generated
 */
public interface Timetable extends EObject {
	/**
	 * Returns the value of the '<em><b>Lecture</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.coursework.TimetableSlot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lecture</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lecture</em>' containment reference list.
	 * @see tdt4250.coursework.CourseworkPackage#getTimetable_Lecture()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimetableSlot> getLecture();

	/**
	 * Returns the value of the '<em><b>Lab Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lab Hours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lab Hours</em>' attribute.
	 * @see #setLabHours(float)
	 * @see tdt4250.coursework.CourseworkPackage#getTimetable_LabHours()
	 * @model
	 * @generated
	 */
	float getLabHours();

	/**
	 * Sets the value of the '{@link tdt4250.coursework.Timetable#getLabHours <em>Lab Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lab Hours</em>' attribute.
	 * @see #getLabHours()
	 * @generated
	 */
	void setLabHours(float value);

	/**
	 * Returns the value of the '<em><b>Lecture Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lecture Hours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lecture Hours</em>' attribute.
	 * @see #setLectureHours(float)
	 * @see tdt4250.coursework.CourseworkPackage#getTimetable_LectureHours()
	 * @model
	 * @generated
	 */
	float getLectureHours();

	/**
	 * Sets the value of the '{@link tdt4250.coursework.Timetable#getLectureHours <em>Lecture Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lecture Hours</em>' attribute.
	 * @see #getLectureHours()
	 * @generated
	 */
	void setLectureHours(float value);

	/**
	 * Returns the value of the '<em><b>Courseinstance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.coursework.CourseInstance#getTimetable <em>Timetable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Courseinstance</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courseinstance</em>' container reference.
	 * @see #setCourseinstance(CourseInstance)
	 * @see tdt4250.coursework.CourseworkPackage#getTimetable_Courseinstance()
	 * @see tdt4250.coursework.CourseInstance#getTimetable
	 * @model opposite="timetable" required="true" transient="false"
	 * @generated
	 */
	CourseInstance getCourseinstance();

	/**
	 * Sets the value of the '{@link tdt4250.coursework.Timetable#getCourseinstance <em>Courseinstance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Courseinstance</em>' container reference.
	 * @see #getCourseinstance()
	 * @generated
	 */
	void setCourseinstance(CourseInstance value);

} // Timetable
