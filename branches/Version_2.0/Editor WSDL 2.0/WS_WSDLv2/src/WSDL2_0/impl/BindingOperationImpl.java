/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL2_0.impl;

import WSDL2_0.BindingInfault;
import WSDL2_0.BindingInput;
import WSDL2_0.BindingOperation;
import WSDL2_0.BindingOutfault;
import WSDL2_0.BindingOutput;
import WSDL2_0.InterfaceOperation;
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
 * An implementation of the model object '<em><b>Binding Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WSDL2_0.impl.BindingOperationImpl#getWsoap_mep <em>Wsoap mep</em>}</li>
 *   <li>{@link WSDL2_0.impl.BindingOperationImpl#getWsoap_action <em>Wsoap action</em>}</li>
 *   <li>{@link WSDL2_0.impl.BindingOperationImpl#getWhttp_location <em>Whttp location</em>}</li>
 *   <li>{@link WSDL2_0.impl.BindingOperationImpl#getWhttp_method <em>Whttp method</em>}</li>
 *   <li>{@link WSDL2_0.impl.BindingOperationImpl#getWhttp_inputSerialization <em>Whttp input Serialization</em>}</li>
 *   <li>{@link WSDL2_0.impl.BindingOperationImpl#getWhttp_outputSerialization <em>Whttp output Serialization</em>}</li>
 *   <li>{@link WSDL2_0.impl.BindingOperationImpl#getWhttp_faultSerialization <em>Whttp fault Serialization</em>}</li>
 *   <li>{@link WSDL2_0.impl.BindingOperationImpl#getWhttp_queryParameterSeparator <em>Whttp query Parameter Separator</em>}</li>
 *   <li>{@link WSDL2_0.impl.BindingOperationImpl#getWhttp_contentEncodingDefault <em>Whttp content Encoding Default</em>}</li>
 *   <li>{@link WSDL2_0.impl.BindingOperationImpl#getWhttp_ignoreUncited <em>Whttp ignore Uncited</em>}</li>
 *   <li>{@link WSDL2_0.impl.BindingOperationImpl#getInput <em>Input</em>}</li>
 *   <li>{@link WSDL2_0.impl.BindingOperationImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link WSDL2_0.impl.BindingOperationImpl#getInfault <em>Infault</em>}</li>
 *   <li>{@link WSDL2_0.impl.BindingOperationImpl#getOutfault <em>Outfault</em>}</li>
 *   <li>{@link WSDL2_0.impl.BindingOperationImpl#getWsoap_module <em>Wsoap module</em>}</li>
 *   <li>{@link WSDL2_0.impl.BindingOperationImpl#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingOperationImpl extends ObjectImpl implements BindingOperation {
	/**
	 * The default value of the '{@link #getWsoap_mep() <em>Wsoap mep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsoap_mep()
	 * @generated
	 * @ordered
	 */
	protected static final String WSOAP_MEP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsoap_mep() <em>Wsoap mep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsoap_mep()
	 * @generated
	 * @ordered
	 */
	protected String wsoap_mep = WSOAP_MEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsoap_action() <em>Wsoap action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsoap_action()
	 * @generated
	 * @ordered
	 */
	protected static final String WSOAP_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsoap_action() <em>Wsoap action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsoap_action()
	 * @generated
	 * @ordered
	 */
	protected String wsoap_action = WSOAP_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getWhttp_location() <em>Whttp location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhttp_location()
	 * @generated
	 * @ordered
	 */
	protected static final String WHTTP_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhttp_location() <em>Whttp location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhttp_location()
	 * @generated
	 * @ordered
	 */
	protected String whttp_location = WHTTP_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getWhttp_method() <em>Whttp method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhttp_method()
	 * @generated
	 * @ordered
	 */
	protected static final String WHTTP_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhttp_method() <em>Whttp method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhttp_method()
	 * @generated
	 * @ordered
	 */
	protected String whttp_method = WHTTP_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getWhttp_inputSerialization() <em>Whttp input Serialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhttp_inputSerialization()
	 * @generated
	 * @ordered
	 */
	protected static final String WHTTP_INPUT_SERIALIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhttp_inputSerialization() <em>Whttp input Serialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhttp_inputSerialization()
	 * @generated
	 * @ordered
	 */
	protected String whttp_inputSerialization = WHTTP_INPUT_SERIALIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getWhttp_outputSerialization() <em>Whttp output Serialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhttp_outputSerialization()
	 * @generated
	 * @ordered
	 */
	protected static final String WHTTP_OUTPUT_SERIALIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhttp_outputSerialization() <em>Whttp output Serialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhttp_outputSerialization()
	 * @generated
	 * @ordered
	 */
	protected String whttp_outputSerialization = WHTTP_OUTPUT_SERIALIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getWhttp_faultSerialization() <em>Whttp fault Serialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhttp_faultSerialization()
	 * @generated
	 * @ordered
	 */
	protected static final String WHTTP_FAULT_SERIALIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhttp_faultSerialization() <em>Whttp fault Serialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhttp_faultSerialization()
	 * @generated
	 * @ordered
	 */
	protected String whttp_faultSerialization = WHTTP_FAULT_SERIALIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getWhttp_queryParameterSeparator() <em>Whttp query Parameter Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhttp_queryParameterSeparator()
	 * @generated
	 * @ordered
	 */
	protected static final String WHTTP_QUERY_PARAMETER_SEPARATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhttp_queryParameterSeparator() <em>Whttp query Parameter Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhttp_queryParameterSeparator()
	 * @generated
	 * @ordered
	 */
	protected String whttp_queryParameterSeparator = WHTTP_QUERY_PARAMETER_SEPARATOR_EDEFAULT;

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
	 * The default value of the '{@link #getWhttp_ignoreUncited() <em>Whttp ignore Uncited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhttp_ignoreUncited()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean WHTTP_IGNORE_UNCITED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhttp_ignoreUncited() <em>Whttp ignore Uncited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhttp_ignoreUncited()
	 * @generated
	 * @ordered
	 */
	protected Boolean whttp_ignoreUncited = WHTTP_IGNORE_UNCITED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<BindingInput> input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<BindingOutput> output;

	/**
	 * The cached value of the '{@link #getInfault() <em>Infault</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfault()
	 * @generated
	 * @ordered
	 */
	protected EList<BindingInfault> infault;

	/**
	 * The cached value of the '{@link #getOutfault() <em>Outfault</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutfault()
	 * @generated
	 * @ordered
	 */
	protected EList<BindingOutfault> outfault;

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
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected InterfaceOperation ref;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WSDL2_0Package.eINSTANCE.getBindingOperation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWsoap_mep() {
		return wsoap_mep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsoap_mep(String newWsoap_mep) {
		String oldWsoap_mep = wsoap_mep;
		wsoap_mep = newWsoap_mep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.BINDING_OPERATION__WSOAP_MEP, oldWsoap_mep, wsoap_mep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWsoap_action() {
		return wsoap_action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsoap_action(String newWsoap_action) {
		String oldWsoap_action = wsoap_action;
		wsoap_action = newWsoap_action;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.BINDING_OPERATION__WSOAP_ACTION, oldWsoap_action, wsoap_action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWhttp_location() {
		return whttp_location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhttp_location(String newWhttp_location) {
		String oldWhttp_location = whttp_location;
		whttp_location = newWhttp_location;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.BINDING_OPERATION__WHTTP_LOCATION, oldWhttp_location, whttp_location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWhttp_method() {
		return whttp_method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhttp_method(String newWhttp_method) {
		String oldWhttp_method = whttp_method;
		whttp_method = newWhttp_method;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.BINDING_OPERATION__WHTTP_METHOD, oldWhttp_method, whttp_method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWhttp_inputSerialization() {
		return whttp_inputSerialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhttp_inputSerialization(String newWhttp_inputSerialization) {
		String oldWhttp_inputSerialization = whttp_inputSerialization;
		whttp_inputSerialization = newWhttp_inputSerialization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.BINDING_OPERATION__WHTTP_INPUT_SERIALIZATION, oldWhttp_inputSerialization, whttp_inputSerialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWhttp_outputSerialization() {
		return whttp_outputSerialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhttp_outputSerialization(String newWhttp_outputSerialization) {
		String oldWhttp_outputSerialization = whttp_outputSerialization;
		whttp_outputSerialization = newWhttp_outputSerialization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.BINDING_OPERATION__WHTTP_OUTPUT_SERIALIZATION, oldWhttp_outputSerialization, whttp_outputSerialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWhttp_faultSerialization() {
		return whttp_faultSerialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhttp_faultSerialization(String newWhttp_faultSerialization) {
		String oldWhttp_faultSerialization = whttp_faultSerialization;
		whttp_faultSerialization = newWhttp_faultSerialization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.BINDING_OPERATION__WHTTP_FAULT_SERIALIZATION, oldWhttp_faultSerialization, whttp_faultSerialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWhttp_queryParameterSeparator() {
		return whttp_queryParameterSeparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhttp_queryParameterSeparator(String newWhttp_queryParameterSeparator) {
		String oldWhttp_queryParameterSeparator = whttp_queryParameterSeparator;
		whttp_queryParameterSeparator = newWhttp_queryParameterSeparator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.BINDING_OPERATION__WHTTP_QUERY_PARAMETER_SEPARATOR, oldWhttp_queryParameterSeparator, whttp_queryParameterSeparator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.BINDING_OPERATION__WHTTP_CONTENT_ENCODING_DEFAULT, oldWhttp_contentEncodingDefault, whttp_contentEncodingDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getWhttp_ignoreUncited() {
		return whttp_ignoreUncited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhttp_ignoreUncited(Boolean newWhttp_ignoreUncited) {
		Boolean oldWhttp_ignoreUncited = whttp_ignoreUncited;
		whttp_ignoreUncited = newWhttp_ignoreUncited;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.BINDING_OPERATION__WHTTP_IGNORE_UNCITED, oldWhttp_ignoreUncited, whttp_ignoreUncited));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BindingInput> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<BindingInput>(BindingInput.class, this, WSDL2_0Package.BINDING_OPERATION__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BindingOutput> getOutput() {
		if (output == null) {
			output = new EObjectContainmentEList<BindingOutput>(BindingOutput.class, this, WSDL2_0Package.BINDING_OPERATION__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BindingInfault> getInfault() {
		if (infault == null) {
			infault = new EObjectContainmentEList<BindingInfault>(BindingInfault.class, this, WSDL2_0Package.BINDING_OPERATION__INFAULT);
		}
		return infault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BindingOutfault> getOutfault() {
		if (outfault == null) {
			outfault = new EObjectContainmentEList<BindingOutfault>(BindingOutfault.class, this, WSDL2_0Package.BINDING_OPERATION__OUTFAULT);
		}
		return outfault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Wsoap_Module> getWsoap_module() {
		if (wsoap_module == null) {
			wsoap_module = new EObjectContainmentEList<Wsoap_Module>(Wsoap_Module.class, this, WSDL2_0Package.BINDING_OPERATION__WSOAP_MODULE);
		}
		return wsoap_module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceOperation getRef() {
		if (ref != null && ref.eIsProxy()) {
			InternalEObject oldRef = (InternalEObject)ref;
			ref = (InterfaceOperation)eResolveProxy(oldRef);
			if (ref != oldRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WSDL2_0Package.BINDING_OPERATION__REF, oldRef, ref));
			}
		}
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceOperation basicGetRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(InterfaceOperation newRef) {
		InterfaceOperation oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.BINDING_OPERATION__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WSDL2_0Package.BINDING_OPERATION__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
			case WSDL2_0Package.BINDING_OPERATION__OUTPUT:
				return ((InternalEList<?>)getOutput()).basicRemove(otherEnd, msgs);
			case WSDL2_0Package.BINDING_OPERATION__INFAULT:
				return ((InternalEList<?>)getInfault()).basicRemove(otherEnd, msgs);
			case WSDL2_0Package.BINDING_OPERATION__OUTFAULT:
				return ((InternalEList<?>)getOutfault()).basicRemove(otherEnd, msgs);
			case WSDL2_0Package.BINDING_OPERATION__WSOAP_MODULE:
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
			case WSDL2_0Package.BINDING_OPERATION__WSOAP_MEP:
				return getWsoap_mep();
			case WSDL2_0Package.BINDING_OPERATION__WSOAP_ACTION:
				return getWsoap_action();
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_LOCATION:
				return getWhttp_location();
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_METHOD:
				return getWhttp_method();
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_INPUT_SERIALIZATION:
				return getWhttp_inputSerialization();
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_OUTPUT_SERIALIZATION:
				return getWhttp_outputSerialization();
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_FAULT_SERIALIZATION:
				return getWhttp_faultSerialization();
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_QUERY_PARAMETER_SEPARATOR:
				return getWhttp_queryParameterSeparator();
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_CONTENT_ENCODING_DEFAULT:
				return getWhttp_contentEncodingDefault();
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_IGNORE_UNCITED:
				return getWhttp_ignoreUncited();
			case WSDL2_0Package.BINDING_OPERATION__INPUT:
				return getInput();
			case WSDL2_0Package.BINDING_OPERATION__OUTPUT:
				return getOutput();
			case WSDL2_0Package.BINDING_OPERATION__INFAULT:
				return getInfault();
			case WSDL2_0Package.BINDING_OPERATION__OUTFAULT:
				return getOutfault();
			case WSDL2_0Package.BINDING_OPERATION__WSOAP_MODULE:
				return getWsoap_module();
			case WSDL2_0Package.BINDING_OPERATION__REF:
				if (resolve) return getRef();
				return basicGetRef();
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
			case WSDL2_0Package.BINDING_OPERATION__WSOAP_MEP:
				setWsoap_mep((String)newValue);
				return;
			case WSDL2_0Package.BINDING_OPERATION__WSOAP_ACTION:
				setWsoap_action((String)newValue);
				return;
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_LOCATION:
				setWhttp_location((String)newValue);
				return;
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_METHOD:
				setWhttp_method((String)newValue);
				return;
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_INPUT_SERIALIZATION:
				setWhttp_inputSerialization((String)newValue);
				return;
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_OUTPUT_SERIALIZATION:
				setWhttp_outputSerialization((String)newValue);
				return;
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_FAULT_SERIALIZATION:
				setWhttp_faultSerialization((String)newValue);
				return;
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_QUERY_PARAMETER_SEPARATOR:
				setWhttp_queryParameterSeparator((String)newValue);
				return;
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_CONTENT_ENCODING_DEFAULT:
				setWhttp_contentEncodingDefault((String)newValue);
				return;
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_IGNORE_UNCITED:
				setWhttp_ignoreUncited((Boolean)newValue);
				return;
			case WSDL2_0Package.BINDING_OPERATION__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends BindingInput>)newValue);
				return;
			case WSDL2_0Package.BINDING_OPERATION__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends BindingOutput>)newValue);
				return;
			case WSDL2_0Package.BINDING_OPERATION__INFAULT:
				getInfault().clear();
				getInfault().addAll((Collection<? extends BindingInfault>)newValue);
				return;
			case WSDL2_0Package.BINDING_OPERATION__OUTFAULT:
				getOutfault().clear();
				getOutfault().addAll((Collection<? extends BindingOutfault>)newValue);
				return;
			case WSDL2_0Package.BINDING_OPERATION__WSOAP_MODULE:
				getWsoap_module().clear();
				getWsoap_module().addAll((Collection<? extends Wsoap_Module>)newValue);
				return;
			case WSDL2_0Package.BINDING_OPERATION__REF:
				setRef((InterfaceOperation)newValue);
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
			case WSDL2_0Package.BINDING_OPERATION__WSOAP_MEP:
				setWsoap_mep(WSOAP_MEP_EDEFAULT);
				return;
			case WSDL2_0Package.BINDING_OPERATION__WSOAP_ACTION:
				setWsoap_action(WSOAP_ACTION_EDEFAULT);
				return;
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_LOCATION:
				setWhttp_location(WHTTP_LOCATION_EDEFAULT);
				return;
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_METHOD:
				setWhttp_method(WHTTP_METHOD_EDEFAULT);
				return;
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_INPUT_SERIALIZATION:
				setWhttp_inputSerialization(WHTTP_INPUT_SERIALIZATION_EDEFAULT);
				return;
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_OUTPUT_SERIALIZATION:
				setWhttp_outputSerialization(WHTTP_OUTPUT_SERIALIZATION_EDEFAULT);
				return;
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_FAULT_SERIALIZATION:
				setWhttp_faultSerialization(WHTTP_FAULT_SERIALIZATION_EDEFAULT);
				return;
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_QUERY_PARAMETER_SEPARATOR:
				setWhttp_queryParameterSeparator(WHTTP_QUERY_PARAMETER_SEPARATOR_EDEFAULT);
				return;
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_CONTENT_ENCODING_DEFAULT:
				setWhttp_contentEncodingDefault(WHTTP_CONTENT_ENCODING_DEFAULT_EDEFAULT);
				return;
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_IGNORE_UNCITED:
				setWhttp_ignoreUncited(WHTTP_IGNORE_UNCITED_EDEFAULT);
				return;
			case WSDL2_0Package.BINDING_OPERATION__INPUT:
				getInput().clear();
				return;
			case WSDL2_0Package.BINDING_OPERATION__OUTPUT:
				getOutput().clear();
				return;
			case WSDL2_0Package.BINDING_OPERATION__INFAULT:
				getInfault().clear();
				return;
			case WSDL2_0Package.BINDING_OPERATION__OUTFAULT:
				getOutfault().clear();
				return;
			case WSDL2_0Package.BINDING_OPERATION__WSOAP_MODULE:
				getWsoap_module().clear();
				return;
			case WSDL2_0Package.BINDING_OPERATION__REF:
				setRef((InterfaceOperation)null);
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
			case WSDL2_0Package.BINDING_OPERATION__WSOAP_MEP:
				return WSOAP_MEP_EDEFAULT == null ? wsoap_mep != null : !WSOAP_MEP_EDEFAULT.equals(wsoap_mep);
			case WSDL2_0Package.BINDING_OPERATION__WSOAP_ACTION:
				return WSOAP_ACTION_EDEFAULT == null ? wsoap_action != null : !WSOAP_ACTION_EDEFAULT.equals(wsoap_action);
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_LOCATION:
				return WHTTP_LOCATION_EDEFAULT == null ? whttp_location != null : !WHTTP_LOCATION_EDEFAULT.equals(whttp_location);
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_METHOD:
				return WHTTP_METHOD_EDEFAULT == null ? whttp_method != null : !WHTTP_METHOD_EDEFAULT.equals(whttp_method);
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_INPUT_SERIALIZATION:
				return WHTTP_INPUT_SERIALIZATION_EDEFAULT == null ? whttp_inputSerialization != null : !WHTTP_INPUT_SERIALIZATION_EDEFAULT.equals(whttp_inputSerialization);
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_OUTPUT_SERIALIZATION:
				return WHTTP_OUTPUT_SERIALIZATION_EDEFAULT == null ? whttp_outputSerialization != null : !WHTTP_OUTPUT_SERIALIZATION_EDEFAULT.equals(whttp_outputSerialization);
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_FAULT_SERIALIZATION:
				return WHTTP_FAULT_SERIALIZATION_EDEFAULT == null ? whttp_faultSerialization != null : !WHTTP_FAULT_SERIALIZATION_EDEFAULT.equals(whttp_faultSerialization);
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_QUERY_PARAMETER_SEPARATOR:
				return WHTTP_QUERY_PARAMETER_SEPARATOR_EDEFAULT == null ? whttp_queryParameterSeparator != null : !WHTTP_QUERY_PARAMETER_SEPARATOR_EDEFAULT.equals(whttp_queryParameterSeparator);
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_CONTENT_ENCODING_DEFAULT:
				return WHTTP_CONTENT_ENCODING_DEFAULT_EDEFAULT == null ? whttp_contentEncodingDefault != null : !WHTTP_CONTENT_ENCODING_DEFAULT_EDEFAULT.equals(whttp_contentEncodingDefault);
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_IGNORE_UNCITED:
				return WHTTP_IGNORE_UNCITED_EDEFAULT == null ? whttp_ignoreUncited != null : !WHTTP_IGNORE_UNCITED_EDEFAULT.equals(whttp_ignoreUncited);
			case WSDL2_0Package.BINDING_OPERATION__INPUT:
				return input != null && !input.isEmpty();
			case WSDL2_0Package.BINDING_OPERATION__OUTPUT:
				return output != null && !output.isEmpty();
			case WSDL2_0Package.BINDING_OPERATION__INFAULT:
				return infault != null && !infault.isEmpty();
			case WSDL2_0Package.BINDING_OPERATION__OUTFAULT:
				return outfault != null && !outfault.isEmpty();
			case WSDL2_0Package.BINDING_OPERATION__WSOAP_MODULE:
				return wsoap_module != null && !wsoap_module.isEmpty();
			case WSDL2_0Package.BINDING_OPERATION__REF:
				return ref != null;
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
		result.append(" (wsoap_mep: ");
		result.append(wsoap_mep);
		result.append(", wsoap_action: ");
		result.append(wsoap_action);
		result.append(", whttp_location: ");
		result.append(whttp_location);
		result.append(", whttp_method: ");
		result.append(whttp_method);
		result.append(", whttp_inputSerialization: ");
		result.append(whttp_inputSerialization);
		result.append(", whttp_outputSerialization: ");
		result.append(whttp_outputSerialization);
		result.append(", whttp_faultSerialization: ");
		result.append(whttp_faultSerialization);
		result.append(", whttp_queryParameterSeparator: ");
		result.append(whttp_queryParameterSeparator);
		result.append(", whttp_contentEncodingDefault: ");
		result.append(whttp_contentEncodingDefault);
		result.append(", whttp_ignoreUncited: ");
		result.append(whttp_ignoreUncited);
		result.append(')');
		return result.toString();
	}

} //BindingOperationImpl
