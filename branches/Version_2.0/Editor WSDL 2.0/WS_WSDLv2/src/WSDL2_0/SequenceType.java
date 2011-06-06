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
 * A representation of the model object '<em><b>Sequence Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL2_0.SequenceType#getMinOccurs <em>Min Occurs</em>}</li>
 *   <li>{@link WSDL2_0.SequenceType#getMaxOccurs <em>Max Occurs</em>}</li>
 *   <li>{@link WSDL2_0.SequenceType#getId <em>Id</em>}</li>
 *   <li>{@link WSDL2_0.SequenceType#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link WSDL2_0.SequenceType#getElement <em>Element</em>}</li>
 *   <li>{@link WSDL2_0.SequenceType#getGroup <em>Group</em>}</li>
 *   <li>{@link WSDL2_0.SequenceType#getChoice <em>Choice</em>}</li>
 *   <li>{@link WSDL2_0.SequenceType#getSequenceDef <em>Sequence Def</em>}</li>
 *   <li>{@link WSDL2_0.SequenceType#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL2_0.WSDL2_0Package#getSequenceType()
 * @model
 * @generated
 */
public interface SequenceType extends EObject {
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
	 * @see WSDL2_0.WSDL2_0Package#getSequenceType_MinOccurs()
	 * @model
	 * @generated
	 */
	Integer getMinOccurs();

	/**
	 * Sets the value of the '{@link WSDL2_0.SequenceType#getMinOccurs <em>Min Occurs</em>}' attribute.
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
	 * @see WSDL2_0.WSDL2_0Package#getSequenceType_MaxOccurs()
	 * @model
	 * @generated
	 */
	String getMaxOccurs();

	/**
	 * Sets the value of the '{@link WSDL2_0.SequenceType#getMaxOccurs <em>Max Occurs</em>}' attribute.
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
	 * @see WSDL2_0.WSDL2_0Package#getSequenceType_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link WSDL2_0.SequenceType#getId <em>Id</em>}' attribute.
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
	 * @see WSDL2_0.WSDL2_0Package#getSequenceType_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	Annotation getAnnotation();

	/**
	 * Sets the value of the '{@link WSDL2_0.SequenceType#getAnnotation <em>Annotation</em>}' containment reference.
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
	 * @see WSDL2_0.WSDL2_0Package#getSequenceType_Element()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElement();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL2_0.Group}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see WSDL2_0.WSDL2_0Package#getSequenceType_Group()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getGroup();

	/**
	 * Returns the value of the '<em><b>Choice</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL2_0.Choice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choice</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choice</em>' containment reference list.
	 * @see WSDL2_0.WSDL2_0Package#getSequenceType_Choice()
	 * @model containment="true"
	 * @generated
	 */
	EList<Choice> getChoice();

	/**
	 * Returns the value of the '<em><b>Sequence Def</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL2_0.SequenceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Def</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Def</em>' containment reference list.
	 * @see WSDL2_0.WSDL2_0Package#getSequenceType_SequenceDef()
	 * @model containment="true"
	 * @generated
	 */
	EList<SequenceType> getSequenceDef();

	/**
	 * Returns the value of the '<em><b>Any</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL2_0.Any}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' containment reference list.
	 * @see WSDL2_0.WSDL2_0Package#getSequenceType_Any()
	 * @model containment="true"
	 * @generated
	 */
	EList<Any> getAny();

} // SequenceType
