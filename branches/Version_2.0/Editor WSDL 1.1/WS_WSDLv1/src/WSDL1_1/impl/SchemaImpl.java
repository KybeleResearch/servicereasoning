/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL1_1.impl;

import WSDL1_1.Annotation;
import WSDL1_1.Attribute;
import WSDL1_1.AttributeGroup;
import WSDL1_1.ComplexType;
import WSDL1_1.Element;
import WSDL1_1.Group;
import WSDL1_1.ImportXMLSchema;
import WSDL1_1.Include;
import WSDL1_1.Notation;
import WSDL1_1.Redefine;
import WSDL1_1.Schema;
import WSDL1_1.SimpleType;
import WSDL1_1.WSDL1_1Package;
import WSDL1_1.formValues;

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
 * An implementation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WSDL1_1.impl.SchemaImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link WSDL1_1.impl.SchemaImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link WSDL1_1.impl.SchemaImpl#getNds <em>Nds</em>}</li>
 *   <li>{@link WSDL1_1.impl.SchemaImpl#getNsSchema <em>Ns Schema</em>}</li>
 *   <li>{@link WSDL1_1.impl.SchemaImpl#getFinalDefault <em>Final Default</em>}</li>
 *   <li>{@link WSDL1_1.impl.SchemaImpl#getBlockDefault <em>Block Default</em>}</li>
 *   <li>{@link WSDL1_1.impl.SchemaImpl#getId <em>Id</em>}</li>
 *   <li>{@link WSDL1_1.impl.SchemaImpl#getElementFormDefault <em>Element Form Default</em>}</li>
 *   <li>{@link WSDL1_1.impl.SchemaImpl#getAttributeFormDefault <em>Attribute Form Default</em>}</li>
 *   <li>{@link WSDL1_1.impl.SchemaImpl#getXml_lang <em>Xml lang</em>}</li>
 *   <li>{@link WSDL1_1.impl.SchemaImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link WSDL1_1.impl.SchemaImpl#getImport <em>Import</em>}</li>
 *   <li>{@link WSDL1_1.impl.SchemaImpl#getRedefine <em>Redefine</em>}</li>
 *   <li>{@link WSDL1_1.impl.SchemaImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link WSDL1_1.impl.SchemaImpl#getSimpleType <em>Simple Type</em>}</li>
 *   <li>{@link WSDL1_1.impl.SchemaImpl#getComplexType <em>Complex Type</em>}</li>
 *   <li>{@link WSDL1_1.impl.SchemaImpl#getElement <em>Element</em>}</li>
 *   <li>{@link WSDL1_1.impl.SchemaImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link WSDL1_1.impl.SchemaImpl#getAttributeGroup <em>Attribute Group</em>}</li>
 *   <li>{@link WSDL1_1.impl.SchemaImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link WSDL1_1.impl.SchemaImpl#getNotation <em>Notation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchemaImpl extends EObjectImpl implements Schema {
	/**
	 * The default value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected String targetNamespace = TARGET_NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNds() <em>Nds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNds()
	 * @generated
	 * @ordered
	 */
	protected static final String NDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNds() <em>Nds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNds()
	 * @generated
	 * @ordered
	 */
	protected String nds = NDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNsSchema() <em>Ns Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsSchema()
	 * @generated
	 * @ordered
	 */
	protected static final String NS_SCHEMA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNsSchema() <em>Ns Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsSchema()
	 * @generated
	 * @ordered
	 */
	protected String nsSchema = NS_SCHEMA_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinalDefault() <em>Final Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String FINAL_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinalDefault() <em>Final Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalDefault()
	 * @generated
	 * @ordered
	 */
	protected String finalDefault = FINAL_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlockDefault() <em>Block Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String BLOCK_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlockDefault() <em>Block Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockDefault()
	 * @generated
	 * @ordered
	 */
	protected String blockDefault = BLOCK_DEFAULT_EDEFAULT;

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
	 * The default value of the '{@link #getElementFormDefault() <em>Element Form Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementFormDefault()
	 * @generated
	 * @ordered
	 */
	protected static final formValues ELEMENT_FORM_DEFAULT_EDEFAULT = formValues.UNSET;

	/**
	 * The cached value of the '{@link #getElementFormDefault() <em>Element Form Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementFormDefault()
	 * @generated
	 * @ordered
	 */
	protected formValues elementFormDefault = ELEMENT_FORM_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttributeFormDefault() <em>Attribute Form Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeFormDefault()
	 * @generated
	 * @ordered
	 */
	protected static final formValues ATTRIBUTE_FORM_DEFAULT_EDEFAULT = formValues.UNSET;

	/**
	 * The cached value of the '{@link #getAttributeFormDefault() <em>Attribute Form Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeFormDefault()
	 * @generated
	 * @ordered
	 */
	protected formValues attributeFormDefault = ATTRIBUTE_FORM_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getXml_lang() <em>Xml lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXml_lang()
	 * @generated
	 * @ordered
	 */
	protected static final String XML_LANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXml_lang() <em>Xml lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXml_lang()
	 * @generated
	 * @ordered
	 */
	protected String xml_lang = XML_LANG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInclude() <em>Include</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclude()
	 * @generated
	 * @ordered
	 */
	protected EList<Include> include;

	/**
	 * The cached value of the '{@link #getImport() <em>Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImport()
	 * @generated
	 * @ordered
	 */
	protected EList<ImportXMLSchema> import_;

	/**
	 * The cached value of the '{@link #getRedefine() <em>Redefine</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefine()
	 * @generated
	 * @ordered
	 */
	protected EList<Redefine> redefine;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotation;

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
	 * The cached value of the '{@link #getComplexType() <em>Complex Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexType()
	 * @generated
	 * @ordered
	 */
	protected EList<ComplexType> complexType;

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
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> group;

	/**
	 * The cached value of the '{@link #getNotation() <em>Notation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotation()
	 * @generated
	 * @ordered
	 */
	protected EList<Notation> notation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WSDL1_1Package.eINSTANCE.getSchema();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetNamespace() {
		return targetNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetNamespace(String newTargetNamespace) {
		String oldTargetNamespace = targetNamespace;
		targetNamespace = newTargetNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.SCHEMA__TARGET_NAMESPACE, oldTargetNamespace, targetNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.SCHEMA__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNds() {
		return nds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNds(String newNds) {
		String oldNds = nds;
		nds = newNds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.SCHEMA__NDS, oldNds, nds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNsSchema() {
		return nsSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNsSchema(String newNsSchema) {
		String oldNsSchema = nsSchema;
		nsSchema = newNsSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.SCHEMA__NS_SCHEMA, oldNsSchema, nsSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFinalDefault() {
		return finalDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalDefault(String newFinalDefault) {
		String oldFinalDefault = finalDefault;
		finalDefault = newFinalDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.SCHEMA__FINAL_DEFAULT, oldFinalDefault, finalDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBlockDefault() {
		return blockDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockDefault(String newBlockDefault) {
		String oldBlockDefault = blockDefault;
		blockDefault = newBlockDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.SCHEMA__BLOCK_DEFAULT, oldBlockDefault, blockDefault));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.SCHEMA__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public formValues getElementFormDefault() {
		return elementFormDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementFormDefault(formValues newElementFormDefault) {
		formValues oldElementFormDefault = elementFormDefault;
		elementFormDefault = newElementFormDefault == null ? ELEMENT_FORM_DEFAULT_EDEFAULT : newElementFormDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.SCHEMA__ELEMENT_FORM_DEFAULT, oldElementFormDefault, elementFormDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public formValues getAttributeFormDefault() {
		return attributeFormDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeFormDefault(formValues newAttributeFormDefault) {
		formValues oldAttributeFormDefault = attributeFormDefault;
		attributeFormDefault = newAttributeFormDefault == null ? ATTRIBUTE_FORM_DEFAULT_EDEFAULT : newAttributeFormDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.SCHEMA__ATTRIBUTE_FORM_DEFAULT, oldAttributeFormDefault, attributeFormDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXml_lang() {
		return xml_lang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXml_lang(String newXml_lang) {
		String oldXml_lang = xml_lang;
		xml_lang = newXml_lang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.SCHEMA__XML_LANG, oldXml_lang, xml_lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Include> getInclude() {
		if (include == null) {
			include = new EObjectContainmentEList<Include>(Include.class, this, WSDL1_1Package.SCHEMA__INCLUDE);
		}
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImportXMLSchema> getImport() {
		if (import_ == null) {
			import_ = new EObjectContainmentEList<ImportXMLSchema>(ImportXMLSchema.class, this, WSDL1_1Package.SCHEMA__IMPORT);
		}
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Redefine> getRedefine() {
		if (redefine == null) {
			redefine = new EObjectContainmentEList<Redefine>(Redefine.class, this, WSDL1_1Package.SCHEMA__REDEFINE);
		}
		return redefine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotation() {
		if (annotation == null) {
			annotation = new EObjectContainmentEList<Annotation>(Annotation.class, this, WSDL1_1Package.SCHEMA__ANNOTATION);
		}
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimpleType> getSimpleType() {
		if (simpleType == null) {
			simpleType = new EObjectContainmentEList<SimpleType>(SimpleType.class, this, WSDL1_1Package.SCHEMA__SIMPLE_TYPE);
		}
		return simpleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComplexType> getComplexType() {
		if (complexType == null) {
			complexType = new EObjectContainmentEList<ComplexType>(ComplexType.class, this, WSDL1_1Package.SCHEMA__COMPLEX_TYPE);
		}
		return complexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getElement() {
		if (element == null) {
			element = new EObjectContainmentEList<Element>(Element.class, this, WSDL1_1Package.SCHEMA__ELEMENT);
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, WSDL1_1Package.SCHEMA__ATTRIBUTE);
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
			attributeGroup = new EObjectContainmentEList<AttributeGroup>(AttributeGroup.class, this, WSDL1_1Package.SCHEMA__ATTRIBUTE_GROUP);
		}
		return attributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getGroup() {
		if (group == null) {
			group = new EObjectContainmentEList<Group>(Group.class, this, WSDL1_1Package.SCHEMA__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Notation> getNotation() {
		if (notation == null) {
			notation = new EObjectContainmentEList<Notation>(Notation.class, this, WSDL1_1Package.SCHEMA__NOTATION);
		}
		return notation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WSDL1_1Package.SCHEMA__INCLUDE:
				return ((InternalEList<?>)getInclude()).basicRemove(otherEnd, msgs);
			case WSDL1_1Package.SCHEMA__IMPORT:
				return ((InternalEList<?>)getImport()).basicRemove(otherEnd, msgs);
			case WSDL1_1Package.SCHEMA__REDEFINE:
				return ((InternalEList<?>)getRedefine()).basicRemove(otherEnd, msgs);
			case WSDL1_1Package.SCHEMA__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case WSDL1_1Package.SCHEMA__SIMPLE_TYPE:
				return ((InternalEList<?>)getSimpleType()).basicRemove(otherEnd, msgs);
			case WSDL1_1Package.SCHEMA__COMPLEX_TYPE:
				return ((InternalEList<?>)getComplexType()).basicRemove(otherEnd, msgs);
			case WSDL1_1Package.SCHEMA__ELEMENT:
				return ((InternalEList<?>)getElement()).basicRemove(otherEnd, msgs);
			case WSDL1_1Package.SCHEMA__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case WSDL1_1Package.SCHEMA__ATTRIBUTE_GROUP:
				return ((InternalEList<?>)getAttributeGroup()).basicRemove(otherEnd, msgs);
			case WSDL1_1Package.SCHEMA__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case WSDL1_1Package.SCHEMA__NOTATION:
				return ((InternalEList<?>)getNotation()).basicRemove(otherEnd, msgs);
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
			case WSDL1_1Package.SCHEMA__TARGET_NAMESPACE:
				return getTargetNamespace();
			case WSDL1_1Package.SCHEMA__VERSION:
				return getVersion();
			case WSDL1_1Package.SCHEMA__NDS:
				return getNds();
			case WSDL1_1Package.SCHEMA__NS_SCHEMA:
				return getNsSchema();
			case WSDL1_1Package.SCHEMA__FINAL_DEFAULT:
				return getFinalDefault();
			case WSDL1_1Package.SCHEMA__BLOCK_DEFAULT:
				return getBlockDefault();
			case WSDL1_1Package.SCHEMA__ID:
				return getId();
			case WSDL1_1Package.SCHEMA__ELEMENT_FORM_DEFAULT:
				return getElementFormDefault();
			case WSDL1_1Package.SCHEMA__ATTRIBUTE_FORM_DEFAULT:
				return getAttributeFormDefault();
			case WSDL1_1Package.SCHEMA__XML_LANG:
				return getXml_lang();
			case WSDL1_1Package.SCHEMA__INCLUDE:
				return getInclude();
			case WSDL1_1Package.SCHEMA__IMPORT:
				return getImport();
			case WSDL1_1Package.SCHEMA__REDEFINE:
				return getRedefine();
			case WSDL1_1Package.SCHEMA__ANNOTATION:
				return getAnnotation();
			case WSDL1_1Package.SCHEMA__SIMPLE_TYPE:
				return getSimpleType();
			case WSDL1_1Package.SCHEMA__COMPLEX_TYPE:
				return getComplexType();
			case WSDL1_1Package.SCHEMA__ELEMENT:
				return getElement();
			case WSDL1_1Package.SCHEMA__ATTRIBUTE:
				return getAttribute();
			case WSDL1_1Package.SCHEMA__ATTRIBUTE_GROUP:
				return getAttributeGroup();
			case WSDL1_1Package.SCHEMA__GROUP:
				return getGroup();
			case WSDL1_1Package.SCHEMA__NOTATION:
				return getNotation();
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
			case WSDL1_1Package.SCHEMA__TARGET_NAMESPACE:
				setTargetNamespace((String)newValue);
				return;
			case WSDL1_1Package.SCHEMA__VERSION:
				setVersion((String)newValue);
				return;
			case WSDL1_1Package.SCHEMA__NDS:
				setNds((String)newValue);
				return;
			case WSDL1_1Package.SCHEMA__NS_SCHEMA:
				setNsSchema((String)newValue);
				return;
			case WSDL1_1Package.SCHEMA__FINAL_DEFAULT:
				setFinalDefault((String)newValue);
				return;
			case WSDL1_1Package.SCHEMA__BLOCK_DEFAULT:
				setBlockDefault((String)newValue);
				return;
			case WSDL1_1Package.SCHEMA__ID:
				setId((String)newValue);
				return;
			case WSDL1_1Package.SCHEMA__ELEMENT_FORM_DEFAULT:
				setElementFormDefault((formValues)newValue);
				return;
			case WSDL1_1Package.SCHEMA__ATTRIBUTE_FORM_DEFAULT:
				setAttributeFormDefault((formValues)newValue);
				return;
			case WSDL1_1Package.SCHEMA__XML_LANG:
				setXml_lang((String)newValue);
				return;
			case WSDL1_1Package.SCHEMA__INCLUDE:
				getInclude().clear();
				getInclude().addAll((Collection<? extends Include>)newValue);
				return;
			case WSDL1_1Package.SCHEMA__IMPORT:
				getImport().clear();
				getImport().addAll((Collection<? extends ImportXMLSchema>)newValue);
				return;
			case WSDL1_1Package.SCHEMA__REDEFINE:
				getRedefine().clear();
				getRedefine().addAll((Collection<? extends Redefine>)newValue);
				return;
			case WSDL1_1Package.SCHEMA__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case WSDL1_1Package.SCHEMA__SIMPLE_TYPE:
				getSimpleType().clear();
				getSimpleType().addAll((Collection<? extends SimpleType>)newValue);
				return;
			case WSDL1_1Package.SCHEMA__COMPLEX_TYPE:
				getComplexType().clear();
				getComplexType().addAll((Collection<? extends ComplexType>)newValue);
				return;
			case WSDL1_1Package.SCHEMA__ELEMENT:
				getElement().clear();
				getElement().addAll((Collection<? extends Element>)newValue);
				return;
			case WSDL1_1Package.SCHEMA__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Attribute>)newValue);
				return;
			case WSDL1_1Package.SCHEMA__ATTRIBUTE_GROUP:
				getAttributeGroup().clear();
				getAttributeGroup().addAll((Collection<? extends AttributeGroup>)newValue);
				return;
			case WSDL1_1Package.SCHEMA__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection<? extends Group>)newValue);
				return;
			case WSDL1_1Package.SCHEMA__NOTATION:
				getNotation().clear();
				getNotation().addAll((Collection<? extends Notation>)newValue);
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
			case WSDL1_1Package.SCHEMA__TARGET_NAMESPACE:
				setTargetNamespace(TARGET_NAMESPACE_EDEFAULT);
				return;
			case WSDL1_1Package.SCHEMA__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case WSDL1_1Package.SCHEMA__NDS:
				setNds(NDS_EDEFAULT);
				return;
			case WSDL1_1Package.SCHEMA__NS_SCHEMA:
				setNsSchema(NS_SCHEMA_EDEFAULT);
				return;
			case WSDL1_1Package.SCHEMA__FINAL_DEFAULT:
				setFinalDefault(FINAL_DEFAULT_EDEFAULT);
				return;
			case WSDL1_1Package.SCHEMA__BLOCK_DEFAULT:
				setBlockDefault(BLOCK_DEFAULT_EDEFAULT);
				return;
			case WSDL1_1Package.SCHEMA__ID:
				setId(ID_EDEFAULT);
				return;
			case WSDL1_1Package.SCHEMA__ELEMENT_FORM_DEFAULT:
				setElementFormDefault(ELEMENT_FORM_DEFAULT_EDEFAULT);
				return;
			case WSDL1_1Package.SCHEMA__ATTRIBUTE_FORM_DEFAULT:
				setAttributeFormDefault(ATTRIBUTE_FORM_DEFAULT_EDEFAULT);
				return;
			case WSDL1_1Package.SCHEMA__XML_LANG:
				setXml_lang(XML_LANG_EDEFAULT);
				return;
			case WSDL1_1Package.SCHEMA__INCLUDE:
				getInclude().clear();
				return;
			case WSDL1_1Package.SCHEMA__IMPORT:
				getImport().clear();
				return;
			case WSDL1_1Package.SCHEMA__REDEFINE:
				getRedefine().clear();
				return;
			case WSDL1_1Package.SCHEMA__ANNOTATION:
				getAnnotation().clear();
				return;
			case WSDL1_1Package.SCHEMA__SIMPLE_TYPE:
				getSimpleType().clear();
				return;
			case WSDL1_1Package.SCHEMA__COMPLEX_TYPE:
				getComplexType().clear();
				return;
			case WSDL1_1Package.SCHEMA__ELEMENT:
				getElement().clear();
				return;
			case WSDL1_1Package.SCHEMA__ATTRIBUTE:
				getAttribute().clear();
				return;
			case WSDL1_1Package.SCHEMA__ATTRIBUTE_GROUP:
				getAttributeGroup().clear();
				return;
			case WSDL1_1Package.SCHEMA__GROUP:
				getGroup().clear();
				return;
			case WSDL1_1Package.SCHEMA__NOTATION:
				getNotation().clear();
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
			case WSDL1_1Package.SCHEMA__TARGET_NAMESPACE:
				return TARGET_NAMESPACE_EDEFAULT == null ? targetNamespace != null : !TARGET_NAMESPACE_EDEFAULT.equals(targetNamespace);
			case WSDL1_1Package.SCHEMA__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case WSDL1_1Package.SCHEMA__NDS:
				return NDS_EDEFAULT == null ? nds != null : !NDS_EDEFAULT.equals(nds);
			case WSDL1_1Package.SCHEMA__NS_SCHEMA:
				return NS_SCHEMA_EDEFAULT == null ? nsSchema != null : !NS_SCHEMA_EDEFAULT.equals(nsSchema);
			case WSDL1_1Package.SCHEMA__FINAL_DEFAULT:
				return FINAL_DEFAULT_EDEFAULT == null ? finalDefault != null : !FINAL_DEFAULT_EDEFAULT.equals(finalDefault);
			case WSDL1_1Package.SCHEMA__BLOCK_DEFAULT:
				return BLOCK_DEFAULT_EDEFAULT == null ? blockDefault != null : !BLOCK_DEFAULT_EDEFAULT.equals(blockDefault);
			case WSDL1_1Package.SCHEMA__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case WSDL1_1Package.SCHEMA__ELEMENT_FORM_DEFAULT:
				return elementFormDefault != ELEMENT_FORM_DEFAULT_EDEFAULT;
			case WSDL1_1Package.SCHEMA__ATTRIBUTE_FORM_DEFAULT:
				return attributeFormDefault != ATTRIBUTE_FORM_DEFAULT_EDEFAULT;
			case WSDL1_1Package.SCHEMA__XML_LANG:
				return XML_LANG_EDEFAULT == null ? xml_lang != null : !XML_LANG_EDEFAULT.equals(xml_lang);
			case WSDL1_1Package.SCHEMA__INCLUDE:
				return include != null && !include.isEmpty();
			case WSDL1_1Package.SCHEMA__IMPORT:
				return import_ != null && !import_.isEmpty();
			case WSDL1_1Package.SCHEMA__REDEFINE:
				return redefine != null && !redefine.isEmpty();
			case WSDL1_1Package.SCHEMA__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case WSDL1_1Package.SCHEMA__SIMPLE_TYPE:
				return simpleType != null && !simpleType.isEmpty();
			case WSDL1_1Package.SCHEMA__COMPLEX_TYPE:
				return complexType != null && !complexType.isEmpty();
			case WSDL1_1Package.SCHEMA__ELEMENT:
				return element != null && !element.isEmpty();
			case WSDL1_1Package.SCHEMA__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case WSDL1_1Package.SCHEMA__ATTRIBUTE_GROUP:
				return attributeGroup != null && !attributeGroup.isEmpty();
			case WSDL1_1Package.SCHEMA__GROUP:
				return group != null && !group.isEmpty();
			case WSDL1_1Package.SCHEMA__NOTATION:
				return notation != null && !notation.isEmpty();
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
		result.append(" (targetNamespace: ");
		result.append(targetNamespace);
		result.append(", version: ");
		result.append(version);
		result.append(", nds: ");
		result.append(nds);
		result.append(", nsSchema: ");
		result.append(nsSchema);
		result.append(", finalDefault: ");
		result.append(finalDefault);
		result.append(", blockDefault: ");
		result.append(blockDefault);
		result.append(", id: ");
		result.append(id);
		result.append(", elementFormDefault: ");
		result.append(elementFormDefault);
		result.append(", attributeFormDefault: ");
		result.append(attributeFormDefault);
		result.append(", xml_lang: ");
		result.append(xml_lang);
		result.append(')');
		return result.toString();
	}

} //SchemaImpl
