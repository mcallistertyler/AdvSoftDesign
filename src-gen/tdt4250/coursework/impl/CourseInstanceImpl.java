/**
 */
package tdt4250.coursework.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import tdt4250.coursework.Course;
import tdt4250.coursework.CourseInstance;
import tdt4250.coursework.CourseworkPackage;
import tdt4250.coursework.EvaluationForm;
import tdt4250.coursework.Role;
import tdt4250.coursework.Timetable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.coursework.impl.CourseInstanceImpl#getSemesterDate <em>Semester Date</em>}</li>
 *   <li>{@link tdt4250.coursework.impl.CourseInstanceImpl#getCourse <em>Course</em>}</li>
 *   <li>{@link tdt4250.coursework.impl.CourseInstanceImpl#getEvaluationform <em>Evaluationform</em>}</li>
 *   <li>{@link tdt4250.coursework.impl.CourseInstanceImpl#getTimetable <em>Timetable</em>}</li>
 *   <li>{@link tdt4250.coursework.impl.CourseInstanceImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseInstanceImpl extends MinimalEObjectImpl.Container implements CourseInstance {
	/**
	 * The default value of the '{@link #getSemesterDate() <em>Semester Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date SEMESTER_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSemesterDate() <em>Semester Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterDate()
	 * @generated
	 * @ordered
	 */
	protected Date semesterDate = SEMESTER_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEvaluationform() <em>Evaluationform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationform()
	 * @generated
	 * @ordered
	 */
	protected EvaluationForm evaluationform;

	/**
	 * The cached value of the '{@link #getTimetable() <em>Timetable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimetable()
	 * @generated
	 * @ordered
	 */
	protected Timetable timetable;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> role;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CourseworkPackage.Literals.COURSE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getSemesterDate() {
		return semesterDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemesterDate(Date newSemesterDate) {
		Date oldSemesterDate = semesterDate;
		semesterDate = newSemesterDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourseworkPackage.COURSE_INSTANCE__SEMESTER_DATE,
					oldSemesterDate, semesterDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course getCourse() {
		if (eContainerFeatureID() != CourseworkPackage.COURSE_INSTANCE__COURSE)
			return null;
		return (Course) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCourse(Course newCourse, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newCourse, CourseworkPackage.COURSE_INSTANCE__COURSE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourse(Course newCourse) {
		if (newCourse != eInternalContainer()
				|| (eContainerFeatureID() != CourseworkPackage.COURSE_INSTANCE__COURSE && newCourse != null)) {
			if (EcoreUtil.isAncestor(this, newCourse))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCourse != null)
				msgs = ((InternalEObject) newCourse).eInverseAdd(this,
						CourseworkPackage.COURSE__SEMESTER_SPECIFIC_COURSE_INSTANCE, Course.class, msgs);
			msgs = basicSetCourse(newCourse, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourseworkPackage.COURSE_INSTANCE__COURSE, newCourse,
					newCourse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timetable getTimetable() {
		return timetable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimetable(Timetable newTimetable, NotificationChain msgs) {
		Timetable oldTimetable = timetable;
		timetable = newTimetable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CourseworkPackage.COURSE_INSTANCE__TIMETABLE, oldTimetable, newTimetable);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimetable(Timetable newTimetable) {
		if (newTimetable != timetable) {
			NotificationChain msgs = null;
			if (timetable != null)
				msgs = ((InternalEObject) timetable).eInverseRemove(this, CourseworkPackage.TIMETABLE__COURSEINSTANCE,
						Timetable.class, msgs);
			if (newTimetable != null)
				msgs = ((InternalEObject) newTimetable).eInverseAdd(this, CourseworkPackage.TIMETABLE__COURSEINSTANCE,
						Timetable.class, msgs);
			msgs = basicSetTimetable(newTimetable, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourseworkPackage.COURSE_INSTANCE__TIMETABLE,
					newTimetable, newTimetable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRole() {
		if (role == null) {
			role = new EObjectResolvingEList<Role>(Role.class, this, CourseworkPackage.COURSE_INSTANCE__ROLE);
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationForm getEvaluationform() {
		return evaluationform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvaluationform(EvaluationForm newEvaluationform, NotificationChain msgs) {
		EvaluationForm oldEvaluationform = evaluationform;
		evaluationform = newEvaluationform;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CourseworkPackage.COURSE_INSTANCE__EVALUATIONFORM, oldEvaluationform, newEvaluationform);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvaluationform(EvaluationForm newEvaluationform) {
		if (newEvaluationform != evaluationform) {
			NotificationChain msgs = null;
			if (evaluationform != null)
				msgs = ((InternalEObject) evaluationform).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CourseworkPackage.COURSE_INSTANCE__EVALUATIONFORM, null, msgs);
			if (newEvaluationform != null)
				msgs = ((InternalEObject) newEvaluationform).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CourseworkPackage.COURSE_INSTANCE__EVALUATIONFORM, null, msgs);
			msgs = basicSetEvaluationform(newEvaluationform, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourseworkPackage.COURSE_INSTANCE__EVALUATIONFORM,
					newEvaluationform, newEvaluationform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CourseworkPackage.COURSE_INSTANCE__COURSE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetCourse((Course) otherEnd, msgs);
		case CourseworkPackage.COURSE_INSTANCE__TIMETABLE:
			if (timetable != null)
				msgs = ((InternalEObject) timetable).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CourseworkPackage.COURSE_INSTANCE__TIMETABLE, null, msgs);
			return basicSetTimetable((Timetable) otherEnd, msgs);
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
		case CourseworkPackage.COURSE_INSTANCE__COURSE:
			return basicSetCourse(null, msgs);
		case CourseworkPackage.COURSE_INSTANCE__EVALUATIONFORM:
			return basicSetEvaluationform(null, msgs);
		case CourseworkPackage.COURSE_INSTANCE__TIMETABLE:
			return basicSetTimetable(null, msgs);
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
		case CourseworkPackage.COURSE_INSTANCE__COURSE:
			return eInternalContainer().eInverseRemove(this,
					CourseworkPackage.COURSE__SEMESTER_SPECIFIC_COURSE_INSTANCE, Course.class, msgs);
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
		case CourseworkPackage.COURSE_INSTANCE__SEMESTER_DATE:
			return getSemesterDate();
		case CourseworkPackage.COURSE_INSTANCE__COURSE:
			return getCourse();
		case CourseworkPackage.COURSE_INSTANCE__EVALUATIONFORM:
			return getEvaluationform();
		case CourseworkPackage.COURSE_INSTANCE__TIMETABLE:
			return getTimetable();
		case CourseworkPackage.COURSE_INSTANCE__ROLE:
			return getRole();
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
		case CourseworkPackage.COURSE_INSTANCE__SEMESTER_DATE:
			setSemesterDate((Date) newValue);
			return;
		case CourseworkPackage.COURSE_INSTANCE__COURSE:
			setCourse((Course) newValue);
			return;
		case CourseworkPackage.COURSE_INSTANCE__EVALUATIONFORM:
			setEvaluationform((EvaluationForm) newValue);
			return;
		case CourseworkPackage.COURSE_INSTANCE__TIMETABLE:
			setTimetable((Timetable) newValue);
			return;
		case CourseworkPackage.COURSE_INSTANCE__ROLE:
			getRole().clear();
			getRole().addAll((Collection<? extends Role>) newValue);
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
		case CourseworkPackage.COURSE_INSTANCE__SEMESTER_DATE:
			setSemesterDate(SEMESTER_DATE_EDEFAULT);
			return;
		case CourseworkPackage.COURSE_INSTANCE__COURSE:
			setCourse((Course) null);
			return;
		case CourseworkPackage.COURSE_INSTANCE__EVALUATIONFORM:
			setEvaluationform((EvaluationForm) null);
			return;
		case CourseworkPackage.COURSE_INSTANCE__TIMETABLE:
			setTimetable((Timetable) null);
			return;
		case CourseworkPackage.COURSE_INSTANCE__ROLE:
			getRole().clear();
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
		case CourseworkPackage.COURSE_INSTANCE__SEMESTER_DATE:
			return SEMESTER_DATE_EDEFAULT == null ? semesterDate != null : !SEMESTER_DATE_EDEFAULT.equals(semesterDate);
		case CourseworkPackage.COURSE_INSTANCE__COURSE:
			return getCourse() != null;
		case CourseworkPackage.COURSE_INSTANCE__EVALUATIONFORM:
			return evaluationform != null;
		case CourseworkPackage.COURSE_INSTANCE__TIMETABLE:
			return timetable != null;
		case CourseworkPackage.COURSE_INSTANCE__ROLE:
			return role != null && !role.isEmpty();
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
		result.append(" (semesterDate: ");
		result.append(semesterDate);
		result.append(')');
		return result.toString();
	}

} //CourseInstanceImpl
