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
 * A representation of the model object '<em><b>Assertion Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ASD.AssertionSet#getLType <em>LType</em>}</li>
 *   <li>{@link ASD.AssertionSet#getProfile <em>Profile</em>}</li>
 *   <li>{@link ASD.AssertionSet#getAssertions <em>Assertions</em>}</li>
 * </ul>
 * </p>
 *
 * @see ASD.ASDPackage#getAssertionSet()
 * @model
 * @generated
 */
public interface AssertionSet extends NamedElement
{
  /**
   * Returns the value of the '<em><b>LType</b></em>' attribute.
   * The literals are from the enumeration {@link ASD.EEnumlogicalType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>LType</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>LType</em>' attribute.
   * @see ASD.EEnumlogicalType
   * @see #setLType(EEnumlogicalType)
   * @see ASD.ASDPackage#getAssertionSet_LType()
   * @model
   * @generated
   */
  EEnumlogicalType getLType();

  /**
   * Sets the value of the '{@link ASD.AssertionSet#getLType <em>LType</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>LType</em>' attribute.
   * @see ASD.EEnumlogicalType
   * @see #getLType()
   * @generated
   */
  void setLType(EEnumlogicalType value);

  /**
   * Returns the value of the '<em><b>Profile</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link ASD.Profile#getSets <em>Sets</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Profile</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Profile</em>' container reference.
   * @see #setProfile(Profile)
   * @see ASD.ASDPackage#getAssertionSet_Profile()
   * @see ASD.Profile#getSets
   * @model opposite="sets" transient="false"
   * @generated
   */
  Profile getProfile();

  /**
   * Sets the value of the '{@link ASD.AssertionSet#getProfile <em>Profile</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Profile</em>' container reference.
   * @see #getProfile()
   * @generated
   */
  void setProfile(Profile value);

  /**
   * Returns the value of the '<em><b>Assertions</b></em>' containment reference list.
   * The list contents are of type {@link ASD.Assertion}.
   * It is bidirectional and its opposite is '{@link ASD.Assertion#getSet <em>Set</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assertions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assertions</em>' containment reference list.
   * @see ASD.ASDPackage#getAssertionSet_Assertions()
   * @see ASD.Assertion#getSet
   * @model opposite="set" containment="true" required="true"
   * @generated
   */
  EList<Assertion> getAssertions();

} // AssertionSet
