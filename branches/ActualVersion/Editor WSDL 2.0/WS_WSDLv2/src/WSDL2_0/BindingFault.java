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
 * A representation of the model object '<em><b>Binding Fault</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL2_0.BindingFault#getWsoap_code <em>Wsoap code</em>}</li>
 *   <li>{@link WSDL2_0.BindingFault#getWsoap_subcodes <em>Wsoap subcodes</em>}</li>
 *   <li>{@link WSDL2_0.BindingFault#getWhttp_code <em>Whttp code</em>}</li>
 *   <li>{@link WSDL2_0.BindingFault#getWhttp_contentEncoding <em>Whttp content Encoding</em>}</li>
 *   <li>{@link WSDL2_0.BindingFault#getWsoap_module <em>Wsoap module</em>}</li>
 *   <li>{@link WSDL2_0.BindingFault#getWsoap_header <em>Wsoap header</em>}</li>
 *   <li>{@link WSDL2_0.BindingFault#getWhttp_header <em>Whttp header</em>}</li>
 *   <li>{@link WSDL2_0.BindingFault#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL2_0.WSDL2_0Package#getBindingFault()
 * @model
 * @generated
 */
public interface BindingFault extends WSDL2_0.Object {
	/**
	 * Returns the value of the '<em><b>Wsoap code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsoap code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsoap code</em>' attribute.
	 * @see #setWsoap_code(String)
	 * @see WSDL2_0.WSDL2_0Package#getBindingFault_Wsoap_code()
	 * @model
	 * @generated
	 */
	String getWsoap_code();

	/**
	 * Sets the value of the '{@link WSDL2_0.BindingFault#getWsoap_code <em>Wsoap code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsoap code</em>' attribute.
	 * @see #getWsoap_code()
	 * @generated
	 */
	void setWsoap_code(String value);

	/**
	 * Returns the value of the '<em><b>Wsoap subcodes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsoap subcodes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsoap subcodes</em>' attribute.
	 * @see #setWsoap_subcodes(String)
	 * @see WSDL2_0.WSDL2_0Package#getBindingFault_Wsoap_subcodes()
	 * @model
	 * @generated
	 */
	String getWsoap_subcodes();

	/**
	 * Sets the value of the '{@link WSDL2_0.BindingFault#getWsoap_subcodes <em>Wsoap subcodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsoap subcodes</em>' attribute.
	 * @see #getWsoap_subcodes()
	 * @generated
	 */
	void setWsoap_subcodes(String value);

	/**
	 * Returns the value of the '<em><b>Whttp code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Whttp code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whttp code</em>' attribute.
	 * @see #setWhttp_code(String)
	 * @see WSDL2_0.WSDL2_0Package#getBindingFault_Whttp_code()
	 * @model
	 * @generated
	 */
	String getWhttp_code();

	/**
	 * Sets the value of the '{@link WSDL2_0.BindingFault#getWhttp_code <em>Whttp code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whttp code</em>' attribute.
	 * @see #getWhttp_code()
	 * @generated
	 */
	void setWhttp_code(String value);

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
	 * @see WSDL2_0.WSDL2_0Package#getBindingFault_Whttp_contentEncoding()
	 * @model
	 * @generated
	 */
	String getWhttp_contentEncoding();

	/**
	 * Sets the value of the '{@link WSDL2_0.BindingFault#getWhttp_contentEncoding <em>Whttp content Encoding</em>}' attribute.
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
	 * @see WSDL2_0.WSDL2_0Package#getBindingFault_Wsoap_module()
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
	 * @see WSDL2_0.WSDL2_0Package#getBindingFault_Wsoap_header()
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
	 * @see WSDL2_0.WSDL2_0Package#getBindingFault_Whttp_header()
	 * @model containment="true"
	 * @generated
	 */
	EList<Whttp_Header> getWhttp_header();

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(InterfaceFault)
	 * @see WSDL2_0.WSDL2_0Package#getBindingFault_Ref()
	 * @model required="true"
	 * @generated
	 */
	InterfaceFault getRef();

	/**
	 * Sets the value of the '{@link WSDL2_0.BindingFault#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(InterfaceFault value);

} // BindingFault
