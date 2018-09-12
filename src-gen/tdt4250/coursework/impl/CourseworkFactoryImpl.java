/**
 */
package tdt4250.coursework.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tdt4250.coursework.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CourseworkFactoryImpl extends EFactoryImpl implements CourseworkFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CourseworkFactory init() {
		try {
			CourseworkFactory theCourseworkFactory = (CourseworkFactory) EPackage.Registry.INSTANCE
					.getEFactory(CourseworkPackage.eNS_URI);
			if (theCourseworkFactory != null) {
				return theCourseworkFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CourseworkFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseworkFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CourseworkPackage.COURSE:
			return createCourse();
		case CourseworkPackage.COURSE_INSTANCE:
			return createCourseInstance();
		case CourseworkPackage.ORGANISATION:
			return createOrganisation();
		case CourseworkPackage.PERSON:
			return createPerson();
		case CourseworkPackage.EVALUATION_FORM:
			return createEvaluationForm();
		case CourseworkPackage.TIMETABLE:
			return createTimetable();
		case CourseworkPackage.STUDY_PROGRAM:
			return createStudyProgram();
		case CourseworkPackage.TIMETABLE_SLOT:
			return createTimetableSlot();
		case CourseworkPackage.ROOM:
			return createRoom();
		case CourseworkPackage.EVALUATION:
			return createEvaluation();
		case CourseworkPackage.ROLE:
			return createRole();
		case CourseworkPackage.CREDIT_REDUCTION:
			return createCreditReduction();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case CourseworkPackage.EVALUATION_KINDS:
			return createEvaluationKindsFromString(eDataType, initialValue);
		case CourseworkPackage.TIMETABLE_SLOT_KINDS:
			return createTimetableSlotKindsFromString(eDataType, initialValue);
		case CourseworkPackage.ROLE_KINDS:
			return createRoleKindsFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case CourseworkPackage.EVALUATION_KINDS:
			return convertEvaluationKindsToString(eDataType, instanceValue);
		case CourseworkPackage.TIMETABLE_SLOT_KINDS:
			return convertTimetableSlotKindsToString(eDataType, instanceValue);
		case CourseworkPackage.ROLE_KINDS:
			return convertRoleKindsToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course createCourse() {
		CourseImpl course = new CourseImpl();
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseInstance createCourseInstance() {
		CourseInstanceImpl courseInstance = new CourseInstanceImpl();
		return courseInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organisation createOrganisation() {
		OrganisationImpl organisation = new OrganisationImpl();
		return organisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationForm createEvaluationForm() {
		EvaluationFormImpl evaluationForm = new EvaluationFormImpl();
		return evaluationForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timetable createTimetable() {
		TimetableImpl timetable = new TimetableImpl();
		return timetable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyProgram createStudyProgram() {
		StudyProgramImpl studyProgram = new StudyProgramImpl();
		return studyProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimetableSlot createTimetableSlot() {
		TimetableSlotImpl timetableSlot = new TimetableSlotImpl();
		return timetableSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evaluation createEvaluation() {
		EvaluationImpl evaluation = new EvaluationImpl();
		return evaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreditReduction createCreditReduction() {
		CreditReductionImpl creditReduction = new CreditReductionImpl();
		return creditReduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationKinds createEvaluationKindsFromString(EDataType eDataType, String initialValue) {
		EvaluationKinds result = EvaluationKinds.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEvaluationKindsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimetableSlotKinds createTimetableSlotKindsFromString(EDataType eDataType, String initialValue) {
		TimetableSlotKinds result = TimetableSlotKinds.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimetableSlotKindsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleKinds createRoleKindsFromString(EDataType eDataType, String initialValue) {
		RoleKinds result = RoleKinds.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoleKindsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseworkPackage getCourseworkPackage() {
		return (CourseworkPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CourseworkPackage getPackage() {
		return CourseworkPackage.eINSTANCE;
	}

} //CourseworkFactoryImpl
