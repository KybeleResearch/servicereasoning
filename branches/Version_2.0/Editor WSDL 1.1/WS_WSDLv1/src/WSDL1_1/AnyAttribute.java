/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL1_1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Any Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL1_1.AnyAttribute#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link WSDL1_1.AnyAttribute#getProcessContents <em>Process Contents</em>}</li>
 *   <li>{@link WSDL1_1.AnyAttribute#getId <em>Id</em>}</li>
 *   <li>{@link WSDL1_1.AnyAttribute#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL1_1.WSDL1_1Package#getAnyAttribute()
 * @model
 * @generated
 */
public interface AnyAttribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see WSDL1_1.WSDL1_1Package#getAnyAttribute_Namespace()
	 * @model required="true"
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link WSDL1_1.AnyAttribute#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Process Contents</b></em>' attribute.
	 * The literals are from the enumeration {@link WSDL1_1.processContentsValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Contents</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Contents</em>' attribute.
	 * @see WSDL1_1.processContentsValue
	 * @see #setProcessContents(processContentsValue)
	 * @see WSDL1_1.WSDL1_1Package#getAnyAttribute_ProcessContents()
	 * @model required="true"
	 * @generated
	 */
	processContentsValue getProcessContents();

	/**
	 * Sets the value of the '{@link WSDL1_1.AnyAttribute#getProcessContents <em>Process Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Contents</em>' attribute.
	 * @see WSDL1_1.processContentsValue
	 * @see #getProcessContents()
	 * @generated
	 */
	void setProcessContents(processContentsValue value);

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
	 * @see WSDL1_1.WSDL1_1Package#getAnyAttribute_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link WSDL1_1.AnyAttribute#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference.
	 * @see #setAnnotation(Annotation)
	 * @see WSDL1_1.WSDL1_1Package#getAnyAttribute_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	Annotation getAnnotation();

	/**
	 * Sets the value of the '{@link WSDL1_1.AnyAttribute#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(Annotation value);

} // AnyAttribute
