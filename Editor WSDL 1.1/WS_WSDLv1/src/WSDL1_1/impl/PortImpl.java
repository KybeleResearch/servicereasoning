/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL1_1.impl;

import WSDL1_1.AddressHTTP;
import WSDL1_1.AddressSOAP;
import WSDL1_1.Binding;
import WSDL1_1.Port;
import WSDL1_1.WSDL1_1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WSDL1_1.impl.PortImpl#getName <em>Name</em>}</li>
 *   <li>{@link WSDL1_1.impl.PortImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link WSDL1_1.impl.PortImpl#getSoapAddress <em>Soap Address</em>}</li>
 *   <li>{@link WSDL1_1.impl.PortImpl#getHttpAddress <em>Http Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortImpl extends ObjectImpl implements Port {
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
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected Binding binding;

	/**
	 * The cached value of the '{@link #getSoapAddress() <em>Soap Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoapAddress()
	 * @generated
	 * @ordered
	 */
	protected AddressSOAP soapAddress;

	/**
	 * The cached value of the '{@link #getHttpAddress() <em>Http Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpAddress()
	 * @generated
	 * @ordered
	 */
	protected AddressHTTP httpAddress;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WSDL1_1Package.eINSTANCE.getPort();
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.PORT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding getBinding() {
		if (binding != null && binding.eIsProxy()) {
			InternalEObject oldBinding = (InternalEObject)binding;
			binding = (Binding)eResolveProxy(oldBinding);
			if (binding != oldBinding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WSDL1_1Package.PORT__BINDING, oldBinding, binding));
			}
		}
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding basicGetBinding() {
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinding(Binding newBinding) {
		Binding oldBinding = binding;
		binding = newBinding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.PORT__BINDING, oldBinding, binding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressSOAP getSoapAddress() {
		return soapAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoapAddress(AddressSOAP newSoapAddress, NotificationChain msgs) {
		AddressSOAP oldSoapAddress = soapAddress;
		soapAddress = newSoapAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL1_1Package.PORT__SOAP_ADDRESS, oldSoapAddress, newSoapAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoapAddress(AddressSOAP newSoapAddress) {
		if (newSoapAddress != soapAddress) {
			NotificationChain msgs = null;
			if (soapAddress != null)
				msgs = ((InternalEObject)soapAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.PORT__SOAP_ADDRESS, null, msgs);
			if (newSoapAddress != null)
				msgs = ((InternalEObject)newSoapAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.PORT__SOAP_ADDRESS, null, msgs);
			msgs = basicSetSoapAddress(newSoapAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.PORT__SOAP_ADDRESS, newSoapAddress, newSoapAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressHTTP getHttpAddress() {
		return httpAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHttpAddress(AddressHTTP newHttpAddress, NotificationChain msgs) {
		AddressHTTP oldHttpAddress = httpAddress;
		httpAddress = newHttpAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL1_1Package.PORT__HTTP_ADDRESS, oldHttpAddress, newHttpAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpAddress(AddressHTTP newHttpAddress) {
		if (newHttpAddress != httpAddress) {
			NotificationChain msgs = null;
			if (httpAddress != null)
				msgs = ((InternalEObject)httpAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.PORT__HTTP_ADDRESS, null, msgs);
			if (newHttpAddress != null)
				msgs = ((InternalEObject)newHttpAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.PORT__HTTP_ADDRESS, null, msgs);
			msgs = basicSetHttpAddress(newHttpAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.PORT__HTTP_ADDRESS, newHttpAddress, newHttpAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WSDL1_1Package.PORT__SOAP_ADDRESS:
				return basicSetSoapAddress(null, msgs);
			case WSDL1_1Package.PORT__HTTP_ADDRESS:
				return basicSetHttpAddress(null, msgs);
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
			case WSDL1_1Package.PORT__NAME:
				return getName();
			case WSDL1_1Package.PORT__BINDING:
				if (resolve) return getBinding();
				return basicGetBinding();
			case WSDL1_1Package.PORT__SOAP_ADDRESS:
				return getSoapAddress();
			case WSDL1_1Package.PORT__HTTP_ADDRESS:
				return getHttpAddress();
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
			case WSDL1_1Package.PORT__NAME:
				setName((String)newValue);
				return;
			case WSDL1_1Package.PORT__BINDING:
				setBinding((Binding)newValue);
				return;
			case WSDL1_1Package.PORT__SOAP_ADDRESS:
				setSoapAddress((AddressSOAP)newValue);
				return;
			case WSDL1_1Package.PORT__HTTP_ADDRESS:
				setHttpAddress((AddressHTTP)newValue);
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
			case WSDL1_1Package.PORT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WSDL1_1Package.PORT__BINDING:
				setBinding((Binding)null);
				return;
			case WSDL1_1Package.PORT__SOAP_ADDRESS:
				setSoapAddress((AddressSOAP)null);
				return;
			case WSDL1_1Package.PORT__HTTP_ADDRESS:
				setHttpAddress((AddressHTTP)null);
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
			case WSDL1_1Package.PORT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WSDL1_1Package.PORT__BINDING:
				return binding != null;
			case WSDL1_1Package.PORT__SOAP_ADDRESS:
				return soapAddress != null;
			case WSDL1_1Package.PORT__HTTP_ADDRESS:
				return httpAddress != null;
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

} //PortImpl
