/**
 * generated by Xtext 2.24.0
 */
package org.gemoc.monilog.moniLog4DSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage;
import org.gemoc.monilog.moniLog4DSL.MoniLogger;
import org.gemoc.monilog.moniLog4DSL.MoniloggerCall;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monilogger Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.monilog.moniLog4DSL.impl.MoniloggerCallImpl#getMonilogger <em>Monilogger</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MoniloggerCallImpl extends ActionImpl implements MoniloggerCall
{
  /**
   * The cached value of the '{@link #getMonilogger() <em>Monilogger</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMonilogger()
   * @generated
   * @ordered
   */
  protected MoniLogger monilogger;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MoniloggerCallImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MoniLog4DSLPackage.Literals.MONILOGGER_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MoniLogger getMonilogger()
  {
    if (monilogger != null && monilogger.eIsProxy())
    {
      InternalEObject oldMonilogger = (InternalEObject)monilogger;
      monilogger = (MoniLogger)eResolveProxy(oldMonilogger);
      if (monilogger != oldMonilogger)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MoniLog4DSLPackage.MONILOGGER_CALL__MONILOGGER, oldMonilogger, monilogger));
      }
    }
    return monilogger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MoniLogger basicGetMonilogger()
  {
    return monilogger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMonilogger(MoniLogger newMonilogger)
  {
    MoniLogger oldMonilogger = monilogger;
    monilogger = newMonilogger;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MoniLog4DSLPackage.MONILOGGER_CALL__MONILOGGER, oldMonilogger, monilogger));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MoniLog4DSLPackage.MONILOGGER_CALL__MONILOGGER:
        if (resolve) return getMonilogger();
        return basicGetMonilogger();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MoniLog4DSLPackage.MONILOGGER_CALL__MONILOGGER:
        setMonilogger((MoniLogger)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MoniLog4DSLPackage.MONILOGGER_CALL__MONILOGGER:
        setMonilogger((MoniLogger)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MoniLog4DSLPackage.MONILOGGER_CALL__MONILOGGER:
        return monilogger != null;
    }
    return super.eIsSet(featureID);
  }

} //MoniloggerCallImpl