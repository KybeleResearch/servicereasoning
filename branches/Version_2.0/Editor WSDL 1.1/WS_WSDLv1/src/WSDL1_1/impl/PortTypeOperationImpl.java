/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL1_1.impl;

import WSDL1_1.PortTypeFault;
import WSDL1_1.PortTypeInput;
import WSDL1_1.PortTypeOperation;
import WSDL1_1.PortTypeOutput;
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
 * An implementation of the model object '<em><b>Port Type Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WSDL1_1.impl.PortTypeOperationImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link WSDL1_1.impl.PortTypeOperationImpl#getInput <em>Input</em>}</li>
 *   <li>{@link WSDL1_1.impl.PortTypeOperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link WSDL1_1.impl.PortTypeOperationImpl#getFault <em>Fault</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortTypeOperationImpl extends ObjectImpl implements PortTypeOperation {
	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected PortTypeOutput output;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected PortTypeInput input;

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
	protected EList<PortTypeFault> fault;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortTypeOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WSDL1_1Package.eINSTANCE.getPortTypeOperation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortTypeOutput getOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutput(PortTypeOutput newOutput, NotificationChain msgs) {
		PortTypeOutput oldOutput = output;
		output = newOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL1_1Package.PORT_TYPE_OPERATION__OUTPUT, oldOutput, newOutput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(PortTypeOutput newOutput) {
		if (newOutput != output) {
			NotificationChain msgs = null;
			if (output != null)
				msgs = ((InternalEObject)output).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.PORT_TYPE_OPERATION__OUTPUT, null, msgs);
			if (newOutput != null)
				msgs = ((InternalEObject)newOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.PORT_TYPE_OPERATION__OUTPUT, null, msgs);
			msgs = basicSetOutput(newOutput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.PORT_TYPE_OPERATION__OUTPUT, newOutput, newOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortTypeInput getInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInput(PortTypeInput newInput, NotificationChain msgs) {
		PortTypeInput oldInput = input;
		input = newInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL1_1Package.PORT_TYPE_OPERATION__INPUT, oldInput, newInput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(PortTypeInput newInput) {
		if (newInput != input) {
			NotificationChain msgs = null;
			if (input != null)
				msgs = ((InternalEObject)input).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.PORT_TYPE_OPERATION__INPUT, null, msgs);
			if (newInput != null)
				msgs = ((InternalEObject)newInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.PORT_TYPE_OPERATION__INPUT, null, msgs);
			msgs = basicSetInput(newInput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.PORT_TYPE_OPERATION__INPUT, newInput, newInput));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.PORT_TYPE_OPERATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortTypeFault> getFault() {
		if (fault == null) {
			fault = new EObjectContainmentEList<PortTypeFault>(PortTypeFault.class, this, WSDL1_1Package.PORT_TYPE_OPERATION__FAULT);
		}
		return fault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WSDL1_1Package.PORT_TYPE_OPERATION__OUTPUT:
				return basicSetOutput(null, msgs);
			case WSDL1_1Package.PORT_TYPE_OPERATION__INPUT:
				return basicSetInput(null, msgs);
			case WSDL1_1Package.PORT_TYPE_OPERATION__FAULT:
				return ((InternalEList<?>)getFault()).basicRemove(otherEnd, msgs);
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
			case WSDL1_1Package.PORT_TYPE_OPERATION__OUTPUT:
				return getOutput();
			case WSDL1_1Package.PORT_TYPE_OPERATION__INPUT:
				return getInput();
			case WSDL1_1Package.PORT_TYPE_OPERATION__NAME:
				return getName();
			case WSDL1_1Package.PORT_TYPE_OPERATION__FAULT:
				return getFault();
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
			case WSDL1_1Package.PORT_TYPE_OPERATION__OUTPUT:
				setOutput((PortTypeOutput)newValue);
				return;
			case WSDL1_1Package.PORT_TYPE_OPERATION__INPUT:
				setInput((PortTypeInput)newValue);
				return;
			case WSDL1_1Package.PORT_TYPE_OPERATION__NAME:
				setName((String)newValue);
				return;
			case WSDL1_1Package.PORT_TYPE_OPERATION__FAULT:
				getFault().clear();
				getFault().addAll((Collection<? extends PortTypeFault>)newValue);
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
			case WSDL1_1Package.PORT_TYPE_OPERATION__OUTPUT:
				setOutput((PortTypeOutput)null);
				return;
			case WSDL1_1Package.PORT_TYPE_OPERATION__INPUT:
				setInput((PortTypeInput)null);
				return;
			case WSDL1_1Package.PORT_TYPE_OPERATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WSDL1_1Package.PORT_TYPE_OPERATION__FAULT:
				getFault().clear();
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
			case WSDL1_1Package.PORT_TYPE_OPERATION__OUTPUT:
				return output != null;
			case WSDL1_1Package.PORT_TYPE_OPERATION__INPUT:
				return input != null;
			case WSDL1_1Package.PORT_TYPE_OPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WSDL1_1Package.PORT_TYPE_OPERATION__FAULT:
				return fault != null && !fault.isEmpty();
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

} //PortTypeOperationImpl
