/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL1_1.impl;

import WSDL1_1.Annotation;
import WSDL1_1.AnyAttribute;
import WSDL1_1.WSDL1_1Package;
import WSDL1_1.processContentsValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Any Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WSDL1_1.impl.AnyAttributeImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link WSDL1_1.impl.AnyAttributeImpl#getProcessContents <em>Process Contents</em>}</li>
 *   <li>{@link WSDL1_1.impl.AnyAttributeImpl#getId <em>Id</em>}</li>
 *   <li>{@link WSDL1_1.impl.AnyAttributeImpl#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnyAttributeImpl extends EObjectImpl implements AnyAttribute {
	/**
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected String namespace = NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessContents() <em>Process Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessContents()
	 * @generated
	 * @ordered
	 */
	protected static final processContentsValue PROCESS_CONTENTS_EDEFAULT = processContentsValue.UNSET;

	/**
	 * The cached value of the '{@link #getProcessContents() <em>Process Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessContents()
	 * @generated
	 * @ordered
	 */
	protected processContentsValue processContents = PROCESS_CONTENTS_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnyAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WSDL1_1Package.eINSTANCE.getAnyAttribute();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(String newNamespace) {
		String oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.ANY_ATTRIBUTE__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public processContentsValue getProcessContents() {
		return processContents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessContents(processContentsValue newProcessContents) {
		processContentsValue oldProcessContents = processContents;
		processContents = newProcessContents == null ? PROCESS_CONTENTS_EDEFAULT : newProcessContents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.ANY_ATTRIBUTE__PROCESS_CONTENTS, oldProcessContents, processContents));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.ANY_ATTRIBUTE__ID, oldId, id));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL1_1Package.ANY_ATTRIBUTE__ANNOTATION, oldAnnotation, newAnnotation);
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
				msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.ANY_ATTRIBUTE__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.ANY_ATTRIBUTE__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.ANY_ATTRIBUTE__ANNOTATION, newAnnotation, newAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WSDL1_1Package.ANY_ATTRIBUTE__ANNOTATION:
				return basicSetAnnotation(null, msgs);
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
			case WSDL1_1Package.ANY_ATTRIBUTE__NAMESPACE:
				return getNamespace();
			case WSDL1_1Package.ANY_ATTRIBUTE__PROCESS_CONTENTS:
				return getProcessContents();
			case WSDL1_1Package.ANY_ATTRIBUTE__ID:
				return getId();
			case WSDL1_1Package.ANY_ATTRIBUTE__ANNOTATION:
				return getAnnotation();
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
			case WSDL1_1Package.ANY_ATTRIBUTE__NAMESPACE:
				setNamespace((String)newValue);
				return;
			case WSDL1_1Package.ANY_ATTRIBUTE__PROCESS_CONTENTS:
				setProcessContents((processContentsValue)newValue);
				return;
			case WSDL1_1Package.ANY_ATTRIBUTE__ID:
				setId((String)newValue);
				return;
			case WSDL1_1Package.ANY_ATTRIBUTE__ANNOTATION:
				setAnnotation((Annotation)newValue);
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
			case WSDL1_1Package.ANY_ATTRIBUTE__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case WSDL1_1Package.ANY_ATTRIBUTE__PROCESS_CONTENTS:
				setProcessContents(PROCESS_CONTENTS_EDEFAULT);
				return;
			case WSDL1_1Package.ANY_ATTRIBUTE__ID:
				setId(ID_EDEFAULT);
				return;
			case WSDL1_1Package.ANY_ATTRIBUTE__ANNOTATION:
				setAnnotation((Annotation)null);
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
			case WSDL1_1Package.ANY_ATTRIBUTE__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
			case WSDL1_1Package.ANY_ATTRIBUTE__PROCESS_CONTENTS:
				return processContents != PROCESS_CONTENTS_EDEFAULT;
			case WSDL1_1Package.ANY_ATTRIBUTE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case WSDL1_1Package.ANY_ATTRIBUTE__ANNOTATION:
				return annotation != null;
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
		result.append(" (namespace: ");
		result.append(namespace);
		result.append(", processContents: ");
		result.append(processContents);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //AnyAttributeImpl
