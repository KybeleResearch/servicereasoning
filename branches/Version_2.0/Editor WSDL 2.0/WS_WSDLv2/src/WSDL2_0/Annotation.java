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
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL2_0.Annotation#getAppinfo <em>Appinfo</em>}</li>
 *   <li>{@link WSDL2_0.Annotation#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL2_0.WSDL2_0Package#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends EObject {
	/**
	 * Returns the value of the '<em><b>Appinfo</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL2_0.AppInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appinfo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appinfo</em>' containment reference list.
	 * @see WSDL2_0.WSDL2_0Package#getAnnotation_Appinfo()
	 * @model containment="true"
	 * @generated
	 */
	EList<AppInfo> getAppinfo();

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL2_0.DocumentationXMLSchema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference list.
	 * @see WSDL2_0.WSDL2_0Package#getAnnotation_Documentation()
	 * @model containment="true"
	 * @generated
	 */
	EList<DocumentationXMLSchema> getDocumentation();

} // Annotation
