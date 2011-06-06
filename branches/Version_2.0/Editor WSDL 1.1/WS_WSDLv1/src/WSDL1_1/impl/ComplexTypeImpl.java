/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL1_1.impl;

import WSDL1_1.All;
import WSDL1_1.Annotation;
import WSDL1_1.AnyAttribute;
import WSDL1_1.Attribute;
import WSDL1_1.AttributeGroup;
import WSDL1_1.Choice;
import WSDL1_1.ComplexContent;
import WSDL1_1.ComplexType;
import WSDL1_1.Group;
import WSDL1_1.SequenceType;
import WSDL1_1.SimpleContent;
import WSDL1_1.WSDL1_1Package;

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
 * An implementation of the model object '<em><b>Complex Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WSDL1_1.impl.ComplexTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link WSDL1_1.impl.ComplexTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link WSDL1_1.impl.ComplexTypeImpl#getAbstractDef <em>Abstract Def</em>}</li>
 *   <li>{@link WSDL1_1.impl.ComplexTypeImpl#getFinal <em>Final</em>}</li>
 *   <li>{@link WSDL1_1.impl.ComplexTypeImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link WSDL1_1.impl.ComplexTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link WSDL1_1.impl.ComplexTypeImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link WSDL1_1.impl.ComplexTypeImpl#getSimpleContent <em>Simple Content</em>}</li>
 *   <li>{@link WSDL1_1.impl.ComplexTypeImpl#getComplexContent <em>Complex Content</em>}</li>
 *   <li>{@link WSDL1_1.impl.ComplexTypeImpl#getAll <em>All</em>}</li>
 *   <li>{@link WSDL1_1.impl.ComplexTypeImpl#getChoice <em>Choice</em>}</li>
 *   <li>{@link WSDL1_1.impl.ComplexTypeImpl#getSequenceDef <em>Sequence Def</em>}</li>
 *   <li>{@link WSDL1_1.impl.ComplexTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link WSDL1_1.impl.ComplexTypeImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link WSDL1_1.impl.ComplexTypeImpl#getAttributeGroup <em>Attribute Group</em>}</li>
 *   <li>{@link WSDL1_1.impl.ComplexTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplexTypeImpl extends TypeRefImpl implements ComplexType {
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
	 * The default value of the '{@link #getMixed() <em>Mixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MIXED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected Boolean mixed = MIXED_EDEFAULT;

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
	 * The cached value of the '{@link #getSimpleContent() <em>Simple Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleContent()
	 * @generated
	 * @ordered
	 */
	protected SimpleContent simpleContent;

	/**
	 * The cached value of the '{@link #getComplexContent() <em>Complex Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexContent()
	 * @generated
	 * @ordered
	 */
	protected ComplexContent complexContent;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WSDL1_1Package.eINSTANCE.getComplexType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.COMPLEX_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.COMPLEX_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.COMPLEX_TYPE__ABSTRACT_DEF, oldAbstractDef, abstractDef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.COMPLEX_TYPE__FINAL, oldFinal, final_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.COMPLEX_TYPE__BLOCK, oldBlock, block));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getMixed() {
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMixed(Boolean newMixed) {
		Boolean oldMixed = mixed;
		mixed = newMixed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.COMPLEX_TYPE__MIXED, oldMixed, mixed));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL1_1Package.COMPLEX_TYPE__ANNOTATION, oldAnnotation, newAnnotation);
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
				msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.COMPLEX_TYPE__ANNOTATION, null, msgs);
			if (newAnnotation != null)
				msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.COMPLEX_TYPE__ANNOTATION, null, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.COMPLEX_TYPE__ANNOTATION, newAnnotation, newAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleContent getSimpleContent() {
		return simpleContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimpleContent(SimpleContent newSimpleContent, NotificationChain msgs) {
		SimpleContent oldSimpleContent = simpleContent;
		simpleContent = newSimpleContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL1_1Package.COMPLEX_TYPE__SIMPLE_CONTENT, oldSimpleContent, newSimpleContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleContent(SimpleContent newSimpleContent) {
		if (newSimpleContent != simpleContent) {
			NotificationChain msgs = null;
			if (simpleContent != null)
				msgs = ((InternalEObject)simpleContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.COMPLEX_TYPE__SIMPLE_CONTENT, null, msgs);
			if (newSimpleContent != null)
				msgs = ((InternalEObject)newSimpleContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.COMPLEX_TYPE__SIMPLE_CONTENT, null, msgs);
			msgs = basicSetSimpleContent(newSimpleContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.COMPLEX_TYPE__SIMPLE_CONTENT, newSimpleContent, newSimpleContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexContent getComplexContent() {
		return complexContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComplexContent(ComplexContent newComplexContent, NotificationChain msgs) {
		ComplexContent oldComplexContent = complexContent;
		complexContent = newComplexContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL1_1Package.COMPLEX_TYPE__COMPLEX_CONTENT, oldComplexContent, newComplexContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplexContent(ComplexContent newComplexContent) {
		if (newComplexContent != complexContent) {
			NotificationChain msgs = null;
			if (complexContent != null)
				msgs = ((InternalEObject)complexContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.COMPLEX_TYPE__COMPLEX_CONTENT, null, msgs);
			if (newComplexContent != null)
				msgs = ((InternalEObject)newComplexContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.COMPLEX_TYPE__COMPLEX_CONTENT, null, msgs);
			msgs = basicSetComplexContent(newComplexContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.COMPLEX_TYPE__COMPLEX_CONTENT, newComplexContent, newComplexContent));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL1_1Package.COMPLEX_TYPE__ALL, oldAll, newAll);
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
				msgs = ((InternalEObject)all).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.COMPLEX_TYPE__ALL, null, msgs);
			if (newAll != null)
				msgs = ((InternalEObject)newAll).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.COMPLEX_TYPE__ALL, null, msgs);
			msgs = basicSetAll(newAll, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.COMPLEX_TYPE__ALL, newAll, newAll));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL1_1Package.COMPLEX_TYPE__CHOICE, oldChoice, newChoice);
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
				msgs = ((InternalEObject)choice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.COMPLEX_TYPE__CHOICE, null, msgs);
			if (newChoice != null)
				msgs = ((InternalEObject)newChoice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.COMPLEX_TYPE__CHOICE, null, msgs);
			msgs = basicSetChoice(newChoice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.COMPLEX_TYPE__CHOICE, newChoice, newChoice));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL1_1Package.COMPLEX_TYPE__SEQUENCE_DEF, oldSequenceDef, newSequenceDef);
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
				msgs = ((InternalEObject)sequenceDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.COMPLEX_TYPE__SEQUENCE_DEF, null, msgs);
			if (newSequenceDef != null)
				msgs = ((InternalEObject)newSequenceDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.COMPLEX_TYPE__SEQUENCE_DEF, null, msgs);
			msgs = basicSetSequenceDef(newSequenceDef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.COMPLEX_TYPE__SEQUENCE_DEF, newSequenceDef, newSequenceDef));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL1_1Package.COMPLEX_TYPE__GROUP, oldGroup, newGroup);
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
				msgs = ((InternalEObject)group).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.COMPLEX_TYPE__GROUP, null, msgs);
			if (newGroup != null)
				msgs = ((InternalEObject)newGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.COMPLEX_TYPE__GROUP, null, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.COMPLEX_TYPE__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, WSDL1_1Package.COMPLEX_TYPE__ATTRIBUTE);
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
			attributeGroup = new EObjectContainmentEList<AttributeGroup>(AttributeGroup.class, this, WSDL1_1Package.COMPLEX_TYPE__ATTRIBUTE_GROUP);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL1_1Package.COMPLEX_TYPE__ANY_ATTRIBUTE, oldAnyAttribute, newAnyAttribute);
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
				msgs = ((InternalEObject)anyAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.COMPLEX_TYPE__ANY_ATTRIBUTE, null, msgs);
			if (newAnyAttribute != null)
				msgs = ((InternalEObject)newAnyAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.COMPLEX_TYPE__ANY_ATTRIBUTE, null, msgs);
			msgs = basicSetAnyAttribute(newAnyAttribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.COMPLEX_TYPE__ANY_ATTRIBUTE, newAnyAttribute, newAnyAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WSDL1_1Package.COMPLEX_TYPE__ANNOTATION:
				return basicSetAnnotation(null, msgs);
			case WSDL1_1Package.COMPLEX_TYPE__SIMPLE_CONTENT:
				return basicSetSimpleContent(null, msgs);
			case WSDL1_1Package.COMPLEX_TYPE__COMPLEX_CONTENT:
				return basicSetComplexContent(null, msgs);
			case WSDL1_1Package.COMPLEX_TYPE__ALL:
				return basicSetAll(null, msgs);
			case WSDL1_1Package.COMPLEX_TYPE__CHOICE:
				return basicSetChoice(null, msgs);
			case WSDL1_1Package.COMPLEX_TYPE__SEQUENCE_DEF:
				return basicSetSequenceDef(null, msgs);
			case WSDL1_1Package.COMPLEX_TYPE__GROUP:
				return basicSetGroup(null, msgs);
			case WSDL1_1Package.COMPLEX_TYPE__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case WSDL1_1Package.COMPLEX_TYPE__ATTRIBUTE_GROUP:
				return ((InternalEList<?>)getAttributeGroup()).basicRemove(otherEnd, msgs);
			case WSDL1_1Package.COMPLEX_TYPE__ANY_ATTRIBUTE:
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
			case WSDL1_1Package.COMPLEX_TYPE__NAME:
				return getName();
			case WSDL1_1Package.COMPLEX_TYPE__ID:
				return getId();
			case WSDL1_1Package.COMPLEX_TYPE__ABSTRACT_DEF:
				return getAbstractDef();
			case WSDL1_1Package.COMPLEX_TYPE__FINAL:
				return getFinal();
			case WSDL1_1Package.COMPLEX_TYPE__BLOCK:
				return getBlock();
			case WSDL1_1Package.COMPLEX_TYPE__MIXED:
				return getMixed();
			case WSDL1_1Package.COMPLEX_TYPE__ANNOTATION:
				return getAnnotation();
			case WSDL1_1Package.COMPLEX_TYPE__SIMPLE_CONTENT:
				return getSimpleContent();
			case WSDL1_1Package.COMPLEX_TYPE__COMPLEX_CONTENT:
				return getComplexContent();
			case WSDL1_1Package.COMPLEX_TYPE__ALL:
				return getAll();
			case WSDL1_1Package.COMPLEX_TYPE__CHOICE:
				return getChoice();
			case WSDL1_1Package.COMPLEX_TYPE__SEQUENCE_DEF:
				return getSequenceDef();
			case WSDL1_1Package.COMPLEX_TYPE__GROUP:
				return getGroup();
			case WSDL1_1Package.COMPLEX_TYPE__ATTRIBUTE:
				return getAttribute();
			case WSDL1_1Package.COMPLEX_TYPE__ATTRIBUTE_GROUP:
				return getAttributeGroup();
			case WSDL1_1Package.COMPLEX_TYPE__ANY_ATTRIBUTE:
				return getAnyAttribute();
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
			case WSDL1_1Package.COMPLEX_TYPE__NAME:
				setName((String)newValue);
				return;
			case WSDL1_1Package.COMPLEX_TYPE__ID:
				setId((String)newValue);
				return;
			case WSDL1_1Package.COMPLEX_TYPE__ABSTRACT_DEF:
				setAbstractDef((Boolean)newValue);
				return;
			case WSDL1_1Package.COMPLEX_TYPE__FINAL:
				setFinal((String)newValue);
				return;
			case WSDL1_1Package.COMPLEX_TYPE__BLOCK:
				setBlock((String)newValue);
				return;
			case WSDL1_1Package.COMPLEX_TYPE__MIXED:
				setMixed((Boolean)newValue);
				return;
			case WSDL1_1Package.COMPLEX_TYPE__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case WSDL1_1Package.COMPLEX_TYPE__SIMPLE_CONTENT:
				setSimpleContent((SimpleContent)newValue);
				return;
			case WSDL1_1Package.COMPLEX_TYPE__COMPLEX_CONTENT:
				setComplexContent((ComplexContent)newValue);
				return;
			case WSDL1_1Package.COMPLEX_TYPE__ALL:
				setAll((All)newValue);
				return;
			case WSDL1_1Package.COMPLEX_TYPE__CHOICE:
				setChoice((Choice)newValue);
				return;
			case WSDL1_1Package.COMPLEX_TYPE__SEQUENCE_DEF:
				setSequenceDef((SequenceType)newValue);
				return;
			case WSDL1_1Package.COMPLEX_TYPE__GROUP:
				setGroup((Group)newValue);
				return;
			case WSDL1_1Package.COMPLEX_TYPE__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Attribute>)newValue);
				return;
			case WSDL1_1Package.COMPLEX_TYPE__ATTRIBUTE_GROUP:
				getAttributeGroup().clear();
				getAttributeGroup().addAll((Collection<? extends AttributeGroup>)newValue);
				return;
			case WSDL1_1Package.COMPLEX_TYPE__ANY_ATTRIBUTE:
				setAnyAttribute((AnyAttribute)newValue);
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
			case WSDL1_1Package.COMPLEX_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WSDL1_1Package.COMPLEX_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case WSDL1_1Package.COMPLEX_TYPE__ABSTRACT_DEF:
				setAbstractDef(ABSTRACT_DEF_EDEFAULT);
				return;
			case WSDL1_1Package.COMPLEX_TYPE__FINAL:
				setFinal(FINAL_EDEFAULT);
				return;
			case WSDL1_1Package.COMPLEX_TYPE__BLOCK:
				setBlock(BLOCK_EDEFAULT);
				return;
			case WSDL1_1Package.COMPLEX_TYPE__MIXED:
				setMixed(MIXED_EDEFAULT);
				return;
			case WSDL1_1Package.COMPLEX_TYPE__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case WSDL1_1Package.COMPLEX_TYPE__SIMPLE_CONTENT:
				setSimpleContent((SimpleContent)null);
				return;
			case WSDL1_1Package.COMPLEX_TYPE__COMPLEX_CONTENT:
				setComplexContent((ComplexContent)null);
				return;
			case WSDL1_1Package.COMPLEX_TYPE__ALL:
				setAll((All)null);
				return;
			case WSDL1_1Package.COMPLEX_TYPE__CHOICE:
				setChoice((Choice)null);
				return;
			case WSDL1_1Package.COMPLEX_TYPE__SEQUENCE_DEF:
				setSequenceDef((SequenceType)null);
				return;
			case WSDL1_1Package.COMPLEX_TYPE__GROUP:
				setGroup((Group)null);
				return;
			case WSDL1_1Package.COMPLEX_TYPE__ATTRIBUTE:
				getAttribute().clear();
				return;
			case WSDL1_1Package.COMPLEX_TYPE__ATTRIBUTE_GROUP:
				getAttributeGroup().clear();
				return;
			case WSDL1_1Package.COMPLEX_TYPE__ANY_ATTRIBUTE:
				setAnyAttribute((AnyAttribute)null);
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
			case WSDL1_1Package.COMPLEX_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WSDL1_1Package.COMPLEX_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case WSDL1_1Package.COMPLEX_TYPE__ABSTRACT_DEF:
				return ABSTRACT_DEF_EDEFAULT == null ? abstractDef != null : !ABSTRACT_DEF_EDEFAULT.equals(abstractDef);
			case WSDL1_1Package.COMPLEX_TYPE__FINAL:
				return FINAL_EDEFAULT == null ? final_ != null : !FINAL_EDEFAULT.equals(final_);
			case WSDL1_1Package.COMPLEX_TYPE__BLOCK:
				return BLOCK_EDEFAULT == null ? block != null : !BLOCK_EDEFAULT.equals(block);
			case WSDL1_1Package.COMPLEX_TYPE__MIXED:
				return MIXED_EDEFAULT == null ? mixed != null : !MIXED_EDEFAULT.equals(mixed);
			case WSDL1_1Package.COMPLEX_TYPE__ANNOTATION:
				return annotation != null;
			case WSDL1_1Package.COMPLEX_TYPE__SIMPLE_CONTENT:
				return simpleContent != null;
			case WSDL1_1Package.COMPLEX_TYPE__COMPLEX_CONTENT:
				return complexContent != null;
			case WSDL1_1Package.COMPLEX_TYPE__ALL:
				return all != null;
			case WSDL1_1Package.COMPLEX_TYPE__CHOICE:
				return choice != null;
			case WSDL1_1Package.COMPLEX_TYPE__SEQUENCE_DEF:
				return sequenceDef != null;
			case WSDL1_1Package.COMPLEX_TYPE__GROUP:
				return group != null;
			case WSDL1_1Package.COMPLEX_TYPE__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case WSDL1_1Package.COMPLEX_TYPE__ATTRIBUTE_GROUP:
				return attributeGroup != null && !attributeGroup.isEmpty();
			case WSDL1_1Package.COMPLEX_TYPE__ANY_ATTRIBUTE:
				return anyAttribute != null;
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
		result.append(", abstractDef: ");
		result.append(abstractDef);
		result.append(", final: ");
		result.append(final_);
		result.append(", block: ");
		result.append(block);
		result.append(", mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //ComplexTypeImpl
