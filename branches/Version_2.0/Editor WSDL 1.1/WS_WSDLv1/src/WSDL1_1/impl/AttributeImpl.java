/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL1_1.impl;

import WSDL1_1.Annotation;
import WSDL1_1.Attribute;
import WSDL1_1.SimpleType;
import WSDL1_1.WSDL1_1Package;
import WSDL1_1.formValues;
import WSDL1_1.usesValues;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WSDL1_1.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link WSDL1_1.impl.AttributeImpl#getId <em>Id</em>}</li>
 *   <li>{@link WSDL1_1.impl.AttributeImpl#getUse <em>Use</em>}</li>
 *   <li>{@link WSDL1_1.impl.AttributeImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link WSDL1_1.impl.AttributeImpl#getFixed <em>Fixed</em>}</li>
 *   <li>{@link WSDL1_1.impl.AttributeImpl#getForm <em>Form</em>}</li>
 *   <li>{@link WSDL1_1.impl.AttributeImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link WSDL1_1.impl.AttributeImpl#getSimpleType <em>Simple Type</em>}</li>
 *   <li>{@link WSDL1_1.impl.AttributeImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link WSDL1_1.impl.AttributeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeImpl extends AdicionalInformationTypeImpl implements Attribute {
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
	 * The default value of the '{@link #getUse() <em>Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected static final usesValues USE_EDEFAULT = usesValues.UNSET;

	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected usesValues use = USE_EDEFAULT;

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
	 * The cached value of the '{@link #getSimpleType() <em>Simple Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleType()
	 * @generated
	 * @ordered
	 */
	protected SimpleType simpleType;

	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected Attribute ref;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SimpleType type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WSDL1_1Package.eINSTANCE.getAttribute();
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.ATTRIBUTE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.ATTRIBUTE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public usesValues getUse() {
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUse(usesValues newUse) {
		usesValues oldUse = use;
		use = newUse == null ? USE_EDEFAULT : newUse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.ATTRIBUTE__USE, oldUse, use));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.ATTRIBUTE__DEFAULT, oldDefault, default_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.ATTRIBUTE__FIXED, oldFixed, fixed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.ATTRIBUTE__FORM, oldForm, form));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL1_1Package.ATTRIBUTE__ANNOTATION, oldAnnotation, newAnnotation);
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
				msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.ATTRIBUTE__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.ATTRIBUTE__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.ATTRIBUTE__ANNOTATION, newAnnotation, newAnnotation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL1_1Package.ATTRIBUTE__SIMPLE_TYPE, oldSimpleType, newSimpleType);
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
				msgs = ((InternalEObject)simpleType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.ATTRIBUTE__SIMPLE_TYPE, null, msgs);
			if (newSimpleType != null)
				msgs = ((InternalEObject)newSimpleType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.ATTRIBUTE__SIMPLE_TYPE, null, msgs);
			msgs = basicSetSimpleType(newSimpleType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.ATTRIBUTE__SIMPLE_TYPE, newSimpleType, newSimpleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getRef() {
		if (ref != null && ref.eIsProxy()) {
			InternalEObject oldRef = (InternalEObject)ref;
			ref = (Attribute)eResolveProxy(oldRef);
			if (ref != oldRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WSDL1_1Package.ATTRIBUTE__REF, oldRef, ref));
			}
		}
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(Attribute newRef) {
		Attribute oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.ATTRIBUTE__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (SimpleType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WSDL1_1Package.ATTRIBUTE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(SimpleType newType) {
		SimpleType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.ATTRIBUTE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WSDL1_1Package.ATTRIBUTE__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case WSDL1_1Package.ATTRIBUTE__SIMPLE_TYPE:
				return basicSetSimpleType(null, msgs);
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
			case WSDL1_1Package.ATTRIBUTE__NAME:
				return getName();
			case WSDL1_1Package.ATTRIBUTE__ID:
				return getId();
			case WSDL1_1Package.ATTRIBUTE__USE:
				return getUse();
			case WSDL1_1Package.ATTRIBUTE__DEFAULT:
				return getDefault();
			case WSDL1_1Package.ATTRIBUTE__FIXED:
				return getFixed();
			case WSDL1_1Package.ATTRIBUTE__FORM:
				return getForm();
			case WSDL1_1Package.ATTRIBUTE__ANNOTATION:
				return getAnnotation();
			case WSDL1_1Package.ATTRIBUTE__SIMPLE_TYPE:
				return getSimpleType();
			case WSDL1_1Package.ATTRIBUTE__REF:
				if (resolve) return getRef();
				return basicGetRef();
			case WSDL1_1Package.ATTRIBUTE__TYPE:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WSDL1_1Package.ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case WSDL1_1Package.ATTRIBUTE__ID:
				setId((String)newValue);
				return;
			case WSDL1_1Package.ATTRIBUTE__USE:
				setUse((usesValues)newValue);
				return;
			case WSDL1_1Package.ATTRIBUTE__DEFAULT:
				setDefault((String)newValue);
				return;
			case WSDL1_1Package.ATTRIBUTE__FIXED:
				setFixed((String)newValue);
				return;
			case WSDL1_1Package.ATTRIBUTE__FORM:
				setForm((formValues)newValue);
				return;
			case WSDL1_1Package.ATTRIBUTE__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case WSDL1_1Package.ATTRIBUTE__SIMPLE_TYPE:
				setSimpleType((SimpleType)newValue);
				return;
			case WSDL1_1Package.ATTRIBUTE__REF:
				setRef((Attribute)newValue);
				return;
			case WSDL1_1Package.ATTRIBUTE__TYPE:
				setType((SimpleType)newValue);
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
			case WSDL1_1Package.ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WSDL1_1Package.ATTRIBUTE__ID:
				setId(ID_EDEFAULT);
				return;
			case WSDL1_1Package.ATTRIBUTE__USE:
				setUse(USE_EDEFAULT);
				return;
			case WSDL1_1Package.ATTRIBUTE__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case WSDL1_1Package.ATTRIBUTE__FIXED:
				setFixed(FIXED_EDEFAULT);
				return;
			case WSDL1_1Package.ATTRIBUTE__FORM:
				setForm(FORM_EDEFAULT);
				return;
			case WSDL1_1Package.ATTRIBUTE__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case WSDL1_1Package.ATTRIBUTE__SIMPLE_TYPE:
				setSimpleType((SimpleType)null);
				return;
			case WSDL1_1Package.ATTRIBUTE__REF:
				setRef((Attribute)null);
				return;
			case WSDL1_1Package.ATTRIBUTE__TYPE:
				setType((SimpleType)null);
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
			case WSDL1_1Package.ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WSDL1_1Package.ATTRIBUTE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case WSDL1_1Package.ATTRIBUTE__USE:
				return use != USE_EDEFAULT;
			case WSDL1_1Package.ATTRIBUTE__DEFAULT:
				return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
			case WSDL1_1Package.ATTRIBUTE__FIXED:
				return FIXED_EDEFAULT == null ? fixed != null : !FIXED_EDEFAULT.equals(fixed);
			case WSDL1_1Package.ATTRIBUTE__FORM:
				return form != FORM_EDEFAULT;
			case WSDL1_1Package.ATTRIBUTE__ANNOTATION:
				return annotation != null;
			case WSDL1_1Package.ATTRIBUTE__SIMPLE_TYPE:
				return simpleType != null;
			case WSDL1_1Package.ATTRIBUTE__REF:
				return ref != null;
			case WSDL1_1Package.ATTRIBUTE__TYPE:
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
		result.append(", use: ");
		result.append(use);
		result.append(", default: ");
		result.append(default_);
		result.append(", fixed: ");
		result.append(fixed);
		result.append(", form: ");
		result.append(form);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
