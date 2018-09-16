/**
 */
package tdt4250.coursework;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.coursework.Evaluation#getEvaluationKind <em>Evaluation Kind</em>}</li>
 *   <li>{@link tdt4250.coursework.Evaluation#getTotalPercentage <em>Total Percentage</em>}</li>
 * </ul>
 *
 * @see tdt4250.coursework.CourseworkPackage#getEvaluation()
 * @model
 * @generated
 */
public interface Evaluation extends EObject {
	/**
	 * Returns the value of the '<em><b>Evaluation Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.coursework.EvaluationKinds}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation Kind</em>' attribute.
	 * @see tdt4250.coursework.EvaluationKinds
	 * @see #setEvaluationKind(EvaluationKinds)
	 * @see tdt4250.coursework.CourseworkPackage#getEvaluation_EvaluationKind()
	 * @model required="true"
	 * @generated
	 */
	EvaluationKinds getEvaluationKind();

	/**
	 * Sets the value of the '{@link tdt4250.coursework.Evaluation#getEvaluationKind <em>Evaluation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluation Kind</em>' attribute.
	 * @see tdt4250.coursework.EvaluationKinds
	 * @see #getEvaluationKind()
	 * @generated
	 */
	void setEvaluationKind(EvaluationKinds value);

	/**
	 * Returns the value of the '<em><b>Total Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Percentage</em>' attribute.
	 * @see #setTotalPercentage(float)
	 * @see tdt4250.coursework.CourseworkPackage#getEvaluation_TotalPercentage()
	 * @model
	 * @generated
	 */
	float getTotalPercentage();

	/**
	 * Sets the value of the '{@link tdt4250.coursework.Evaluation#getTotalPercentage <em>Total Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Percentage</em>' attribute.
	 * @see #getTotalPercentage()
	 * @generated
	 */
	void setTotalPercentage(float value);

} // Evaluation
