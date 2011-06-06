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
 * A representation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL1_1.Extension#getId <em>Id</em>}</li>
 *   <li>{@link WSDL1_1.Extension#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link WSDL1_1.Extension#getAll <em>All</em>}</li>
 *   <li>{@link WSDL1_1.Extension#getChoice <em>Choice</em>}</li>
 *   <li>{@link WSDL1_1.Extension#getSequenceDef <em>Sequence Def</em>}</li>
 *   <li>{@link WSDL1_1.Extension#getGroup <em>Group</em>}</li>
 *   <li>{@link WSDL1_1.Extension#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link WSDL1_1.Extension#getAttributeGroup <em>Attribute Group</em>}</li>
 *   <li>{@link WSDL1_1.Extension#getAnyAttribute <em>Any Attribute</em>}</li>
 *   <li>{@link WSDL1_1.Extension#getBase <em>Base</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL1_1.WSDL1_1Package#getExtension()
 * @model
 * @generated
 */
public interface Extension extends AdicionalInformationType {
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
	 * @see WSDL1_1.WSDL1_1Package#getExtension_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link WSDL1_1.Extension#getId <em>Id</em>}' attribute.
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
	 * @see WSDL1_1.WSDL1_1Package#getExtension_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	Annotation getAnnotation();

	/**
	 * Sets the value of the '{@link WSDL1_1.Extension#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All</em>' containment reference.
	 * @see #setAll(All)
	 * @see WSDL1_1.WSDL1_1Package#getExtension_All()
	 * @model containment="true"
	 * @generated
	 */
	All getAll();

	/**
	 * Sets the value of the '{@link WSDL1_1.Extension#getAll <em>All</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All</em>' containment reference.
	 * @see #getAll()
	 * @generated
	 */
	void setAll(All value);

	/**
	 * Returns the value of the '<em><b>Choice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choice</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choice</em>' containment reference.
	 * @see #setChoice(Choice)
	 * @see WSDL1_1.WSDL1_1Package#getExtension_Choice()
	 * @model containment="true"
	 * @generated
	 */
	Choice getChoice();

	/**
	 * Sets the value of the '{@link WSDL1_1.Extension#getChoice <em>Choice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Choice</em>' containment reference.
	 * @see #getChoice()
	 * @generated
	 */
	void setChoice(Choice value);

	/**
	 * Returns the value of the '<em><b>Sequence Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Def</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Def</em>' containment reference.
	 * @see #setSequenceDef(SequenceType)
	 * @see WSDL1_1.WSDL1_1Package#getExtension_SequenceDef()
	 * @model containment="true"
	 * @generated
	 */
	SequenceType getSequenceDef();

	/**
	 * Sets the value of the '{@link WSDL1_1.Extension#getSequenceDef <em>Sequence Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Def</em>' containment reference.
	 * @see #getSequenceDef()
	 * @generated
	 */
	void setSequenceDef(SequenceType value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference.
	 * @see #setGroup(Group)
	 * @see WSDL1_1.WSDL1_1Package#getExtension_Group()
	 * @model containment="true"
	 * @generated
	 */
	Group getGroup();

	/**
	 * Sets the value of the '{@link WSDL1_1.Extension#getGroup <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' containment reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(Group value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getExtension_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

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
	 * @see WSDL1_1.WSDL1_1Package#getExtension_AttributeGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeGroup> getAttributeGroup();

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' containment reference.
	 * @see #setAnyAttribute(AnyAttribute)
	 * @see WSDL1_1.WSDL1_1Package#getExtension_AnyAttribute()
	 * @model containment="true"
	 * @generated
	 */
	AnyAttribute getAnyAttribute();

	/**
	 * Sets the value of the '{@link WSDL1_1.Extension#getAnyAttribute <em>Any Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Any Attribute</em>' containment reference.
	 * @see #getAnyAttribute()
	 * @generated
	 */
	void setAnyAttribute(AnyAttribute value);

	/**
	 * Returns the value of the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' reference.
	 * @see #setBase(TypeRef)
	 * @see WSDL1_1.WSDL1_1Package#getExtension_Base()
	 * @model required="true"
	 * @generated
	 */
	TypeRef getBase();

	/**
	 * Sets the value of the '{@link WSDL1_1.Extension#getBase <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(TypeRef value);

} // Extension
