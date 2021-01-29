/**
 * generated by Xtext 2.24.0
 */
package org.gemoc.monilog.moniLog4DSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>After</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.monilog.moniLog4DSL.After#getLowerBound <em>Lower Bound</em>}</li>
 * </ul>
 *
 * @see org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage#getAfter()
 * @model
 * @generated
 */
public interface After extends Scope
{
  /**
   * Returns the value of the '<em><b>Lower Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lower Bound</em>' containment reference.
   * @see #setLowerBound(StreamEvent)
   * @see org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage#getAfter_LowerBound()
   * @model containment="true"
   * @generated
   */
  StreamEvent getLowerBound();

  /**
   * Sets the value of the '{@link org.gemoc.monilog.moniLog4DSL.After#getLowerBound <em>Lower Bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lower Bound</em>' containment reference.
   * @see #getLowerBound()
   * @generated
   */
  void setLowerBound(StreamEvent value);

} // After
