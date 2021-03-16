/**
 * generated by Xtext 2.21.0
 */
package org.gemoc.monilog.moniLog.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.gemoc.monilog.moniLog.FileAlias;
import org.gemoc.monilog.moniLog.Import;
import org.gemoc.monilog.moniLog.MoniLogPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.monilog.moniLog.impl.ImportImpl#getImportedNamespace <em>Imported Namespace</em>}</li>
 *   <li>{@link org.gemoc.monilog.moniLog.impl.ImportImpl#getFileURI <em>File URI</em>}</li>
 *   <li>{@link org.gemoc.monilog.moniLog.impl.ImportImpl#getAlias <em>Alias</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportImpl extends MinimalEObjectImpl.Container implements Import
{
  /**
   * The default value of the '{@link #getImportedNamespace() <em>Imported Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedNamespace()
   * @generated
   * @ordered
   */
  protected static final String IMPORTED_NAMESPACE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImportedNamespace() <em>Imported Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedNamespace()
   * @generated
   * @ordered
   */
  protected String importedNamespace = IMPORTED_NAMESPACE_EDEFAULT;

  /**
   * The default value of the '{@link #getFileURI() <em>File URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFileURI()
   * @generated
   * @ordered
   */
  protected static final String FILE_URI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFileURI() <em>File URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFileURI()
   * @generated
   * @ordered
   */
  protected String fileURI = FILE_URI_EDEFAULT;

  /**
   * The cached value of the '{@link #getAlias() <em>Alias</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlias()
   * @generated
   * @ordered
   */
  protected FileAlias alias;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImportImpl()
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
    return MoniLogPackage.Literals.IMPORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getImportedNamespace()
  {
    return importedNamespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setImportedNamespace(String newImportedNamespace)
  {
    String oldImportedNamespace = importedNamespace;
    importedNamespace = newImportedNamespace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MoniLogPackage.IMPORT__IMPORTED_NAMESPACE, oldImportedNamespace, importedNamespace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFileURI()
  {
    return fileURI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFileURI(String newFileURI)
  {
    String oldFileURI = fileURI;
    fileURI = newFileURI;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MoniLogPackage.IMPORT__FILE_URI, oldFileURI, fileURI));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FileAlias getAlias()
  {
    return alias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlias(FileAlias newAlias, NotificationChain msgs)
  {
    FileAlias oldAlias = alias;
    alias = newAlias;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MoniLogPackage.IMPORT__ALIAS, oldAlias, newAlias);
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
  public void setAlias(FileAlias newAlias)
  {
    if (newAlias != alias)
    {
      NotificationChain msgs = null;
      if (alias != null)
        msgs = ((InternalEObject)alias).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MoniLogPackage.IMPORT__ALIAS, null, msgs);
      if (newAlias != null)
        msgs = ((InternalEObject)newAlias).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MoniLogPackage.IMPORT__ALIAS, null, msgs);
      msgs = basicSetAlias(newAlias, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MoniLogPackage.IMPORT__ALIAS, newAlias, newAlias));
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
      case MoniLogPackage.IMPORT__ALIAS:
        return basicSetAlias(null, msgs);
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
      case MoniLogPackage.IMPORT__IMPORTED_NAMESPACE:
        return getImportedNamespace();
      case MoniLogPackage.IMPORT__FILE_URI:
        return getFileURI();
      case MoniLogPackage.IMPORT__ALIAS:
        return getAlias();
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
      case MoniLogPackage.IMPORT__IMPORTED_NAMESPACE:
        setImportedNamespace((String)newValue);
        return;
      case MoniLogPackage.IMPORT__FILE_URI:
        setFileURI((String)newValue);
        return;
      case MoniLogPackage.IMPORT__ALIAS:
        setAlias((FileAlias)newValue);
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
      case MoniLogPackage.IMPORT__IMPORTED_NAMESPACE:
        setImportedNamespace(IMPORTED_NAMESPACE_EDEFAULT);
        return;
      case MoniLogPackage.IMPORT__FILE_URI:
        setFileURI(FILE_URI_EDEFAULT);
        return;
      case MoniLogPackage.IMPORT__ALIAS:
        setAlias((FileAlias)null);
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
      case MoniLogPackage.IMPORT__IMPORTED_NAMESPACE:
        return IMPORTED_NAMESPACE_EDEFAULT == null ? importedNamespace != null : !IMPORTED_NAMESPACE_EDEFAULT.equals(importedNamespace);
      case MoniLogPackage.IMPORT__FILE_URI:
        return FILE_URI_EDEFAULT == null ? fileURI != null : !FILE_URI_EDEFAULT.equals(fileURI);
      case MoniLogPackage.IMPORT__ALIAS:
        return alias != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (importedNamespace: ");
    result.append(importedNamespace);
    result.append(", fileURI: ");
    result.append(fileURI);
    result.append(')');
    return result.toString();
  }

} //ImportImpl
