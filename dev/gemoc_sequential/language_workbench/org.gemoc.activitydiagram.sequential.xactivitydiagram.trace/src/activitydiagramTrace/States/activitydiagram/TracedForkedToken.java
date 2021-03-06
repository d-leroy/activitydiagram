/**
 */
package activitydiagramTrace.States.activitydiagram;

import activitydiagramTrace.States.ForkedToken_baseToken_Value;
import activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Forked Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedForkedToken#getBaseTokenSequence <em>Base Token Sequence</em>}</li>
 *   <li>{@link activitydiagramTrace.States.activitydiagram.TracedForkedToken#getRemainingOffersCountSequence <em>Remaining Offers Count Sequence</em>}</li>
 * </ul>
 *
 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedForkedToken()
 * @model
 * @generated
 */
public interface TracedForkedToken extends TracedToken {
	/**
	 * Returns the value of the '<em><b>Base Token Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.ForkedToken_baseToken_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.ForkedToken_baseToken_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Token Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Token Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedForkedToken_BaseTokenSequence()
	 * @see activitydiagramTrace.States.ForkedToken_baseToken_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ForkedToken_baseToken_Value> getBaseTokenSequence();

	/**
	 * Returns the value of the '<em><b>Remaining Offers Count Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value}.
	 * It is bidirectional and its opposite is '{@link activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remaining Offers Count Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remaining Offers Count Sequence</em>' containment reference list.
	 * @see activitydiagramTrace.States.activitydiagram.ActivitydiagramPackage#getTracedForkedToken_RemainingOffersCountSequence()
	 * @see activitydiagramTrace.States.ForkedToken_remainingOffersCount_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ForkedToken_remainingOffersCount_Value> getRemainingOffersCountSequence();

} // TracedForkedToken
