/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL2_0.impl;

import WSDL2_0.All;
import WSDL2_0.Annotation;
import WSDL2_0.AnyAttribute;
import WSDL2_0.Attribute;
import WSDL2_0.AttributeGroup;
import WSDL2_0.Choice;
import WSDL2_0.Extension;
import WSDL2_0.Group;
import WSDL2_0.SequenceType;
import WSDL2_0.TypeRef;
import WSDL2_0.WSDL2_0Package;

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
 * An implementation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WSDL2_0.impl.ExtensionImpl#getId <em>Id</em>}</li>
 *   <li>{@link WSDL2_0.impl.ExtensionImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link WSDL2_0.impl.ExtensionImpl#getAll <em>All</em>}</li>
 *   <li>{@link WSDL2_0.impl.ExtensionImpl#getChoice <em>Choice</em>}</li>
 *   <li>{@link WSDL2_0.impl.ExtensionImpl#getSequenceDef <em>Sequence Def</em>}</li>
 *   <li>{@link WSDL2_0.impl.ExtensionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link WSDL2_0.impl.ExtensionImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link WSDL2_0.impl.ExtensionImpl#getAttributeGroup <em>Attribute Group</em>}</li>
 *   <li>{@link WSDL2_0.impl.ExtensionImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 *   <li>{@link WSDL2_0.impl.ExtensionImpl#getBase <em>Base</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtensionImpl extends AdicionalInformationTypeImpl implements Extension {
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
	 * The cached value of the '{@link #getAll() <em>All</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAll()
	 * @generated
	 * @ordered
	 */
	protected All all;

	/**
	 * The cached value of the '{@link #getChoice() <em>Choice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoice()
	 * @generated
	 * @ordered
	 */
	protected Choice choice;

	/**
	 * The cached value of the '{@link #getSequenceDef() <em>Sequence Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceDef()
	 * @generated
	 * @ordered
	 */
	protected SequenceType sequenceDef;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected Group group;

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
	 * The cached value of the '{@link #getBase() <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected TypeRef base;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WSDL2_0Package.eINSTANCE.getExtension();
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.EXTENSION__ID, oldId, id));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL2_0Package.EXTENSION__ANNOTATION, oldAnnotation, newAnnotation);
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
				msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.EXTENSION__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.EXTENSION__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.EXTENSION__ANNOTATION, newAnnotation, newAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public All getAll() {
		return all;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAll(All newAll, NotificationChain msgs) {
		All oldAll = all;
		all = newAll;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL2_0Package.EXTENSION__ALL, oldAll, newAll);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAll(All newAll) {
		if (newAll != all) {
			NotificationChain msgs = null;
			if (all != null)
				msgs = ((InternalEObject)all).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.EXTENSION__ALL, null, msgs);
			if (newAll != null)
				msgs = ((InternalEObject)newAll).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.EXTENSION__ALL, null, msgs);
			msgs = basicSetAll(newAll, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.EXTENSION__ALL, newAll, newAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choice getChoice() {
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChoice(Choice newChoice, NotificationChain msgs) {
		Choice oldChoice = choice;
		choice = newChoice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL2_0Package.EXTENSION__CHOICE, oldChoice, newChoice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChoice(Choice newChoice) {
		if (newChoice != choice) {
			NotificationChain msgs = null;
			if (choice != null)
				msgs = ((InternalEObject)choice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.EXTENSION__CHOICE, null, msgs);
			if (newChoice != null)
				msgs = ((InternalEObject)newChoice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.EXTENSION__CHOICE, null, msgs);
			msgs = basicSetChoice(newChoice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.EXTENSION__CHOICE, newChoice, newChoice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceType getSequenceDef() {
		return sequenceDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceDef(SequenceType newSequenceDef, NotificationChain msgs) {
		SequenceType oldSequenceDef = sequenceDef;
		sequenceDef = newSequenceDef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL2_0Package.EXTENSION__SEQUENCE_DEF, oldSequenceDef, newSequenceDef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceDef(SequenceType newSequenceDef) {
		if (newSequenceDef != sequenceDef) {
			NotificationChain msgs = null;
			if (sequenceDef != null)
				msgs = ((InternalEObject)sequenceDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.EXTENSION__SEQUENCE_DEF, null, msgs);
			if (newSequenceDef != null)
				msgs = ((InternalEObject)newSequenceDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.EXTENSION__SEQUENCE_DEF, null, msgs);
			msgs = basicSetSequenceDef(newSequenceDef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.EXTENSION__SEQUENCE_DEF, newSequenceDef, newSequenceDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(Group newGroup, NotificationChain msgs) {
		Group oldGroup = group;
		group = newGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL2_0Package.EXTENSION__GROUP, oldGroup, newGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(Group newGroup) {
		if (newGroup != group) {
			NotificationChain msgs = null;
			if (group != null)
				msgs = ((InternalEObject)group).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.EXTENSION__GROUP, null, msgs);
			if (newGroup != null)
				msgs = ((InternalEObject)newGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.EXTENSION__GROUP, null, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.EXTENSION__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, WSDL2_0Package.EXTENSION__ATTRIBUTE);
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
			attributeGroup = new EObjectContainmentEList<AttributeGroup>(AttributeGroup.class, this, WSDL2_0Package.EXTENSION__ATTRIBUTE_GROUP);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL2_0Package.EXTENSION__ANY_ATTRIBUTE, oldAnyAttribute, newAnyAttribute);
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
				msgs = ((InternalEObject)anyAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.EXTENSION__ANY_ATTRIBUTE, null, msgs);
			if (newAnyAttribute != null)
				msgs = ((InternalEObject)newAnyAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.EXTENSION__ANY_ATTRIBUTE, null, msgs);
			msgs = basicSetAnyAttribute(newAnyAttribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.EXTENSION__ANY_ATTRIBUTE, newAnyAttribute, newAnyAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRef getBase() {
		if (base != null && base.eIsProxy()) {
			InternalEObject oldBase = (InternalEObject)base;
			base = (TypeRef)eResolveProxy(oldBase);
			if (base != oldBase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WSDL2_0Package.EXTENSION__BASE, oldBase, base));
			}
		}
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRef basicGetBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase(TypeRef newBase) {
		TypeRef oldBase = base;
		base = newBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.EXTENSION__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WSDL2_0Package.EXTENSION__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case WSDL2_0Package.EXTENSION__ALL:
				return basicSetAll(null, msgs);
			case WSDL2_0Package.EXTENSION__CHOICE:
				return basicSetChoice(null, msgs);
			case WSDL2_0Package.EXTENSION__SEQUENCE_DEF:
				return basicSetSequenceDef(null, msgs);
			case WSDL2_0Package.EXTENSION__GROUP:
				return basicSetGroup(null, msgs);
			case WSDL2_0Package.EXTENSION__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case WSDL2_0Package.EXTENSION__ATTRIBUTE_GROUP:
				return ((InternalEList<?>)getAttributeGroup()).basicRemove(otherEnd, msgs);
			case WSDL2_0Package.EXTENSION__ANY_ATTRIBUTE:
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
			case WSDL2_0Package.EXTENSION__ID:
				return getId();
			case WSDL2_0Package.EXTENSION__ANNOTATION:
				return getAnnotation();
			case WSDL2_0Package.EXTENSION__ALL:
				return getAll();
			case WSDL2_0Package.EXTENSION__CHOICE:
				return getChoice();
			case WSDL2_0Package.EXTENSION__SEQUENCE_DEF:
				return getSequenceDef();
			case WSDL2_0Package.EXTENSION__GROUP:
				return getGroup();
			case WSDL2_0Package.EXTENSION__ATTRIBUTE:
				return getAttribute();
			case WSDL2_0Package.EXTENSION__ATTRIBUTE_GROUP:
				return getAttributeGroup();
			case WSDL2_0Package.EXTENSION__ANY_ATTRIBUTE:
				return getAnyAttribute();
			case WSDL2_0Package.EXTENSION__BASE:
				if (resolve) return getBase();
				return basicGetBase();
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
			case WSDL2_0Package.EXTENSION__ID:
				setId((String)newValue);
				return;
			case WSDL2_0Package.EXTENSION__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case WSDL2_0Package.EXTENSION__ALL:
				setAll((All)newValue);
				return;
			case WSDL2_0Package.EXTENSION__CHOICE:
				setChoice((Choice)newValue);
				return;
			case WSDL2_0Package.EXTENSION__SEQUENCE_DEF:
				setSequenceDef((SequenceType)newValue);
				return;
			case WSDL2_0Package.EXTENSION__GROUP:
				setGroup((Group)newValue);
				return;
			case WSDL2_0Package.EXTENSION__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Attribute>)newValue);
				return;
			case WSDL2_0Package.EXTENSION__ATTRIBUTE_GROUP:
				getAttributeGroup().clear();
				getAttributeGroup().addAll((Collection<? extends AttributeGroup>)newValue);
				return;
			case WSDL2_0Package.EXTENSION__ANY_ATTRIBUTE:
				setAnyAttribute((AnyAttribute)newValue);
				return;
			case WSDL2_0Package.EXTENSION__BASE:
				setBase((TypeRef)newValue);
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
			case WSDL2_0Package.EXTENSION__ID:
				setId(ID_EDEFAULT);
				return;
			case WSDL2_0Package.EXTENSION__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case WSDL2_0Package.EXTENSION__ALL:
				setAll((All)null);
				return;
			case WSDL2_0Package.EXTENSION__CHOICE:
				setChoice((Choice)null);
				return;
			case WSDL2_0Package.EXTENSION__SEQUENCE_DEF:
				setSequenceDef((SequenceType)null);
				return;
			case WSDL2_0Package.EXTENSION__GROUP:
				setGroup((Group)null);
				return;
			case WSDL2_0Package.EXTENSION__ATTRIBUTE:
				getAttribute().clear();
				return;
			case WSDL2_0Package.EXTENSION__ATTRIBUTE_GROUP:
				getAttributeGroup().clear();
				return;
			case WSDL2_0Package.EXTENSION__ANY_ATTRIBUTE:
				setAnyAttribute((AnyAttribute)null);
				return;
			case WSDL2_0Package.EXTENSION__BASE:
				setBase((TypeRef)null);
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
			case WSDL2_0Package.EXTENSION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case WSDL2_0Package.EXTENSION__ANNOTATION:
				return annotation != null;
			case WSDL2_0Package.EXTENSION__ALL:
				return all != null;
			case WSDL2_0Package.EXTENSION__CHOICE:
				return choice != null;
			case WSDL2_0Package.EXTENSION__SEQUENCE_DEF:
				return sequenceDef != null;
			case WSDL2_0Package.EXTENSION__GROUP:
				return group != null;
			case WSDL2_0Package.EXTENSION__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case WSDL2_0Package.EXTENSION__ATTRIBUTE_GROUP:
				return attributeGroup != null && !attributeGroup.isEmpty();
			case WSDL2_0Package.EXTENSION__ANY_ATTRIBUTE:
				return anyAttribute != null;
			case WSDL2_0Package.EXTENSION__BASE:
				return base != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ExtensionImpl
