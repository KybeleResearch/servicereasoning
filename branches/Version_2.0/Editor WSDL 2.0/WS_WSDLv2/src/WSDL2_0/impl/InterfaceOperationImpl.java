/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL2_0.impl;

import WSDL2_0.InterfaceInfault;
import WSDL2_0.InterfaceInput;
import WSDL2_0.InterfaceOperation;
import WSDL2_0.InterfaceOutfault;
import WSDL2_0.InterfaceOutput;
import WSDL2_0.WSDL2_0Package;

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
 * An implementation of the model object '<em><b>Interface Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WSDL2_0.impl.InterfaceOperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link WSDL2_0.impl.InterfaceOperationImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link WSDL2_0.impl.InterfaceOperationImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link WSDL2_0.impl.InterfaceOperationImpl#getWsdlx_safe <em>Wsdlx safe</em>}</li>
 *   <li>{@link WSDL2_0.impl.InterfaceOperationImpl#getWrpc_signature <em>Wrpc signature</em>}</li>
 *   <li>{@link WSDL2_0.impl.InterfaceOperationImpl#getInput <em>Input</em>}</li>
 *   <li>{@link WSDL2_0.impl.InterfaceOperationImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link WSDL2_0.impl.InterfaceOperationImpl#getInfault <em>Infault</em>}</li>
 *   <li>{@link WSDL2_0.impl.InterfaceOperationImpl#getOutfault <em>Outfault</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceOperationImpl extends ObjectImpl implements InterfaceOperation {
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
	 * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected String pattern = PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected String style = STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWsdlx_safe() <em>Wsdlx safe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlx_safe()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean WSDLX_SAFE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWsdlx_safe() <em>Wsdlx safe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsdlx_safe()
	 * @generated
	 * @ordered
	 */
	protected Boolean wsdlx_safe = WSDLX_SAFE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWrpc_signature() <em>Wrpc signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrpc_signature()
	 * @generated
	 * @ordered
	 */
	protected static final String WRPC_SIGNATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWrpc_signature() <em>Wrpc signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrpc_signature()
	 * @generated
	 * @ordered
	 */
	protected String wrpc_signature = WRPC_SIGNATURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceInput> input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceOutput> output;

	/**
	 * The cached value of the '{@link #getInfault() <em>Infault</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfault()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceInfault> infault;

	/**
	 * The cached value of the '{@link #getOutfault() <em>Outfault</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutfault()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceOutfault> outfault;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WSDL2_0Package.eINSTANCE.getInterfaceOperation();
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.INTERFACE_OPERATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(String newPattern) {
		String oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.INTERFACE_OPERATION__PATTERN, oldPattern, pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(String newStyle) {
		String oldStyle = style;
		style = newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.INTERFACE_OPERATION__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getWsdlx_safe() {
		return wsdlx_safe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWsdlx_safe(Boolean newWsdlx_safe) {
		Boolean oldWsdlx_safe = wsdlx_safe;
		wsdlx_safe = newWsdlx_safe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.INTERFACE_OPERATION__WSDLX_SAFE, oldWsdlx_safe, wsdlx_safe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWrpc_signature() {
		return wrpc_signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrpc_signature(String newWrpc_signature) {
		String oldWrpc_signature = wrpc_signature;
		wrpc_signature = newWrpc_signature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.INTERFACE_OPERATION__WRPC_SIGNATURE, oldWrpc_signature, wrpc_signature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceInput> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<InterfaceInput>(InterfaceInput.class, this, WSDL2_0Package.INTERFACE_OPERATION__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceOutput> getOutput() {
		if (output == null) {
			output = new EObjectContainmentEList<InterfaceOutput>(InterfaceOutput.class, this, WSDL2_0Package.INTERFACE_OPERATION__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceInfault> getInfault() {
		if (infault == null) {
			infault = new EObjectContainmentEList<InterfaceInfault>(InterfaceInfault.class, this, WSDL2_0Package.INTERFACE_OPERATION__INFAULT);
		}
		return infault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceOutfault> getOutfault() {
		if (outfault == null) {
			outfault = new EObjectContainmentEList<InterfaceOutfault>(InterfaceOutfault.class, this, WSDL2_0Package.INTERFACE_OPERATION__OUTFAULT);
		}
		return outfault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WSDL2_0Package.INTERFACE_OPERATION__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
			case WSDL2_0Package.INTERFACE_OPERATION__OUTPUT:
				return ((InternalEList<?>)getOutput()).basicRemove(otherEnd, msgs);
			case WSDL2_0Package.INTERFACE_OPERATION__INFAULT:
				return ((InternalEList<?>)getInfault()).basicRemove(otherEnd, msgs);
			case WSDL2_0Package.INTERFACE_OPERATION__OUTFAULT:
				return ((InternalEList<?>)getOutfault()).basicRemove(otherEnd, msgs);
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
			case WSDL2_0Package.INTERFACE_OPERATION__NAME:
				return getName();
			case WSDL2_0Package.INTERFACE_OPERATION__PATTERN:
				return getPattern();
			case WSDL2_0Package.INTERFACE_OPERATION__STYLE:
				return getStyle();
			case WSDL2_0Package.INTERFACE_OPERATION__WSDLX_SAFE:
				return getWsdlx_safe();
			case WSDL2_0Package.INTERFACE_OPERATION__WRPC_SIGNATURE:
				return getWrpc_signature();
			case WSDL2_0Package.INTERFACE_OPERATION__INPUT:
				return getInput();
			case WSDL2_0Package.INTERFACE_OPERATION__OUTPUT:
				return getOutput();
			case WSDL2_0Package.INTERFACE_OPERATION__INFAULT:
				return getInfault();
			case WSDL2_0Package.INTERFACE_OPERATION__OUTFAULT:
				return getOutfault();
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
			case WSDL2_0Package.INTERFACE_OPERATION__NAME:
				setName((String)newValue);
				return;
			case WSDL2_0Package.INTERFACE_OPERATION__PATTERN:
				setPattern((String)newValue);
				return;
			case WSDL2_0Package.INTERFACE_OPERATION__STYLE:
				setStyle((String)newValue);
				return;
			case WSDL2_0Package.INTERFACE_OPERATION__WSDLX_SAFE:
				setWsdlx_safe((Boolean)newValue);
				return;
			case WSDL2_0Package.INTERFACE_OPERATION__WRPC_SIGNATURE:
				setWrpc_signature((String)newValue);
				return;
			case WSDL2_0Package.INTERFACE_OPERATION__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends InterfaceInput>)newValue);
				return;
			case WSDL2_0Package.INTERFACE_OPERATION__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends InterfaceOutput>)newValue);
				return;
			case WSDL2_0Package.INTERFACE_OPERATION__INFAULT:
				getInfault().clear();
				getInfault().addAll((Collection<? extends InterfaceInfault>)newValue);
				return;
			case WSDL2_0Package.INTERFACE_OPERATION__OUTFAULT:
				getOutfault().clear();
				getOutfault().addAll((Collection<? extends InterfaceOutfault>)newValue);
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
			case WSDL2_0Package.INTERFACE_OPERATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WSDL2_0Package.INTERFACE_OPERATION__PATTERN:
				setPattern(PATTERN_EDEFAULT);
				return;
			case WSDL2_0Package.INTERFACE_OPERATION__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case WSDL2_0Package.INTERFACE_OPERATION__WSDLX_SAFE:
				setWsdlx_safe(WSDLX_SAFE_EDEFAULT);
				return;
			case WSDL2_0Package.INTERFACE_OPERATION__WRPC_SIGNATURE:
				setWrpc_signature(WRPC_SIGNATURE_EDEFAULT);
				return;
			case WSDL2_0Package.INTERFACE_OPERATION__INPUT:
				getInput().clear();
				return;
			case WSDL2_0Package.INTERFACE_OPERATION__OUTPUT:
				getOutput().clear();
				return;
			case WSDL2_0Package.INTERFACE_OPERATION__INFAULT:
				getInfault().clear();
				return;
			case WSDL2_0Package.INTERFACE_OPERATION__OUTFAULT:
				getOutfault().clear();
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
			case WSDL2_0Package.INTERFACE_OPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WSDL2_0Package.INTERFACE_OPERATION__PATTERN:
				return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
			case WSDL2_0Package.INTERFACE_OPERATION__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case WSDL2_0Package.INTERFACE_OPERATION__WSDLX_SAFE:
				return WSDLX_SAFE_EDEFAULT == null ? wsdlx_safe != null : !WSDLX_SAFE_EDEFAULT.equals(wsdlx_safe);
			case WSDL2_0Package.INTERFACE_OPERATION__WRPC_SIGNATURE:
				return WRPC_SIGNATURE_EDEFAULT == null ? wrpc_signature != null : !WRPC_SIGNATURE_EDEFAULT.equals(wrpc_signature);
			case WSDL2_0Package.INTERFACE_OPERATION__INPUT:
				return input != null && !input.isEmpty();
			case WSDL2_0Package.INTERFACE_OPERATION__OUTPUT:
				return output != null && !output.isEmpty();
			case WSDL2_0Package.INTERFACE_OPERATION__INFAULT:
				return infault != null && !infault.isEmpty();
			case WSDL2_0Package.INTERFACE_OPERATION__OUTFAULT:
				return outfault != null && !outfault.isEmpty();
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
		result.append(", pattern: ");
		result.append(pattern);
		result.append(", style: ");
		result.append(style);
		result.append(", wsdlx_safe: ");
		result.append(wsdlx_safe);
		result.append(", wrpc_signature: ");
		result.append(wrpc_signature);
		result.append(')');
		return result.toString();
	}

} //InterfaceOperationImpl
