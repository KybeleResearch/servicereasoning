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
 * A representation of the model object '<em><b>Wsoap Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL2_0.Wsoap_Header#getMustUnderstand <em>Must Understand</em>}</li>
 *   <li>{@link WSDL2_0.Wsoap_Header#getRequired <em>Required</em>}</li>
 *   <li>{@link WSDL2_0.Wsoap_Header#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link WSDL2_0.Wsoap_Header#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL2_0.WSDL2_0Package#getWsoap_Header()
 * @model
 * @generated
 */
public interface Wsoap_Header extends EObject {
	/**
	 * Returns the value of the '<em><b>Must Understand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Must Understand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Must Understand</em>' attribute.
	 * @see #setMustUnderstand(Boolean)
	 * @see WSDL2_0.WSDL2_0Package#getWsoap_Header_MustUnderstand()
	 * @model
	 * @generated
	 */
	Boolean getMustUnderstand();

	/**
	 * Sets the value of the '{@link WSDL2_0.Wsoap_Header#getMustUnderstand <em>Must Understand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Understand</em>' attribute.
	 * @see #getMustUnderstand()
	 * @generated
	 */
	void setMustUnderstand(Boolean value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(Boolean)
	 * @see WSDL2_0.WSDL2_0Package#getWsoap_Header_Required()
	 * @model
	 * @generated
	 */
	Boolean getRequired();

	/**
	 * Sets the value of the '{@link WSDL2_0.Wsoap_Header#getRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(Boolean value);

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
	 * @see WSDL2_0.WSDL2_0Package#getWsoap_Header_Documentation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Documentation> getDocumentation();

	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(Element)
	 * @see WSDL2_0.WSDL2_0Package#getWsoap_Header_Element()
	 * @model required="true"
	 * @generated
	 */
	Element getElement();

	/**
	 * Sets the value of the '{@link WSDL2_0.Wsoap_Header#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(Element value);

} // Wsoap_Header
