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
 * A representation of the literals of the enumeration '<em><b>EEnum Op</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ASD.ASDPackage#getEEnumOp()
 * @model
 * @generated
 */
public enum EEnumOp implements Enumerator {
	/**
	 * The '<em><b>Oneway</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONEWAY_VALUE
	 * @generated
	 * @ordered
	 */
	ONEWAY(0, "oneway", "oneway"),

	/**
	 * The '<em><b>Notification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	NOTIFICATION(0, "notification", "notification"),

	/**
	 * The '<em><b>Requestresponse</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUESTRESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	REQUESTRESPONSE(0, "requestresponse", "requestresponse"),

	/**
	 * The '<em><b>Solicitresponse</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOLICITRESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	SOLICITRESPONSE(0, "solicitresponse", "solicitresponse");

	/**
	 * The '<em><b>Oneway</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Oneway</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONEWAY
	 * @model name="oneway"
	 * @generated
	 * @ordered
	 */
	public static final int ONEWAY_VALUE = 0;

	/**
	 * The '<em><b>Notification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Notification</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTIFICATION
	 * @model name="notification"
	 * @generated
	 * @ordered
	 */
	public static final int NOTIFICATION_VALUE = 0;

	/**
	 * The '<em><b>Requestresponse</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Requestresponse</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUESTRESPONSE
	 * @model name="requestresponse"
	 * @generated
	 * @ordered
	 */
	public static final int REQUESTRESPONSE_VALUE = 0;

	/**
	 * The '<em><b>Solicitresponse</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Solicitresponse</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOLICITRESPONSE
	 * @model name="solicitresponse"
	 * @generated
	 * @ordered
	 */
	public static final int SOLICITRESPONSE_VALUE = 0;

	/**
	 * An array of all the '<em><b>EEnum Op</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EEnumOp[] VALUES_ARRAY =
		new EEnumOp[] {
			ONEWAY,
			NOTIFICATION,
			REQUESTRESPONSE,
			SOLICITRESPONSE,
		};

	/**
	 * A public read-only list of all the '<em><b>EEnum Op</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EEnumOp> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EEnum Op</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EEnumOp get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EEnumOp result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EEnum Op</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EEnumOp getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EEnumOp result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EEnum Op</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EEnumOp get(int value) {
		switch (value) {
			case ONEWAY_VALUE: return ONEWAY;
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
	private EEnumOp(int value, String name, String literal) {
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
	
} //EEnumOp
