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
 * A representation of the model object '<em><b>MIME Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL1_1.MIMEPart#getContent <em>Content</em>}</li>
 *   <li>{@link WSDL1_1.MIMEPart#getMimeXml <em>Mime Xml</em>}</li>
 *   <li>{@link WSDL1_1.MIMEPart#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL1_1.WSDL1_1Package#getMIMEPart()
 * @model
 * @generated
 */
public interface MIMEPart extends EObject {
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
	 * @see WSDL1_1.WSDL1_1Package#getMIMEPart_Content()
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
	 * @see WSDL1_1.WSDL1_1Package#getMIMEPart_MimeXml()
	 * @model containment="true"
	 * @generated
	 */
	EList<MIMEXml> getMimeXml();

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
	 * @see WSDL1_1.WSDL1_1Package#getMIMEPart_Body()
	 * @model containment="true"
	 * @generated
	 */
	EList<BodySOAP> getBody();

} // MIMEPart
