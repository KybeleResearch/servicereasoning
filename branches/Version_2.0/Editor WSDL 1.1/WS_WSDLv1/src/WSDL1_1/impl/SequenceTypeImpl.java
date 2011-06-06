/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL1_1.impl;

import WSDL1_1.Annotation;
import WSDL1_1.Any;
import WSDL1_1.Choice;
import WSDL1_1.Element;
import WSDL1_1.Group;
import WSDL1_1.SequenceType;
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
 * An implementation of the model object '<em><b>Sequence Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WSDL1_1.impl.SequenceTypeImpl#getMinOccurs <em>Min Occurs</em>}</li>
 *   <li>{@link WSDL1_1.impl.SequenceTypeImpl#getMaxOccurs <em>Max Occurs</em>}</li>
 *   <li>{@link WSDL1_1.impl.SequenceTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link WSDL1_1.impl.SequenceTypeImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link WSDL1_1.impl.SequenceTypeImpl#getElement <em>Element</em>}</li>
 *   <li>{@link WSDL1_1.impl.SequenceTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link WSDL1_1.impl.SequenceTypeImpl#getChoice <em>Choice</em>}</li>
 *   <li>{@link WSDL1_1.impl.SequenceTypeImpl#getSequenceDef <em>Sequence Def</em>}</li>
 *   <li>{@link WSDL1_1.impl.SequenceTypeImpl#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceTypeImpl extends EObjectImpl implements SequenceType {
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
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> element;

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
	 * The cached value of the '{@link #getChoice() <em>Choice</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoice()
	 * @generated
	 * @ordered
	 */
	protected EList<Choice> choice;

	/**
	 * The cached value of the '{@link #getSequenceDef() <em>Sequence Def</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceDef()
	 * @generated
	 * @ordered
	 */
	protected EList<SequenceType> sequenceDef;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected EList<Any> any;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WSDL1_1Package.eINSTANCE.getSequenceType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.SEQUENCE_TYPE__MIN_OCCURS, oldMinOccurs, minOccurs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.SEQUENCE_TYPE__MAX_OCCURS, oldMaxOccurs, maxOccurs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.SEQUENCE_TYPE__ID, oldId, id));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL1_1Package.SEQUENCE_TYPE__ANNOTATION, oldAnnotation, newAnnotation);
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
				msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.SEQUENCE_TYPE__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.SEQUENCE_TYPE__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.SEQUENCE_TYPE__ANNOTATION, newAnnotation, newAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getElement() {
		if (element == null) {
			element = new EObjectContainmentEList<Element>(Element.class, this, WSDL1_1Package.SEQUENCE_TYPE__ELEMENT);
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getGroup() {
		if (group == null) {
			group = new EObjectContainmentEList<Group>(Group.class, this, WSDL1_1Package.SEQUENCE_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Choice> getChoice() {
		if (choice == null) {
			choice = new EObjectContainmentEList<Choice>(Choice.class, this, WSDL1_1Package.SEQUENCE_TYPE__CHOICE);
		}
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceType> getSequenceDef() {
		if (sequenceDef == null) {
			sequenceDef = new EObjectContainmentEList<SequenceType>(SequenceType.class, this, WSDL1_1Package.SEQUENCE_TYPE__SEQUENCE_DEF);
		}
		return sequenceDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Any> getAny() {
		if (any == null) {
			any = new EObjectContainmentEList<Any>(Any.class, this, WSDL1_1Package.SEQUENCE_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WSDL1_1Package.SEQUENCE_TYPE__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case WSDL1_1Package.SEQUENCE_TYPE__ELEMENT:
				return ((InternalEList<?>)getElement()).basicRemove(otherEnd, msgs);
			case WSDL1_1Package.SEQUENCE_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case WSDL1_1Package.SEQUENCE_TYPE__CHOICE:
				return ((InternalEList<?>)getChoice()).basicRemove(otherEnd, msgs);
			case WSDL1_1Package.SEQUENCE_TYPE__SEQUENCE_DEF:
				return ((InternalEList<?>)getSequenceDef()).basicRemove(otherEnd, msgs);
			case WSDL1_1Package.SEQUENCE_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case WSDL1_1Package.SEQUENCE_TYPE__MIN_OCCURS:
				return getMinOccurs();
			case WSDL1_1Package.SEQUENCE_TYPE__MAX_OCCURS:
				return getMaxOccurs();
			case WSDL1_1Package.SEQUENCE_TYPE__ID:
				return getId();
			case WSDL1_1Package.SEQUENCE_TYPE__ANNOTATION:
				return getAnnotation();
			case WSDL1_1Package.SEQUENCE_TYPE__ELEMENT:
				return getElement();
			case WSDL1_1Package.SEQUENCE_TYPE__GROUP:
				return getGroup();
			case WSDL1_1Package.SEQUENCE_TYPE__CHOICE:
				return getChoice();
			case WSDL1_1Package.SEQUENCE_TYPE__SEQUENCE_DEF:
				return getSequenceDef();
			case WSDL1_1Package.SEQUENCE_TYPE__ANY:
				return getAny();
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
			case WSDL1_1Package.SEQUENCE_TYPE__MIN_OCCURS:
				setMinOccurs((Integer)newValue);
				return;
			case WSDL1_1Package.SEQUENCE_TYPE__MAX_OCCURS:
				setMaxOccurs((String)newValue);
				return;
			case WSDL1_1Package.SEQUENCE_TYPE__ID:
				setId((String)newValue);
				return;
			case WSDL1_1Package.SEQUENCE_TYPE__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case WSDL1_1Package.SEQUENCE_TYPE__ELEMENT:
				getElement().clear();
				getElement().addAll((Collection<? extends Element>)newValue);
				return;
			case WSDL1_1Package.SEQUENCE_TYPE__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection<? extends Group>)newValue);
				return;
			case WSDL1_1Package.SEQUENCE_TYPE__CHOICE:
				getChoice().clear();
				getChoice().addAll((Collection<? extends Choice>)newValue);
				return;
			case WSDL1_1Package.SEQUENCE_TYPE__SEQUENCE_DEF:
				getSequenceDef().clear();
				getSequenceDef().addAll((Collection<? extends SequenceType>)newValue);
				return;
			case WSDL1_1Package.SEQUENCE_TYPE__ANY:
				getAny().clear();
				getAny().addAll((Collection<? extends Any>)newValue);
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
			case WSDL1_1Package.SEQUENCE_TYPE__MIN_OCCURS:
				setMinOccurs(MIN_OCCURS_EDEFAULT);
				return;
			case WSDL1_1Package.SEQUENCE_TYPE__MAX_OCCURS:
				setMaxOccurs(MAX_OCCURS_EDEFAULT);
				return;
			case WSDL1_1Package.SEQUENCE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case WSDL1_1Package.SEQUENCE_TYPE__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case WSDL1_1Package.SEQUENCE_TYPE__ELEMENT:
				getElement().clear();
				return;
			case WSDL1_1Package.SEQUENCE_TYPE__GROUP:
				getGroup().clear();
				return;
			case WSDL1_1Package.SEQUENCE_TYPE__CHOICE:
				getChoice().clear();
				return;
			case WSDL1_1Package.SEQUENCE_TYPE__SEQUENCE_DEF:
				getSequenceDef().clear();
				return;
			case WSDL1_1Package.SEQUENCE_TYPE__ANY:
				getAny().clear();
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
			case WSDL1_1Package.SEQUENCE_TYPE__MIN_OCCURS:
				return MIN_OCCURS_EDEFAULT == null ? minOccurs != null : !MIN_OCCURS_EDEFAULT.equals(minOccurs);
			case WSDL1_1Package.SEQUENCE_TYPE__MAX_OCCURS:
				return MAX_OCCURS_EDEFAULT == null ? maxOccurs != null : !MAX_OCCURS_EDEFAULT.equals(maxOccurs);
			case WSDL1_1Package.SEQUENCE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case WSDL1_1Package.SEQUENCE_TYPE__ANNOTATION:
				return annotation != null;
			case WSDL1_1Package.SEQUENCE_TYPE__ELEMENT:
				return element != null && !element.isEmpty();
			case WSDL1_1Package.SEQUENCE_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case WSDL1_1Package.SEQUENCE_TYPE__CHOICE:
				return choice != null && !choice.isEmpty();
			case WSDL1_1Package.SEQUENCE_TYPE__SEQUENCE_DEF:
				return sequenceDef != null && !sequenceDef.isEmpty();
			case WSDL1_1Package.SEQUENCE_TYPE__ANY:
				return any != null && !any.isEmpty();
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
		result.append(" (minOccurs: ");
		result.append(minOccurs);
		result.append(", maxOccurs: ");
		result.append(maxOccurs);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //SequenceTypeImpl
