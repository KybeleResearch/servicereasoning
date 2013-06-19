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
 * A representation of the model object '<em><b>Info Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ASD.InfoType#getValueType <em>Value Type</em>}</li>
 *   <li>{@link ASD.InfoType#getValueRange <em>Value Range</em>}</li>
 *   <li>{@link ASD.InfoType#getSubset <em>Subset</em>}</li>
 *   <li>{@link ASD.InfoType#getInfoType <em>Info Type</em>}</li>
 *   <li>{@link ASD.InfoType#getRef <em>Ref</em>}</li>
 *   <li>{@link ASD.InfoType#getMessage <em>Message</em>}</li>
 *   <li>{@link ASD.InfoType#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see ASD.ASDPackage#getInfoType()
 * @model
 * @generated
 */
public interface InfoType extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Value Type</b></em>' attribute.
   * The literals are from the enumeration {@link ASD.EEnumValueType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Type</em>' attribute.
   * @see ASD.EEnumValueType
   * @see #setValueType(EEnumValueType)
   * @see ASD.ASDPackage#getInfoType_ValueType()
   * @model
   * @generated
   */
  EEnumValueType getValueType();

  /**
   * Sets the value of the '{@link ASD.InfoType#getValueType <em>Value Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Type</em>' attribute.
   * @see ASD.EEnumValueType
   * @see #getValueType()
   * @generated
   */
  void setValueType(EEnumValueType value);

  /**
   * Returns the value of the '<em><b>Value Range</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Range</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Range</em>' attribute.
   * @see #setValueRange(String)
   * @see ASD.ASDPackage#getInfoType_ValueRange()
   * @model
   * @generated
   */
  String getValueRange();

  /**
   * Sets the value of the '{@link ASD.InfoType#getValueRange <em>Value Range</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Range</em>' attribute.
   * @see #getValueRange()
   * @generated
   */
  void setValueRange(String value);

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
   * @see ASD.ASDPackage#getInfoType_Subset()
   * @model
   * @generated
   */
  EEnumSubset getSubset();

  /**
   * Sets the value of the '{@link ASD.InfoType#getSubset <em>Subset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subset</em>' attribute.
   * @see ASD.EEnumSubset
   * @see #getSubset()
   * @generated
   */
  void setSubset(EEnumSubset value);

  /**
   * Returns the value of the '<em><b>Info Type</b></em>' containment reference list.
   * The list contents are of type {@link ASD.InfoType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Info Type</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Info Type</em>' containment reference list.
   * @see ASD.ASDPackage#getInfoType_InfoType()
   * @model containment="true"
   * @generated
   */
  EList<InfoType> getInfoType();

  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(InfoType)
   * @see ASD.ASDPackage#getInfoType_Ref()
   * @model
   * @generated
   */
  InfoType getRef();

  /**
   * Sets the value of the '{@link ASD.InfoType#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(InfoType value);

  /**
   * Returns the value of the '<em><b>Message</b></em>' reference list.
   * The list contents are of type {@link ASD.Message}.
   * It is bidirectional and its opposite is '{@link ASD.Message#getInfoType <em>Info Type</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Message</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message</em>' reference list.
   * @see ASD.ASDPackage#getInfoType_Message()
   * @see ASD.Message#getInfoType
   * @model opposite="infoType"
   * @generated
   */
  EList<Message> getMessage();

  /**
   * Returns the value of the '<em><b>Service</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link ASD.ServiceDescription#getInfotypes <em>Infotypes</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service</em>' container reference.
   * @see #setService(ServiceDescription)
   * @see ASD.ASDPackage#getInfoType_Service()
   * @see ASD.ServiceDescription#getInfotypes
   * @model opposite="infotypes" transient="false"
   * @generated
   */
  ServiceDescription getService();

  /**
   * Sets the value of the '{@link ASD.InfoType#getService <em>Service</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Service</em>' container reference.
   * @see #getService()
   * @generated
   */
  void setService(ServiceDescription value);

} // InfoType
