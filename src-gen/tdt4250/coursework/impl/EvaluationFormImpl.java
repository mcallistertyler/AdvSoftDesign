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
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.coursework.Assignment;
import tdt4250.coursework.CourseworkPackage;
import tdt4250.coursework.EvaluationForm;
import tdt4250.coursework.Exam;
import tdt4250.coursework.Project;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.coursework.impl.EvaluationFormImpl#getProject <em>Project</em>}</li>
 *   <li>{@link tdt4250.coursework.impl.EvaluationFormImpl#getExam <em>Exam</em>}</li>
 *   <li>{@link tdt4250.coursework.impl.EvaluationFormImpl#getAssignment <em>Assignment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvaluationFormImpl extends MinimalEObjectImpl.Container implements EvaluationForm {
	/**
	 * The cached value of the '{@link #getProject() <em>Project</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected EList<Project> project;

	/**
	 * The cached value of the '{@link #getExam() <em>Exam</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExam()
	 * @generated
	 * @ordered
	 */
	protected Exam exam;

	/**
	 * The cached value of the '{@link #getAssignment() <em>Assignment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignment()
	 * @generated
	 * @ordered
	 */
	protected EList<Assignment> assignment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluationFormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CourseworkPackage.Literals.EVALUATION_FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Project> getProject() {
		if (project == null) {
			project = new EObjectContainmentEList<Project>(Project.class, this,
					CourseworkPackage.EVALUATION_FORM__PROJECT);
		}
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exam getExam() {
		return exam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExam(Exam newExam, NotificationChain msgs) {
		Exam oldExam = exam;
		exam = newExam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CourseworkPackage.EVALUATION_FORM__EXAM, oldExam, newExam);
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
	public void setExam(Exam newExam) {
		if (newExam != exam) {
			NotificationChain msgs = null;
			if (exam != null)
				msgs = ((InternalEObject) exam).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CourseworkPackage.EVALUATION_FORM__EXAM, null, msgs);
			if (newExam != null)
				msgs = ((InternalEObject) newExam).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CourseworkPackage.EVALUATION_FORM__EXAM, null, msgs);
			msgs = basicSetExam(newExam, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourseworkPackage.EVALUATION_FORM__EXAM, newExam,
					newExam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assignment> getAssignment() {
		if (assignment == null) {
			assignment = new EObjectContainmentEList<Assignment>(Assignment.class, this,
					CourseworkPackage.EVALUATION_FORM__ASSIGNMENT);
		}
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CourseworkPackage.EVALUATION_FORM__PROJECT:
			return ((InternalEList<?>) getProject()).basicRemove(otherEnd, msgs);
		case CourseworkPackage.EVALUATION_FORM__EXAM:
			return basicSetExam(null, msgs);
		case CourseworkPackage.EVALUATION_FORM__ASSIGNMENT:
			return ((InternalEList<?>) getAssignment()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CourseworkPackage.EVALUATION_FORM__PROJECT:
			return getProject();
		case CourseworkPackage.EVALUATION_FORM__EXAM:
			return getExam();
		case CourseworkPackage.EVALUATION_FORM__ASSIGNMENT:
			return getAssignment();
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
		case CourseworkPackage.EVALUATION_FORM__PROJECT:
			getProject().clear();
			getProject().addAll((Collection<? extends Project>) newValue);
			return;
		case CourseworkPackage.EVALUATION_FORM__EXAM:
			setExam((Exam) newValue);
			return;
		case CourseworkPackage.EVALUATION_FORM__ASSIGNMENT:
			getAssignment().clear();
			getAssignment().addAll((Collection<? extends Assignment>) newValue);
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
		case CourseworkPackage.EVALUATION_FORM__PROJECT:
			getProject().clear();
			return;
		case CourseworkPackage.EVALUATION_FORM__EXAM:
			setExam((Exam) null);
			return;
		case CourseworkPackage.EVALUATION_FORM__ASSIGNMENT:
			getAssignment().clear();
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
		case CourseworkPackage.EVALUATION_FORM__PROJECT:
			return project != null && !project.isEmpty();
		case CourseworkPackage.EVALUATION_FORM__EXAM:
			return exam != null;
		case CourseworkPackage.EVALUATION_FORM__ASSIGNMENT:
			return assignment != null && !assignment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EvaluationFormImpl
