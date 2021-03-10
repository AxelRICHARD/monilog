/**
 * generated by Xtext 2.24.0
 */
package org.gemoc.monilog.moniLog4DSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stream Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.monilog.moniLog4DSL.StreamEvent#getEvent <em>Event</em>}</li>
 *   <li>{@link org.gemoc.monilog.moniLog4DSL.StreamEvent#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage#getStreamEvent()
 * @model
 * @generated
 */
public interface StreamEvent extends EObject
{
  /**
   * Returns the value of the '<em><b>Event</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' reference.
   * @see #setEvent(Event)
   * @see org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage#getStreamEvent_Event()
   * @model
   * @generated
   */
  Event getEvent();

  /**
   * Sets the value of the '{@link org.gemoc.monilog.moniLog4DSL.StreamEvent#getEvent <em>Event</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' reference.
   * @see #getEvent()
   * @generated
   */
  void setEvent(Event value);

  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link org.gemoc.monilog.moniLog4DSL.EmptyOrPropertyValue}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage#getStreamEvent_Values()
   * @model containment="true"
   * @generated
   */
  EList<EmptyOrPropertyValue> getValues();

} // StreamEvent
