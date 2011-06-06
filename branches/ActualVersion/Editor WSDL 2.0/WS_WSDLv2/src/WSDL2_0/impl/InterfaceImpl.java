/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL2_0.impl;

import WSDL2_0.Interface;
import WSDL2_0.InterfaceFault;
import WSDL2_0.InterfaceOperation;
import WSDL2_0.WSDL2_0Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WSDL2_0.impl.InterfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link WSDL2_0.impl.InterfaceImpl#getStyleDefault <em>Style Default</em>}</li>
 *   <li>{@link WSDL2_0.impl.InterfaceImpl#getFault <em>Fault</em>}</li>
 *   <li>{@link WSDL2_0.impl.InterfaceImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link WSDL2_0.impl.InterfaceImpl#getExtendsDef <em>Extends Def</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceImpl extends ObjectImpl implements Interface {
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
	 * The default value of the '{@link #getStyleDefault() <em>Style Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyleDefault() <em>Style Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleDefault()
	 * @generated
	 * @ordered
	 */
	protected String styleDefault = STYLE_DEFAULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFault() <em>Fault</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceFault> fault;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceOperation> operation;

	/**
	 * The cached value of the '{@link #getExtendsDef() <em>Extends Def</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendsDef()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> extendsDef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WSDL2_0Package.eINSTANCE.getInterface();
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.INTERFACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleDefault() {
		return styleDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleDefault(String newStyleDefault) {
		String oldStyleDefault = styleDefault;
		styleDefault = newStyleDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.INTERFACE__STYLE_DEFAULT, oldStyleDefault, styleDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceFault> getFault() {
		if (fault == null) {
			fault = new EObjectContainmentEList<InterfaceFault>(InterfaceFault.class, this, WSDL2_0Package.INTERFACE__FAULT);
		}
		return fault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceOperation> getOperation() {
		if (operation == null) {
			operation = new EObjectContainmentEList<InterfaceOperation>(InterfaceOperation.class, this, WSDL2_0Package.INTERFACE__OPERATION);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getExtendsDef() {
		if (extendsDef == null) {
			extendsDef = new EObjectResolvingEList<Interface>(Interface.class, this, WSDL2_0Package.INTERFACE__EXTENDS_DEF);
		}
		return extendsDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WSDL2_0Package.INTERFACE__FAULT:
				return ((InternalEList<?>)getFault()).basicRemove(otherEnd, msgs);
			case WSDL2_0Package.INTERFACE__OPERATION:
				return ((InternalEList<?>)getOperation()).basicRemove(otherEnd, msgs);
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
			case WSDL2_0Package.INTERFACE__NAME:
				return getName();
			case WSDL2_0Package.INTERFACE__STYLE_DEFAULT:
				return getStyleDefault();
			case WSDL2_0Package.INTERFACE__FAULT:
				return getFault();
			case WSDL2_0Package.INTERFACE__OPERATION:
				return getOperation();
			case WSDL2_0Package.INTERFACE__EXTENDS_DEF:
				return getExtendsDef();
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
			case WSDL2_0Package.INTERFACE__NAME:
				setName((String)newValue);
				return;
			case WSDL2_0Package.INTERFACE__STYLE_DEFAULT:
				setStyleDefault((String)newValue);
				return;
			case WSDL2_0Package.INTERFACE__FAULT:
				getFault().clear();
				getFault().addAll((Collection<? extends InterfaceFault>)newValue);
				return;
			case WSDL2_0Package.INTERFACE__OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection<? extends InterfaceOperation>)newValue);
				return;
			case WSDL2_0Package.INTERFACE__EXTENDS_DEF:
				getExtendsDef().clear();
				getExtendsDef().addAll((Collection<? extends Interface>)newValue);
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
			case WSDL2_0Package.INTERFACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WSDL2_0Package.INTERFACE__STYLE_DEFAULT:
				setStyleDefault(STYLE_DEFAULT_EDEFAULT);
				return;
			case WSDL2_0Package.INTERFACE__FAULT:
				getFault().clear();
				return;
			case WSDL2_0Package.INTERFACE__OPERATION:
				getOperation().clear();
				return;
			case WSDL2_0Package.INTERFACE__EXTENDS_DEF:
				getExtendsDef().clear();
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
			case WSDL2_0Package.INTERFACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WSDL2_0Package.INTERFACE__STYLE_DEFAULT:
				return STYLE_DEFAULT_EDEFAULT == null ? styleDefault != null : !STYLE_DEFAULT_EDEFAULT.equals(styleDefault);
			case WSDL2_0Package.INTERFACE__FAULT:
				return fault != null && !fault.isEmpty();
			case WSDL2_0Package.INTERFACE__OPERATION:
				return operation != null && !operation.isEmpty();
			case WSDL2_0Package.INTERFACE__EXTENDS_DEF:
				return extendsDef != null && !extendsDef.isEmpty();
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
		result.append(", styleDefault: ");
		result.append(styleDefault);
		result.append(')');
		return result.toString();
	}

} //InterfaceImpl
