/**
 * generated by Xtext 2.21.0
 */
package org.gemoc.monilog.moniLog;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Div</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.monilog.moniLog.Div#getLeft <em>Left</em>}</li>
 *   <li>{@link org.gemoc.monilog.moniLog.Div#getOp <em>Op</em>}</li>
 *   <li>{@link org.gemoc.monilog.moniLog.Div#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.gemoc.monilog.moniLog.MoniLogPackage#getDiv()
 * @model
 * @generated
 */
public interface Div extends SimpleExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(SimpleExpression)
   * @see org.gemoc.monilog.moniLog.MoniLogPackage#getDiv_Left()
   * @model containment="true"
   * @generated
   */
  SimpleExpression getLeft();

  /**
   * Sets the value of the '{@link org.gemoc.monilog.moniLog.Div#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(SimpleExpression value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see org.gemoc.monilog.moniLog.MoniLogPackage#getDiv_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link org.gemoc.monilog.moniLog.Div#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(SimpleExpression)
   * @see org.gemoc.monilog.moniLog.MoniLogPackage#getDiv_Right()
   * @model containment="true"
   * @generated
   */
  SimpleExpression getRight();

  /**
   * Sets the value of the '{@link org.gemoc.monilog.moniLog.Div#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(SimpleExpression value);

} // Div