/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL2_0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>form Values</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see WSDL2_0.WSDL2_0Package#getformValues()
 * @model
 * @generated
 */
public enum formValues implements Enumerator {
	/**
	 * The '<em><b>Unset</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSET_VALUE
	 * @generated
	 * @ordered
	 */
	UNSET(0, "unset", "unset"),

	/**
	 * The '<em><b>Qualified</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUALIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	QUALIFIED(0, "qualified", "qualified"),

	/**
	 * The '<em><b>Unqualified</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNQUALIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	UNQUALIFIED(0, "unqualified", "unqualified");

	/**
	 * The '<em><b>Unset</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unset</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSET
	 * @model name="unset"
	 * @generated
	 * @ordered
	 */
	public static final int UNSET_VALUE = 0;

	/**
	 * The '<em><b>Qualified</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Qualified</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUALIFIED
	 * @model name="qualified"
	 * @generated
	 * @ordered
	 */
	public static final int QUALIFIED_VALUE = 0;

	/**
	 * The '<em><b>Unqualified</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unqualified</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNQUALIFIED
	 * @model name="unqualified"
	 * @generated
	 * @ordered
	 */
	public static final int UNQUALIFIED_VALUE = 0;

	/**
	 * An array of all the '<em><b>form Values</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final formValues[] VALUES_ARRAY =
		new formValues[] {
			UNSET,
			QUALIFIED,
			UNQUALIFIED,
		};

	/**
	 * A public read-only list of all the '<em><b>form Values</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<formValues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>form Values</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static formValues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			formValues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>form Values</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static formValues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			formValues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>form Values</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static formValues get(int value) {
		switch (value) {
			case UNSET_VALUE: return UNSET;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private formValues(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //formValues
