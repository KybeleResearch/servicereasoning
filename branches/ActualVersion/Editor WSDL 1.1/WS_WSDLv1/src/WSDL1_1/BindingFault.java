/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL1_1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Fault</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL1_1.BindingFault#getName <em>Name</em>}</li>
 *   <li>{@link WSDL1_1.BindingFault#getFault <em>Fault</em>}</li>
 *   <li>{@link WSDL1_1.BindingFault#getBody <em>Body</em>}</li>
 *   <li>{@link WSDL1_1.BindingFault#getHeader <em>Header</em>}</li>
 *   <li>{@link WSDL1_1.BindingFault#getMultipartRelated <em>Multipart Related</em>}</li>
 *   <li>{@link WSDL1_1.BindingFault#getContent <em>Content</em>}</li>
 *   <li>{@link WSDL1_1.BindingFault#getMimeXml <em>Mime Xml</em>}</li>
 *   <li>{@link WSDL1_1.BindingFault#getUrlReplacement <em>Url Replacement</em>}</li>
 *   <li>{@link WSDL1_1.BindingFault#getUrlEncoded <em>Url Encoded</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL1_1.WSDL1_1Package#getBindingFault()
 * @model
 * @generated
 */
public interface BindingFault extends WSDL1_1.Object {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see WSDL1_1.WSDL1_1Package#getBindingFault_Name()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link WSDL1_1.BindingFault#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Fault</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault</em>' containment reference.
	 * @see #setFault(FaultSOAP)
	 * @see WSDL1_1.WSDL1_1Package#getBindingFault_Fault()
	 * @model containment="true"
	 * @generated
	 */
	FaultSOAP getFault();

	/**
	 * Sets the value of the '{@link WSDL1_1.BindingFault#getFault <em>Fault</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault</em>' containment reference.
	 * @see #getFault()
	 * @generated
	 */
	void setFault(FaultSOAP value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.BodySOAP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getBindingFault_Body()
	 * @model containment="true"
	 * @generated
	 */
	EList<BodySOAP> getBody();

	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.HeaderSOAP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getBindingFault_Header()
	 * @model containment="true"
	 * @generated
	 */
	EList<HeaderSOAP> getHeader();

	/**
	 * Returns the value of the '<em><b>Multipart Related</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.MIMEMultiPartRelated}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multipart Related</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multipart Related</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getBindingFault_MultipartRelated()
	 * @model containment="true"
	 * @generated
	 */
	EList<MIMEMultiPartRelated> getMultipartRelated();

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.MIMEContent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getBindingFault_Content()
	 * @model containment="true"
	 * @generated
	 */
	EList<MIMEContent> getContent();

	/**
	 * Returns the value of the '<em><b>Mime Xml</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.MIMEXml}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mime Xml</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mime Xml</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getBindingFault_MimeXml()
	 * @model containment="true"
	 * @generated
	 */
	EList<MIMEXml> getMimeXml();

	/**
	 * Returns the value of the '<em><b>Url Replacement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url Replacement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url Replacement</em>' containment reference.
	 * @see #setUrlReplacement(URLReplacement)
	 * @see WSDL1_1.WSDL1_1Package#getBindingFault_UrlReplacement()
	 * @model containment="true"
	 * @generated
	 */
	URLReplacement getUrlReplacement();

	/**
	 * Sets the value of the '{@link WSDL1_1.BindingFault#getUrlReplacement <em>Url Replacement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url Replacement</em>' containment reference.
	 * @see #getUrlReplacement()
	 * @generated
	 */
	void setUrlReplacement(URLReplacement value);

	/**
	 * Returns the value of the '<em><b>Url Encoded</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url Encoded</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url Encoded</em>' containment reference.
	 * @see #setUrlEncoded(URLEncoded)
	 * @see WSDL1_1.WSDL1_1Package#getBindingFault_UrlEncoded()
	 * @model containment="true"
	 * @generated
	 */
	URLEncoded getUrlEncoded();

	/**
	 * Sets the value of the '{@link WSDL1_1.BindingFault#getUrlEncoded <em>Url Encoded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url Encoded</em>' containment reference.
	 * @see #getUrlEncoded()
	 * @generated
	 */
	void setUrlEncoded(URLEncoded value);

} // BindingFault
