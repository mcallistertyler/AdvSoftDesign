/**
 */
package tdt4250.coursework.impl;

import java.util.Collection;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import tdt4250.coursework.CourseworkPackage;
import tdt4250.coursework.Room;
import tdt4250.coursework.StudyProgram;
import tdt4250.coursework.TimetableSlot;
import tdt4250.coursework.TimetableSlotKinds;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timetable Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.coursework.impl.TimetableSlotImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link tdt4250.coursework.impl.TimetableSlotImpl#getStudyprogram <em>Studyprogram</em>}</li>
 *   <li>{@link tdt4250.coursework.impl.TimetableSlotImpl#getTimetableSlotKind <em>Timetable Slot Kind</em>}</li>
 *   <li>{@link tdt4250.coursework.impl.TimetableSlotImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link tdt4250.coursework.impl.TimetableSlotImpl#getDate <em>Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimetableSlotImpl extends MinimalEObjectImpl.Container implements TimetableSlot {
	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected Room room;

	/**
	 * The cached value of the '{@link #getStudyprogram() <em>Studyprogram</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyprogram()
	 * @generated
	 * @ordered
	 */
	protected EList<StudyProgram> studyprogram;

	/**
	 * The default value of the '{@link #getTimetableSlotKind() <em>Timetable Slot Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimetableSlotKind()
	 * @generated
	 * @ordered
	 */
	protected static final TimetableSlotKinds TIMETABLE_SLOT_KIND_EDEFAULT = TimetableSlotKinds.LAB;

	/**
	 * The cached value of the '{@link #getTimetableSlotKind() <em>Timetable Slot Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimetableSlotKind()
	 * @generated
	 * @ordered
	 */
	protected TimetableSlotKinds timetableSlotKind = TIMETABLE_SLOT_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final float DURATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected float duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimetableSlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CourseworkPackage.Literals.TIMETABLE_SLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getRoom() {
		if (room != null && room.eIsProxy()) {
			InternalEObject oldRoom = (InternalEObject) room;
			room = (Room) eResolveProxy(oldRoom);
			if (room != oldRoom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CourseworkPackage.TIMETABLE_SLOT__ROOM,
							oldRoom, room));
			}
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetRoom() {
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoom(Room newRoom) {
		Room oldRoom = room;
		room = newRoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourseworkPackage.TIMETABLE_SLOT__ROOM, oldRoom,
					room));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StudyProgram> getStudyprogram() {
		if (studyprogram == null) {
			studyprogram = new EObjectResolvingEList<StudyProgram>(StudyProgram.class, this,
					CourseworkPackage.TIMETABLE_SLOT__STUDYPROGRAM);
		}
		return studyprogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimetableSlotKinds getTimetableSlotKind() {
		return timetableSlotKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimetableSlotKind(TimetableSlotKinds newTimetableSlotKind) {
		TimetableSlotKinds oldTimetableSlotKind = timetableSlotKind;
		timetableSlotKind = newTimetableSlotKind == null ? TIMETABLE_SLOT_KIND_EDEFAULT : newTimetableSlotKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourseworkPackage.TIMETABLE_SLOT__TIMETABLE_SLOT_KIND,
					oldTimetableSlotKind, timetableSlotKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(float newDuration) {
		float oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourseworkPackage.TIMETABLE_SLOT__DURATION,
					oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourseworkPackage.TIMETABLE_SLOT__DATE, oldDate,
					date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CourseworkPackage.TIMETABLE_SLOT__ROOM:
			if (resolve)
				return getRoom();
			return basicGetRoom();
		case CourseworkPackage.TIMETABLE_SLOT__STUDYPROGRAM:
			return getStudyprogram();
		case CourseworkPackage.TIMETABLE_SLOT__TIMETABLE_SLOT_KIND:
			return getTimetableSlotKind();
		case CourseworkPackage.TIMETABLE_SLOT__DURATION:
			return getDuration();
		case CourseworkPackage.TIMETABLE_SLOT__DATE:
			return getDate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CourseworkPackage.TIMETABLE_SLOT__ROOM:
			setRoom((Room) newValue);
			return;
		case CourseworkPackage.TIMETABLE_SLOT__STUDYPROGRAM:
			getStudyprogram().clear();
			getStudyprogram().addAll((Collection<? extends StudyProgram>) newValue);
			return;
		case CourseworkPackage.TIMETABLE_SLOT__TIMETABLE_SLOT_KIND:
			setTimetableSlotKind((TimetableSlotKinds) newValue);
			return;
		case CourseworkPackage.TIMETABLE_SLOT__DURATION:
			setDuration((Float) newValue);
			return;
		case CourseworkPackage.TIMETABLE_SLOT__DATE:
			setDate((Date) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CourseworkPackage.TIMETABLE_SLOT__ROOM:
			setRoom((Room) null);
			return;
		case CourseworkPackage.TIMETABLE_SLOT__STUDYPROGRAM:
			getStudyprogram().clear();
			return;
		case CourseworkPackage.TIMETABLE_SLOT__TIMETABLE_SLOT_KIND:
			setTimetableSlotKind(TIMETABLE_SLOT_KIND_EDEFAULT);
			return;
		case CourseworkPackage.TIMETABLE_SLOT__DURATION:
			setDuration(DURATION_EDEFAULT);
			return;
		case CourseworkPackage.TIMETABLE_SLOT__DATE:
			setDate(DATE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CourseworkPackage.TIMETABLE_SLOT__ROOM:
			return room != null;
		case CourseworkPackage.TIMETABLE_SLOT__STUDYPROGRAM:
			return studyprogram != null && !studyprogram.isEmpty();
		case CourseworkPackage.TIMETABLE_SLOT__TIMETABLE_SLOT_KIND:
			return timetableSlotKind != TIMETABLE_SLOT_KIND_EDEFAULT;
		case CourseworkPackage.TIMETABLE_SLOT__DURATION:
			return duration != DURATION_EDEFAULT;
		case CourseworkPackage.TIMETABLE_SLOT__DATE:
			return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (TimetableSlotKind: ");
		result.append(timetableSlotKind);
		result.append(", duration: ");
		result.append(duration);
		result.append(", date: ");
		result.append(date);
		result.append(')');
		return result.toString();
	}

} //TimetableSlotImpl
