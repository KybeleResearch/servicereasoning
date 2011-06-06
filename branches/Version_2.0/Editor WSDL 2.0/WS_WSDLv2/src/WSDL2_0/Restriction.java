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
 * A representation of the model object '<em><b>Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL2_0.Restriction#getId <em>Id</em>}</li>
 *   <li>{@link WSDL2_0.Restriction#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link WSDL2_0.Restriction#getAll <em>All</em>}</li>
 *   <li>{@link WSDL2_0.Restriction#getChoice <em>Choice</em>}</li>
 *   <li>{@link WSDL2_0.Restriction#getSequenceDef <em>Sequence Def</em>}</li>
 *   <li>{@link WSDL2_0.Restriction#getGroup <em>Group</em>}</li>
 *   <li>{@link WSDL2_0.Restriction#getSimpleType <em>Simple Type</em>}</li>
 *   <li>{@link WSDL2_0.Restriction#getMinExclusive <em>Min Exclusive</em>}</li>
 *   <li>{@link WSDL2_0.Restriction#getMinInclusive <em>Min Inclusive</em>}</li>
 *   <li>{@link WSDL2_0.Restriction#getMaxExclusive <em>Max Exclusive</em>}</li>
 *   <li>{@link WSDL2_0.Restriction#getMaxInclusive <em>Max Inclusive</em>}</li>
 *   <li>{@link WSDL2_0.Restriction#getTotalDigits <em>Total Digits</em>}</li>
 *   <li>{@link WSDL2_0.Restriction#getFractionDigits <em>Fraction Digits</em>}</li>
 *   <li>{@link WSDL2_0.Restriction#getPattern <em>Pattern</em>}</li>
 *   <li>{@link WSDL2_0.Restriction#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link WSDL2_0.Restriction#getWhiteSpace <em>White Space</em>}</li>
 *   <li>{@link WSDL2_0.Restriction#getLength <em>Length</em>}</li>
 *   <li>{@link WSDL2_0.Restriction#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link WSDL2_0.Restriction#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link WSDL2_0.Restriction#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link WSDL2_0.Restriction#getAttributeGroup <em>Attribute Group</em>}</li>
 *   <li>{@link WSDL2_0.Restriction#getAnyAttribute <em>Any Attribute</em>}</li>
 *   <li>{@link WSDL2_0.Restriction#getBase <em>Base</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL2_0.WSDL2_0Package#getRestriction()
 * @model
 * @generated
 */
public interface Restriction extends AdicionalInformationType {
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
	 * @see WSDL2_0.WSDL2_0Package#getRestriction_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link WSDL2_0.Restriction#getId <em>Id</em>}' attribute.
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
	 * @see WSDL2_0.WSDL2_0Package#getRestriction_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	Annotation getAnnotation();

	/**
	 * Sets the value of the '{@link WSDL2_0.Restriction#getAnnotation <em>Annotation</em>}' containment reference.
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
	 * @see WSDL2_0.WSDL2_0Package#getRestriction_All()
	 * @model containment="true"
	 * @generated
	 */
	All getAll();

	/**
	 * Sets the value of the '{@link WSDL2_0.Restriction#getAll <em>All</em>}' containment reference.
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
	 * @see WSDL2_0.WSDL2_0Package#getRestriction_Choice()
	 * @model containment="true"
	 * @generated
	 */
	Choice getChoice();

	/**
	 * Sets the value of the '{@link WSDL2_0.Restriction#getChoice <em>Choice</em>}' containment reference.
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
	 * @see WSDL2_0.WSDL2_0Package#getRestriction_SequenceDef()
	 * @model containment="true"
	 * @generated
	 */
	SequenceType getSequenceDef();

	/**
	 * Sets the value of the '{@link WSDL2_0.Restriction#getSequenceDef <em>Sequence Def</em>}' containment reference.
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
	 * @see WSDL2_0.WSDL2_0Package#getRestriction_Group()
	 * @model containment="true"
	 * @generated
	 */
	Group getGroup();

	/**
	 * Sets the value of the '{@link WSDL2_0.Restriction#getGroup <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' containment reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(Group value);

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
	 * @see WSDL2_0.WSDL2_0Package#getRestriction_SimpleType()
	 * @model containment="true"
	 * @generated
	 */
	SimpleType getSimpleType();

	/**
	 * Sets the value of the '{@link WSDL2_0.Restriction#getSimpleType <em>Simple Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Type</em>' containment reference.
	 * @see #getSimpleType()
	 * @generated
	 */
	void setSimpleType(SimpleType value);

	/**
	 * Returns the value of the '<em><b>Min Exclusive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Exclusive</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Exclusive</em>' containment reference.
	 * @see #setMinExclusive(MinExclusive)
	 * @see WSDL2_0.WSDL2_0Package#getRestriction_MinExclusive()
	 * @model containment="true"
	 * @generated
	 */
	MinExclusive getMinExclusive();

	/**
	 * Sets the value of the '{@link WSDL2_0.Restriction#getMinExclusive <em>Min Exclusive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Exclusive</em>' containment reference.
	 * @see #getMinExclusive()
	 * @generated
	 */
	void setMinExclusive(MinExclusive value);

	/**
	 * Returns the value of the '<em><b>Min Inclusive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Inclusive</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Inclusive</em>' containment reference.
	 * @see #setMinInclusive(MinInclusive)
	 * @see WSDL2_0.WSDL2_0Package#getRestriction_MinInclusive()
	 * @model containment="true"
	 * @generated
	 */
	MinInclusive getMinInclusive();

	/**
	 * Sets the value of the '{@link WSDL2_0.Restriction#getMinInclusive <em>Min Inclusive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Inclusive</em>' containment reference.
	 * @see #getMinInclusive()
	 * @generated
	 */
	void setMinInclusive(MinInclusive value);

	/**
	 * Returns the value of the '<em><b>Max Exclusive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Exclusive</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Exclusive</em>' containment reference.
	 * @see #setMaxExclusive(MaxExclusive)
	 * @see WSDL2_0.WSDL2_0Package#getRestriction_MaxExclusive()
	 * @model containment="true"
	 * @generated
	 */
	MaxExclusive getMaxExclusive();

	/**
	 * Sets the value of the '{@link WSDL2_0.Restriction#getMaxExclusive <em>Max Exclusive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Exclusive</em>' containment reference.
	 * @see #getMaxExclusive()
	 * @generated
	 */
	void setMaxExclusive(MaxExclusive value);

	/**
	 * Returns the value of the '<em><b>Max Inclusive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Inclusive</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Inclusive</em>' containment reference.
	 * @see #setMaxInclusive(MaxInclusive)
	 * @see WSDL2_0.WSDL2_0Package#getRestriction_MaxInclusive()
	 * @model containment="true"
	 * @generated
	 */
	MaxInclusive getMaxInclusive();

	/**
	 * Sets the value of the '{@link WSDL2_0.Restriction#getMaxInclusive <em>Max Inclusive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Inclusive</em>' containment reference.
	 * @see #getMaxInclusive()
	 * @generated
	 */
	void setMaxInclusive(MaxInclusive value);

	/**
	 * Returns the value of the '<em><b>Total Digits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Digits</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Digits</em>' containment reference.
	 * @see #setTotalDigits(TotalDigits)
	 * @see WSDL2_0.WSDL2_0Package#getRestriction_TotalDigits()
	 * @model containment="true"
	 * @generated
	 */
	TotalDigits getTotalDigits();

	/**
	 * Sets the value of the '{@link WSDL2_0.Restriction#getTotalDigits <em>Total Digits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Digits</em>' containment reference.
	 * @see #getTotalDigits()
	 * @generated
	 */
	void setTotalDigits(TotalDigits value);

	/**
	 * Returns the value of the '<em><b>Fraction Digits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fraction Digits</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fraction Digits</em>' containment reference.
	 * @see #setFractionDigits(FractionDigits)
	 * @see WSDL2_0.WSDL2_0Package#getRestriction_FractionDigits()
	 * @model containment="true"
	 * @generated
	 */
	FractionDigits getFractionDigits();

	/**
	 * Sets the value of the '{@link WSDL2_0.Restriction#getFractionDigits <em>Fraction Digits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fraction Digits</em>' containment reference.
	 * @see #getFractionDigits()
	 * @generated
	 */
	void setFractionDigits(FractionDigits value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' containment reference.
	 * @see #setPattern(Pattern)
	 * @see WSDL2_0.WSDL2_0Package#getRestriction_Pattern()
	 * @model containment="true"
	 * @generated
	 */
	Pattern getPattern();

	/**
	 * Sets the value of the '{@link WSDL2_0.Restriction#getPattern <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' containment reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(Pattern value);

	/**
	 * Returns the value of the '<em><b>Enumeration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration</em>' containment reference.
	 * @see #setEnumeration(Enumeration)
	 * @see WSDL2_0.WSDL2_0Package#getRestriction_Enumeration()
	 * @model containment="true"
	 * @generated
	 */
	Enumeration getEnumeration();

	/**
	 * Sets the value of the '{@link WSDL2_0.Restriction#getEnumeration <em>Enumeration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumeration</em>' containment reference.
	 * @see #getEnumeration()
	 * @generated
	 */
	void setEnumeration(Enumeration value);

	/**
	 * Returns the value of the '<em><b>White Space</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>White Space</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>White Space</em>' containment reference.
	 * @see #setWhiteSpace(WhiteSpace)
	 * @see WSDL2_0.WSDL2_0Package#getRestriction_WhiteSpace()
	 * @model containment="true"
	 * @generated
	 */
	WhiteSpace getWhiteSpace();

	/**
	 * Sets the value of the '{@link WSDL2_0.Restriction#getWhiteSpace <em>White Space</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>White Space</em>' containment reference.
	 * @see #getWhiteSpace()
	 * @generated
	 */
	void setWhiteSpace(WhiteSpace value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' containment reference.
	 * @see #setLength(Length)
	 * @see WSDL2_0.WSDL2_0Package#getRestriction_Length()
	 * @model containment="true"
	 * @generated
	 */
	Length getLength();

	/**
	 * Sets the value of the '{@link WSDL2_0.Restriction#getLength <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' containment reference.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(Length value);

	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Length</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Length</em>' containment reference.
	 * @see #setMaxLength(MaxLength)
	 * @see WSDL2_0.WSDL2_0Package#getRestriction_MaxLength()
	 * @model containment="true"
	 * @generated
	 */
	MaxLength getMaxLength();

	/**
	 * Sets the value of the '{@link WSDL2_0.Restriction#getMaxLength <em>Max Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' containment reference.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(MaxLength value);

	/**
	 * Returns the value of the '<em><b>Min Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Length</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Length</em>' containment reference.
	 * @see #setMinLength(MinLength)
	 * @see WSDL2_0.WSDL2_0Package#getRestriction_MinLength()
	 * @model containment="true"
	 * @generated
	 */
	MinLength getMinLength();

	/**
	 * Sets the value of the '{@link WSDL2_0.Restriction#getMinLength <em>Min Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Length</em>' containment reference.
	 * @see #getMinLength()
	 * @generated
	 */
	void setMinLength(MinLength value);

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
	 * @see WSDL2_0.WSDL2_0Package#getRestriction_Attribute()
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
	 * @see WSDL2_0.WSDL2_0Package#getRestriction_AttributeGroup()
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
	 * @see WSDL2_0.WSDL2_0Package#getRestriction_AnyAttribute()
	 * @model containment="true"
	 * @generated
	 */
	AnyAttribute getAnyAttribute();

	/**
	 * Sets the value of the '{@link WSDL2_0.Restriction#getAnyAttribute <em>Any Attribute</em>}' containment reference.
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
	 * @see WSDL2_0.WSDL2_0Package#getRestriction_Base()
	 * @model
	 * @generated
	 */
	TypeRef getBase();

	/**
	 * Sets the value of the '{@link WSDL2_0.Restriction#getBase <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(TypeRef value);

} // Restriction
