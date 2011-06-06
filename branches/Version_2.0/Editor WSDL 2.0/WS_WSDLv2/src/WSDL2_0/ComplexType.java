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
 * A representation of the model object '<em><b>Complex Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL2_0.ComplexType#getName <em>Name</em>}</li>
 *   <li>{@link WSDL2_0.ComplexType#getId <em>Id</em>}</li>
 *   <li>{@link WSDL2_0.ComplexType#getAbstractDef <em>Abstract Def</em>}</li>
 *   <li>{@link WSDL2_0.ComplexType#getFinal <em>Final</em>}</li>
 *   <li>{@link WSDL2_0.ComplexType#getBlock <em>Block</em>}</li>
 *   <li>{@link WSDL2_0.ComplexType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link WSDL2_0.ComplexType#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link WSDL2_0.ComplexType#getSimpleContent <em>Simple Content</em>}</li>
 *   <li>{@link WSDL2_0.ComplexType#getComplexContent <em>Complex Content</em>}</li>
 *   <li>{@link WSDL2_0.ComplexType#getAll <em>All</em>}</li>
 *   <li>{@link WSDL2_0.ComplexType#getChoice <em>Choice</em>}</li>
 *   <li>{@link WSDL2_0.ComplexType#getSequenceDef <em>Sequence Def</em>}</li>
 *   <li>{@link WSDL2_0.ComplexType#getGroup <em>Group</em>}</li>
 *   <li>{@link WSDL2_0.ComplexType#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link WSDL2_0.ComplexType#getAttributeGroup <em>Attribute Group</em>}</li>
 *   <li>{@link WSDL2_0.ComplexType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL2_0.WSDL2_0Package#getComplexType()
 * @model
 * @generated
 */
public interface ComplexType extends TypeRef {
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
	 * @see WSDL2_0.WSDL2_0Package#getComplexType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link WSDL2_0.ComplexType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see WSDL2_0.WSDL2_0Package#getComplexType_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link WSDL2_0.ComplexType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Abstract Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Def</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Def</em>' attribute.
	 * @see #setAbstractDef(Boolean)
	 * @see WSDL2_0.WSDL2_0Package#getComplexType_AbstractDef()
	 * @model
	 * @generated
	 */
	Boolean getAbstractDef();

	/**
	 * Sets the value of the '{@link WSDL2_0.ComplexType#getAbstractDef <em>Abstract Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract Def</em>' attribute.
	 * @see #getAbstractDef()
	 * @generated
	 */
	void setAbstractDef(Boolean value);

	/**
	 * Returns the value of the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' attribute.
	 * @see #setFinal(String)
	 * @see WSDL2_0.WSDL2_0Package#getComplexType_Final()
	 * @model
	 * @generated
	 */
	String getFinal();

	/**
	 * Sets the value of the '{@link WSDL2_0.ComplexType#getFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' attribute.
	 * @see #getFinal()
	 * @generated
	 */
	void setFinal(String value);

	/**
	 * Returns the value of the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' attribute.
	 * @see #setBlock(String)
	 * @see WSDL2_0.WSDL2_0Package#getComplexType_Block()
	 * @model
	 * @generated
	 */
	String getBlock();

	/**
	 * Sets the value of the '{@link WSDL2_0.ComplexType#getBlock <em>Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' attribute.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(String value);

	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute.
	 * @see #setMixed(Boolean)
	 * @see WSDL2_0.WSDL2_0Package#getComplexType_Mixed()
	 * @model required="true"
	 * @generated
	 */
	Boolean getMixed();

	/**
	 * Sets the value of the '{@link WSDL2_0.ComplexType#getMixed <em>Mixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mixed</em>' attribute.
	 * @see #getMixed()
	 * @generated
	 */
	void setMixed(Boolean value);

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
	 * @see WSDL2_0.WSDL2_0Package#getComplexType_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	Annotation getAnnotation();

	/**
	 * Sets the value of the '{@link WSDL2_0.ComplexType#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>Simple Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Content</em>' containment reference.
	 * @see #setSimpleContent(SimpleContent)
	 * @see WSDL2_0.WSDL2_0Package#getComplexType_SimpleContent()
	 * @model containment="true"
	 * @generated
	 */
	SimpleContent getSimpleContent();

	/**
	 * Sets the value of the '{@link WSDL2_0.ComplexType#getSimpleContent <em>Simple Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Content</em>' containment reference.
	 * @see #getSimpleContent()
	 * @generated
	 */
	void setSimpleContent(SimpleContent value);

	/**
	 * Returns the value of the '<em><b>Complex Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complex Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Content</em>' containment reference.
	 * @see #setComplexContent(ComplexContent)
	 * @see WSDL2_0.WSDL2_0Package#getComplexType_ComplexContent()
	 * @model containment="true"
	 * @generated
	 */
	ComplexContent getComplexContent();

	/**
	 * Sets the value of the '{@link WSDL2_0.ComplexType#getComplexContent <em>Complex Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complex Content</em>' containment reference.
	 * @see #getComplexContent()
	 * @generated
	 */
	void setComplexContent(ComplexContent value);

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
	 * @see WSDL2_0.WSDL2_0Package#getComplexType_All()
	 * @model containment="true"
	 * @generated
	 */
	All getAll();

	/**
	 * Sets the value of the '{@link WSDL2_0.ComplexType#getAll <em>All</em>}' containment reference.
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
	 * @see WSDL2_0.WSDL2_0Package#getComplexType_Choice()
	 * @model containment="true"
	 * @generated
	 */
	Choice getChoice();

	/**
	 * Sets the value of the '{@link WSDL2_0.ComplexType#getChoice <em>Choice</em>}' containment reference.
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
	 * @see WSDL2_0.WSDL2_0Package#getComplexType_SequenceDef()
	 * @model containment="true"
	 * @generated
	 */
	SequenceType getSequenceDef();

	/**
	 * Sets the value of the '{@link WSDL2_0.ComplexType#getSequenceDef <em>Sequence Def</em>}' containment reference.
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
	 * @see WSDL2_0.WSDL2_0Package#getComplexType_Group()
	 * @model containment="true"
	 * @generated
	 */
	Group getGroup();

	/**
	 * Sets the value of the '{@link WSDL2_0.ComplexType#getGroup <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' containment reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(Group value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL2_0.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see WSDL2_0.WSDL2_0Package#getComplexType_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>Attribute Group</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL2_0.AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Group</em>' containment reference list.
	 * @see WSDL2_0.WSDL2_0Package#getComplexType_AttributeGroup()
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
	 * @see WSDL2_0.WSDL2_0Package#getComplexType_AnyAttribute()
	 * @model containment="true"
	 * @generated
	 */
	AnyAttribute getAnyAttribute();

	/**
	 * Sets the value of the '{@link WSDL2_0.ComplexType#getAnyAttribute <em>Any Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Any Attribute</em>' containment reference.
	 * @see #getAnyAttribute()
	 * @generated
	 */
	void setAnyAttribute(AnyAttribute value);

} // ComplexType
