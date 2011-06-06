/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL1_1.impl;

import WSDL1_1.Annotation;
import WSDL1_1.List;
import WSDL1_1.Restriction;
import WSDL1_1.SimpleType;
import WSDL1_1.Union;
import WSDL1_1.WSDL1_1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WSDL1_1.impl.SimpleTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link WSDL1_1.impl.SimpleTypeImpl#getFinal <em>Final</em>}</li>
 *   <li>{@link WSDL1_1.impl.SimpleTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link WSDL1_1.impl.SimpleTypeImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link WSDL1_1.impl.SimpleTypeImpl#getRestriction <em>Restriction</em>}</li>
 *   <li>{@link WSDL1_1.impl.SimpleTypeImpl#getList <em>List</em>}</li>
 *   <li>{@link WSDL1_1.impl.SimpleTypeImpl#getUnion <em>Union</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleTypeImpl extends TypeRefImpl implements SimpleType {
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
	 * The cached value of the '{@link #getRestriction() <em>Restriction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestriction()
	 * @generated
	 * @ordered
	 */
	protected Restriction restriction;

	/**
	 * The cached value of the '{@link #getList() <em>List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getList()
	 * @generated
	 * @ordered
	 */
	protected List list;

	/**
	 * The cached value of the '{@link #getUnion() <em>Union</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnion()
	 * @generated
	 * @ordered
	 */
	protected Union union;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WSDL1_1Package.eINSTANCE.getSimpleType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.SIMPLE_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.SIMPLE_TYPE__FINAL, oldFinal, final_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.SIMPLE_TYPE__ID, oldId, id));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL1_1Package.SIMPLE_TYPE__ANNOTATION, oldAnnotation, newAnnotation);
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
				msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.SIMPLE_TYPE__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.SIMPLE_TYPE__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.SIMPLE_TYPE__ANNOTATION, newAnnotation, newAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Restriction getRestriction() {
		return restriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRestriction(Restriction newRestriction, NotificationChain msgs) {
		Restriction oldRestriction = restriction;
		restriction = newRestriction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL1_1Package.SIMPLE_TYPE__RESTRICTION, oldRestriction, newRestriction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestriction(Restriction newRestriction) {
		if (newRestriction != restriction) {
			NotificationChain msgs = null;
			if (restriction != null)
				msgs = ((InternalEObject)restriction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.SIMPLE_TYPE__RESTRICTION, null, msgs);
			if (newRestriction != null)
				msgs = ((InternalEObject)newRestriction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.SIMPLE_TYPE__RESTRICTION, null, msgs);
			msgs = basicSetRestriction(newRestriction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.SIMPLE_TYPE__RESTRICTION, newRestriction, newRestriction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getList() {
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetList(List newList, NotificationChain msgs) {
		List oldList = list;
		list = newList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL1_1Package.SIMPLE_TYPE__LIST, oldList, newList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setList(List newList) {
		if (newList != list) {
			NotificationChain msgs = null;
			if (list != null)
				msgs = ((InternalEObject)list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.SIMPLE_TYPE__LIST, null, msgs);
			if (newList != null)
				msgs = ((InternalEObject)newList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.SIMPLE_TYPE__LIST, null, msgs);
			msgs = basicSetList(newList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.SIMPLE_TYPE__LIST, newList, newList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Union getUnion() {
		return union;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnion(Union newUnion, NotificationChain msgs) {
		Union oldUnion = union;
		union = newUnion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL1_1Package.SIMPLE_TYPE__UNION, oldUnion, newUnion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnion(Union newUnion) {
		if (newUnion != union) {
			NotificationChain msgs = null;
			if (union != null)
				msgs = ((InternalEObject)union).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.SIMPLE_TYPE__UNION, null, msgs);
			if (newUnion != null)
				msgs = ((InternalEObject)newUnion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.SIMPLE_TYPE__UNION, null, msgs);
			msgs = basicSetUnion(newUnion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.SIMPLE_TYPE__UNION, newUnion, newUnion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WSDL1_1Package.SIMPLE_TYPE__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case WSDL1_1Package.SIMPLE_TYPE__RESTRICTION:
				return basicSetRestriction(null, msgs);
			case WSDL1_1Package.SIMPLE_TYPE__LIST:
				return basicSetList(null, msgs);
			case WSDL1_1Package.SIMPLE_TYPE__UNION:
				return basicSetUnion(null, msgs);
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
			case WSDL1_1Package.SIMPLE_TYPE__NAME:
				return getName();
			case WSDL1_1Package.SIMPLE_TYPE__FINAL:
				return getFinal();
			case WSDL1_1Package.SIMPLE_TYPE__ID:
				return getId();
			case WSDL1_1Package.SIMPLE_TYPE__ANNOTATION:
				return getAnnotation();
			case WSDL1_1Package.SIMPLE_TYPE__RESTRICTION:
				return getRestriction();
			case WSDL1_1Package.SIMPLE_TYPE__LIST:
				return getList();
			case WSDL1_1Package.SIMPLE_TYPE__UNION:
				return getUnion();
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
			case WSDL1_1Package.SIMPLE_TYPE__NAME:
				setName((String)newValue);
				return;
			case WSDL1_1Package.SIMPLE_TYPE__FINAL:
				setFinal((String)newValue);
				return;
			case WSDL1_1Package.SIMPLE_TYPE__ID:
				setId((String)newValue);
				return;
			case WSDL1_1Package.SIMPLE_TYPE__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case WSDL1_1Package.SIMPLE_TYPE__RESTRICTION:
				setRestriction((Restriction)newValue);
				return;
			case WSDL1_1Package.SIMPLE_TYPE__LIST:
				setList((List)newValue);
				return;
			case WSDL1_1Package.SIMPLE_TYPE__UNION:
				setUnion((Union)newValue);
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
			case WSDL1_1Package.SIMPLE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WSDL1_1Package.SIMPLE_TYPE__FINAL:
				setFinal(FINAL_EDEFAULT);
				return;
			case WSDL1_1Package.SIMPLE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case WSDL1_1Package.SIMPLE_TYPE__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case WSDL1_1Package.SIMPLE_TYPE__RESTRICTION:
				setRestriction((Restriction)null);
				return;
			case WSDL1_1Package.SIMPLE_TYPE__LIST:
				setList((List)null);
				return;
			case WSDL1_1Package.SIMPLE_TYPE__UNION:
				setUnion((Union)null);
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
			case WSDL1_1Package.SIMPLE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WSDL1_1Package.SIMPLE_TYPE__FINAL:
				return FINAL_EDEFAULT == null ? final_ != null : !FINAL_EDEFAULT.equals(final_);
			case WSDL1_1Package.SIMPLE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case WSDL1_1Package.SIMPLE_TYPE__ANNOTATION:
				return annotation != null;
			case WSDL1_1Package.SIMPLE_TYPE__RESTRICTION:
				return restriction != null;
			case WSDL1_1Package.SIMPLE_TYPE__LIST:
				return list != null;
			case WSDL1_1Package.SIMPLE_TYPE__UNION:
				return union != null;
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
		result.append(", final: ");
		result.append(final_);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //SimpleTypeImpl
