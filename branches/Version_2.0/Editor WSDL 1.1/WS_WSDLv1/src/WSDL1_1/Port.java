/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL1_1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL1_1.Port#getName <em>Name</em>}</li>
 *   <li>{@link WSDL1_1.Port#getBinding <em>Binding</em>}</li>
 *   <li>{@link WSDL1_1.Port#getSoapAddress <em>Soap Address</em>}</li>
 *   <li>{@link WSDL1_1.Port#getHttpAddress <em>Http Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL1_1.WSDL1_1Package#getPort()
 * @model
 * @generated
 */
public interface Port extends WSDL1_1.Object {
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
	 * @see WSDL1_1.WSDL1_1Package#getPort_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link WSDL1_1.Port#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' reference.
	 * @see #setBinding(Binding)
	 * @see WSDL1_1.WSDL1_1Package#getPort_Binding()
	 * @model required="true"
	 * @generated
	 */
	Binding getBinding();

	/**
	 * Sets the value of the '{@link WSDL1_1.Port#getBinding <em>Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' reference.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(Binding value);

	/**
	 * Returns the value of the '<em><b>Soap Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soap Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soap Address</em>' containment reference.
	 * @see #setSoapAddress(AddressSOAP)
	 * @see WSDL1_1.WSDL1_1Package#getPort_SoapAddress()
	 * @model containment="true"
	 * @generated
	 */
	AddressSOAP getSoapAddress();

	/**
	 * Sets the value of the '{@link WSDL1_1.Port#getSoapAddress <em>Soap Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soap Address</em>' containment reference.
	 * @see #getSoapAddress()
	 * @generated
	 */
	void setSoapAddress(AddressSOAP value);

	/**
	 * Returns the value of the '<em><b>Http Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Http Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Address</em>' containment reference.
	 * @see #setHttpAddress(AddressHTTP)
	 * @see WSDL1_1.WSDL1_1Package#getPort_HttpAddress()
	 * @model containment="true"
	 * @generated
	 */
	AddressHTTP getHttpAddress();

	/**
	 * Sets the value of the '{@link WSDL1_1.Port#getHttpAddress <em>Http Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Address</em>' containment reference.
	 * @see #getHttpAddress()
	 * @generated
	 */
	void setHttpAddress(AddressHTTP value);

} // Port
