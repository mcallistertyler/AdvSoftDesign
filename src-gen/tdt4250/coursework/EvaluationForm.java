/**
 */
package tdt4250.coursework;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.coursework.EvaluationForm#getEvaluation <em>Evaluation</em>}</li>
 * </ul>
 *
 * @see tdt4250.coursework.CourseworkPackage#getEvaluationForm()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='totalPercentageEqualsOneHundred'"
 * @generated
 */
public interface EvaluationForm extends EObject {
	/**
	 * Returns the value of the '<em><b>Evaluation</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.coursework.Evaluation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation</em>' containment reference list.
	 * @see tdt4250.coursework.CourseworkPackage#getEvaluationForm_Evaluation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Evaluation> getEvaluation();

} // EvaluationForm
