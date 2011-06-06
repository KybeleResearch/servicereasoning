/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL2_0;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL2_0.BindingInput#getMessageLabel <em>Message Label</em>}</li>
 *   <li>{@link WSDL2_0.BindingInput#getWhttp_contentEncoding <em>Whttp content Encoding</em>}</li>
 *   <li>{@link WSDL2_0.BindingInput#getWsoap_module <em>Wsoap module</em>}</li>
 *   <li>{@link WSDL2_0.BindingInput#getWsoap_header <em>Wsoap header</em>}</li>
 *   <li>{@link WSDL2_0.BindingInput#getWhttp_header <em>Whttp header</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL2_0.WSDL2_0Package#getBindingInput()
 * @model
 * @generated
 */
public interface BindingInput extends WSDL2_0.Object {
	/**
	 * Returns the value of the '<em><b>Message Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Label</em>' attribute.
	 * @see #setMessageLabel(String)
	 * @see WSDL2_0.WSDL2_0Package#getBindingInput_MessageLabel()
	 * @model
	 * @generated
	 */
	String getMessageLabel();

	/**
	 * Sets the value of the '{@link WSDL2_0.BindingInput#getMessageLabel <em>Message Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Label</em>' attribute.
	 * @see #getMessageLabel()
	 * @generated
	 */
	void setMessageLabel(String value);

	/**
	 * Returns the value of the '<em><b>Whttp content Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Whttp content Encoding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whttp content Encoding</em>' attribute.
	 * @see #setWhttp_contentEncoding(String)
	 * @see WSDL2_0.WSDL2_0Package#getBindingInput_Whttp_contentEncoding()
	 * @model
	 * @generated
	 */
	String getWhttp_contentEncoding();

	/**
	 * Sets the value of the '{@link WSDL2_0.BindingInput#getWhttp_contentEncoding <em>Whttp content Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whttp content Encoding</em>' attribute.
	 * @see #getWhttp_contentEncoding()
	 * @generated
	 */
	void setWhttp_contentEncoding(String value);

	/**
	 * Returns the value of the '<em><b>Wsoap module</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL2_0.Wsoap_Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsoap module</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsoap module</em>' containment reference list.
	 * @see WSDL2_0.WSDL2_0Package#getBindingInput_Wsoap_module()
	 * @model containment="true"
	 * @generated
	 */
	EList<Wsoap_Module> getWsoap_module();

	/**
	 * Returns the value of the '<em><b>Wsoap header</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL2_0.Wsoap_Header}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsoap header</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsoap header</em>' containment reference list.
	 * @see WSDL2_0.WSDL2_0Package#getBindingInput_Wsoap_header()
	 * @model containment="true"
	 * @generated
	 */
	EList<Wsoap_Header> getWsoap_header();

	/**
	 * Returns the value of the '<em><b>Whttp header</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL2_0.Whttp_Header}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Whttp header</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whttp header</em>' containment reference list.
	 * @see WSDL2_0.WSDL2_0Package#getBindingInput_Whttp_header()
	 * @model containment="true"
	 * @generated
	 */
	EList<Whttp_Header> getWhttp_header();

} // BindingInput
