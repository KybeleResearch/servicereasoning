/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ASD;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ASD.Operation#getMessagePattern <em>Message Pattern</em>}</li>
 *   <li>{@link ASD.Operation#getContents <em>Contents</em>}</li>
 *   <li>{@link ASD.Operation#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see ASD.ASDPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Message Pattern</b></em>' attribute.
	 * The literals are from the enumeration {@link ASD.EEnumOp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Pattern</em>' attribute.
	 * @see ASD.EEnumOp
	 * @see #setMessagePattern(EEnumOp)
	 * @see ASD.ASDPackage#getOperation_MessagePattern()
	 * @model
	 * @generated
	 */
	EEnumOp getMessagePattern();

	/**
	 * Sets the value of the '{@link ASD.Operation#getMessagePattern <em>Message Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Pattern</em>' attribute.
	 * @see ASD.EEnumOp
	 * @see #getMessagePattern()
	 * @generated
	 */
	void setMessagePattern(EEnumOp value);

	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link ASD.Message}.
	 * It is bidirectional and its opposite is '{@link ASD.Message#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see ASD.ASDPackage#getOperation_Contents()
	 * @see ASD.Message#getOperation
	 * @model opposite="operation" containment="true" required="true"
	 * @generated
	 */
	EList<Message> getContents();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ASD.ServiceDescription#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' container reference.
	 * @see #setService(ServiceDescription)
	 * @see ASD.ASDPackage#getOperation_Service()
	 * @see ASD.ServiceDescription#getOperations
	 * @model opposite="operations" transient="false"
	 * @generated
	 */
	ServiceDescription getService();

	/**
	 * Sets the value of the '{@link ASD.Operation#getService <em>Service</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' container reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(ServiceDescription value);

} // Operation
