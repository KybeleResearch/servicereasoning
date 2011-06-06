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
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WSDL2_0.Interface#getName <em>Name</em>}</li>
 *   <li>{@link WSDL2_0.Interface#getStyleDefault <em>Style Default</em>}</li>
 *   <li>{@link WSDL2_0.Interface#getFault <em>Fault</em>}</li>
 *   <li>{@link WSDL2_0.Interface#getOperation <em>Operation</em>}</li>
 *   <li>{@link WSDL2_0.Interface#getExtendsDef <em>Extends Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see WSDL2_0.WSDL2_0Package#getInterface()
 * @model
 * @generated
 */
public interface Interface extends WSDL2_0.Object {
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
	 * @see WSDL2_0.WSDL2_0Package#getInterface_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link WSDL2_0.Interface#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Style Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Default</em>' attribute.
	 * @see #setStyleDefault(String)
	 * @see WSDL2_0.WSDL2_0Package#getInterface_StyleDefault()
	 * @model
	 * @generated
	 */
	String getStyleDefault();

	/**
	 * Sets the value of the '{@link WSDL2_0.Interface#getStyleDefault <em>Style Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Default</em>' attribute.
	 * @see #getStyleDefault()
	 * @generated
	 */
	void setStyleDefault(String value);

	/**
	 * Returns the value of the '<em><b>Fault</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL2_0.InterfaceFault}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault</em>' containment reference list.
	 * @see WSDL2_0.WSDL2_0Package#getInterface_Fault()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceFault> getFault();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link WSDL2_0.InterfaceOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see WSDL2_0.WSDL2_0Package#getInterface_Operation()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceOperation> getOperation();

	/**
	 * Returns the value of the '<em><b>Extends Def</b></em>' reference list.
	 * The list contents are of type {@link WSDL2_0.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends Def</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends Def</em>' reference list.
	 * @see WSDL2_0.WSDL2_0Package#getInterface_ExtendsDef()
	 * @model
	 * @generated
	 */
	EList<Interface> getExtendsDef();

} // Interface
