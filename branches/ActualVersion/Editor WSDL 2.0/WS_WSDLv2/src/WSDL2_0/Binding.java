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
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL2_0.Binding#getName <em>Name</em>}</li>
 *   <li>{@link WSDL2_0.Binding#getType <em>Type</em>}</li>
 *   <li>{@link WSDL2_0.Binding#getWsoap_version <em>Wsoap version</em>}</li>
 *   <li>{@link WSDL2_0.Binding#getWsoap_protocol <em>Wsoap protocol</em>}</li>
 *   <li>{@link WSDL2_0.Binding#getWhttp_methodDefault <em>Whttp method Default</em>}</li>
 *   <li>{@link WSDL2_0.Binding#getWsoap_mepDefault <em>Wsoap mep Default</em>}</li>
 *   <li>{@link WSDL2_0.Binding#getWhttp_queryParameterSeparatorDefault <em>Whttp query Parameter Separator Default</em>}</li>
 *   <li>{@link WSDL2_0.Binding#getWhttp_cookies <em>Whttp cookies</em>}</li>
 *   <li>{@link WSDL2_0.Binding#getWhttp_contentEncodingDefault <em>Whttp content Encoding Default</em>}</li>
 *   <li>{@link WSDL2_0.Binding#getFault <em>Fault</em>}</li>
 *   <li>{@link WSDL2_0.Binding#getOperation <em>Operation</em>}</li>
 *   <li>{@link WSDL2_0.Binding#getWsoap_module <em>Wsoap module</em>}</li>
 *   <li>{@link WSDL2_0.Binding#getInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL2_0.WSDL2_0Package#getBinding()
 * @model
 * @generated
 */
public interface Binding extends WSDL2_0.Object {
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
	 * @see WSDL2_0.WSDL2_0Package#getBinding_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link WSDL2_0.Binding#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see WSDL2_0.WSDL2_0Package#getBinding_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link WSDL2_0.Binding#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Wsoap version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsoap version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsoap version</em>' attribute.
	 * @see #setWsoap_version(String)
	 * @see WSDL2_0.WSDL2_0Package#getBinding_Wsoap_version()
	 * @model
	 * @generated
	 */
	String getWsoap_version();

	/**
	 * Sets the value of the '{@link WSDL2_0.Binding#getWsoap_version <em>Wsoap version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsoap version</em>' attribute.
	 * @see #getWsoap_version()
	 * @generated
	 */
	void setWsoap_version(String value);

	/**
	 * Returns the value of the '<em><b>Wsoap protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsoap protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsoap protocol</em>' attribute.
	 * @see #setWsoap_protocol(String)
	 * @see WSDL2_0.WSDL2_0Package#getBinding_Wsoap_protocol()
	 * @model
	 * @generated
	 */
	String getWsoap_protocol();

	/**
	 * Sets the value of the '{@link WSDL2_0.Binding#getWsoap_protocol <em>Wsoap protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsoap protocol</em>' attribute.
	 * @see #getWsoap_protocol()
	 * @generated
	 */
	void setWsoap_protocol(String value);

	/**
	 * Returns the value of the '<em><b>Whttp method Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Whttp method Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whttp method Default</em>' attribute.
	 * @see #setWhttp_methodDefault(String)
	 * @see WSDL2_0.WSDL2_0Package#getBinding_Whttp_methodDefault()
	 * @model
	 * @generated
	 */
	String getWhttp_methodDefault();

	/**
	 * Sets the value of the '{@link WSDL2_0.Binding#getWhttp_methodDefault <em>Whttp method Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whttp method Default</em>' attribute.
	 * @see #getWhttp_methodDefault()
	 * @generated
	 */
	void setWhttp_methodDefault(String value);

	/**
	 * Returns the value of the '<em><b>Wsoap mep Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wsoap mep Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wsoap mep Default</em>' attribute.
	 * @see #setWsoap_mepDefault(String)
	 * @see WSDL2_0.WSDL2_0Package#getBinding_Wsoap_mepDefault()
	 * @model
	 * @generated
	 */
	String getWsoap_mepDefault();

	/**
	 * Sets the value of the '{@link WSDL2_0.Binding#getWsoap_mepDefault <em>Wsoap mep Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wsoap mep Default</em>' attribute.
	 * @see #getWsoap_mepDefault()
	 * @generated
	 */
	void setWsoap_mepDefault(String value);

	/**
	 * Returns the value of the '<em><b>Whttp query Parameter Separator Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Whttp query Parameter Separator Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whttp query Parameter Separator Default</em>' attribute.
	 * @see #setWhttp_queryParameterSeparatorDefault(String)
	 * @see WSDL2_0.WSDL2_0Package#getBinding_Whttp_queryParameterSeparatorDefault()
	 * @model
	 * @generated
	 */
	String getWhttp_queryParameterSeparatorDefault();

	/**
	 * Sets the value of the '{@link WSDL2_0.Binding#getWhttp_queryParameterSeparatorDefault <em>Whttp query Parameter Separator Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whttp query Parameter Separator Default</em>' attribute.
	 * @see #getWhttp_queryParameterSeparatorDefault()
	 * @generated
	 */
	void setWhttp_queryParameterSeparatorDefault(String value);

	/**
	 * Returns the value of the '<em><b>Whttp cookies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Whttp cookies</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whttp cookies</em>' attribute.
	 * @see #setWhttp_cookies(Boolean)
	 * @see WSDL2_0.WSDL2_0Package#getBinding_Whttp_cookies()
	 * @model
	 * @generated
	 */
	Boolean getWhttp_cookies();

	/**
	 * Sets the value of the '{@link WSDL2_0.Binding#getWhttp_cookies <em>Whttp cookies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whttp cookies</em>' attribute.
	 * @see #getWhttp_cookies()
	 * @generated
	 */
	void setWhttp_cookies(Boolean value);

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
	 * @see WSDL2_0.WSDL2_0Package#getBinding_Whttp_contentEncodingDefault()
	 * @model
	 * @generated
	 */
	String getWhttp_contentEncodingDefault();

	/**
	 * Sets the value of the '{@link WSDL2_0.Binding#getWhttp_contentEncodingDefault <em>Whttp content Encoding Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whttp content Encoding Default</em>' attribute.
	 * @see #getWhttp_contentEncodingDefault()
	 * @generated
	 */
	void setWhttp_contentEncodingDefault(String value);

	/**
	 * Returns the value of the '<em><b>Fault</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL2_0.BindingFault}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault</em>' containment reference list.
	 * @see WSDL2_0.WSDL2_0Package#getBinding_Fault()
	 * @model containment="true"
	 * @generated
	 */
	EList<BindingFault> getFault();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL2_0.BindingOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see WSDL2_0.WSDL2_0Package#getBinding_Operation()
	 * @model containment="true"
	 * @generated
	 */
	EList<BindingOperation> getOperation();

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
	 * @see WSDL2_0.WSDL2_0Package#getBinding_Wsoap_module()
	 * @model containment="true"
	 * @generated
	 */
	EList<Wsoap_Module> getWsoap_module();

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference.
	 * @see #setInterface(Interface)
	 * @see WSDL2_0.WSDL2_0Package#getBinding_Interface()
	 * @model
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Sets the value of the '{@link WSDL2_0.Binding#getInterface <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Interface value);

} // Binding
