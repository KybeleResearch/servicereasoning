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
 * A representation of the model object '<em><b>Binding Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL1_1.BindingInput#getBody <em>Body</em>}</li>
 *   <li>{@link WSDL1_1.BindingInput#getHeader <em>Header</em>}</li>
 *   <li>{@link WSDL1_1.BindingInput#getUrlReplacement <em>Url Replacement</em>}</li>
 *   <li>{@link WSDL1_1.BindingInput#getUrlEncoded <em>Url Encoded</em>}</li>
 *   <li>{@link WSDL1_1.BindingInput#getMultipartRelated <em>Multipart Related</em>}</li>
 *   <li>{@link WSDL1_1.BindingInput#getContent <em>Content</em>}</li>
 *   <li>{@link WSDL1_1.BindingInput#getMimeXml <em>Mime Xml</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL1_1.WSDL1_1Package#getBindingInput()
 * @model
 * @generated
 */
public interface BindingInput extends WSDL1_1.Object {
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
	 * @see WSDL1_1.WSDL1_1Package#getBindingInput_Body()
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
	 * @see WSDL1_1.WSDL1_1Package#getBindingInput_Header()
	 * @model containment="true"
	 * @generated
	 */
	EList<HeaderSOAP> getHeader();

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
	 * @see WSDL1_1.WSDL1_1Package#getBindingInput_UrlReplacement()
	 * @model containment="true"
	 * @generated
	 */
	URLReplacement getUrlReplacement();

	/**
	 * Sets the value of the '{@link WSDL1_1.BindingInput#getUrlReplacement <em>Url Replacement</em>}' containment reference.
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
	 * @see WSDL1_1.WSDL1_1Package#getBindingInput_UrlEncoded()
	 * @model containment="true"
	 * @generated
	 */
	URLEncoded getUrlEncoded();

	/**
	 * Sets the value of the '{@link WSDL1_1.BindingInput#getUrlEncoded <em>Url Encoded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url Encoded</em>' containment reference.
	 * @see #getUrlEncoded()
	 * @generated
	 */
	void setUrlEncoded(URLEncoded value);

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
	 * @see WSDL1_1.WSDL1_1Package#getBindingInput_MultipartRelated()
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
	 * @see WSDL1_1.WSDL1_1Package#getBindingInput_Content()
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
	 * @see WSDL1_1.WSDL1_1Package#getBindingInput_MimeXml()
	 * @model containment="true"
	 * @generated
	 */
	EList<MIMEXml> getMimeXml();

} // BindingInput
