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
 * A representation of the model object '<em><b>Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL1_1.ElementType#getSchema <em>Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL1_1.WSDL1_1Package#getElementType()
 * @model
 * @generated
 */
public interface ElementType extends WSDL1_1.Object {
	/**
	 * Returns the value of the '<em><b>Schema</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.Schema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getElementType_Schema()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Schema> getSchema();

} // ElementType
