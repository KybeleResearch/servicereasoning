/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL2_0.impl;

import WSDL2_0.Annotation;
import WSDL2_0.SimpleType;
import WSDL2_0.Union;
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
 * An implementation of the model object '<em><b>Union</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WSDL2_0.impl.UnionImpl#getId <em>Id</em>}</li>
 *   <li>{@link WSDL2_0.impl.UnionImpl#getMemberTypes <em>Member Types</em>}</li>
 *   <li>{@link WSDL2_0.impl.UnionImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link WSDL2_0.impl.UnionImpl#getSimpleType <em>Simple Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnionImpl extends EObjectImpl implements Union {
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
	 * The default value of the '{@link #getMemberTypes() <em>Member Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberTypes()
	 * @generated
	 * @ordered
	 */
	protected static final String MEMBER_TYPES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemberTypes() <em>Member Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberTypes()
	 * @generated
	 * @ordered
	 */
	protected String memberTypes = MEMBER_TYPES_EDEFAULT;

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
	 * The cached value of the '{@link #getSimpleType() <em>Simple Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleType()
	 * @generated
	 * @ordered
	 */
	protected EList<SimpleType> simpleType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WSDL2_0Package.eINSTANCE.getUnion();
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.UNION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMemberTypes() {
		return memberTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberTypes(String newMemberTypes) {
		String oldMemberTypes = memberTypes;
		memberTypes = newMemberTypes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.UNION__MEMBER_TYPES, oldMemberTypes, memberTypes));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL2_0Package.UNION__ANNOTATION, oldAnnotation, newAnnotation);
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
				msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.UNION__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.UNION__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.UNION__ANNOTATION, newAnnotation, newAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimpleType> getSimpleType() {
		if (simpleType == null) {
			simpleType = new EObjectContainmentEList<SimpleType>(SimpleType.class, this, WSDL2_0Package.UNION__SIMPLE_TYPE);
		}
		return simpleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WSDL2_0Package.UNION__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case WSDL2_0Package.UNION__SIMPLE_TYPE:
				return ((InternalEList<?>)getSimpleType()).basicRemove(otherEnd, msgs);
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
			case WSDL2_0Package.UNION__ID:
				return getId();
			case WSDL2_0Package.UNION__MEMBER_TYPES:
				return getMemberTypes();
			case WSDL2_0Package.UNION__ANNOTATION:
				return getAnnotation();
			case WSDL2_0Package.UNION__SIMPLE_TYPE:
				return getSimpleType();
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
			case WSDL2_0Package.UNION__ID:
				setId((String)newValue);
				return;
			case WSDL2_0Package.UNION__MEMBER_TYPES:
				setMemberTypes((String)newValue);
				return;
			case WSDL2_0Package.UNION__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case WSDL2_0Package.UNION__SIMPLE_TYPE:
				getSimpleType().clear();
				getSimpleType().addAll((Collection<? extends SimpleType>)newValue);
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
			case WSDL2_0Package.UNION__ID:
				setId(ID_EDEFAULT);
				return;
			case WSDL2_0Package.UNION__MEMBER_TYPES:
				setMemberTypes(MEMBER_TYPES_EDEFAULT);
				return;
			case WSDL2_0Package.UNION__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case WSDL2_0Package.UNION__SIMPLE_TYPE:
				getSimpleType().clear();
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
			case WSDL2_0Package.UNION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case WSDL2_0Package.UNION__MEMBER_TYPES:
				return MEMBER_TYPES_EDEFAULT == null ? memberTypes != null : !MEMBER_TYPES_EDEFAULT.equals(memberTypes);
			case WSDL2_0Package.UNION__ANNOTATION:
				return annotation != null;
			case WSDL2_0Package.UNION__SIMPLE_TYPE:
				return simpleType != null && !simpleType.isEmpty();
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
		result.append(", memberTypes: ");
		result.append(memberTypes);
		result.append(')');
		return result.toString();
	}

} //UnionImpl
