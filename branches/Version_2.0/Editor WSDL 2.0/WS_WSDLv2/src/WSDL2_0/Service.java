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
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL2_0.Service#getName <em>Name</em>}</li>
 *   <li>{@link WSDL2_0.Service#getEndpointDef <em>Endpoint Def</em>}</li>
 *   <li>{@link WSDL2_0.Service#getInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL2_0.WSDL2_0Package#getService()
 * @model
 * @generated
 */
public interface Service extends WSDL2_0.Object {
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
	 * @see WSDL2_0.WSDL2_0Package#getService_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link WSDL2_0.Service#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Endpoint Def</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL2_0.EndPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint Def</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Def</em>' containment reference list.
	 * @see WSDL2_0.WSDL2_0Package#getService_EndpointDef()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EndPoint> getEndpointDef();

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference.
	 * @see #setInterface(Interface)
	 * @see WSDL2_0.WSDL2_0Package#getService_Interface()
	 * @model required="true"
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Sets the value of the '{@link WSDL2_0.Service#getInterface <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Interface value);

} // Service
