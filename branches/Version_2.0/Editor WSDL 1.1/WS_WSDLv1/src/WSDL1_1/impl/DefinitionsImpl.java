/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL1_1.impl;

import WSDL1_1.Binding;
import WSDL1_1.Definitions;
import WSDL1_1.ElementType;
import WSDL1_1.Import;
import WSDL1_1.Message;
import WSDL1_1.Namespace;
import WSDL1_1.PortType;
import WSDL1_1.Service;
import WSDL1_1.WSDL1_1Package;

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
 * An implementation of the model object '<em><b>Definitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WSDL1_1.impl.DefinitionsImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link WSDL1_1.impl.DefinitionsImpl#getService <em>Service</em>}</li>
 *   <li>{@link WSDL1_1.impl.DefinitionsImpl#getPortType <em>Port Type</em>}</li>
 *   <li>{@link WSDL1_1.impl.DefinitionsImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link WSDL1_1.impl.DefinitionsImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link WSDL1_1.impl.DefinitionsImpl#getName <em>Name</em>}</li>
 *   <li>{@link WSDL1_1.impl.DefinitionsImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link WSDL1_1.impl.DefinitionsImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link WSDL1_1.impl.DefinitionsImpl#getImport <em>Import</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefinitionsImpl extends ObjectImpl implements Definitions {
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
	 * The cached value of the '{@link #getPortType() <em>Port Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortType()
	 * @generated
	 * @ordered
	 */
	protected EList<PortType> portType;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> message;

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
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected EList<Namespace> namespace;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefinitionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WSDL1_1Package.eINSTANCE.getDefinitions();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Binding> getBinding() {
		if (binding == null) {
			binding = new EObjectContainmentEList<Binding>(Binding.class, this, WSDL1_1Package.DEFINITIONS__BINDING);
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
			service = new EObjectContainmentEList<Service>(Service.class, this, WSDL1_1Package.DEFINITIONS__SERVICE);
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortType> getPortType() {
		if (portType == null) {
			portType = new EObjectContainmentEList<PortType>(PortType.class, this, WSDL1_1Package.DEFINITIONS__PORT_TYPE);
		}
		return portType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getMessage() {
		if (message == null) {
			message = new EObjectContainmentEList<Message>(Message.class, this, WSDL1_1Package.DEFINITIONS__MESSAGE);
		}
		return message;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL1_1Package.DEFINITIONS__TYPES, oldTypes, newTypes);
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
				msgs = ((InternalEObject)types).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.DEFINITIONS__TYPES, null, msgs);
			if (newTypes != null)
				msgs = ((InternalEObject)newTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.DEFINITIONS__TYPES, null, msgs);
			msgs = basicSetTypes(newTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.DEFINITIONS__TYPES, newTypes, newTypes));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.DEFINITIONS__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.DEFINITIONS__TARGET_NAMESPACE, oldTargetNamespace, targetNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Namespace> getNamespace() {
		if (namespace == null) {
			namespace = new EObjectContainmentWithInverseEList<Namespace>(Namespace.class, this, WSDL1_1Package.DEFINITIONS__NAMESPACE, WSDL1_1Package.NAMESPACE__DEFINITION);
		}
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Import> getImport() {
		if (import_ == null) {
			import_ = new EObjectContainmentEList<Import>(Import.class, this, WSDL1_1Package.DEFINITIONS__IMPORT);
		}
		return import_;
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
			case WSDL1_1Package.DEFINITIONS__NAMESPACE:
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
			case WSDL1_1Package.DEFINITIONS__BINDING:
				return ((InternalEList<?>)getBinding()).basicRemove(otherEnd, msgs);
			case WSDL1_1Package.DEFINITIONS__SERVICE:
				return ((InternalEList<?>)getService()).basicRemove(otherEnd, msgs);
			case WSDL1_1Package.DEFINITIONS__PORT_TYPE:
				return ((InternalEList<?>)getPortType()).basicRemove(otherEnd, msgs);
			case WSDL1_1Package.DEFINITIONS__MESSAGE:
				return ((InternalEList<?>)getMessage()).basicRemove(otherEnd, msgs);
			case WSDL1_1Package.DEFINITIONS__TYPES:
				return basicSetTypes(null, msgs);
			case WSDL1_1Package.DEFINITIONS__NAMESPACE:
				return ((InternalEList<?>)getNamespace()).basicRemove(otherEnd, msgs);
			case WSDL1_1Package.DEFINITIONS__IMPORT:
				return ((InternalEList<?>)getImport()).basicRemove(otherEnd, msgs);
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
			case WSDL1_1Package.DEFINITIONS__BINDING:
				return getBinding();
			case WSDL1_1Package.DEFINITIONS__SERVICE:
				return getService();
			case WSDL1_1Package.DEFINITIONS__PORT_TYPE:
				return getPortType();
			case WSDL1_1Package.DEFINITIONS__MESSAGE:
				return getMessage();
			case WSDL1_1Package.DEFINITIONS__TYPES:
				return getTypes();
			case WSDL1_1Package.DEFINITIONS__NAME:
				return getName();
			case WSDL1_1Package.DEFINITIONS__TARGET_NAMESPACE:
				return getTargetNamespace();
			case WSDL1_1Package.DEFINITIONS__NAMESPACE:
				return getNamespace();
			case WSDL1_1Package.DEFINITIONS__IMPORT:
				return getImport();
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
			case WSDL1_1Package.DEFINITIONS__BINDING:
				getBinding().clear();
				getBinding().addAll((Collection<? extends Binding>)newValue);
				return;
			case WSDL1_1Package.DEFINITIONS__SERVICE:
				getService().clear();
				getService().addAll((Collection<? extends Service>)newValue);
				return;
			case WSDL1_1Package.DEFINITIONS__PORT_TYPE:
				getPortType().clear();
				getPortType().addAll((Collection<? extends PortType>)newValue);
				return;
			case WSDL1_1Package.DEFINITIONS__MESSAGE:
				getMessage().clear();
				getMessage().addAll((Collection<? extends Message>)newValue);
				return;
			case WSDL1_1Package.DEFINITIONS__TYPES:
				setTypes((ElementType)newValue);
				return;
			case WSDL1_1Package.DEFINITIONS__NAME:
				setName((String)newValue);
				return;
			case WSDL1_1Package.DEFINITIONS__TARGET_NAMESPACE:
				setTargetNamespace((String)newValue);
				return;
			case WSDL1_1Package.DEFINITIONS__NAMESPACE:
				getNamespace().clear();
				getNamespace().addAll((Collection<? extends Namespace>)newValue);
				return;
			case WSDL1_1Package.DEFINITIONS__IMPORT:
				getImport().clear();
				getImport().addAll((Collection<? extends Import>)newValue);
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
			case WSDL1_1Package.DEFINITIONS__BINDING:
				getBinding().clear();
				return;
			case WSDL1_1Package.DEFINITIONS__SERVICE:
				getService().clear();
				return;
			case WSDL1_1Package.DEFINITIONS__PORT_TYPE:
				getPortType().clear();
				return;
			case WSDL1_1Package.DEFINITIONS__MESSAGE:
				getMessage().clear();
				return;
			case WSDL1_1Package.DEFINITIONS__TYPES:
				setTypes((ElementType)null);
				return;
			case WSDL1_1Package.DEFINITIONS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WSDL1_1Package.DEFINITIONS__TARGET_NAMESPACE:
				setTargetNamespace(TARGET_NAMESPACE_EDEFAULT);
				return;
			case WSDL1_1Package.DEFINITIONS__NAMESPACE:
				getNamespace().clear();
				return;
			case WSDL1_1Package.DEFINITIONS__IMPORT:
				getImport().clear();
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
			case WSDL1_1Package.DEFINITIONS__BINDING:
				return binding != null && !binding.isEmpty();
			case WSDL1_1Package.DEFINITIONS__SERVICE:
				return service != null && !service.isEmpty();
			case WSDL1_1Package.DEFINITIONS__PORT_TYPE:
				return portType != null && !portType.isEmpty();
			case WSDL1_1Package.DEFINITIONS__MESSAGE:
				return message != null && !message.isEmpty();
			case WSDL1_1Package.DEFINITIONS__TYPES:
				return types != null;
			case WSDL1_1Package.DEFINITIONS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WSDL1_1Package.DEFINITIONS__TARGET_NAMESPACE:
				return TARGET_NAMESPACE_EDEFAULT == null ? targetNamespace != null : !TARGET_NAMESPACE_EDEFAULT.equals(targetNamespace);
			case WSDL1_1Package.DEFINITIONS__NAMESPACE:
				return namespace != null && !namespace.isEmpty();
			case WSDL1_1Package.DEFINITIONS__IMPORT:
				return import_ != null && !import_.isEmpty();
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
		result.append(", targetNamespace: ");
		result.append(targetNamespace);
		result.append(')');
		return result.toString();
	}

} //DefinitionsImpl
