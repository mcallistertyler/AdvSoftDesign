/**
 */
package tdt4250.coursework;

import java.util.Date;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timetable Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.coursework.TimetableSlot#getRoom <em>Room</em>}</li>
 *   <li>{@link tdt4250.coursework.TimetableSlot#getStudyprogram <em>Studyprogram</em>}</li>
 *   <li>{@link tdt4250.coursework.TimetableSlot#getTimetableSlotKind <em>Timetable Slot Kind</em>}</li>
 *   <li>{@link tdt4250.coursework.TimetableSlot#getDuration <em>Duration</em>}</li>
 *   <li>{@link tdt4250.coursework.TimetableSlot#getDate <em>Date</em>}</li>
 * </ul>
 *
 * @see tdt4250.coursework.CourseworkPackage#getTimetableSlot()
 * @model
 * @generated
 */
public interface TimetableSlot extends EObject {
	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference.
	 * @see #setRoom(Room)
	 * @see tdt4250.coursework.CourseworkPackage#getTimetableSlot_Room()
	 * @model required="true"
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link tdt4250.coursework.TimetableSlot#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

	/**
	 * Returns the value of the '<em><b>Studyprogram</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.coursework.StudyProgram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Studyprogram</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Studyprogram</em>' reference list.
	 * @see tdt4250.coursework.CourseworkPackage#getTimetableSlot_Studyprogram()
	 * @model
	 * @generated
	 */
	EList<StudyProgram> getStudyprogram();

	/**
	 * Returns the value of the '<em><b>Timetable Slot Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.coursework.TimetableSlotKinds}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timetable Slot Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timetable Slot Kind</em>' attribute.
	 * @see tdt4250.coursework.TimetableSlotKinds
	 * @see #setTimetableSlotKind(TimetableSlotKinds)
	 * @see tdt4250.coursework.CourseworkPackage#getTimetableSlot_TimetableSlotKind()
	 * @model required="true"
	 * @generated
	 */
	TimetableSlotKinds getTimetableSlotKind();

	/**
	 * Sets the value of the '{@link tdt4250.coursework.TimetableSlot#getTimetableSlotKind <em>Timetable Slot Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timetable Slot Kind</em>' attribute.
	 * @see tdt4250.coursework.TimetableSlotKinds
	 * @see #getTimetableSlotKind()
	 * @generated
	 */
	void setTimetableSlotKind(TimetableSlotKinds value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(float)
	 * @see tdt4250.coursework.CourseworkPackage#getTimetableSlot_Duration()
	 * @model
	 * @generated
	 */
	float getDuration();

	/**
	 * Sets the value of the '{@link tdt4250.coursework.TimetableSlot#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(float value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see tdt4250.coursework.CourseworkPackage#getTimetableSlot_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link tdt4250.coursework.TimetableSlot#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

} // TimetableSlot
