/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL2_0.impl;

import WSDL2_0.BindingInfault;
import WSDL2_0.InterfaceFault;
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
 * An implementation of the model object '<em><b>Binding Infault</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WSDL2_0.impl.BindingInfaultImpl#getMessageLabel <em>Message Label</em>}</li>
 *   <li>{@link WSDL2_0.impl.BindingInfaultImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link WSDL2_0.impl.BindingInfaultImpl#getWsoap_module <em>Wsoap module</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingInfaultImpl extends ObjectImpl implements BindingInfault {
	/**
	 * The default value of the '{@link #getMessageLabel() <em>Message Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageLabel() <em>Message Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageLabel()
	 * @generated
	 * @ordered
	 */
	protected String messageLabel = MESSAGE_LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected InterfaceFault ref;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingInfaultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WSDL2_0Package.eINSTANCE.getBindingInfault();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessageLabel() {
		return messageLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageLabel(String newMessageLabel) {
		String oldMessageLabel = messageLabel;
		messageLabel = newMessageLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.BINDING_INFAULT__MESSAGE_LABEL, oldMessageLabel, messageLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceFault getRef() {
		if (ref != null && ref.eIsProxy()) {
			InternalEObject oldRef = (InternalEObject)ref;
			ref = (InterfaceFault)eResolveProxy(oldRef);
			if (ref != oldRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WSDL2_0Package.BINDING_INFAULT__REF, oldRef, ref));
			}
		}
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceFault basicGetRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(InterfaceFault newRef) {
		InterfaceFault oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.BINDING_INFAULT__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Wsoap_Module> getWsoap_module() {
		if (wsoap_module == null) {
			wsoap_module = new EObjectContainmentEList<Wsoap_Module>(Wsoap_Module.class, this, WSDL2_0Package.BINDING_INFAULT__WSOAP_MODULE);
		}
		return wsoap_module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WSDL2_0Package.BINDING_INFAULT__WSOAP_MODULE:
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
			case WSDL2_0Package.BINDING_INFAULT__MESSAGE_LABEL:
				return getMessageLabel();
			case WSDL2_0Package.BINDING_INFAULT__REF:
				if (resolve) return getRef();
				return basicGetRef();
			case WSDL2_0Package.BINDING_INFAULT__WSOAP_MODULE:
				return getWsoap_module();
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
			case WSDL2_0Package.BINDING_INFAULT__MESSAGE_LABEL:
				setMessageLabel((String)newValue);
				return;
			case WSDL2_0Package.BINDING_INFAULT__REF:
				setRef((InterfaceFault)newValue);
				return;
			case WSDL2_0Package.BINDING_INFAULT__WSOAP_MODULE:
				getWsoap_module().clear();
				getWsoap_module().addAll((Collection<? extends Wsoap_Module>)newValue);
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
			case WSDL2_0Package.BINDING_INFAULT__MESSAGE_LABEL:
				setMessageLabel(MESSAGE_LABEL_EDEFAULT);
				return;
			case WSDL2_0Package.BINDING_INFAULT__REF:
				setRef((InterfaceFault)null);
				return;
			case WSDL2_0Package.BINDING_INFAULT__WSOAP_MODULE:
				getWsoap_module().clear();
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
			case WSDL2_0Package.BINDING_INFAULT__MESSAGE_LABEL:
				return MESSAGE_LABEL_EDEFAULT == null ? messageLabel != null : !MESSAGE_LABEL_EDEFAULT.equals(messageLabel);
			case WSDL2_0Package.BINDING_INFAULT__REF:
				return ref != null;
			case WSDL2_0Package.BINDING_INFAULT__WSOAP_MODULE:
				return wsoap_module != null && !wsoap_module.isEmpty();
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
		result.append(" (messageLabel: ");
		result.append(messageLabel);
		result.append(')');
		return result.toString();
	}

} //BindingInfaultImpl
