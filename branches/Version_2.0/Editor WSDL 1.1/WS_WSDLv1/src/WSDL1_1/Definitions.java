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
 * A representation of the model object '<em><b>Definitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL1_1.Definitions#getBinding <em>Binding</em>}</li>
 *   <li>{@link WSDL1_1.Definitions#getService <em>Service</em>}</li>
 *   <li>{@link WSDL1_1.Definitions#getPortType <em>Port Type</em>}</li>
 *   <li>{@link WSDL1_1.Definitions#getMessage <em>Message</em>}</li>
 *   <li>{@link WSDL1_1.Definitions#getTypes <em>Types</em>}</li>
 *   <li>{@link WSDL1_1.Definitions#getName <em>Name</em>}</li>
 *   <li>{@link WSDL1_1.Definitions#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link WSDL1_1.Definitions#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link WSDL1_1.Definitions#getImport <em>Import</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL1_1.WSDL1_1Package#getDefinitions()
 * @model
 * @generated
 */
public interface Definitions extends WSDL1_1.Object {
	/**
	 * Returns the value of the '<em><b>Binding</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.Binding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getDefinitions_Binding()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Binding> getBinding();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getDefinitions_Service()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Service> getService();

	/**
	 * Returns the value of the '<em><b>Port Type</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.PortType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Type</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getDefinitions_PortType()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<PortType> getPortType();

	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.Message}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getDefinitions_Message()
	 * @model containment="true"
	 * @generated
	 */
	EList<Message> getMessage();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference.
	 * @see #setTypes(ElementType)
	 * @see WSDL1_1.WSDL1_1Package#getDefinitions_Types()
	 * @model containment="true"
	 * @generated
	 */
	ElementType getTypes();

	/**
	 * Sets the value of the '{@link WSDL1_1.Definitions#getTypes <em>Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Types</em>' containment reference.
	 * @see #getTypes()
	 * @generated
	 */
	void setTypes(ElementType value);

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
	 * @see WSDL1_1.WSDL1_1Package#getDefinitions_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link WSDL1_1.Definitions#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Namespace</em>' attribute.
	 * @see #setTargetNamespace(String)
	 * @see WSDL1_1.WSDL1_1Package#getDefinitions_TargetNamespace()
	 * @model
	 * @generated
	 */
	String getTargetNamespace();

	/**
	 * Sets the value of the '{@link WSDL1_1.Definitions#getTargetNamespace <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Namespace</em>' attribute.
	 * @see #getTargetNamespace()
	 * @generated
	 */
	void setTargetNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.Namespace}.
	 * It is bidirectional and its opposite is '{@link WSDL1_1.Namespace#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getDefinitions_Namespace()
	 * @see WSDL1_1.Namespace#getDefinition
	 * @model opposite="definition" containment="true"
	 * @generated
	 */
	EList<Namespace> getNamespace();

	/**
	 * Returns the value of the '<em><b>Import</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.Import}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getDefinitions_Import()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImport();

} // Definitions
