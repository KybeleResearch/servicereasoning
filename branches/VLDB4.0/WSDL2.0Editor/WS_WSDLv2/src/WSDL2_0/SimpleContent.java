/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL2_0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL2_0.SimpleContent#getId <em>Id</em>}</li>
 *   <li>{@link WSDL2_0.SimpleContent#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link WSDL2_0.SimpleContent#getRestriction <em>Restriction</em>}</li>
 *   <li>{@link WSDL2_0.SimpleContent#getExtension <em>Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL2_0.WSDL2_0Package#getSimpleContent()
 * @model
 * @generated
 */
public interface SimpleContent extends EObject {
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
	 * @see WSDL2_0.WSDL2_0Package#getSimpleContent_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link WSDL2_0.SimpleContent#getId <em>Id</em>}' attribute.
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
	 * @see WSDL2_0.WSDL2_0Package#getSimpleContent_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	Annotation getAnnotation();

	/**
	 * Sets the value of the '{@link WSDL2_0.SimpleContent#getAnnotation <em>Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' containment reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restriction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restriction</em>' containment reference.
	 * @see #setRestriction(Restriction)
	 * @see WSDL2_0.WSDL2_0Package#getSimpleContent_Restriction()
	 * @model containment="true"
	 * @generated
	 */
	Restriction getRestriction();

	/**
	 * Sets the value of the '{@link WSDL2_0.SimpleContent#getRestriction <em>Restriction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restriction</em>' containment reference.
	 * @see #getRestriction()
	 * @generated
	 */
	void setRestriction(Restriction value);

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' containment reference.
	 * @see #setExtension(Extension)
	 * @see WSDL2_0.WSDL2_0Package#getSimpleContent_Extension()
	 * @model containment="true"
	 * @generated
	 */
	Extension getExtension();

	/**
	 * Sets the value of the '{@link WSDL2_0.SimpleContent#getExtension <em>Extension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' containment reference.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(Extension value);

} // SimpleContent
