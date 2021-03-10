/**
 * generated by Xtext 2.24.0
 */
package org.gemoc.monilog.moniLog4DSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emit Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.monilog.moniLog4DSL.EmitEvent#getEvent <em>Event</em>}</li>
 *   <li>{@link org.gemoc.monilog.moniLog4DSL.EmitEvent#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage#getEmitEvent()
 * @model
 * @generated
 */
public interface EmitEvent extends Action
{
  /**
   * Returns the value of the '<em><b>Event</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' reference.
   * @see #setEvent(UserEvent)
   * @see org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage#getEmitEvent_Event()
   * @model
   * @generated
   */
  UserEvent getEvent();

  /**
   * Sets the value of the '{@link org.gemoc.monilog.moniLog4DSL.EmitEvent#getEvent <em>Event</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' reference.
   * @see #getEvent()
   * @generated
   */
  void setEvent(UserEvent value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link org.gemoc.monilog.moniLog4DSL.Expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage#getEmitEvent_Args()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getArgs();

} // EmitEvent
