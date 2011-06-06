/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL2_0;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL2_0.EndPoint#getName <em>Name</em>}</li>
 *   <li>{@link WSDL2_0.EndPoint#getAddress <em>Address</em>}</li>
 *   <li>{@link WSDL2_0.EndPoint#getWhttp_authenticationScheme <em>Whttp authentication Scheme</em>}</li>
 *   <li>{@link WSDL2_0.EndPoint#getWhttp_authenticationRealm <em>Whttp authentication Realm</em>}</li>
 *   <li>{@link WSDL2_0.EndPoint#getBinding <em>Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL2_0.WSDL2_0Package#getEndPoint()
 * @model
 * @generated
 */
public interface EndPoint extends WSDL2_0.Object {
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
	 * @see WSDL2_0.WSDL2_0Package#getEndPoint_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link WSDL2_0.EndPoint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see WSDL2_0.WSDL2_0Package#getEndPoint_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link WSDL2_0.EndPoint#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Whttp authentication Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Whttp authentication Scheme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whttp authentication Scheme</em>' attribute.
	 * @see #setWhttp_authenticationScheme(String)
	 * @see WSDL2_0.WSDL2_0Package#getEndPoint_Whttp_authenticationScheme()
	 * @model
	 * @generated
	 */
	String getWhttp_authenticationScheme();

	/**
	 * Sets the value of the '{@link WSDL2_0.EndPoint#getWhttp_authenticationScheme <em>Whttp authentication Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whttp authentication Scheme</em>' attribute.
	 * @see #getWhttp_authenticationScheme()
	 * @generated
	 */
	void setWhttp_authenticationScheme(String value);

	/**
	 * Returns the value of the '<em><b>Whttp authentication Realm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Whttp authentication Realm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whttp authentication Realm</em>' attribute.
	 * @see #setWhttp_authenticationRealm(String)
	 * @see WSDL2_0.WSDL2_0Package#getEndPoint_Whttp_authenticationRealm()
	 * @model
	 * @generated
	 */
	String getWhttp_authenticationRealm();

	/**
	 * Sets the value of the '{@link WSDL2_0.EndPoint#getWhttp_authenticationRealm <em>Whttp authentication Realm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whttp authentication Realm</em>' attribute.
	 * @see #getWhttp_authenticationRealm()
	 * @generated
	 */
	void setWhttp_authenticationRealm(String value);

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
	 * @see WSDL2_0.WSDL2_0Package#getEndPoint_Binding()
	 * @model required="true"
	 * @generated
	 */
	Binding getBinding();

	/**
	 * Sets the value of the '{@link WSDL2_0.EndPoint#getBinding <em>Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' reference.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(Binding value);

} // EndPoint
