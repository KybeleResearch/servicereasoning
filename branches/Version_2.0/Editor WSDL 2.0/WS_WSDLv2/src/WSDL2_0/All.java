/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL2_0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL2_0.All#getMinOccurs <em>Min Occurs</em>}</li>
 *   <li>{@link WSDL2_0.All#getMaxOccurs <em>Max Occurs</em>}</li>
 *   <li>{@link WSDL2_0.All#getId <em>Id</em>}</li>
 *   <li>{@link WSDL2_0.All#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link WSDL2_0.All#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL2_0.WSDL2_0Package#getAll()
 * @model
 * @generated
 */
public interface All extends EObject {
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
	 * @see WSDL2_0.WSDL2_0Package#getAll_MinOccurs()
	 * @model
	 * @generated
	 */
	Integer getMinOccurs();

	/**
	 * Sets the value of the '{@link WSDL2_0.All#getMinOccurs <em>Min Occurs</em>}' attribute.
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
	 * @see WSDL2_0.WSDL2_0Package#getAll_MaxOccurs()
	 * @model
	 * @generated
	 */
	String getMaxOccurs();

	/**
	 * Sets the value of the '{@link WSDL2_0.All#getMaxOccurs <em>Max Occurs</em>}' attribute.
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
	 * @see WSDL2_0.WSDL2_0Package#getAll_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link WSDL2_0.All#getId <em>Id</em>}' attribute.
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
	 * @see WSDL2_0.WSDL2_0Package#getAll_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	Annotation getAnnotation();

	/**
	 * Sets the value of the '{@link WSDL2_0.All#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL2_0.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see WSDL2_0.WSDL2_0Package#getAll_Element()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElement();

} // All
