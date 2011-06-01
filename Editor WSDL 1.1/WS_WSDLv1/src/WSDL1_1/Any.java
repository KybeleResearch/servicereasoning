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
 * A representation of the model object '<em><b>Any</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL1_1.Any#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link WSDL1_1.Any#getProcessContents <em>Process Contents</em>}</li>
 *   <li>{@link WSDL1_1.Any#getMinOccurs <em>Min Occurs</em>}</li>
 *   <li>{@link WSDL1_1.Any#getMaxOccurs <em>Max Occurs</em>}</li>
 *   <li>{@link WSDL1_1.Any#getId <em>Id</em>}</li>
 *   <li>{@link WSDL1_1.Any#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL1_1.WSDL1_1Package#getAny()
 * @model
 * @generated
 */
public interface Any extends EObject {
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
	 * @see WSDL1_1.WSDL1_1Package#getAny_Namespace()
	 * @model required="true"
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link WSDL1_1.Any#getNamespace <em>Namespace</em>}' attribute.
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
	 * @see WSDL1_1.WSDL1_1Package#getAny_ProcessContents()
	 * @model required="true"
	 * @generated
	 */
	processContentsValue getProcessContents();

	/**
	 * Sets the value of the '{@link WSDL1_1.Any#getProcessContents <em>Process Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Contents</em>' attribute.
	 * @see WSDL1_1.processContentsValue
	 * @see #getProcessContents()
	 * @generated
	 */
	void setProcessContents(processContentsValue value);

	/**
	 * Returns the value of the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Occurs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Occurs</em>' attribute.
	 * @see #setMinOccurs(Integer)
	 * @see WSDL1_1.WSDL1_1Package#getAny_MinOccurs()
	 * @model required="true"
	 * @generated
	 */
	Integer getMinOccurs();

	/**
	 * Sets the value of the '{@link WSDL1_1.Any#getMinOccurs <em>Min Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Occurs</em>' attribute.
	 * @see #getMinOccurs()
	 * @generated
	 */
	void setMinOccurs(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Occurs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Occurs</em>' attribute.
	 * @see #setMaxOccurs(String)
	 * @see WSDL1_1.WSDL1_1Package#getAny_MaxOccurs()
	 * @model required="true"
	 * @generated
	 */
	String getMaxOccurs();

	/**
	 * Sets the value of the '{@link WSDL1_1.Any#getMaxOccurs <em>Max Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Occurs</em>' attribute.
	 * @see #getMaxOccurs()
	 * @generated
	 */
	void setMaxOccurs(String value);

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
	 * @see WSDL1_1.WSDL1_1Package#getAny_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link WSDL1_1.Any#getId <em>Id</em>}' attribute.
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
	 * @see WSDL1_1.WSDL1_1Package#getAny_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	Annotation getAnnotation();

	/**
	 * Sets the value of the '{@link WSDL1_1.Any#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(Annotation value);

} // Any
