/**
 */
package tdt4250.coursework.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tdt4250.coursework.CourseworkPackage;
import tdt4250.coursework.Evaluation;
import tdt4250.coursework.EvaluationKinds;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.coursework.impl.EvaluationImpl#getEvaluationKind <em>Evaluation Kind</em>}</li>
 *   <li>{@link tdt4250.coursework.impl.EvaluationImpl#getTotalPercentage <em>Total Percentage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvaluationImpl extends MinimalEObjectImpl.Container implements Evaluation {
	/**
	 * The default value of the '{@link #getEvaluationKind() <em>Evaluation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationKind()
	 * @generated
	 * @ordered
	 */
	protected static final EvaluationKinds EVALUATION_KIND_EDEFAULT = EvaluationKinds.EXAM;

	/**
	 * The cached value of the '{@link #getEvaluationKind() <em>Evaluation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationKind()
	 * @generated
	 * @ordered
	 */
	protected EvaluationKinds evaluationKind = EVALUATION_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalPercentage() <em>Total Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final float TOTAL_PERCENTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTotalPercentage() <em>Total Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalPercentage()
	 * @generated
	 * @ordered
	 */
	protected float totalPercentage = TOTAL_PERCENTAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CourseworkPackage.Literals.EVALUATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationKinds getEvaluationKind() {
		return evaluationKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvaluationKind(EvaluationKinds newEvaluationKind) {
		EvaluationKinds oldEvaluationKind = evaluationKind;
		evaluationKind = newEvaluationKind == null ? EVALUATION_KIND_EDEFAULT : newEvaluationKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourseworkPackage.EVALUATION__EVALUATION_KIND,
					oldEvaluationKind, evaluationKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTotalPercentage() {
		return totalPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalPercentage(float newTotalPercentage) {
		float oldTotalPercentage = totalPercentage;
		totalPercentage = newTotalPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourseworkPackage.EVALUATION__TOTAL_PERCENTAGE,
					oldTotalPercentage, totalPercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CourseworkPackage.EVALUATION__EVALUATION_KIND:
			return getEvaluationKind();
		case CourseworkPackage.EVALUATION__TOTAL_PERCENTAGE:
			return getTotalPercentage();
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
		case CourseworkPackage.EVALUATION__EVALUATION_KIND:
			setEvaluationKind((EvaluationKinds) newValue);
			return;
		case CourseworkPackage.EVALUATION__TOTAL_PERCENTAGE:
			setTotalPercentage((Float) newValue);
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
		case CourseworkPackage.EVALUATION__EVALUATION_KIND:
			setEvaluationKind(EVALUATION_KIND_EDEFAULT);
			return;
		case CourseworkPackage.EVALUATION__TOTAL_PERCENTAGE:
			setTotalPercentage(TOTAL_PERCENTAGE_EDEFAULT);
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
		case CourseworkPackage.EVALUATION__EVALUATION_KIND:
			return evaluationKind != EVALUATION_KIND_EDEFAULT;
		case CourseworkPackage.EVALUATION__TOTAL_PERCENTAGE:
			return totalPercentage != TOTAL_PERCENTAGE_EDEFAULT;
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
		result.append(" (evaluationKind: ");
		result.append(evaluationKind);
		result.append(", totalPercentage: ");
		result.append(totalPercentage);
		result.append(')');
		return result.toString();
	}

} //EvaluationImpl
