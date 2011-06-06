/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL1_1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL1_1.Schema#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link WSDL1_1.Schema#getVersion <em>Version</em>}</li>
 *   <li>{@link WSDL1_1.Schema#getNds <em>Nds</em>}</li>
 *   <li>{@link WSDL1_1.Schema#getNsSchema <em>Ns Schema</em>}</li>
 *   <li>{@link WSDL1_1.Schema#getFinalDefault <em>Final Default</em>}</li>
 *   <li>{@link WSDL1_1.Schema#getBlockDefault <em>Block Default</em>}</li>
 *   <li>{@link WSDL1_1.Schema#getId <em>Id</em>}</li>
 *   <li>{@link WSDL1_1.Schema#getElementFormDefault <em>Element Form Default</em>}</li>
 *   <li>{@link WSDL1_1.Schema#getAttributeFormDefault <em>Attribute Form Default</em>}</li>
 *   <li>{@link WSDL1_1.Schema#getXml_lang <em>Xml lang</em>}</li>
 *   <li>{@link WSDL1_1.Schema#getInclude <em>Include</em>}</li>
 *   <li>{@link WSDL1_1.Schema#getImport <em>Import</em>}</li>
 *   <li>{@link WSDL1_1.Schema#getRedefine <em>Redefine</em>}</li>
 *   <li>{@link WSDL1_1.Schema#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link WSDL1_1.Schema#getSimpleType <em>Simple Type</em>}</li>
 *   <li>{@link WSDL1_1.Schema#getComplexType <em>Complex Type</em>}</li>
 *   <li>{@link WSDL1_1.Schema#getElement <em>Element</em>}</li>
 *   <li>{@link WSDL1_1.Schema#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link WSDL1_1.Schema#getAttributeGroup <em>Attribute Group</em>}</li>
 *   <li>{@link WSDL1_1.Schema#getGroup <em>Group</em>}</li>
 *   <li>{@link WSDL1_1.Schema#getNotation <em>Notation</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL1_1.WSDL1_1Package#getSchema()
 * @model
 * @generated
 */
public interface Schema extends EObject {
	/**
	 * Returns the value of the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Namespace</em>' attribute.
	 * @see #setTargetNamespace(String)
	 * @see WSDL1_1.WSDL1_1Package#getSchema_TargetNamespace()
	 * @model
	 * @generated
	 */
	String getTargetNamespace();

	/**
	 * Sets the value of the '{@link WSDL1_1.Schema#getTargetNamespace <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Namespace</em>' attribute.
	 * @see #getTargetNamespace()
	 * @generated
	 */
	void setTargetNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see WSDL1_1.WSDL1_1Package#getSchema_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link WSDL1_1.Schema#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Nds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nds</em>' attribute.
	 * @see #setNds(String)
	 * @see WSDL1_1.WSDL1_1Package#getSchema_Nds()
	 * @model required="true"
	 * @generated
	 */
	String getNds();

	/**
	 * Sets the value of the '{@link WSDL1_1.Schema#getNds <em>Nds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nds</em>' attribute.
	 * @see #getNds()
	 * @generated
	 */
	void setNds(String value);

	/**
	 * Returns the value of the '<em><b>Ns Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ns Schema</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ns Schema</em>' attribute.
	 * @see #setNsSchema(String)
	 * @see WSDL1_1.WSDL1_1Package#getSchema_NsSchema()
	 * @model
	 * @generated
	 */
	String getNsSchema();

	/**
	 * Sets the value of the '{@link WSDL1_1.Schema#getNsSchema <em>Ns Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns Schema</em>' attribute.
	 * @see #getNsSchema()
	 * @generated
	 */
	void setNsSchema(String value);

	/**
	 * Returns the value of the '<em><b>Final Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Default</em>' attribute.
	 * @see #setFinalDefault(String)
	 * @see WSDL1_1.WSDL1_1Package#getSchema_FinalDefault()
	 * @model
	 * @generated
	 */
	String getFinalDefault();

	/**
	 * Sets the value of the '{@link WSDL1_1.Schema#getFinalDefault <em>Final Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Default</em>' attribute.
	 * @see #getFinalDefault()
	 * @generated
	 */
	void setFinalDefault(String value);

	/**
	 * Returns the value of the '<em><b>Block Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Default</em>' attribute.
	 * @see #setBlockDefault(String)
	 * @see WSDL1_1.WSDL1_1Package#getSchema_BlockDefault()
	 * @model
	 * @generated
	 */
	String getBlockDefault();

	/**
	 * Sets the value of the '{@link WSDL1_1.Schema#getBlockDefault <em>Block Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Default</em>' attribute.
	 * @see #getBlockDefault()
	 * @generated
	 */
	void setBlockDefault(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see WSDL1_1.WSDL1_1Package#getSchema_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link WSDL1_1.Schema#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Element Form Default</b></em>' attribute.
	 * The literals are from the enumeration {@link WSDL1_1.formValues}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Form Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Form Default</em>' attribute.
	 * @see WSDL1_1.formValues
	 * @see #setElementFormDefault(formValues)
	 * @see WSDL1_1.WSDL1_1Package#getSchema_ElementFormDefault()
	 * @model required="true"
	 * @generated
	 */
	formValues getElementFormDefault();

	/**
	 * Sets the value of the '{@link WSDL1_1.Schema#getElementFormDefault <em>Element Form Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Form Default</em>' attribute.
	 * @see WSDL1_1.formValues
	 * @see #getElementFormDefault()
	 * @generated
	 */
	void setElementFormDefault(formValues value);

	/**
	 * Returns the value of the '<em><b>Attribute Form Default</b></em>' attribute.
	 * The literals are from the enumeration {@link WSDL1_1.formValues}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Form Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Form Default</em>' attribute.
	 * @see WSDL1_1.formValues
	 * @see #setAttributeFormDefault(formValues)
	 * @see WSDL1_1.WSDL1_1Package#getSchema_AttributeFormDefault()
	 * @model required="true"
	 * @generated
	 */
	formValues getAttributeFormDefault();

	/**
	 * Sets the value of the '{@link WSDL1_1.Schema#getAttributeFormDefault <em>Attribute Form Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Form Default</em>' attribute.
	 * @see WSDL1_1.formValues
	 * @see #getAttributeFormDefault()
	 * @generated
	 */
	void setAttributeFormDefault(formValues value);

	/**
	 * Returns the value of the '<em><b>Xml lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xml lang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml lang</em>' attribute.
	 * @see #setXml_lang(String)
	 * @see WSDL1_1.WSDL1_1Package#getSchema_Xml_lang()
	 * @model
	 * @generated
	 */
	String getXml_lang();

	/**
	 * Sets the value of the '{@link WSDL1_1.Schema#getXml_lang <em>Xml lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml lang</em>' attribute.
	 * @see #getXml_lang()
	 * @generated
	 */
	void setXml_lang(String value);

	/**
	 * Returns the value of the '<em><b>Include</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.Include}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getSchema_Include()
	 * @model containment="true"
	 * @generated
	 */
	EList<Include> getInclude();

	/**
	 * Returns the value of the '<em><b>Import</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.ImportXMLSchema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getSchema_Import()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImportXMLSchema> getImport();

	/**
	 * Returns the value of the '<em><b>Redefine</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.Redefine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefine</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefine</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getSchema_Redefine()
	 * @model containment="true"
	 * @generated
	 */
	EList<Redefine> getRedefine();

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getSchema_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Simple Type</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.SimpleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Type</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getSchema_SimpleType()
	 * @model containment="true"
	 * @generated
	 */
	EList<SimpleType> getSimpleType();

	/**
	 * Returns the value of the '<em><b>Complex Type</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.ComplexType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complex Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Type</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getSchema_ComplexType()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComplexType> getComplexType();

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getSchema_Element()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElement();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getSchema_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>Attribute Group</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Group</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getSchema_AttributeGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeGroup> getAttributeGroup();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.Group}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getSchema_Group()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getGroup();

	/**
	 * Returns the value of the '<em><b>Notation</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.Notation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notation</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getSchema_Notation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Notation> getNotation();

} // Schema
