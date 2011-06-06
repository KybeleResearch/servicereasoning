/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ASD;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ASD.ASDFactory
 * @model kind="package"
 *        annotation="gmf foo='bar'"
 * @generated
 */
public interface ASDPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ASD";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ASD";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ASD";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ASDPackage eINSTANCE = ASD.impl.ASDPackageImpl.init();

	/**
	 * The meta object id for the '{@link ASD.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASD.impl.NamedElementImpl
	 * @see ASD.impl.ASDPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ANNOTATIONS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ASD.impl.ServiceDescriptionImpl <em>Service Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASD.impl.ServiceDescriptionImpl
	 * @see ASD.impl.ASDPackageImpl#getServiceDescription()
	 * @generated
	 */
	int SERVICE_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__ANNOTATIONS = NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__OPERATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Infotypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__INFOTYPES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Profiles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION__PROFILES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Service Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ASD.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASD.impl.OperationImpl
	 * @see ASD.impl.ASDPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ANNOTATIONS = NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Message Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__MESSAGE_PATTERN = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CONTENTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Service</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__SERVICE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ASD.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASD.impl.MessageImpl
	 * @see ASD.impl.ASDPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ANNOTATIONS = NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ROLE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__SUBSET = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Info Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__INFO_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__OPERATION = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link ASD.impl.InfoTypeImpl <em>Info Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASD.impl.InfoTypeImpl
	 * @see ASD.impl.ASDPackageImpl#getInfoType()
	 * @generated
	 */
	int INFO_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE__ANNOTATIONS = NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE__VALUE_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE__VALUE_RANGE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE__SUBSET = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Info Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE__INFO_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE__REF = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE__MESSAGE = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Service</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE__SERVICE = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Info Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link ASD.impl.ProfileImpl <em>Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASD.impl.ProfileImpl
	 * @see ASD.impl.ASDPackageImpl#getProfile()
	 * @generated
	 */
	int PROFILE = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__ANNOTATIONS = NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Refers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__REFERS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__SETS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Service</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__SERVICE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ASD.impl.AssertionSetImpl <em>Assertion Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASD.impl.AssertionSetImpl
	 * @see ASD.impl.ASDPackageImpl#getAssertionSet()
	 * @generated
	 */
	int ASSERTION_SET = 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_SET__ANNOTATIONS = NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_SET__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>LType</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_SET__LTYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_SET__PROFILE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assertions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_SET__ASSERTIONS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Assertion Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_SET_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ASD.impl.AssertionImpl <em>Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASD.impl.AssertionImpl
	 * @see ASD.impl.ASDPackageImpl#getAssertion()
	 * @generated
	 */
	int ASSERTION = 6;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__ANNOTATIONS = NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__DIMENSION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dimension Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__DIMENSION_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__ROLE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Min Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__MIN_VAL = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Max Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__MAX_VAL = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>LType</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__LTYPE = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__SET = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Subset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__SUBSET = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link ASD.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASD.impl.AnnotationImpl
	 * @see ASD.impl.ASDPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 8;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__OWNER = 2;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ASD.impl.InfoTypeImportedImpl <em>Info Type Imported</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASD.impl.InfoTypeImportedImpl
	 * @see ASD.impl.ASDPackageImpl#getInfoTypeImported()
	 * @generated
	 */
	int INFO_TYPE_IMPORTED = 9;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE_IMPORTED__ANNOTATIONS = INFO_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE_IMPORTED__NAME = INFO_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE_IMPORTED__VALUE_TYPE = INFO_TYPE__VALUE_TYPE;

	/**
	 * The feature id for the '<em><b>Value Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE_IMPORTED__VALUE_RANGE = INFO_TYPE__VALUE_RANGE;

	/**
	 * The feature id for the '<em><b>Subset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE_IMPORTED__SUBSET = INFO_TYPE__SUBSET;

	/**
	 * The feature id for the '<em><b>Info Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE_IMPORTED__INFO_TYPE = INFO_TYPE__INFO_TYPE;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE_IMPORTED__REF = INFO_TYPE__REF;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE_IMPORTED__MESSAGE = INFO_TYPE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Service</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE_IMPORTED__SERVICE = INFO_TYPE__SERVICE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE_IMPORTED__URL = INFO_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Info Type Imported</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE_IMPORTED_FEATURE_COUNT = INFO_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ASD.EEnumOp <em>EEnum Op</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASD.EEnumOp
	 * @see ASD.impl.ASDPackageImpl#getEEnumOp()
	 * @generated
	 */
	int EENUM_OP = 10;

	/**
	 * The meta object id for the '{@link ASD.EEnumMes <em>EEnum Mes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASD.EEnumMes
	 * @see ASD.impl.ASDPackageImpl#getEEnumMes()
	 * @generated
	 */
	int EENUM_MES = 11;

	/**
	 * The meta object id for the '{@link ASD.EEnumSubset <em>EEnum Subset</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASD.EEnumSubset
	 * @see ASD.impl.ASDPackageImpl#getEEnumSubset()
	 * @generated
	 */
	int EENUM_SUBSET = 12;

	/**
	 * The meta object id for the '{@link ASD.EEnumValueType <em>EEnum Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASD.EEnumValueType
	 * @see ASD.impl.ASDPackageImpl#getEEnumValueType()
	 * @generated
	 */
	int EENUM_VALUE_TYPE = 13;

	/**
	 * The meta object id for the '{@link ASD.EEnumlogicalType <em>EEnumlogical Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASD.EEnumlogicalType
	 * @see ASD.impl.ASDPackageImpl#getEEnumlogicalType()
	 * @generated
	 */
	int EENUMLOGICAL_TYPE = 14;

	/**
	 * The meta object id for the '{@link ASD.EEnumDimensionType <em>EEnum Dimension Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASD.EEnumDimensionType
	 * @see ASD.impl.ASDPackageImpl#getEEnumDimensionType()
	 * @generated
	 */
	int EENUM_DIMENSION_TYPE = 15;

	/**
	 * The meta object id for the '{@link ASD.EEnumIntention <em>EEnum Intention</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ASD.EEnumIntention
	 * @see ASD.impl.ASDPackageImpl#getEEnumIntention()
	 * @generated
	 */
	int EENUM_INTENTION = 16;


	/**
	 * Returns the meta object for class '{@link ASD.ServiceDescription <em>Service Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Description</em>'.
	 * @see ASD.ServiceDescription
	 * @generated
	 */
	EClass getServiceDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link ASD.ServiceDescription#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see ASD.ServiceDescription#getOperations()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EReference getServiceDescription_Operations();

	/**
	 * Returns the meta object for the containment reference list '{@link ASD.ServiceDescription#getInfotypes <em>Infotypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Infotypes</em>'.
	 * @see ASD.ServiceDescription#getInfotypes()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EReference getServiceDescription_Infotypes();

	/**
	 * Returns the meta object for the containment reference list '{@link ASD.ServiceDescription#getProfiles <em>Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Profiles</em>'.
	 * @see ASD.ServiceDescription#getProfiles()
	 * @see #getServiceDescription()
	 * @generated
	 */
	EReference getServiceDescription_Profiles();

	/**
	 * Returns the meta object for class '{@link ASD.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see ASD.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link ASD.Operation#getMessagePattern <em>Message Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Pattern</em>'.
	 * @see ASD.Operation#getMessagePattern()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_MessagePattern();

	/**
	 * Returns the meta object for the containment reference list '{@link ASD.Operation#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see ASD.Operation#getContents()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Contents();

	/**
	 * Returns the meta object for the container reference '{@link ASD.Operation#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Service</em>'.
	 * @see ASD.Operation#getService()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Service();

	/**
	 * Returns the meta object for class '{@link ASD.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see ASD.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link ASD.Message#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see ASD.Message#getRole()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Role();

	/**
	 * Returns the meta object for the attribute '{@link ASD.Message#getSubset <em>Subset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subset</em>'.
	 * @see ASD.Message#getSubset()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Subset();

	/**
	 * Returns the meta object for the reference list '{@link ASD.Message#getInfoType <em>Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Info Type</em>'.
	 * @see ASD.Message#getInfoType()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_InfoType();

	/**
	 * Returns the meta object for the container reference '{@link ASD.Message#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Operation</em>'.
	 * @see ASD.Message#getOperation()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Operation();

	/**
	 * Returns the meta object for class '{@link ASD.InfoType <em>Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info Type</em>'.
	 * @see ASD.InfoType
	 * @generated
	 */
	EClass getInfoType();

	/**
	 * Returns the meta object for the attribute '{@link ASD.InfoType#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see ASD.InfoType#getValueType()
	 * @see #getInfoType()
	 * @generated
	 */
	EAttribute getInfoType_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link ASD.InfoType#getValueRange <em>Value Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Range</em>'.
	 * @see ASD.InfoType#getValueRange()
	 * @see #getInfoType()
	 * @generated
	 */
	EAttribute getInfoType_ValueRange();

	/**
	 * Returns the meta object for the attribute '{@link ASD.InfoType#getSubset <em>Subset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subset</em>'.
	 * @see ASD.InfoType#getSubset()
	 * @see #getInfoType()
	 * @generated
	 */
	EAttribute getInfoType_Subset();

	/**
	 * Returns the meta object for the containment reference list '{@link ASD.InfoType#getInfoType <em>Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Info Type</em>'.
	 * @see ASD.InfoType#getInfoType()
	 * @see #getInfoType()
	 * @generated
	 */
	EReference getInfoType_InfoType();

	/**
	 * Returns the meta object for the reference '{@link ASD.InfoType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see ASD.InfoType#getRef()
	 * @see #getInfoType()
	 * @generated
	 */
	EReference getInfoType_Ref();

	/**
	 * Returns the meta object for the reference list '{@link ASD.InfoType#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Message</em>'.
	 * @see ASD.InfoType#getMessage()
	 * @see #getInfoType()
	 * @generated
	 */
	EReference getInfoType_Message();

	/**
	 * Returns the meta object for the container reference '{@link ASD.InfoType#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Service</em>'.
	 * @see ASD.InfoType#getService()
	 * @see #getInfoType()
	 * @generated
	 */
	EReference getInfoType_Service();

	/**
	 * Returns the meta object for class '{@link ASD.Profile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profile</em>'.
	 * @see ASD.Profile
	 * @generated
	 */
	EClass getProfile();

	/**
	 * Returns the meta object for the reference list '{@link ASD.Profile#getRefers <em>Refers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refers</em>'.
	 * @see ASD.Profile#getRefers()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_Refers();

	/**
	 * Returns the meta object for the containment reference list '{@link ASD.Profile#getSets <em>Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sets</em>'.
	 * @see ASD.Profile#getSets()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_Sets();

	/**
	 * Returns the meta object for the container reference '{@link ASD.Profile#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Service</em>'.
	 * @see ASD.Profile#getService()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_Service();

	/**
	 * Returns the meta object for class '{@link ASD.AssertionSet <em>Assertion Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion Set</em>'.
	 * @see ASD.AssertionSet
	 * @generated
	 */
	EClass getAssertionSet();

	/**
	 * Returns the meta object for the attribute '{@link ASD.AssertionSet#getLType <em>LType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LType</em>'.
	 * @see ASD.AssertionSet#getLType()
	 * @see #getAssertionSet()
	 * @generated
	 */
	EAttribute getAssertionSet_LType();

	/**
	 * Returns the meta object for the container reference '{@link ASD.AssertionSet#getProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Profile</em>'.
	 * @see ASD.AssertionSet#getProfile()
	 * @see #getAssertionSet()
	 * @generated
	 */
	EReference getAssertionSet_Profile();

	/**
	 * Returns the meta object for the containment reference list '{@link ASD.AssertionSet#getAssertions <em>Assertions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assertions</em>'.
	 * @see ASD.AssertionSet#getAssertions()
	 * @see #getAssertionSet()
	 * @generated
	 */
	EReference getAssertionSet_Assertions();

	/**
	 * Returns the meta object for class '{@link ASD.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion</em>'.
	 * @see ASD.Assertion
	 * @generated
	 */
	EClass getAssertion();

	/**
	 * Returns the meta object for the attribute '{@link ASD.Assertion#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimension</em>'.
	 * @see ASD.Assertion#getDimension()
	 * @see #getAssertion()
	 * @generated
	 */
	EAttribute getAssertion_Dimension();

	/**
	 * Returns the meta object for the attribute '{@link ASD.Assertion#getDimensionType <em>Dimension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimension Type</em>'.
	 * @see ASD.Assertion#getDimensionType()
	 * @see #getAssertion()
	 * @generated
	 */
	EAttribute getAssertion_DimensionType();

	/**
	 * Returns the meta object for the attribute '{@link ASD.Assertion#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see ASD.Assertion#getRole()
	 * @see #getAssertion()
	 * @generated
	 */
	EAttribute getAssertion_Role();

	/**
	 * Returns the meta object for the attribute '{@link ASD.Assertion#getMinVal <em>Min Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Val</em>'.
	 * @see ASD.Assertion#getMinVal()
	 * @see #getAssertion()
	 * @generated
	 */
	EAttribute getAssertion_MinVal();

	/**
	 * Returns the meta object for the attribute '{@link ASD.Assertion#getMaxVal <em>Max Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Val</em>'.
	 * @see ASD.Assertion#getMaxVal()
	 * @see #getAssertion()
	 * @generated
	 */
	EAttribute getAssertion_MaxVal();

	/**
	 * Returns the meta object for the attribute '{@link ASD.Assertion#getLType <em>LType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LType</em>'.
	 * @see ASD.Assertion#getLType()
	 * @see #getAssertion()
	 * @generated
	 */
	EAttribute getAssertion_LType();

	/**
	 * Returns the meta object for the container reference '{@link ASD.Assertion#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Set</em>'.
	 * @see ASD.Assertion#getSet()
	 * @see #getAssertion()
	 * @generated
	 */
	EReference getAssertion_Set();

	/**
	 * Returns the meta object for the attribute '{@link ASD.Assertion#getSubset <em>Subset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subset</em>'.
	 * @see ASD.Assertion#getSubset()
	 * @see #getAssertion()
	 * @generated
	 */
	EAttribute getAssertion_Subset();

	/**
	 * Returns the meta object for class '{@link ASD.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see ASD.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link ASD.NamedElement#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see ASD.NamedElement#getAnnotations()
	 * @see #getNamedElement()
	 * @generated
	 */
	EReference getNamedElement_Annotations();

	/**
	 * Returns the meta object for the attribute '{@link ASD.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ASD.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link ASD.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see ASD.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link ASD.Annotation#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see ASD.Annotation#getKey()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Key();

	/**
	 * Returns the meta object for the attribute '{@link ASD.Annotation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ASD.Annotation#getValue()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Value();

	/**
	 * Returns the meta object for the container reference '{@link ASD.Annotation#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see ASD.Annotation#getOwner()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Owner();

	/**
	 * Returns the meta object for class '{@link ASD.InfoTypeImported <em>Info Type Imported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info Type Imported</em>'.
	 * @see ASD.InfoTypeImported
	 * @generated
	 */
	EClass getInfoTypeImported();

	/**
	 * Returns the meta object for the attribute '{@link ASD.InfoTypeImported#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see ASD.InfoTypeImported#getUrl()
	 * @see #getInfoTypeImported()
	 * @generated
	 */
	EAttribute getInfoTypeImported_Url();

	/**
	 * Returns the meta object for enum '{@link ASD.EEnumOp <em>EEnum Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EEnum Op</em>'.
	 * @see ASD.EEnumOp
	 * @generated
	 */
	EEnum getEEnumOp();

	/**
	 * Returns the meta object for enum '{@link ASD.EEnumMes <em>EEnum Mes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EEnum Mes</em>'.
	 * @see ASD.EEnumMes
	 * @generated
	 */
	EEnum getEEnumMes();

	/**
	 * Returns the meta object for enum '{@link ASD.EEnumSubset <em>EEnum Subset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EEnum Subset</em>'.
	 * @see ASD.EEnumSubset
	 * @generated
	 */
	EEnum getEEnumSubset();

	/**
	 * Returns the meta object for enum '{@link ASD.EEnumValueType <em>EEnum Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EEnum Value Type</em>'.
	 * @see ASD.EEnumValueType
	 * @generated
	 */
	EEnum getEEnumValueType();

	/**
	 * Returns the meta object for enum '{@link ASD.EEnumlogicalType <em>EEnumlogical Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EEnumlogical Type</em>'.
	 * @see ASD.EEnumlogicalType
	 * @generated
	 */
	EEnum getEEnumlogicalType();

	/**
	 * Returns the meta object for enum '{@link ASD.EEnumDimensionType <em>EEnum Dimension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EEnum Dimension Type</em>'.
	 * @see ASD.EEnumDimensionType
	 * @generated
	 */
	EEnum getEEnumDimensionType();

	/**
	 * Returns the meta object for enum '{@link ASD.EEnumIntention <em>EEnum Intention</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EEnum Intention</em>'.
	 * @see ASD.EEnumIntention
	 * @generated
	 */
	EEnum getEEnumIntention();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ASDFactory getASDFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ASD.impl.ServiceDescriptionImpl <em>Service Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASD.impl.ServiceDescriptionImpl
		 * @see ASD.impl.ASDPackageImpl#getServiceDescription()
		 * @generated
		 */
		EClass SERVICE_DESCRIPTION = eINSTANCE.getServiceDescription();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DESCRIPTION__OPERATIONS = eINSTANCE.getServiceDescription_Operations();

		/**
		 * The meta object literal for the '<em><b>Infotypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DESCRIPTION__INFOTYPES = eINSTANCE.getServiceDescription_Infotypes();

		/**
		 * The meta object literal for the '<em><b>Profiles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DESCRIPTION__PROFILES = eINSTANCE.getServiceDescription_Profiles();

		/**
		 * The meta object literal for the '{@link ASD.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASD.impl.OperationImpl
		 * @see ASD.impl.ASDPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Message Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__MESSAGE_PATTERN = eINSTANCE.getOperation_MessagePattern();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__CONTENTS = eINSTANCE.getOperation_Contents();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__SERVICE = eINSTANCE.getOperation_Service();

		/**
		 * The meta object literal for the '{@link ASD.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASD.impl.MessageImpl
		 * @see ASD.impl.ASDPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__ROLE = eINSTANCE.getMessage_Role();

		/**
		 * The meta object literal for the '<em><b>Subset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__SUBSET = eINSTANCE.getMessage_Subset();

		/**
		 * The meta object literal for the '<em><b>Info Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__INFO_TYPE = eINSTANCE.getMessage_InfoType();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__OPERATION = eINSTANCE.getMessage_Operation();

		/**
		 * The meta object literal for the '{@link ASD.impl.InfoTypeImpl <em>Info Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASD.impl.InfoTypeImpl
		 * @see ASD.impl.ASDPackageImpl#getInfoType()
		 * @generated
		 */
		EClass INFO_TYPE = eINSTANCE.getInfoType();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO_TYPE__VALUE_TYPE = eINSTANCE.getInfoType_ValueType();

		/**
		 * The meta object literal for the '<em><b>Value Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO_TYPE__VALUE_RANGE = eINSTANCE.getInfoType_ValueRange();

		/**
		 * The meta object literal for the '<em><b>Subset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO_TYPE__SUBSET = eINSTANCE.getInfoType_Subset();

		/**
		 * The meta object literal for the '<em><b>Info Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFO_TYPE__INFO_TYPE = eINSTANCE.getInfoType_InfoType();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFO_TYPE__REF = eINSTANCE.getInfoType_Ref();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFO_TYPE__MESSAGE = eINSTANCE.getInfoType_Message();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFO_TYPE__SERVICE = eINSTANCE.getInfoType_Service();

		/**
		 * The meta object literal for the '{@link ASD.impl.ProfileImpl <em>Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASD.impl.ProfileImpl
		 * @see ASD.impl.ASDPackageImpl#getProfile()
		 * @generated
		 */
		EClass PROFILE = eINSTANCE.getProfile();

		/**
		 * The meta object literal for the '<em><b>Refers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__REFERS = eINSTANCE.getProfile_Refers();

		/**
		 * The meta object literal for the '<em><b>Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__SETS = eINSTANCE.getProfile_Sets();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__SERVICE = eINSTANCE.getProfile_Service();

		/**
		 * The meta object literal for the '{@link ASD.impl.AssertionSetImpl <em>Assertion Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASD.impl.AssertionSetImpl
		 * @see ASD.impl.ASDPackageImpl#getAssertionSet()
		 * @generated
		 */
		EClass ASSERTION_SET = eINSTANCE.getAssertionSet();

		/**
		 * The meta object literal for the '<em><b>LType</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTION_SET__LTYPE = eINSTANCE.getAssertionSet_LType();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERTION_SET__PROFILE = eINSTANCE.getAssertionSet_Profile();

		/**
		 * The meta object literal for the '<em><b>Assertions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERTION_SET__ASSERTIONS = eINSTANCE.getAssertionSet_Assertions();

		/**
		 * The meta object literal for the '{@link ASD.impl.AssertionImpl <em>Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASD.impl.AssertionImpl
		 * @see ASD.impl.ASDPackageImpl#getAssertion()
		 * @generated
		 */
		EClass ASSERTION = eINSTANCE.getAssertion();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTION__DIMENSION = eINSTANCE.getAssertion_Dimension();

		/**
		 * The meta object literal for the '<em><b>Dimension Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTION__DIMENSION_TYPE = eINSTANCE.getAssertion_DimensionType();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTION__ROLE = eINSTANCE.getAssertion_Role();

		/**
		 * The meta object literal for the '<em><b>Min Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTION__MIN_VAL = eINSTANCE.getAssertion_MinVal();

		/**
		 * The meta object literal for the '<em><b>Max Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTION__MAX_VAL = eINSTANCE.getAssertion_MaxVal();

		/**
		 * The meta object literal for the '<em><b>LType</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTION__LTYPE = eINSTANCE.getAssertion_LType();

		/**
		 * The meta object literal for the '<em><b>Set</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERTION__SET = eINSTANCE.getAssertion_Set();

		/**
		 * The meta object literal for the '<em><b>Subset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTION__SUBSET = eINSTANCE.getAssertion_Subset();

		/**
		 * The meta object literal for the '{@link ASD.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASD.impl.NamedElementImpl
		 * @see ASD.impl.ASDPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ELEMENT__ANNOTATIONS = eINSTANCE.getNamedElement_Annotations();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link ASD.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASD.impl.AnnotationImpl
		 * @see ASD.impl.ASDPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__KEY = eINSTANCE.getAnnotation_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__VALUE = eINSTANCE.getAnnotation_Value();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__OWNER = eINSTANCE.getAnnotation_Owner();

		/**
		 * The meta object literal for the '{@link ASD.impl.InfoTypeImportedImpl <em>Info Type Imported</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASD.impl.InfoTypeImportedImpl
		 * @see ASD.impl.ASDPackageImpl#getInfoTypeImported()
		 * @generated
		 */
		EClass INFO_TYPE_IMPORTED = eINSTANCE.getInfoTypeImported();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO_TYPE_IMPORTED__URL = eINSTANCE.getInfoTypeImported_Url();

		/**
		 * The meta object literal for the '{@link ASD.EEnumOp <em>EEnum Op</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASD.EEnumOp
		 * @see ASD.impl.ASDPackageImpl#getEEnumOp()
		 * @generated
		 */
		EEnum EENUM_OP = eINSTANCE.getEEnumOp();

		/**
		 * The meta object literal for the '{@link ASD.EEnumMes <em>EEnum Mes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASD.EEnumMes
		 * @see ASD.impl.ASDPackageImpl#getEEnumMes()
		 * @generated
		 */
		EEnum EENUM_MES = eINSTANCE.getEEnumMes();

		/**
		 * The meta object literal for the '{@link ASD.EEnumSubset <em>EEnum Subset</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASD.EEnumSubset
		 * @see ASD.impl.ASDPackageImpl#getEEnumSubset()
		 * @generated
		 */
		EEnum EENUM_SUBSET = eINSTANCE.getEEnumSubset();

		/**
		 * The meta object literal for the '{@link ASD.EEnumValueType <em>EEnum Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASD.EEnumValueType
		 * @see ASD.impl.ASDPackageImpl#getEEnumValueType()
		 * @generated
		 */
		EEnum EENUM_VALUE_TYPE = eINSTANCE.getEEnumValueType();

		/**
		 * The meta object literal for the '{@link ASD.EEnumlogicalType <em>EEnumlogical Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASD.EEnumlogicalType
		 * @see ASD.impl.ASDPackageImpl#getEEnumlogicalType()
		 * @generated
		 */
		EEnum EENUMLOGICAL_TYPE = eINSTANCE.getEEnumlogicalType();

		/**
		 * The meta object literal for the '{@link ASD.EEnumDimensionType <em>EEnum Dimension Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASD.EEnumDimensionType
		 * @see ASD.impl.ASDPackageImpl#getEEnumDimensionType()
		 * @generated
		 */
		EEnum EENUM_DIMENSION_TYPE = eINSTANCE.getEEnumDimensionType();

		/**
		 * The meta object literal for the '{@link ASD.EEnumIntention <em>EEnum Intention</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ASD.EEnumIntention
		 * @see ASD.impl.ASDPackageImpl#getEEnumIntention()
		 * @generated
		 */
		EEnum EENUM_INTENTION = eINSTANCE.getEEnumIntention();

	}

} //ASDPackage
