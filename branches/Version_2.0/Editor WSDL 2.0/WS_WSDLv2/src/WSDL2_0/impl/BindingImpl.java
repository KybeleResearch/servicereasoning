/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL2_0.impl;

import WSDL2_0.Binding;
import WSDL2_0.BindingFault;
import WSDL2_0.BindingOperation;
import WSDL2_0.Interface;
import WSDL2_0.WSDL2_0Package;
import WSDL2_0.Wsoap_Module;

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
 *   <li>{@link WSDL2_0.impl.BindingImpl#getName <em>Name</em>}</li>
 *   <li>{@link WSDL2_0.impl.BindingImpl#getType <em>Type</em>}</li>
 *   <li>{@link WSDL2_0.impl.BindingImpl#getWsoap_version <em>Wsoap version</em>}</li>
 *   <li>{@link WSDL2_0.impl.BindingImpl#getWsoap_protocol <em>Wsoap protocol</em>}</li>
 *   <li>{@link WSDL2_0.impl.BindingImpl#getWhttp_methodDefault <em>Whttp method Default</em>}</li>
 *   <li>{@link WSDL2_0.impl.BindingImpl#getWsoap_mepDefault <em>Wsoap mep Default</em>}</li>
 *   <li>{@link WSDL2_0.impl.BindingImpl#getWhttp_queryParameterSeparatorDefault <em>Whttp query Parameter Separator Default</em>}</li>
 *   <li>{@link WSDL2_0.impl.BindingImpl#getWhttp_cookies <em>Whttp cookies</em>}</li>
 *   <li>{@link WSDL2_0.impl.BindingImpl#getWhttp_contentEncodingDefault <em>Whttp content Encoding Default</em>}</li>
 *   <li>{@link WSDL2_0.impl.BindingImpl#getFault <em>Fault</em>}</li>
 *   <li>{@link WSDL2_0.impl.BindingImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link WSDL2_0.impl.BindingImpl#getWsoap_module <em>Wsoap module</em>}</li>
 *   <li>{@link WSDL2_0.impl.BindingImpl#getInterface <em>Interface</em>}</li>
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsoap_version() <em>Wsoap version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsoap_version()
	 * @generated
	 * @ordered
	 */
	protected static final String WSOAP_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsoap_version() <em>Wsoap version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsoap_version()
	 * @generated
	 * @ordered
	 */
	protected String wsoap_version = WSOAP_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsoap_protocol() <em>Wsoap protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsoap_protocol()
	 * @generated
	 * @ordered
	 */
	protected static final String WSOAP_PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsoap_protocol() <em>Wsoap protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsoap_protocol()
	 * @generated
	 * @ordered
	 */
	protected String wsoap_protocol = WSOAP_PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getWhttp_methodDefault() <em>Whttp method Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhttp_methodDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String WHTTP_METHOD_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhttp_methodDefault() <em>Whttp method Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhttp_methodDefault()
	 * @generated
	 * @ordered
	 */
	protected String whttp_methodDefault = WHTTP_METHOD_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsoap_mepDefault() <em>Wsoap mep Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsoap_mepDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String WSOAP_MEP_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsoap_mepDefault() <em>Wsoap mep Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsoap_mepDefault()
	 * @generated
	 * @ordered
	 */
	protected String wsoap_mepDefault = WSOAP_MEP_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWhttp_queryParameterSeparatorDefault() <em>Whttp query Parameter Separator Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhttp_queryParameterSeparatorDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String WHTTP_QUERY_PARAMETER_SEPARATOR_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhttp_queryParameterSeparatorDefault() <em>Whttp query Parameter Separator Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhttp_queryParameterSeparatorDefault()
	 * @generated
	 * @ordered
	 */
	protected String whttp_queryParameterSeparatorDefault = WHTTP_QUERY_PARAMETER_SEPARATOR_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWhttp_cookies() <em>Whttp cookies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhttp_cookies()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean WHTTP_COOKIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhttp_cookies() <em>Whttp cookies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhttp_cookies()
	 * @generated
	 * @ordered
	 */
	protected Boolean whttp_cookies = WHTTP_COOKIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getWhttp_contentEncodingDefault() <em>Whttp content Encoding Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhttp_contentEncodingDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String WHTTP_CONTENT_ENCODING_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhttp_contentEncodingDefault() <em>Whttp content Encoding Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhttp_contentEncodingDefault()
	 * @generated
	 * @ordered
	 */
	protected String whttp_contentEncodingDefault = WHTTP_CONTENT_ENCODING_DEFAULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFault() <em>Fault</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault()
	 * @generated
	 * @ordered
	 */
	protected EList<BindingFault> fault;

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
	 * The cached value of the '{@link #getWsoap_module() <em>Wsoap module</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsoap_module()
	 * @generated
	 * @ordered
	 */
	protected EList<Wsoap_Module> wsoap_module;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected Interface interface_;

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
		return WSDL2_0Package.eINSTANCE.getBinding();
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.BINDING__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.BINDING__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWsoap_version() {
		return wsoap_version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsoap_version(String newWsoap_version) {
		String oldWsoap_version = wsoap_version;
		wsoap_version = newWsoap_version;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.BINDING__WSOAP_VERSION, oldWsoap_version, wsoap_version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWsoap_protocol() {
		return wsoap_protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsoap_protocol(String newWsoap_protocol) {
		String oldWsoap_protocol = wsoap_protocol;
		wsoap_protocol = newWsoap_protocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.BINDING__WSOAP_PROTOCOL, oldWsoap_protocol, wsoap_protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWhttp_methodDefault() {
		return whttp_methodDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhttp_methodDefault(String newWhttp_methodDefault) {
		String oldWhttp_methodDefault = whttp_methodDefault;
		whttp_methodDefault = newWhttp_methodDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.BINDING__WHTTP_METHOD_DEFAULT, oldWhttp_methodDefault, whttp_methodDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWsoap_mepDefault() {
		return wsoap_mepDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsoap_mepDefault(String newWsoap_mepDefault) {
		String oldWsoap_mepDefault = wsoap_mepDefault;
		wsoap_mepDefault = newWsoap_mepDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.BINDING__WSOAP_MEP_DEFAULT, oldWsoap_mepDefault, wsoap_mepDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWhttp_queryParameterSeparatorDefault() {
		return whttp_queryParameterSeparatorDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhttp_queryParameterSeparatorDefault(String newWhttp_queryParameterSeparatorDefault) {
		String oldWhttp_queryParameterSeparatorDefault = whttp_queryParameterSeparatorDefault;
		whttp_queryParameterSeparatorDefault = newWhttp_queryParameterSeparatorDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.BINDING__WHTTP_QUERY_PARAMETER_SEPARATOR_DEFAULT, oldWhttp_queryParameterSeparatorDefault, whttp_queryParameterSeparatorDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getWhttp_cookies() {
		return whttp_cookies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhttp_cookies(Boolean newWhttp_cookies) {
		Boolean oldWhttp_cookies = whttp_cookies;
		whttp_cookies = newWhttp_cookies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.BINDING__WHTTP_COOKIES, oldWhttp_cookies, whttp_cookies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWhttp_contentEncodingDefault() {
		return whttp_contentEncodingDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhttp_contentEncodingDefault(String newWhttp_contentEncodingDefault) {
		String oldWhttp_contentEncodingDefault = whttp_contentEncodingDefault;
		whttp_contentEncodingDefault = newWhttp_contentEncodingDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.BINDING__WHTTP_CONTENT_ENCODING_DEFAULT, oldWhttp_contentEncodingDefault, whttp_contentEncodingDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BindingFault> getFault() {
		if (fault == null) {
			fault = new EObjectContainmentEList<BindingFault>(BindingFault.class, this, WSDL2_0Package.BINDING__FAULT);
		}
		return fault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BindingOperation> getOperation() {
		if (operation == null) {
			operation = new EObjectContainmentEList<BindingOperation>(BindingOperation.class, this, WSDL2_0Package.BINDING__OPERATION);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Wsoap_Module> getWsoap_module() {
		if (wsoap_module == null) {
			wsoap_module = new EObjectContainmentEList<Wsoap_Module>(Wsoap_Module.class, this, WSDL2_0Package.BINDING__WSOAP_MODULE);
		}
		return wsoap_module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getInterface() {
		if (interface_ != null && interface_.eIsProxy()) {
			InternalEObject oldInterface = (InternalEObject)interface_;
			interface_ = (Interface)eResolveProxy(oldInterface);
			if (interface_ != oldInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WSDL2_0Package.BINDING__INTERFACE, oldInterface, interface_));
			}
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(Interface newInterface) {
		Interface oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.BINDING__INTERFACE, oldInterface, interface_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WSDL2_0Package.BINDING__FAULT:
				return ((InternalEList<?>)getFault()).basicRemove(otherEnd, msgs);
			case WSDL2_0Package.BINDING__OPERATION:
				return ((InternalEList<?>)getOperation()).basicRemove(otherEnd, msgs);
			case WSDL2_0Package.BINDING__WSOAP_MODULE:
				return ((InternalEList<?>)getWsoap_module()).basicRemove(otherEnd, msgs);
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
			case WSDL2_0Package.BINDING__NAME:
				return getName();
			case WSDL2_0Package.BINDING__TYPE:
				return getType();
			case WSDL2_0Package.BINDING__WSOAP_VERSION:
				return getWsoap_version();
			case WSDL2_0Package.BINDING__WSOAP_PROTOCOL:
				return getWsoap_protocol();
			case WSDL2_0Package.BINDING__WHTTP_METHOD_DEFAULT:
				return getWhttp_methodDefault();
			case WSDL2_0Package.BINDING__WSOAP_MEP_DEFAULT:
				return getWsoap_mepDefault();
			case WSDL2_0Package.BINDING__WHTTP_QUERY_PARAMETER_SEPARATOR_DEFAULT:
				return getWhttp_queryParameterSeparatorDefault();
			case WSDL2_0Package.BINDING__WHTTP_COOKIES:
				return getWhttp_cookies();
			case WSDL2_0Package.BINDING__WHTTP_CONTENT_ENCODING_DEFAULT:
				return getWhttp_contentEncodingDefault();
			case WSDL2_0Package.BINDING__FAULT:
				return getFault();
			case WSDL2_0Package.BINDING__OPERATION:
				return getOperation();
			case WSDL2_0Package.BINDING__WSOAP_MODULE:
				return getWsoap_module();
			case WSDL2_0Package.BINDING__INTERFACE:
				if (resolve) return getInterface();
				return basicGetInterface();
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
			case WSDL2_0Package.BINDING__NAME:
				setName((String)newValue);
				return;
			case WSDL2_0Package.BINDING__TYPE:
				setType((String)newValue);
				return;
			case WSDL2_0Package.BINDING__WSOAP_VERSION:
				setWsoap_version((String)newValue);
				return;
			case WSDL2_0Package.BINDING__WSOAP_PROTOCOL:
				setWsoap_protocol((String)newValue);
				return;
			case WSDL2_0Package.BINDING__WHTTP_METHOD_DEFAULT:
				setWhttp_methodDefault((String)newValue);
				return;
			case WSDL2_0Package.BINDING__WSOAP_MEP_DEFAULT:
				setWsoap_mepDefault((String)newValue);
				return;
			case WSDL2_0Package.BINDING__WHTTP_QUERY_PARAMETER_SEPARATOR_DEFAULT:
				setWhttp_queryParameterSeparatorDefault((String)newValue);
				return;
			case WSDL2_0Package.BINDING__WHTTP_COOKIES:
				setWhttp_cookies((Boolean)newValue);
				return;
			case WSDL2_0Package.BINDING__WHTTP_CONTENT_ENCODING_DEFAULT:
				setWhttp_contentEncodingDefault((String)newValue);
				return;
			case WSDL2_0Package.BINDING__FAULT:
				getFault().clear();
				getFault().addAll((Collection<? extends BindingFault>)newValue);
				return;
			case WSDL2_0Package.BINDING__OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection<? extends BindingOperation>)newValue);
				return;
			case WSDL2_0Package.BINDING__WSOAP_MODULE:
				getWsoap_module().clear();
				getWsoap_module().addAll((Collection<? extends Wsoap_Module>)newValue);
				return;
			case WSDL2_0Package.BINDING__INTERFACE:
				setInterface((Interface)newValue);
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
			case WSDL2_0Package.BINDING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WSDL2_0Package.BINDING__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case WSDL2_0Package.BINDING__WSOAP_VERSION:
				setWsoap_version(WSOAP_VERSION_EDEFAULT);
				return;
			case WSDL2_0Package.BINDING__WSOAP_PROTOCOL:
				setWsoap_protocol(WSOAP_PROTOCOL_EDEFAULT);
				return;
			case WSDL2_0Package.BINDING__WHTTP_METHOD_DEFAULT:
				setWhttp_methodDefault(WHTTP_METHOD_DEFAULT_EDEFAULT);
				return;
			case WSDL2_0Package.BINDING__WSOAP_MEP_DEFAULT:
				setWsoap_mepDefault(WSOAP_MEP_DEFAULT_EDEFAULT);
				return;
			case WSDL2_0Package.BINDING__WHTTP_QUERY_PARAMETER_SEPARATOR_DEFAULT:
				setWhttp_queryParameterSeparatorDefault(WHTTP_QUERY_PARAMETER_SEPARATOR_DEFAULT_EDEFAULT);
				return;
			case WSDL2_0Package.BINDING__WHTTP_COOKIES:
				setWhttp_cookies(WHTTP_COOKIES_EDEFAULT);
				return;
			case WSDL2_0Package.BINDING__WHTTP_CONTENT_ENCODING_DEFAULT:
				setWhttp_contentEncodingDefault(WHTTP_CONTENT_ENCODING_DEFAULT_EDEFAULT);
				return;
			case WSDL2_0Package.BINDING__FAULT:
				getFault().clear();
				return;
			case WSDL2_0Package.BINDING__OPERATION:
				getOperation().clear();
				return;
			case WSDL2_0Package.BINDING__WSOAP_MODULE:
				getWsoap_module().clear();
				return;
			case WSDL2_0Package.BINDING__INTERFACE:
				setInterface((Interface)null);
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
			case WSDL2_0Package.BINDING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WSDL2_0Package.BINDING__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case WSDL2_0Package.BINDING__WSOAP_VERSION:
				return WSOAP_VERSION_EDEFAULT == null ? wsoap_version != null : !WSOAP_VERSION_EDEFAULT.equals(wsoap_version);
			case WSDL2_0Package.BINDING__WSOAP_PROTOCOL:
				return WSOAP_PROTOCOL_EDEFAULT == null ? wsoap_protocol != null : !WSOAP_PROTOCOL_EDEFAULT.equals(wsoap_protocol);
			case WSDL2_0Package.BINDING__WHTTP_METHOD_DEFAULT:
				return WHTTP_METHOD_DEFAULT_EDEFAULT == null ? whttp_methodDefault != null : !WHTTP_METHOD_DEFAULT_EDEFAULT.equals(whttp_methodDefault);
			case WSDL2_0Package.BINDING__WSOAP_MEP_DEFAULT:
				return WSOAP_MEP_DEFAULT_EDEFAULT == null ? wsoap_mepDefault != null : !WSOAP_MEP_DEFAULT_EDEFAULT.equals(wsoap_mepDefault);
			case WSDL2_0Package.BINDING__WHTTP_QUERY_PARAMETER_SEPARATOR_DEFAULT:
				return WHTTP_QUERY_PARAMETER_SEPARATOR_DEFAULT_EDEFAULT == null ? whttp_queryParameterSeparatorDefault != null : !WHTTP_QUERY_PARAMETER_SEPARATOR_DEFAULT_EDEFAULT.equals(whttp_queryParameterSeparatorDefault);
			case WSDL2_0Package.BINDING__WHTTP_COOKIES:
				return WHTTP_COOKIES_EDEFAULT == null ? whttp_cookies != null : !WHTTP_COOKIES_EDEFAULT.equals(whttp_cookies);
			case WSDL2_0Package.BINDING__WHTTP_CONTENT_ENCODING_DEFAULT:
				return WHTTP_CONTENT_ENCODING_DEFAULT_EDEFAULT == null ? whttp_contentEncodingDefault != null : !WHTTP_CONTENT_ENCODING_DEFAULT_EDEFAULT.equals(whttp_contentEncodingDefault);
			case WSDL2_0Package.BINDING__FAULT:
				return fault != null && !fault.isEmpty();
			case WSDL2_0Package.BINDING__OPERATION:
				return operation != null && !operation.isEmpty();
			case WSDL2_0Package.BINDING__WSOAP_MODULE:
				return wsoap_module != null && !wsoap_module.isEmpty();
			case WSDL2_0Package.BINDING__INTERFACE:
				return interface_ != null;
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
		result.append(", type: ");
		result.append(type);
		result.append(", wsoap_version: ");
		result.append(wsoap_version);
		result.append(", wsoap_protocol: ");
		result.append(wsoap_protocol);
		result.append(", whttp_methodDefault: ");
		result.append(whttp_methodDefault);
		result.append(", wsoap_mepDefault: ");
		result.append(wsoap_mepDefault);
		result.append(", whttp_queryParameterSeparatorDefault: ");
		result.append(whttp_queryParameterSeparatorDefault);
		result.append(", whttp_cookies: ");
		result.append(whttp_cookies);
		result.append(", whttp_contentEncodingDefault: ");
		result.append(whttp_contentEncodingDefault);
		result.append(')');
		return result.toString();
	}

} //BindingImpl
