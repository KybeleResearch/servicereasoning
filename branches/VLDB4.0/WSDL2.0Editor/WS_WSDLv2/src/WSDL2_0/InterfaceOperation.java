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
 * A representation of the model object '<em><b>Interface Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL2_0.InterfaceOperation#getName <em>Name</em>}</li>
 *   <li>{@link WSDL2_0.InterfaceOperation#getPattern <em>Pattern</em>}</li>
 *   <li>{@link WSDL2_0.InterfaceOperation#getStyle <em>Style</em>}</li>
 *   <li>{@link WSDL2_0.InterfaceOperation#getWsdlx_safe <em>Wsdlx safe</em>}</li>
 *   <li>{@link WSDL2_0.InterfaceOperation#getWrpc_signature <em>Wrpc signature</em>}</li>
 *   <li>{@link WSDL2_0.InterfaceOperation#getInput <em>Input</em>}</li>
 *   <li>{@link WSDL2_0.InterfaceOperation#getOutput <em>Output</em>}</li>
 *   <li>{@link WSDL2_0.InterfaceOperation#getInfault <em>Infault</em>}</li>
 *   <li>{@link WSDL2_0.InterfaceOperation#getOutfault <em>Outfault</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL2_0.WSDL2_0Package#getInterfaceOperation()
 * @model
 * @generated
 */
public interface InterfaceOperation extends WSDL2_0.Object {
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
	 * @see WSDL2_0.WSDL2_0Package#getInterfaceOperation_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link WSDL2_0.InterfaceOperation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see #setPattern(String)
	 * @see WSDL2_0.WSDL2_0Package#getInterfaceOperation_Pattern()
	 * @model
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link WSDL2_0.InterfaceOperation#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see WSDL2_0.WSDL2_0Package#getInterfaceOperation_Style()
	 * @model
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link WSDL2_0.InterfaceOperation#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Wsdlx safe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsdlx safe</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsdlx safe</em>' attribute.
	 * @see #setWsdlx_safe(Boolean)
	 * @see WSDL2_0.WSDL2_0Package#getInterfaceOperation_Wsdlx_safe()
	 * @model
	 * @generated
	 */
	Boolean getWsdlx_safe();

	/**
	 * Sets the value of the '{@link WSDL2_0.InterfaceOperation#getWsdlx_safe <em>Wsdlx safe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsdlx safe</em>' attribute.
	 * @see #getWsdlx_safe()
	 * @generated
	 */
	void setWsdlx_safe(Boolean value);

	/**
	 * Returns the value of the '<em><b>Wrpc signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wrpc signature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wrpc signature</em>' attribute.
	 * @see #setWrpc_signature(String)
	 * @see WSDL2_0.WSDL2_0Package#getInterfaceOperation_Wrpc_signature()
	 * @model
	 * @generated
	 */
	String getWrpc_signature();

	/**
	 * Sets the value of the '{@link WSDL2_0.InterfaceOperation#getWrpc_signature <em>Wrpc signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wrpc signature</em>' attribute.
	 * @see #getWrpc_signature()
	 * @generated
	 */
	void setWrpc_signature(String value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL2_0.InterfaceInput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see WSDL2_0.WSDL2_0Package#getInterfaceOperation_Input()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceInput> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL2_0.InterfaceOutput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see WSDL2_0.WSDL2_0Package#getInterfaceOperation_Output()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceOutput> getOutput();

	/**
	 * Returns the value of the '<em><b>Infault</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL2_0.InterfaceInfault}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Infault</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infault</em>' containment reference list.
	 * @see WSDL2_0.WSDL2_0Package#getInterfaceOperation_Infault()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceInfault> getInfault();

	/**
	 * Returns the value of the '<em><b>Outfault</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL2_0.InterfaceOutfault}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outfault</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outfault</em>' containment reference list.
	 * @see WSDL2_0.WSDL2_0Package#getInterfaceOperation_Outfault()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceOutfault> getOutfault();

} // InterfaceOperation
