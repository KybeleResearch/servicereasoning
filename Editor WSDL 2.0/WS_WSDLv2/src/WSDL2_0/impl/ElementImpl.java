/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL2_0.impl;

import WSDL2_0.Annotation;
import WSDL2_0.ComplexType;
import WSDL2_0.Element;
import WSDL2_0.Key;
import WSDL2_0.KeyRef;
import WSDL2_0.SimpleType;
import WSDL2_0.TypeRef;
import WSDL2_0.Unique;
import WSDL2_0.WSDL2_0Package;
import WSDL2_0.formValues;

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
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WSDL2_0.impl.ElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link WSDL2_0.impl.ElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link WSDL2_0.impl.ElementImpl#getMinOccurs <em>Min Occurs</em>}</li>
 *   <li>{@link WSDL2_0.impl.ElementImpl#getMaxOccurs <em>Max Occurs</em>}</li>
 *   <li>{@link WSDL2_0.impl.ElementImpl#getNillable <em>Nillable</em>}</li>
 *   <li>{@link WSDL2_0.impl.ElementImpl#getAbstractDef <em>Abstract Def</em>}</li>
 *   <li>{@link WSDL2_0.impl.ElementImpl#getFinal <em>Final</em>}</li>
 *   <li>{@link WSDL2_0.impl.ElementImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link WSDL2_0.impl.ElementImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link WSDL2_0.impl.ElementImpl#getFixed <em>Fixed</em>}</li>
 *   <li>{@link WSDL2_0.impl.ElementImpl#getForm <em>Form</em>}</li>
 *   <li>{@link WSDL2_0.impl.ElementImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link WSDL2_0.impl.ElementImpl#getComplexType <em>Complex Type</em>}</li>
 *   <li>{@link WSDL2_0.impl.ElementImpl#getSimpleType <em>Simple Type</em>}</li>
 *   <li>{@link WSDL2_0.impl.ElementImpl#getUniqueDef <em>Unique Def</em>}</li>
 *   <li>{@link WSDL2_0.impl.ElementImpl#getKey <em>Key</em>}</li>
 *   <li>{@link WSDL2_0.impl.ElementImpl#getKeyref <em>Keyref</em>}</li>
 *   <li>{@link WSDL2_0.impl.ElementImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link WSDL2_0.impl.ElementImpl#getSubstitutionGroup <em>Substitution Group</em>}</li>
 *   <li>{@link WSDL2_0.impl.ElementImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementImpl extends AdicionalInformationTypeImpl implements Element {
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
	 * The default value of the '{@link #getMinOccurs() <em>Min Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinOccurs()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_OCCURS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinOccurs() <em>Min Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinOccurs()
	 * @generated
	 * @ordered
	 */
	protected Integer minOccurs = MIN_OCCURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxOccurs() <em>Max Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOccurs()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_OCCURS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxOccurs() <em>Max Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOccurs()
	 * @generated
	 * @ordered
	 */
	protected String maxOccurs = MAX_OCCURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNillable() <em>Nillable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNillable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean NILLABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNillable() <em>Nillable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNillable()
	 * @generated
	 * @ordered
	 */
	protected Boolean nillable = NILLABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbstractDef() <em>Abstract Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractDef()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ABSTRACT_DEF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbstractDef() <em>Abstract Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractDef()
	 * @generated
	 * @ordered
	 */
	protected Boolean abstractDef = ABSTRACT_DEF_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinal()
	 * @generated
	 * @ordered
	 */
	protected static final String FINAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinal()
	 * @generated
	 * @ordered
	 */
	protected String final_ = FINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlock() <em>Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected static final String BLOCK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlock() <em>Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected String block = BLOCK_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected String default_ = DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFixed() <em>Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixed()
	 * @generated
	 * @ordered
	 */
	protected static final String FIXED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFixed() <em>Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixed()
	 * @generated
	 * @ordered
	 */
	protected String fixed = FIXED_EDEFAULT;

	/**
	 * The default value of the '{@link #getForm() <em>Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected static final formValues FORM_EDEFAULT = formValues.UNSET;

	/**
	 * The cached value of the '{@link #getForm() <em>Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected formValues form = FORM_EDEFAULT;

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
	 * The cached value of the '{@link #getComplexType() <em>Complex Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexType()
	 * @generated
	 * @ordered
	 */
	protected ComplexType complexType;

	/**
	 * The cached value of the '{@link #getSimpleType() <em>Simple Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleType()
	 * @generated
	 * @ordered
	 */
	protected SimpleType simpleType;

	/**
	 * The cached value of the '{@link #getUniqueDef() <em>Unique Def</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueDef()
	 * @generated
	 * @ordered
	 */
	protected EList<Unique> uniqueDef;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected EList<Key> key;

	/**
	 * The cached value of the '{@link #getKeyref() <em>Keyref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyref()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyRef> keyref;

	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected Element ref;

	/**
	 * The cached value of the '{@link #getSubstitutionGroup() <em>Substitution Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitutionGroup()
	 * @generated
	 * @ordered
	 */
	protected Element substitutionGroup;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WSDL2_0Package.eINSTANCE.getElement();
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.ELEMENT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.ELEMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMinOccurs() {
		return minOccurs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinOccurs(Integer newMinOccurs) {
		Integer oldMinOccurs = minOccurs;
		minOccurs = newMinOccurs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.ELEMENT__MIN_OCCURS, oldMinOccurs, minOccurs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxOccurs() {
		return maxOccurs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxOccurs(String newMaxOccurs) {
		String oldMaxOccurs = maxOccurs;
		maxOccurs = newMaxOccurs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.ELEMENT__MAX_OCCURS, oldMaxOccurs, maxOccurs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getNillable() {
		return nillable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNillable(Boolean newNillable) {
		Boolean oldNillable = nillable;
		nillable = newNillable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.ELEMENT__NILLABLE, oldNillable, nillable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAbstractDef() {
		return abstractDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractDef(Boolean newAbstractDef) {
		Boolean oldAbstractDef = abstractDef;
		abstractDef = newAbstractDef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.ELEMENT__ABSTRACT_DEF, oldAbstractDef, abstractDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFinal() {
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinal(String newFinal) {
		String oldFinal = final_;
		final_ = newFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.ELEMENT__FINAL, oldFinal, final_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBlock() {
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlock(String newBlock) {
		String oldBlock = block;
		block = newBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.ELEMENT__BLOCK, oldBlock, block));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(String newDefault) {
		String oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.ELEMENT__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFixed() {
		return fixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixed(String newFixed) {
		String oldFixed = fixed;
		fixed = newFixed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.ELEMENT__FIXED, oldFixed, fixed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public formValues getForm() {
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForm(formValues newForm) {
		formValues oldForm = form;
		form = newForm == null ? FORM_EDEFAULT : newForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.ELEMENT__FORM, oldForm, form));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL2_0Package.ELEMENT__ANNOTATION, oldAnnotation, newAnnotation);
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
				msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.ELEMENT__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.ELEMENT__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.ELEMENT__ANNOTATION, newAnnotation, newAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexType getComplexType() {
		return complexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComplexType(ComplexType newComplexType, NotificationChain msgs) {
		ComplexType oldComplexType = complexType;
		complexType = newComplexType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL2_0Package.ELEMENT__COMPLEX_TYPE, oldComplexType, newComplexType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplexType(ComplexType newComplexType) {
		if (newComplexType != complexType) {
			NotificationChain msgs = null;
			if (complexType != null)
				msgs = ((InternalEObject)complexType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.ELEMENT__COMPLEX_TYPE, null, msgs);
			if (newComplexType != null)
				msgs = ((InternalEObject)newComplexType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.ELEMENT__COMPLEX_TYPE, null, msgs);
			msgs = basicSetComplexType(newComplexType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.ELEMENT__COMPLEX_TYPE, newComplexType, newComplexType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleType getSimpleType() {
		return simpleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimpleType(SimpleType newSimpleType, NotificationChain msgs) {
		SimpleType oldSimpleType = simpleType;
		simpleType = newSimpleType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL2_0Package.ELEMENT__SIMPLE_TYPE, oldSimpleType, newSimpleType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleType(SimpleType newSimpleType) {
		if (newSimpleType != simpleType) {
			NotificationChain msgs = null;
			if (simpleType != null)
				msgs = ((InternalEObject)simpleType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.ELEMENT__SIMPLE_TYPE, null, msgs);
			if (newSimpleType != null)
				msgs = ((InternalEObject)newSimpleType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.ELEMENT__SIMPLE_TYPE, null, msgs);
			msgs = basicSetSimpleType(newSimpleType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.ELEMENT__SIMPLE_TYPE, newSimpleType, newSimpleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Unique> getUniqueDef() {
		if (uniqueDef == null) {
			uniqueDef = new EObjectContainmentEList<Unique>(Unique.class, this, WSDL2_0Package.ELEMENT__UNIQUE_DEF);
		}
		return uniqueDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Key> getKey() {
		if (key == null) {
			key = new EObjectContainmentEList<Key>(Key.class, this, WSDL2_0Package.ELEMENT__KEY);
		}
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyRef> getKeyref() {
		if (keyref == null) {
			keyref = new EObjectContainmentEList<KeyRef>(KeyRef.class, this, WSDL2_0Package.ELEMENT__KEYREF);
		}
		return keyref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getRef() {
		if (ref != null && ref.eIsProxy()) {
			InternalEObject oldRef = (InternalEObject)ref;
			ref = (Element)eResolveProxy(oldRef);
			if (ref != oldRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WSDL2_0Package.ELEMENT__REF, oldRef, ref));
			}
		}
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(Element newRef) {
		Element oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.ELEMENT__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getSubstitutionGroup() {
		if (substitutionGroup != null && substitutionGroup.eIsProxy()) {
			InternalEObject oldSubstitutionGroup = (InternalEObject)substitutionGroup;
			substitutionGroup = (Element)eResolveProxy(oldSubstitutionGroup);
			if (substitutionGroup != oldSubstitutionGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WSDL2_0Package.ELEMENT__SUBSTITUTION_GROUP, oldSubstitutionGroup, substitutionGroup));
			}
		}
		return substitutionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetSubstitutionGroup() {
		return substitutionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstitutionGroup(Element newSubstitutionGroup) {
		Element oldSubstitutionGroup = substitutionGroup;
		substitutionGroup = newSubstitutionGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.ELEMENT__SUBSTITUTION_GROUP, oldSubstitutionGroup, substitutionGroup));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WSDL2_0Package.ELEMENT__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.ELEMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WSDL2_0Package.ELEMENT__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case WSDL2_0Package.ELEMENT__COMPLEX_TYPE:
				return basicSetComplexType(null, msgs);
			case WSDL2_0Package.ELEMENT__SIMPLE_TYPE:
				return basicSetSimpleType(null, msgs);
			case WSDL2_0Package.ELEMENT__UNIQUE_DEF:
				return ((InternalEList<?>)getUniqueDef()).basicRemove(otherEnd, msgs);
			case WSDL2_0Package.ELEMENT__KEY:
				return ((InternalEList<?>)getKey()).basicRemove(otherEnd, msgs);
			case WSDL2_0Package.ELEMENT__KEYREF:
				return ((InternalEList<?>)getKeyref()).basicRemove(otherEnd, msgs);
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
			case WSDL2_0Package.ELEMENT__NAME:
				return getName();
			case WSDL2_0Package.ELEMENT__ID:
				return getId();
			case WSDL2_0Package.ELEMENT__MIN_OCCURS:
				return getMinOccurs();
			case WSDL2_0Package.ELEMENT__MAX_OCCURS:
				return getMaxOccurs();
			case WSDL2_0Package.ELEMENT__NILLABLE:
				return getNillable();
			case WSDL2_0Package.ELEMENT__ABSTRACT_DEF:
				return getAbstractDef();
			case WSDL2_0Package.ELEMENT__FINAL:
				return getFinal();
			case WSDL2_0Package.ELEMENT__BLOCK:
				return getBlock();
			case WSDL2_0Package.ELEMENT__DEFAULT:
				return getDefault();
			case WSDL2_0Package.ELEMENT__FIXED:
				return getFixed();
			case WSDL2_0Package.ELEMENT__FORM:
				return getForm();
			case WSDL2_0Package.ELEMENT__ANNOTATION:
				return getAnnotation();
			case WSDL2_0Package.ELEMENT__COMPLEX_TYPE:
				return getComplexType();
			case WSDL2_0Package.ELEMENT__SIMPLE_TYPE:
				return getSimpleType();
			case WSDL2_0Package.ELEMENT__UNIQUE_DEF:
				return getUniqueDef();
			case WSDL2_0Package.ELEMENT__KEY:
				return getKey();
			case WSDL2_0Package.ELEMENT__KEYREF:
				return getKeyref();
			case WSDL2_0Package.ELEMENT__REF:
				if (resolve) return getRef();
				return basicGetRef();
			case WSDL2_0Package.ELEMENT__SUBSTITUTION_GROUP:
				if (resolve) return getSubstitutionGroup();
				return basicGetSubstitutionGroup();
			case WSDL2_0Package.ELEMENT__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case WSDL2_0Package.ELEMENT__NAME:
				setName((String)newValue);
				return;
			case WSDL2_0Package.ELEMENT__ID:
				setId((String)newValue);
				return;
			case WSDL2_0Package.ELEMENT__MIN_OCCURS:
				setMinOccurs((Integer)newValue);
				return;
			case WSDL2_0Package.ELEMENT__MAX_OCCURS:
				setMaxOccurs((String)newValue);
				return;
			case WSDL2_0Package.ELEMENT__NILLABLE:
				setNillable((Boolean)newValue);
				return;
			case WSDL2_0Package.ELEMENT__ABSTRACT_DEF:
				setAbstractDef((Boolean)newValue);
				return;
			case WSDL2_0Package.ELEMENT__FINAL:
				setFinal((String)newValue);
				return;
			case WSDL2_0Package.ELEMENT__BLOCK:
				setBlock((String)newValue);
				return;
			case WSDL2_0Package.ELEMENT__DEFAULT:
				setDefault((String)newValue);
				return;
			case WSDL2_0Package.ELEMENT__FIXED:
				setFixed((String)newValue);
				return;
			case WSDL2_0Package.ELEMENT__FORM:
				setForm((formValues)newValue);
				return;
			case WSDL2_0Package.ELEMENT__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case WSDL2_0Package.ELEMENT__COMPLEX_TYPE:
				setComplexType((ComplexType)newValue);
				return;
			case WSDL2_0Package.ELEMENT__SIMPLE_TYPE:
				setSimpleType((SimpleType)newValue);
				return;
			case WSDL2_0Package.ELEMENT__UNIQUE_DEF:
				getUniqueDef().clear();
				getUniqueDef().addAll((Collection<? extends Unique>)newValue);
				return;
			case WSDL2_0Package.ELEMENT__KEY:
				getKey().clear();
				getKey().addAll((Collection<? extends Key>)newValue);
				return;
			case WSDL2_0Package.ELEMENT__KEYREF:
				getKeyref().clear();
				getKeyref().addAll((Collection<? extends KeyRef>)newValue);
				return;
			case WSDL2_0Package.ELEMENT__REF:
				setRef((Element)newValue);
				return;
			case WSDL2_0Package.ELEMENT__SUBSTITUTION_GROUP:
				setSubstitutionGroup((Element)newValue);
				return;
			case WSDL2_0Package.ELEMENT__TYPE:
				setType((TypeRef)newValue);
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
			case WSDL2_0Package.ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WSDL2_0Package.ELEMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case WSDL2_0Package.ELEMENT__MIN_OCCURS:
				setMinOccurs(MIN_OCCURS_EDEFAULT);
				return;
			case WSDL2_0Package.ELEMENT__MAX_OCCURS:
				setMaxOccurs(MAX_OCCURS_EDEFAULT);
				return;
			case WSDL2_0Package.ELEMENT__NILLABLE:
				setNillable(NILLABLE_EDEFAULT);
				return;
			case WSDL2_0Package.ELEMENT__ABSTRACT_DEF:
				setAbstractDef(ABSTRACT_DEF_EDEFAULT);
				return;
			case WSDL2_0Package.ELEMENT__FINAL:
				setFinal(FINAL_EDEFAULT);
				return;
			case WSDL2_0Package.ELEMENT__BLOCK:
				setBlock(BLOCK_EDEFAULT);
				return;
			case WSDL2_0Package.ELEMENT__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case WSDL2_0Package.ELEMENT__FIXED:
				setFixed(FIXED_EDEFAULT);
				return;
			case WSDL2_0Package.ELEMENT__FORM:
				setForm(FORM_EDEFAULT);
				return;
			case WSDL2_0Package.ELEMENT__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case WSDL2_0Package.ELEMENT__COMPLEX_TYPE:
				setComplexType((ComplexType)null);
				return;
			case WSDL2_0Package.ELEMENT__SIMPLE_TYPE:
				setSimpleType((SimpleType)null);
				return;
			case WSDL2_0Package.ELEMENT__UNIQUE_DEF:
				getUniqueDef().clear();
				return;
			case WSDL2_0Package.ELEMENT__KEY:
				getKey().clear();
				return;
			case WSDL2_0Package.ELEMENT__KEYREF:
				getKeyref().clear();
				return;
			case WSDL2_0Package.ELEMENT__REF:
				setRef((Element)null);
				return;
			case WSDL2_0Package.ELEMENT__SUBSTITUTION_GROUP:
				setSubstitutionGroup((Element)null);
				return;
			case WSDL2_0Package.ELEMENT__TYPE:
				setType((TypeRef)null);
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
			case WSDL2_0Package.ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WSDL2_0Package.ELEMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case WSDL2_0Package.ELEMENT__MIN_OCCURS:
				return MIN_OCCURS_EDEFAULT == null ? minOccurs != null : !MIN_OCCURS_EDEFAULT.equals(minOccurs);
			case WSDL2_0Package.ELEMENT__MAX_OCCURS:
				return MAX_OCCURS_EDEFAULT == null ? maxOccurs != null : !MAX_OCCURS_EDEFAULT.equals(maxOccurs);
			case WSDL2_0Package.ELEMENT__NILLABLE:
				return NILLABLE_EDEFAULT == null ? nillable != null : !NILLABLE_EDEFAULT.equals(nillable);
			case WSDL2_0Package.ELEMENT__ABSTRACT_DEF:
				return ABSTRACT_DEF_EDEFAULT == null ? abstractDef != null : !ABSTRACT_DEF_EDEFAULT.equals(abstractDef);
			case WSDL2_0Package.ELEMENT__FINAL:
				return FINAL_EDEFAULT == null ? final_ != null : !FINAL_EDEFAULT.equals(final_);
			case WSDL2_0Package.ELEMENT__BLOCK:
				return BLOCK_EDEFAULT == null ? block != null : !BLOCK_EDEFAULT.equals(block);
			case WSDL2_0Package.ELEMENT__DEFAULT:
				return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
			case WSDL2_0Package.ELEMENT__FIXED:
				return FIXED_EDEFAULT == null ? fixed != null : !FIXED_EDEFAULT.equals(fixed);
			case WSDL2_0Package.ELEMENT__FORM:
				return form != FORM_EDEFAULT;
			case WSDL2_0Package.ELEMENT__ANNOTATION:
				return annotation != null;
			case WSDL2_0Package.ELEMENT__COMPLEX_TYPE:
				return complexType != null;
			case WSDL2_0Package.ELEMENT__SIMPLE_TYPE:
				return simpleType != null;
			case WSDL2_0Package.ELEMENT__UNIQUE_DEF:
				return uniqueDef != null && !uniqueDef.isEmpty();
			case WSDL2_0Package.ELEMENT__KEY:
				return key != null && !key.isEmpty();
			case WSDL2_0Package.ELEMENT__KEYREF:
				return keyref != null && !keyref.isEmpty();
			case WSDL2_0Package.ELEMENT__REF:
				return ref != null;
			case WSDL2_0Package.ELEMENT__SUBSTITUTION_GROUP:
				return substitutionGroup != null;
			case WSDL2_0Package.ELEMENT__TYPE:
				return type != null;
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
		result.append(", minOccurs: ");
		result.append(minOccurs);
		result.append(", maxOccurs: ");
		result.append(maxOccurs);
		result.append(", nillable: ");
		result.append(nillable);
		result.append(", abstractDef: ");
		result.append(abstractDef);
		result.append(", final: ");
		result.append(final_);
		result.append(", block: ");
		result.append(block);
		result.append(", default: ");
		result.append(default_);
		result.append(", fixed: ");
		result.append(fixed);
		result.append(", form: ");
		result.append(form);
		result.append(')');
		return result.toString();
	}

} //ElementImpl
