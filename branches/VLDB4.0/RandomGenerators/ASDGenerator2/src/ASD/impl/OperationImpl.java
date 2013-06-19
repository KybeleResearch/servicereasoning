/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ASD.impl;

import ASD.ASDPackage;
import ASD.EEnumOp;
import ASD.Message;
import ASD.Operation;
import ASD.ServiceDescription;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ASD.impl.OperationImpl#getMessagePattern <em>Message Pattern</em>}</li>
 *   <li>{@link ASD.impl.OperationImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link ASD.impl.OperationImpl#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends NamedElementImpl implements Operation
{
  /**
   * The default value of the '{@link #getMessagePattern() <em>Message Pattern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessagePattern()
   * @generated
   * @ordered
   */
  protected static final EEnumOp MESSAGE_PATTERN_EDEFAULT = EEnumOp.ONEWAY;

  /**
   * The cached value of the '{@link #getMessagePattern() <em>Message Pattern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessagePattern()
   * @generated
   * @ordered
   */
  protected EEnumOp messagePattern = MESSAGE_PATTERN_EDEFAULT;

  /**
   * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContents()
   * @generated
   * @ordered
   */
  protected EList<Message> contents;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperationImpl()
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
    return ASDPackage.Literals.OPERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnumOp getMessagePattern()
  {
    return messagePattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMessagePattern(EEnumOp newMessagePattern)
  {
    EEnumOp oldMessagePattern = messagePattern;
    messagePattern = newMessagePattern == null ? MESSAGE_PATTERN_EDEFAULT : newMessagePattern;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ASDPackage.OPERATION__MESSAGE_PATTERN, oldMessagePattern, messagePattern));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Message> getContents()
  {
    if (contents == null)
    {
      contents = new EObjectContainmentWithInverseEList<Message>(Message.class, this, ASDPackage.OPERATION__CONTENTS, ASDPackage.MESSAGE__OPERATION);
    }
    return contents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceDescription getService()
  {
    if (eContainerFeatureID() != ASDPackage.OPERATION__SERVICE) return null;
    return (ServiceDescription)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetService(ServiceDescription newService, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newService, ASDPackage.OPERATION__SERVICE, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setService(ServiceDescription newService)
  {
    if (newService != eInternalContainer() || (eContainerFeatureID() != ASDPackage.OPERATION__SERVICE && newService != null))
    {
      if (EcoreUtil.isAncestor(this, newService))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newService != null)
        msgs = ((InternalEObject)newService).eInverseAdd(this, ASDPackage.SERVICE_DESCRIPTION__OPERATIONS, ServiceDescription.class, msgs);
      msgs = basicSetService(newService, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ASDPackage.OPERATION__SERVICE, newService, newService));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ASDPackage.OPERATION__CONTENTS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getContents()).basicAdd(otherEnd, msgs);
      case ASDPackage.OPERATION__SERVICE:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetService((ServiceDescription)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
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
      case ASDPackage.OPERATION__CONTENTS:
        return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
      case ASDPackage.OPERATION__SERVICE:
        return basicSetService(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID())
    {
      case ASDPackage.OPERATION__SERVICE:
        return eInternalContainer().eInverseRemove(this, ASDPackage.SERVICE_DESCRIPTION__OPERATIONS, ServiceDescription.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
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
      case ASDPackage.OPERATION__MESSAGE_PATTERN:
        return getMessagePattern();
      case ASDPackage.OPERATION__CONTENTS:
        return getContents();
      case ASDPackage.OPERATION__SERVICE:
        return getService();
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
      case ASDPackage.OPERATION__MESSAGE_PATTERN:
        setMessagePattern((EEnumOp)newValue);
        return;
      case ASDPackage.OPERATION__CONTENTS:
        getContents().clear();
        getContents().addAll((Collection<? extends Message>)newValue);
        return;
      case ASDPackage.OPERATION__SERVICE:
        setService((ServiceDescription)newValue);
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
      case ASDPackage.OPERATION__MESSAGE_PATTERN:
        setMessagePattern(MESSAGE_PATTERN_EDEFAULT);
        return;
      case ASDPackage.OPERATION__CONTENTS:
        getContents().clear();
        return;
      case ASDPackage.OPERATION__SERVICE:
        setService((ServiceDescription)null);
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
      case ASDPackage.OPERATION__MESSAGE_PATTERN:
        return messagePattern != MESSAGE_PATTERN_EDEFAULT;
      case ASDPackage.OPERATION__CONTENTS:
        return contents != null && !contents.isEmpty();
      case ASDPackage.OPERATION__SERVICE:
        return getService() != null;
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (messagePattern: ");
    result.append(messagePattern);
    result.append(')');
    return result.toString();
  }

} //OperationImpl
