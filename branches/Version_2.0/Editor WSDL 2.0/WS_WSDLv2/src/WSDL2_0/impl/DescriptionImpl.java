/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL2_0.impl;

import WSDL2_0.Binding;
import WSDL2_0.Description;
import WSDL2_0.ElementType;
import WSDL2_0.Import;
import WSDL2_0.Include;
import WSDL2_0.Interface;
import WSDL2_0.Namespace;
import WSDL2_0.Service;
import WSDL2_0.WSDL2_0Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WSDL2_0.impl.DescriptionImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link WSDL2_0.impl.DescriptionImpl#getImport <em>Import</em>}</li>
 *   <li>{@link WSDL2_0.impl.DescriptionImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link WSDL2_0.impl.DescriptionImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link WSDL2_0.impl.DescriptionImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link WSDL2_0.impl.DescriptionImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link WSDL2_0.impl.DescriptionImpl#getService <em>Service</em>}</li>
 *   <li>{@link WSDL2_0.impl.DescriptionImpl#getNamespace <em>Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DescriptionImpl extends ObjectImpl implements Description {
	/**
	 * The default value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected String targetNamespace = TARGET_NAMESPACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImport() <em>Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImport()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> import_;

	/**
	 * The cached value of the '{@link #getInclude() <em>Include</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclude()
	 * @generated
	 * @ordered
	 */
	protected EList<Include> include;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected ElementType types;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> interface_;

	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<Binding> binding;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> service;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected EList<Namespace> namespace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WSDL2_0Package.eINSTANCE.getDescription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetNamespace() {
		return targetNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetNamespace(String newTargetNamespace) {
		String oldTargetNamespace = targetNamespace;
		targetNamespace = newTargetNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.DESCRIPTION__TARGET_NAMESPACE, oldTargetNamespace, targetNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Import> getImport() {
		if (import_ == null) {
			import_ = new EObjectContainmentEList<Import>(Import.class, this, WSDL2_0Package.DESCRIPTION__IMPORT);
		}
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Include> getInclude() {
		if (include == null) {
			include = new EObjectContainmentEList<Include>(Include.class, this, WSDL2_0Package.DESCRIPTION__INCLUDE);
		}
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementType getTypes() {
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypes(ElementType newTypes, NotificationChain msgs) {
		ElementType oldTypes = types;
		types = newTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL2_0Package.DESCRIPTION__TYPES, oldTypes, newTypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypes(ElementType newTypes) {
		if (newTypes != types) {
			NotificationChain msgs = null;
			if (types != null)
				msgs = ((InternalEObject)types).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.DESCRIPTION__TYPES, null, msgs);
			if (newTypes != null)
				msgs = ((InternalEObject)newTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.DESCRIPTION__TYPES, null, msgs);
			msgs = basicSetTypes(newTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.DESCRIPTION__TYPES, newTypes, newTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getInterface() {
		if (interface_ == null) {
			interface_ = new EObjectContainmentEList<Interface>(Interface.class, this, WSDL2_0Package.DESCRIPTION__INTERFACE);
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Binding> getBinding() {
		if (binding == null) {
			binding = new EObjectContainmentEList<Binding>(Binding.class, this, WSDL2_0Package.DESCRIPTION__BINDING);
		}
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getService() {
		if (service == null) {
			service = new EObjectContainmentEList<Service>(Service.class, this, WSDL2_0Package.DESCRIPTION__SERVICE);
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Namespace> getNamespace() {
		if (namespace == null) {
			namespace = new EObjectContainmentWithInverseEList<Namespace>(Namespace.class, this, WSDL2_0Package.DESCRIPTION__NAMESPACE, WSDL2_0Package.NAMESPACE__DESCRIPTION);
		}
		return namespace;
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
			case WSDL2_0Package.DESCRIPTION__NAMESPACE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNamespace()).basicAdd(otherEnd, msgs);
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
			case WSDL2_0Package.DESCRIPTION__IMPORT:
				return ((InternalEList<?>)getImport()).basicRemove(otherEnd, msgs);
			case WSDL2_0Package.DESCRIPTION__INCLUDE:
				return ((InternalEList<?>)getInclude()).basicRemove(otherEnd, msgs);
			case WSDL2_0Package.DESCRIPTION__TYPES:
				return basicSetTypes(null, msgs);
			case WSDL2_0Package.DESCRIPTION__INTERFACE:
				return ((InternalEList<?>)getInterface()).basicRemove(otherEnd, msgs);
			case WSDL2_0Package.DESCRIPTION__BINDING:
				return ((InternalEList<?>)getBinding()).basicRemove(otherEnd, msgs);
			case WSDL2_0Package.DESCRIPTION__SERVICE:
				return ((InternalEList<?>)getService()).basicRemove(otherEnd, msgs);
			case WSDL2_0Package.DESCRIPTION__NAMESPACE:
				return ((InternalEList<?>)getNamespace()).basicRemove(otherEnd, msgs);
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
			case WSDL2_0Package.DESCRIPTION__TARGET_NAMESPACE:
				return getTargetNamespace();
			case WSDL2_0Package.DESCRIPTION__IMPORT:
				return getImport();
			case WSDL2_0Package.DESCRIPTION__INCLUDE:
				return getInclude();
			case WSDL2_0Package.DESCRIPTION__TYPES:
				return getTypes();
			case WSDL2_0Package.DESCRIPTION__INTERFACE:
				return getInterface();
			case WSDL2_0Package.DESCRIPTION__BINDING:
				return getBinding();
			case WSDL2_0Package.DESCRIPTION__SERVICE:
				return getService();
			case WSDL2_0Package.DESCRIPTION__NAMESPACE:
				return getNamespace();
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
			case WSDL2_0Package.DESCRIPTION__TARGET_NAMESPACE:
				setTargetNamespace((String)newValue);
				return;
			case WSDL2_0Package.DESCRIPTION__IMPORT:
				getImport().clear();
				getImport().addAll((Collection<? extends Import>)newValue);
				return;
			case WSDL2_0Package.DESCRIPTION__INCLUDE:
				getInclude().clear();
				getInclude().addAll((Collection<? extends Include>)newValue);
				return;
			case WSDL2_0Package.DESCRIPTION__TYPES:
				setTypes((ElementType)newValue);
				return;
			case WSDL2_0Package.DESCRIPTION__INTERFACE:
				getInterface().clear();
				getInterface().addAll((Collection<? extends Interface>)newValue);
				return;
			case WSDL2_0Package.DESCRIPTION__BINDING:
				getBinding().clear();
				getBinding().addAll((Collection<? extends Binding>)newValue);
				return;
			case WSDL2_0Package.DESCRIPTION__SERVICE:
				getService().clear();
				getService().addAll((Collection<? extends Service>)newValue);
				return;
			case WSDL2_0Package.DESCRIPTION__NAMESPACE:
				getNamespace().clear();
				getNamespace().addAll((Collection<? extends Namespace>)newValue);
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
			case WSDL2_0Package.DESCRIPTION__TARGET_NAMESPACE:
				setTargetNamespace(TARGET_NAMESPACE_EDEFAULT);
				return;
			case WSDL2_0Package.DESCRIPTION__IMPORT:
				getImport().clear();
				return;
			case WSDL2_0Package.DESCRIPTION__INCLUDE:
				getInclude().clear();
				return;
			case WSDL2_0Package.DESCRIPTION__TYPES:
				setTypes((ElementType)null);
				return;
			case WSDL2_0Package.DESCRIPTION__INTERFACE:
				getInterface().clear();
				return;
			case WSDL2_0Package.DESCRIPTION__BINDING:
				getBinding().clear();
				return;
			case WSDL2_0Package.DESCRIPTION__SERVICE:
				getService().clear();
				return;
			case WSDL2_0Package.DESCRIPTION__NAMESPACE:
				getNamespace().clear();
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
			case WSDL2_0Package.DESCRIPTION__TARGET_NAMESPACE:
				return TARGET_NAMESPACE_EDEFAULT == null ? targetNamespace != null : !TARGET_NAMESPACE_EDEFAULT.equals(targetNamespace);
			case WSDL2_0Package.DESCRIPTION__IMPORT:
				return import_ != null && !import_.isEmpty();
			case WSDL2_0Package.DESCRIPTION__INCLUDE:
				return include != null && !include.isEmpty();
			case WSDL2_0Package.DESCRIPTION__TYPES:
				return types != null;
			case WSDL2_0Package.DESCRIPTION__INTERFACE:
				return interface_ != null && !interface_.isEmpty();
			case WSDL2_0Package.DESCRIPTION__BINDING:
				return binding != null && !binding.isEmpty();
			case WSDL2_0Package.DESCRIPTION__SERVICE:
				return service != null && !service.isEmpty();
			case WSDL2_0Package.DESCRIPTION__NAMESPACE:
				return namespace != null && !namespace.isEmpty();
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
		result.append(" (targetNamespace: ");
		result.append(targetNamespace);
		result.append(')');
		return result.toString();
	}

} //DescriptionImpl
