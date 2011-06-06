/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL1_1.impl;

import WSDL1_1.BindingFault;
import WSDL1_1.BindingInput;
import WSDL1_1.BindingOperation;
import WSDL1_1.BindingOutput;
import WSDL1_1.OperationHTTP;
import WSDL1_1.OperationSOAP;
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
 * An implementation of the model object '<em><b>Binding Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WSDL1_1.impl.BindingOperationImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link WSDL1_1.impl.BindingOperationImpl#getInput <em>Input</em>}</li>
 *   <li>{@link WSDL1_1.impl.BindingOperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link WSDL1_1.impl.BindingOperationImpl#getFault <em>Fault</em>}</li>
 *   <li>{@link WSDL1_1.impl.BindingOperationImpl#getSoapoperation <em>Soapoperation</em>}</li>
 *   <li>{@link WSDL1_1.impl.BindingOperationImpl#getHttpoperation <em>Httpoperation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingOperationImpl extends ObjectImpl implements BindingOperation {
	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected BindingOutput output;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected BindingInput input;

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
	 * The cached value of the '{@link #getFault() <em>Fault</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault()
	 * @generated
	 * @ordered
	 */
	protected EList<BindingFault> fault;

	/**
	 * The cached value of the '{@link #getSoapoperation() <em>Soapoperation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoapoperation()
	 * @generated
	 * @ordered
	 */
	protected OperationSOAP soapoperation;

	/**
	 * The cached value of the '{@link #getHttpoperation() <em>Httpoperation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpoperation()
	 * @generated
	 * @ordered
	 */
	protected OperationHTTP httpoperation;

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
		return WSDL1_1Package.eINSTANCE.getBindingOperation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingOutput getOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutput(BindingOutput newOutput, NotificationChain msgs) {
		BindingOutput oldOutput = output;
		output = newOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL1_1Package.BINDING_OPERATION__OUTPUT, oldOutput, newOutput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(BindingOutput newOutput) {
		if (newOutput != output) {
			NotificationChain msgs = null;
			if (output != null)
				msgs = ((InternalEObject)output).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.BINDING_OPERATION__OUTPUT, null, msgs);
			if (newOutput != null)
				msgs = ((InternalEObject)newOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.BINDING_OPERATION__OUTPUT, null, msgs);
			msgs = basicSetOutput(newOutput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.BINDING_OPERATION__OUTPUT, newOutput, newOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingInput getInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInput(BindingInput newInput, NotificationChain msgs) {
		BindingInput oldInput = input;
		input = newInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL1_1Package.BINDING_OPERATION__INPUT, oldInput, newInput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(BindingInput newInput) {
		if (newInput != input) {
			NotificationChain msgs = null;
			if (input != null)
				msgs = ((InternalEObject)input).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.BINDING_OPERATION__INPUT, null, msgs);
			if (newInput != null)
				msgs = ((InternalEObject)newInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.BINDING_OPERATION__INPUT, null, msgs);
			msgs = basicSetInput(newInput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.BINDING_OPERATION__INPUT, newInput, newInput));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.BINDING_OPERATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BindingFault> getFault() {
		if (fault == null) {
			fault = new EObjectContainmentEList<BindingFault>(BindingFault.class, this, WSDL1_1Package.BINDING_OPERATION__FAULT);
		}
		return fault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationSOAP getSoapoperation() {
		return soapoperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoapoperation(OperationSOAP newSoapoperation, NotificationChain msgs) {
		OperationSOAP oldSoapoperation = soapoperation;
		soapoperation = newSoapoperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL1_1Package.BINDING_OPERATION__SOAPOPERATION, oldSoapoperation, newSoapoperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoapoperation(OperationSOAP newSoapoperation) {
		if (newSoapoperation != soapoperation) {
			NotificationChain msgs = null;
			if (soapoperation != null)
				msgs = ((InternalEObject)soapoperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.BINDING_OPERATION__SOAPOPERATION, null, msgs);
			if (newSoapoperation != null)
				msgs = ((InternalEObject)newSoapoperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.BINDING_OPERATION__SOAPOPERATION, null, msgs);
			msgs = basicSetSoapoperation(newSoapoperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.BINDING_OPERATION__SOAPOPERATION, newSoapoperation, newSoapoperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationHTTP getHttpoperation() {
		return httpoperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHttpoperation(OperationHTTP newHttpoperation, NotificationChain msgs) {
		OperationHTTP oldHttpoperation = httpoperation;
		httpoperation = newHttpoperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL1_1Package.BINDING_OPERATION__HTTPOPERATION, oldHttpoperation, newHttpoperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpoperation(OperationHTTP newHttpoperation) {
		if (newHttpoperation != httpoperation) {
			NotificationChain msgs = null;
			if (httpoperation != null)
				msgs = ((InternalEObject)httpoperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.BINDING_OPERATION__HTTPOPERATION, null, msgs);
			if (newHttpoperation != null)
				msgs = ((InternalEObject)newHttpoperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.BINDING_OPERATION__HTTPOPERATION, null, msgs);
			msgs = basicSetHttpoperation(newHttpoperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.BINDING_OPERATION__HTTPOPERATION, newHttpoperation, newHttpoperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WSDL1_1Package.BINDING_OPERATION__OUTPUT:
				return basicSetOutput(null, msgs);
			case WSDL1_1Package.BINDING_OPERATION__INPUT:
				return basicSetInput(null, msgs);
			case WSDL1_1Package.BINDING_OPERATION__FAULT:
				return ((InternalEList<?>)getFault()).basicRemove(otherEnd, msgs);
			case WSDL1_1Package.BINDING_OPERATION__SOAPOPERATION:
				return basicSetSoapoperation(null, msgs);
			case WSDL1_1Package.BINDING_OPERATION__HTTPOPERATION:
				return basicSetHttpoperation(null, msgs);
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
			case WSDL1_1Package.BINDING_OPERATION__OUTPUT:
				return getOutput();
			case WSDL1_1Package.BINDING_OPERATION__INPUT:
				return getInput();
			case WSDL1_1Package.BINDING_OPERATION__NAME:
				return getName();
			case WSDL1_1Package.BINDING_OPERATION__FAULT:
				return getFault();
			case WSDL1_1Package.BINDING_OPERATION__SOAPOPERATION:
				return getSoapoperation();
			case WSDL1_1Package.BINDING_OPERATION__HTTPOPERATION:
				return getHttpoperation();
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
			case WSDL1_1Package.BINDING_OPERATION__OUTPUT:
				setOutput((BindingOutput)newValue);
				return;
			case WSDL1_1Package.BINDING_OPERATION__INPUT:
				setInput((BindingInput)newValue);
				return;
			case WSDL1_1Package.BINDING_OPERATION__NAME:
				setName((String)newValue);
				return;
			case WSDL1_1Package.BINDING_OPERATION__FAULT:
				getFault().clear();
				getFault().addAll((Collection<? extends BindingFault>)newValue);
				return;
			case WSDL1_1Package.BINDING_OPERATION__SOAPOPERATION:
				setSoapoperation((OperationSOAP)newValue);
				return;
			case WSDL1_1Package.BINDING_OPERATION__HTTPOPERATION:
				setHttpoperation((OperationHTTP)newValue);
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
			case WSDL1_1Package.BINDING_OPERATION__OUTPUT:
				setOutput((BindingOutput)null);
				return;
			case WSDL1_1Package.BINDING_OPERATION__INPUT:
				setInput((BindingInput)null);
				return;
			case WSDL1_1Package.BINDING_OPERATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WSDL1_1Package.BINDING_OPERATION__FAULT:
				getFault().clear();
				return;
			case WSDL1_1Package.BINDING_OPERATION__SOAPOPERATION:
				setSoapoperation((OperationSOAP)null);
				return;
			case WSDL1_1Package.BINDING_OPERATION__HTTPOPERATION:
				setHttpoperation((OperationHTTP)null);
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
			case WSDL1_1Package.BINDING_OPERATION__OUTPUT:
				return output != null;
			case WSDL1_1Package.BINDING_OPERATION__INPUT:
				return input != null;
			case WSDL1_1Package.BINDING_OPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WSDL1_1Package.BINDING_OPERATION__FAULT:
				return fault != null && !fault.isEmpty();
			case WSDL1_1Package.BINDING_OPERATION__SOAPOPERATION:
				return soapoperation != null;
			case WSDL1_1Package.BINDING_OPERATION__HTTPOPERATION:
				return httpoperation != null;
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

} //BindingOperationImpl
