/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL1_1.impl;

import WSDL1_1.Annotation;
import WSDL1_1.List;
import WSDL1_1.SimpleType;
import WSDL1_1.WSDL1_1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WSDL1_1.impl.ListImpl#getId <em>Id</em>}</li>
 *   <li>{@link WSDL1_1.impl.ListImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link WSDL1_1.impl.ListImpl#getSimpleType <em>Simple Type</em>}</li>
 *   <li>{@link WSDL1_1.impl.ListImpl#getItemType <em>Item Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListImpl extends AdicionalInformationTypeImpl implements List {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected Annotation annotation;

	/**
	 * The cached value of the '{@link #getSimpleType() <em>Simple Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleType()
	 * @generated
	 * @ordered
	 */
	protected SimpleType simpleType;

	/**
	 * The cached value of the '{@link #getItemType() <em>Item Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemType()
	 * @generated
	 * @ordered
	 */
	protected SimpleType itemType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WSDL1_1Package.eINSTANCE.getList();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.LIST__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation getAnnotation() {
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotation(Annotation newAnnotation, NotificationChain msgs) {
		Annotation oldAnnotation = annotation;
		annotation = newAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL1_1Package.LIST__ANNOTATION, oldAnnotation, newAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotation(Annotation newAnnotation) {
		if (newAnnotation != annotation) {
			NotificationChain msgs = null;
			if (annotation != null)
				msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.LIST__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.LIST__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.LIST__ANNOTATION, newAnnotation, newAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleType getSimpleType() {
		return simpleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimpleType(SimpleType newSimpleType, NotificationChain msgs) {
		SimpleType oldSimpleType = simpleType;
		simpleType = newSimpleType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL1_1Package.LIST__SIMPLE_TYPE, oldSimpleType, newSimpleType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleType(SimpleType newSimpleType) {
		if (newSimpleType != simpleType) {
			NotificationChain msgs = null;
			if (simpleType != null)
				msgs = ((InternalEObject)simpleType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.LIST__SIMPLE_TYPE, null, msgs);
			if (newSimpleType != null)
				msgs = ((InternalEObject)newSimpleType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.LIST__SIMPLE_TYPE, null, msgs);
			msgs = basicSetSimpleType(newSimpleType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.LIST__SIMPLE_TYPE, newSimpleType, newSimpleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleType getItemType() {
		if (itemType != null && itemType.eIsProxy()) {
			InternalEObject oldItemType = (InternalEObject)itemType;
			itemType = (SimpleType)eResolveProxy(oldItemType);
			if (itemType != oldItemType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WSDL1_1Package.LIST__ITEM_TYPE, oldItemType, itemType));
			}
		}
		return itemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleType basicGetItemType() {
		return itemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemType(SimpleType newItemType) {
		SimpleType oldItemType = itemType;
		itemType = newItemType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.LIST__ITEM_TYPE, oldItemType, itemType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WSDL1_1Package.LIST__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case WSDL1_1Package.LIST__SIMPLE_TYPE:
				return basicSetSimpleType(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WSDL1_1Package.LIST__ID:
				return getId();
			case WSDL1_1Package.LIST__ANNOTATION:
				return getAnnotation();
			case WSDL1_1Package.LIST__SIMPLE_TYPE:
				return getSimpleType();
			case WSDL1_1Package.LIST__ITEM_TYPE:
				if (resolve) return getItemType();
				return basicGetItemType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WSDL1_1Package.LIST__ID:
				setId((String)newValue);
				return;
			case WSDL1_1Package.LIST__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case WSDL1_1Package.LIST__SIMPLE_TYPE:
				setSimpleType((SimpleType)newValue);
				return;
			case WSDL1_1Package.LIST__ITEM_TYPE:
				setItemType((SimpleType)newValue);
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
			case WSDL1_1Package.LIST__ID:
				setId(ID_EDEFAULT);
				return;
			case WSDL1_1Package.LIST__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case WSDL1_1Package.LIST__SIMPLE_TYPE:
				setSimpleType((SimpleType)null);
				return;
			case WSDL1_1Package.LIST__ITEM_TYPE:
				setItemType((SimpleType)null);
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
			case WSDL1_1Package.LIST__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case WSDL1_1Package.LIST__ANNOTATION:
				return annotation != null;
			case WSDL1_1Package.LIST__SIMPLE_TYPE:
				return simpleType != null;
			case WSDL1_1Package.LIST__ITEM_TYPE:
				return itemType != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ListImpl
