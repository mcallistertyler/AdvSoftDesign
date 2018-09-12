/**
 */
package tdt4250.coursework;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.coursework.Course#getCode <em>Code</em>}</li>
 *   <li>{@link tdt4250.coursework.Course#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.coursework.Course#getContent <em>Content</em>}</li>
 *   <li>{@link tdt4250.coursework.Course#getSize <em>Size</em>}</li>
 *   <li>{@link tdt4250.coursework.Course#getRecommendedCourse <em>Recommended Course</em>}</li>
 *   <li>{@link tdt4250.coursework.Course#getSemesterSpecificCourseInstance <em>Semester Specific Course Instance</em>}</li>
 *   <li>{@link tdt4250.coursework.Course#getRequiredCourse <em>Required Course</em>}</li>
 *   <li>{@link tdt4250.coursework.Course#getOrganisation <em>Organisation</em>}</li>
 *   <li>{@link tdt4250.coursework.Course#getCreditreduction <em>Creditreduction</em>}</li>
 *   <li>{@link tdt4250.coursework.Course#getStudyprogram <em>Studyprogram</em>}</li>
 * </ul>
 *
 * @see tdt4250.coursework.CourseworkPackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see tdt4250.coursework.CourseworkPackage#getCourse_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link tdt4250.coursework.Course#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.coursework.CourseworkPackage#getCourse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.coursework.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see tdt4250.coursework.CourseworkPackage#getCourse_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link tdt4250.coursework.Course#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(float)
	 * @see tdt4250.coursework.CourseworkPackage#getCourse_Size()
	 * @model
	 * @generated
	 */
	float getSize();

	/**
	 * Sets the value of the '{@link tdt4250.coursework.Course#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(float value);

	/**
	 * Returns the value of the '<em><b>Recommended Course</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.coursework.Course}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recommended Course</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recommended Course</em>' reference list.
	 * @see tdt4250.coursework.CourseworkPackage#getCourse_RecommendedCourse()
	 * @model
	 * @generated
	 */
	EList<Course> getRecommendedCourse();

	/**
	 * Returns the value of the '<em><b>Semester Specific Course Instance</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.coursework.CourseInstance}.
	 * It is bidirectional and its opposite is '{@link tdt4250.coursework.CourseInstance#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semester Specific Course Instance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Specific Course Instance</em>' containment reference list.
	 * @see tdt4250.coursework.CourseworkPackage#getCourse_SemesterSpecificCourseInstance()
	 * @see tdt4250.coursework.CourseInstance#getCourse
	 * @model opposite="course" containment="true" required="true"
	 * @generated
	 */
	EList<CourseInstance> getSemesterSpecificCourseInstance();

	/**
	 * Returns the value of the '<em><b>Required Course</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.coursework.Course}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Course</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Course</em>' reference list.
	 * @see tdt4250.coursework.CourseworkPackage#getCourse_RequiredCourse()
	 * @model
	 * @generated
	 */
	EList<Course> getRequiredCourse();

	/**
	 * Returns the value of the '<em><b>Organisation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.coursework.Organisation#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organisation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organisation</em>' reference.
	 * @see #setOrganisation(Organisation)
	 * @see tdt4250.coursework.CourseworkPackage#getCourse_Organisation()
	 * @see tdt4250.coursework.Organisation#getCourse
	 * @model opposite="course" required="true"
	 * @generated
	 */
	Organisation getOrganisation();

	/**
	 * Sets the value of the '{@link tdt4250.coursework.Course#getOrganisation <em>Organisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organisation</em>' reference.
	 * @see #getOrganisation()
	 * @generated
	 */
	void setOrganisation(Organisation value);

	/**
	 * Returns the value of the '<em><b>Creditreduction</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.coursework.CreditReduction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creditreduction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creditreduction</em>' containment reference list.
	 * @see tdt4250.coursework.CourseworkPackage#getCourse_Creditreduction()
	 * @model containment="true"
	 * @generated
	 */
	EList<CreditReduction> getCreditreduction();

	/**
	 * Returns the value of the '<em><b>Studyprogram</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.coursework.StudyProgram}.
	 * It is bidirectional and its opposite is '{@link tdt4250.coursework.StudyProgram#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Studyprogram</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Studyprogram</em>' reference list.
	 * @see tdt4250.coursework.CourseworkPackage#getCourse_Studyprogram()
	 * @see tdt4250.coursework.StudyProgram#getCourse
	 * @model opposite="course"
	 * @generated
	 */
	EList<StudyProgram> getStudyprogram();

} // Course
