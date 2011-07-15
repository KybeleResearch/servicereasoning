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
 * A representation of the model object '<em><b>Service Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ASD.ServiceDescription#getOperations <em>Operations</em>}</li>
 *   <li>{@link ASD.ServiceDescription#getInfotypes <em>Infotypes</em>}</li>
 *   <li>{@link ASD.ServiceDescription#getProfiles <em>Profiles</em>}</li>
 * </ul>
 * </p>
 *
 * @see ASD.ASDPackage#getServiceDescription()
 * @model
 * @generated
 */
public interface ServiceDescription extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link ASD.Operation}.
	 * It is bidirectional and its opposite is '{@link ASD.Operation#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see ASD.ASDPackage#getServiceDescription_Operations()
	 * @see ASD.Operation#getService
	 * @model opposite="service" containment="true"
	 * @generated
	 */
	EList<Operation> getOperations();

	/**
	 * Returns the value of the '<em><b>Infotypes</b></em>' containment reference list.
	 * The list contents are of type {@link ASD.InfoType}.
	 * It is bidirectional and its opposite is '{@link ASD.InfoType#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Infotypes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infotypes</em>' containment reference list.
	 * @see ASD.ASDPackage#getServiceDescription_Infotypes()
	 * @see ASD.InfoType#getService
	 * @model opposite="service" containment="true"
	 * @generated
	 */
	EList<InfoType> getInfotypes();

	/**
	 * Returns the value of the '<em><b>Profiles</b></em>' containment reference list.
	 * The list contents are of type {@link ASD.Profile}.
	 * It is bidirectional and its opposite is '{@link ASD.Profile#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profiles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profiles</em>' containment reference list.
	 * @see ASD.ASDPackage#getServiceDescription_Profiles()
	 * @see ASD.Profile#getService
	 * @model opposite="service" containment="true"
	 * @generated
	 */
	EList<Profile> getProfiles();

} // ServiceDescription
