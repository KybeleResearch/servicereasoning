/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL2_0.impl;

import WSDL2_0.Binding;
import WSDL2_0.EndPoint;
import WSDL2_0.WSDL2_0Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WSDL2_0.impl.EndPointImpl#getName <em>Name</em>}</li>
 *   <li>{@link WSDL2_0.impl.EndPointImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link WSDL2_0.impl.EndPointImpl#getWhttp_authenticationScheme <em>Whttp authentication Scheme</em>}</li>
 *   <li>{@link WSDL2_0.impl.EndPointImpl#getWhttp_authenticationRealm <em>Whttp authentication Realm</em>}</li>
 *   <li>{@link WSDL2_0.impl.EndPointImpl#getBinding <em>Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EndPointImpl extends ObjectImpl implements EndPoint {
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
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWhttp_authenticationScheme() <em>Whttp authentication Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhttp_authenticationScheme()
	 * @generated
	 * @ordered
	 */
	protected static final String WHTTP_AUTHENTICATION_SCHEME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhttp_authenticationScheme() <em>Whttp authentication Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhttp_authenticationScheme()
	 * @generated
	 * @ordered
	 */
	protected String whttp_authenticationScheme = WHTTP_AUTHENTICATION_SCHEME_EDEFAULT;

	/**
	 * The default value of the '{@link #getWhttp_authenticationRealm() <em>Whttp authentication Realm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhttp_authenticationRealm()
	 * @generated
	 * @ordered
	 */
	protected static final String WHTTP_AUTHENTICATION_REALM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhttp_authenticationRealm() <em>Whttp authentication Realm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhttp_authenticationRealm()
	 * @generated
	 * @ordered
	 */
	protected String whttp_authenticationRealm = WHTTP_AUTHENTICATION_REALM_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WSDL2_0Package.eINSTANCE.getEndPoint();
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.END_POINT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.END_POINT__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWhttp_authenticationScheme() {
		return whttp_authenticationScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhttp_authenticationScheme(String newWhttp_authenticationScheme) {
		String oldWhttp_authenticationScheme = whttp_authenticationScheme;
		whttp_authenticationScheme = newWhttp_authenticationScheme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.END_POINT__WHTTP_AUTHENTICATION_SCHEME, oldWhttp_authenticationScheme, whttp_authenticationScheme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWhttp_authenticationRealm() {
		return whttp_authenticationRealm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhttp_authenticationRealm(String newWhttp_authenticationRealm) {
		String oldWhttp_authenticationRealm = whttp_authenticationRealm;
		whttp_authenticationRealm = newWhttp_authenticationRealm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.END_POINT__WHTTP_AUTHENTICATION_REALM, oldWhttp_authenticationRealm, whttp_authenticationRealm));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WSDL2_0Package.END_POINT__BINDING, oldBinding, binding));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.END_POINT__BINDING, oldBinding, binding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WSDL2_0Package.END_POINT__NAME:
				return getName();
			case WSDL2_0Package.END_POINT__ADDRESS:
				return getAddress();
			case WSDL2_0Package.END_POINT__WHTTP_AUTHENTICATION_SCHEME:
				return getWhttp_authenticationScheme();
			case WSDL2_0Package.END_POINT__WHTTP_AUTHENTICATION_REALM:
				return getWhttp_authenticationRealm();
			case WSDL2_0Package.END_POINT__BINDING:
				if (resolve) return getBinding();
				return basicGetBinding();
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
			case WSDL2_0Package.END_POINT__NAME:
				setName((String)newValue);
				return;
			case WSDL2_0Package.END_POINT__ADDRESS:
				setAddress((String)newValue);
				return;
			case WSDL2_0Package.END_POINT__WHTTP_AUTHENTICATION_SCHEME:
				setWhttp_authenticationScheme((String)newValue);
				return;
			case WSDL2_0Package.END_POINT__WHTTP_AUTHENTICATION_REALM:
				setWhttp_authenticationRealm((String)newValue);
				return;
			case WSDL2_0Package.END_POINT__BINDING:
				setBinding((Binding)newValue);
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
			case WSDL2_0Package.END_POINT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WSDL2_0Package.END_POINT__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case WSDL2_0Package.END_POINT__WHTTP_AUTHENTICATION_SCHEME:
				setWhttp_authenticationScheme(WHTTP_AUTHENTICATION_SCHEME_EDEFAULT);
				return;
			case WSDL2_0Package.END_POINT__WHTTP_AUTHENTICATION_REALM:
				setWhttp_authenticationRealm(WHTTP_AUTHENTICATION_REALM_EDEFAULT);
				return;
			case WSDL2_0Package.END_POINT__BINDING:
				setBinding((Binding)null);
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
			case WSDL2_0Package.END_POINT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WSDL2_0Package.END_POINT__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case WSDL2_0Package.END_POINT__WHTTP_AUTHENTICATION_SCHEME:
				return WHTTP_AUTHENTICATION_SCHEME_EDEFAULT == null ? whttp_authenticationScheme != null : !WHTTP_AUTHENTICATION_SCHEME_EDEFAULT.equals(whttp_authenticationScheme);
			case WSDL2_0Package.END_POINT__WHTTP_AUTHENTICATION_REALM:
				return WHTTP_AUTHENTICATION_REALM_EDEFAULT == null ? whttp_authenticationRealm != null : !WHTTP_AUTHENTICATION_REALM_EDEFAULT.equals(whttp_authenticationRealm);
			case WSDL2_0Package.END_POINT__BINDING:
				return binding != null;
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
		result.append(", address: ");
		result.append(address);
		result.append(", whttp_authenticationScheme: ");
		result.append(whttp_authenticationScheme);
		result.append(", whttp_authenticationRealm: ");
		result.append(whttp_authenticationRealm);
		result.append(')');
		return result.toString();
	}

} //EndPointImpl
