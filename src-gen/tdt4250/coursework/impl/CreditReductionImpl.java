/**
 */
package tdt4250.coursework.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tdt4250.coursework.Course;
import tdt4250.coursework.CourseworkPackage;
import tdt4250.coursework.CreditReduction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Credit Reduction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.coursework.impl.CreditReductionImpl#getCourse <em>Course</em>}</li>
 *   <li>{@link tdt4250.coursework.impl.CreditReductionImpl#getReductionValue <em>Reduction Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreditReductionImpl extends MinimalEObjectImpl.Container implements CreditReduction {
	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected Course course;

	/**
	 * The default value of the '{@link #getReductionValue() <em>Reduction Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReductionValue()
	 * @generated
	 * @ordered
	 */
	protected static final float REDUCTION_VALUE_EDEFAULT = 0.0F;
	/**
	 * The cached value of the '{@link #getReductionValue() <em>Reduction Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReductionValue()
	 * @generated
	 * @ordered
	 */
	protected float reductionValue = REDUCTION_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreditReductionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CourseworkPackage.Literals.CREDIT_REDUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course getCourse() {
		if (course != null && course.eIsProxy()) {
			InternalEObject oldCourse = (InternalEObject) course;
			course = (Course) eResolveProxy(oldCourse);
			if (course != oldCourse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CourseworkPackage.CREDIT_REDUCTION__COURSE, oldCourse, course));
			}
		}
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course basicGetCourse() {
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourse(Course newCourse) {
		Course oldCourse = course;
		course = newCourse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourseworkPackage.CREDIT_REDUCTION__COURSE, oldCourse,
					course));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getReductionValue() {
		return reductionValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReductionValue(float newReductionValue) {
		float oldReductionValue = reductionValue;
		reductionValue = newReductionValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourseworkPackage.CREDIT_REDUCTION__REDUCTION_VALUE,
					oldReductionValue, reductionValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CourseworkPackage.CREDIT_REDUCTION__COURSE:
			if (resolve)
				return getCourse();
			return basicGetCourse();
		case CourseworkPackage.CREDIT_REDUCTION__REDUCTION_VALUE:
			return getReductionValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CourseworkPackage.CREDIT_REDUCTION__COURSE:
			setCourse((Course) newValue);
			return;
		case CourseworkPackage.CREDIT_REDUCTION__REDUCTION_VALUE:
			setReductionValue((Float) newValue);
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
		case CourseworkPackage.CREDIT_REDUCTION__COURSE:
			setCourse((Course) null);
			return;
		case CourseworkPackage.CREDIT_REDUCTION__REDUCTION_VALUE:
			setReductionValue(REDUCTION_VALUE_EDEFAULT);
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
		case CourseworkPackage.CREDIT_REDUCTION__COURSE:
			return course != null;
		case CourseworkPackage.CREDIT_REDUCTION__REDUCTION_VALUE:
			return reductionValue != REDUCTION_VALUE_EDEFAULT;
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
		result.append(" (reductionValue: ");
		result.append(reductionValue);
		result.append(')');
		return result.toString();
	}

} //CreditReductionImpl
