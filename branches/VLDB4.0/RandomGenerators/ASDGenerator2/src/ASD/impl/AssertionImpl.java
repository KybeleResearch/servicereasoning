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
import ASD.EEnumDimensionType;
import ASD.EEnumIntention;
import ASD.EEnumSubset;
import ASD.EEnumlogicalType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ASD.impl.AssertionImpl#getDimension <em>Dimension</em>}</li>
 *   <li>{@link ASD.impl.AssertionImpl#getDimensionType <em>Dimension Type</em>}</li>
 *   <li>{@link ASD.impl.AssertionImpl#getIntention <em>Intention</em>}</li>
 *   <li>{@link ASD.impl.AssertionImpl#getMinVal <em>Min Val</em>}</li>
 *   <li>{@link ASD.impl.AssertionImpl#getMaxVal <em>Max Val</em>}</li>
 *   <li>{@link ASD.impl.AssertionImpl#getLType <em>LType</em>}</li>
 *   <li>{@link ASD.impl.AssertionImpl#getSet <em>Set</em>}</li>
 *   <li>{@link ASD.impl.AssertionImpl#getSubset <em>Subset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssertionImpl extends NamedElementImpl implements Assertion
{
  /**
   * The default value of the '{@link #getDimension() <em>Dimension</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDimension()
   * @generated
   * @ordered
   */
  protected static final String DIMENSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDimension() <em>Dimension</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDimension()
   * @generated
   * @ordered
   */
  protected String dimension = DIMENSION_EDEFAULT;

  /**
   * The default value of the '{@link #getDimensionType() <em>Dimension Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDimensionType()
   * @generated
   * @ordered
   */
  protected static final EEnumDimensionType DIMENSION_TYPE_EDEFAULT = EEnumDimensionType.MONOTONIC;

  /**
   * The cached value of the '{@link #getDimensionType() <em>Dimension Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDimensionType()
   * @generated
   * @ordered
   */
  protected EEnumDimensionType dimensionType = DIMENSION_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getIntention() <em>Intention</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntention()
   * @generated
   * @ordered
   */
  protected static final EEnumIntention INTENTION_EDEFAULT = EEnumIntention.OFFERING;

  /**
   * The cached value of the '{@link #getIntention() <em>Intention</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntention()
   * @generated
   * @ordered
   */
  protected EEnumIntention intention = INTENTION_EDEFAULT;

  /**
   * The default value of the '{@link #getMinVal() <em>Min Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinVal()
   * @generated
   * @ordered
   */
  protected static final double MIN_VAL_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getMinVal() <em>Min Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinVal()
   * @generated
   * @ordered
   */
  protected double minVal = MIN_VAL_EDEFAULT;

  /**
   * The default value of the '{@link #getMaxVal() <em>Max Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxVal()
   * @generated
   * @ordered
   */
  protected static final double MAX_VAL_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getMaxVal() <em>Max Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxVal()
   * @generated
   * @ordered
   */
  protected double maxVal = MAX_VAL_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssertionImpl()
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
    return ASDPackage.Literals.ASSERTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDimension()
  {
    return dimension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDimension(String newDimension)
  {
    String oldDimension = dimension;
    dimension = newDimension;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ASDPackage.ASSERTION__DIMENSION, oldDimension, dimension));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnumDimensionType getDimensionType()
  {
    return dimensionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDimensionType(EEnumDimensionType newDimensionType)
  {
    EEnumDimensionType oldDimensionType = dimensionType;
    dimensionType = newDimensionType == null ? DIMENSION_TYPE_EDEFAULT : newDimensionType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ASDPackage.ASSERTION__DIMENSION_TYPE, oldDimensionType, dimensionType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnumIntention getIntention()
  {
    return intention;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntention(EEnumIntention newIntention)
  {
    EEnumIntention oldIntention = intention;
    intention = newIntention == null ? INTENTION_EDEFAULT : newIntention;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ASDPackage.ASSERTION__INTENTION, oldIntention, intention));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getMinVal()
  {
    return minVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinVal(double newMinVal)
  {
    double oldMinVal = minVal;
    minVal = newMinVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ASDPackage.ASSERTION__MIN_VAL, oldMinVal, minVal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getMaxVal()
  {
    return maxVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxVal(double newMaxVal)
  {
    double oldMaxVal = maxVal;
    maxVal = newMaxVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ASDPackage.ASSERTION__MAX_VAL, oldMaxVal, maxVal));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ASDPackage.ASSERTION__LTYPE, oldLType, lType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssertionSet getSet()
  {
    if (eContainerFeatureID() != ASDPackage.ASSERTION__SET) return null;
    return (AssertionSet)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSet(AssertionSet newSet, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newSet, ASDPackage.ASSERTION__SET, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSet(AssertionSet newSet)
  {
    if (newSet != eInternalContainer() || (eContainerFeatureID() != ASDPackage.ASSERTION__SET && newSet != null))
    {
      if (EcoreUtil.isAncestor(this, newSet))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newSet != null)
        msgs = ((InternalEObject)newSet).eInverseAdd(this, ASDPackage.ASSERTION_SET__ASSERTIONS, AssertionSet.class, msgs);
      msgs = basicSetSet(newSet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ASDPackage.ASSERTION__SET, newSet, newSet));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ASDPackage.ASSERTION__SUBSET, oldSubset, subset));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ASDPackage.ASSERTION__SET:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetSet((AssertionSet)otherEnd, msgs);
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
      case ASDPackage.ASSERTION__SET:
        return basicSetSet(null, msgs);
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
      case ASDPackage.ASSERTION__SET:
        return eInternalContainer().eInverseRemove(this, ASDPackage.ASSERTION_SET__ASSERTIONS, AssertionSet.class, msgs);
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
      case ASDPackage.ASSERTION__DIMENSION:
        return getDimension();
      case ASDPackage.ASSERTION__DIMENSION_TYPE:
        return getDimensionType();
      case ASDPackage.ASSERTION__INTENTION:
        return getIntention();
      case ASDPackage.ASSERTION__MIN_VAL:
        return getMinVal();
      case ASDPackage.ASSERTION__MAX_VAL:
        return getMaxVal();
      case ASDPackage.ASSERTION__LTYPE:
        return getLType();
      case ASDPackage.ASSERTION__SET:
        return getSet();
      case ASDPackage.ASSERTION__SUBSET:
        return getSubset();
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
      case ASDPackage.ASSERTION__DIMENSION:
        setDimension((String)newValue);
        return;
      case ASDPackage.ASSERTION__DIMENSION_TYPE:
        setDimensionType((EEnumDimensionType)newValue);
        return;
      case ASDPackage.ASSERTION__INTENTION:
        setIntention((EEnumIntention)newValue);
        return;
      case ASDPackage.ASSERTION__MIN_VAL:
        setMinVal((Double)newValue);
        return;
      case ASDPackage.ASSERTION__MAX_VAL:
        setMaxVal((Double)newValue);
        return;
      case ASDPackage.ASSERTION__LTYPE:
        setLType((EEnumlogicalType)newValue);
        return;
      case ASDPackage.ASSERTION__SET:
        setSet((AssertionSet)newValue);
        return;
      case ASDPackage.ASSERTION__SUBSET:
        setSubset((EEnumSubset)newValue);
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
      case ASDPackage.ASSERTION__DIMENSION:
        setDimension(DIMENSION_EDEFAULT);
        return;
      case ASDPackage.ASSERTION__DIMENSION_TYPE:
        setDimensionType(DIMENSION_TYPE_EDEFAULT);
        return;
      case ASDPackage.ASSERTION__INTENTION:
        setIntention(INTENTION_EDEFAULT);
        return;
      case ASDPackage.ASSERTION__MIN_VAL:
        setMinVal(MIN_VAL_EDEFAULT);
        return;
      case ASDPackage.ASSERTION__MAX_VAL:
        setMaxVal(MAX_VAL_EDEFAULT);
        return;
      case ASDPackage.ASSERTION__LTYPE:
        setLType(LTYPE_EDEFAULT);
        return;
      case ASDPackage.ASSERTION__SET:
        setSet((AssertionSet)null);
        return;
      case ASDPackage.ASSERTION__SUBSET:
        setSubset(SUBSET_EDEFAULT);
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
      case ASDPackage.ASSERTION__DIMENSION:
        return DIMENSION_EDEFAULT == null ? dimension != null : !DIMENSION_EDEFAULT.equals(dimension);
      case ASDPackage.ASSERTION__DIMENSION_TYPE:
        return dimensionType != DIMENSION_TYPE_EDEFAULT;
      case ASDPackage.ASSERTION__INTENTION:
        return intention != INTENTION_EDEFAULT;
      case ASDPackage.ASSERTION__MIN_VAL:
        return minVal != MIN_VAL_EDEFAULT;
      case ASDPackage.ASSERTION__MAX_VAL:
        return maxVal != MAX_VAL_EDEFAULT;
      case ASDPackage.ASSERTION__LTYPE:
        return lType != LTYPE_EDEFAULT;
      case ASDPackage.ASSERTION__SET:
        return getSet() != null;
      case ASDPackage.ASSERTION__SUBSET:
        return subset != SUBSET_EDEFAULT;
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
    result.append(" (dimension: ");
    result.append(dimension);
    result.append(", dimensionType: ");
    result.append(dimensionType);
    result.append(", intention: ");
    result.append(intention);
    result.append(", minVal: ");
    result.append(minVal);
    result.append(", maxVal: ");
    result.append(maxVal);
    result.append(", lType: ");
    result.append(lType);
    result.append(", subset: ");
    result.append(subset);
    result.append(')');
    return result.toString();
  }

} //AssertionImpl
