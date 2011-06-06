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
 * A representation of the model object '<em><b>Binding Infault</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL2_0.BindingInfault#getMessageLabel <em>Message Label</em>}</li>
 *   <li>{@link WSDL2_0.BindingInfault#getRef <em>Ref</em>}</li>
 *   <li>{@link WSDL2_0.BindingInfault#getWsoap_module <em>Wsoap module</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL2_0.WSDL2_0Package#getBindingInfault()
 * @model
 * @generated
 */
public interface BindingInfault extends WSDL2_0.Object {
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
	 * @see WSDL2_0.WSDL2_0Package#getBindingInfault_MessageLabel()
	 * @model
	 * @generated
	 */
	String getMessageLabel();

	/**
	 * Sets the value of the '{@link WSDL2_0.BindingInfault#getMessageLabel <em>Message Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Label</em>' attribute.
	 * @see #getMessageLabel()
	 * @generated
	 */
	void setMessageLabel(String value);

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
	 * @see WSDL2_0.WSDL2_0Package#getBindingInfault_Ref()
	 * @model required="true"
	 * @generated
	 */
	InterfaceFault getRef();

	/**
	 * Sets the value of the '{@link WSDL2_0.BindingInfault#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(InterfaceFault value);

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
	 * @see WSDL2_0.WSDL2_0Package#getBindingInfault_Wsoap_module()
	 * @model containment="true"
	 * @generated
	 */
	EList<Wsoap_Module> getWsoap_module();

} // BindingInfault
