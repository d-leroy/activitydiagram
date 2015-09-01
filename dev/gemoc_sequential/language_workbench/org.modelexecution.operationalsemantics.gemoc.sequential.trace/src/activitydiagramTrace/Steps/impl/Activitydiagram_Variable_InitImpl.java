/**
 */
package activitydiagramTrace.Steps.impl;

import activitydiagramTrace.ActivitydiagramTracePackage;
import activitydiagramTrace.State;

import activitydiagramTrace.Steps.Activitydiagram_Variable_Init;
import activitydiagramTrace.Steps.SmallStep;
import activitydiagramTrace.Steps.StepsPackage;

import activitydiagramTrace.Traced.activitydiagram.TracedVariable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activitydiagram Variable Init</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activitydiagramTrace.Steps.impl.Activitydiagram_Variable_InitImpl#getPrecedingState <em>Preceding State</em>}</li>
 *   <li>{@link activitydiagramTrace.Steps.impl.Activitydiagram_Variable_InitImpl#getThis <em>This</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Activitydiagram_Variable_InitImpl extends Activitydiagram_Activity_Execute_AbstractSubEventImpl implements Activitydiagram_Variable_Init {
	/**
	 * The cached value of the '{@link #getPrecedingState() <em>Preceding State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedingState()
	 * @generated
	 * @ordered
	 */
	protected State precedingState;

	/**
	 * The cached value of the '{@link #getThis() <em>This</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThis()
	 * @generated
	 * @ordered
	 */
	protected TracedVariable this_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Activitydiagram_Variable_InitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.ACTIVITYDIAGRAM_VARIABLE_INIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getPrecedingState() {
		if (precedingState != null && precedingState.eIsProxy()) {
			InternalEObject oldPrecedingState = (InternalEObject)precedingState;
			precedingState = (State)eResolveProxy(oldPrecedingState);
			if (precedingState != oldPrecedingState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StepsPackage.ACTIVITYDIAGRAM_VARIABLE_INIT__PRECEDING_STATE, oldPrecedingState, precedingState));
			}
		}
		return precedingState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetPrecedingState() {
		return precedingState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecedingState(State newPrecedingState, NotificationChain msgs) {
		State oldPrecedingState = precedingState;
		precedingState = newPrecedingState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StepsPackage.ACTIVITYDIAGRAM_VARIABLE_INIT__PRECEDING_STATE, oldPrecedingState, newPrecedingState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecedingState(State newPrecedingState) {
		if (newPrecedingState != precedingState) {
			NotificationChain msgs = null;
			if (precedingState != null)
				msgs = ((InternalEObject)precedingState).eInverseRemove(this, ActivitydiagramTracePackage.STATE__FOLLOWING_STEP, State.class, msgs);
			if (newPrecedingState != null)
				msgs = ((InternalEObject)newPrecedingState).eInverseAdd(this, ActivitydiagramTracePackage.STATE__FOLLOWING_STEP, State.class, msgs);
			msgs = basicSetPrecedingState(newPrecedingState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StepsPackage.ACTIVITYDIAGRAM_VARIABLE_INIT__PRECEDING_STATE, newPrecedingState, newPrecedingState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedVariable getThis() {
		if (this_ != null && this_.eIsProxy()) {
			InternalEObject oldThis = (InternalEObject)this_;
			this_ = (TracedVariable)eResolveProxy(oldThis);
			if (this_ != oldThis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StepsPackage.ACTIVITYDIAGRAM_VARIABLE_INIT__THIS, oldThis, this_));
			}
		}
		return this_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedVariable basicGetThis() {
		return this_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThis(TracedVariable newThis) {
		TracedVariable oldThis = this_;
		this_ = newThis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StepsPackage.ACTIVITYDIAGRAM_VARIABLE_INIT__THIS, oldThis, this_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StepsPackage.ACTIVITYDIAGRAM_VARIABLE_INIT__PRECEDING_STATE:
				if (precedingState != null)
					msgs = ((InternalEObject)precedingState).eInverseRemove(this, ActivitydiagramTracePackage.STATE__FOLLOWING_STEP, State.class, msgs);
				return basicSetPrecedingState((State)otherEnd, msgs);
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
			case StepsPackage.ACTIVITYDIAGRAM_VARIABLE_INIT__PRECEDING_STATE:
				return basicSetPrecedingState(null, msgs);
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
			case StepsPackage.ACTIVITYDIAGRAM_VARIABLE_INIT__PRECEDING_STATE:
				if (resolve) return getPrecedingState();
				return basicGetPrecedingState();
			case StepsPackage.ACTIVITYDIAGRAM_VARIABLE_INIT__THIS:
				if (resolve) return getThis();
				return basicGetThis();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StepsPackage.ACTIVITYDIAGRAM_VARIABLE_INIT__PRECEDING_STATE:
				setPrecedingState((State)newValue);
				return;
			case StepsPackage.ACTIVITYDIAGRAM_VARIABLE_INIT__THIS:
				setThis((TracedVariable)newValue);
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
			case StepsPackage.ACTIVITYDIAGRAM_VARIABLE_INIT__PRECEDING_STATE:
				setPrecedingState((State)null);
				return;
			case StepsPackage.ACTIVITYDIAGRAM_VARIABLE_INIT__THIS:
				setThis((TracedVariable)null);
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
			case StepsPackage.ACTIVITYDIAGRAM_VARIABLE_INIT__PRECEDING_STATE:
				return precedingState != null;
			case StepsPackage.ACTIVITYDIAGRAM_VARIABLE_INIT__THIS:
				return this_ != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SmallStep.class) {
			switch (derivedFeatureID) {
				case StepsPackage.ACTIVITYDIAGRAM_VARIABLE_INIT__PRECEDING_STATE: return StepsPackage.SMALL_STEP__PRECEDING_STATE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SmallStep.class) {
			switch (baseFeatureID) {
				case StepsPackage.SMALL_STEP__PRECEDING_STATE: return StepsPackage.ACTIVITYDIAGRAM_VARIABLE_INIT__PRECEDING_STATE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //Activitydiagram_Variable_InitImpl