/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ASD.impl;

import ASD.ASDPackage;
import ASD.Assertion;
import ASD.AssertionSet;
import ASD.EEnumlogicalType;
import ASD.Profile;

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
 * An implementation of the model object '<em><b>Assertion Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ASD.impl.AssertionSetImpl#getLType <em>LType</em>}</li>
 *   <li>{@link ASD.impl.AssertionSetImpl#getProfile <em>Profile</em>}</li>
 *   <li>{@link ASD.impl.AssertionSetImpl#getAssertions <em>Assertions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssertionSetImpl extends NamedElementImpl implements AssertionSet
{
  /**
   * The default value of the '{@link #getLType() <em>LType</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLType()
   * @generated
   * @ordered
   */
  protected static final EEnumlogicalType LTYPE_EDEFAULT = EEnumlogicalType.AND;

  /**
   * The cached value of the '{@link #getLType() <em>LType</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLType()
   * @generated
   * @ordered
   */
  protected EEnumlogicalType lType = LTYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getAssertions() <em>Assertions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssertions()
   * @generated
   * @ordered
   */
  protected EList<Assertion> assertions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssertionSetImpl()
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
    return ASDPackage.Literals.ASSERTION_SET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnumlogicalType getLType()
  {
    return lType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLType(EEnumlogicalType newLType)
  {
    EEnumlogicalType oldLType = lType;
    lType = newLType == null ? LTYPE_EDEFAULT : newLType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ASDPackage.ASSERTION_SET__LTYPE, oldLType, lType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Profile getProfile()
  {
    if (eContainerFeatureID() != ASDPackage.ASSERTION_SET__PROFILE) return null;
    return (Profile)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProfile(Profile newProfile, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newProfile, ASDPackage.ASSERTION_SET__PROFILE, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProfile(Profile newProfile)
  {
    if (newProfile != eInternalContainer() || (eContainerFeatureID() != ASDPackage.ASSERTION_SET__PROFILE && newProfile != null))
    {
      if (EcoreUtil.isAncestor(this, newProfile))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newProfile != null)
        msgs = ((InternalEObject)newProfile).eInverseAdd(this, ASDPackage.PROFILE__SETS, Profile.class, msgs);
      msgs = basicSetProfile(newProfile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ASDPackage.ASSERTION_SET__PROFILE, newProfile, newProfile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Assertion> getAssertions()
  {
    if (assertions == null)
    {
      assertions = new EObjectContainmentWithInverseEList<Assertion>(Assertion.class, this, ASDPackage.ASSERTION_SET__ASSERTIONS, ASDPackage.ASSERTION__SET);
    }
    return assertions;
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
      case ASDPackage.ASSERTION_SET__PROFILE:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetProfile((Profile)otherEnd, msgs);
      case ASDPackage.ASSERTION_SET__ASSERTIONS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssertions()).basicAdd(otherEnd, msgs);
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
      case ASDPackage.ASSERTION_SET__PROFILE:
        return basicSetProfile(null, msgs);
      case ASDPackage.ASSERTION_SET__ASSERTIONS:
        return ((InternalEList<?>)getAssertions()).basicRemove(otherEnd, msgs);
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
      case ASDPackage.ASSERTION_SET__PROFILE:
        return eInternalContainer().eInverseRemove(this, ASDPackage.PROFILE__SETS, Profile.class, msgs);
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
      case ASDPackage.ASSERTION_SET__LTYPE:
        return getLType();
      case ASDPackage.ASSERTION_SET__PROFILE:
        return getProfile();
      case ASDPackage.ASSERTION_SET__ASSERTIONS:
        return getAssertions();
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
      case ASDPackage.ASSERTION_SET__LTYPE:
        setLType((EEnumlogicalType)newValue);
        return;
      case ASDPackage.ASSERTION_SET__PROFILE:
        setProfile((Profile)newValue);
        return;
      case ASDPackage.ASSERTION_SET__ASSERTIONS:
        getAssertions().clear();
        getAssertions().addAll((Collection<? extends Assertion>)newValue);
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
      case ASDPackage.ASSERTION_SET__LTYPE:
        setLType(LTYPE_EDEFAULT);
        return;
      case ASDPackage.ASSERTION_SET__PROFILE:
        setProfile((Profile)null);
        return;
      case ASDPackage.ASSERTION_SET__ASSERTIONS:
        getAssertions().clear();
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
      case ASDPackage.ASSERTION_SET__LTYPE:
        return lType != LTYPE_EDEFAULT;
      case ASDPackage.ASSERTION_SET__PROFILE:
        return getProfile() != null;
      case ASDPackage.ASSERTION_SET__ASSERTIONS:
        return assertions != null && !assertions.isEmpty();
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
    result.append(" (lType: ");
    result.append(lType);
    result.append(')');
    return result.toString();
  }

} //AssertionSetImpl
