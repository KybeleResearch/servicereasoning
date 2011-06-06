/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL1_1.impl;

import WSDL1_1.Binding;
import WSDL1_1.BindingHTTP;
import WSDL1_1.BindingOperation;
import WSDL1_1.BindingSOAP;
import WSDL1_1.PortType;
import WSDL1_1.WSDL1_1Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WSDL1_1.impl.BindingImpl#getName <em>Name</em>}</li>
 *   <li>{@link WSDL1_1.impl.BindingImpl#getType <em>Type</em>}</li>
 *   <li>{@link WSDL1_1.impl.BindingImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link WSDL1_1.impl.BindingImpl#getSoapbinding <em>Soapbinding</em>}</li>
 *   <li>{@link WSDL1_1.impl.BindingImpl#getHttpbinding <em>Httpbinding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingImpl extends ObjectImpl implements Binding {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PortType type;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<BindingOperation> operation;

	/**
	 * The cached value of the '{@link #getSoapbinding() <em>Soapbinding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoapbinding()
	 * @generated
	 * @ordered
	 */
	protected BindingSOAP soapbinding;

	/**
	 * The cached value of the '{@link #getHttpbinding() <em>Httpbinding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpbinding()
	 * @generated
	 * @ordered
	 */
	protected BindingHTTP httpbinding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WSDL1_1Package.eINSTANCE.getBinding();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.BINDING__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (PortType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WSDL1_1Package.BINDING__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(PortType newType) {
		PortType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.BINDING__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BindingOperation> getOperation() {
		if (operation == null) {
			operation = new EObjectContainmentEList<BindingOperation>(BindingOperation.class, this, WSDL1_1Package.BINDING__OPERATION);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingSOAP getSoapbinding() {
		return soapbinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoapbinding(BindingSOAP newSoapbinding, NotificationChain msgs) {
		BindingSOAP oldSoapbinding = soapbinding;
		soapbinding = newSoapbinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL1_1Package.BINDING__SOAPBINDING, oldSoapbinding, newSoapbinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoapbinding(BindingSOAP newSoapbinding) {
		if (newSoapbinding != soapbinding) {
			NotificationChain msgs = null;
			if (soapbinding != null)
				msgs = ((InternalEObject)soapbinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.BINDING__SOAPBINDING, null, msgs);
			if (newSoapbinding != null)
				msgs = ((InternalEObject)newSoapbinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.BINDING__SOAPBINDING, null, msgs);
			msgs = basicSetSoapbinding(newSoapbinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.BINDING__SOAPBINDING, newSoapbinding, newSoapbinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingHTTP getHttpbinding() {
		return httpbinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHttpbinding(BindingHTTP newHttpbinding, NotificationChain msgs) {
		BindingHTTP oldHttpbinding = httpbinding;
		httpbinding = newHttpbinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL1_1Package.BINDING__HTTPBINDING, oldHttpbinding, newHttpbinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpbinding(BindingHTTP newHttpbinding) {
		if (newHttpbinding != httpbinding) {
			NotificationChain msgs = null;
			if (httpbinding != null)
				msgs = ((InternalEObject)httpbinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.BINDING__HTTPBINDING, null, msgs);
			if (newHttpbinding != null)
				msgs = ((InternalEObject)newHttpbinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.BINDING__HTTPBINDING, null, msgs);
			msgs = basicSetHttpbinding(newHttpbinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.BINDING__HTTPBINDING, newHttpbinding, newHttpbinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WSDL1_1Package.BINDING__OPERATION:
				return ((InternalEList<?>)getOperation()).basicRemove(otherEnd, msgs);
			case WSDL1_1Package.BINDING__SOAPBINDING:
				return basicSetSoapbinding(null, msgs);
			case WSDL1_1Package.BINDING__HTTPBINDING:
				return basicSetHttpbinding(null, msgs);
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
			case WSDL1_1Package.BINDING__NAME:
				return getName();
			case WSDL1_1Package.BINDING__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case WSDL1_1Package.BINDING__OPERATION:
				return getOperation();
			case WSDL1_1Package.BINDING__SOAPBINDING:
				return getSoapbinding();
			case WSDL1_1Package.BINDING__HTTPBINDING:
				return getHttpbinding();
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
			case WSDL1_1Package.BINDING__NAME:
				setName((String)newValue);
				return;
			case WSDL1_1Package.BINDING__TYPE:
				setType((PortType)newValue);
				return;
			case WSDL1_1Package.BINDING__OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection<? extends BindingOperation>)newValue);
				return;
			case WSDL1_1Package.BINDING__SOAPBINDING:
				setSoapbinding((BindingSOAP)newValue);
				return;
			case WSDL1_1Package.BINDING__HTTPBINDING:
				setHttpbinding((BindingHTTP)newValue);
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
			case WSDL1_1Package.BINDING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WSDL1_1Package.BINDING__TYPE:
				setType((PortType)null);
				return;
			case WSDL1_1Package.BINDING__OPERATION:
				getOperation().clear();
				return;
			case WSDL1_1Package.BINDING__SOAPBINDING:
				setSoapbinding((BindingSOAP)null);
				return;
			case WSDL1_1Package.BINDING__HTTPBINDING:
				setHttpbinding((BindingHTTP)null);
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
			case WSDL1_1Package.BINDING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WSDL1_1Package.BINDING__TYPE:
				return type != null;
			case WSDL1_1Package.BINDING__OPERATION:
				return operation != null && !operation.isEmpty();
			case WSDL1_1Package.BINDING__SOAPBINDING:
				return soapbinding != null;
			case WSDL1_1Package.BINDING__HTTPBINDING:
				return httpbinding != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //BindingImpl
