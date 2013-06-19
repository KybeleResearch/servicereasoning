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
 * A representation of the model object '<em><b>Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL2_0.ElementType#getImport <em>Import</em>}</li>
 *   <li>{@link WSDL2_0.ElementType#getSchema <em>Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL2_0.WSDL2_0Package#getElementType()
 * @model
 * @generated
 */
public interface ElementType extends WSDL2_0.Object {
	/**
	 * Returns the value of the '<em><b>Import</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL2_0.ImportXMLSchema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import</em>' containment reference list.
	 * @see WSDL2_0.WSDL2_0Package#getElementType_Import()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImportXMLSchema> getImport();

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL2_0.Schema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' containment reference list.
	 * @see WSDL2_0.WSDL2_0Package#getElementType_Schema()
	 * @model containment="true"
	 * @generated
	 */
	EList<Schema> getSchema();

} // ElementType
