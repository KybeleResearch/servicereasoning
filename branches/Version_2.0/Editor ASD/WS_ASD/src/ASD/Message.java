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
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ASD.Message#getRole <em>Role</em>}</li>
 *   <li>{@link ASD.Message#getSubset <em>Subset</em>}</li>
 *   <li>{@link ASD.Message#getInfoType <em>Info Type</em>}</li>
 *   <li>{@link ASD.Message#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see ASD.ASDPackage#getMessage()
 * @model annotation="gmf.node label='name' figure='rectangle' color='193,255,193'"
 * @generated
 */
public interface Message extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The literals are from the enumeration {@link ASD.EEnumMes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see ASD.EEnumMes
	 * @see #setRole(EEnumMes)
	 * @see ASD.ASDPackage#getMessage_Role()
	 * @model
	 * @generated
	 */
	EEnumMes getRole();

	/**
	 * Sets the value of the '{@link ASD.Message#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see ASD.EEnumMes
	 * @see #getRole()
	 * @generated
	 */
	void setRole(EEnumMes value);

	/**
	 * Returns the value of the '<em><b>Subset</b></em>' attribute.
	 * The literals are from the enumeration {@link ASD.EEnumSubset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subset</em>' attribute.
	 * @see ASD.EEnumSubset
	 * @see #setSubset(EEnumSubset)
	 * @see ASD.ASDPackage#getMessage_Subset()
	 * @model derived="true"
	 * @generated
	 */
	EEnumSubset getSubset();

	/**
	 * Sets the value of the '{@link ASD.Message#getSubset <em>Subset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subset</em>' attribute.
	 * @see ASD.EEnumSubset
	 * @see #getSubset()
	 * @generated
	 */
	void setSubset(EEnumSubset value);

	/**
	 * Returns the value of the '<em><b>Info Type</b></em>' reference list.
	 * The list contents are of type {@link ASD.InfoType}.
	 * It is bidirectional and its opposite is '{@link ASD.InfoType#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info Type</em>' reference list.
	 * @see ASD.ASDPackage#getMessage_InfoType()
	 * @see ASD.InfoType#getMessage
	 * @model opposite="message" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dot' tool.description='Relationship between Message and InfoType'"
	 * @generated
	 */
	EList<InfoType> getInfoType();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ASD.Operation#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' container reference.
	 * @see #setOperation(Operation)
	 * @see ASD.ASDPackage#getMessage_Operation()
	 * @see ASD.Operation#getContents
	 * @model opposite="contents" transient="false"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link ASD.Message#getOperation <em>Operation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' container reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

} // Message
