/**
 * generated by Xtext 2.22.0
 */
package org.gemoc.monilog.moniLog4DSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.monilog.moniLog4DSL.Layout#getName <em>Name</em>}</li>
 *   <li>{@link org.gemoc.monilog.moniLog4DSL.Layout#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage#getLayout()
 * @model
 * @generated
 */
public interface Layout extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage#getLayout_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.gemoc.monilog.moniLog4DSL.Layout#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.gemoc.monilog.moniLog4DSL.Parameter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage#getLayout_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParameters();

} // Layout
