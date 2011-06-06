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
import WSDL2_0.Enumeration;
import WSDL2_0.FractionDigits;
import WSDL2_0.Group;
import WSDL2_0.Length;
import WSDL2_0.MaxExclusive;
import WSDL2_0.MaxInclusive;
import WSDL2_0.MaxLength;
import WSDL2_0.MinExclusive;
import WSDL2_0.MinInclusive;
import WSDL2_0.MinLength;
import WSDL2_0.Pattern;
import WSDL2_0.Restriction;
import WSDL2_0.SequenceType;
import WSDL2_0.SimpleType;
import WSDL2_0.TotalDigits;
import WSDL2_0.TypeRef;
import WSDL2_0.WSDL2_0Package;
import WSDL2_0.WhiteSpace;

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
 * An implementation of the model object '<em><b>Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WSDL2_0.impl.RestrictionImpl#getId <em>Id</em>}</li>
 *   <li>{@link WSDL2_0.impl.RestrictionImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link WSDL2_0.impl.RestrictionImpl#getAll <em>All</em>}</li>
 *   <li>{@link WSDL2_0.impl.RestrictionImpl#getChoice <em>Choice</em>}</li>
 *   <li>{@link WSDL2_0.impl.RestrictionImpl#getSequenceDef <em>Sequence Def</em>}</li>
 *   <li>{@link WSDL2_0.impl.RestrictionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link WSDL2_0.impl.RestrictionImpl#getSimpleType <em>Simple Type</em>}</li>
 *   <li>{@link WSDL2_0.impl.RestrictionImpl#getMinExclusive <em>Min Exclusive</em>}</li>
 *   <li>{@link WSDL2_0.impl.RestrictionImpl#getMinInclusive <em>Min Inclusive</em>}</li>
 *   <li>{@link WSDL2_0.impl.RestrictionImpl#getMaxExclusive <em>Max Exclusive</em>}</li>
 *   <li>{@link WSDL2_0.impl.RestrictionImpl#getMaxInclusive <em>Max Inclusive</em>}</li>
 *   <li>{@link WSDL2_0.impl.RestrictionImpl#getTotalDigits <em>Total Digits</em>}</li>
 *   <li>{@link WSDL2_0.impl.RestrictionImpl#getFractionDigits <em>Fraction Digits</em>}</li>
 *   <li>{@link WSDL2_0.impl.RestrictionImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link WSDL2_0.impl.RestrictionImpl#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link WSDL2_0.impl.RestrictionImpl#getWhiteSpace <em>White Space</em>}</li>
 *   <li>{@link WSDL2_0.impl.RestrictionImpl#getLength <em>Length</em>}</li>
 *   <li>{@link WSDL2_0.impl.RestrictionImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link WSDL2_0.impl.RestrictionImpl#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link WSDL2_0.impl.RestrictionImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link WSDL2_0.impl.RestrictionImpl#getAttributeGroup <em>Attribute Group</em>}</li>
 *   <li>{@link WSDL2_0.impl.RestrictionImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 *   <li>{@link WSDL2_0.impl.RestrictionImpl#getBase <em>Base</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RestrictionImpl extends AdicionalInformationTypeImpl implements Restriction {
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
	 * The cached value of the '{@link #getSimpleType() <em>Simple Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleType()
	 * @generated
	 * @ordered
	 */
	protected SimpleType simpleType;

	/**
	 * The cached value of the '{@link #getMinExclusive() <em>Min Exclusive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinExclusive()
	 * @generated
	 * @ordered
	 */
	protected MinExclusive minExclusive;

	/**
	 * The cached value of the '{@link #getMinInclusive() <em>Min Inclusive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinInclusive()
	 * @generated
	 * @ordered
	 */
	protected MinInclusive minInclusive;

	/**
	 * The cached value of the '{@link #getMaxExclusive() <em>Max Exclusive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxExclusive()
	 * @generated
	 * @ordered
	 */
	protected MaxExclusive maxExclusive;

	/**
	 * The cached value of the '{@link #getMaxInclusive() <em>Max Inclusive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInclusive()
	 * @generated
	 * @ordered
	 */
	protected MaxInclusive maxInclusive;

	/**
	 * The cached value of the '{@link #getTotalDigits() <em>Total Digits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalDigits()
	 * @generated
	 * @ordered
	 */
	protected TotalDigits totalDigits;

	/**
	 * The cached value of the '{@link #getFractionDigits() <em>Fraction Digits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFractionDigits()
	 * @generated
	 * @ordered
	 */
	protected FractionDigits fractionDigits;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected Pattern pattern;

	/**
	 * The cached value of the '{@link #getEnumeration() <em>Enumeration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumeration()
	 * @generated
	 * @ordered
	 */
	protected Enumeration enumeration;

	/**
	 * The cached value of the '{@link #getWhiteSpace() <em>White Space</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhiteSpace()
	 * @generated
	 * @ordered
	 */
	protected WhiteSpace whiteSpace;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected Length length;

	/**
	 * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected MaxLength maxLength;

	/**
	 * The cached value of the '{@link #getMinLength() <em>Min Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLength()
	 * @generated
	 * @ordered
	 */
	protected MinLength minLength;

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
	protected RestrictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WSDL2_0Package.eINSTANCE.getRestriction();
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__ID, oldId, id));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__ANNOTATION, oldAnnotation, newAnnotation);
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
				msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.RESTRICTION__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.RESTRICTION__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__ANNOTATION, newAnnotation, newAnnotation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__ALL, oldAll, newAll);
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
				msgs = ((InternalEObject)all).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.RESTRICTION__ALL, null, msgs);
			if (newAll != null)
				msgs = ((InternalEObject)newAll).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.RESTRICTION__ALL, null, msgs);
			msgs = basicSetAll(newAll, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__ALL, newAll, newAll));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__CHOICE, oldChoice, newChoice);
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
				msgs = ((InternalEObject)choice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.RESTRICTION__CHOICE, null, msgs);
			if (newChoice != null)
				msgs = ((InternalEObject)newChoice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.RESTRICTION__CHOICE, null, msgs);
			msgs = basicSetChoice(newChoice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__CHOICE, newChoice, newChoice));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__SEQUENCE_DEF, oldSequenceDef, newSequenceDef);
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
				msgs = ((InternalEObject)sequenceDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.RESTRICTION__SEQUENCE_DEF, null, msgs);
			if (newSequenceDef != null)
				msgs = ((InternalEObject)newSequenceDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.RESTRICTION__SEQUENCE_DEF, null, msgs);
			msgs = basicSetSequenceDef(newSequenceDef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__SEQUENCE_DEF, newSequenceDef, newSequenceDef));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__GROUP, oldGroup, newGroup);
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
				msgs = ((InternalEObject)group).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.RESTRICTION__GROUP, null, msgs);
			if (newGroup != null)
				msgs = ((InternalEObject)newGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.RESTRICTION__GROUP, null, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__GROUP, newGroup, newGroup));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__SIMPLE_TYPE, oldSimpleType, newSimpleType);
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
				msgs = ((InternalEObject)simpleType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.RESTRICTION__SIMPLE_TYPE, null, msgs);
			if (newSimpleType != null)
				msgs = ((InternalEObject)newSimpleType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.RESTRICTION__SIMPLE_TYPE, null, msgs);
			msgs = basicSetSimpleType(newSimpleType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__SIMPLE_TYPE, newSimpleType, newSimpleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinExclusive getMinExclusive() {
		return minExclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinExclusive(MinExclusive newMinExclusive, NotificationChain msgs) {
		MinExclusive oldMinExclusive = minExclusive;
		minExclusive = newMinExclusive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__MIN_EXCLUSIVE, oldMinExclusive, newMinExclusive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinExclusive(MinExclusive newMinExclusive) {
		if (newMinExclusive != minExclusive) {
			NotificationChain msgs = null;
			if (minExclusive != null)
				msgs = ((InternalEObject)minExclusive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.RESTRICTION__MIN_EXCLUSIVE, null, msgs);
			if (newMinExclusive != null)
				msgs = ((InternalEObject)newMinExclusive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.RESTRICTION__MIN_EXCLUSIVE, null, msgs);
			msgs = basicSetMinExclusive(newMinExclusive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__MIN_EXCLUSIVE, newMinExclusive, newMinExclusive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinInclusive getMinInclusive() {
		return minInclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinInclusive(MinInclusive newMinInclusive, NotificationChain msgs) {
		MinInclusive oldMinInclusive = minInclusive;
		minInclusive = newMinInclusive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__MIN_INCLUSIVE, oldMinInclusive, newMinInclusive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinInclusive(MinInclusive newMinInclusive) {
		if (newMinInclusive != minInclusive) {
			NotificationChain msgs = null;
			if (minInclusive != null)
				msgs = ((InternalEObject)minInclusive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.RESTRICTION__MIN_INCLUSIVE, null, msgs);
			if (newMinInclusive != null)
				msgs = ((InternalEObject)newMinInclusive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.RESTRICTION__MIN_INCLUSIVE, null, msgs);
			msgs = basicSetMinInclusive(newMinInclusive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__MIN_INCLUSIVE, newMinInclusive, newMinInclusive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxExclusive getMaxExclusive() {
		return maxExclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxExclusive(MaxExclusive newMaxExclusive, NotificationChain msgs) {
		MaxExclusive oldMaxExclusive = maxExclusive;
		maxExclusive = newMaxExclusive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__MAX_EXCLUSIVE, oldMaxExclusive, newMaxExclusive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxExclusive(MaxExclusive newMaxExclusive) {
		if (newMaxExclusive != maxExclusive) {
			NotificationChain msgs = null;
			if (maxExclusive != null)
				msgs = ((InternalEObject)maxExclusive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.RESTRICTION__MAX_EXCLUSIVE, null, msgs);
			if (newMaxExclusive != null)
				msgs = ((InternalEObject)newMaxExclusive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.RESTRICTION__MAX_EXCLUSIVE, null, msgs);
			msgs = basicSetMaxExclusive(newMaxExclusive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__MAX_EXCLUSIVE, newMaxExclusive, newMaxExclusive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxInclusive getMaxInclusive() {
		return maxInclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxInclusive(MaxInclusive newMaxInclusive, NotificationChain msgs) {
		MaxInclusive oldMaxInclusive = maxInclusive;
		maxInclusive = newMaxInclusive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__MAX_INCLUSIVE, oldMaxInclusive, newMaxInclusive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxInclusive(MaxInclusive newMaxInclusive) {
		if (newMaxInclusive != maxInclusive) {
			NotificationChain msgs = null;
			if (maxInclusive != null)
				msgs = ((InternalEObject)maxInclusive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.RESTRICTION__MAX_INCLUSIVE, null, msgs);
			if (newMaxInclusive != null)
				msgs = ((InternalEObject)newMaxInclusive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.RESTRICTION__MAX_INCLUSIVE, null, msgs);
			msgs = basicSetMaxInclusive(newMaxInclusive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__MAX_INCLUSIVE, newMaxInclusive, newMaxInclusive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalDigits getTotalDigits() {
		return totalDigits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTotalDigits(TotalDigits newTotalDigits, NotificationChain msgs) {
		TotalDigits oldTotalDigits = totalDigits;
		totalDigits = newTotalDigits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__TOTAL_DIGITS, oldTotalDigits, newTotalDigits);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalDigits(TotalDigits newTotalDigits) {
		if (newTotalDigits != totalDigits) {
			NotificationChain msgs = null;
			if (totalDigits != null)
				msgs = ((InternalEObject)totalDigits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.RESTRICTION__TOTAL_DIGITS, null, msgs);
			if (newTotalDigits != null)
				msgs = ((InternalEObject)newTotalDigits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.RESTRICTION__TOTAL_DIGITS, null, msgs);
			msgs = basicSetTotalDigits(newTotalDigits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__TOTAL_DIGITS, newTotalDigits, newTotalDigits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FractionDigits getFractionDigits() {
		return fractionDigits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFractionDigits(FractionDigits newFractionDigits, NotificationChain msgs) {
		FractionDigits oldFractionDigits = fractionDigits;
		fractionDigits = newFractionDigits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__FRACTION_DIGITS, oldFractionDigits, newFractionDigits);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFractionDigits(FractionDigits newFractionDigits) {
		if (newFractionDigits != fractionDigits) {
			NotificationChain msgs = null;
			if (fractionDigits != null)
				msgs = ((InternalEObject)fractionDigits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.RESTRICTION__FRACTION_DIGITS, null, msgs);
			if (newFractionDigits != null)
				msgs = ((InternalEObject)newFractionDigits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.RESTRICTION__FRACTION_DIGITS, null, msgs);
			msgs = basicSetFractionDigits(newFractionDigits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__FRACTION_DIGITS, newFractionDigits, newFractionDigits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPattern(Pattern newPattern, NotificationChain msgs) {
		Pattern oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__PATTERN, oldPattern, newPattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(Pattern newPattern) {
		if (newPattern != pattern) {
			NotificationChain msgs = null;
			if (pattern != null)
				msgs = ((InternalEObject)pattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.RESTRICTION__PATTERN, null, msgs);
			if (newPattern != null)
				msgs = ((InternalEObject)newPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.RESTRICTION__PATTERN, null, msgs);
			msgs = basicSetPattern(newPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__PATTERN, newPattern, newPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration getEnumeration() {
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnumeration(Enumeration newEnumeration, NotificationChain msgs) {
		Enumeration oldEnumeration = enumeration;
		enumeration = newEnumeration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__ENUMERATION, oldEnumeration, newEnumeration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumeration(Enumeration newEnumeration) {
		if (newEnumeration != enumeration) {
			NotificationChain msgs = null;
			if (enumeration != null)
				msgs = ((InternalEObject)enumeration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.RESTRICTION__ENUMERATION, null, msgs);
			if (newEnumeration != null)
				msgs = ((InternalEObject)newEnumeration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.RESTRICTION__ENUMERATION, null, msgs);
			msgs = basicSetEnumeration(newEnumeration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__ENUMERATION, newEnumeration, newEnumeration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhiteSpace getWhiteSpace() {
		return whiteSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhiteSpace(WhiteSpace newWhiteSpace, NotificationChain msgs) {
		WhiteSpace oldWhiteSpace = whiteSpace;
		whiteSpace = newWhiteSpace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__WHITE_SPACE, oldWhiteSpace, newWhiteSpace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhiteSpace(WhiteSpace newWhiteSpace) {
		if (newWhiteSpace != whiteSpace) {
			NotificationChain msgs = null;
			if (whiteSpace != null)
				msgs = ((InternalEObject)whiteSpace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.RESTRICTION__WHITE_SPACE, null, msgs);
			if (newWhiteSpace != null)
				msgs = ((InternalEObject)newWhiteSpace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.RESTRICTION__WHITE_SPACE, null, msgs);
			msgs = basicSetWhiteSpace(newWhiteSpace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__WHITE_SPACE, newWhiteSpace, newWhiteSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Length getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLength(Length newLength, NotificationChain msgs) {
		Length oldLength = length;
		length = newLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__LENGTH, oldLength, newLength);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(Length newLength) {
		if (newLength != length) {
			NotificationChain msgs = null;
			if (length != null)
				msgs = ((InternalEObject)length).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.RESTRICTION__LENGTH, null, msgs);
			if (newLength != null)
				msgs = ((InternalEObject)newLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.RESTRICTION__LENGTH, null, msgs);
			msgs = basicSetLength(newLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__LENGTH, newLength, newLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxLength getMaxLength() {
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxLength(MaxLength newMaxLength, NotificationChain msgs) {
		MaxLength oldMaxLength = maxLength;
		maxLength = newMaxLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__MAX_LENGTH, oldMaxLength, newMaxLength);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLength(MaxLength newMaxLength) {
		if (newMaxLength != maxLength) {
			NotificationChain msgs = null;
			if (maxLength != null)
				msgs = ((InternalEObject)maxLength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.RESTRICTION__MAX_LENGTH, null, msgs);
			if (newMaxLength != null)
				msgs = ((InternalEObject)newMaxLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.RESTRICTION__MAX_LENGTH, null, msgs);
			msgs = basicSetMaxLength(newMaxLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__MAX_LENGTH, newMaxLength, newMaxLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinLength getMinLength() {
		return minLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinLength(MinLength newMinLength, NotificationChain msgs) {
		MinLength oldMinLength = minLength;
		minLength = newMinLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__MIN_LENGTH, oldMinLength, newMinLength);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinLength(MinLength newMinLength) {
		if (newMinLength != minLength) {
			NotificationChain msgs = null;
			if (minLength != null)
				msgs = ((InternalEObject)minLength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.RESTRICTION__MIN_LENGTH, null, msgs);
			if (newMinLength != null)
				msgs = ((InternalEObject)newMinLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.RESTRICTION__MIN_LENGTH, null, msgs);
			msgs = basicSetMinLength(newMinLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__MIN_LENGTH, newMinLength, newMinLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, WSDL2_0Package.RESTRICTION__ATTRIBUTE);
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
			attributeGroup = new EObjectContainmentEList<AttributeGroup>(AttributeGroup.class, this, WSDL2_0Package.RESTRICTION__ATTRIBUTE_GROUP);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__ANY_ATTRIBUTE, oldAnyAttribute, newAnyAttribute);
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
				msgs = ((InternalEObject)anyAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.RESTRICTION__ANY_ATTRIBUTE, null, msgs);
			if (newAnyAttribute != null)
				msgs = ((InternalEObject)newAnyAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.RESTRICTION__ANY_ATTRIBUTE, null, msgs);
			msgs = basicSetAnyAttribute(newAnyAttribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__ANY_ATTRIBUTE, newAnyAttribute, newAnyAttribute));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WSDL2_0Package.RESTRICTION__BASE, oldBase, base));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.RESTRICTION__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WSDL2_0Package.RESTRICTION__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case WSDL2_0Package.RESTRICTION__ALL:
				return basicSetAll(null, msgs);
			case WSDL2_0Package.RESTRICTION__CHOICE:
				return basicSetChoice(null, msgs);
			case WSDL2_0Package.RESTRICTION__SEQUENCE_DEF:
				return basicSetSequenceDef(null, msgs);
			case WSDL2_0Package.RESTRICTION__GROUP:
				return basicSetGroup(null, msgs);
			case WSDL2_0Package.RESTRICTION__SIMPLE_TYPE:
				return basicSetSimpleType(null, msgs);
			case WSDL2_0Package.RESTRICTION__MIN_EXCLUSIVE:
				return basicSetMinExclusive(null, msgs);
			case WSDL2_0Package.RESTRICTION__MIN_INCLUSIVE:
				return basicSetMinInclusive(null, msgs);
			case WSDL2_0Package.RESTRICTION__MAX_EXCLUSIVE:
				return basicSetMaxExclusive(null, msgs);
			case WSDL2_0Package.RESTRICTION__MAX_INCLUSIVE:
				return basicSetMaxInclusive(null, msgs);
			case WSDL2_0Package.RESTRICTION__TOTAL_DIGITS:
				return basicSetTotalDigits(null, msgs);
			case WSDL2_0Package.RESTRICTION__FRACTION_DIGITS:
				return basicSetFractionDigits(null, msgs);
			case WSDL2_0Package.RESTRICTION__PATTERN:
				return basicSetPattern(null, msgs);
			case WSDL2_0Package.RESTRICTION__ENUMERATION:
				return basicSetEnumeration(null, msgs);
			case WSDL2_0Package.RESTRICTION__WHITE_SPACE:
				return basicSetWhiteSpace(null, msgs);
			case WSDL2_0Package.RESTRICTION__LENGTH:
				return basicSetLength(null, msgs);
			case WSDL2_0Package.RESTRICTION__MAX_LENGTH:
				return basicSetMaxLength(null, msgs);
			case WSDL2_0Package.RESTRICTION__MIN_LENGTH:
				return basicSetMinLength(null, msgs);
			case WSDL2_0Package.RESTRICTION__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case WSDL2_0Package.RESTRICTION__ATTRIBUTE_GROUP:
				return ((InternalEList<?>)getAttributeGroup()).basicRemove(otherEnd, msgs);
			case WSDL2_0Package.RESTRICTION__ANY_ATTRIBUTE:
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
			case WSDL2_0Package.RESTRICTION__ID:
				return getId();
			case WSDL2_0Package.RESTRICTION__ANNOTATION:
				return getAnnotation();
			case WSDL2_0Package.RESTRICTION__ALL:
				return getAll();
			case WSDL2_0Package.RESTRICTION__CHOICE:
				return getChoice();
			case WSDL2_0Package.RESTRICTION__SEQUENCE_DEF:
				return getSequenceDef();
			case WSDL2_0Package.RESTRICTION__GROUP:
				return getGroup();
			case WSDL2_0Package.RESTRICTION__SIMPLE_TYPE:
				return getSimpleType();
			case WSDL2_0Package.RESTRICTION__MIN_EXCLUSIVE:
				return getMinExclusive();
			case WSDL2_0Package.RESTRICTION__MIN_INCLUSIVE:
				return getMinInclusive();
			case WSDL2_0Package.RESTRICTION__MAX_EXCLUSIVE:
				return getMaxExclusive();
			case WSDL2_0Package.RESTRICTION__MAX_INCLUSIVE:
				return getMaxInclusive();
			case WSDL2_0Package.RESTRICTION__TOTAL_DIGITS:
				return getTotalDigits();
			case WSDL2_0Package.RESTRICTION__FRACTION_DIGITS:
				return getFractionDigits();
			case WSDL2_0Package.RESTRICTION__PATTERN:
				return getPattern();
			case WSDL2_0Package.RESTRICTION__ENUMERATION:
				return getEnumeration();
			case WSDL2_0Package.RESTRICTION__WHITE_SPACE:
				return getWhiteSpace();
			case WSDL2_0Package.RESTRICTION__LENGTH:
				return getLength();
			case WSDL2_0Package.RESTRICTION__MAX_LENGTH:
				return getMaxLength();
			case WSDL2_0Package.RESTRICTION__MIN_LENGTH:
				return getMinLength();
			case WSDL2_0Package.RESTRICTION__ATTRIBUTE:
				return getAttribute();
			case WSDL2_0Package.RESTRICTION__ATTRIBUTE_GROUP:
				return getAttributeGroup();
			case WSDL2_0Package.RESTRICTION__ANY_ATTRIBUTE:
				return getAnyAttribute();
			case WSDL2_0Package.RESTRICTION__BASE:
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
			case WSDL2_0Package.RESTRICTION__ID:
				setId((String)newValue);
				return;
			case WSDL2_0Package.RESTRICTION__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case WSDL2_0Package.RESTRICTION__ALL:
				setAll((All)newValue);
				return;
			case WSDL2_0Package.RESTRICTION__CHOICE:
				setChoice((Choice)newValue);
				return;
			case WSDL2_0Package.RESTRICTION__SEQUENCE_DEF:
				setSequenceDef((SequenceType)newValue);
				return;
			case WSDL2_0Package.RESTRICTION__GROUP:
				setGroup((Group)newValue);
				return;
			case WSDL2_0Package.RESTRICTION__SIMPLE_TYPE:
				setSimpleType((SimpleType)newValue);
				return;
			case WSDL2_0Package.RESTRICTION__MIN_EXCLUSIVE:
				setMinExclusive((MinExclusive)newValue);
				return;
			case WSDL2_0Package.RESTRICTION__MIN_INCLUSIVE:
				setMinInclusive((MinInclusive)newValue);
				return;
			case WSDL2_0Package.RESTRICTION__MAX_EXCLUSIVE:
				setMaxExclusive((MaxExclusive)newValue);
				return;
			case WSDL2_0Package.RESTRICTION__MAX_INCLUSIVE:
				setMaxInclusive((MaxInclusive)newValue);
				return;
			case WSDL2_0Package.RESTRICTION__TOTAL_DIGITS:
				setTotalDigits((TotalDigits)newValue);
				return;
			case WSDL2_0Package.RESTRICTION__FRACTION_DIGITS:
				setFractionDigits((FractionDigits)newValue);
				return;
			case WSDL2_0Package.RESTRICTION__PATTERN:
				setPattern((Pattern)newValue);
				return;
			case WSDL2_0Package.RESTRICTION__ENUMERATION:
				setEnumeration((Enumeration)newValue);
				return;
			case WSDL2_0Package.RESTRICTION__WHITE_SPACE:
				setWhiteSpace((WhiteSpace)newValue);
				return;
			case WSDL2_0Package.RESTRICTION__LENGTH:
				setLength((Length)newValue);
				return;
			case WSDL2_0Package.RESTRICTION__MAX_LENGTH:
				setMaxLength((MaxLength)newValue);
				return;
			case WSDL2_0Package.RESTRICTION__MIN_LENGTH:
				setMinLength((MinLength)newValue);
				return;
			case WSDL2_0Package.RESTRICTION__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Attribute>)newValue);
				return;
			case WSDL2_0Package.RESTRICTION__ATTRIBUTE_GROUP:
				getAttributeGroup().clear();
				getAttributeGroup().addAll((Collection<? extends AttributeGroup>)newValue);
				return;
			case WSDL2_0Package.RESTRICTION__ANY_ATTRIBUTE:
				setAnyAttribute((AnyAttribute)newValue);
				return;
			case WSDL2_0Package.RESTRICTION__BASE:
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
			case WSDL2_0Package.RESTRICTION__ID:
				setId(ID_EDEFAULT);
				return;
			case WSDL2_0Package.RESTRICTION__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case WSDL2_0Package.RESTRICTION__ALL:
				setAll((All)null);
				return;
			case WSDL2_0Package.RESTRICTION__CHOICE:
				setChoice((Choice)null);
				return;
			case WSDL2_0Package.RESTRICTION__SEQUENCE_DEF:
				setSequenceDef((SequenceType)null);
				return;
			case WSDL2_0Package.RESTRICTION__GROUP:
				setGroup((Group)null);
				return;
			case WSDL2_0Package.RESTRICTION__SIMPLE_TYPE:
				setSimpleType((SimpleType)null);
				return;
			case WSDL2_0Package.RESTRICTION__MIN_EXCLUSIVE:
				setMinExclusive((MinExclusive)null);
				return;
			case WSDL2_0Package.RESTRICTION__MIN_INCLUSIVE:
				setMinInclusive((MinInclusive)null);
				return;
			case WSDL2_0Package.RESTRICTION__MAX_EXCLUSIVE:
				setMaxExclusive((MaxExclusive)null);
				return;
			case WSDL2_0Package.RESTRICTION__MAX_INCLUSIVE:
				setMaxInclusive((MaxInclusive)null);
				return;
			case WSDL2_0Package.RESTRICTION__TOTAL_DIGITS:
				setTotalDigits((TotalDigits)null);
				return;
			case WSDL2_0Package.RESTRICTION__FRACTION_DIGITS:
				setFractionDigits((FractionDigits)null);
				return;
			case WSDL2_0Package.RESTRICTION__PATTERN:
				setPattern((Pattern)null);
				return;
			case WSDL2_0Package.RESTRICTION__ENUMERATION:
				setEnumeration((Enumeration)null);
				return;
			case WSDL2_0Package.RESTRICTION__WHITE_SPACE:
				setWhiteSpace((WhiteSpace)null);
				return;
			case WSDL2_0Package.RESTRICTION__LENGTH:
				setLength((Length)null);
				return;
			case WSDL2_0Package.RESTRICTION__MAX_LENGTH:
				setMaxLength((MaxLength)null);
				return;
			case WSDL2_0Package.RESTRICTION__MIN_LENGTH:
				setMinLength((MinLength)null);
				return;
			case WSDL2_0Package.RESTRICTION__ATTRIBUTE:
				getAttribute().clear();
				return;
			case WSDL2_0Package.RESTRICTION__ATTRIBUTE_GROUP:
				getAttributeGroup().clear();
				return;
			case WSDL2_0Package.RESTRICTION__ANY_ATTRIBUTE:
				setAnyAttribute((AnyAttribute)null);
				return;
			case WSDL2_0Package.RESTRICTION__BASE:
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
			case WSDL2_0Package.RESTRICTION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case WSDL2_0Package.RESTRICTION__ANNOTATION:
				return annotation != null;
			case WSDL2_0Package.RESTRICTION__ALL:
				return all != null;
			case WSDL2_0Package.RESTRICTION__CHOICE:
				return choice != null;
			case WSDL2_0Package.RESTRICTION__SEQUENCE_DEF:
				return sequenceDef != null;
			case WSDL2_0Package.RESTRICTION__GROUP:
				return group != null;
			case WSDL2_0Package.RESTRICTION__SIMPLE_TYPE:
				return simpleType != null;
			case WSDL2_0Package.RESTRICTION__MIN_EXCLUSIVE:
				return minExclusive != null;
			case WSDL2_0Package.RESTRICTION__MIN_INCLUSIVE:
				return minInclusive != null;
			case WSDL2_0Package.RESTRICTION__MAX_EXCLUSIVE:
				return maxExclusive != null;
			case WSDL2_0Package.RESTRICTION__MAX_INCLUSIVE:
				return maxInclusive != null;
			case WSDL2_0Package.RESTRICTION__TOTAL_DIGITS:
				return totalDigits != null;
			case WSDL2_0Package.RESTRICTION__FRACTION_DIGITS:
				return fractionDigits != null;
			case WSDL2_0Package.RESTRICTION__PATTERN:
				return pattern != null;
			case WSDL2_0Package.RESTRICTION__ENUMERATION:
				return enumeration != null;
			case WSDL2_0Package.RESTRICTION__WHITE_SPACE:
				return whiteSpace != null;
			case WSDL2_0Package.RESTRICTION__LENGTH:
				return length != null;
			case WSDL2_0Package.RESTRICTION__MAX_LENGTH:
				return maxLength != null;
			case WSDL2_0Package.RESTRICTION__MIN_LENGTH:
				return minLength != null;
			case WSDL2_0Package.RESTRICTION__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case WSDL2_0Package.RESTRICTION__ATTRIBUTE_GROUP:
				return attributeGroup != null && !attributeGroup.isEmpty();
			case WSDL2_0Package.RESTRICTION__ANY_ATTRIBUTE:
				return anyAttribute != null;
			case WSDL2_0Package.RESTRICTION__BASE:
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

} //RestrictionImpl
