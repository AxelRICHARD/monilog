/**
 * generated by Xtext 2.24.0
 */
package org.gemoc.monilog.moniLog4DSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.monilog.moniLog4DSL.Condition#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(LanguageExpression)
   * @see org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage#getCondition_Expression()
   * @model containment="true"
   * @generated
   */
  LanguageExpression getExpression();

  /**
   * Sets the value of the '{@link org.gemoc.monilog.moniLog4DSL.Condition#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(LanguageExpression value);

} // Condition
