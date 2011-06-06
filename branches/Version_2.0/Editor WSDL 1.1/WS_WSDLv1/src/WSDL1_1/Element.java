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
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL1_1.Element#getName <em>Name</em>}</li>
 *   <li>{@link WSDL1_1.Element#getId <em>Id</em>}</li>
 *   <li>{@link WSDL1_1.Element#getMinOccurs <em>Min Occurs</em>}</li>
 *   <li>{@link WSDL1_1.Element#getMaxOccurs <em>Max Occurs</em>}</li>
 *   <li>{@link WSDL1_1.Element#getNillable <em>Nillable</em>}</li>
 *   <li>{@link WSDL1_1.Element#getAbstractDef <em>Abstract Def</em>}</li>
 *   <li>{@link WSDL1_1.Element#getFinal <em>Final</em>}</li>
 *   <li>{@link WSDL1_1.Element#getBlock <em>Block</em>}</li>
 *   <li>{@link WSDL1_1.Element#getDefault <em>Default</em>}</li>
 *   <li>{@link WSDL1_1.Element#getFixed <em>Fixed</em>}</li>
 *   <li>{@link WSDL1_1.Element#getForm <em>Form</em>}</li>
 *   <li>{@link WSDL1_1.Element#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link WSDL1_1.Element#getComplexType <em>Complex Type</em>}</li>
 *   <li>{@link WSDL1_1.Element#getSimpleType <em>Simple Type</em>}</li>
 *   <li>{@link WSDL1_1.Element#getUniqueDef <em>Unique Def</em>}</li>
 *   <li>{@link WSDL1_1.Element#getKey <em>Key</em>}</li>
 *   <li>{@link WSDL1_1.Element#getKeyref <em>Keyref</em>}</li>
 *   <li>{@link WSDL1_1.Element#getRef <em>Ref</em>}</li>
 *   <li>{@link WSDL1_1.Element#getSubstitutionGroup <em>Substitution Group</em>}</li>
 *   <li>{@link WSDL1_1.Element#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL1_1.WSDL1_1Package#getElement()
 * @model
 * @generated
 */
public interface Element extends AdicionalInformationType {
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
	 * @see WSDL1_1.WSDL1_1Package#getElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link WSDL1_1.Element#getName <em>Name</em>}' attribute.
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
	 * @see WSDL1_1.WSDL1_1Package#getElement_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link WSDL1_1.Element#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see WSDL1_1.WSDL1_1Package#getElement_MinOccurs()
	 * @model
	 * @generated
	 */
	Integer getMinOccurs();

	/**
	 * Sets the value of the '{@link WSDL1_1.Element#getMinOccurs <em>Min Occurs</em>}' attribute.
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
	 * @see WSDL1_1.WSDL1_1Package#getElement_MaxOccurs()
	 * @model
	 * @generated
	 */
	String getMaxOccurs();

	/**
	 * Sets the value of the '{@link WSDL1_1.Element#getMaxOccurs <em>Max Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Occurs</em>' attribute.
	 * @see #getMaxOccurs()
	 * @generated
	 */
	void setMaxOccurs(String value);

	/**
	 * Returns the value of the '<em><b>Nillable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nillable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nillable</em>' attribute.
	 * @see #setNillable(Boolean)
	 * @see WSDL1_1.WSDL1_1Package#getElement_Nillable()
	 * @model
	 * @generated
	 */
	Boolean getNillable();

	/**
	 * Sets the value of the '{@link WSDL1_1.Element#getNillable <em>Nillable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nillable</em>' attribute.
	 * @see #getNillable()
	 * @generated
	 */
	void setNillable(Boolean value);

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
	 * @see WSDL1_1.WSDL1_1Package#getElement_AbstractDef()
	 * @model
	 * @generated
	 */
	Boolean getAbstractDef();

	/**
	 * Sets the value of the '{@link WSDL1_1.Element#getAbstractDef <em>Abstract Def</em>}' attribute.
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
	 * @see WSDL1_1.WSDL1_1Package#getElement_Final()
	 * @model
	 * @generated
	 */
	String getFinal();

	/**
	 * Sets the value of the '{@link WSDL1_1.Element#getFinal <em>Final</em>}' attribute.
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
	 * @see WSDL1_1.WSDL1_1Package#getElement_Block()
	 * @model
	 * @generated
	 */
	String getBlock();

	/**
	 * Sets the value of the '{@link WSDL1_1.Element#getBlock <em>Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' attribute.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(String value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(String)
	 * @see WSDL1_1.WSDL1_1Package#getElement_Default()
	 * @model
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link WSDL1_1.Element#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

	/**
	 * Returns the value of the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed</em>' attribute.
	 * @see #setFixed(String)
	 * @see WSDL1_1.WSDL1_1Package#getElement_Fixed()
	 * @model
	 * @generated
	 */
	String getFixed();

	/**
	 * Sets the value of the '{@link WSDL1_1.Element#getFixed <em>Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed</em>' attribute.
	 * @see #getFixed()
	 * @generated
	 */
	void setFixed(String value);

	/**
	 * Returns the value of the '<em><b>Form</b></em>' attribute.
	 * The literals are from the enumeration {@link WSDL1_1.formValues}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form</em>' attribute.
	 * @see WSDL1_1.formValues
	 * @see #setForm(formValues)
	 * @see WSDL1_1.WSDL1_1Package#getElement_Form()
	 * @model
	 * @generated
	 */
	formValues getForm();

	/**
	 * Sets the value of the '{@link WSDL1_1.Element#getForm <em>Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form</em>' attribute.
	 * @see WSDL1_1.formValues
	 * @see #getForm()
	 * @generated
	 */
	void setForm(formValues value);

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
	 * @see WSDL1_1.WSDL1_1Package#getElement_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	Annotation getAnnotation();

	/**
	 * Sets the value of the '{@link WSDL1_1.Element#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>Complex Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complex Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Type</em>' containment reference.
	 * @see #setComplexType(ComplexType)
	 * @see WSDL1_1.WSDL1_1Package#getElement_ComplexType()
	 * @model containment="true"
	 * @generated
	 */
	ComplexType getComplexType();

	/**
	 * Sets the value of the '{@link WSDL1_1.Element#getComplexType <em>Complex Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complex Type</em>' containment reference.
	 * @see #getComplexType()
	 * @generated
	 */
	void setComplexType(ComplexType value);

	/**
	 * Returns the value of the '<em><b>Simple Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Type</em>' containment reference.
	 * @see #setSimpleType(SimpleType)
	 * @see WSDL1_1.WSDL1_1Package#getElement_SimpleType()
	 * @model containment="true"
	 * @generated
	 */
	SimpleType getSimpleType();

	/**
	 * Sets the value of the '{@link WSDL1_1.Element#getSimpleType <em>Simple Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Type</em>' containment reference.
	 * @see #getSimpleType()
	 * @generated
	 */
	void setSimpleType(SimpleType value);

	/**
	 * Returns the value of the '<em><b>Unique Def</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.Unique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique Def</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Def</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getElement_UniqueDef()
	 * @model containment="true"
	 * @generated
	 */
	EList<Unique> getUniqueDef();

	/**
	 * Returns the value of the '<em><b>Key</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.Key}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getElement_Key()
	 * @model containment="true"
	 * @generated
	 */
	EList<Key> getKey();

	/**
	 * Returns the value of the '<em><b>Keyref</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.KeyRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keyref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyref</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getElement_Keyref()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeyRef> getKeyref();

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(Element)
	 * @see WSDL1_1.WSDL1_1Package#getElement_Ref()
	 * @model
	 * @generated
	 */
	Element getRef();

	/**
	 * Sets the value of the '{@link WSDL1_1.Element#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(Element value);

	/**
	 * Returns the value of the '<em><b>Substitution Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substitution Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substitution Group</em>' reference.
	 * @see #setSubstitutionGroup(Element)
	 * @see WSDL1_1.WSDL1_1Package#getElement_SubstitutionGroup()
	 * @model
	 * @generated
	 */
	Element getSubstitutionGroup();

	/**
	 * Sets the value of the '{@link WSDL1_1.Element#getSubstitutionGroup <em>Substitution Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substitution Group</em>' reference.
	 * @see #getSubstitutionGroup()
	 * @generated
	 */
	void setSubstitutionGroup(Element value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TypeRef)
	 * @see WSDL1_1.WSDL1_1Package#getElement_Type()
	 * @model
	 * @generated
	 */
	TypeRef getType();

	/**
	 * Sets the value of the '{@link WSDL1_1.Element#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeRef value);

} // Element
