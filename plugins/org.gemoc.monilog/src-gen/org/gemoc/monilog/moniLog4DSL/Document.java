/**
 * generated by Xtext 2.24.0
 */
package org.gemoc.monilog.moniLog4DSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.monilog.moniLog4DSL.Document#getName <em>Name</em>}</li>
 *   <li>{@link org.gemoc.monilog.moniLog4DSL.Document#getImports <em>Imports</em>}</li>
 *   <li>{@link org.gemoc.monilog.moniLog4DSL.Document#getEvents <em>Events</em>}</li>
 *   <li>{@link org.gemoc.monilog.moniLog4DSL.Document#getAppenders <em>Appenders</em>}</li>
 *   <li>{@link org.gemoc.monilog.moniLog4DSL.Document#getLayouts <em>Layouts</em>}</li>
 *   <li>{@link org.gemoc.monilog.moniLog4DSL.Document#getMoniloggers <em>Moniloggers</em>}</li>
 * </ul>
 *
 * @see org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage#getDocument()
 * @model
 * @generated
 */
public interface Document extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage#getDocument_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.gemoc.monilog.moniLog4DSL.Document#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.gemoc.monilog.moniLog4DSL.Import}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage#getDocument_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Events</b></em>' containment reference list.
   * The list contents are of type {@link org.gemoc.monilog.moniLog4DSL.Event}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Events</em>' containment reference list.
   * @see org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage#getDocument_Events()
   * @model containment="true"
   * @generated
   */
  EList<Event> getEvents();

  /**
   * Returns the value of the '<em><b>Appenders</b></em>' containment reference list.
   * The list contents are of type {@link org.gemoc.monilog.moniLog4DSL.Appender}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Appenders</em>' containment reference list.
   * @see org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage#getDocument_Appenders()
   * @model containment="true"
   * @generated
   */
  EList<Appender> getAppenders();

  /**
   * Returns the value of the '<em><b>Layouts</b></em>' containment reference list.
   * The list contents are of type {@link org.gemoc.monilog.moniLog4DSL.Layout}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layouts</em>' containment reference list.
   * @see org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage#getDocument_Layouts()
   * @model containment="true"
   * @generated
   */
  EList<Layout> getLayouts();

  /**
   * Returns the value of the '<em><b>Moniloggers</b></em>' containment reference list.
   * The list contents are of type {@link org.gemoc.monilog.moniLog4DSL.MoniLogger}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Moniloggers</em>' containment reference list.
   * @see org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage#getDocument_Moniloggers()
   * @model containment="true"
   * @generated
   */
  EList<MoniLogger> getMoniloggers();

} // Document
