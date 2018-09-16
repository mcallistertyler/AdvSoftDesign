/**
 */
package tdt4250.coursework;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Credit Reduction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.coursework.CreditReduction#getCourse <em>Course</em>}</li>
 *   <li>{@link tdt4250.coursework.CreditReduction#getReductionValue <em>Reduction Value</em>}</li>
 * </ul>
 *
 * @see tdt4250.coursework.CourseworkPackage#getCreditReduction()
 * @model
 * @generated
 */
public interface CreditReduction extends EObject {
	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference.
	 * @see #setCourse(Course)
	 * @see tdt4250.coursework.CourseworkPackage#getCreditReduction_Course()
	 * @model required="true"
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link tdt4250.coursework.CreditReduction#getCourse <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

	/**
	 * Returns the value of the '<em><b>Reduction Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reduction Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reduction Value</em>' attribute.
	 * @see #setReductionValue(float)
	 * @see tdt4250.coursework.CourseworkPackage#getCreditReduction_ReductionValue()
	 * @model
	 * @generated
	 */
	float getReductionValue();

	/**
	 * Sets the value of the '{@link tdt4250.coursework.CreditReduction#getReductionValue <em>Reduction Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reduction Value</em>' attribute.
	 * @see #getReductionValue()
	 * @generated
	 */
	void setReductionValue(float value);

} // CreditReduction
