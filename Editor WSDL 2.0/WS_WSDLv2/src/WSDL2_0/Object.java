/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL2_0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL2_0.Object#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link WSDL2_0.Object#getElementImported <em>Element Imported</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL2_0.WSDL2_0Package#getObject()
 * @model
 * @generated
 */
public interface Object extends EObject {
	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL2_0.Documentation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference list.
	 * @see WSDL2_0.WSDL2_0Package#getObject_Documentation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Documentation> getDocumentation();

	/**
	 * Returns the value of the '<em><b>Element Imported</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link WSDL2_0.ElementImported#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Imported</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Imported</em>' reference.
	 * @see #setElementImported(ElementImported)
	 * @see WSDL2_0.WSDL2_0Package#getObject_ElementImported()
	 * @see WSDL2_0.ElementImported#getMessage
	 * @model opposite="message"
	 * @generated
	 */
	ElementImported getElementImported();

	/**
	 * Sets the value of the '{@link WSDL2_0.Object#getElementImported <em>Element Imported</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Imported</em>' reference.
	 * @see #getElementImported()
	 * @generated
	 */
	void setElementImported(ElementImported value);

} // Object
