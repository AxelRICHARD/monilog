/**
 * generated by Xtext 2.24.0
 */
package org.gemoc.monilog.moniLog4DSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.monilog.moniLog4DSL.ComplexEvent#getKind <em>Kind</em>}</li>
 *   <li>{@link org.gemoc.monilog.moniLog4DSL.ComplexEvent#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @see org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage#getComplexEvent()
 * @model
 * @generated
 */
public interface ComplexEvent extends Event
{
  /**
   * Returns the value of the '<em><b>Kind</b></em>' attribute.
   * The literals are from the enumeration {@link org.gemoc.monilog.moniLog4DSL.TemporalPatternKind}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' attribute.
   * @see org.gemoc.monilog.moniLog4DSL.TemporalPatternKind
   * @see #setKind(TemporalPatternKind)
   * @see org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage#getComplexEvent_Kind()
   * @model
   * @generated
   */
  TemporalPatternKind getKind();

  /**
   * Sets the value of the '{@link org.gemoc.monilog.moniLog4DSL.ComplexEvent#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see org.gemoc.monilog.moniLog4DSL.TemporalPatternKind
   * @see #getKind()
   * @generated
   */
  void setKind(TemporalPatternKind value);

  /**
   * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' containment reference.
   * @see #setPattern(TemporalPattern)
   * @see org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage#getComplexEvent_Pattern()
   * @model containment="true"
   * @generated
   */
  TemporalPattern getPattern();

  /**
   * Sets the value of the '{@link org.gemoc.monilog.moniLog4DSL.ComplexEvent#getPattern <em>Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' containment reference.
   * @see #getPattern()
   * @generated
   */
  void setPattern(TemporalPattern value);

} // ComplexEvent