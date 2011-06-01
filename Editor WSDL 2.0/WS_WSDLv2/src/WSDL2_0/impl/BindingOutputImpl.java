/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL2_0.impl;

import WSDL2_0.BindingOutput;
import WSDL2_0.WSDL2_0Package;
import WSDL2_0.Whttp_Header;
import WSDL2_0.Wsoap_Header;
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
 * An implementation of the model object '<em><b>Binding Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WSDL2_0.impl.BindingOutputImpl#getMessageLabel <em>Message Label</em>}</li>
 *   <li>{@link WSDL2_0.impl.BindingOutputImpl#getWhttp_contentEncoding <em>Whttp content Encoding</em>}</li>
 *   <li>{@link WSDL2_0.impl.BindingOutputImpl#getWsoap_module <em>Wsoap module</em>}</li>
 *   <li>{@link WSDL2_0.impl.BindingOutputImpl#getWsoap_header <em>Wsoap header</em>}</li>
 *   <li>{@link WSDL2_0.impl.BindingOutputImpl#getWhttp_header <em>Whttp header</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingOutputImpl extends ObjectImpl implements BindingOutput {
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
	 * The default value of the '{@link #getWhttp_contentEncoding() <em>Whttp content Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhttp_contentEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String WHTTP_CONTENT_ENCODING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhttp_contentEncoding() <em>Whttp content Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhttp_contentEncoding()
	 * @generated
	 * @ordered
	 */
	protected String whttp_contentEncoding = WHTTP_CONTENT_ENCODING_EDEFAULT;

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
	 * The cached value of the '{@link #getWsoap_header() <em>Wsoap header</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsoap_header()
	 * @generated
	 * @ordered
	 */
	protected EList<Wsoap_Header> wsoap_header;

	/**
	 * The cached value of the '{@link #getWhttp_header() <em>Whttp header</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhttp_header()
	 * @generated
	 * @ordered
	 */
	protected EList<Whttp_Header> whttp_header;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WSDL2_0Package.eINSTANCE.getBindingOutput();
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.BINDING_OUTPUT__MESSAGE_LABEL, oldMessageLabel, messageLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWhttp_contentEncoding() {
		return whttp_contentEncoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhttp_contentEncoding(String newWhttp_contentEncoding) {
		String oldWhttp_contentEncoding = whttp_contentEncoding;
		whttp_contentEncoding = newWhttp_contentEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.BINDING_OUTPUT__WHTTP_CONTENT_ENCODING, oldWhttp_contentEncoding, whttp_contentEncoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Wsoap_Module> getWsoap_module() {
		if (wsoap_module == null) {
			wsoap_module = new EObjectContainmentEList<Wsoap_Module>(Wsoap_Module.class, this, WSDL2_0Package.BINDING_OUTPUT__WSOAP_MODULE);
		}
		return wsoap_module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Wsoap_Header> getWsoap_header() {
		if (wsoap_header == null) {
			wsoap_header = new EObjectContainmentEList<Wsoap_Header>(Wsoap_Header.class, this, WSDL2_0Package.BINDING_OUTPUT__WSOAP_HEADER);
		}
		return wsoap_header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Whttp_Header> getWhttp_header() {
		if (whttp_header == null) {
			whttp_header = new EObjectContainmentEList<Whttp_Header>(Whttp_Header.class, this, WSDL2_0Package.BINDING_OUTPUT__WHTTP_HEADER);
		}
		return whttp_header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WSDL2_0Package.BINDING_OUTPUT__WSOAP_MODULE:
				return ((InternalEList<?>)getWsoap_module()).basicRemove(otherEnd, msgs);
			case WSDL2_0Package.BINDING_OUTPUT__WSOAP_HEADER:
				return ((InternalEList<?>)getWsoap_header()).basicRemove(otherEnd, msgs);
			case WSDL2_0Package.BINDING_OUTPUT__WHTTP_HEADER:
				return ((InternalEList<?>)getWhttp_header()).basicRemove(otherEnd, msgs);
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
			case WSDL2_0Package.BINDING_OUTPUT__MESSAGE_LABEL:
				return getMessageLabel();
			case WSDL2_0Package.BINDING_OUTPUT__WHTTP_CONTENT_ENCODING:
				return getWhttp_contentEncoding();
			case WSDL2_0Package.BINDING_OUTPUT__WSOAP_MODULE:
				return getWsoap_module();
			case WSDL2_0Package.BINDING_OUTPUT__WSOAP_HEADER:
				return getWsoap_header();
			case WSDL2_0Package.BINDING_OUTPUT__WHTTP_HEADER:
				return getWhttp_header();
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
			case WSDL2_0Package.BINDING_OUTPUT__MESSAGE_LABEL:
				setMessageLabel((String)newValue);
				return;
			case WSDL2_0Package.BINDING_OUTPUT__WHTTP_CONTENT_ENCODING:
				setWhttp_contentEncoding((String)newValue);
				return;
			case WSDL2_0Package.BINDING_OUTPUT__WSOAP_MODULE:
				getWsoap_module().clear();
				getWsoap_module().addAll((Collection<? extends Wsoap_Module>)newValue);
				return;
			case WSDL2_0Package.BINDING_OUTPUT__WSOAP_HEADER:
				getWsoap_header().clear();
				getWsoap_header().addAll((Collection<? extends Wsoap_Header>)newValue);
				return;
			case WSDL2_0Package.BINDING_OUTPUT__WHTTP_HEADER:
				getWhttp_header().clear();
				getWhttp_header().addAll((Collection<? extends Whttp_Header>)newValue);
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
			case WSDL2_0Package.BINDING_OUTPUT__MESSAGE_LABEL:
				setMessageLabel(MESSAGE_LABEL_EDEFAULT);
				return;
			case WSDL2_0Package.BINDING_OUTPUT__WHTTP_CONTENT_ENCODING:
				setWhttp_contentEncoding(WHTTP_CONTENT_ENCODING_EDEFAULT);
				return;
			case WSDL2_0Package.BINDING_OUTPUT__WSOAP_MODULE:
				getWsoap_module().clear();
				return;
			case WSDL2_0Package.BINDING_OUTPUT__WSOAP_HEADER:
				getWsoap_header().clear();
				return;
			case WSDL2_0Package.BINDING_OUTPUT__WHTTP_HEADER:
				getWhttp_header().clear();
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
			case WSDL2_0Package.BINDING_OUTPUT__MESSAGE_LABEL:
				return MESSAGE_LABEL_EDEFAULT == null ? messageLabel != null : !MESSAGE_LABEL_EDEFAULT.equals(messageLabel);
			case WSDL2_0Package.BINDING_OUTPUT__WHTTP_CONTENT_ENCODING:
				return WHTTP_CONTENT_ENCODING_EDEFAULT == null ? whttp_contentEncoding != null : !WHTTP_CONTENT_ENCODING_EDEFAULT.equals(whttp_contentEncoding);
			case WSDL2_0Package.BINDING_OUTPUT__WSOAP_MODULE:
				return wsoap_module != null && !wsoap_module.isEmpty();
			case WSDL2_0Package.BINDING_OUTPUT__WSOAP_HEADER:
				return wsoap_header != null && !wsoap_header.isEmpty();
			case WSDL2_0Package.BINDING_OUTPUT__WHTTP_HEADER:
				return whttp_header != null && !whttp_header.isEmpty();
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
		result.append(", whttp_contentEncoding: ");
		result.append(whttp_contentEncoding);
		result.append(')');
		return result.toString();
	}

} //BindingOutputImpl
