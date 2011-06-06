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
 * A representation of the model object '<em><b>Documentation XML Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL1_1.DocumentationXMLSchema#getSource <em>Source</em>}</li>
 *   <li>{@link WSDL1_1.DocumentationXMLSchema#getId <em>Id</em>}</li>
 *   <li>{@link WSDL1_1.DocumentationXMLSchema#getXml_lang <em>Xml lang</em>}</li>
 *   <li>{@link WSDL1_1.DocumentationXMLSchema#getAny <em>Any</em>}</li>
 *   <li>{@link WSDL1_1.DocumentationXMLSchema#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL1_1.WSDL1_1Package#getDocumentationXMLSchema()
 * @model
 * @generated
 */
public interface DocumentationXMLSchema extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see WSDL1_1.WSDL1_1Package#getDocumentationXMLSchema_Source()
	 * @model
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link WSDL1_1.DocumentationXMLSchema#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

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
	 * @see WSDL1_1.WSDL1_1Package#getDocumentationXMLSchema_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link WSDL1_1.DocumentationXMLSchema#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see WSDL1_1.WSDL1_1Package#getDocumentationXMLSchema_Xml_lang()
	 * @model
	 * @generated
	 */
	String getXml_lang();

	/**
	 * Sets the value of the '{@link WSDL1_1.DocumentationXMLSchema#getXml_lang <em>Xml lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml lang</em>' attribute.
	 * @see #getXml_lang()
	 * @generated
	 */
	void setXml_lang(String value);

	/**
	 * Returns the value of the '<em><b>Any</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' containment reference.
	 * @see #setAny(Any)
	 * @see WSDL1_1.WSDL1_1Package#getDocumentationXMLSchema_Any()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Any getAny();

	/**
	 * Sets the value of the '{@link WSDL1_1.DocumentationXMLSchema#getAny <em>Any</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Any</em>' containment reference.
	 * @see #getAny()
	 * @generated
	 */
	void setAny(Any value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.Text}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getDocumentationXMLSchema_Text()
	 * @model containment="true"
	 * @generated
	 */
	EList<Text> getText();

} // DocumentationXMLSchema
