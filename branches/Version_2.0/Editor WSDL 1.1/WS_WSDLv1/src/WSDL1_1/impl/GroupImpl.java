/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL1_1.impl;

import WSDL1_1.All;
import WSDL1_1.Annotation;
import WSDL1_1.Choice;
import WSDL1_1.Group;
import WSDL1_1.SequenceType;
import WSDL1_1.WSDL1_1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WSDL1_1.impl.GroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link WSDL1_1.impl.GroupImpl#getMinOccurs <em>Min Occurs</em>}</li>
 *   <li>{@link WSDL1_1.impl.GroupImpl#getMaxOccurs <em>Max Occurs</em>}</li>
 *   <li>{@link WSDL1_1.impl.GroupImpl#getId <em>Id</em>}</li>
 *   <li>{@link WSDL1_1.impl.GroupImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link WSDL1_1.impl.GroupImpl#getAll <em>All</em>}</li>
 *   <li>{@link WSDL1_1.impl.GroupImpl#getChoice <em>Choice</em>}</li>
 *   <li>{@link WSDL1_1.impl.GroupImpl#getSequenceDef <em>Sequence Def</em>}</li>
 *   <li>{@link WSDL1_1.impl.GroupImpl#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupImpl extends EObjectImpl implements Group {
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
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected Group ref;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WSDL1_1Package.eINSTANCE.getGroup();
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.GROUP__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.GROUP__MIN_OCCURS, oldMinOccurs, minOccurs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.GROUP__MAX_OCCURS, oldMaxOccurs, maxOccurs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.GROUP__ID, oldId, id));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL1_1Package.GROUP__ANNOTATION, oldAnnotation, newAnnotation);
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
				msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.GROUP__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.GROUP__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.GROUP__ANNOTATION, newAnnotation, newAnnotation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL1_1Package.GROUP__ALL, oldAll, newAll);
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
				msgs = ((InternalEObject)all).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.GROUP__ALL, null, msgs);
			if (newAll != null)
				msgs = ((InternalEObject)newAll).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.GROUP__ALL, null, msgs);
			msgs = basicSetAll(newAll, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.GROUP__ALL, newAll, newAll));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL1_1Package.GROUP__CHOICE, oldChoice, newChoice);
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
				msgs = ((InternalEObject)choice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.GROUP__CHOICE, null, msgs);
			if (newChoice != null)
				msgs = ((InternalEObject)newChoice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.GROUP__CHOICE, null, msgs);
			msgs = basicSetChoice(newChoice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.GROUP__CHOICE, newChoice, newChoice));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL1_1Package.GROUP__SEQUENCE_DEF, oldSequenceDef, newSequenceDef);
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
				msgs = ((InternalEObject)sequenceDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.GROUP__SEQUENCE_DEF, null, msgs);
			if (newSequenceDef != null)
				msgs = ((InternalEObject)newSequenceDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.GROUP__SEQUENCE_DEF, null, msgs);
			msgs = basicSetSequenceDef(newSequenceDef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.GROUP__SEQUENCE_DEF, newSequenceDef, newSequenceDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group getRef() {
		if (ref != null && ref.eIsProxy()) {
			InternalEObject oldRef = (InternalEObject)ref;
			ref = (Group)eResolveProxy(oldRef);
			if (ref != oldRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WSDL1_1Package.GROUP__REF, oldRef, ref));
			}
		}
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group basicGetRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(Group newRef) {
		Group oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.GROUP__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WSDL1_1Package.GROUP__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case WSDL1_1Package.GROUP__ALL:
				return basicSetAll(null, msgs);
			case WSDL1_1Package.GROUP__CHOICE:
				return basicSetChoice(null, msgs);
			case WSDL1_1Package.GROUP__SEQUENCE_DEF:
				return basicSetSequenceDef(null, msgs);
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
			case WSDL1_1Package.GROUP__NAME:
				return getName();
			case WSDL1_1Package.GROUP__MIN_OCCURS:
				return getMinOccurs();
			case WSDL1_1Package.GROUP__MAX_OCCURS:
				return getMaxOccurs();
			case WSDL1_1Package.GROUP__ID:
				return getId();
			case WSDL1_1Package.GROUP__ANNOTATION:
				return getAnnotation();
			case WSDL1_1Package.GROUP__ALL:
				return getAll();
			case WSDL1_1Package.GROUP__CHOICE:
				return getChoice();
			case WSDL1_1Package.GROUP__SEQUENCE_DEF:
				return getSequenceDef();
			case WSDL1_1Package.GROUP__REF:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WSDL1_1Package.GROUP__NAME:
				setName((String)newValue);
				return;
			case WSDL1_1Package.GROUP__MIN_OCCURS:
				setMinOccurs((Integer)newValue);
				return;
			case WSDL1_1Package.GROUP__MAX_OCCURS:
				setMaxOccurs((String)newValue);
				return;
			case WSDL1_1Package.GROUP__ID:
				setId((String)newValue);
				return;
			case WSDL1_1Package.GROUP__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case WSDL1_1Package.GROUP__ALL:
				setAll((All)newValue);
				return;
			case WSDL1_1Package.GROUP__CHOICE:
				setChoice((Choice)newValue);
				return;
			case WSDL1_1Package.GROUP__SEQUENCE_DEF:
				setSequenceDef((SequenceType)newValue);
				return;
			case WSDL1_1Package.GROUP__REF:
				setRef((Group)newValue);
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
			case WSDL1_1Package.GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WSDL1_1Package.GROUP__MIN_OCCURS:
				setMinOccurs(MIN_OCCURS_EDEFAULT);
				return;
			case WSDL1_1Package.GROUP__MAX_OCCURS:
				setMaxOccurs(MAX_OCCURS_EDEFAULT);
				return;
			case WSDL1_1Package.GROUP__ID:
				setId(ID_EDEFAULT);
				return;
			case WSDL1_1Package.GROUP__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case WSDL1_1Package.GROUP__ALL:
				setAll((All)null);
				return;
			case WSDL1_1Package.GROUP__CHOICE:
				setChoice((Choice)null);
				return;
			case WSDL1_1Package.GROUP__SEQUENCE_DEF:
				setSequenceDef((SequenceType)null);
				return;
			case WSDL1_1Package.GROUP__REF:
				setRef((Group)null);
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
			case WSDL1_1Package.GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WSDL1_1Package.GROUP__MIN_OCCURS:
				return MIN_OCCURS_EDEFAULT == null ? minOccurs != null : !MIN_OCCURS_EDEFAULT.equals(minOccurs);
			case WSDL1_1Package.GROUP__MAX_OCCURS:
				return MAX_OCCURS_EDEFAULT == null ? maxOccurs != null : !MAX_OCCURS_EDEFAULT.equals(maxOccurs);
			case WSDL1_1Package.GROUP__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case WSDL1_1Package.GROUP__ANNOTATION:
				return annotation != null;
			case WSDL1_1Package.GROUP__ALL:
				return all != null;
			case WSDL1_1Package.GROUP__CHOICE:
				return choice != null;
			case WSDL1_1Package.GROUP__SEQUENCE_DEF:
				return sequenceDef != null;
			case WSDL1_1Package.GROUP__REF:
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
		result.append(", minOccurs: ");
		result.append(minOccurs);
		result.append(", maxOccurs: ");
		result.append(maxOccurs);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //GroupImpl
