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
 * A representation of the model object '<em><b>Binding Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL1_1.BindingOperation#getOutput <em>Output</em>}</li>
 *   <li>{@link WSDL1_1.BindingOperation#getInput <em>Input</em>}</li>
 *   <li>{@link WSDL1_1.BindingOperation#getName <em>Name</em>}</li>
 *   <li>{@link WSDL1_1.BindingOperation#getFault <em>Fault</em>}</li>
 *   <li>{@link WSDL1_1.BindingOperation#getSoapoperation <em>Soapoperation</em>}</li>
 *   <li>{@link WSDL1_1.BindingOperation#getHttpoperation <em>Httpoperation</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL1_1.WSDL1_1Package#getBindingOperation()
 * @model
 * @generated
 */
public interface BindingOperation extends WSDL1_1.Object {
	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference.
	 * @see #setOutput(BindingOutput)
	 * @see WSDL1_1.WSDL1_1Package#getBindingOperation_Output()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	BindingOutput getOutput();

	/**
	 * Sets the value of the '{@link WSDL1_1.BindingOperation#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(BindingOutput value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference.
	 * @see #setInput(BindingInput)
	 * @see WSDL1_1.WSDL1_1Package#getBindingOperation_Input()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	BindingInput getInput();

	/**
	 * Sets the value of the '{@link WSDL1_1.BindingOperation#getInput <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' containment reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(BindingInput value);

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
	 * @see WSDL1_1.WSDL1_1Package#getBindingOperation_Name()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link WSDL1_1.BindingOperation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Fault</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.BindingFault}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getBindingOperation_Fault()
	 * @model containment="true"
	 * @generated
	 */
	EList<BindingFault> getFault();

	/**
	 * Returns the value of the '<em><b>Soapoperation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soapoperation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soapoperation</em>' containment reference.
	 * @see #setSoapoperation(OperationSOAP)
	 * @see WSDL1_1.WSDL1_1Package#getBindingOperation_Soapoperation()
	 * @model containment="true"
	 * @generated
	 */
	OperationSOAP getSoapoperation();

	/**
	 * Sets the value of the '{@link WSDL1_1.BindingOperation#getSoapoperation <em>Soapoperation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soapoperation</em>' containment reference.
	 * @see #getSoapoperation()
	 * @generated
	 */
	void setSoapoperation(OperationSOAP value);

	/**
	 * Returns the value of the '<em><b>Httpoperation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Httpoperation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Httpoperation</em>' containment reference.
	 * @see #setHttpoperation(OperationHTTP)
	 * @see WSDL1_1.WSDL1_1Package#getBindingOperation_Httpoperation()
	 * @model containment="true"
	 * @generated
	 */
	OperationHTTP getHttpoperation();

	/**
	 * Sets the value of the '{@link WSDL1_1.BindingOperation#getHttpoperation <em>Httpoperation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Httpoperation</em>' containment reference.
	 * @see #getHttpoperation()
	 * @generated
	 */
	void setHttpoperation(OperationHTTP value);

} // BindingOperation
