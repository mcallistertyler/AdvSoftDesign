/**
 */
package tdt4250.coursework.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.coursework.Course;
import tdt4250.coursework.CourseInstance;
import tdt4250.coursework.CourseworkPackage;
import tdt4250.coursework.CreditReduction;
import tdt4250.coursework.Organisation;
import tdt4250.coursework.StudyProgram;
import tdt4250.coursework.University;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.coursework.impl.CourseImpl#getCode <em>Code</em>}</li>
 *   <li>{@link tdt4250.coursework.impl.CourseImpl#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.coursework.impl.CourseImpl#getContent <em>Content</em>}</li>
 *   <li>{@link tdt4250.coursework.impl.CourseImpl#getSize <em>Size</em>}</li>
 *   <li>{@link tdt4250.coursework.impl.CourseImpl#getRecommendedCourse <em>Recommended Course</em>}</li>
 *   <li>{@link tdt4250.coursework.impl.CourseImpl#getSemesterSpecificCourseInstance <em>Semester Specific Course Instance</em>}</li>
 *   <li>{@link tdt4250.coursework.impl.CourseImpl#getRequiredCourse <em>Required Course</em>}</li>
 *   <li>{@link tdt4250.coursework.impl.CourseImpl#getOrganisation <em>Organisation</em>}</li>
 *   <li>{@link tdt4250.coursework.impl.CourseImpl#getCreditreduction <em>Creditreduction</em>}</li>
 *   <li>{@link tdt4250.coursework.impl.CourseImpl#getStudyprogram <em>Studyprogram</em>}</li>
 *   <li>{@link tdt4250.coursework.impl.CourseImpl#getUniversity <em>University</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends MinimalEObjectImpl.Container implements Course {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final float SIZE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected float size = SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRecommendedCourse() <em>Recommended Course</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendedCourse()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> recommendedCourse;

	/**
	 * The cached value of the '{@link #getSemesterSpecificCourseInstance() <em>Semester Specific Course Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterSpecificCourseInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseInstance> semesterSpecificCourseInstance;

	/**
	 * The cached value of the '{@link #getRequiredCourse() <em>Required Course</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredCourse()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> requiredCourse;

	/**
	 * The cached value of the '{@link #getOrganisation() <em>Organisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisation()
	 * @generated
	 * @ordered
	 */
	protected Organisation organisation;

	/**
	 * The cached value of the '{@link #getCreditreduction() <em>Creditreduction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditreduction()
	 * @generated
	 * @ordered
	 */
	protected EList<CreditReduction> creditreduction;

	/**
	 * The cached value of the '{@link #getStudyprogram() <em>Studyprogram</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyprogram()
	 * @generated
	 * @ordered
	 */
	protected EList<StudyProgram> studyprogram;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CourseworkPackage.Literals.COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourseworkPackage.COURSE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourseworkPackage.COURSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourseworkPackage.COURSE__CONTENT, oldContent,
					content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(float newSize) {
		float oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourseworkPackage.COURSE__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getRecommendedCourse() {
		if (recommendedCourse == null) {
			recommendedCourse = new EObjectResolvingEList<Course>(Course.class, this,
					CourseworkPackage.COURSE__RECOMMENDED_COURSE);
		}
		return recommendedCourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CourseInstance> getSemesterSpecificCourseInstance() {
		if (semesterSpecificCourseInstance == null) {
			semesterSpecificCourseInstance = new EObjectContainmentWithInverseEList<CourseInstance>(
					CourseInstance.class, this, CourseworkPackage.COURSE__SEMESTER_SPECIFIC_COURSE_INSTANCE,
					CourseworkPackage.COURSE_INSTANCE__COURSE);
		}
		return semesterSpecificCourseInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getRequiredCourse() {
		if (requiredCourse == null) {
			requiredCourse = new EObjectResolvingEList<Course>(Course.class, this,
					CourseworkPackage.COURSE__REQUIRED_COURSE);
		}
		return requiredCourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organisation getOrganisation() {
		if (organisation != null && organisation.eIsProxy()) {
			InternalEObject oldOrganisation = (InternalEObject) organisation;
			organisation = (Organisation) eResolveProxy(oldOrganisation);
			if (organisation != oldOrganisation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CourseworkPackage.COURSE__ORGANISATION,
							oldOrganisation, organisation));
			}
		}
		return organisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organisation basicGetOrganisation() {
		return organisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganisation(Organisation newOrganisation, NotificationChain msgs) {
		Organisation oldOrganisation = organisation;
		organisation = newOrganisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CourseworkPackage.COURSE__ORGANISATION, oldOrganisation, newOrganisation);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganisation(Organisation newOrganisation) {
		if (newOrganisation != organisation) {
			NotificationChain msgs = null;
			if (organisation != null)
				msgs = ((InternalEObject) organisation).eInverseRemove(this, CourseworkPackage.ORGANISATION__COURSE,
						Organisation.class, msgs);
			if (newOrganisation != null)
				msgs = ((InternalEObject) newOrganisation).eInverseAdd(this, CourseworkPackage.ORGANISATION__COURSE,
						Organisation.class, msgs);
			msgs = basicSetOrganisation(newOrganisation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourseworkPackage.COURSE__ORGANISATION,
					newOrganisation, newOrganisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CreditReduction> getCreditreduction() {
		if (creditreduction == null) {
			creditreduction = new EObjectContainmentEList<CreditReduction>(CreditReduction.class, this,
					CourseworkPackage.COURSE__CREDITREDUCTION);
		}
		return creditreduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StudyProgram> getStudyprogram() {
		if (studyprogram == null) {
			studyprogram = new EObjectWithInverseResolvingEList.ManyInverse<StudyProgram>(StudyProgram.class, this,
					CourseworkPackage.COURSE__STUDYPROGRAM, CourseworkPackage.STUDY_PROGRAM__COURSE);
		}
		return studyprogram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public University getUniversity() {
		if (eContainerFeatureID() != CourseworkPackage.COURSE__UNIVERSITY)
			return null;
		return (University) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUniversity(University newUniversity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newUniversity, CourseworkPackage.COURSE__UNIVERSITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniversity(University newUniversity) {
		if (newUniversity != eInternalContainer()
				|| (eContainerFeatureID() != CourseworkPackage.COURSE__UNIVERSITY && newUniversity != null)) {
			if (EcoreUtil.isAncestor(this, newUniversity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUniversity != null)
				msgs = ((InternalEObject) newUniversity).eInverseAdd(this, CourseworkPackage.UNIVERSITY__COURSE,
						University.class, msgs);
			msgs = basicSetUniversity(newUniversity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourseworkPackage.COURSE__UNIVERSITY, newUniversity,
					newUniversity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CourseworkPackage.COURSE__SEMESTER_SPECIFIC_COURSE_INSTANCE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSemesterSpecificCourseInstance())
					.basicAdd(otherEnd, msgs);
		case CourseworkPackage.COURSE__ORGANISATION:
			if (organisation != null)
				msgs = ((InternalEObject) organisation).eInverseRemove(this, CourseworkPackage.ORGANISATION__COURSE,
						Organisation.class, msgs);
			return basicSetOrganisation((Organisation) otherEnd, msgs);
		case CourseworkPackage.COURSE__STUDYPROGRAM:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getStudyprogram()).basicAdd(otherEnd, msgs);
		case CourseworkPackage.COURSE__UNIVERSITY:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetUniversity((University) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CourseworkPackage.COURSE__SEMESTER_SPECIFIC_COURSE_INSTANCE:
			return ((InternalEList<?>) getSemesterSpecificCourseInstance()).basicRemove(otherEnd, msgs);
		case CourseworkPackage.COURSE__ORGANISATION:
			return basicSetOrganisation(null, msgs);
		case CourseworkPackage.COURSE__CREDITREDUCTION:
			return ((InternalEList<?>) getCreditreduction()).basicRemove(otherEnd, msgs);
		case CourseworkPackage.COURSE__STUDYPROGRAM:
			return ((InternalEList<?>) getStudyprogram()).basicRemove(otherEnd, msgs);
		case CourseworkPackage.COURSE__UNIVERSITY:
			return basicSetUniversity(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case CourseworkPackage.COURSE__UNIVERSITY:
			return eInternalContainer().eInverseRemove(this, CourseworkPackage.UNIVERSITY__COURSE, University.class,
					msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CourseworkPackage.COURSE__CODE:
			return getCode();
		case CourseworkPackage.COURSE__NAME:
			return getName();
		case CourseworkPackage.COURSE__CONTENT:
			return getContent();
		case CourseworkPackage.COURSE__SIZE:
			return getSize();
		case CourseworkPackage.COURSE__RECOMMENDED_COURSE:
			return getRecommendedCourse();
		case CourseworkPackage.COURSE__SEMESTER_SPECIFIC_COURSE_INSTANCE:
			return getSemesterSpecificCourseInstance();
		case CourseworkPackage.COURSE__REQUIRED_COURSE:
			return getRequiredCourse();
		case CourseworkPackage.COURSE__ORGANISATION:
			if (resolve)
				return getOrganisation();
			return basicGetOrganisation();
		case CourseworkPackage.COURSE__CREDITREDUCTION:
			return getCreditreduction();
		case CourseworkPackage.COURSE__STUDYPROGRAM:
			return getStudyprogram();
		case CourseworkPackage.COURSE__UNIVERSITY:
			return getUniversity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CourseworkPackage.COURSE__CODE:
			setCode((String) newValue);
			return;
		case CourseworkPackage.COURSE__NAME:
			setName((String) newValue);
			return;
		case CourseworkPackage.COURSE__CONTENT:
			setContent((String) newValue);
			return;
		case CourseworkPackage.COURSE__SIZE:
			setSize((Float) newValue);
			return;
		case CourseworkPackage.COURSE__RECOMMENDED_COURSE:
			getRecommendedCourse().clear();
			getRecommendedCourse().addAll((Collection<? extends Course>) newValue);
			return;
		case CourseworkPackage.COURSE__SEMESTER_SPECIFIC_COURSE_INSTANCE:
			getSemesterSpecificCourseInstance().clear();
			getSemesterSpecificCourseInstance().addAll((Collection<? extends CourseInstance>) newValue);
			return;
		case CourseworkPackage.COURSE__REQUIRED_COURSE:
			getRequiredCourse().clear();
			getRequiredCourse().addAll((Collection<? extends Course>) newValue);
			return;
		case CourseworkPackage.COURSE__ORGANISATION:
			setOrganisation((Organisation) newValue);
			return;
		case CourseworkPackage.COURSE__CREDITREDUCTION:
			getCreditreduction().clear();
			getCreditreduction().addAll((Collection<? extends CreditReduction>) newValue);
			return;
		case CourseworkPackage.COURSE__STUDYPROGRAM:
			getStudyprogram().clear();
			getStudyprogram().addAll((Collection<? extends StudyProgram>) newValue);
			return;
		case CourseworkPackage.COURSE__UNIVERSITY:
			setUniversity((University) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CourseworkPackage.COURSE__CODE:
			setCode(CODE_EDEFAULT);
			return;
		case CourseworkPackage.COURSE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CourseworkPackage.COURSE__CONTENT:
			setContent(CONTENT_EDEFAULT);
			return;
		case CourseworkPackage.COURSE__SIZE:
			setSize(SIZE_EDEFAULT);
			return;
		case CourseworkPackage.COURSE__RECOMMENDED_COURSE:
			getRecommendedCourse().clear();
			return;
		case CourseworkPackage.COURSE__SEMESTER_SPECIFIC_COURSE_INSTANCE:
			getSemesterSpecificCourseInstance().clear();
			return;
		case CourseworkPackage.COURSE__REQUIRED_COURSE:
			getRequiredCourse().clear();
			return;
		case CourseworkPackage.COURSE__ORGANISATION:
			setOrganisation((Organisation) null);
			return;
		case CourseworkPackage.COURSE__CREDITREDUCTION:
			getCreditreduction().clear();
			return;
		case CourseworkPackage.COURSE__STUDYPROGRAM:
			getStudyprogram().clear();
			return;
		case CourseworkPackage.COURSE__UNIVERSITY:
			setUniversity((University) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CourseworkPackage.COURSE__CODE:
			return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
		case CourseworkPackage.COURSE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CourseworkPackage.COURSE__CONTENT:
			return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
		case CourseworkPackage.COURSE__SIZE:
			return size != SIZE_EDEFAULT;
		case CourseworkPackage.COURSE__RECOMMENDED_COURSE:
			return recommendedCourse != null && !recommendedCourse.isEmpty();
		case CourseworkPackage.COURSE__SEMESTER_SPECIFIC_COURSE_INSTANCE:
			return semesterSpecificCourseInstance != null && !semesterSpecificCourseInstance.isEmpty();
		case CourseworkPackage.COURSE__REQUIRED_COURSE:
			return requiredCourse != null && !requiredCourse.isEmpty();
		case CourseworkPackage.COURSE__ORGANISATION:
			return organisation != null;
		case CourseworkPackage.COURSE__CREDITREDUCTION:
			return creditreduction != null && !creditreduction.isEmpty();
		case CourseworkPackage.COURSE__STUDYPROGRAM:
			return studyprogram != null && !studyprogram.isEmpty();
		case CourseworkPackage.COURSE__UNIVERSITY:
			return getUniversity() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (code: ");
		result.append(code);
		result.append(", name: ");
		result.append(name);
		result.append(", content: ");
		result.append(content);
		result.append(", size: ");
		result.append(size);
		result.append(')');
		return result.toString();
	}

} //CourseImpl
