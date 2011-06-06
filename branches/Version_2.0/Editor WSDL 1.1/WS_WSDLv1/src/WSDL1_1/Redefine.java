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
 * A representation of the model object '<em><b>Redefine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL1_1.Redefine#getSchemaLocation <em>Schema Location</em>}</li>
 *   <li>{@link WSDL1_1.Redefine#getId <em>Id</em>}</li>
 *   <li>{@link WSDL1_1.Redefine#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link WSDL1_1.Redefine#getSimpleType <em>Simple Type</em>}</li>
 *   <li>{@link WSDL1_1.Redefine#getComplexType <em>Complex Type</em>}</li>
 *   <li>{@link WSDL1_1.Redefine#getAttributeGroup <em>Attribute Group</em>}</li>
 *   <li>{@link WSDL1_1.Redefine#getGroup <em>Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL1_1.WSDL1_1Package#getRedefine()
 * @model
 * @generated
 */
public interface Redefine extends EObject {
	/**
	 * Returns the value of the '<em><b>Schema Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Location</em>' attribute.
	 * @see #setSchemaLocation(String)
	 * @see WSDL1_1.WSDL1_1Package#getRedefine_SchemaLocation()
	 * @model required="true"
	 * @generated
	 */
	String getSchemaLocation();

	/**
	 * Sets the value of the '{@link WSDL1_1.Redefine#getSchemaLocation <em>Schema Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Location</em>' attribute.
	 * @see #getSchemaLocation()
	 * @generated
	 */
	void setSchemaLocation(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see WSDL1_1.WSDL1_1Package#getRedefine_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link WSDL1_1.Redefine#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getRedefine_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Simple Type</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.SimpleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Type</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getRedefine_SimpleType()
	 * @model containment="true"
	 * @generated
	 */
	EList<SimpleType> getSimpleType();

	/**
	 * Returns the value of the '<em><b>Complex Type</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.ComplexType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complex Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Type</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getRedefine_ComplexType()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComplexType> getComplexType();

	/**
	 * Returns the value of the '<em><b>Attribute Group</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Group</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getRedefine_AttributeGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeGroup> getAttributeGroup();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.Group}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getRedefine_Group()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getGroup();

} // Redefine
