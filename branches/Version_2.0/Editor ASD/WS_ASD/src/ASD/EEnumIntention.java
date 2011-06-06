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
 * A representation of the literals of the enumeration '<em><b>EEnum Intention</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ASD.ASDPackage#getEEnumIntention()
 * @model
 * @generated
 */
public enum EEnumIntention implements Enumerator {
	/**
	 * The '<em><b>Promise</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROMISE_VALUE
	 * @generated
	 * @ordered
	 */
	PROMISE(0, "promise", "promise"),

	/**
	 * The '<em><b>Obligation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBLIGATION_VALUE
	 * @generated
	 * @ordered
	 */
	OBLIGATION(1, "obligation", "obligation");

	/**
	 * The '<em><b>Promise</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Promise</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROMISE
	 * @model name="promise"
	 * @generated
	 * @ordered
	 */
	public static final int PROMISE_VALUE = 0;

	/**
	 * The '<em><b>Obligation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Obligation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OBLIGATION
	 * @model name="obligation"
	 * @generated
	 * @ordered
	 */
	public static final int OBLIGATION_VALUE = 1;

	/**
	 * An array of all the '<em><b>EEnum Intention</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EEnumIntention[] VALUES_ARRAY =
		new EEnumIntention[] {
			PROMISE,
			OBLIGATION,
		};

	/**
	 * A public read-only list of all the '<em><b>EEnum Intention</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EEnumIntention> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EEnum Intention</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EEnumIntention get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EEnumIntention result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EEnum Intention</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EEnumIntention getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EEnumIntention result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EEnum Intention</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EEnumIntention get(int value) {
		switch (value) {
			case PROMISE_VALUE: return PROMISE;
			case OBLIGATION_VALUE: return OBLIGATION;
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
	private EEnumIntention(int value, String name, String literal) {
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
	
} //EEnumIntention
