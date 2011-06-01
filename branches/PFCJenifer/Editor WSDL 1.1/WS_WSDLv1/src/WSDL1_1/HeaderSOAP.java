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
 * A representation of the model object '<em><b>Header SOAP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL1_1.HeaderSOAP#getPart <em>Part</em>}</li>
 *   <li>{@link WSDL1_1.HeaderSOAP#getUse <em>Use</em>}</li>
 *   <li>{@link WSDL1_1.HeaderSOAP#getEncodingStyle <em>Encoding Style</em>}</li>
 *   <li>{@link WSDL1_1.HeaderSOAP#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link WSDL1_1.HeaderSOAP#getMessage <em>Message</em>}</li>
 *   <li>{@link WSDL1_1.HeaderSOAP#getHeaderfault <em>Headerfault</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL1_1.WSDL1_1Package#getHeaderSOAP()
 * @model
 * @generated
 */
public interface HeaderSOAP extends EObject {
	/**
	 * Returns the value of the '<em><b>Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' attribute.
	 * @see #setPart(String)
	 * @see WSDL1_1.WSDL1_1Package#getHeaderSOAP_Part()
	 * @model required="true"
	 * @generated
	 */
	String getPart();

	/**
	 * Sets the value of the '{@link WSDL1_1.HeaderSOAP#getPart <em>Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part</em>' attribute.
	 * @see #getPart()
	 * @generated
	 */
	void setPart(String value);

	/**
	 * Returns the value of the '<em><b>Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' attribute.
	 * @see #setUse(String)
	 * @see WSDL1_1.WSDL1_1Package#getHeaderSOAP_Use()
	 * @model required="true"
	 * @generated
	 */
	String getUse();

	/**
	 * Sets the value of the '{@link WSDL1_1.HeaderSOAP#getUse <em>Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' attribute.
	 * @see #getUse()
	 * @generated
	 */
	void setUse(String value);

	/**
	 * Returns the value of the '<em><b>Encoding Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encoding Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoding Style</em>' attribute.
	 * @see #setEncodingStyle(String)
	 * @see WSDL1_1.WSDL1_1Package#getHeaderSOAP_EncodingStyle()
	 * @model
	 * @generated
	 */
	String getEncodingStyle();

	/**
	 * Sets the value of the '{@link WSDL1_1.HeaderSOAP#getEncodingStyle <em>Encoding Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding Style</em>' attribute.
	 * @see #getEncodingStyle()
	 * @generated
	 */
	void setEncodingStyle(String value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see WSDL1_1.WSDL1_1Package#getHeaderSOAP_Namespace()
	 * @model
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link WSDL1_1.HeaderSOAP#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' reference.
	 * @see #setMessage(Message)
	 * @see WSDL1_1.WSDL1_1Package#getHeaderSOAP_Message()
	 * @model required="true"
	 * @generated
	 */
	Message getMessage();

	/**
	 * Sets the value of the '{@link WSDL1_1.HeaderSOAP#getMessage <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(Message value);

	/**
	 * Returns the value of the '<em><b>Headerfault</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.HeaderFaultSOAP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Headerfault</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Headerfault</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getHeaderSOAP_Headerfault()
	 * @model containment="true"
	 * @generated
	 */
	EList<HeaderFaultSOAP> getHeaderfault();

} // HeaderSOAP
