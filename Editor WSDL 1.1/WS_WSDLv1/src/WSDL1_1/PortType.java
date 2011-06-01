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
 * A representation of the model object '<em><b>Port Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL1_1.PortType#getName <em>Name</em>}</li>
 *   <li>{@link WSDL1_1.PortType#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL1_1.WSDL1_1Package#getPortType()
 * @model
 * @generated
 */
public interface PortType extends WSDL1_1.Object {
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
	 * @see WSDL1_1.WSDL1_1Package#getPortType_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link WSDL1_1.PortType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.PortTypeOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getPortType_Operation()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortTypeOperation> getOperation();

} // PortType
