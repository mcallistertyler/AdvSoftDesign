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
import tdt4250.coursework.Staff;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.coursework.impl.CourseInstanceImpl#getSemesterDate <em>Semester Date</em>}</li>
 *   <li>{@link tdt4250.coursework.impl.CourseInstanceImpl#getTimetable <em>Timetable</em>}</li>
 *   <li>{@link tdt4250.coursework.impl.CourseInstanceImpl#getSemesterSpecificCourseInstance <em>Semester Specific Course Instance</em>}</li>
 *   <li>{@link tdt4250.coursework.impl.CourseInstanceImpl#getStaff <em>Staff</em>}</li>
 *   <li>{@link tdt4250.coursework.impl.CourseInstanceImpl#getEvaluationform <em>Evaluationform</em>}</li>
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
	 * The default value of the '{@link #getTimetable() <em>Timetable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimetable()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMETABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimetable() <em>Timetable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimetable()
	 * @generated
	 * @ordered
	 */
	protected String timetable = TIMETABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStaff() <em>Staff</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaff()
	 * @generated
	 * @ordered
	 */
	protected EList<Staff> staff;

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
	public String getTimetable() {
		return timetable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimetable(String newTimetable) {
		String oldTimetable = timetable;
		timetable = newTimetable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourseworkPackage.COURSE_INSTANCE__TIMETABLE,
					oldTimetable, timetable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course getSemesterSpecificCourseInstance() {
		if (eContainerFeatureID() != CourseworkPackage.COURSE_INSTANCE__SEMESTER_SPECIFIC_COURSE_INSTANCE)
			return null;
		return (Course) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemesterSpecificCourseInstance(Course newSemesterSpecificCourseInstance,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSemesterSpecificCourseInstance,
				CourseworkPackage.COURSE_INSTANCE__SEMESTER_SPECIFIC_COURSE_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemesterSpecificCourseInstance(Course newSemesterSpecificCourseInstance) {
		if (newSemesterSpecificCourseInstance != eInternalContainer()
				|| (eContainerFeatureID() != CourseworkPackage.COURSE_INSTANCE__SEMESTER_SPECIFIC_COURSE_INSTANCE
						&& newSemesterSpecificCourseInstance != null)) {
			if (EcoreUtil.isAncestor(this, newSemesterSpecificCourseInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSemesterSpecificCourseInstance != null)
				msgs = ((InternalEObject) newSemesterSpecificCourseInstance).eInverseAdd(this,
						CourseworkPackage.COURSE__COURSEINSTANCE, Course.class, msgs);
			msgs = basicSetSemesterSpecificCourseInstance(newSemesterSpecificCourseInstance, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CourseworkPackage.COURSE_INSTANCE__SEMESTER_SPECIFIC_COURSE_INSTANCE,
					newSemesterSpecificCourseInstance, newSemesterSpecificCourseInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Staff> getStaff() {
		if (staff == null) {
			staff = new EObjectResolvingEList<Staff>(Staff.class, this, CourseworkPackage.COURSE_INSTANCE__STAFF);
		}
		return staff;
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
		case CourseworkPackage.COURSE_INSTANCE__SEMESTER_SPECIFIC_COURSE_INSTANCE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetSemesterSpecificCourseInstance((Course) otherEnd, msgs);
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
		case CourseworkPackage.COURSE_INSTANCE__SEMESTER_SPECIFIC_COURSE_INSTANCE:
			return basicSetSemesterSpecificCourseInstance(null, msgs);
		case CourseworkPackage.COURSE_INSTANCE__EVALUATIONFORM:
			return basicSetEvaluationform(null, msgs);
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
		case CourseworkPackage.COURSE_INSTANCE__SEMESTER_SPECIFIC_COURSE_INSTANCE:
			return eInternalContainer().eInverseRemove(this, CourseworkPackage.COURSE__COURSEINSTANCE, Course.class,
					msgs);
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
		case CourseworkPackage.COURSE_INSTANCE__TIMETABLE:
			return getTimetable();
		case CourseworkPackage.COURSE_INSTANCE__SEMESTER_SPECIFIC_COURSE_INSTANCE:
			return getSemesterSpecificCourseInstance();
		case CourseworkPackage.COURSE_INSTANCE__STAFF:
			return getStaff();
		case CourseworkPackage.COURSE_INSTANCE__EVALUATIONFORM:
			return getEvaluationform();
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
		case CourseworkPackage.COURSE_INSTANCE__TIMETABLE:
			setTimetable((String) newValue);
			return;
		case CourseworkPackage.COURSE_INSTANCE__SEMESTER_SPECIFIC_COURSE_INSTANCE:
			setSemesterSpecificCourseInstance((Course) newValue);
			return;
		case CourseworkPackage.COURSE_INSTANCE__STAFF:
			getStaff().clear();
			getStaff().addAll((Collection<? extends Staff>) newValue);
			return;
		case CourseworkPackage.COURSE_INSTANCE__EVALUATIONFORM:
			setEvaluationform((EvaluationForm) newValue);
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
		case CourseworkPackage.COURSE_INSTANCE__TIMETABLE:
			setTimetable(TIMETABLE_EDEFAULT);
			return;
		case CourseworkPackage.COURSE_INSTANCE__SEMESTER_SPECIFIC_COURSE_INSTANCE:
			setSemesterSpecificCourseInstance((Course) null);
			return;
		case CourseworkPackage.COURSE_INSTANCE__STAFF:
			getStaff().clear();
			return;
		case CourseworkPackage.COURSE_INSTANCE__EVALUATIONFORM:
			setEvaluationform((EvaluationForm) null);
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
		case CourseworkPackage.COURSE_INSTANCE__TIMETABLE:
			return TIMETABLE_EDEFAULT == null ? timetable != null : !TIMETABLE_EDEFAULT.equals(timetable);
		case CourseworkPackage.COURSE_INSTANCE__SEMESTER_SPECIFIC_COURSE_INSTANCE:
			return getSemesterSpecificCourseInstance() != null;
		case CourseworkPackage.COURSE_INSTANCE__STAFF:
			return staff != null && !staff.isEmpty();
		case CourseworkPackage.COURSE_INSTANCE__EVALUATIONFORM:
			return evaluationform != null;
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
		result.append(", timetable: ");
		result.append(timetable);
		result.append(')');
		return result.toString();
	}

} //CourseInstanceImpl
