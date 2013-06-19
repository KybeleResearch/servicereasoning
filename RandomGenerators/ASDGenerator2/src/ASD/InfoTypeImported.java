/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ASD;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Info Type Imported</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ASD.InfoTypeImported#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see ASD.ASDPackage#getInfoTypeImported()
 * @model
 * @generated
 */
public interface InfoTypeImported extends InfoType
{
  /**
   * Returns the value of the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Url</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Url</em>' attribute.
   * @see #setUrl(String)
   * @see ASD.ASDPackage#getInfoTypeImported_Url()
   * @model required="true"
   * @generated
   */
  String getUrl();

  /**
   * Sets the value of the '{@link ASD.InfoTypeImported#getUrl <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' attribute.
   * @see #getUrl()
   * @generated
   */
  void setUrl(String value);

} // InfoTypeImported
