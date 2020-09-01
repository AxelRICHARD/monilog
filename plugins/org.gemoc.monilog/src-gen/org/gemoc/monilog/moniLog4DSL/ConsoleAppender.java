/**
 * generated by Xtext 2.22.0
 */
package org.gemoc.monilog.moniLog4DSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Console Appender</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.monilog.moniLog4DSL.ConsoleAppender#getLayout <em>Layout</em>}</li>
 * </ul>
 *
 * @see org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage#getConsoleAppender()
 * @model
 * @generated
 */
public interface ConsoleAppender extends Appender
{
  /**
   * Returns the value of the '<em><b>Layout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layout</em>' containment reference.
   * @see #setLayout(Layout)
   * @see org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage#getConsoleAppender_Layout()
   * @model containment="true"
   * @generated
   */
  Layout getLayout();

  /**
   * Sets the value of the '{@link org.gemoc.monilog.moniLog4DSL.ConsoleAppender#getLayout <em>Layout</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Layout</em>' containment reference.
   * @see #getLayout()
   * @generated
   */
  void setLayout(Layout value);

} // ConsoleAppender