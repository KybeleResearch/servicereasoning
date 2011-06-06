/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL1_1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MIME Multi Part Related</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL1_1.MIMEMultiPartRelated#getPart <em>Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL1_1.WSDL1_1Package#getMIMEMultiPartRelated()
 * @model
 * @generated
 */
public interface MIMEMultiPartRelated extends EObject {
	/**
	 * Returns the value of the '<em><b>Part</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.MIMEPart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getMIMEMultiPartRelated_Part()
	 * @model containment="true"
	 * @generated
	 */
	EList<MIMEPart> getPart();

} // MIMEMultiPartRelated
