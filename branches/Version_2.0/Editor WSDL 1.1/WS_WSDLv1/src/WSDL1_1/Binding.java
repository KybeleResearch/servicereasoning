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
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL1_1.Binding#getName <em>Name</em>}</li>
 *   <li>{@link WSDL1_1.Binding#getType <em>Type</em>}</li>
 *   <li>{@link WSDL1_1.Binding#getOperation <em>Operation</em>}</li>
 *   <li>{@link WSDL1_1.Binding#getSoapbinding <em>Soapbinding</em>}</li>
 *   <li>{@link WSDL1_1.Binding#getHttpbinding <em>Httpbinding</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL1_1.WSDL1_1Package#getBinding()
 * @model
 * @generated
 */
public interface Binding extends WSDL1_1.Object {
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
	 * @see WSDL1_1.WSDL1_1Package#getBinding_Name()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link WSDL1_1.Binding#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(PortType)
	 * @see WSDL1_1.WSDL1_1Package#getBinding_Type()
	 * @model required="true"
	 * @generated
	 */
	PortType getType();

	/**
	 * Sets the value of the '{@link WSDL1_1.Binding#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(PortType value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.BindingOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getBinding_Operation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<BindingOperation> getOperation();

	/**
	 * Returns the value of the '<em><b>Soapbinding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soapbinding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soapbinding</em>' containment reference.
	 * @see #setSoapbinding(BindingSOAP)
	 * @see WSDL1_1.WSDL1_1Package#getBinding_Soapbinding()
	 * @model containment="true"
	 * @generated
	 */
	BindingSOAP getSoapbinding();

	/**
	 * Sets the value of the '{@link WSDL1_1.Binding#getSoapbinding <em>Soapbinding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soapbinding</em>' containment reference.
	 * @see #getSoapbinding()
	 * @generated
	 */
	void setSoapbinding(BindingSOAP value);

	/**
	 * Returns the value of the '<em><b>Httpbinding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Httpbinding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Httpbinding</em>' containment reference.
	 * @see #setHttpbinding(BindingHTTP)
	 * @see WSDL1_1.WSDL1_1Package#getBinding_Httpbinding()
	 * @model containment="true"
	 * @generated
	 */
	BindingHTTP getHttpbinding();

	/**
	 * Sets the value of the '{@link WSDL1_1.Binding#getHttpbinding <em>Httpbinding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Httpbinding</em>' containment reference.
	 * @see #getHttpbinding()
	 * @generated
	 */
	void setHttpbinding(BindingHTTP value);

} // Binding
