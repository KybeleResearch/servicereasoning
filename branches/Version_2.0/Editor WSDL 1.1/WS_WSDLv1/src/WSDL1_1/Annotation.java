/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL1_1;

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
 *   <li>{@link WSDL1_1.Annotation#getAppinfo <em>Appinfo</em>}</li>
 *   <li>{@link WSDL1_1.Annotation#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL1_1.WSDL1_1Package#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends EObject {
	/**
	 * Returns the value of the '<em><b>Appinfo</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.AppInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appinfo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appinfo</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getAnnotation_Appinfo()
	 * @model containment="true"
	 * @generated
	 */
	EList<AppInfo> getAppinfo();

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL1_1.DocumentationXMLSchema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference list.
	 * @see WSDL1_1.WSDL1_1Package#getAnnotation_Documentation()
	 * @model containment="true"
	 * @generated
	 */
	EList<DocumentationXMLSchema> getDocumentation();

} // Annotation
