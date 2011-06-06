/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ASD;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EEnum Dimension Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ASD.ASDPackage#getEEnumDimensionType()
 * @model
 * @generated
 */
public enum EEnumDimensionType implements Enumerator {
	/**
	 * The '<em><b>Monotonic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONOTONIC_VALUE
	 * @generated
	 * @ordered
	 */
	MONOTONIC(0, "monotonic", "monotonic"),

	/**
	 * The '<em><b>Antitonic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANTITONIC_VALUE
	 * @generated
	 * @ordered
	 */
	ANTITONIC(1, "antitonic", "antitonic");

	/**
	 * The '<em><b>Monotonic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Monotonic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MONOTONIC
	 * @model name="monotonic"
	 * @generated
	 * @ordered
	 */
	public static final int MONOTONIC_VALUE = 0;

	/**
	 * The '<em><b>Antitonic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Antitonic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANTITONIC
	 * @model name="antitonic"
	 * @generated
	 * @ordered
	 */
	public static final int ANTITONIC_VALUE = 1;

	/**
	 * An array of all the '<em><b>EEnum Dimension Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EEnumDimensionType[] VALUES_ARRAY =
		new EEnumDimensionType[] {
			MONOTONIC,
			ANTITONIC,
		};

	/**
	 * A public read-only list of all the '<em><b>EEnum Dimension Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EEnumDimensionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EEnum Dimension Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EEnumDimensionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EEnumDimensionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EEnum Dimension Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EEnumDimensionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EEnumDimensionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EEnum Dimension Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EEnumDimensionType get(int value) {
		switch (value) {
			case MONOTONIC_VALUE: return MONOTONIC;
			case ANTITONIC_VALUE: return ANTITONIC;
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
	private EEnumDimensionType(int value, String name, String literal) {
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
	
} //EEnumDimensionType
