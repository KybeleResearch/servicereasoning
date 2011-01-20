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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

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
	 * The cached value of the '{@link #getInfoType() <em>Info Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoType()
	 * @generated
	 * @ordered
	 */
	protected EList<InfoType> infoType;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected Message message;

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
			infoType = new EObjectResolvingEList<InfoType>(InfoType.class, this, ASDPackage.INFO_TYPE__INFO_TYPE);
		}
		return infoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getMessage() {
		if (message != null && message.eIsProxy()) {
			InternalEObject oldMessage = (InternalEObject)message;
			message = (Message)eResolveProxy(oldMessage);
			if (message != oldMessage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ASDPackage.INFO_TYPE__MESSAGE, oldMessage, message));
			}
		}
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessage(Message newMessage, NotificationChain msgs) {
		Message oldMessage = message;
		message = newMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ASDPackage.INFO_TYPE__MESSAGE, oldMessage, newMessage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(Message newMessage) {
		if (newMessage != message) {
			NotificationChain msgs = null;
			if (message != null)
				msgs = ((InternalEObject)message).eInverseRemove(this, ASDPackage.MESSAGE__INFO_TYPE, Message.class, msgs);
			if (newMessage != null)
				msgs = ((InternalEObject)newMessage).eInverseAdd(this, ASDPackage.MESSAGE__INFO_TYPE, Message.class, msgs);
			msgs = basicSetMessage(newMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASDPackage.INFO_TYPE__MESSAGE, newMessage, newMessage));
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ASDPackage.INFO_TYPE__MESSAGE:
				if (message != null)
					msgs = ((InternalEObject)message).eInverseRemove(this, ASDPackage.MESSAGE__INFO_TYPE, Message.class, msgs);
				return basicSetMessage((Message)otherEnd, msgs);
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
			case ASDPackage.INFO_TYPE__MESSAGE:
				return basicSetMessage(null, msgs);
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
			case ASDPackage.INFO_TYPE__MESSAGE:
				if (resolve) return getMessage();
				return basicGetMessage();
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
			case ASDPackage.INFO_TYPE__MESSAGE:
				setMessage((Message)newValue);
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
			case ASDPackage.INFO_TYPE__MESSAGE:
				setMessage((Message)null);
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
			case ASDPackage.INFO_TYPE__MESSAGE:
				return message != null;
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
