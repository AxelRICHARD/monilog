/**
 * generated by Xtext 2.24.0
 */
package org.gemoc.monilog.moniLog4DSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gemoc.monilog.moniLog4DSL.MoniLog4DSLPackage;
import org.gemoc.monilog.moniLog4DSL.Parameter;
import org.gemoc.monilog.moniLog4DSL.ParameterDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.monilog.moniLog4DSL.impl.ParameterDeclImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.gemoc.monilog.moniLog4DSL.impl.ParameterDeclImpl#getVarArgs <em>Var Args</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterDeclImpl extends MinimalEObjectImpl.Container implements ParameterDecl
{
  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<Parameter> parameters;

  /**
   * The cached value of the '{@link #getVarArgs() <em>Var Args</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarArgs()
   * @generated
   * @ordered
   */
  protected Parameter varArgs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterDeclImpl()
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
    return MoniLog4DSLPackage.Literals.PARAMETER_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Parameter> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, MoniLog4DSLPackage.PARAMETER_DECL__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parameter getVarArgs()
  {
    return varArgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVarArgs(Parameter newVarArgs, NotificationChain msgs)
  {
    Parameter oldVarArgs = varArgs;
    varArgs = newVarArgs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MoniLog4DSLPackage.PARAMETER_DECL__VAR_ARGS, oldVarArgs, newVarArgs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVarArgs(Parameter newVarArgs)
  {
    if (newVarArgs != varArgs)
    {
      NotificationChain msgs = null;
      if (varArgs != null)
        msgs = ((InternalEObject)varArgs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MoniLog4DSLPackage.PARAMETER_DECL__VAR_ARGS, null, msgs);
      if (newVarArgs != null)
        msgs = ((InternalEObject)newVarArgs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MoniLog4DSLPackage.PARAMETER_DECL__VAR_ARGS, null, msgs);
      msgs = basicSetVarArgs(newVarArgs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MoniLog4DSLPackage.PARAMETER_DECL__VAR_ARGS, newVarArgs, newVarArgs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MoniLog4DSLPackage.PARAMETER_DECL__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case MoniLog4DSLPackage.PARAMETER_DECL__VAR_ARGS:
        return basicSetVarArgs(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case MoniLog4DSLPackage.PARAMETER_DECL__PARAMETERS:
        return getParameters();
      case MoniLog4DSLPackage.PARAMETER_DECL__VAR_ARGS:
        return getVarArgs();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MoniLog4DSLPackage.PARAMETER_DECL__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends Parameter>)newValue);
        return;
      case MoniLog4DSLPackage.PARAMETER_DECL__VAR_ARGS:
        setVarArgs((Parameter)newValue);
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
      case MoniLog4DSLPackage.PARAMETER_DECL__PARAMETERS:
        getParameters().clear();
        return;
      case MoniLog4DSLPackage.PARAMETER_DECL__VAR_ARGS:
        setVarArgs((Parameter)null);
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
      case MoniLog4DSLPackage.PARAMETER_DECL__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case MoniLog4DSLPackage.PARAMETER_DECL__VAR_ARGS:
        return varArgs != null;
    }
    return super.eIsSet(featureID);
  }

} //ParameterDeclImpl