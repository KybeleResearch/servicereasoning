/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ASD.impl;

import ASD.ASDPackage;
import ASD.EEnumSubset;
import ASD.EEnumValueType;
import ASD.InfoType;
import ASD.Message;
import ASD.ServiceDescription;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Info Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ASD.impl.InfoTypeImpl#getValueType <em>Value Type</em>}</li>
 *   <li>{@link ASD.impl.InfoTypeImpl#getValueRange <em>Value Range</em>}</li>
 *   <li>{@link ASD.impl.InfoTypeImpl#getSubset <em>Subset</em>}</li>
 *   <li>{@link ASD.impl.InfoTypeImpl#getInfoType <em>Info Type</em>}</li>
 *   <li>{@link ASD.impl.InfoTypeImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link ASD.impl.InfoTypeImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link ASD.impl.InfoTypeImpl#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfoTypeImpl extends NamedElementImpl implements InfoType {
	/**
	 * The default value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected static final EEnumValueType VALUE_TYPE_EDEFAULT = EEnumValueType.DOCUMENT;

	/**
	 * The cached value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected EEnumValueType valueType = VALUE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueRange() <em>Value Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueRange()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueRange() <em>Value Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueRange()
	 * @generated
	 * @ordered
	 */
	protected String valueRange = VALUE_RANGE_EDEFAULT;

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
	 * The cached value of the '{@link #getInfoType() <em>Info Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoType()
	 * @generated
	 * @ordered
	 */
	protected EList<InfoType> infoType;

	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected InfoType ref;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> message;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfoTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASDPackage.Literals.INFO_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnumValueType getValueType() {
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueType(EEnumValueType newValueType) {
		EEnumValueType oldValueType = valueType;
		valueType = newValueType == null ? VALUE_TYPE_EDEFAULT : newValueType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASDPackage.INFO_TYPE__VALUE_TYPE, oldValueType, valueType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueRange() {
		return valueRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueRange(String newValueRange) {
		String oldValueRange = valueRange;
		valueRange = newValueRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASDPackage.INFO_TYPE__VALUE_RANGE, oldValueRange, valueRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnumSubset getSubset() {
		return subset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubset(EEnumSubset newSubset) {
		EEnumSubset oldSubset = subset;
		subset = newSubset == null ? SUBSET_EDEFAULT : newSubset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASDPackage.INFO_TYPE__SUBSET, oldSubset, subset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InfoType> getInfoType() {
		if (infoType == null) {
			infoType = new EObjectContainmentEList<InfoType>(InfoType.class, this, ASDPackage.INFO_TYPE__INFO_TYPE);
		}
		return infoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfoType getRef() {
		if (ref != null && ref.eIsProxy()) {
			InternalEObject oldRef = (InternalEObject)ref;
			ref = (InfoType)eResolveProxy(oldRef);
			if (ref != oldRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ASDPackage.INFO_TYPE__REF, oldRef, ref));
			}
		}
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfoType basicGetRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(InfoType newRef) {
		InfoType oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASDPackage.INFO_TYPE__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getMessage() {
		if (message == null) {
			message = new EObjectWithInverseResolvingEList.ManyInverse<Message>(Message.class, this, ASDPackage.INFO_TYPE__MESSAGE, ASDPackage.MESSAGE__INFO_TYPE);
		}
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDescription getService() {
		if (eContainerFeatureID() != ASDPackage.INFO_TYPE__SERVICE) return null;
		return (ServiceDescription)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetService(ServiceDescription newService, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newService, ASDPackage.INFO_TYPE__SERVICE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(ServiceDescription newService) {
		if (newService != eInternalContainer() || (eContainerFeatureID() != ASDPackage.INFO_TYPE__SERVICE && newService != null)) {
			if (EcoreUtil.isAncestor(this, newService))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newService != null)
				msgs = ((InternalEObject)newService).eInverseAdd(this, ASDPackage.SERVICE_DESCRIPTION__INFOTYPES, ServiceDescription.class, msgs);
			msgs = basicSetService(newService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASDPackage.INFO_TYPE__SERVICE, newService, newService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ASDPackage.INFO_TYPE__MESSAGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMessage()).basicAdd(otherEnd, msgs);
			case ASDPackage.INFO_TYPE__SERVICE:
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ASDPackage.INFO_TYPE__INFO_TYPE:
				return ((InternalEList<?>)getInfoType()).basicRemove(otherEnd, msgs);
			case ASDPackage.INFO_TYPE__MESSAGE:
				return ((InternalEList<?>)getMessage()).basicRemove(otherEnd, msgs);
			case ASDPackage.INFO_TYPE__SERVICE:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ASDPackage.INFO_TYPE__SERVICE:
				return eInternalContainer().eInverseRemove(this, ASDPackage.SERVICE_DESCRIPTION__INFOTYPES, ServiceDescription.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ASDPackage.INFO_TYPE__VALUE_TYPE:
				return getValueType();
			case ASDPackage.INFO_TYPE__VALUE_RANGE:
				return getValueRange();
			case ASDPackage.INFO_TYPE__SUBSET:
				return getSubset();
			case ASDPackage.INFO_TYPE__INFO_TYPE:
				return getInfoType();
			case ASDPackage.INFO_TYPE__REF:
				if (resolve) return getRef();
				return basicGetRef();
			case ASDPackage.INFO_TYPE__MESSAGE:
				return getMessage();
			case ASDPackage.INFO_TYPE__SERVICE:
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ASDPackage.INFO_TYPE__VALUE_TYPE:
				setValueType((EEnumValueType)newValue);
				return;
			case ASDPackage.INFO_TYPE__VALUE_RANGE:
				setValueRange((String)newValue);
				return;
			case ASDPackage.INFO_TYPE__SUBSET:
				setSubset((EEnumSubset)newValue);
				return;
			case ASDPackage.INFO_TYPE__INFO_TYPE:
				getInfoType().clear();
				getInfoType().addAll((Collection<? extends InfoType>)newValue);
				return;
			case ASDPackage.INFO_TYPE__REF:
				setRef((InfoType)newValue);
				return;
			case ASDPackage.INFO_TYPE__MESSAGE:
				getMessage().clear();
				getMessage().addAll((Collection<? extends Message>)newValue);
				return;
			case ASDPackage.INFO_TYPE__SERVICE:
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ASDPackage.INFO_TYPE__VALUE_TYPE:
				setValueType(VALUE_TYPE_EDEFAULT);
				return;
			case ASDPackage.INFO_TYPE__VALUE_RANGE:
				setValueRange(VALUE_RANGE_EDEFAULT);
				return;
			case ASDPackage.INFO_TYPE__SUBSET:
				setSubset(SUBSET_EDEFAULT);
				return;
			case ASDPackage.INFO_TYPE__INFO_TYPE:
				getInfoType().clear();
				return;
			case ASDPackage.INFO_TYPE__REF:
				setRef((InfoType)null);
				return;
			case ASDPackage.INFO_TYPE__MESSAGE:
				getMessage().clear();
				return;
			case ASDPackage.INFO_TYPE__SERVICE:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ASDPackage.INFO_TYPE__VALUE_TYPE:
				return valueType != VALUE_TYPE_EDEFAULT;
			case ASDPackage.INFO_TYPE__VALUE_RANGE:
				return VALUE_RANGE_EDEFAULT == null ? valueRange != null : !VALUE_RANGE_EDEFAULT.equals(valueRange);
			case ASDPackage.INFO_TYPE__SUBSET:
				return subset != SUBSET_EDEFAULT;
			case ASDPackage.INFO_TYPE__INFO_TYPE:
				return infoType != null && !infoType.isEmpty();
			case ASDPackage.INFO_TYPE__REF:
				return ref != null;
			case ASDPackage.INFO_TYPE__MESSAGE:
				return message != null && !message.isEmpty();
			case ASDPackage.INFO_TYPE__SERVICE:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (valueType: ");
		result.append(valueType);
		result.append(", valueRange: ");
		result.append(valueRange);
		result.append(", subset: ");
		result.append(subset);
		result.append(')');
		return result.toString();
	}

} //InfoTypeImpl
