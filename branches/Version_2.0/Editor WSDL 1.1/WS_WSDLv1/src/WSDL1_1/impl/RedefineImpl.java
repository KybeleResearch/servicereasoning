/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL1_1.impl;

import WSDL1_1.Annotation;
import WSDL1_1.AttributeGroup;
import WSDL1_1.ComplexType;
import WSDL1_1.Group;
import WSDL1_1.Redefine;
import WSDL1_1.SimpleType;
import WSDL1_1.WSDL1_1Package;

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
 * An implementation of the model object '<em><b>Redefine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WSDL1_1.impl.RedefineImpl#getSchemaLocation <em>Schema Location</em>}</li>
 *   <li>{@link WSDL1_1.impl.RedefineImpl#getId <em>Id</em>}</li>
 *   <li>{@link WSDL1_1.impl.RedefineImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link WSDL1_1.impl.RedefineImpl#getSimpleType <em>Simple Type</em>}</li>
 *   <li>{@link WSDL1_1.impl.RedefineImpl#getComplexType <em>Complex Type</em>}</li>
 *   <li>{@link WSDL1_1.impl.RedefineImpl#getAttributeGroup <em>Attribute Group</em>}</li>
 *   <li>{@link WSDL1_1.impl.RedefineImpl#getGroup <em>Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RedefineImpl extends EObjectImpl implements Redefine {
	/**
	 * The default value of the '{@link #getSchemaLocation() <em>Schema Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchemaLocation() <em>Schema Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected String schemaLocation = SCHEMA_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotation;

	/**
	 * The cached value of the '{@link #getSimpleType() <em>Simple Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleType()
	 * @generated
	 * @ordered
	 */
	protected EList<SimpleType> simpleType;

	/**
	 * The cached value of the '{@link #getComplexType() <em>Complex Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexType()
	 * @generated
	 * @ordered
	 */
	protected EList<ComplexType> complexType;

	/**
	 * The cached value of the '{@link #getAttributeGroup() <em>Attribute Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeGroup> attributeGroup;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RedefineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WSDL1_1Package.eINSTANCE.getRedefine();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchemaLocation() {
		return schemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchemaLocation(String newSchemaLocation) {
		String oldSchemaLocation = schemaLocation;
		schemaLocation = newSchemaLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.REDEFINE__SCHEMA_LOCATION, oldSchemaLocation, schemaLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.REDEFINE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotation() {
		if (annotation == null) {
			annotation = new EObjectContainmentEList<Annotation>(Annotation.class, this, WSDL1_1Package.REDEFINE__ANNOTATION);
		}
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimpleType> getSimpleType() {
		if (simpleType == null) {
			simpleType = new EObjectContainmentEList<SimpleType>(SimpleType.class, this, WSDL1_1Package.REDEFINE__SIMPLE_TYPE);
		}
		return simpleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComplexType> getComplexType() {
		if (complexType == null) {
			complexType = new EObjectContainmentEList<ComplexType>(ComplexType.class, this, WSDL1_1Package.REDEFINE__COMPLEX_TYPE);
		}
		return complexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeGroup> getAttributeGroup() {
		if (attributeGroup == null) {
			attributeGroup = new EObjectContainmentEList<AttributeGroup>(AttributeGroup.class, this, WSDL1_1Package.REDEFINE__ATTRIBUTE_GROUP);
		}
		return attributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getGroup() {
		if (group == null) {
			group = new EObjectContainmentEList<Group>(Group.class, this, WSDL1_1Package.REDEFINE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WSDL1_1Package.REDEFINE__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case WSDL1_1Package.REDEFINE__SIMPLE_TYPE:
				return ((InternalEList<?>)getSimpleType()).basicRemove(otherEnd, msgs);
			case WSDL1_1Package.REDEFINE__COMPLEX_TYPE:
				return ((InternalEList<?>)getComplexType()).basicRemove(otherEnd, msgs);
			case WSDL1_1Package.REDEFINE__ATTRIBUTE_GROUP:
				return ((InternalEList<?>)getAttributeGroup()).basicRemove(otherEnd, msgs);
			case WSDL1_1Package.REDEFINE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
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
			case WSDL1_1Package.REDEFINE__SCHEMA_LOCATION:
				return getSchemaLocation();
			case WSDL1_1Package.REDEFINE__ID:
				return getId();
			case WSDL1_1Package.REDEFINE__ANNOTATION:
				return getAnnotation();
			case WSDL1_1Package.REDEFINE__SIMPLE_TYPE:
				return getSimpleType();
			case WSDL1_1Package.REDEFINE__COMPLEX_TYPE:
				return getComplexType();
			case WSDL1_1Package.REDEFINE__ATTRIBUTE_GROUP:
				return getAttributeGroup();
			case WSDL1_1Package.REDEFINE__GROUP:
				return getGroup();
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
			case WSDL1_1Package.REDEFINE__SCHEMA_LOCATION:
				setSchemaLocation((String)newValue);
				return;
			case WSDL1_1Package.REDEFINE__ID:
				setId((String)newValue);
				return;
			case WSDL1_1Package.REDEFINE__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case WSDL1_1Package.REDEFINE__SIMPLE_TYPE:
				getSimpleType().clear();
				getSimpleType().addAll((Collection<? extends SimpleType>)newValue);
				return;
			case WSDL1_1Package.REDEFINE__COMPLEX_TYPE:
				getComplexType().clear();
				getComplexType().addAll((Collection<? extends ComplexType>)newValue);
				return;
			case WSDL1_1Package.REDEFINE__ATTRIBUTE_GROUP:
				getAttributeGroup().clear();
				getAttributeGroup().addAll((Collection<? extends AttributeGroup>)newValue);
				return;
			case WSDL1_1Package.REDEFINE__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection<? extends Group>)newValue);
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
			case WSDL1_1Package.REDEFINE__SCHEMA_LOCATION:
				setSchemaLocation(SCHEMA_LOCATION_EDEFAULT);
				return;
			case WSDL1_1Package.REDEFINE__ID:
				setId(ID_EDEFAULT);
				return;
			case WSDL1_1Package.REDEFINE__ANNOTATION:
				getAnnotation().clear();
				return;
			case WSDL1_1Package.REDEFINE__SIMPLE_TYPE:
				getSimpleType().clear();
				return;
			case WSDL1_1Package.REDEFINE__COMPLEX_TYPE:
				getComplexType().clear();
				return;
			case WSDL1_1Package.REDEFINE__ATTRIBUTE_GROUP:
				getAttributeGroup().clear();
				return;
			case WSDL1_1Package.REDEFINE__GROUP:
				getGroup().clear();
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
			case WSDL1_1Package.REDEFINE__SCHEMA_LOCATION:
				return SCHEMA_LOCATION_EDEFAULT == null ? schemaLocation != null : !SCHEMA_LOCATION_EDEFAULT.equals(schemaLocation);
			case WSDL1_1Package.REDEFINE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case WSDL1_1Package.REDEFINE__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case WSDL1_1Package.REDEFINE__SIMPLE_TYPE:
				return simpleType != null && !simpleType.isEmpty();
			case WSDL1_1Package.REDEFINE__COMPLEX_TYPE:
				return complexType != null && !complexType.isEmpty();
			case WSDL1_1Package.REDEFINE__ATTRIBUTE_GROUP:
				return attributeGroup != null && !attributeGroup.isEmpty();
			case WSDL1_1Package.REDEFINE__GROUP:
				return group != null && !group.isEmpty();
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
		result.append(" (schemaLocation: ");
		result.append(schemaLocation);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //RedefineImpl
