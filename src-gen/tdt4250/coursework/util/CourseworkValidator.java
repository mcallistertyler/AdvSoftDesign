/**
 */
package tdt4250.coursework.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import tdt4250.coursework.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see tdt4250.coursework.CourseworkPackage
 * @generated
 */
public class CourseworkValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CourseworkValidator INSTANCE = new CourseworkValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "tdt4250.coursework";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseworkValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return CourseworkPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case CourseworkPackage.COURSE:
			return validateCourse((Course) value, diagnostics, context);
		case CourseworkPackage.COURSE_INSTANCE:
			return validateCourseInstance((CourseInstance) value, diagnostics, context);
		case CourseworkPackage.ORGANISATION:
			return validateOrganisation((Organisation) value, diagnostics, context);
		case CourseworkPackage.STAFF:
			return validateStaff((Staff) value, diagnostics, context);
		case CourseworkPackage.EVALUATION_FORM:
			return validateEvaluationForm((EvaluationForm) value, diagnostics, context);
		case CourseworkPackage.EXAM:
			return validateExam((Exam) value, diagnostics, context);
		case CourseworkPackage.ASSIGNMENT:
			return validateAssignment((Assignment) value, diagnostics, context);
		case CourseworkPackage.PROJECT:
			return validateProject((Project) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(course, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseInstance(CourseInstance courseInstance, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(courseInstance, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(courseInstance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(courseInstance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(courseInstance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(courseInstance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(courseInstance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(courseInstance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(courseInstance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(courseInstance, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCourseInstance_hasCourseCoordinator(courseInstance, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasCourseCoordinator constraint of '<em>Course Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseInstance_hasCourseCoordinator(CourseInstance courseInstance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "hasCourseCoordinator", getObjectLabel(courseInstance, context) },
								new Object[] { courseInstance }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganisation(Organisation organisation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(organisation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaff(Staff staff, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staff, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvaluationForm(EvaluationForm evaluationForm, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(evaluationForm, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(evaluationForm, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(evaluationForm, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(evaluationForm, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(evaluationForm, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(evaluationForm, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(evaluationForm, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(evaluationForm, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(evaluationForm, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEvaluationForm_totalPercentageEqualsOneHundred(evaluationForm, diagnostics, context);
		return result;
	}

	/**
	 * Validates the totalPercentageEqualsOneHundred constraint of '<em>Evaluation Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvaluationForm_totalPercentageEqualsOneHundred(EvaluationForm evaluationForm,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		float totalpercentage = 0;
		if (evaluationForm.getExam() != null) {totalpercentage += evaluationForm.getExam().getPercentage();};
		
		
		for (Project proj:evaluationForm.getProject()) {
			totalpercentage += proj.getPercentage();
		}
		for (Assignment ass:evaluationForm.getAssignment()) {
			totalpercentage += ass.getPercentage();
		}
		
		if (totalpercentage != 1) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "totalPercentageEqualsOneHundred", getObjectLabel(evaluationForm, context) },
						new Object[] { evaluationForm }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExam(Exam exam, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exam, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignment(Assignment assignment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assignment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProject(Project project, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(project, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //CourseworkValidator
