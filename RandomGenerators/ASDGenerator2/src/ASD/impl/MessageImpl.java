/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ASD.impl;

import ASD.ASDPackage;
import ASD.EEnumMes;
import ASD.EEnumSubset;
import ASD.InfoType;
import ASD.Message;
import ASD.Operation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ASD.impl.MessageImpl#getRole <em>Role</em>}</li>
 *   <li>{@link ASD.impl.MessageImpl#getSubset <em>Subset</em>}</li>
 *   <li>{@link ASD.impl.MessageImpl#getInfoType <em>Info Type</em>}</li>
 *   <li>{@link ASD.impl.MessageImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageImpl extends NamedElementImpl implements Message
{
  /**
   * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRole()
   * @generated
   * @ordered
   */
  protected static final EEnumMes ROLE_EDEFAULT = EEnumMes.INPUT;

  /**
   * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRole()
   * @generated
   * @ordered
   */
  protected EEnumMes role = ROLE_EDEFAULT;

  /**
   * The default value of the '{@link #getSubset() <em>Subset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubset()
   * @generated
   * @ordered
   */
  protected static final EEnumSubset SUBSET_EDEFAULT = EEnumSubset.REQ;

  /**
   * The cached value of the '{@link #getSubset() <em>Subset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubset()
   * @generated
   * @ordered
   */
  protected EEnumSubset subset = SUBSET_EDEFAULT;

  /**
   * The cached value of the '{@link #getInfoType() <em>Info Type</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInfoType()
   * @generated
   * @ordered
   */
  protected EList<InfoType> infoType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MessageImpl()
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
    return ASDPackage.Literals.MESSAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnumMes getRole()
  {
    return role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRole(EEnumMes newRole)
  {
    EEnumMes oldRole = role;
    role = newRole == null ? ROLE_EDEFAULT : newRole;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ASDPackage.MESSAGE__ROLE, oldRole, role));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnumSubset getSubset()
  {
    return subset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubset(EEnumSubset newSubset)
  {
    EEnumSubset oldSubset = subset;
    subset = newSubset == null ? SUBSET_EDEFAULT : newSubset;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ASDPackage.MESSAGE__SUBSET, oldSubset, subset));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InfoType> getInfoType()
  {
    if (infoType == null)
    {
      infoType = new EObjectWithInverseResolvingEList.ManyInverse<InfoType>(InfoType.class, this, ASDPackage.MESSAGE__INFO_TYPE, ASDPackage.INFO_TYPE__MESSAGE);
    }
    return infoType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation getOperation()
  {
    if (eContainerFeatureID() != ASDPackage.MESSAGE__OPERATION) return null;
    return (Operation)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperation(Operation newOperation, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newOperation, ASDPackage.MESSAGE__OPERATION, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperation(Operation newOperation)
  {
    if (newOperation != eInternalContainer() || (eContainerFeatureID() != ASDPackage.MESSAGE__OPERATION && newOperation != null))
    {
      if (EcoreUtil.isAncestor(this, newOperation))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newOperation != null)
        msgs = ((InternalEObject)newOperation).eInverseAdd(this, ASDPackage.OPERATION__CONTENTS, Operation.class, msgs);
      msgs = basicSetOperation(newOperation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ASDPackage.MESSAGE__OPERATION, newOperation, newOperation));
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
      case ASDPackage.MESSAGE__INFO_TYPE:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getInfoType()).basicAdd(otherEnd, msgs);
      case ASDPackage.MESSAGE__OPERATION:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetOperation((Operation)otherEnd, msgs);
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
      case ASDPackage.MESSAGE__INFO_TYPE:
        return ((InternalEList<?>)getInfoType()).basicRemove(otherEnd, msgs);
      case ASDPackage.MESSAGE__OPERATION:
        return basicSetOperation(null, msgs);
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
      case ASDPackage.MESSAGE__OPERATION:
        return eInternalContainer().eInverseRemove(this, ASDPackage.OPERATION__CONTENTS, Operation.class, msgs);
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
      case ASDPackage.MESSAGE__ROLE:
        return getRole();
      case ASDPackage.MESSAGE__SUBSET:
        return getSubset();
      case ASDPackage.MESSAGE__INFO_TYPE:
        return getInfoType();
      case ASDPackage.MESSAGE__OPERATION:
        return getOperation();
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
      case ASDPackage.MESSAGE__ROLE:
        setRole((EEnumMes)newValue);
        return;
      case ASDPackage.MESSAGE__SUBSET:
        setSubset((EEnumSubset)newValue);
        return;
      case ASDPackage.MESSAGE__INFO_TYPE:
        getInfoType().clear();
        getInfoType().addAll((Collection<? extends InfoType>)newValue);
        return;
      case ASDPackage.MESSAGE__OPERATION:
        setOperation((Operation)newValue);
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
      case ASDPackage.MESSAGE__ROLE:
        setRole(ROLE_EDEFAULT);
        return;
      case ASDPackage.MESSAGE__SUBSET:
        setSubset(SUBSET_EDEFAULT);
        return;
      case ASDPackage.MESSAGE__INFO_TYPE:
        getInfoType().clear();
        return;
      case ASDPackage.MESSAGE__OPERATION:
        setOperation((Operation)null);
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
      case ASDPackage.MESSAGE__ROLE:
        return role != ROLE_EDEFAULT;
      case ASDPackage.MESSAGE__SUBSET:
        return subset != SUBSET_EDEFAULT;
      case ASDPackage.MESSAGE__INFO_TYPE:
        return infoType != null && !infoType.isEmpty();
      case ASDPackage.MESSAGE__OPERATION:
        return getOperation() != null;
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
    result.append(" (role: ");
    result.append(role);
    result.append(", subset: ");
    result.append(subset);
    result.append(')');
    return result.toString();
  }

} //MessageImpl
