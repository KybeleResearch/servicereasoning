/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package XML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link XML.Element#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see XML.XMLPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends Node {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link XML.Node}.
	 * It is bidirectional and its opposite is '{@link XML.Node#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see XML.XMLPackage#getElement_Children()
	 * @see XML.Node#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Node> getChildren();

} // Element
