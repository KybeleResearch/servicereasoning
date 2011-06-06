/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL2_0.impl;

import WSDL2_0.Documentation;
import WSDL2_0.Element;
import WSDL2_0.WSDL2_0Package;
import WSDL2_0.Wsoap_Header;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wsoap Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WSDL2_0.impl.Wsoap_HeaderImpl#getMustUnderstand <em>Must Understand</em>}</li>
 *   <li>{@link WSDL2_0.impl.Wsoap_HeaderImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link WSDL2_0.impl.Wsoap_HeaderImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link WSDL2_0.impl.Wsoap_HeaderImpl#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Wsoap_HeaderImpl extends EObjectImpl implements Wsoap_Header {
	/**
	 * The default value of the '{@link #getMustUnderstand() <em>Must Understand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMustUnderstand()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MUST_UNDERSTAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMustUnderstand() <em>Must Understand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMustUnderstand()
	 * @generated
	 * @ordered
	 */
	protected Boolean mustUnderstand = MUST_UNDERSTAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REQUIRED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected Boolean required = REQUIRED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected EList<Documentation> documentation;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected Element element;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Wsoap_HeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WSDL2_0Package.eINSTANCE.getWsoap_Header();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getMustUnderstand() {
		return mustUnderstand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustUnderstand(Boolean newMustUnderstand) {
		Boolean oldMustUnderstand = mustUnderstand;
		mustUnderstand = newMustUnderstand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.WSOAP_HEADER__MUST_UNDERSTAND, oldMustUnderstand, mustUnderstand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(Boolean newRequired) {
		Boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.WSOAP_HEADER__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Documentation> getDocumentation() {
		if (documentation == null) {
			documentation = new EObjectContainmentEList<Documentation>(Documentation.class, this, WSDL2_0Package.WSOAP_HEADER__DOCUMENTATION);
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getElement() {
		if (element != null && element.eIsProxy()) {
			InternalEObject oldElement = (InternalEObject)element;
			element = (Element)eResolveProxy(oldElement);
			if (element != oldElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WSDL2_0Package.WSOAP_HEADER__ELEMENT, oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(Element newElement) {
		Element oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.WSOAP_HEADER__ELEMENT, oldElement, element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WSDL2_0Package.WSOAP_HEADER__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
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
			case WSDL2_0Package.WSOAP_HEADER__MUST_UNDERSTAND:
				return getMustUnderstand();
			case WSDL2_0Package.WSOAP_HEADER__REQUIRED:
				return getRequired();
			case WSDL2_0Package.WSOAP_HEADER__DOCUMENTATION:
				return getDocumentation();
			case WSDL2_0Package.WSOAP_HEADER__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
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
			case WSDL2_0Package.WSOAP_HEADER__MUST_UNDERSTAND:
				setMustUnderstand((Boolean)newValue);
				return;
			case WSDL2_0Package.WSOAP_HEADER__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case WSDL2_0Package.WSOAP_HEADER__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends Documentation>)newValue);
				return;
			case WSDL2_0Package.WSOAP_HEADER__ELEMENT:
				setElement((Element)newValue);
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
			case WSDL2_0Package.WSOAP_HEADER__MUST_UNDERSTAND:
				setMustUnderstand(MUST_UNDERSTAND_EDEFAULT);
				return;
			case WSDL2_0Package.WSOAP_HEADER__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case WSDL2_0Package.WSOAP_HEADER__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case WSDL2_0Package.WSOAP_HEADER__ELEMENT:
				setElement((Element)null);
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
			case WSDL2_0Package.WSOAP_HEADER__MUST_UNDERSTAND:
				return MUST_UNDERSTAND_EDEFAULT == null ? mustUnderstand != null : !MUST_UNDERSTAND_EDEFAULT.equals(mustUnderstand);
			case WSDL2_0Package.WSOAP_HEADER__REQUIRED:
				return REQUIRED_EDEFAULT == null ? required != null : !REQUIRED_EDEFAULT.equals(required);
			case WSDL2_0Package.WSOAP_HEADER__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
			case WSDL2_0Package.WSOAP_HEADER__ELEMENT:
				return element != null;
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
		result.append(" (mustUnderstand: ");
		result.append(mustUnderstand);
		result.append(", required: ");
		result.append(required);
		result.append(')');
		return result.toString();
	}

} //Wsoap_HeaderImpl
