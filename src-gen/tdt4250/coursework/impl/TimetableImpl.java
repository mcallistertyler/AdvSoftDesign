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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.coursework.CourseInstance;
import tdt4250.coursework.CourseworkPackage;
import tdt4250.coursework.Timetable;
import tdt4250.coursework.TimetableSlot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timetable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.coursework.impl.TimetableImpl#getLecture <em>Lecture</em>}</li>
 *   <li>{@link tdt4250.coursework.impl.TimetableImpl#getLabHours <em>Lab Hours</em>}</li>
 *   <li>{@link tdt4250.coursework.impl.TimetableImpl#getLectureHours <em>Lecture Hours</em>}</li>
 *   <li>{@link tdt4250.coursework.impl.TimetableImpl#getCourseinstance <em>Courseinstance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimetableImpl extends MinimalEObjectImpl.Container implements Timetable {
	/**
	 * The cached value of the '{@link #getLecture() <em>Lecture</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLecture()
	 * @generated
	 * @ordered
	 */
	protected EList<TimetableSlot> lecture;

	/**
	 * The default value of the '{@link #getLabHours() <em>Lab Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabHours()
	 * @generated
	 * @ordered
	 */
	protected static final float LAB_HOURS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLabHours() <em>Lab Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabHours()
	 * @generated
	 * @ordered
	 */
	protected float labHours = LAB_HOURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLectureHours() <em>Lecture Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLectureHours()
	 * @generated
	 * @ordered
	 */
	protected static final float LECTURE_HOURS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLectureHours() <em>Lecture Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLectureHours()
	 * @generated
	 * @ordered
	 */
	protected float lectureHours = LECTURE_HOURS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimetableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CourseworkPackage.Literals.TIMETABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimetableSlot> getLecture() {
		if (lecture == null) {
			lecture = new EObjectContainmentEList<TimetableSlot>(TimetableSlot.class, this,
					CourseworkPackage.TIMETABLE__LECTURE);
		}
		return lecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLabHours() {
		return labHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabHours(float newLabHours) {
		float oldLabHours = labHours;
		labHours = newLabHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourseworkPackage.TIMETABLE__LAB_HOURS, oldLabHours,
					labHours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLectureHours() {
		return lectureHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLectureHours(float newLectureHours) {
		float oldLectureHours = lectureHours;
		lectureHours = newLectureHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourseworkPackage.TIMETABLE__LECTURE_HOURS,
					oldLectureHours, lectureHours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseInstance getCourseinstance() {
		if (eContainerFeatureID() != CourseworkPackage.TIMETABLE__COURSEINSTANCE)
			return null;
		return (CourseInstance) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCourseinstance(CourseInstance newCourseinstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newCourseinstance, CourseworkPackage.TIMETABLE__COURSEINSTANCE,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourseinstance(CourseInstance newCourseinstance) {
		if (newCourseinstance != eInternalContainer()
				|| (eContainerFeatureID() != CourseworkPackage.TIMETABLE__COURSEINSTANCE
						&& newCourseinstance != null)) {
			if (EcoreUtil.isAncestor(this, newCourseinstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCourseinstance != null)
				msgs = ((InternalEObject) newCourseinstance).eInverseAdd(this,
						CourseworkPackage.COURSE_INSTANCE__TIMETABLE, CourseInstance.class, msgs);
			msgs = basicSetCourseinstance(newCourseinstance, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourseworkPackage.TIMETABLE__COURSEINSTANCE,
					newCourseinstance, newCourseinstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CourseworkPackage.TIMETABLE__COURSEINSTANCE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetCourseinstance((CourseInstance) otherEnd, msgs);
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
		case CourseworkPackage.TIMETABLE__LECTURE:
			return ((InternalEList<?>) getLecture()).basicRemove(otherEnd, msgs);
		case CourseworkPackage.TIMETABLE__COURSEINSTANCE:
			return basicSetCourseinstance(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case CourseworkPackage.TIMETABLE__COURSEINSTANCE:
			return eInternalContainer().eInverseRemove(this, CourseworkPackage.COURSE_INSTANCE__TIMETABLE,
					CourseInstance.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CourseworkPackage.TIMETABLE__LECTURE:
			return getLecture();
		case CourseworkPackage.TIMETABLE__LAB_HOURS:
			return getLabHours();
		case CourseworkPackage.TIMETABLE__LECTURE_HOURS:
			return getLectureHours();
		case CourseworkPackage.TIMETABLE__COURSEINSTANCE:
			return getCourseinstance();
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
		case CourseworkPackage.TIMETABLE__LECTURE:
			getLecture().clear();
			getLecture().addAll((Collection<? extends TimetableSlot>) newValue);
			return;
		case CourseworkPackage.TIMETABLE__LAB_HOURS:
			setLabHours((Float) newValue);
			return;
		case CourseworkPackage.TIMETABLE__LECTURE_HOURS:
			setLectureHours((Float) newValue);
			return;
		case CourseworkPackage.TIMETABLE__COURSEINSTANCE:
			setCourseinstance((CourseInstance) newValue);
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
		case CourseworkPackage.TIMETABLE__LECTURE:
			getLecture().clear();
			return;
		case CourseworkPackage.TIMETABLE__LAB_HOURS:
			setLabHours(LAB_HOURS_EDEFAULT);
			return;
		case CourseworkPackage.TIMETABLE__LECTURE_HOURS:
			setLectureHours(LECTURE_HOURS_EDEFAULT);
			return;
		case CourseworkPackage.TIMETABLE__COURSEINSTANCE:
			setCourseinstance((CourseInstance) null);
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
		case CourseworkPackage.TIMETABLE__LECTURE:
			return lecture != null && !lecture.isEmpty();
		case CourseworkPackage.TIMETABLE__LAB_HOURS:
			return labHours != LAB_HOURS_EDEFAULT;
		case CourseworkPackage.TIMETABLE__LECTURE_HOURS:
			return lectureHours != LECTURE_HOURS_EDEFAULT;
		case CourseworkPackage.TIMETABLE__COURSEINSTANCE:
			return getCourseinstance() != null;
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
		result.append(" (labHours: ");
		result.append(labHours);
		result.append(", lectureHours: ");
		result.append(lectureHours);
		result.append(')');
		return result.toString();
	}

} //TimetableImpl
