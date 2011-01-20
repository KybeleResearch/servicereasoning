/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ASD.impl;

import ASD.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ASDFactoryImpl extends EFactoryImpl implements ASDFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ASDFactory init() {
		try {
			ASDFactory theASDFactory = (ASDFactory)EPackage.Registry.INSTANCE.getEFactory("http://ASD"); 
			if (theASDFactory != null) {
				return theASDFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ASDFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASDFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ASDPackage.SERVICE_DESCRIPTION: return createServiceDescription();
			case ASDPackage.OPERATION: return createOperation();
			case ASDPackage.MESSAGE: return createMessage();
			case ASDPackage.INFO_TYPE: return createInfoType();
			case ASDPackage.PROFILE: return createProfile();
			case ASDPackage.ASSERTION_SET: return createAssertionSet();
			case ASDPackage.ASSERTION: return createAssertion();
			case ASDPackage.ANNOTATION: return createAnnotation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ASDPackage.EENUM_OP:
				return createEEnumOpFromString(eDataType, initialValue);
			case ASDPackage.EENUM_MES:
				return createEEnumMesFromString(eDataType, initialValue);
			case ASDPackage.EENUM_SUBSET:
				return createEEnumSubsetFromString(eDataType, initialValue);
			case ASDPackage.EENUM_VALUE_TYPE:
				return createEEnumValueTypeFromString(eDataType, initialValue);
			case ASDPackage.EENUMLOGICAL_TYPE:
				return createEEnumlogicalTypeFromString(eDataType, initialValue);
			case ASDPackage.EENUM_DIMENSION_TYPE:
				return createEEnumDimensionTypeFromString(eDataType, initialValue);
			case ASDPackage.EENUM_INTENTION:
				return createEEnumIntentionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ASDPackage.EENUM_OP:
				return convertEEnumOpToString(eDataType, instanceValue);
			case ASDPackage.EENUM_MES:
				return convertEEnumMesToString(eDataType, instanceValue);
			case ASDPackage.EENUM_SUBSET:
				return convertEEnumSubsetToString(eDataType, instanceValue);
			case ASDPackage.EENUM_VALUE_TYPE:
				return convertEEnumValueTypeToString(eDataType, instanceValue);
			case ASDPackage.EENUMLOGICAL_TYPE:
				return convertEEnumlogicalTypeToString(eDataType, instanceValue);
			case ASDPackage.EENUM_DIMENSION_TYPE:
				return convertEEnumDimensionTypeToString(eDataType, instanceValue);
			case ASDPackage.EENUM_INTENTION:
				return convertEEnumIntentionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDescription createServiceDescription() {
		ServiceDescriptionImpl serviceDescription = new ServiceDescriptionImpl();
		return serviceDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfoType createInfoType() {
		InfoTypeImpl infoType = new InfoTypeImpl();
		return infoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile createProfile() {
		ProfileImpl profile = new ProfileImpl();
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionSet createAssertionSet() {
		AssertionSetImpl assertionSet = new AssertionSetImpl();
		return assertionSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assertion createAssertion() {
		AssertionImpl assertion = new AssertionImpl();
		return assertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnumOp createEEnumOpFromString(EDataType eDataType, String initialValue) {
		EEnumOp result = EEnumOp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEEnumOpToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnumMes createEEnumMesFromString(EDataType eDataType, String initialValue) {
		EEnumMes result = EEnumMes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEEnumMesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnumSubset createEEnumSubsetFromString(EDataType eDataType, String initialValue) {
		EEnumSubset result = EEnumSubset.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEEnumSubsetToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnumValueType createEEnumValueTypeFromString(EDataType eDataType, String initialValue) {
		EEnumValueType result = EEnumValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEEnumValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnumlogicalType createEEnumlogicalTypeFromString(EDataType eDataType, String initialValue) {
		EEnumlogicalType result = EEnumlogicalType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEEnumlogicalTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnumDimensionType createEEnumDimensionTypeFromString(EDataType eDataType, String initialValue) {
		EEnumDimensionType result = EEnumDimensionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEEnumDimensionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnumIntention createEEnumIntentionFromString(EDataType eDataType, String initialValue) {
		EEnumIntention result = EEnumIntention.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEEnumIntentionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASDPackage getASDPackage() {
		return (ASDPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ASDPackage getPackage() {
		return ASDPackage.eINSTANCE;
	}

} //ASDFactoryImpl
