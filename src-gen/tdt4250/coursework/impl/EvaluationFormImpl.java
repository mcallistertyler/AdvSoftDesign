/**
 */
package tdt4250.coursework.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import tdt4250.coursework.CourseworkPackage;
import tdt4250.coursework.Evaluation;
import tdt4250.coursework.EvaluationForm;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.coursework.impl.EvaluationFormImpl#getEvaluation <em>Evaluation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvaluationFormImpl extends MinimalEObjectImpl.Container implements EvaluationForm {
	/**
	 * The cached value of the '{@link #getEvaluation() <em>Evaluation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluation()
	 * @generated
	 * @ordered
	 */
	protected EList<Evaluation> evaluation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluationFormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CourseworkPackage.Literals.EVALUATION_FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Evaluation> getEvaluation() {
		if (evaluation == null) {
			evaluation = new EObjectResolvingEList<Evaluation>(Evaluation.class, this,
					CourseworkPackage.EVALUATION_FORM__EVALUATION);
		}
		return evaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CourseworkPackage.EVALUATION_FORM__EVALUATION:
			return getEvaluation();
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
		case CourseworkPackage.EVALUATION_FORM__EVALUATION:
			getEvaluation().clear();
			getEvaluation().addAll((Collection<? extends Evaluation>) newValue);
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
		case CourseworkPackage.EVALUATION_FORM__EVALUATION:
			getEvaluation().clear();
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
		case CourseworkPackage.EVALUATION_FORM__EVALUATION:
			return evaluation != null && !evaluation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EvaluationFormImpl
