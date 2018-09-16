/**
 */
package tdt4250.coursework.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.coursework.Course;
import tdt4250.coursework.CourseworkPackage;
import tdt4250.coursework.Organisation;
import tdt4250.coursework.Room;
import tdt4250.coursework.StudyProgram;
import tdt4250.coursework.University;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>University</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.coursework.impl.UniversityImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link tdt4250.coursework.impl.UniversityImpl#getCourse <em>Course</em>}</li>
 *   <li>{@link tdt4250.coursework.impl.UniversityImpl#getOrganisation <em>Organisation</em>}</li>
 *   <li>{@link tdt4250.coursework.impl.UniversityImpl#getStudyProgram <em>Study Program</em>}</li>
 *   <li>{@link tdt4250.coursework.impl.UniversityImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniversityImpl extends MinimalEObjectImpl.Container implements University {
	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> room;

	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> course;

	/**
	 * The cached value of the '{@link #getOrganisation() <em>Organisation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisation()
	 * @generated
	 * @ordered
	 */
	protected EList<Organisation> organisation;

	/**
	 * The cached value of the '{@link #getStudyProgram() <em>Study Program</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyProgram()
	 * @generated
	 * @ordered
	 */
	protected EList<StudyProgram> studyProgram;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniversityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CourseworkPackage.Literals.UNIVERSITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getRoom() {
		if (room == null) {
			room = new EObjectContainmentWithInverseEList<Room>(Room.class, this, CourseworkPackage.UNIVERSITY__ROOM,
					CourseworkPackage.ROOM__UNIVERSITY);
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getCourse() {
		if (course == null) {
			course = new EObjectContainmentWithInverseEList<Course>(Course.class, this,
					CourseworkPackage.UNIVERSITY__COURSE, CourseworkPackage.COURSE__UNIVERSITY);
		}
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Organisation> getOrganisation() {
		if (organisation == null) {
			organisation = new EObjectContainmentWithInverseEList<Organisation>(Organisation.class, this,
					CourseworkPackage.UNIVERSITY__ORGANISATION, CourseworkPackage.ORGANISATION__UNIVERSITY);
		}
		return organisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StudyProgram> getStudyProgram() {
		if (studyProgram == null) {
			studyProgram = new EObjectContainmentWithInverseEList<StudyProgram>(StudyProgram.class, this,
					CourseworkPackage.UNIVERSITY__STUDY_PROGRAM, CourseworkPackage.STUDY_PROGRAM__UNIVERSITY);
		}
		return studyProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourseworkPackage.UNIVERSITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CourseworkPackage.UNIVERSITY__ROOM:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRoom()).basicAdd(otherEnd, msgs);
		case CourseworkPackage.UNIVERSITY__COURSE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCourse()).basicAdd(otherEnd, msgs);
		case CourseworkPackage.UNIVERSITY__ORGANISATION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOrganisation()).basicAdd(otherEnd, msgs);
		case CourseworkPackage.UNIVERSITY__STUDY_PROGRAM:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getStudyProgram()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CourseworkPackage.UNIVERSITY__ROOM:
			return ((InternalEList<?>) getRoom()).basicRemove(otherEnd, msgs);
		case CourseworkPackage.UNIVERSITY__COURSE:
			return ((InternalEList<?>) getCourse()).basicRemove(otherEnd, msgs);
		case CourseworkPackage.UNIVERSITY__ORGANISATION:
			return ((InternalEList<?>) getOrganisation()).basicRemove(otherEnd, msgs);
		case CourseworkPackage.UNIVERSITY__STUDY_PROGRAM:
			return ((InternalEList<?>) getStudyProgram()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CourseworkPackage.UNIVERSITY__ROOM:
			return getRoom();
		case CourseworkPackage.UNIVERSITY__COURSE:
			return getCourse();
		case CourseworkPackage.UNIVERSITY__ORGANISATION:
			return getOrganisation();
		case CourseworkPackage.UNIVERSITY__STUDY_PROGRAM:
			return getStudyProgram();
		case CourseworkPackage.UNIVERSITY__NAME:
			return getName();
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
		case CourseworkPackage.UNIVERSITY__ROOM:
			getRoom().clear();
			getRoom().addAll((Collection<? extends Room>) newValue);
			return;
		case CourseworkPackage.UNIVERSITY__COURSE:
			getCourse().clear();
			getCourse().addAll((Collection<? extends Course>) newValue);
			return;
		case CourseworkPackage.UNIVERSITY__ORGANISATION:
			getOrganisation().clear();
			getOrganisation().addAll((Collection<? extends Organisation>) newValue);
			return;
		case CourseworkPackage.UNIVERSITY__STUDY_PROGRAM:
			getStudyProgram().clear();
			getStudyProgram().addAll((Collection<? extends StudyProgram>) newValue);
			return;
		case CourseworkPackage.UNIVERSITY__NAME:
			setName((String) newValue);
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
		case CourseworkPackage.UNIVERSITY__ROOM:
			getRoom().clear();
			return;
		case CourseworkPackage.UNIVERSITY__COURSE:
			getCourse().clear();
			return;
		case CourseworkPackage.UNIVERSITY__ORGANISATION:
			getOrganisation().clear();
			return;
		case CourseworkPackage.UNIVERSITY__STUDY_PROGRAM:
			getStudyProgram().clear();
			return;
		case CourseworkPackage.UNIVERSITY__NAME:
			setName(NAME_EDEFAULT);
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
		case CourseworkPackage.UNIVERSITY__ROOM:
			return room != null && !room.isEmpty();
		case CourseworkPackage.UNIVERSITY__COURSE:
			return course != null && !course.isEmpty();
		case CourseworkPackage.UNIVERSITY__ORGANISATION:
			return organisation != null && !organisation.isEmpty();
		case CourseworkPackage.UNIVERSITY__STUDY_PROGRAM:
			return studyProgram != null && !studyProgram.isEmpty();
		case CourseworkPackage.UNIVERSITY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //UniversityImpl
