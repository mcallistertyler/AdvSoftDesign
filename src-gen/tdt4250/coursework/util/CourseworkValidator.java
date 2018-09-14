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
		case CourseworkPackage.PERSON:
			return validatePerson((Person) value, diagnostics, context);
		case CourseworkPackage.EVALUATION_FORM:
			return validateEvaluationForm((EvaluationForm) value, diagnostics, context);
		case CourseworkPackage.TIMETABLE:
			return validateTimetable((Timetable) value, diagnostics, context);
		case CourseworkPackage.STUDY_PROGRAM:
			return validateStudyProgram((StudyProgram) value, diagnostics, context);
		case CourseworkPackage.TIMETABLE_SLOT:
			return validateTimetableSlot((TimetableSlot) value, diagnostics, context);
		case CourseworkPackage.ROOM:
			return validateRoom((Room) value, diagnostics, context);
		case CourseworkPackage.EVALUATION:
			return validateEvaluation((Evaluation) value, diagnostics, context);
		case CourseworkPackage.ROLE:
			return validateRole((Role) value, diagnostics, context);
		case CourseworkPackage.CREDIT_REDUCTION:
			return validateCreditReduction((CreditReduction) value, diagnostics, context);
		case CourseworkPackage.UNIVERSITY:
			return validateUniversity((University) value, diagnostics, context);
		case CourseworkPackage.EVALUATION_KINDS:
			return validateEvaluationKinds((EvaluationKinds) value, diagnostics, context);
		case CourseworkPackage.TIMETABLE_SLOT_KINDS:
			return validateTimetableSlotKinds((TimetableSlotKinds) value, diagnostics, context);
		case CourseworkPackage.ROLE_KINDS:
			return validateRoleKinds((RoleKinds) value, diagnostics, context);
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
	 * @generated NOT
	 */
	public boolean validateCourseInstance_hasCourseCoordinator(CourseInstance courseInstance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		boolean bool = false;
		for (Role role : courseInstance.getRole()) {
			bool = bool || role.getRoleKind() == RoleKinds.getByName("CourseCoordinator");
		}
		if (bool) {
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
	public boolean validatePerson(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(person, diagnostics, context);
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
	 * @generated NOT
	 */
	public boolean validateEvaluationForm_totalPercentageEqualsOneHundred(EvaluationForm evaluationForm,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		float totalperc = 0;
		for (Evaluation eval : evaluationForm.getEvaluation()) {
			totalperc += eval.getTotalPercentage();
		}
		if (totalperc != 1) {
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
	public boolean validateTimetable(Timetable timetable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timetable, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(timetable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(timetable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(timetable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(timetable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(timetable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(timetable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(timetable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(timetable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTimetable_maximumScheduledHours(timetable, diagnostics, context);
		return result;
	}

	/**
	 * Validates the maximumScheduledHours constraint of '<em>Timetable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTimetable_maximumScheduledHours(Timetable timetable, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		boolean bool = true;
		for (StudyProgram program : timetable.getCourseinstance().getCourse().getStudyprogram()) {
			float nbLect = timetable.getLectureHours();
			float nbLab = timetable.getLabHours();
			for (Course course : program.getCourse()) {
				if (course.equals(timetable.getCourseinstance().getCourse())) {
					nbLect = timetable.getLectureHours();
					nbLab = timetable.getLabHours();
					for (TimetableSlot slot : timetable.getLecture()) {
						if (slot.getTimetableSlotKind() == TimetableSlotKinds.getByName("Lecture")
								&& slot.getStudyprogram().contains(program)) {
							nbLect -= slot.getDuration();
						} else if (slot.getTimetableSlotKind() == TimetableSlotKinds.getByName("Lab")
								&& slot.getStudyprogram().contains(program)) {
							nbLab -= slot.getDuration();
						}
					}
				}
			}
			bool = (bool && nbLect == 0 && nbLab == 0);
		}

		if (!bool) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "maximumScheduledHours", getObjectLabel(timetable, context) },
								new Object[] { timetable }, context));
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
	public boolean validateStudyProgram(StudyProgram studyProgram, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(studyProgram, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimetableSlot(TimetableSlot timetableSlot, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timetableSlot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoom(Room room, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(room, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvaluation(Evaluation evaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evaluation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRole(Role role, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(role, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreditReduction(CreditReduction creditReduction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(creditReduction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniversity(University university, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(university, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvaluationKinds(EvaluationKinds evaluationKinds, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimetableSlotKinds(TimetableSlotKinds timetableSlotKinds, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleKinds(RoleKinds roleKinds, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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
