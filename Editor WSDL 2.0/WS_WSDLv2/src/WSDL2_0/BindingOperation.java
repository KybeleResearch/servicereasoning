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
 * A representation of the model object '<em><b>Binding Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL2_0.BindingOperation#getWsoap_mep <em>Wsoap mep</em>}</li>
 *   <li>{@link WSDL2_0.BindingOperation#getWsoap_action <em>Wsoap action</em>}</li>
 *   <li>{@link WSDL2_0.BindingOperation#getWhttp_location <em>Whttp location</em>}</li>
 *   <li>{@link WSDL2_0.BindingOperation#getWhttp_method <em>Whttp method</em>}</li>
 *   <li>{@link WSDL2_0.BindingOperation#getWhttp_inputSerialization <em>Whttp input Serialization</em>}</li>
 *   <li>{@link WSDL2_0.BindingOperation#getWhttp_outputSerialization <em>Whttp output Serialization</em>}</li>
 *   <li>{@link WSDL2_0.BindingOperation#getWhttp_faultSerialization <em>Whttp fault Serialization</em>}</li>
 *   <li>{@link WSDL2_0.BindingOperation#getWhttp_queryParameterSeparator <em>Whttp query Parameter Separator</em>}</li>
 *   <li>{@link WSDL2_0.BindingOperation#getWhttp_contentEncodingDefault <em>Whttp content Encoding Default</em>}</li>
 *   <li>{@link WSDL2_0.BindingOperation#getWhttp_ignoreUncited <em>Whttp ignore Uncited</em>}</li>
 *   <li>{@link WSDL2_0.BindingOperation#getInput <em>Input</em>}</li>
 *   <li>{@link WSDL2_0.BindingOperation#getOutput <em>Output</em>}</li>
 *   <li>{@link WSDL2_0.BindingOperation#getInfault <em>Infault</em>}</li>
 *   <li>{@link WSDL2_0.BindingOperation#getOutfault <em>Outfault</em>}</li>
 *   <li>{@link WSDL2_0.BindingOperation#getWsoap_module <em>Wsoap module</em>}</li>
 *   <li>{@link WSDL2_0.BindingOperation#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL2_0.WSDL2_0Package#getBindingOperation()
 * @model
 * @generated
 */
public interface BindingOperation extends WSDL2_0.Object {
	/**
	 * Returns the value of the '<em><b>Wsoap mep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsoap mep</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsoap mep</em>' attribute.
	 * @see #setWsoap_mep(String)
	 * @see WSDL2_0.WSDL2_0Package#getBindingOperation_Wsoap_mep()
	 * @model
	 * @generated
	 */
	String getWsoap_mep();

	/**
	 * Sets the value of the '{@link WSDL2_0.BindingOperation#getWsoap_mep <em>Wsoap mep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsoap mep</em>' attribute.
	 * @see #getWsoap_mep()
	 * @generated
	 */
	void setWsoap_mep(String value);

	/**
	 * Returns the value of the '<em><b>Wsoap action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsoap action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsoap action</em>' attribute.
	 * @see #setWsoap_action(String)
	 * @see WSDL2_0.WSDL2_0Package#getBindingOperation_Wsoap_action()
	 * @model
	 * @generated
	 */
	String getWsoap_action();

	/**
	 * Sets the value of the '{@link WSDL2_0.BindingOperation#getWsoap_action <em>Wsoap action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsoap action</em>' attribute.
	 * @see #getWsoap_action()
	 * @generated
	 */
	void setWsoap_action(String value);

	/**
	 * Returns the value of the '<em><b>Whttp location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Whttp location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whttp location</em>' attribute.
	 * @see #setWhttp_location(String)
	 * @see WSDL2_0.WSDL2_0Package#getBindingOperation_Whttp_location()
	 * @model
	 * @generated
	 */
	String getWhttp_location();

	/**
	 * Sets the value of the '{@link WSDL2_0.BindingOperation#getWhttp_location <em>Whttp location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whttp location</em>' attribute.
	 * @see #getWhttp_location()
	 * @generated
	 */
	void setWhttp_location(String value);

	/**
	 * Returns the value of the '<em><b>Whttp method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Whttp method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whttp method</em>' attribute.
	 * @see #setWhttp_method(String)
	 * @see WSDL2_0.WSDL2_0Package#getBindingOperation_Whttp_method()
	 * @model
	 * @generated
	 */
	String getWhttp_method();

	/**
	 * Sets the value of the '{@link WSDL2_0.BindingOperation#getWhttp_method <em>Whttp method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whttp method</em>' attribute.
	 * @see #getWhttp_method()
	 * @generated
	 */
	void setWhttp_method(String value);

	/**
	 * Returns the value of the '<em><b>Whttp input Serialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Whttp input Serialization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whttp input Serialization</em>' attribute.
	 * @see #setWhttp_inputSerialization(String)
	 * @see WSDL2_0.WSDL2_0Package#getBindingOperation_Whttp_inputSerialization()
	 * @model
	 * @generated
	 */
	String getWhttp_inputSerialization();

	/**
	 * Sets the value of the '{@link WSDL2_0.BindingOperation#getWhttp_inputSerialization <em>Whttp input Serialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whttp input Serialization</em>' attribute.
	 * @see #getWhttp_inputSerialization()
	 * @generated
	 */
	void setWhttp_inputSerialization(String value);

	/**
	 * Returns the value of the '<em><b>Whttp output Serialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Whttp output Serialization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whttp output Serialization</em>' attribute.
	 * @see #setWhttp_outputSerialization(String)
	 * @see WSDL2_0.WSDL2_0Package#getBindingOperation_Whttp_outputSerialization()
	 * @model
	 * @generated
	 */
	String getWhttp_outputSerialization();

	/**
	 * Sets the value of the '{@link WSDL2_0.BindingOperation#getWhttp_outputSerialization <em>Whttp output Serialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whttp output Serialization</em>' attribute.
	 * @see #getWhttp_outputSerialization()
	 * @generated
	 */
	void setWhttp_outputSerialization(String value);

	/**
	 * Returns the value of the '<em><b>Whttp fault Serialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Whttp fault Serialization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whttp fault Serialization</em>' attribute.
	 * @see #setWhttp_faultSerialization(String)
	 * @see WSDL2_0.WSDL2_0Package#getBindingOperation_Whttp_faultSerialization()
	 * @model
	 * @generated
	 */
	String getWhttp_faultSerialization();

	/**
	 * Sets the value of the '{@link WSDL2_0.BindingOperation#getWhttp_faultSerialization <em>Whttp fault Serialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whttp fault Serialization</em>' attribute.
	 * @see #getWhttp_faultSerialization()
	 * @generated
	 */
	void setWhttp_faultSerialization(String value);

	/**
	 * Returns the value of the '<em><b>Whttp query Parameter Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Whttp query Parameter Separator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whttp query Parameter Separator</em>' attribute.
	 * @see #setWhttp_queryParameterSeparator(String)
	 * @see WSDL2_0.WSDL2_0Package#getBindingOperation_Whttp_queryParameterSeparator()
	 * @model
	 * @generated
	 */
	String getWhttp_queryParameterSeparator();

	/**
	 * Sets the value of the '{@link WSDL2_0.BindingOperation#getWhttp_queryParameterSeparator <em>Whttp query Parameter Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whttp query Parameter Separator</em>' attribute.
	 * @see #getWhttp_queryParameterSeparator()
	 * @generated
	 */
	void setWhttp_queryParameterSeparator(String value);

	/**
	 * Returns the value of the '<em><b>Whttp content Encoding Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Whttp content Encoding Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whttp content Encoding Default</em>' attribute.
	 * @see #setWhttp_contentEncodingDefault(String)
	 * @see WSDL2_0.WSDL2_0Package#getBindingOperation_Whttp_contentEncodingDefault()
	 * @model
	 * @generated
	 */
	String getWhttp_contentEncodingDefault();

	/**
	 * Sets the value of the '{@link WSDL2_0.BindingOperation#getWhttp_contentEncodingDefault <em>Whttp content Encoding Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whttp content Encoding Default</em>' attribute.
	 * @see #getWhttp_contentEncodingDefault()
	 * @generated
	 */
	void setWhttp_contentEncodingDefault(String value);

	/**
	 * Returns the value of the '<em><b>Whttp ignore Uncited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Whttp ignore Uncited</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whttp ignore Uncited</em>' attribute.
	 * @see #setWhttp_ignoreUncited(Boolean)
	 * @see WSDL2_0.WSDL2_0Package#getBindingOperation_Whttp_ignoreUncited()
	 * @model
	 * @generated
	 */
	Boolean getWhttp_ignoreUncited();

	/**
	 * Sets the value of the '{@link WSDL2_0.BindingOperation#getWhttp_ignoreUncited <em>Whttp ignore Uncited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whttp ignore Uncited</em>' attribute.
	 * @see #getWhttp_ignoreUncited()
	 * @generated
	 */
	void setWhttp_ignoreUncited(Boolean value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL2_0.BindingInput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see WSDL2_0.WSDL2_0Package#getBindingOperation_Input()
	 * @model containment="true"
	 * @generated
	 */
	EList<BindingInput> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL2_0.BindingOutput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see WSDL2_0.WSDL2_0Package#getBindingOperation_Output()
	 * @model containment="true"
	 * @generated
	 */
	EList<BindingOutput> getOutput();

	/**
	 * Returns the value of the '<em><b>Infault</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL2_0.BindingInfault}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Infault</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infault</em>' containment reference list.
	 * @see WSDL2_0.WSDL2_0Package#getBindingOperation_Infault()
	 * @model containment="true"
	 * @generated
	 */
	EList<BindingInfault> getInfault();

	/**
	 * Returns the value of the '<em><b>Outfault</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL2_0.BindingOutfault}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outfault</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outfault</em>' containment reference list.
	 * @see WSDL2_0.WSDL2_0Package#getBindingOperation_Outfault()
	 * @model containment="true"
	 * @generated
	 */
	EList<BindingOutfault> getOutfault();

	/**
	 * Returns the value of the '<em><b>Wsoap module</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL2_0.Wsoap_Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsoap module</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsoap module</em>' containment reference list.
	 * @see WSDL2_0.WSDL2_0Package#getBindingOperation_Wsoap_module()
	 * @model containment="true"
	 * @generated
	 */
	EList<Wsoap_Module> getWsoap_module();

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(InterfaceOperation)
	 * @see WSDL2_0.WSDL2_0Package#getBindingOperation_Ref()
	 * @model required="true"
	 * @generated
	 */
	InterfaceOperation getRef();

	/**
	 * Sets the value of the '{@link WSDL2_0.BindingOperation#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(InterfaceOperation value);

} // BindingOperation
