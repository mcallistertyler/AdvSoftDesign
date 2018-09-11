/**
 */
package tdt4250.coursework;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	 * The feature id for the '<em><b>Courseinstance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSEINSTANCE = 5;

	/**
	 * The feature id for the '<em><b>Required Course</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__REQUIRED_COURSE = 6;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 7;

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
	 * The feature id for the '<em><b>Timetable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__TIMETABLE = 1;

	/**
	 * The feature id for the '<em><b>Semester Specific Course Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__SEMESTER_SPECIFIC_COURSE_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Staff</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__STAFF = 3;

	/**
	 * The feature id for the '<em><b>Evaluationform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__EVALUATIONFORM = 4;

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
	 * The number of structural features of the '<em>Organisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Organisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.coursework.impl.StaffImpl <em>Staff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.coursework.impl.StaffImpl
	 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getStaff()
	 * @generated
	 */
	int STAFF = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__NAME = 0;

	/**
	 * The feature id for the '<em><b>Works In</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__WORKS_IN = 1;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__ROLE = 2;

	/**
	 * The number of structural features of the '<em>Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Project</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_FORM__PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Exam</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_FORM__EXAM = 1;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_FORM__ASSIGNMENT = 2;

	/**
	 * The number of structural features of the '<em>Evaluation Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_FORM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Evaluation Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_FORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.coursework.impl.ExamImpl <em>Exam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.coursework.impl.ExamImpl
	 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getExam()
	 * @generated
	 */
	int EXAM = 5;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM__PERCENTAGE = 0;

	/**
	 * The number of structural features of the '<em>Exam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Exam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.coursework.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.coursework.impl.AssignmentImpl
	 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 6;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__PERCENTAGE = 0;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.coursework.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.coursework.impl.ProjectImpl
	 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 7;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PERCENTAGE = 0;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 0;

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
	 * Returns the meta object for the containment reference list '{@link tdt4250.coursework.Course#getCourseinstance <em>Courseinstance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courseinstance</em>'.
	 * @see tdt4250.coursework.Course#getCourseinstance()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Courseinstance();

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
	 * Returns the meta object for the attribute '{@link tdt4250.coursework.CourseInstance#getTimetable <em>Timetable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timetable</em>'.
	 * @see tdt4250.coursework.CourseInstance#getTimetable()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EAttribute getCourseInstance_Timetable();

	/**
	 * Returns the meta object for the container reference '{@link tdt4250.coursework.CourseInstance#getSemesterSpecificCourseInstance <em>Semester Specific Course Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Semester Specific Course Instance</em>'.
	 * @see tdt4250.coursework.CourseInstance#getSemesterSpecificCourseInstance()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EReference getCourseInstance_SemesterSpecificCourseInstance();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250.coursework.CourseInstance#getStaff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Staff</em>'.
	 * @see tdt4250.coursework.CourseInstance#getStaff()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EReference getCourseInstance_Staff();

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
	 * Returns the meta object for class '{@link tdt4250.coursework.Staff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff</em>'.
	 * @see tdt4250.coursework.Staff
	 * @generated
	 */
	EClass getStaff();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.coursework.Staff#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.coursework.Staff#getName()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_Name();

	/**
	 * Returns the meta object for the container reference '{@link tdt4250.coursework.Staff#getWorksIn <em>Works In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Works In</em>'.
	 * @see tdt4250.coursework.Staff#getWorksIn()
	 * @see #getStaff()
	 * @generated
	 */
	EReference getStaff_WorksIn();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.coursework.Staff#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see tdt4250.coursework.Staff#getRole()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_Role();

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
	 * Returns the meta object for the containment reference list '{@link tdt4250.coursework.EvaluationForm#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Project</em>'.
	 * @see tdt4250.coursework.EvaluationForm#getProject()
	 * @see #getEvaluationForm()
	 * @generated
	 */
	EReference getEvaluationForm_Project();

	/**
	 * Returns the meta object for the containment reference '{@link tdt4250.coursework.EvaluationForm#getExam <em>Exam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exam</em>'.
	 * @see tdt4250.coursework.EvaluationForm#getExam()
	 * @see #getEvaluationForm()
	 * @generated
	 */
	EReference getEvaluationForm_Exam();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.coursework.EvaluationForm#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assignment</em>'.
	 * @see tdt4250.coursework.EvaluationForm#getAssignment()
	 * @see #getEvaluationForm()
	 * @generated
	 */
	EReference getEvaluationForm_Assignment();

	/**
	 * Returns the meta object for class '{@link tdt4250.coursework.Exam <em>Exam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exam</em>'.
	 * @see tdt4250.coursework.Exam
	 * @generated
	 */
	EClass getExam();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.coursework.Exam#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see tdt4250.coursework.Exam#getPercentage()
	 * @see #getExam()
	 * @generated
	 */
	EAttribute getExam_Percentage();

	/**
	 * Returns the meta object for class '{@link tdt4250.coursework.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see tdt4250.coursework.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.coursework.Assignment#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see tdt4250.coursework.Assignment#getPercentage()
	 * @see #getAssignment()
	 * @generated
	 */
	EAttribute getAssignment_Percentage();

	/**
	 * Returns the meta object for class '{@link tdt4250.coursework.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see tdt4250.coursework.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.coursework.Project#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see tdt4250.coursework.Project#getPercentage()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Percentage();

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
		 * The meta object literal for the '<em><b>Courseinstance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__COURSEINSTANCE = eINSTANCE.getCourse_Courseinstance();

		/**
		 * The meta object literal for the '<em><b>Required Course</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__REQUIRED_COURSE = eINSTANCE.getCourse_RequiredCourse();

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
		 * The meta object literal for the '<em><b>Timetable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_INSTANCE__TIMETABLE = eINSTANCE.getCourseInstance_Timetable();

		/**
		 * The meta object literal for the '<em><b>Semester Specific Course Instance</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_INSTANCE__SEMESTER_SPECIFIC_COURSE_INSTANCE = eINSTANCE
				.getCourseInstance_SemesterSpecificCourseInstance();

		/**
		 * The meta object literal for the '<em><b>Staff</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_INSTANCE__STAFF = eINSTANCE.getCourseInstance_Staff();

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
		 * The meta object literal for the '{@link tdt4250.coursework.impl.StaffImpl <em>Staff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.coursework.impl.StaffImpl
		 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getStaff()
		 * @generated
		 */
		EClass STAFF = eINSTANCE.getStaff();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF__NAME = eINSTANCE.getStaff_Name();

		/**
		 * The meta object literal for the '<em><b>Works In</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF__WORKS_IN = eINSTANCE.getStaff_WorksIn();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF__ROLE = eINSTANCE.getStaff_Role();

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
		 * The meta object literal for the '<em><b>Project</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_FORM__PROJECT = eINSTANCE.getEvaluationForm_Project();

		/**
		 * The meta object literal for the '<em><b>Exam</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_FORM__EXAM = eINSTANCE.getEvaluationForm_Exam();

		/**
		 * The meta object literal for the '<em><b>Assignment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_FORM__ASSIGNMENT = eINSTANCE.getEvaluationForm_Assignment();

		/**
		 * The meta object literal for the '{@link tdt4250.coursework.impl.ExamImpl <em>Exam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.coursework.impl.ExamImpl
		 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getExam()
		 * @generated
		 */
		EClass EXAM = eINSTANCE.getExam();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM__PERCENTAGE = eINSTANCE.getExam_Percentage();

		/**
		 * The meta object literal for the '{@link tdt4250.coursework.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.coursework.impl.AssignmentImpl
		 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT__PERCENTAGE = eINSTANCE.getAssignment_Percentage();

		/**
		 * The meta object literal for the '{@link tdt4250.coursework.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.coursework.impl.ProjectImpl
		 * @see tdt4250.coursework.impl.CourseworkPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__PERCENTAGE = eINSTANCE.getProject_Percentage();

	}

} //CourseworkPackage
