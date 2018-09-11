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
 *   <li>{@link tdt4250.coursework.EvaluationForm#getProject <em>Project</em>}</li>
 *   <li>{@link tdt4250.coursework.EvaluationForm#getExam <em>Exam</em>}</li>
 *   <li>{@link tdt4250.coursework.EvaluationForm#getAssignment <em>Assignment</em>}</li>
 * </ul>
 *
 * @see tdt4250.coursework.CourseworkPackage#getEvaluationForm()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='totalPercentageEqualsOneHundred'"
 * @generated
 */
public interface EvaluationForm extends EObject {
	/**
	 * Returns the value of the '<em><b>Project</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.coursework.Project}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' containment reference list.
	 * @see tdt4250.coursework.CourseworkPackage#getEvaluationForm_Project()
	 * @model containment="true"
	 * @generated
	 */
	EList<Project> getProject();

	/**
	 * Returns the value of the '<em><b>Exam</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exam</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exam</em>' containment reference.
	 * @see #setExam(Exam)
	 * @see tdt4250.coursework.CourseworkPackage#getEvaluationForm_Exam()
	 * @model containment="true"
	 * @generated
	 */
	Exam getExam();

	/**
	 * Sets the value of the '{@link tdt4250.coursework.EvaluationForm#getExam <em>Exam</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exam</em>' containment reference.
	 * @see #getExam()
	 * @generated
	 */
	void setExam(Exam value);

	/**
	 * Returns the value of the '<em><b>Assignment</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.coursework.Assignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment</em>' containment reference list.
	 * @see tdt4250.coursework.CourseworkPackage#getEvaluationForm_Assignment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Assignment> getAssignment();

} // EvaluationForm
