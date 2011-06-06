/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL2_0;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Outfault</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL2_0.InterfaceOutfault#getMessageLabel <em>Message Label</em>}</li>
 *   <li>{@link WSDL2_0.InterfaceOutfault#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL2_0.WSDL2_0Package#getInterfaceOutfault()
 * @model
 * @generated
 */
public interface InterfaceOutfault extends WSDL2_0.Object {
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
	 * @see WSDL2_0.WSDL2_0Package#getInterfaceOutfault_MessageLabel()
	 * @model
	 * @generated
	 */
	String getMessageLabel();

	/**
	 * Sets the value of the '{@link WSDL2_0.InterfaceOutfault#getMessageLabel <em>Message Label</em>}' attribute.
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
	 * @see WSDL2_0.WSDL2_0Package#getInterfaceOutfault_Ref()
	 * @model required="true"
	 * @generated
	 */
	InterfaceFault getRef();

	/**
	 * Sets the value of the '{@link WSDL2_0.InterfaceOutfault#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(InterfaceFault value);

} // InterfaceOutfault
