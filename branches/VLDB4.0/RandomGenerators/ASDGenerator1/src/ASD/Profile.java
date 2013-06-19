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
 * A representation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ASD.Profile#getRefers <em>Refers</em>}</li>
 *   <li>{@link ASD.Profile#getSets <em>Sets</em>}</li>
 *   <li>{@link ASD.Profile#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see ASD.ASDPackage#getProfile()
 * @model
 * @generated
 */
public interface Profile extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Refers</b></em>' reference list.
   * The list contents are of type {@link ASD.Operation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refers</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refers</em>' reference list.
   * @see ASD.ASDPackage#getProfile_Refers()
   * @model required="true"
   * @generated
   */
  EList<Operation> getRefers();

  /**
   * Returns the value of the '<em><b>Sets</b></em>' containment reference list.
   * The list contents are of type {@link ASD.AssertionSet}.
   * It is bidirectional and its opposite is '{@link ASD.AssertionSet#getProfile <em>Profile</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sets</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sets</em>' containment reference list.
   * @see ASD.ASDPackage#getProfile_Sets()
   * @see ASD.AssertionSet#getProfile
   * @model opposite="profile" containment="true" required="true"
   * @generated
   */
  EList<AssertionSet> getSets();

  /**
   * Returns the value of the '<em><b>Service</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link ASD.ServiceDescription#getProfiles <em>Profiles</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service</em>' container reference.
   * @see #setService(ServiceDescription)
   * @see ASD.ASDPackage#getProfile_Service()
   * @see ASD.ServiceDescription#getProfiles
   * @model opposite="profiles" transient="false"
   * @generated
   */
  ServiceDescription getService();

  /**
   * Sets the value of the '{@link ASD.Profile#getService <em>Service</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Service</em>' container reference.
   * @see #getService()
   * @generated
   */
  void setService(ServiceDescription value);

} // Profile
