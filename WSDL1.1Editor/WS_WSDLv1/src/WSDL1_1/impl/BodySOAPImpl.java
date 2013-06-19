/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL1_1.impl;

import WSDL1_1.BodySOAP;
import WSDL1_1.WSDL1_1Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body SOAP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WSDL1_1.impl.BodySOAPImpl#getParts <em>Parts</em>}</li>
 *   <li>{@link WSDL1_1.impl.BodySOAPImpl#getUse <em>Use</em>}</li>
 *   <li>{@link WSDL1_1.impl.BodySOAPImpl#getEncodingStyle <em>Encoding Style</em>}</li>
 *   <li>{@link WSDL1_1.impl.BodySOAPImpl#getNamespace <em>Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BodySOAPImpl extends EObjectImpl implements BodySOAP {
	/**
	 * The default value of the '{@link #getParts() <em>Parts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParts()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParts() <em>Parts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParts()
	 * @generated
	 * @ordered
	 */
	protected String parts = PARTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUse() <em>Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected String use = USE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncodingStyle() <em>Encoding Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncodingStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCODING_STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncodingStyle() <em>Encoding Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncodingStyle()
	 * @generated
	 * @ordered
	 */
	protected String encodingStyle = ENCODING_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected String namespace = NAMESPACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BodySOAPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WSDL1_1Package.eINSTANCE.getBodySOAP();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParts() {
		return parts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParts(String newParts) {
		String oldParts = parts;
		parts = newParts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.BODY_SOAP__PARTS, oldParts, parts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUse() {
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUse(String newUse) {
		String oldUse = use;
		use = newUse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.BODY_SOAP__USE, oldUse, use));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEncodingStyle() {
		return encodingStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncodingStyle(String newEncodingStyle) {
		String oldEncodingStyle = encodingStyle;
		encodingStyle = newEncodingStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.BODY_SOAP__ENCODING_STYLE, oldEncodingStyle, encodingStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(String newNamespace) {
		String oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.BODY_SOAP__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WSDL1_1Package.BODY_SOAP__PARTS:
				return getParts();
			case WSDL1_1Package.BODY_SOAP__USE:
				return getUse();
			case WSDL1_1Package.BODY_SOAP__ENCODING_STYLE:
				return getEncodingStyle();
			case WSDL1_1Package.BODY_SOAP__NAMESPACE:
				return getNamespace();
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
			case WSDL1_1Package.BODY_SOAP__PARTS:
				setParts((String)newValue);
				return;
			case WSDL1_1Package.BODY_SOAP__USE:
				setUse((String)newValue);
				return;
			case WSDL1_1Package.BODY_SOAP__ENCODING_STYLE:
				setEncodingStyle((String)newValue);
				return;
			case WSDL1_1Package.BODY_SOAP__NAMESPACE:
				setNamespace((String)newValue);
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
			case WSDL1_1Package.BODY_SOAP__PARTS:
				setParts(PARTS_EDEFAULT);
				return;
			case WSDL1_1Package.BODY_SOAP__USE:
				setUse(USE_EDEFAULT);
				return;
			case WSDL1_1Package.BODY_SOAP__ENCODING_STYLE:
				setEncodingStyle(ENCODING_STYLE_EDEFAULT);
				return;
			case WSDL1_1Package.BODY_SOAP__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
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
			case WSDL1_1Package.BODY_SOAP__PARTS:
				return PARTS_EDEFAULT == null ? parts != null : !PARTS_EDEFAULT.equals(parts);
			case WSDL1_1Package.BODY_SOAP__USE:
				return USE_EDEFAULT == null ? use != null : !USE_EDEFAULT.equals(use);
			case WSDL1_1Package.BODY_SOAP__ENCODING_STYLE:
				return ENCODING_STYLE_EDEFAULT == null ? encodingStyle != null : !ENCODING_STYLE_EDEFAULT.equals(encodingStyle);
			case WSDL1_1Package.BODY_SOAP__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
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
		result.append(" (parts: ");
		result.append(parts);
		result.append(", use: ");
		result.append(use);
		result.append(", encodingStyle: ");
		result.append(encodingStyle);
		result.append(", namespace: ");
		result.append(namespace);
		result.append(')');
		return result.toString();
	}

} //BodySOAPImpl
