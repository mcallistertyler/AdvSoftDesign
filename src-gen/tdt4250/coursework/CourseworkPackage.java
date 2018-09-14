/**
 */
package tdt4250.coursework;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tdt4250.coursework.CourseworkFactory
 * @model kind="package"
 * @generated
 */
public interface CourseworkPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "coursework";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/coursework";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "coursework";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CourseworkPackage eINSTANCE = tdt4250.coursework.impl.CourseworkPackageImpl.init();

	/**
	 * The meta object id for the '{@link tdt4250.coursework.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.coursework.impl.CourseImpl
	 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CONTENT = 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__SIZE = 3;

	/**
	 * The feature id for the '<em><b>Recommended Course</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__RECOMMENDED_COURSE = 4;

	/**
	 * The feature id for the '<em><b>Semester Specific Course Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__SEMESTER_SPECIFIC_COURSE_INSTANCE = 5;

	/**
	 * The feature id for the '<em><b>Required Course</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__REQUIRED_COURSE = 6;

	/**
	 * The feature id for the '<em><b>Organisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__ORGANISATION = 7;

	/**
	 * The feature id for the '<em><b>Creditreduction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CREDITREDUCTION = 8;

	/**
	 * The feature id for the '<em><b>Studyprogram</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__STUDYPROGRAM = 9;

	/**
	 * The feature id for the '<em><b>University</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__UNIVERSITY = 10;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.coursework.impl.CourseInstanceImpl <em>Course Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.coursework.impl.CourseInstanceImpl
	 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getCourseInstance()
	 * @generated
	 */
	int COURSE_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Semester Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__SEMESTER_DATE = 0;

	/**
	 * The feature id for the '<em><b>Course</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__COURSE = 1;

	/**
	 * The feature id for the '<em><b>Evaluationform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__EVALUATIONFORM = 2;

	/**
	 * The feature id for the '<em><b>Timetable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__TIMETABLE = 3;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__ROLE = 4;

	/**
	 * The number of structural features of the '<em>Course Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Course Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.coursework.impl.OrganisationImpl <em>Organisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.coursework.impl.OrganisationImpl
	 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getOrganisation()
	 * @generated
	 */
	int ORGANISATION = 2;

	/**
	 * The feature id for the '<em><b>Department Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__DEPARTMENT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Staff</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__STAFF = 1;

	/**
	 * The feature id for the '<em><b>Course</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__COURSE = 2;

	/**
	 * The feature id for the '<em><b>University</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__UNIVERSITY = 3;

	/**
	 * The number of structural features of the '<em>Organisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Organisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.coursework.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.coursework.impl.PersonImpl
	 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 0;

	/**
	 * The feature id for the '<em><b>Works In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__WORKS_IN = 1;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ROLE = 2;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.coursework.impl.EvaluationFormImpl <em>Evaluation Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.coursework.impl.EvaluationFormImpl
	 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getEvaluationForm()
	 * @generated
	 */
	int EVALUATION_FORM = 4;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_FORM__EVALUATION = 0;

	/**
	 * The number of structural features of the '<em>Evaluation Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_FORM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Evaluation Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_FORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.coursework.impl.TimetableImpl <em>Timetable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.coursework.impl.TimetableImpl
	 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getTimetable()
	 * @generated
	 */
	int TIMETABLE = 5;

	/**
	 * The feature id for the '<em><b>Lecture</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE__LECTURE = 0;

	/**
	 * The feature id for the '<em><b>Lab Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE__LAB_HOURS = 1;

	/**
	 * The feature id for the '<em><b>Lecture Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE__LECTURE_HOURS = 2;

	/**
	 * The feature id for the '<em><b>Courseinstance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE__COURSEINSTANCE = 3;

	/**
	 * The number of structural features of the '<em>Timetable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Timetable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.coursework.impl.StudyProgramImpl <em>Study Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.coursework.impl.StudyProgramImpl
	 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getStudyProgram()
	 * @generated
	 */
	int STUDY_PROGRAM = 6;

	/**
	 * The feature id for the '<em><b>Course</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAM__COURSE = 0;

	/**
	 * The feature id for the '<em><b>University</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAM__UNIVERSITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAM__NAME = 2;

	/**
	 * The number of structural features of the '<em>Study Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Study Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.coursework.impl.TimetableSlotImpl <em>Timetable Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.coursework.impl.TimetableSlotImpl
	 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getTimetableSlot()
	 * @generated
	 */
	int TIMETABLE_SLOT = 7;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE_SLOT__ROOM = 0;

	/**
	 * The feature id for the '<em><b>Studyprogram</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE_SLOT__STUDYPROGRAM = 1;

	/**
	 * The feature id for the '<em><b>Timetable Slot Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE_SLOT__TIMETABLE_SLOT_KIND = 2;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE_SLOT__DURATION = 3;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE_SLOT__DATE = 4;

	/**
	 * The number of structural features of the '<em>Timetable Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE_SLOT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Timetable Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE_SLOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.coursework.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.coursework.impl.RoomImpl
	 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 8;

	/**
	 * The feature id for the '<em><b>University</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__UNIVERSITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NAME = 1;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.coursework.impl.EvaluationImpl <em>Evaluation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.coursework.impl.EvaluationImpl
	 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getEvaluation()
	 * @generated
	 */
	int EVALUATION = 9;

	/**
	 * The feature id for the '<em><b>Evaluation Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__EVALUATION_KIND = 0;

	/**
	 * The feature id for the '<em><b>Total Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__TOTAL_PERCENTAGE = 1;

	/**
	 * The number of structural features of the '<em>Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.coursework.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.coursework.impl.RoleImpl
	 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 10;

	/**
	 * The feature id for the '<em><b>Role Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ROLE_KIND = 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.coursework.impl.CreditReductionImpl <em>Credit Reduction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.coursework.impl.CreditReductionImpl
	 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getCreditReduction()
	 * @generated
	 */
	int CREDIT_REDUCTION = 11;

	/**
	 * The feature id for the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_REDUCTION__COURSE = 0;

	/**
	 * The feature id for the '<em><b>Reduction Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_REDUCTION__REDUCTION_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Credit Reduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_REDUCTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Credit Reduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_REDUCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.coursework.impl.UniversityImpl <em>University</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.coursework.impl.UniversityImpl
	 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getUniversity()
	 * @generated
	 */
	int UNIVERSITY = 12;

	/**
	 * The feature id for the '<em><b>Room</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__ROOM = 0;

	/**
	 * The feature id for the '<em><b>Course</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__COURSE = 1;

	/**
	 * The feature id for the '<em><b>Organisation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__ORGANISATION = 2;

	/**
	 * The feature id for the '<em><b>Study Program</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__STUDY_PROGRAM = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__NAME = 4;

	/**
	 * The number of structural features of the '<em>University</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>University</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.coursework.EvaluationKinds <em>Evaluation Kinds</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.coursework.EvaluationKinds
	 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getEvaluationKinds()
	 * @generated
	 */
	int EVALUATION_KINDS = 13;

	/**
	 * The meta object id for the '{@link tdt4250.coursework.TimetableSlotKinds <em>Timetable Slot Kinds</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.coursework.TimetableSlotKinds
	 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getTimetableSlotKinds()
	 * @generated
	 */
	int TIMETABLE_SLOT_KINDS = 14;

	/**
	 * The meta object id for the '{@link tdt4250.coursework.RoleKinds <em>Role Kinds</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.coursework.RoleKinds
	 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getRoleKinds()
	 * @generated
	 */
	int ROLE_KINDS = 15;

	/**
	 * Returns the meta object for class '{@link tdt4250.coursework.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see tdt4250.coursework.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.coursework.Course#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see tdt4250.coursework.Course#getCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Code();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.coursework.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.coursework.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.coursework.Course#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see tdt4250.coursework.Course#getContent()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Content();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.coursework.Course#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see tdt4250.coursework.Course#getSize()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Size();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250.coursework.Course#getRecommendedCourse <em>Recommended Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Recommended Course</em>'.
	 * @see tdt4250.coursework.Course#getRecommendedCourse()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_RecommendedCourse();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.coursework.Course#getSemesterSpecificCourseInstance <em>Semester Specific Course Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semester Specific Course Instance</em>'.
	 * @see tdt4250.coursework.Course#getSemesterSpecificCourseInstance()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_SemesterSpecificCourseInstance();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250.coursework.Course#getRequiredCourse <em>Required Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Course</em>'.
	 * @see tdt4250.coursework.Course#getRequiredCourse()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_RequiredCourse();

	/**
	 * Returns the meta object for the reference '{@link tdt4250.coursework.Course#getOrganisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organisation</em>'.
	 * @see tdt4250.coursework.Course#getOrganisation()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Organisation();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.coursework.Course#getCreditreduction <em>Creditreduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Creditreduction</em>'.
	 * @see tdt4250.coursework.Course#getCreditreduction()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Creditreduction();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250.coursework.Course#getStudyprogram <em>Studyprogram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Studyprogram</em>'.
	 * @see tdt4250.coursework.Course#getStudyprogram()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Studyprogram();

	/**
	 * Returns the meta object for the container reference '{@link tdt4250.coursework.Course#getUniversity <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>University</em>'.
	 * @see tdt4250.coursework.Course#getUniversity()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_University();

	/**
	 * Returns the meta object for class '{@link tdt4250.coursework.CourseInstance <em>Course Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Instance</em>'.
	 * @see tdt4250.coursework.CourseInstance
	 * @generated
	 */
	EClass getCourseInstance();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.coursework.CourseInstance#getSemesterDate <em>Semester Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semester Date</em>'.
	 * @see tdt4250.coursework.CourseInstance#getSemesterDate()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EAttribute getCourseInstance_SemesterDate();

	/**
	 * Returns the meta object for the container reference '{@link tdt4250.coursework.CourseInstance#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Course</em>'.
	 * @see tdt4250.coursework.CourseInstance#getCourse()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EReference getCourseInstance_Course();

	/**
	 * Returns the meta object for the containment reference '{@link tdt4250.coursework.CourseInstance#getTimetable <em>Timetable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timetable</em>'.
	 * @see tdt4250.coursework.CourseInstance#getTimetable()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EReference getCourseInstance_Timetable();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250.coursework.CourseInstance#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Role</em>'.
	 * @see tdt4250.coursework.CourseInstance#getRole()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EReference getCourseInstance_Role();

	/**
	 * Returns the meta object for the containment reference '{@link tdt4250.coursework.CourseInstance#getEvaluationform <em>Evaluationform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Evaluationform</em>'.
	 * @see tdt4250.coursework.CourseInstance#getEvaluationform()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EReference getCourseInstance_Evaluationform();

	/**
	 * Returns the meta object for class '{@link tdt4250.coursework.Organisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organisation</em>'.
	 * @see tdt4250.coursework.Organisation
	 * @generated
	 */
	EClass getOrganisation();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.coursework.Organisation#getDepartmentName <em>Department Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Department Name</em>'.
	 * @see tdt4250.coursework.Organisation#getDepartmentName()
	 * @see #getOrganisation()
	 * @generated
	 */
	EAttribute getOrganisation_DepartmentName();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.coursework.Organisation#getStaff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Staff</em>'.
	 * @see tdt4250.coursework.Organisation#getStaff()
	 * @see #getOrganisation()
	 * @generated
	 */
	EReference getOrganisation_Staff();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250.coursework.Organisation#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Course</em>'.
	 * @see tdt4250.coursework.Organisation#getCourse()
	 * @see #getOrganisation()
	 * @generated
	 */
	EReference getOrganisation_Course();

	/**
	 * Returns the meta object for the container reference '{@link tdt4250.coursework.Organisation#getUniversity <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>University</em>'.
	 * @see tdt4250.coursework.Organisation#getUniversity()
	 * @see #getOrganisation()
	 * @generated
	 */
	EReference getOrganisation_University();

	/**
	 * Returns the meta object for class '{@link tdt4250.coursework.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see tdt4250.coursework.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.coursework.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.coursework.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the container reference '{@link tdt4250.coursework.Person#getWorksIn <em>Works In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Works In</em>'.
	 * @see tdt4250.coursework.Person#getWorksIn()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_WorksIn();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.coursework.Person#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role</em>'.
	 * @see tdt4250.coursework.Person#getRole()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Role();

	/**
	 * Returns the meta object for class '{@link tdt4250.coursework.EvaluationForm <em>Evaluation Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation Form</em>'.
	 * @see tdt4250.coursework.EvaluationForm
	 * @generated
	 */
	EClass getEvaluationForm();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.coursework.EvaluationForm#getEvaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Evaluation</em>'.
	 * @see tdt4250.coursework.EvaluationForm#getEvaluation()
	 * @see #getEvaluationForm()
	 * @generated
	 */
	EReference getEvaluationForm_Evaluation();

	/**
	 * Returns the meta object for class '{@link tdt4250.coursework.Timetable <em>Timetable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timetable</em>'.
	 * @see tdt4250.coursework.Timetable
	 * @generated
	 */
	EClass getTimetable();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.coursework.Timetable#getLecture <em>Lecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lecture</em>'.
	 * @see tdt4250.coursework.Timetable#getLecture()
	 * @see #getTimetable()
	 * @generated
	 */
	EReference getTimetable_Lecture();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.coursework.Timetable#getLabHours <em>Lab Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lab Hours</em>'.
	 * @see tdt4250.coursework.Timetable#getLabHours()
	 * @see #getTimetable()
	 * @generated
	 */
	EAttribute getTimetable_LabHours();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.coursework.Timetable#getLectureHours <em>Lecture Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lecture Hours</em>'.
	 * @see tdt4250.coursework.Timetable#getLectureHours()
	 * @see #getTimetable()
	 * @generated
	 */
	EAttribute getTimetable_LectureHours();

	/**
	 * Returns the meta object for the container reference '{@link tdt4250.coursework.Timetable#getCourseinstance <em>Courseinstance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Courseinstance</em>'.
	 * @see tdt4250.coursework.Timetable#getCourseinstance()
	 * @see #getTimetable()
	 * @generated
	 */
	EReference getTimetable_Courseinstance();

	/**
	 * Returns the meta object for class '{@link tdt4250.coursework.StudyProgram <em>Study Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Study Program</em>'.
	 * @see tdt4250.coursework.StudyProgram
	 * @generated
	 */
	EClass getStudyProgram();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250.coursework.StudyProgram#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Course</em>'.
	 * @see tdt4250.coursework.StudyProgram#getCourse()
	 * @see #getStudyProgram()
	 * @generated
	 */
	EReference getStudyProgram_Course();

	/**
	 * Returns the meta object for the container reference '{@link tdt4250.coursework.StudyProgram#getUniversity <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>University</em>'.
	 * @see tdt4250.coursework.StudyProgram#getUniversity()
	 * @see #getStudyProgram()
	 * @generated
	 */
	EReference getStudyProgram_University();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.coursework.StudyProgram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.coursework.StudyProgram#getName()
	 * @see #getStudyProgram()
	 * @generated
	 */
	EAttribute getStudyProgram_Name();

	/**
	 * Returns the meta object for class '{@link tdt4250.coursework.TimetableSlot <em>Timetable Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timetable Slot</em>'.
	 * @see tdt4250.coursework.TimetableSlot
	 * @generated
	 */
	EClass getTimetableSlot();

	/**
	 * Returns the meta object for the reference '{@link tdt4250.coursework.TimetableSlot#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see tdt4250.coursework.TimetableSlot#getRoom()
	 * @see #getTimetableSlot()
	 * @generated
	 */
	EReference getTimetableSlot_Room();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250.coursework.TimetableSlot#getStudyprogram <em>Studyprogram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Studyprogram</em>'.
	 * @see tdt4250.coursework.TimetableSlot#getStudyprogram()
	 * @see #getTimetableSlot()
	 * @generated
	 */
	EReference getTimetableSlot_Studyprogram();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.coursework.TimetableSlot#getTimetableSlotKind <em>Timetable Slot Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timetable Slot Kind</em>'.
	 * @see tdt4250.coursework.TimetableSlot#getTimetableSlotKind()
	 * @see #getTimetableSlot()
	 * @generated
	 */
	EAttribute getTimetableSlot_TimetableSlotKind();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.coursework.TimetableSlot#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see tdt4250.coursework.TimetableSlot#getDuration()
	 * @see #getTimetableSlot()
	 * @generated
	 */
	EAttribute getTimetableSlot_Duration();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.coursework.TimetableSlot#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see tdt4250.coursework.TimetableSlot#getDate()
	 * @see #getTimetableSlot()
	 * @generated
	 */
	EAttribute getTimetableSlot_Date();

	/**
	 * Returns the meta object for class '{@link tdt4250.coursework.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see tdt4250.coursework.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the container reference '{@link tdt4250.coursework.Room#getUniversity <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>University</em>'.
	 * @see tdt4250.coursework.Room#getUniversity()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_University();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.coursework.Room#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.coursework.Room#getName()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Name();

	/**
	 * Returns the meta object for class '{@link tdt4250.coursework.Evaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation</em>'.
	 * @see tdt4250.coursework.Evaluation
	 * @generated
	 */
	EClass getEvaluation();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.coursework.Evaluation#getEvaluationKind <em>Evaluation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Evaluation Kind</em>'.
	 * @see tdt4250.coursework.Evaluation#getEvaluationKind()
	 * @see #getEvaluation()
	 * @generated
	 */
	EAttribute getEvaluation_EvaluationKind();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.coursework.Evaluation#getTotalPercentage <em>Total Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Percentage</em>'.
	 * @see tdt4250.coursework.Evaluation#getTotalPercentage()
	 * @see #getEvaluation()
	 * @generated
	 */
	EAttribute getEvaluation_TotalPercentage();

	/**
	 * Returns the meta object for class '{@link tdt4250.coursework.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see tdt4250.coursework.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.coursework.Role#getRoleKind <em>Role Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Kind</em>'.
	 * @see tdt4250.coursework.Role#getRoleKind()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_RoleKind();

	/**
	 * Returns the meta object for class '{@link tdt4250.coursework.CreditReduction <em>Credit Reduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Credit Reduction</em>'.
	 * @see tdt4250.coursework.CreditReduction
	 * @generated
	 */
	EClass getCreditReduction();

	/**
	 * Returns the meta object for the reference '{@link tdt4250.coursework.CreditReduction#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Course</em>'.
	 * @see tdt4250.coursework.CreditReduction#getCourse()
	 * @see #getCreditReduction()
	 * @generated
	 */
	EReference getCreditReduction_Course();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.coursework.CreditReduction#getReductionValue <em>Reduction Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reduction Value</em>'.
	 * @see tdt4250.coursework.CreditReduction#getReductionValue()
	 * @see #getCreditReduction()
	 * @generated
	 */
	EAttribute getCreditReduction_ReductionValue();

	/**
	 * Returns the meta object for class '{@link tdt4250.coursework.University <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>University</em>'.
	 * @see tdt4250.coursework.University
	 * @generated
	 */
	EClass getUniversity();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.coursework.University#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Room</em>'.
	 * @see tdt4250.coursework.University#getRoom()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Room();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.coursework.University#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Course</em>'.
	 * @see tdt4250.coursework.University#getCourse()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Course();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.coursework.University#getOrganisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organisation</em>'.
	 * @see tdt4250.coursework.University#getOrganisation()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Organisation();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.coursework.University#getStudyProgram <em>Study Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Study Program</em>'.
	 * @see tdt4250.coursework.University#getStudyProgram()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_StudyProgram();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.coursework.University#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.coursework.University#getName()
	 * @see #getUniversity()
	 * @generated
	 */
	EAttribute getUniversity_Name();

	/**
	 * Returns the meta object for enum '{@link tdt4250.coursework.EvaluationKinds <em>Evaluation Kinds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Evaluation Kinds</em>'.
	 * @see tdt4250.coursework.EvaluationKinds
	 * @generated
	 */
	EEnum getEvaluationKinds();

	/**
	 * Returns the meta object for enum '{@link tdt4250.coursework.TimetableSlotKinds <em>Timetable Slot Kinds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Timetable Slot Kinds</em>'.
	 * @see tdt4250.coursework.TimetableSlotKinds
	 * @generated
	 */
	EEnum getTimetableSlotKinds();

	/**
	 * Returns the meta object for enum '{@link tdt4250.coursework.RoleKinds <em>Role Kinds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Role Kinds</em>'.
	 * @see tdt4250.coursework.RoleKinds
	 * @generated
	 */
	EEnum getRoleKinds();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CourseworkFactory getCourseworkFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tdt4250.coursework.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.coursework.impl.CourseImpl
		 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CODE = eINSTANCE.getCourse_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CONTENT = eINSTANCE.getCourse_Content();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__SIZE = eINSTANCE.getCourse_Size();

		/**
		 * The meta object literal for the '<em><b>Recommended Course</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__RECOMMENDED_COURSE = eINSTANCE.getCourse_RecommendedCourse();

		/**
		 * The meta object literal for the '<em><b>Semester Specific Course Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__SEMESTER_SPECIFIC_COURSE_INSTANCE = eINSTANCE.getCourse_SemesterSpecificCourseInstance();

		/**
		 * The meta object literal for the '<em><b>Required Course</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__REQUIRED_COURSE = eINSTANCE.getCourse_RequiredCourse();

		/**
		 * The meta object literal for the '<em><b>Organisation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__ORGANISATION = eINSTANCE.getCourse_Organisation();

		/**
		 * The meta object literal for the '<em><b>Creditreduction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__CREDITREDUCTION = eINSTANCE.getCourse_Creditreduction();

		/**
		 * The meta object literal for the '<em><b>Studyprogram</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__STUDYPROGRAM = eINSTANCE.getCourse_Studyprogram();

		/**
		 * The meta object literal for the '<em><b>University</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__UNIVERSITY = eINSTANCE.getCourse_University();

		/**
		 * The meta object literal for the '{@link tdt4250.coursework.impl.CourseInstanceImpl <em>Course Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.coursework.impl.CourseInstanceImpl
		 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getCourseInstance()
		 * @generated
		 */
		EClass COURSE_INSTANCE = eINSTANCE.getCourseInstance();

		/**
		 * The meta object literal for the '<em><b>Semester Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_INSTANCE__SEMESTER_DATE = eINSTANCE.getCourseInstance_SemesterDate();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_INSTANCE__COURSE = eINSTANCE.getCourseInstance_Course();

		/**
		 * The meta object literal for the '<em><b>Timetable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_INSTANCE__TIMETABLE = eINSTANCE.getCourseInstance_Timetable();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_INSTANCE__ROLE = eINSTANCE.getCourseInstance_Role();

		/**
		 * The meta object literal for the '<em><b>Evaluationform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_INSTANCE__EVALUATIONFORM = eINSTANCE.getCourseInstance_Evaluationform();

		/**
		 * The meta object literal for the '{@link tdt4250.coursework.impl.OrganisationImpl <em>Organisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.coursework.impl.OrganisationImpl
		 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getOrganisation()
		 * @generated
		 */
		EClass ORGANISATION = eINSTANCE.getOrganisation();

		/**
		 * The meta object literal for the '<em><b>Department Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISATION__DEPARTMENT_NAME = eINSTANCE.getOrganisation_DepartmentName();

		/**
		 * The meta object literal for the '<em><b>Staff</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION__STAFF = eINSTANCE.getOrganisation_Staff();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION__COURSE = eINSTANCE.getOrganisation_Course();

		/**
		 * The meta object literal for the '<em><b>University</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION__UNIVERSITY = eINSTANCE.getOrganisation_University();

		/**
		 * The meta object literal for the '{@link tdt4250.coursework.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.coursework.impl.PersonImpl
		 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Works In</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__WORKS_IN = eINSTANCE.getPerson_WorksIn();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__ROLE = eINSTANCE.getPerson_Role();

		/**
		 * The meta object literal for the '{@link tdt4250.coursework.impl.EvaluationFormImpl <em>Evaluation Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.coursework.impl.EvaluationFormImpl
		 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getEvaluationForm()
		 * @generated
		 */
		EClass EVALUATION_FORM = eINSTANCE.getEvaluationForm();

		/**
		 * The meta object literal for the '<em><b>Evaluation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_FORM__EVALUATION = eINSTANCE.getEvaluationForm_Evaluation();

		/**
		 * The meta object literal for the '{@link tdt4250.coursework.impl.TimetableImpl <em>Timetable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.coursework.impl.TimetableImpl
		 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getTimetable()
		 * @generated
		 */
		EClass TIMETABLE = eINSTANCE.getTimetable();

		/**
		 * The meta object literal for the '<em><b>Lecture</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMETABLE__LECTURE = eINSTANCE.getTimetable_Lecture();

		/**
		 * The meta object literal for the '<em><b>Lab Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMETABLE__LAB_HOURS = eINSTANCE.getTimetable_LabHours();

		/**
		 * The meta object literal for the '<em><b>Lecture Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMETABLE__LECTURE_HOURS = eINSTANCE.getTimetable_LectureHours();

		/**
		 * The meta object literal for the '<em><b>Courseinstance</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMETABLE__COURSEINSTANCE = eINSTANCE.getTimetable_Courseinstance();

		/**
		 * The meta object literal for the '{@link tdt4250.coursework.impl.StudyProgramImpl <em>Study Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.coursework.impl.StudyProgramImpl
		 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getStudyProgram()
		 * @generated
		 */
		EClass STUDY_PROGRAM = eINSTANCE.getStudyProgram();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PROGRAM__COURSE = eINSTANCE.getStudyProgram_Course();

		/**
		 * The meta object literal for the '<em><b>University</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PROGRAM__UNIVERSITY = eINSTANCE.getStudyProgram_University();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_PROGRAM__NAME = eINSTANCE.getStudyProgram_Name();

		/**
		 * The meta object literal for the '{@link tdt4250.coursework.impl.TimetableSlotImpl <em>Timetable Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.coursework.impl.TimetableSlotImpl
		 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getTimetableSlot()
		 * @generated
		 */
		EClass TIMETABLE_SLOT = eINSTANCE.getTimetableSlot();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMETABLE_SLOT__ROOM = eINSTANCE.getTimetableSlot_Room();

		/**
		 * The meta object literal for the '<em><b>Studyprogram</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMETABLE_SLOT__STUDYPROGRAM = eINSTANCE.getTimetableSlot_Studyprogram();

		/**
		 * The meta object literal for the '<em><b>Timetable Slot Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMETABLE_SLOT__TIMETABLE_SLOT_KIND = eINSTANCE.getTimetableSlot_TimetableSlotKind();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMETABLE_SLOT__DURATION = eINSTANCE.getTimetableSlot_Duration();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMETABLE_SLOT__DATE = eINSTANCE.getTimetableSlot_Date();

		/**
		 * The meta object literal for the '{@link tdt4250.coursework.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.coursework.impl.RoomImpl
		 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>University</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__UNIVERSITY = eINSTANCE.getRoom_University();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__NAME = eINSTANCE.getRoom_Name();

		/**
		 * The meta object literal for the '{@link tdt4250.coursework.impl.EvaluationImpl <em>Evaluation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.coursework.impl.EvaluationImpl
		 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getEvaluation()
		 * @generated
		 */
		EClass EVALUATION = eINSTANCE.getEvaluation();

		/**
		 * The meta object literal for the '<em><b>Evaluation Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION__EVALUATION_KIND = eINSTANCE.getEvaluation_EvaluationKind();

		/**
		 * The meta object literal for the '<em><b>Total Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION__TOTAL_PERCENTAGE = eINSTANCE.getEvaluation_TotalPercentage();

		/**
		 * The meta object literal for the '{@link tdt4250.coursework.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.coursework.impl.RoleImpl
		 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Role Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__ROLE_KIND = eINSTANCE.getRole_RoleKind();

		/**
		 * The meta object literal for the '{@link tdt4250.coursework.impl.CreditReductionImpl <em>Credit Reduction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.coursework.impl.CreditReductionImpl
		 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getCreditReduction()
		 * @generated
		 */
		EClass CREDIT_REDUCTION = eINSTANCE.getCreditReduction();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREDIT_REDUCTION__COURSE = eINSTANCE.getCreditReduction_Course();

		/**
		 * The meta object literal for the '<em><b>Reduction Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_REDUCTION__REDUCTION_VALUE = eINSTANCE.getCreditReduction_ReductionValue();

		/**
		 * The meta object literal for the '{@link tdt4250.coursework.impl.UniversityImpl <em>University</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.coursework.impl.UniversityImpl
		 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getUniversity()
		 * @generated
		 */
		EClass UNIVERSITY = eINSTANCE.getUniversity();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__ROOM = eINSTANCE.getUniversity_Room();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__COURSE = eINSTANCE.getUniversity_Course();

		/**
		 * The meta object literal for the '<em><b>Organisation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__ORGANISATION = eINSTANCE.getUniversity_Organisation();

		/**
		 * The meta object literal for the '<em><b>Study Program</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__STUDY_PROGRAM = eINSTANCE.getUniversity_StudyProgram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSITY__NAME = eINSTANCE.getUniversity_Name();

		/**
		 * The meta object literal for the '{@link tdt4250.coursework.EvaluationKinds <em>Evaluation Kinds</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.coursework.EvaluationKinds
		 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getEvaluationKinds()
		 * @generated
		 */
		EEnum EVALUATION_KINDS = eINSTANCE.getEvaluationKinds();

		/**
		 * The meta object literal for the '{@link tdt4250.coursework.TimetableSlotKinds <em>Timetable Slot Kinds</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.coursework.TimetableSlotKinds
		 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getTimetableSlotKinds()
		 * @generated
		 */
		EEnum TIMETABLE_SLOT_KINDS = eINSTANCE.getTimetableSlotKinds();

		/**
		 * The meta object literal for the '{@link tdt4250.coursework.RoleKinds <em>Role Kinds</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.coursework.RoleKinds
		 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getRoleKinds()
		 * @generated
		 */
		EEnum ROLE_KINDS = eINSTANCE.getRoleKinds();

	}

} //CourseworkPackage
