/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL1_1.impl;

import WSDL1_1.Element;
import WSDL1_1.ElementImported;
import WSDL1_1.Part;
import WSDL1_1.TypeRef;
import WSDL1_1.WSDL1_1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WSDL1_1.impl.PartImpl#getName <em>Name</em>}</li>
 *   <li>{@link WSDL1_1.impl.PartImpl#getElement <em>Element</em>}</li>
 *   <li>{@link WSDL1_1.impl.PartImpl#getType <em>Type</em>}</li>
 *   <li>{@link WSDL1_1.impl.PartImpl#getElementImported <em>Element Imported</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartImpl extends EObjectImpl implements Part {
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
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected Element element;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeRef type;

	/**
	 * The cached value of the '{@link #getElementImported() <em>Element Imported</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementImported()
	 * @generated
	 * @ordered
	 */
	protected ElementImported elementImported;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WSDL1_1Package.eINSTANCE.getPart();
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.PART__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WSDL1_1Package.PART__ELEMENT, oldElement, element));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.PART__ELEMENT, oldElement, element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRef getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (TypeRef)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WSDL1_1Package.PART__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRef basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeRef newType) {
		TypeRef oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.PART__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementImported getElementImported() {
		if (elementImported != null && elementImported.eIsProxy()) {
			InternalEObject oldElementImported = (InternalEObject)elementImported;
			elementImported = (ElementImported)eResolveProxy(oldElementImported);
			if (elementImported != oldElementImported) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WSDL1_1Package.PART__ELEMENT_IMPORTED, oldElementImported, elementImported));
			}
		}
		return elementImported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementImported basicGetElementImported() {
		return elementImported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementImported(ElementImported newElementImported, NotificationChain msgs) {
		ElementImported oldElementImported = elementImported;
		elementImported = newElementImported;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL1_1Package.PART__ELEMENT_IMPORTED, oldElementImported, newElementImported);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementImported(ElementImported newElementImported) {
		if (newElementImported != elementImported) {
			NotificationChain msgs = null;
			if (elementImported != null)
				msgs = ((InternalEObject)elementImported).eInverseRemove(this, WSDL1_1Package.ELEMENT_IMPORTED__PART, ElementImported.class, msgs);
			if (newElementImported != null)
				msgs = ((InternalEObject)newElementImported).eInverseAdd(this, WSDL1_1Package.ELEMENT_IMPORTED__PART, ElementImported.class, msgs);
			msgs = basicSetElementImported(newElementImported, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.PART__ELEMENT_IMPORTED, newElementImported, newElementImported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WSDL1_1Package.PART__ELEMENT_IMPORTED:
				if (elementImported != null)
					msgs = ((InternalEObject)elementImported).eInverseRemove(this, WSDL1_1Package.ELEMENT_IMPORTED__PART, ElementImported.class, msgs);
				return basicSetElementImported((ElementImported)otherEnd, msgs);
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
			case WSDL1_1Package.PART__ELEMENT_IMPORTED:
				return basicSetElementImported(null, msgs);
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
			case WSDL1_1Package.PART__NAME:
				return getName();
			case WSDL1_1Package.PART__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
			case WSDL1_1Package.PART__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case WSDL1_1Package.PART__ELEMENT_IMPORTED:
				if (resolve) return getElementImported();
				return basicGetElementImported();
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
			case WSDL1_1Package.PART__NAME:
				setName((String)newValue);
				return;
			case WSDL1_1Package.PART__ELEMENT:
				setElement((Element)newValue);
				return;
			case WSDL1_1Package.PART__TYPE:
				setType((TypeRef)newValue);
				return;
			case WSDL1_1Package.PART__ELEMENT_IMPORTED:
				setElementImported((ElementImported)newValue);
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
			case WSDL1_1Package.PART__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WSDL1_1Package.PART__ELEMENT:
				setElement((Element)null);
				return;
			case WSDL1_1Package.PART__TYPE:
				setType((TypeRef)null);
				return;
			case WSDL1_1Package.PART__ELEMENT_IMPORTED:
				setElementImported((ElementImported)null);
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
			case WSDL1_1Package.PART__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WSDL1_1Package.PART__ELEMENT:
				return element != null;
			case WSDL1_1Package.PART__TYPE:
				return type != null;
			case WSDL1_1Package.PART__ELEMENT_IMPORTED:
				return elementImported != null;
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

} //PartImpl
