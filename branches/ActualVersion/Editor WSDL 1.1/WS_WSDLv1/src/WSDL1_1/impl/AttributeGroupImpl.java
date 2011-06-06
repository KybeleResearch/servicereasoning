/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL1_1.impl;

import WSDL1_1.Annotation;
import WSDL1_1.AnyAttribute;
import WSDL1_1.Attribute;
import WSDL1_1.AttributeGroup;
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
 * An implementation of the model object '<em><b>Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WSDL1_1.impl.AttributeGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link WSDL1_1.impl.AttributeGroupImpl#getId <em>Id</em>}</li>
 *   <li>{@link WSDL1_1.impl.AttributeGroupImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link WSDL1_1.impl.AttributeGroupImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link WSDL1_1.impl.AttributeGroupImpl#getAttributeGroup <em>Attribute Group</em>}</li>
 *   <li>{@link WSDL1_1.impl.AttributeGroupImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 *   <li>{@link WSDL1_1.impl.AttributeGroupImpl#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeGroupImpl extends EObjectImpl implements AttributeGroup {
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
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected Annotation annotation;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attribute;

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
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected AnyAttribute anyAttribute;

	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected AttributeGroup ref;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WSDL1_1Package.eINSTANCE.getAttributeGroup();
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.ATTRIBUTE_GROUP__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.ATTRIBUTE_GROUP__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation getAnnotation() {
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotation(Annotation newAnnotation, NotificationChain msgs) {
		Annotation oldAnnotation = annotation;
		annotation = newAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL1_1Package.ATTRIBUTE_GROUP__ANNOTATION, oldAnnotation, newAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotation(Annotation newAnnotation) {
		if (newAnnotation != annotation) {
			NotificationChain msgs = null;
			if (annotation != null)
				msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.ATTRIBUTE_GROUP__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.ATTRIBUTE_GROUP__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.ATTRIBUTE_GROUP__ANNOTATION, newAnnotation, newAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, WSDL1_1Package.ATTRIBUTE_GROUP__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeGroup> getAttributeGroup() {
		if (attributeGroup == null) {
			attributeGroup = new EObjectContainmentEList<AttributeGroup>(AttributeGroup.class, this, WSDL1_1Package.ATTRIBUTE_GROUP__ATTRIBUTE_GROUP);
		}
		return attributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyAttribute getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnyAttribute(AnyAttribute newAnyAttribute, NotificationChain msgs) {
		AnyAttribute oldAnyAttribute = anyAttribute;
		anyAttribute = newAnyAttribute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL1_1Package.ATTRIBUTE_GROUP__ANY_ATTRIBUTE, oldAnyAttribute, newAnyAttribute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnyAttribute(AnyAttribute newAnyAttribute) {
		if (newAnyAttribute != anyAttribute) {
			NotificationChain msgs = null;
			if (anyAttribute != null)
				msgs = ((InternalEObject)anyAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.ATTRIBUTE_GROUP__ANY_ATTRIBUTE, null, msgs);
			if (newAnyAttribute != null)
				msgs = ((InternalEObject)newAnyAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.ATTRIBUTE_GROUP__ANY_ATTRIBUTE, null, msgs);
			msgs = basicSetAnyAttribute(newAnyAttribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.ATTRIBUTE_GROUP__ANY_ATTRIBUTE, newAnyAttribute, newAnyAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeGroup getRef() {
		if (ref != null && ref.eIsProxy()) {
			InternalEObject oldRef = (InternalEObject)ref;
			ref = (AttributeGroup)eResolveProxy(oldRef);
			if (ref != oldRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WSDL1_1Package.ATTRIBUTE_GROUP__REF, oldRef, ref));
			}
		}
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeGroup basicGetRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(AttributeGroup newRef) {
		AttributeGroup oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.ATTRIBUTE_GROUP__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WSDL1_1Package.ATTRIBUTE_GROUP__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case WSDL1_1Package.ATTRIBUTE_GROUP__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case WSDL1_1Package.ATTRIBUTE_GROUP__ATTRIBUTE_GROUP:
				return ((InternalEList<?>)getAttributeGroup()).basicRemove(otherEnd, msgs);
			case WSDL1_1Package.ATTRIBUTE_GROUP__ANY_ATTRIBUTE:
				return basicSetAnyAttribute(null, msgs);
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
			case WSDL1_1Package.ATTRIBUTE_GROUP__NAME:
				return getName();
			case WSDL1_1Package.ATTRIBUTE_GROUP__ID:
				return getId();
			case WSDL1_1Package.ATTRIBUTE_GROUP__ANNOTATION:
				return getAnnotation();
			case WSDL1_1Package.ATTRIBUTE_GROUP__ATTRIBUTE:
				return getAttribute();
			case WSDL1_1Package.ATTRIBUTE_GROUP__ATTRIBUTE_GROUP:
				return getAttributeGroup();
			case WSDL1_1Package.ATTRIBUTE_GROUP__ANY_ATTRIBUTE:
				return getAnyAttribute();
			case WSDL1_1Package.ATTRIBUTE_GROUP__REF:
				if (resolve) return getRef();
				return basicGetRef();
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
			case WSDL1_1Package.ATTRIBUTE_GROUP__NAME:
				setName((String)newValue);
				return;
			case WSDL1_1Package.ATTRIBUTE_GROUP__ID:
				setId((String)newValue);
				return;
			case WSDL1_1Package.ATTRIBUTE_GROUP__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case WSDL1_1Package.ATTRIBUTE_GROUP__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Attribute>)newValue);
				return;
			case WSDL1_1Package.ATTRIBUTE_GROUP__ATTRIBUTE_GROUP:
				getAttributeGroup().clear();
				getAttributeGroup().addAll((Collection<? extends AttributeGroup>)newValue);
				return;
			case WSDL1_1Package.ATTRIBUTE_GROUP__ANY_ATTRIBUTE:
				setAnyAttribute((AnyAttribute)newValue);
				return;
			case WSDL1_1Package.ATTRIBUTE_GROUP__REF:
				setRef((AttributeGroup)newValue);
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
			case WSDL1_1Package.ATTRIBUTE_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WSDL1_1Package.ATTRIBUTE_GROUP__ID:
				setId(ID_EDEFAULT);
				return;
			case WSDL1_1Package.ATTRIBUTE_GROUP__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case WSDL1_1Package.ATTRIBUTE_GROUP__ATTRIBUTE:
				getAttribute().clear();
				return;
			case WSDL1_1Package.ATTRIBUTE_GROUP__ATTRIBUTE_GROUP:
				getAttributeGroup().clear();
				return;
			case WSDL1_1Package.ATTRIBUTE_GROUP__ANY_ATTRIBUTE:
				setAnyAttribute((AnyAttribute)null);
				return;
			case WSDL1_1Package.ATTRIBUTE_GROUP__REF:
				setRef((AttributeGroup)null);
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
			case WSDL1_1Package.ATTRIBUTE_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WSDL1_1Package.ATTRIBUTE_GROUP__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case WSDL1_1Package.ATTRIBUTE_GROUP__ANNOTATION:
				return annotation != null;
			case WSDL1_1Package.ATTRIBUTE_GROUP__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case WSDL1_1Package.ATTRIBUTE_GROUP__ATTRIBUTE_GROUP:
				return attributeGroup != null && !attributeGroup.isEmpty();
			case WSDL1_1Package.ATTRIBUTE_GROUP__ANY_ATTRIBUTE:
				return anyAttribute != null;
			case WSDL1_1Package.ATTRIBUTE_GROUP__REF:
				return ref != null;
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
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //AttributeGroupImpl
