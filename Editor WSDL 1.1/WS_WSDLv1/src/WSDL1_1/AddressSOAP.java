/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL1_1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address SOAP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL1_1.AddressSOAP#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL1_1.WSDL1_1Package#getAddressSOAP()
 * @model
 * @generated
 */
public interface AddressSOAP extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see WSDL1_1.WSDL1_1Package#getAddressSOAP_Location()
	 * @model required="true"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link WSDL1_1.AddressSOAP#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

} // AddressSOAP
