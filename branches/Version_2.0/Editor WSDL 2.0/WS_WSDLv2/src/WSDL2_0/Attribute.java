/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL2_0;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL2_0.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link WSDL2_0.Attribute#getId <em>Id</em>}</li>
 *   <li>{@link WSDL2_0.Attribute#getUse <em>Use</em>}</li>
 *   <li>{@link WSDL2_0.Attribute#getDefault <em>Default</em>}</li>
 *   <li>{@link WSDL2_0.Attribute#getFixed <em>Fixed</em>}</li>
 *   <li>{@link WSDL2_0.Attribute#getForm <em>Form</em>}</li>
 *   <li>{@link WSDL2_0.Attribute#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link WSDL2_0.Attribute#getSimpleType <em>Simple Type</em>}</li>
 *   <li>{@link WSDL2_0.Attribute#getRef <em>Ref</em>}</li>
 *   <li>{@link WSDL2_0.Attribute#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL2_0.WSDL2_0Package#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends AdicionalInformationType {
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
	 * @see WSDL2_0.WSDL2_0Package#getAttribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link WSDL2_0.Attribute#getName <em>Name</em>}' attribute.
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
	 * @see WSDL2_0.WSDL2_0Package#getAttribute_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link WSDL2_0.Attribute#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Use</b></em>' attribute.
	 * The literals are from the enumeration {@link WSDL2_0.usesValues}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' attribute.
	 * @see WSDL2_0.usesValues
	 * @see #setUse(usesValues)
	 * @see WSDL2_0.WSDL2_0Package#getAttribute_Use()
	 * @model
	 * @generated
	 */
	usesValues getUse();

	/**
	 * Sets the value of the '{@link WSDL2_0.Attribute#getUse <em>Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' attribute.
	 * @see WSDL2_0.usesValues
	 * @see #getUse()
	 * @generated
	 */
	void setUse(usesValues value);

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
	 * @see WSDL2_0.WSDL2_0Package#getAttribute_Default()
	 * @model
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link WSDL2_0.Attribute#getDefault <em>Default</em>}' attribute.
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
	 * @see WSDL2_0.WSDL2_0Package#getAttribute_Fixed()
	 * @model
	 * @generated
	 */
	String getFixed();

	/**
	 * Sets the value of the '{@link WSDL2_0.Attribute#getFixed <em>Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed</em>' attribute.
	 * @see #getFixed()
	 * @generated
	 */
	void setFixed(String value);

	/**
	 * Returns the value of the '<em><b>Form</b></em>' attribute.
	 * The literals are from the enumeration {@link WSDL2_0.formValues}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form</em>' attribute.
	 * @see WSDL2_0.formValues
	 * @see #setForm(formValues)
	 * @see WSDL2_0.WSDL2_0Package#getAttribute_Form()
	 * @model
	 * @generated
	 */
	formValues getForm();

	/**
	 * Sets the value of the '{@link WSDL2_0.Attribute#getForm <em>Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form</em>' attribute.
	 * @see WSDL2_0.formValues
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
	 * @see WSDL2_0.WSDL2_0Package#getAttribute_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	Annotation getAnnotation();

	/**
	 * Sets the value of the '{@link WSDL2_0.Attribute#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(Annotation value);

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
	 * @see WSDL2_0.WSDL2_0Package#getAttribute_SimpleType()
	 * @model containment="true"
	 * @generated
	 */
	SimpleType getSimpleType();

	/**
	 * Sets the value of the '{@link WSDL2_0.Attribute#getSimpleType <em>Simple Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Type</em>' containment reference.
	 * @see #getSimpleType()
	 * @generated
	 */
	void setSimpleType(SimpleType value);

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(Attribute)
	 * @see WSDL2_0.WSDL2_0Package#getAttribute_Ref()
	 * @model
	 * @generated
	 */
	Attribute getRef();

	/**
	 * Sets the value of the '{@link WSDL2_0.Attribute#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(Attribute value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(SimpleType)
	 * @see WSDL2_0.WSDL2_0Package#getAttribute_Type()
	 * @model
	 * @generated
	 */
	SimpleType getType();

	/**
	 * Sets the value of the '{@link WSDL2_0.Attribute#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(SimpleType value);

} // Attribute
