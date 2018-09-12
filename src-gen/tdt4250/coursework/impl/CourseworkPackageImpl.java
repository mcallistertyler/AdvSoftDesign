/**
 */
package tdt4250.coursework.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import tdt4250.coursework.Course;
import tdt4250.coursework.CourseInstance;
import tdt4250.coursework.CourseworkFactory;
import tdt4250.coursework.CourseworkPackage;
import tdt4250.coursework.CreditReduction;
import tdt4250.coursework.Evaluation;
import tdt4250.coursework.EvaluationForm;
import tdt4250.coursework.EvaluationKinds;
import tdt4250.coursework.Organisation;
import tdt4250.coursework.Person;
import tdt4250.coursework.Role;
import tdt4250.coursework.RoleKinds;
import tdt4250.coursework.Room;
import tdt4250.coursework.StudyProgram;
import tdt4250.coursework.Timetable;
import tdt4250.coursework.TimetableSlot;
import tdt4250.coursework.TimetableSlotKinds;
import tdt4250.coursework.util.CourseworkValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CourseworkPackageImpl extends EPackageImpl implements CourseworkPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organisationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluationFormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timetableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass studyProgramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timetableSlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creditReductionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum evaluationKindsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timetableSlotKindsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum roleKindsEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see tdt4250.coursework.CourseworkPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CourseworkPackageImpl() {
		super(eNS_URI, CourseworkFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CourseworkPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CourseworkPackage init() {
		if (isInited)
			return (CourseworkPackage) EPackage.Registry.INSTANCE.getEPackage(CourseworkPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCourseworkPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CourseworkPackageImpl theCourseworkPackage = registeredCourseworkPackage instanceof CourseworkPackageImpl
				? (CourseworkPackageImpl) registeredCourseworkPackage
				: new CourseworkPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCourseworkPackage.createPackageContents();

		// Initialize created meta-data
		theCourseworkPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theCourseworkPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return CourseworkValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theCourseworkPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CourseworkPackage.eNS_URI, theCourseworkPackage);
		return theCourseworkPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourse() {
		return courseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_Code() {
		return (EAttribute) courseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_Name() {
		return (EAttribute) courseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_Content() {
		return (EAttribute) courseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_Size() {
		return (EAttribute) courseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourse_RecommendedCourse() {
		return (EReference) courseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourse_SemesterSpecificCourseInstance() {
		return (EReference) courseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourse_RequiredCourse() {
		return (EReference) courseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourse_Organisation() {
		return (EReference) courseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourse_Creditreduction() {
		return (EReference) courseEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourse_Studyprogram() {
		return (EReference) courseEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourseInstance() {
		return courseInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourseInstance_SemesterDate() {
		return (EAttribute) courseInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourseInstance_Course() {
		return (EReference) courseInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourseInstance_Timetable() {
		return (EReference) courseInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourseInstance_Role() {
		return (EReference) courseInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourseInstance_Evaluationform() {
		return (EReference) courseInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganisation() {
		return organisationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganisation_DepartmentName() {
		return (EAttribute) organisationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganisation_Staff() {
		return (EReference) organisationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganisation_Course() {
		return (EReference) organisationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Name() {
		return (EAttribute) personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_WorksIn() {
		return (EReference) personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Role() {
		return (EReference) personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluationForm() {
		return evaluationFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluationForm_Evaluation() {
		return (EReference) evaluationFormEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimetable() {
		return timetableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimetable_Lecture() {
		return (EReference) timetableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimetable_LabHours() {
		return (EAttribute) timetableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimetable_LectureHours() {
		return (EAttribute) timetableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimetable_Courseinstance() {
		return (EReference) timetableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStudyProgram() {
		return studyProgramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudyProgram_Course() {
		return (EReference) studyProgramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimetableSlot() {
		return timetableSlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimetableSlot_Room() {
		return (EReference) timetableSlotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimetableSlot_Studyprogram() {
		return (EReference) timetableSlotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimetableSlot_TimetableSlotKind() {
		return (EAttribute) timetableSlotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimetableSlot_Duration() {
		return (EAttribute) timetableSlotEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimetableSlot_Date() {
		return (EAttribute) timetableSlotEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoom() {
		return roomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluation() {
		return evaluationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaluation_EvaluationKind() {
		return (EAttribute) evaluationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaluation_TotalPercentage() {
		return (EAttribute) evaluationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_RoleKind() {
		return (EAttribute) roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreditReduction() {
		return creditReductionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreditReduction_Course() {
		return (EReference) creditReductionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEvaluationKinds() {
		return evaluationKindsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimetableSlotKinds() {
		return timetableSlotKindsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRoleKinds() {
		return roleKindsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseworkFactory getCourseworkFactory() {
		return (CourseworkFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		courseEClass = createEClass(COURSE);
		createEAttribute(courseEClass, COURSE__CODE);
		createEAttribute(courseEClass, COURSE__NAME);
		createEAttribute(courseEClass, COURSE__CONTENT);
		createEAttribute(courseEClass, COURSE__SIZE);
		createEReference(courseEClass, COURSE__RECOMMENDED_COURSE);
		createEReference(courseEClass, COURSE__SEMESTER_SPECIFIC_COURSE_INSTANCE);
		createEReference(courseEClass, COURSE__REQUIRED_COURSE);
		createEReference(courseEClass, COURSE__ORGANISATION);
		createEReference(courseEClass, COURSE__CREDITREDUCTION);
		createEReference(courseEClass, COURSE__STUDYPROGRAM);

		courseInstanceEClass = createEClass(COURSE_INSTANCE);
		createEAttribute(courseInstanceEClass, COURSE_INSTANCE__SEMESTER_DATE);
		createEReference(courseInstanceEClass, COURSE_INSTANCE__COURSE);
		createEReference(courseInstanceEClass, COURSE_INSTANCE__EVALUATIONFORM);
		createEReference(courseInstanceEClass, COURSE_INSTANCE__TIMETABLE);
		createEReference(courseInstanceEClass, COURSE_INSTANCE__ROLE);

		organisationEClass = createEClass(ORGANISATION);
		createEAttribute(organisationEClass, ORGANISATION__DEPARTMENT_NAME);
		createEReference(organisationEClass, ORGANISATION__STAFF);
		createEReference(organisationEClass, ORGANISATION__COURSE);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__NAME);
		createEReference(personEClass, PERSON__WORKS_IN);
		createEReference(personEClass, PERSON__ROLE);

		evaluationFormEClass = createEClass(EVALUATION_FORM);
		createEReference(evaluationFormEClass, EVALUATION_FORM__EVALUATION);

		timetableEClass = createEClass(TIMETABLE);
		createEReference(timetableEClass, TIMETABLE__LECTURE);
		createEAttribute(timetableEClass, TIMETABLE__LAB_HOURS);
		createEAttribute(timetableEClass, TIMETABLE__LECTURE_HOURS);
		createEReference(timetableEClass, TIMETABLE__COURSEINSTANCE);

		studyProgramEClass = createEClass(STUDY_PROGRAM);
		createEReference(studyProgramEClass, STUDY_PROGRAM__COURSE);

		timetableSlotEClass = createEClass(TIMETABLE_SLOT);
		createEReference(timetableSlotEClass, TIMETABLE_SLOT__ROOM);
		createEReference(timetableSlotEClass, TIMETABLE_SLOT__STUDYPROGRAM);
		createEAttribute(timetableSlotEClass, TIMETABLE_SLOT__TIMETABLE_SLOT_KIND);
		createEAttribute(timetableSlotEClass, TIMETABLE_SLOT__DURATION);
		createEAttribute(timetableSlotEClass, TIMETABLE_SLOT__DATE);

		roomEClass = createEClass(ROOM);

		evaluationEClass = createEClass(EVALUATION);
		createEAttribute(evaluationEClass, EVALUATION__EVALUATION_KIND);
		createEAttribute(evaluationEClass, EVALUATION__TOTAL_PERCENTAGE);

		roleEClass = createEClass(ROLE);
		createEAttribute(roleEClass, ROLE__ROLE_KIND);

		creditReductionEClass = createEClass(CREDIT_REDUCTION);
		createEReference(creditReductionEClass, CREDIT_REDUCTION__COURSE);

		// Create enums
		evaluationKindsEEnum = createEEnum(EVALUATION_KINDS);
		timetableSlotKindsEEnum = createEEnum(TIMETABLE_SLOT_KINDS);
		roleKindsEEnum = createEEnum(ROLE_KINDS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(courseEClass, Course.class, "Course", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCourse_Code(), ecorePackage.getEString(), "code", null, 0, 1, Course.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Name(), ecorePackage.getEString(), "name", null, 0, 1, Course.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Content(), ecorePackage.getEString(), "content", null, 0, 1, Course.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Size(), ecorePackage.getEFloat(), "size", null, 0, 1, Course.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_RecommendedCourse(), this.getCourse(), null, "recommendedCourse", null, 0, -1,
				Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_SemesterSpecificCourseInstance(), this.getCourseInstance(),
				this.getCourseInstance_Course(), "semesterSpecificCourseInstance", null, 1, -1, Course.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_RequiredCourse(), this.getCourse(), null, "requiredCourse", null, 0, -1, Course.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_Organisation(), this.getOrganisation(), this.getOrganisation_Course(), "organisation",
				null, 1, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_Creditreduction(), this.getCreditReduction(), null, "creditreduction", null, 0, -1,
				Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_Studyprogram(), this.getStudyProgram(), this.getStudyProgram_Course(), "studyprogram",
				null, 0, -1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(courseInstanceEClass, CourseInstance.class, "CourseInstance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCourseInstance_SemesterDate(), ecorePackage.getEDate(), "semesterDate", null, 0, 1,
				CourseInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getCourseInstance_Course(), this.getCourse(), this.getCourse_SemesterSpecificCourseInstance(),
				"course", null, 1, 1, CourseInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourseInstance_Evaluationform(), this.getEvaluationForm(), null, "evaluationform", null, 1, 1,
				CourseInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourseInstance_Timetable(), this.getTimetable(), this.getTimetable_Courseinstance(),
				"timetable", null, 1, 1, CourseInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourseInstance_Role(), this.getRole(), null, "role", null, 1, -1, CourseInstance.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organisationEClass, Organisation.class, "Organisation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrganisation_DepartmentName(), ecorePackage.getEString(), "departmentName", null, 0, 1,
				Organisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getOrganisation_Staff(), this.getPerson(), this.getPerson_WorksIn(), "staff", null, 1, -1,
				Organisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganisation_Course(), this.getCourse(), this.getCourse_Organisation(), "course", null, 0, -1,
				Organisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Name(), ecorePackage.getEString(), "name", null, 0, 1, Person.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_WorksIn(), this.getOrganisation(), this.getOrganisation_Staff(), "worksIn", null, 0, 1,
				Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Role(), this.getRole(), null, "role", null, 1, -1, Person.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(evaluationFormEClass, EvaluationForm.class, "EvaluationForm", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvaluationForm_Evaluation(), this.getEvaluation(), null, "evaluation", null, 1, -1,
				EvaluationForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timetableEClass, Timetable.class, "Timetable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimetable_Lecture(), this.getTimetableSlot(), null, "lecture", null, 0, -1, Timetable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimetable_LabHours(), ecorePackage.getEFloat(), "labHours", null, 0, 1, Timetable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimetable_LectureHours(), ecorePackage.getEFloat(), "lectureHours", null, 0, 1,
				Timetable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getTimetable_Courseinstance(), this.getCourseInstance(), this.getCourseInstance_Timetable(),
				"courseinstance", null, 1, 1, Timetable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(studyProgramEClass, StudyProgram.class, "StudyProgram", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStudyProgram_Course(), this.getCourse(), this.getCourse_Studyprogram(), "course", null, 1, -1,
				StudyProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timetableSlotEClass, TimetableSlot.class, "TimetableSlot", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimetableSlot_Room(), this.getRoom(), null, "room", null, 1, 1, TimetableSlot.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimetableSlot_Studyprogram(), this.getStudyProgram(), null, "studyprogram", null, 1, -1,
				TimetableSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimetableSlot_TimetableSlotKind(), this.getTimetableSlotKinds(), "TimetableSlotKind", null, 1,
				1, TimetableSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimetableSlot_Duration(), ecorePackage.getEFloat(), "duration", null, 0, 1,
				TimetableSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimetableSlot_Date(), ecorePackage.getEDate(), "date", null, 0, 1, TimetableSlot.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evaluationEClass, Evaluation.class, "Evaluation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvaluation_EvaluationKind(), this.getEvaluationKinds(), "evaluationKind", null, 1, 1,
				Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluation_TotalPercentage(), ecorePackage.getEFloat(), "totalPercentage", null, 0, 1,
				Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRole_RoleKind(), this.getRoleKinds(), "roleKind", null, 1, 1, Role.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(creditReductionEClass, CreditReduction.class, "CreditReduction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreditReduction_Course(), this.getCourse(), null, "course", null, 1, 1, CreditReduction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(evaluationKindsEEnum, EvaluationKinds.class, "EvaluationKinds");
		addEEnumLiteral(evaluationKindsEEnum, EvaluationKinds.EXAM);
		addEEnumLiteral(evaluationKindsEEnum, EvaluationKinds.PROJECT);
		addEEnumLiteral(evaluationKindsEEnum, EvaluationKinds.ASSIGNMENT);

		initEEnum(timetableSlotKindsEEnum, TimetableSlotKinds.class, "TimetableSlotKinds");
		addEEnumLiteral(timetableSlotKindsEEnum, TimetableSlotKinds.LAB);
		addEEnumLiteral(timetableSlotKindsEEnum, TimetableSlotKinds.LECTURE);

		initEEnum(roleKindsEEnum, RoleKinds.class, "RoleKinds");
		addEEnumLiteral(roleKindsEEnum, RoleKinds.LECTURER);
		addEEnumLiteral(roleKindsEEnum, RoleKinds.COURSE_COORDINATOR);
		addEEnumLiteral(roleKindsEEnum, RoleKinds.OTHER);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(courseInstanceEClass, source, new String[] { "constraints", "hasCourseCoordinator" });
		addAnnotation(evaluationFormEClass, source, new String[] { "constraints", "totalPercentageEqualsOneHundred" });
		addAnnotation(timetableEClass, source, new String[] { "constraints", "maximumScheduledHours" });
	}

} //CourseworkPackageImpl
