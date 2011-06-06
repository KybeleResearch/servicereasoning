/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL2_0.impl;

import WSDL2_0.Documentation;
import WSDL2_0.ElementImported;
import WSDL2_0.WSDL2_0Package;

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
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WSDL2_0.impl.ObjectImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link WSDL2_0.impl.ObjectImpl#getElementImported <em>Element Imported</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectImpl extends EObjectImpl implements WSDL2_0.Object {
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
	protected ObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WSDL2_0Package.eINSTANCE.getObject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Documentation> getDocumentation() {
		if (documentation == null) {
			documentation = new EObjectContainmentEList<Documentation>(Documentation.class, this, WSDL2_0Package.OBJECT__DOCUMENTATION);
		}
		return documentation;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WSDL2_0Package.OBJECT__ELEMENT_IMPORTED, oldElementImported, elementImported));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL2_0Package.OBJECT__ELEMENT_IMPORTED, oldElementImported, newElementImported);
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
				msgs = ((InternalEObject)elementImported).eInverseRemove(this, WSDL2_0Package.ELEMENT_IMPORTED__MESSAGE, ElementImported.class, msgs);
			if (newElementImported != null)
				msgs = ((InternalEObject)newElementImported).eInverseAdd(this, WSDL2_0Package.ELEMENT_IMPORTED__MESSAGE, ElementImported.class, msgs);
			msgs = basicSetElementImported(newElementImported, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.OBJECT__ELEMENT_IMPORTED, newElementImported, newElementImported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WSDL2_0Package.OBJECT__ELEMENT_IMPORTED:
				if (elementImported != null)
					msgs = ((InternalEObject)elementImported).eInverseRemove(this, WSDL2_0Package.ELEMENT_IMPORTED__MESSAGE, ElementImported.class, msgs);
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
			case WSDL2_0Package.OBJECT__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case WSDL2_0Package.OBJECT__ELEMENT_IMPORTED:
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
			case WSDL2_0Package.OBJECT__DOCUMENTATION:
				return getDocumentation();
			case WSDL2_0Package.OBJECT__ELEMENT_IMPORTED:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WSDL2_0Package.OBJECT__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends Documentation>)newValue);
				return;
			case WSDL2_0Package.OBJECT__ELEMENT_IMPORTED:
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
			case WSDL2_0Package.OBJECT__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case WSDL2_0Package.OBJECT__ELEMENT_IMPORTED:
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
			case WSDL2_0Package.OBJECT__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
			case WSDL2_0Package.OBJECT__ELEMENT_IMPORTED:
				return elementImported != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectImpl
