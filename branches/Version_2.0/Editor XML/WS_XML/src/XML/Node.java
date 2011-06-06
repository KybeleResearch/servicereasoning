/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package XML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link XML.Node#getStartLine <em>Start Line</em>}</li>
 *   <li>{@link XML.Node#getStartColumn <em>Start Column</em>}</li>
 *   <li>{@link XML.Node#getEndLine <em>End Line</em>}</li>
 *   <li>{@link XML.Node#getEndColumn <em>End Column</em>}</li>
 *   <li>{@link XML.Node#getName <em>Name</em>}</li>
 *   <li>{@link XML.Node#getValue <em>Value</em>}</li>
 *   <li>{@link XML.Node#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see XML.XMLPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Start Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Line</em>' attribute.
	 * @see #setStartLine(Integer)
	 * @see XML.XMLPackage#getNode_StartLine()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	Integer getStartLine();

	/**
	 * Sets the value of the '{@link XML.Node#getStartLine <em>Start Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Line</em>' attribute.
	 * @see #getStartLine()
	 * @generated
	 */
	void setStartLine(Integer value);

	/**
	 * Returns the value of the '<em><b>Start Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Column</em>' attribute.
	 * @see #setStartColumn(Integer)
	 * @see XML.XMLPackage#getNode_StartColumn()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	Integer getStartColumn();

	/**
	 * Sets the value of the '{@link XML.Node#getStartColumn <em>Start Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Column</em>' attribute.
	 * @see #getStartColumn()
	 * @generated
	 */
	void setStartColumn(Integer value);

	/**
	 * Returns the value of the '<em><b>End Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Line</em>' attribute.
	 * @see #setEndLine(Integer)
	 * @see XML.XMLPackage#getNode_EndLine()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	Integer getEndLine();

	/**
	 * Sets the value of the '{@link XML.Node#getEndLine <em>End Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Line</em>' attribute.
	 * @see #getEndLine()
	 * @generated
	 */
	void setEndLine(Integer value);

	/**
	 * Returns the value of the '<em><b>End Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Column</em>' attribute.
	 * @see #setEndColumn(Integer)
	 * @see XML.XMLPackage#getNode_EndColumn()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	Integer getEndColumn();

	/**
	 * Sets the value of the '{@link XML.Node#getEndColumn <em>End Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Column</em>' attribute.
	 * @see #getEndColumn()
	 * @generated
	 */
	void setEndColumn(Integer value);

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
	 * @see XML.XMLPackage#getNode_Name()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link XML.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see XML.XMLPackage#getNode_Value()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link XML.Node#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link XML.Element#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Element)
	 * @see XML.XMLPackage#getNode_Parent()
	 * @see XML.Element#getChildren
	 * @model opposite="children" transient="false" ordered="false"
	 * @generated
	 */
	Element getParent();

	/**
	 * Sets the value of the '{@link XML.Node#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Element value);

} // Node
