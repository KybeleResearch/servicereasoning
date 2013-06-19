/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ASD;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ASD.Assertion#getDimension <em>Dimension</em>}</li>
 *   <li>{@link ASD.Assertion#getDimensionType <em>Dimension Type</em>}</li>
 *   <li>{@link ASD.Assertion#getIntention <em>Intention</em>}</li>
 *   <li>{@link ASD.Assertion#getMinVal <em>Min Val</em>}</li>
 *   <li>{@link ASD.Assertion#getMaxVal <em>Max Val</em>}</li>
 *   <li>{@link ASD.Assertion#getLType <em>LType</em>}</li>
 *   <li>{@link ASD.Assertion#getSet <em>Set</em>}</li>
 *   <li>{@link ASD.Assertion#getSubset <em>Subset</em>}</li>
 * </ul>
 * </p>
 *
 * @see ASD.ASDPackage#getAssertion()
 * @model
 * @generated
 */
public interface Assertion extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Dimension</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dimension</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dimension</em>' attribute.
   * @see #setDimension(String)
   * @see ASD.ASDPackage#getAssertion_Dimension()
   * @model
   * @generated
   */
  String getDimension();

  /**
   * Sets the value of the '{@link ASD.Assertion#getDimension <em>Dimension</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dimension</em>' attribute.
   * @see #getDimension()
   * @generated
   */
  void setDimension(String value);

  /**
   * Returns the value of the '<em><b>Dimension Type</b></em>' attribute.
   * The literals are from the enumeration {@link ASD.EEnumDimensionType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dimension Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dimension Type</em>' attribute.
   * @see ASD.EEnumDimensionType
   * @see #setDimensionType(EEnumDimensionType)
   * @see ASD.ASDPackage#getAssertion_DimensionType()
   * @model
   * @generated
   */
  EEnumDimensionType getDimensionType();

  /**
   * Sets the value of the '{@link ASD.Assertion#getDimensionType <em>Dimension Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dimension Type</em>' attribute.
   * @see ASD.EEnumDimensionType
   * @see #getDimensionType()
   * @generated
   */
  void setDimensionType(EEnumDimensionType value);

  /**
   * Returns the value of the '<em><b>Intention</b></em>' attribute.
   * The literals are from the enumeration {@link ASD.EEnumIntention}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Intention</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Intention</em>' attribute.
   * @see ASD.EEnumIntention
   * @see #setIntention(EEnumIntention)
   * @see ASD.ASDPackage#getAssertion_Intention()
   * @model
   * @generated
   */
  EEnumIntention getIntention();

  /**
   * Sets the value of the '{@link ASD.Assertion#getIntention <em>Intention</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Intention</em>' attribute.
   * @see ASD.EEnumIntention
   * @see #getIntention()
   * @generated
   */
  void setIntention(EEnumIntention value);

  /**
   * Returns the value of the '<em><b>Min Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min Val</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min Val</em>' attribute.
   * @see #setMinVal(double)
   * @see ASD.ASDPackage#getAssertion_MinVal()
   * @model
   * @generated
   */
  double getMinVal();

  /**
   * Sets the value of the '{@link ASD.Assertion#getMinVal <em>Min Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min Val</em>' attribute.
   * @see #getMinVal()
   * @generated
   */
  void setMinVal(double value);

  /**
   * Returns the value of the '<em><b>Max Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max Val</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max Val</em>' attribute.
   * @see #setMaxVal(double)
   * @see ASD.ASDPackage#getAssertion_MaxVal()
   * @model
   * @generated
   */
  double getMaxVal();

  /**
   * Sets the value of the '{@link ASD.Assertion#getMaxVal <em>Max Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Val</em>' attribute.
   * @see #getMaxVal()
   * @generated
   */
  void setMaxVal(double value);

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
   * @see ASD.ASDPackage#getAssertion_LType()
   * @model
   * @generated
   */
  EEnumlogicalType getLType();

  /**
   * Sets the value of the '{@link ASD.Assertion#getLType <em>LType</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>LType</em>' attribute.
   * @see ASD.EEnumlogicalType
   * @see #getLType()
   * @generated
   */
  void setLType(EEnumlogicalType value);

  /**
   * Returns the value of the '<em><b>Set</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link ASD.AssertionSet#getAssertions <em>Assertions</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Set</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Set</em>' container reference.
   * @see #setSet(AssertionSet)
   * @see ASD.ASDPackage#getAssertion_Set()
   * @see ASD.AssertionSet#getAssertions
   * @model opposite="assertions" transient="false"
   * @generated
   */
  AssertionSet getSet();

  /**
   * Sets the value of the '{@link ASD.Assertion#getSet <em>Set</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Set</em>' container reference.
   * @see #getSet()
   * @generated
   */
  void setSet(AssertionSet value);

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
   * @see ASD.ASDPackage#getAssertion_Subset()
   * @model
   * @generated
   */
  EEnumSubset getSubset();

  /**
   * Sets the value of the '{@link ASD.Assertion#getSubset <em>Subset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subset</em>' attribute.
   * @see ASD.EEnumSubset
   * @see #getSubset()
   * @generated
   */
  void setSubset(EEnumSubset value);

} // Assertion
