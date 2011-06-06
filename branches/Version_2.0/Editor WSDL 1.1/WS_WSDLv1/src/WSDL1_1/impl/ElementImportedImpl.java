/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL1_1.impl;

import WSDL1_1.ElementImported;
import WSDL1_1.Part;
import WSDL1_1.WSDL1_1Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Imported</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WSDL1_1.impl.ElementImportedImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link WSDL1_1.impl.ElementImportedImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link WSDL1_1.impl.ElementImportedImpl#getOrig <em>Orig</em>}</li>
 *   <li>{@link WSDL1_1.impl.ElementImportedImpl#getPart <em>Part</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementImportedImpl extends ElementImpl implements ElementImported {
	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

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
	 * The default value of the '{@link #getOrig() <em>Orig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrig()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrig() <em>Orig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrig()
	 * @generated
	 * @ordered
	 */
	protected String orig = ORIG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPart() <em>Part</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
	protected EList<Part> part;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImportedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WSDL1_1Package.eINSTANCE.getElementImported();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.ELEMENT_IMPORTED__URL, oldUrl, url));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.ELEMENT_IMPORTED__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrig() {
		return orig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrig(String newOrig) {
		String oldOrig = orig;
		orig = newOrig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.ELEMENT_IMPORTED__ORIG, oldOrig, orig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Part> getPart() {
		if (part == null) {
			part = new EObjectWithInverseResolvingEList<Part>(Part.class, this, WSDL1_1Package.ELEMENT_IMPORTED__PART, WSDL1_1Package.PART__ELEMENT_IMPORTED);
		}
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WSDL1_1Package.ELEMENT_IMPORTED__PART:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPart()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WSDL1_1Package.ELEMENT_IMPORTED__PART:
				return ((InternalEList<?>)getPart()).basicRemove(otherEnd, msgs);
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
			case WSDL1_1Package.ELEMENT_IMPORTED__URL:
				return getUrl();
			case WSDL1_1Package.ELEMENT_IMPORTED__NAMESPACE:
				return getNamespace();
			case WSDL1_1Package.ELEMENT_IMPORTED__ORIG:
				return getOrig();
			case WSDL1_1Package.ELEMENT_IMPORTED__PART:
				return getPart();
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
			case WSDL1_1Package.ELEMENT_IMPORTED__URL:
				setUrl((String)newValue);
				return;
			case WSDL1_1Package.ELEMENT_IMPORTED__NAMESPACE:
				setNamespace((String)newValue);
				return;
			case WSDL1_1Package.ELEMENT_IMPORTED__ORIG:
				setOrig((String)newValue);
				return;
			case WSDL1_1Package.ELEMENT_IMPORTED__PART:
				getPart().clear();
				getPart().addAll((Collection<? extends Part>)newValue);
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
			case WSDL1_1Package.ELEMENT_IMPORTED__URL:
				setUrl(URL_EDEFAULT);
				return;
			case WSDL1_1Package.ELEMENT_IMPORTED__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case WSDL1_1Package.ELEMENT_IMPORTED__ORIG:
				setOrig(ORIG_EDEFAULT);
				return;
			case WSDL1_1Package.ELEMENT_IMPORTED__PART:
				getPart().clear();
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
			case WSDL1_1Package.ELEMENT_IMPORTED__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case WSDL1_1Package.ELEMENT_IMPORTED__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
			case WSDL1_1Package.ELEMENT_IMPORTED__ORIG:
				return ORIG_EDEFAULT == null ? orig != null : !ORIG_EDEFAULT.equals(orig);
			case WSDL1_1Package.ELEMENT_IMPORTED__PART:
				return part != null && !part.isEmpty();
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
		result.append(" (url: ");
		result.append(url);
		result.append(", namespace: ");
		result.append(namespace);
		result.append(", orig: ");
		result.append(orig);
		result.append(')');
		return result.toString();
	}

} //ElementImportedImpl
