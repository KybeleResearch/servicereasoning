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
 * A representation of the model object '<em><b>Element Imported</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL1_1.ElementImported#getUrl <em>Url</em>}</li>
 *   <li>{@link WSDL1_1.ElementImported#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link WSDL1_1.ElementImported#getOrig <em>Orig</em>}</li>
 *   <li>{@link WSDL1_1.ElementImported#getPart <em>Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL1_1.WSDL1_1Package#getElementImported()
 * @model
 * @generated
 */
public interface ElementImported extends Element {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see WSDL1_1.WSDL1_1Package#getElementImported_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link WSDL1_1.ElementImported#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

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
	 * @see WSDL1_1.WSDL1_1Package#getElementImported_Namespace()
	 * @model
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link WSDL1_1.ElementImported#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Orig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orig</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orig</em>' attribute.
	 * @see #setOrig(String)
	 * @see WSDL1_1.WSDL1_1Package#getElementImported_Orig()
	 * @model
	 * @generated
	 */
	String getOrig();

	/**
	 * Sets the value of the '{@link WSDL1_1.ElementImported#getOrig <em>Orig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orig</em>' attribute.
	 * @see #getOrig()
	 * @generated
	 */
	void setOrig(String value);

	/**
	 * Returns the value of the '<em><b>Part</b></em>' reference list.
	 * The list contents are of type {@link WSDL1_1.Part}.
	 * It is bidirectional and its opposite is '{@link WSDL1_1.Part#getElementImported <em>Element Imported</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' reference list.
	 * @see WSDL1_1.WSDL1_1Package#getElementImported_Part()
	 * @see WSDL1_1.Part#getElementImported
	 * @model opposite="elementImported"
	 * @generated
	 */
	EList<Part> getPart();

} // ElementImported
