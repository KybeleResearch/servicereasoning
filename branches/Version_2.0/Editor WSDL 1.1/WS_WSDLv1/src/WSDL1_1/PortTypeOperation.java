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
 * A representation of the model object '<em><b>Port Type Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL1_1.PortTypeOperation#getOutput <em>Output</em>}</li>
 *   <li>{@link WSDL1_1.PortTypeOperation#getInput <em>Input</em>}</li>
 *   <li>{@link WSDL1_1.PortTypeOperation#getName <em>Name</em>}</li>
 *   <li>{@link WSDL1_1.PortTypeOperation#getFault <em>Fault</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL1_1.WSDL1_1Package#getPortTypeOperation()
 * @model
 * @generated
 */
public interface PortTypeOperation extends WSDL1_1.Object {
	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference.
	 * @see #setOutput(PortTypeOutput)
	 * @see WSDL1_1.WSDL1_1Package#getPortTypeOperation_Output()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	PortTypeOutput getOutput();

	/**
	 * Sets the value of the '{@link WSDL1_1.PortTypeOperation#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(PortTypeOutput value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference.
	 * @see #setInput(PortTypeInput)
	 * @see WSDL1_1.WSDL1_1Package#getPortTypeOperation_Input()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	PortTypeInput getInput();

	/**
	 * Sets the value of the '{@link WSDL1_1.PortTypeOperation#getInput <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' containment reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(PortTypeInput value);

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
	 * @see WSDL1_1.WSDL1_1Package#getPortTypeOperation_Name()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link WSDL1_1.PortTypeOperation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Fault</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.PortTypeFault}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getPortTypeOperation_Fault()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortTypeFault> getFault();

} // PortTypeOperation
