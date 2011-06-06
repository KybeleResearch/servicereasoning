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
 * A representation of the model object '<em><b>Binding HTTP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL1_1.BindingHTTP#getVerb <em>Verb</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL1_1.WSDL1_1Package#getBindingHTTP()
 * @model
 * @generated
 */
public interface BindingHTTP extends EObject {
	/**
	 * Returns the value of the '<em><b>Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verb</em>' attribute.
	 * @see #setVerb(String)
	 * @see WSDL1_1.WSDL1_1Package#getBindingHTTP_Verb()
	 * @model required="true"
	 * @generated
	 */
	String getVerb();

	/**
	 * Sets the value of the '{@link WSDL1_1.BindingHTTP#getVerb <em>Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verb</em>' attribute.
	 * @see #getVerb()
	 * @generated
	 */
	void setVerb(String value);

} // BindingHTTP
