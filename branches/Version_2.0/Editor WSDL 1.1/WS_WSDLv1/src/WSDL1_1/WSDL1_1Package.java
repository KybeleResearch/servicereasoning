/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL1_1;

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
 * @see WSDL1_1.WSDL1_1Factory
 * @model kind="package"
 * @generated
 */
public interface WSDL1_1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "WSDL1_1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://WSDLv1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "WS_WSDLv1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WSDL1_1Package eINSTANCE = WSDL1_1.impl.WSDL1_1PackageImpl.init();

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.SchemaImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__TARGET_NAMESPACE = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Nds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__NDS = 2;

	/**
	 * The feature id for the '<em><b>Ns Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__NS_SCHEMA = 3;

	/**
	 * The feature id for the '<em><b>Final Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__FINAL_DEFAULT = 4;

	/**
	 * The feature id for the '<em><b>Block Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__BLOCK_DEFAULT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ID = 6;

	/**
	 * The feature id for the '<em><b>Element Form Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ELEMENT_FORM_DEFAULT = 7;

	/**
	 * The feature id for the '<em><b>Attribute Form Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ATTRIBUTE_FORM_DEFAULT = 8;

	/**
	 * The feature id for the '<em><b>Xml lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__XML_LANG = 9;

	/**
	 * The feature id for the '<em><b>Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__INCLUDE = 10;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__IMPORT = 11;

	/**
	 * The feature id for the '<em><b>Redefine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__REDEFINE = 12;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ANNOTATION = 13;

	/**
	 * The feature id for the '<em><b>Simple Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__SIMPLE_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Complex Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__COMPLEX_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ATTRIBUTE = 17;

	/**
	 * The feature id for the '<em><b>Attribute Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ATTRIBUTE_GROUP = 18;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__GROUP = 19;

	/**
	 * The feature id for the '<em><b>Notation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__NOTATION = 20;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = 21;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.AdicionalInformationTypeImpl <em>Adicional Information Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.AdicionalInformationTypeImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getAdicionalInformationType()
	 * @generated
	 */
	int ADICIONAL_INFORMATION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Primitive Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADICIONAL_INFORMATION_TYPE__PRIMITIVE_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Adicional Information Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.TypeRefImpl <em>Type Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.TypeRefImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getTypeRef()
	 * @generated
	 */
	int TYPE_REF = 2;

	/**
	 * The number of structural features of the '<em>Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REF_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.IncludeImpl <em>Include</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.IncludeImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getInclude()
	 * @generated
	 */
	int INCLUDE = 3;

	/**
	 * The feature id for the '<em><b>Schema Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__SCHEMA_LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__ID = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__ANNOTATION = 2;

	/**
	 * The number of structural features of the '<em>Include</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.ImportXMLSchemaImpl <em>Import XML Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.ImportXMLSchemaImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getImportXMLSchema()
	 * @generated
	 */
	int IMPORT_XML_SCHEMA = 4;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_XML_SCHEMA__NAMESPACE = 0;

	/**
	 * The feature id for the '<em><b>Schema Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_XML_SCHEMA__SCHEMA_LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_XML_SCHEMA__ID = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_XML_SCHEMA__ANNOTATION = 3;

	/**
	 * The number of structural features of the '<em>Import XML Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_XML_SCHEMA_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.RedefineImpl <em>Redefine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.RedefineImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getRedefine()
	 * @generated
	 */
	int REDEFINE = 5;

	/**
	 * The feature id for the '<em><b>Schema Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINE__SCHEMA_LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINE__ID = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINE__ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>Simple Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINE__SIMPLE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Complex Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINE__COMPLEX_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Attribute Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINE__ATTRIBUTE_GROUP = 5;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINE__GROUP = 6;

	/**
	 * The number of structural features of the '<em>Redefine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.AnnotationImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 6;

	/**
	 * The feature id for the '<em><b>Appinfo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__APPINFO = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__DOCUMENTATION = 1;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.ComplexTypeImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getComplexType()
	 * @generated
	 */
	int COMPLEX_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__NAME = TYPE_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__ID = TYPE_REF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__ABSTRACT_DEF = TYPE_REF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__FINAL = TYPE_REF_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__BLOCK = TYPE_REF_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__MIXED = TYPE_REF_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__ANNOTATION = TYPE_REF_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Simple Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__SIMPLE_CONTENT = TYPE_REF_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Complex Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__COMPLEX_CONTENT = TYPE_REF_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__ALL = TYPE_REF_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__CHOICE = TYPE_REF_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Sequence Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__SEQUENCE_DEF = TYPE_REF_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__GROUP = TYPE_REF_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__ATTRIBUTE = TYPE_REF_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Attribute Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__ATTRIBUTE_GROUP = TYPE_REF_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__ANY_ATTRIBUTE = TYPE_REF_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_FEATURE_COUNT = TYPE_REF_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.ElementImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Primitive Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PRIMITIVE_TYPE = ADICIONAL_INFORMATION_TYPE__PRIMITIVE_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ID = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__MIN_OCCURS = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__MAX_OCCURS = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Nillable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NILLABLE = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Abstract Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ABSTRACT_DEF = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__FINAL = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__BLOCK = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__DEFAULT = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__FIXED = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__FORM = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ANNOTATION = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Complex Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__COMPLEX_TYPE = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Simple Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__SIMPLE_TYPE = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Unique Def</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__UNIQUE_DEF = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__KEY = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Keyref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__KEYREF = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__REF = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Substitution Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__SUBSTITUTION_GROUP = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TYPE = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 20;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.ElementImportedImpl <em>Element Imported</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.ElementImportedImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getElementImported()
	 * @generated
	 */
	int ELEMENT_IMPORTED = 9;

	/**
	 * The feature id for the '<em><b>Primitive Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORTED__PRIMITIVE_TYPE = ELEMENT__PRIMITIVE_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORTED__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORTED__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORTED__MIN_OCCURS = ELEMENT__MIN_OCCURS;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORTED__MAX_OCCURS = ELEMENT__MAX_OCCURS;

	/**
	 * The feature id for the '<em><b>Nillable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORTED__NILLABLE = ELEMENT__NILLABLE;

	/**
	 * The feature id for the '<em><b>Abstract Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORTED__ABSTRACT_DEF = ELEMENT__ABSTRACT_DEF;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORTED__FINAL = ELEMENT__FINAL;

	/**
	 * The feature id for the '<em><b>Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORTED__BLOCK = ELEMENT__BLOCK;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORTED__DEFAULT = ELEMENT__DEFAULT;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORTED__FIXED = ELEMENT__FIXED;

	/**
	 * The feature id for the '<em><b>Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORTED__FORM = ELEMENT__FORM;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORTED__ANNOTATION = ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Complex Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORTED__COMPLEX_TYPE = ELEMENT__COMPLEX_TYPE;

	/**
	 * The feature id for the '<em><b>Simple Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORTED__SIMPLE_TYPE = ELEMENT__SIMPLE_TYPE;

	/**
	 * The feature id for the '<em><b>Unique Def</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORTED__UNIQUE_DEF = ELEMENT__UNIQUE_DEF;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORTED__KEY = ELEMENT__KEY;

	/**
	 * The feature id for the '<em><b>Keyref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORTED__KEYREF = ELEMENT__KEYREF;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORTED__REF = ELEMENT__REF;

	/**
	 * The feature id for the '<em><b>Substitution Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORTED__SUBSTITUTION_GROUP = ELEMENT__SUBSTITUTION_GROUP;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORTED__TYPE = ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORTED__URL = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORTED__NAMESPACE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Orig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORTED__ORIG = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORTED__PART = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Element Imported</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORTED_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.AttributeImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 10;

	/**
	 * The feature id for the '<em><b>Primitive Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__PRIMITIVE_TYPE = ADICIONAL_INFORMATION_TYPE__PRIMITIVE_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ID = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__USE = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DEFAULT = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__FIXED = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__FORM = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ANNOTATION = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Simple Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__SIMPLE_TYPE = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__REF = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.AttributeGroupImpl <em>Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.AttributeGroupImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getAttributeGroup()
	 * @generated
	 */
	int ATTRIBUTE_GROUP = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_GROUP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_GROUP__ID = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_GROUP__ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_GROUP__ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Attribute Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_GROUP__ATTRIBUTE_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_GROUP__ANY_ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_GROUP__REF = 6;

	/**
	 * The number of structural features of the '<em>Attribute Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_GROUP_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.GroupImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__MIN_OCCURS = 1;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__MAX_OCCURS = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ID = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ANNOTATION = 4;

	/**
	 * The feature id for the '<em><b>All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ALL = 5;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CHOICE = 6;

	/**
	 * The feature id for the '<em><b>Sequence Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__SEQUENCE_DEF = 7;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__REF = 8;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.NotationImpl <em>Notation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.NotationImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getNotation()
	 * @generated
	 */
	int NOTATION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTATION__ID = 1;

	/**
	 * The feature id for the '<em><b>Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTATION__PUBLIC = 2;

	/**
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTATION__SYSTEM = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTATION__ANNOTATION = 4;

	/**
	 * The number of structural features of the '<em>Notation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTATION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.SimpleContentImpl <em>Simple Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.SimpleContentImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getSimpleContent()
	 * @generated
	 */
	int SIMPLE_CONTENT = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTENT__ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTENT__RESTRICTION = 2;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTENT__EXTENSION = 3;

	/**
	 * The number of structural features of the '<em>Simple Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.ComplexContentImpl <em>Complex Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.ComplexContentImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getComplexContent()
	 * @generated
	 */
	int COMPLEX_CONTENT = 15;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_CONTENT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_CONTENT__ID = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_CONTENT__ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_CONTENT__RESTRICTION = 3;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_CONTENT__EXTENSION = 4;

	/**
	 * The number of structural features of the '<em>Complex Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_CONTENT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.UniqueImpl <em>Unique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.UniqueImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getUnique()
	 * @generated
	 */
	int UNIQUE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE__ID = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE__ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE__SELECTOR = 3;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE__FIELD = 4;

	/**
	 * The number of structural features of the '<em>Unique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.KeyImpl <em>Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.KeyImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getKey()
	 * @generated
	 */
	int KEY = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__ID = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__SELECTOR = 3;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__FIELD = 4;

	/**
	 * The number of structural features of the '<em>Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.KeyRefImpl <em>Key Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.KeyRefImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getKeyRef()
	 * @generated
	 */
	int KEY_REF = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_REF__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_REF__ID = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_REF__ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_REF__SELECTOR = 3;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_REF__FIELD = 4;

	/**
	 * The feature id for the '<em><b>Refer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_REF__REFER = 5;

	/**
	 * The number of structural features of the '<em>Key Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_REF_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.AnyAttributeImpl <em>Any Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.AnyAttributeImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getAnyAttribute()
	 * @generated
	 */
	int ANY_ATTRIBUTE = 19;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_ATTRIBUTE__NAMESPACE = 0;

	/**
	 * The feature id for the '<em><b>Process Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_ATTRIBUTE__PROCESS_CONTENTS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_ATTRIBUTE__ID = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_ATTRIBUTE__ANNOTATION = 3;

	/**
	 * The number of structural features of the '<em>Any Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_ATTRIBUTE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.ExtensionImpl <em>Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.ExtensionImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getExtension()
	 * @generated
	 */
	int EXTENSION = 20;

	/**
	 * The feature id for the '<em><b>Primitive Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__PRIMITIVE_TYPE = ADICIONAL_INFORMATION_TYPE__PRIMITIVE_TYPE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__ID = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__ANNOTATION = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__ALL = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__CHOICE = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sequence Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__SEQUENCE_DEF = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__GROUP = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__ATTRIBUTE = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Attribute Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__ATTRIBUTE_GROUP = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__ANY_ATTRIBUTE = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__BASE = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FEATURE_COUNT = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.SelectorImpl <em>Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.SelectorImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getSelector()
	 * @generated
	 */
	int SELECTOR = 21;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR__XPATH = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR__ID = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR__ANNOTATION = 2;

	/**
	 * The number of structural features of the '<em>Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.FieldImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getField()
	 * @generated
	 */
	int FIELD = 22;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__XPATH = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ID = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ANNOTATION = 2;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.AppInfoImpl <em>App Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.AppInfoImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getAppInfo()
	 * @generated
	 */
	int APP_INFO = 23;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_INFO__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_INFO__ID = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_INFO__ANY = 2;

	/**
	 * The number of structural features of the '<em>App Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_INFO_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.DocumentationXMLSchemaImpl <em>Documentation XML Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.DocumentationXMLSchemaImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getDocumentationXMLSchema()
	 * @generated
	 */
	int DOCUMENTATION_XML_SCHEMA = 24;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_XML_SCHEMA__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_XML_SCHEMA__ID = 1;

	/**
	 * The feature id for the '<em><b>Xml lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_XML_SCHEMA__XML_LANG = 2;

	/**
	 * The feature id for the '<em><b>Any</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_XML_SCHEMA__ANY = 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_XML_SCHEMA__TEXT = 4;

	/**
	 * The number of structural features of the '<em>Documentation XML Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_XML_SCHEMA_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.AnyImpl <em>Any</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.AnyImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getAny()
	 * @generated
	 */
	int ANY = 25;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY__NAMESPACE = 0;

	/**
	 * The feature id for the '<em><b>Process Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY__PROCESS_CONTENTS = 1;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY__MIN_OCCURS = 2;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY__MAX_OCCURS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY__ID = 4;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY__ANNOTATION = 5;

	/**
	 * The number of structural features of the '<em>Any</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.AllImpl <em>All</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.AllImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getAll()
	 * @generated
	 */
	int ALL = 26;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL__MIN_OCCURS = 0;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL__MAX_OCCURS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL__ID = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL__ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL__ELEMENT = 4;

	/**
	 * The number of structural features of the '<em>All</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.ChoiceImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 27;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__MIN_OCCURS = 0;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__MAX_OCCURS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__ID = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__GROUP = 5;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__CHOICE = 6;

	/**
	 * The feature id for the '<em><b>Sequence Def</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__SEQUENCE_DEF = 7;

	/**
	 * The feature id for the '<em><b>Any</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__ANY = 8;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.SequenceTypeImpl <em>Sequence Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.SequenceTypeImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getSequenceType()
	 * @generated
	 */
	int SEQUENCE_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__MIN_OCCURS = 0;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__MAX_OCCURS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__ID = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__GROUP = 5;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__CHOICE = 6;

	/**
	 * The feature id for the '<em><b>Sequence Def</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__SEQUENCE_DEF = 7;

	/**
	 * The feature id for the '<em><b>Any</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__ANY = 8;

	/**
	 * The number of structural features of the '<em>Sequence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.SimpleTypeImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getSimpleType()
	 * @generated
	 */
	int SIMPLE_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__NAME = TYPE_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__FINAL = TYPE_REF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__ID = TYPE_REF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__ANNOTATION = TYPE_REF_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__RESTRICTION = TYPE_REF_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__LIST = TYPE_REF_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Union</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__UNION = TYPE_REF_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_FEATURE_COUNT = TYPE_REF_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.ListImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getList()
	 * @generated
	 */
	int LIST = 30;

	/**
	 * The feature id for the '<em><b>Primitive Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__PRIMITIVE_TYPE = ADICIONAL_INFORMATION_TYPE__PRIMITIVE_TYPE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ID = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ANNOTATION = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Simple Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__SIMPLE_TYPE = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Item Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ITEM_TYPE = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.UnionImpl <em>Union</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.UnionImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getUnion()
	 * @generated
	 */
	int UNION = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__ID = 0;

	/**
	 * The feature id for the '<em><b>Member Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__MEMBER_TYPES = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>Simple Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__SIMPLE_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Union</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.RestrictionImpl <em>Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.RestrictionImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getRestriction()
	 * @generated
	 */
	int RESTRICTION = 32;

	/**
	 * The feature id for the '<em><b>Primitive Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__PRIMITIVE_TYPE = ADICIONAL_INFORMATION_TYPE__PRIMITIVE_TYPE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__ID = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__ANNOTATION = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__ALL = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__CHOICE = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sequence Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__SEQUENCE_DEF = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__GROUP = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Simple Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__SIMPLE_TYPE = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Min Exclusive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__MIN_EXCLUSIVE = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__MIN_INCLUSIVE = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Max Exclusive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__MAX_EXCLUSIVE = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__MAX_INCLUSIVE = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Total Digits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__TOTAL_DIGITS = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Fraction Digits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__FRACTION_DIGITS = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__PATTERN = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__ENUMERATION = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>White Space</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__WHITE_SPACE = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__LENGTH = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__MAX_LENGTH = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__MIN_LENGTH = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__ATTRIBUTE = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Attribute Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__ATTRIBUTE_GROUP = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__ANY_ATTRIBUTE = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__BASE = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 22;

	/**
	 * The number of structural features of the '<em>Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_FEATURE_COUNT = ADICIONAL_INFORMATION_TYPE_FEATURE_COUNT + 23;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.MinInclusiveImpl <em>Min Inclusive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.MinInclusiveImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getMinInclusive()
	 * @generated
	 */
	int MIN_INCLUSIVE = 33;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_INCLUSIVE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_INCLUSIVE__ID = 1;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_INCLUSIVE__FIXED = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_INCLUSIVE__ANNOTATION = 3;

	/**
	 * The number of structural features of the '<em>Min Inclusive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_INCLUSIVE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.MinExclusiveImpl <em>Min Exclusive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.MinExclusiveImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getMinExclusive()
	 * @generated
	 */
	int MIN_EXCLUSIVE = 34;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_EXCLUSIVE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_EXCLUSIVE__ID = 1;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_EXCLUSIVE__FIXED = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_EXCLUSIVE__ANNOTATION = 3;

	/**
	 * The number of structural features of the '<em>Min Exclusive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_EXCLUSIVE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.MaxInclusiveImpl <em>Max Inclusive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.MaxInclusiveImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getMaxInclusive()
	 * @generated
	 */
	int MAX_INCLUSIVE = 35;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_INCLUSIVE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_INCLUSIVE__ID = 1;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_INCLUSIVE__FIXED = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_INCLUSIVE__ANNOTATION = 3;

	/**
	 * The number of structural features of the '<em>Max Inclusive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_INCLUSIVE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.MaxExclusiveImpl <em>Max Exclusive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.MaxExclusiveImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getMaxExclusive()
	 * @generated
	 */
	int MAX_EXCLUSIVE = 36;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_EXCLUSIVE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_EXCLUSIVE__ID = 1;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_EXCLUSIVE__FIXED = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_EXCLUSIVE__ANNOTATION = 3;

	/**
	 * The number of structural features of the '<em>Max Exclusive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_EXCLUSIVE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.TotalDigitsImpl <em>Total Digits</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.TotalDigitsImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getTotalDigits()
	 * @generated
	 */
	int TOTAL_DIGITS = 37;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_DIGITS__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_DIGITS__ID = 1;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_DIGITS__FIXED = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_DIGITS__ANNOTATION = 3;

	/**
	 * The number of structural features of the '<em>Total Digits</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_DIGITS_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.FractionDigitsImpl <em>Fraction Digits</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.FractionDigitsImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getFractionDigits()
	 * @generated
	 */
	int FRACTION_DIGITS = 38;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRACTION_DIGITS__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRACTION_DIGITS__ID = 1;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRACTION_DIGITS__FIXED = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRACTION_DIGITS__ANNOTATION = 3;

	/**
	 * The number of structural features of the '<em>Fraction Digits</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRACTION_DIGITS_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.PatternImpl <em>Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.PatternImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getPattern()
	 * @generated
	 */
	int PATTERN = 39;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__ID = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__ANNOTATION = 2;

	/**
	 * The number of structural features of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.EnumerationImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 40;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__ID = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__ANNOTATION = 2;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.WhiteSpaceImpl <em>White Space</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.WhiteSpaceImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getWhiteSpace()
	 * @generated
	 */
	int WHITE_SPACE = 41;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITE_SPACE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITE_SPACE__ID = 1;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITE_SPACE__FIXED = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITE_SPACE__ANNOTATION = 3;

	/**
	 * The number of structural features of the '<em>White Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITE_SPACE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.LengthImpl <em>Length</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.LengthImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getLength()
	 * @generated
	 */
	int LENGTH = 42;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__ID = 1;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__FIXED = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__ANNOTATION = 3;

	/**
	 * The number of structural features of the '<em>Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.MaxLengthImpl <em>Max Length</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.MaxLengthImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getMaxLength()
	 * @generated
	 */
	int MAX_LENGTH = 43;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_LENGTH__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_LENGTH__ID = 1;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_LENGTH__FIXED = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_LENGTH__ANNOTATION = 3;

	/**
	 * The number of structural features of the '<em>Max Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_LENGTH_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.MinLengthImpl <em>Min Length</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.MinLengthImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getMinLength()
	 * @generated
	 */
	int MIN_LENGTH = 44;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_LENGTH__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_LENGTH__ID = 1;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_LENGTH__FIXED = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_LENGTH__ANNOTATION = 3;

	/**
	 * The number of structural features of the '<em>Min Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_LENGTH_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.ObjectImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 45;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__DOCUMENTATION = 0;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.BindingSOAPImpl <em>Binding SOAP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.BindingSOAPImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getBindingSOAP()
	 * @generated
	 */
	int BINDING_SOAP = 46;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SOAP__STYLE = 0;

	/**
	 * The feature id for the '<em><b>Transport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SOAP__TRANSPORT = 1;

	/**
	 * The number of structural features of the '<em>Binding SOAP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_SOAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.OperationSOAPImpl <em>Operation SOAP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.OperationSOAPImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getOperationSOAP()
	 * @generated
	 */
	int OPERATION_SOAP = 47;

	/**
	 * The feature id for the '<em><b>Soap Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SOAP__SOAP_ACTION = 0;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SOAP__STYLE = 1;

	/**
	 * The number of structural features of the '<em>Operation SOAP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_SOAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.BodySOAPImpl <em>Body SOAP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.BodySOAPImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getBodySOAP()
	 * @generated
	 */
	int BODY_SOAP = 48;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_SOAP__PARTS = 0;

	/**
	 * The feature id for the '<em><b>Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_SOAP__USE = 1;

	/**
	 * The feature id for the '<em><b>Encoding Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_SOAP__ENCODING_STYLE = 2;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_SOAP__NAMESPACE = 3;

	/**
	 * The number of structural features of the '<em>Body SOAP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_SOAP_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.HeaderSOAPImpl <em>Header SOAP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.HeaderSOAPImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getHeaderSOAP()
	 * @generated
	 */
	int HEADER_SOAP = 49;

	/**
	 * The feature id for the '<em><b>Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_SOAP__PART = 0;

	/**
	 * The feature id for the '<em><b>Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_SOAP__USE = 1;

	/**
	 * The feature id for the '<em><b>Encoding Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_SOAP__ENCODING_STYLE = 2;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_SOAP__NAMESPACE = 3;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_SOAP__MESSAGE = 4;

	/**
	 * The feature id for the '<em><b>Headerfault</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_SOAP__HEADERFAULT = 5;

	/**
	 * The number of structural features of the '<em>Header SOAP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_SOAP_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.HeaderFaultSOAPImpl <em>Header Fault SOAP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.HeaderFaultSOAPImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getHeaderFaultSOAP()
	 * @generated
	 */
	int HEADER_FAULT_SOAP = 50;

	/**
	 * The feature id for the '<em><b>Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FAULT_SOAP__PART = 0;

	/**
	 * The feature id for the '<em><b>Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FAULT_SOAP__USE = 1;

	/**
	 * The feature id for the '<em><b>Encoding Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FAULT_SOAP__ENCODING_STYLE = 2;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FAULT_SOAP__NAMESPACE = 3;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FAULT_SOAP__MESSAGE = 4;

	/**
	 * The number of structural features of the '<em>Header Fault SOAP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FAULT_SOAP_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.AddressSOAPImpl <em>Address SOAP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.AddressSOAPImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getAddressSOAP()
	 * @generated
	 */
	int ADDRESS_SOAP = 51;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_SOAP__LOCATION = 0;

	/**
	 * The number of structural features of the '<em>Address SOAP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_SOAP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.FaultSOAPImpl <em>Fault SOAP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.FaultSOAPImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getFaultSOAP()
	 * @generated
	 */
	int FAULT_SOAP = 52;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_SOAP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_SOAP__USE = 1;

	/**
	 * The feature id for the '<em><b>Encoding Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_SOAP__ENCODING_STYLE = 2;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_SOAP__NAMESPACE = 3;

	/**
	 * The number of structural features of the '<em>Fault SOAP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_SOAP_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.AddressHTTPImpl <em>Address HTTP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.AddressHTTPImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getAddressHTTP()
	 * @generated
	 */
	int ADDRESS_HTTP = 53;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_HTTP__LOCATION = 0;

	/**
	 * The number of structural features of the '<em>Address HTTP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_HTTP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.OperationHTTPImpl <em>Operation HTTP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.OperationHTTPImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getOperationHTTP()
	 * @generated
	 */
	int OPERATION_HTTP = 54;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_HTTP__LOCATION = 0;

	/**
	 * The number of structural features of the '<em>Operation HTTP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_HTTP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.URLEncodedImpl <em>URL Encoded</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.URLEncodedImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getURLEncoded()
	 * @generated
	 */
	int URL_ENCODED = 55;

	/**
	 * The number of structural features of the '<em>URL Encoded</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ENCODED_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.URLReplacementImpl <em>URL Replacement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.URLReplacementImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getURLReplacement()
	 * @generated
	 */
	int URL_REPLACEMENT = 56;

	/**
	 * The number of structural features of the '<em>URL Replacement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_REPLACEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.BindingHTTPImpl <em>Binding HTTP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.BindingHTTPImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getBindingHTTP()
	 * @generated
	 */
	int BINDING_HTTP = 57;

	/**
	 * The feature id for the '<em><b>Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_HTTP__VERB = 0;

	/**
	 * The number of structural features of the '<em>Binding HTTP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_HTTP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.MIMEMultiPartRelatedImpl <em>MIME Multi Part Related</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.MIMEMultiPartRelatedImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getMIMEMultiPartRelated()
	 * @generated
	 */
	int MIME_MULTI_PART_RELATED = 58;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_MULTI_PART_RELATED__PART = 0;

	/**
	 * The number of structural features of the '<em>MIME Multi Part Related</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_MULTI_PART_RELATED_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.MIMEPartImpl <em>MIME Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.MIMEPartImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getMIMEPart()
	 * @generated
	 */
	int MIME_PART = 59;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_PART__CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Mime Xml</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_PART__MIME_XML = 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_PART__BODY = 2;

	/**
	 * The number of structural features of the '<em>MIME Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_PART_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.MIMEContentImpl <em>MIME Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.MIMEContentImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getMIMEContent()
	 * @generated
	 */
	int MIME_CONTENT = 60;

	/**
	 * The feature id for the '<em><b>Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_CONTENT__PART = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_CONTENT__TYPE = 1;

	/**
	 * The number of structural features of the '<em>MIME Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_CONTENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.MIMEXmlImpl <em>MIME Xml</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.MIMEXmlImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getMIMEXml()
	 * @generated
	 */
	int MIME_XML = 61;

	/**
	 * The feature id for the '<em><b>Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_XML__PART = 0;

	/**
	 * The number of structural features of the '<em>MIME Xml</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIME_XML_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.PortTypeFaultImpl <em>Port Type Fault</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.PortTypeFaultImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getPortTypeFault()
	 * @generated
	 */
	int PORT_TYPE_FAULT = 62;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_FAULT__DOCUMENTATION = OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_FAULT__NAME = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_FAULT__MESSAGE = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Port Type Fault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_FAULT_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.DefinitionsImpl <em>Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.DefinitionsImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getDefinitions()
	 * @generated
	 */
	int DEFINITIONS = 63;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__DOCUMENTATION = OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__BINDING = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__SERVICE = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__PORT_TYPE = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__MESSAGE = OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__TYPES = OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__NAME = OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__TARGET_NAMESPACE = OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__NAMESPACE = OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__IMPORT = OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.ElementTypeImpl <em>Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.ElementTypeImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getElementType()
	 * @generated
	 */
	int ELEMENT_TYPE = 64;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__DOCUMENTATION = OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__SCHEMA = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.MessageImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 65;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__DOCUMENTATION = OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__PART = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.PartImpl <em>Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.PartImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getPart()
	 * @generated
	 */
	int PART = 66;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__NAME = 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Element Imported</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__ELEMENT_IMPORTED = 3;

	/**
	 * The number of structural features of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.PortTypeImpl <em>Port Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.PortTypeImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getPortType()
	 * @generated
	 */
	int PORT_TYPE = 67;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__DOCUMENTATION = OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__NAME = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__OPERATION = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.PortTypeOperationImpl <em>Port Type Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.PortTypeOperationImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getPortTypeOperation()
	 * @generated
	 */
	int PORT_TYPE_OPERATION = 68;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_OPERATION__DOCUMENTATION = OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_OPERATION__OUTPUT = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_OPERATION__INPUT = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_OPERATION__NAME = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_OPERATION__FAULT = OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Port Type Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_OPERATION_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.PortTypeInputImpl <em>Port Type Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.PortTypeInputImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getPortTypeInput()
	 * @generated
	 */
	int PORT_TYPE_INPUT = 69;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_INPUT__DOCUMENTATION = OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_INPUT__NAME = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_INPUT__MESSAGE = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Port Type Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_INPUT_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.PortTypeOutputImpl <em>Port Type Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.PortTypeOutputImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getPortTypeOutput()
	 * @generated
	 */
	int PORT_TYPE_OUTPUT = 70;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_OUTPUT__DOCUMENTATION = OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_OUTPUT__NAME = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_OUTPUT__MESSAGE = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Port Type Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_OUTPUT_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.BindingImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 71;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__DOCUMENTATION = OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__NAME = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__TYPE = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__OPERATION = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Soapbinding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__SOAPBINDING = OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Httpbinding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__HTTPBINDING = OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.BindingOperationImpl <em>Binding Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.BindingOperationImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getBindingOperation()
	 * @generated
	 */
	int BINDING_OPERATION = 72;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION__DOCUMENTATION = OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION__OUTPUT = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION__INPUT = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION__NAME = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION__FAULT = OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Soapoperation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION__SOAPOPERATION = OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Httpoperation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION__HTTPOPERATION = OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Binding Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.BindingInputImpl <em>Binding Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.BindingInputImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getBindingInput()
	 * @generated
	 */
	int BINDING_INPUT = 73;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INPUT__DOCUMENTATION = OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INPUT__BODY = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INPUT__HEADER = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Url Replacement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INPUT__URL_REPLACEMENT = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Url Encoded</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INPUT__URL_ENCODED = OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Multipart Related</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INPUT__MULTIPART_RELATED = OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INPUT__CONTENT = OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Mime Xml</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INPUT__MIME_XML = OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Binding Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INPUT_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.BindingOutputImpl <em>Binding Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.BindingOutputImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getBindingOutput()
	 * @generated
	 */
	int BINDING_OUTPUT = 74;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTPUT__DOCUMENTATION = OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTPUT__BODY = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTPUT__HEADER = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Multipart Related</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTPUT__MULTIPART_RELATED = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTPUT__CONTENT = OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mime Xml</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTPUT__MIME_XML = OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Url Replacement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTPUT__URL_REPLACEMENT = OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Url Encoded</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTPUT__URL_ENCODED = OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Binding Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTPUT_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.BindingFaultImpl <em>Binding Fault</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.BindingFaultImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getBindingFault()
	 * @generated
	 */
	int BINDING_FAULT = 75;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FAULT__DOCUMENTATION = OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FAULT__NAME = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FAULT__FAULT = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FAULT__BODY = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FAULT__HEADER = OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Multipart Related</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FAULT__MULTIPART_RELATED = OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FAULT__CONTENT = OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Mime Xml</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FAULT__MIME_XML = OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Url Replacement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FAULT__URL_REPLACEMENT = OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Url Encoded</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FAULT__URL_ENCODED = OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Binding Fault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FAULT_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.ServiceImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 76;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DOCUMENTATION = OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PORT = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.PortImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getPort()
	 * @generated
	 */
	int PORT = 77;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__DOCUMENTATION = OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__BINDING = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Soap Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__SOAP_ADDRESS = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Http Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__HTTP_ADDRESS = OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.ImportImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 78;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__NAMESPACE = 1;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.DocumentationImpl <em>Documentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.DocumentationImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getDocumentation()
	 * @generated
	 */
	int DOCUMENTATION = 79;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.TextImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getText()
	 * @generated
	 */
	int TEXT = 80;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link WSDL1_1.impl.NamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.impl.NamespaceImpl
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getNamespace()
	 * @generated
	 */
	int NAMESPACE = 81;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__DEFINITION = 2;

	/**
	 * The number of structural features of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link WSDL1_1.formValues <em>form Values</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.formValues
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getformValues()
	 * @generated
	 */
	int FORM_VALUES = 82;

	/**
	 * The meta object id for the '{@link WSDL1_1.usesValues <em>uses Values</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.usesValues
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getusesValues()
	 * @generated
	 */
	int USES_VALUES = 83;

	/**
	 * The meta object id for the '{@link WSDL1_1.processContentsValue <em>process Contents Value</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL1_1.processContentsValue
	 * @see WSDL1_1.impl.WSDL1_1PackageImpl#getprocessContentsValue()
	 * @generated
	 */
	int PROCESS_CONTENTS_VALUE = 84;


	/**
	 * Returns the meta object for class '{@link WSDL1_1.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see WSDL1_1.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Schema#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see WSDL1_1.Schema#getTargetNamespace()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_TargetNamespace();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Schema#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see WSDL1_1.Schema#getVersion()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Version();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Schema#getNds <em>Nds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nds</em>'.
	 * @see WSDL1_1.Schema#getNds()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Nds();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Schema#getNsSchema <em>Ns Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns Schema</em>'.
	 * @see WSDL1_1.Schema#getNsSchema()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_NsSchema();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Schema#getFinalDefault <em>Final Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final Default</em>'.
	 * @see WSDL1_1.Schema#getFinalDefault()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_FinalDefault();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Schema#getBlockDefault <em>Block Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block Default</em>'.
	 * @see WSDL1_1.Schema#getBlockDefault()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_BlockDefault();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Schema#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.Schema#getId()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Id();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Schema#getElementFormDefault <em>Element Form Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Form Default</em>'.
	 * @see WSDL1_1.Schema#getElementFormDefault()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_ElementFormDefault();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Schema#getAttributeFormDefault <em>Attribute Form Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Form Default</em>'.
	 * @see WSDL1_1.Schema#getAttributeFormDefault()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_AttributeFormDefault();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Schema#getXml_lang <em>Xml lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xml lang</em>'.
	 * @see WSDL1_1.Schema#getXml_lang()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Xml_lang();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Schema#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include</em>'.
	 * @see WSDL1_1.Schema#getInclude()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Include();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Schema#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Import</em>'.
	 * @see WSDL1_1.Schema#getImport()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Import();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Schema#getRedefine <em>Redefine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Redefine</em>'.
	 * @see WSDL1_1.Schema#getRedefine()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Redefine();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Schema#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see WSDL1_1.Schema#getAnnotation()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Annotation();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Schema#getSimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple Type</em>'.
	 * @see WSDL1_1.Schema#getSimpleType()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_SimpleType();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Schema#getComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complex Type</em>'.
	 * @see WSDL1_1.Schema#getComplexType()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_ComplexType();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Schema#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see WSDL1_1.Schema#getElement()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Element();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Schema#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see WSDL1_1.Schema#getAttribute()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Schema#getAttributeGroup <em>Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Group</em>'.
	 * @see WSDL1_1.Schema#getAttributeGroup()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Schema#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group</em>'.
	 * @see WSDL1_1.Schema#getGroup()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Schema#getNotation <em>Notation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notation</em>'.
	 * @see WSDL1_1.Schema#getNotation()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Notation();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.AdicionalInformationType <em>Adicional Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adicional Information Type</em>'.
	 * @see WSDL1_1.AdicionalInformationType
	 * @generated
	 */
	EClass getAdicionalInformationType();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.AdicionalInformationType#getPrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primitive Type</em>'.
	 * @see WSDL1_1.AdicionalInformationType#getPrimitiveType()
	 * @see #getAdicionalInformationType()
	 * @generated
	 */
	EAttribute getAdicionalInformationType_PrimitiveType();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.TypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Ref</em>'.
	 * @see WSDL1_1.TypeRef
	 * @generated
	 */
	EClass getTypeRef();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.Include <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Include</em>'.
	 * @see WSDL1_1.Include
	 * @generated
	 */
	EClass getInclude();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Include#getSchemaLocation <em>Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Location</em>'.
	 * @see WSDL1_1.Include#getSchemaLocation()
	 * @see #getInclude()
	 * @generated
	 */
	EAttribute getInclude_SchemaLocation();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Include#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.Include#getId()
	 * @see #getInclude()
	 * @generated
	 */
	EAttribute getInclude_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Include#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL1_1.Include#getAnnotation()
	 * @see #getInclude()
	 * @generated
	 */
	EReference getInclude_Annotation();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.ImportXMLSchema <em>Import XML Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import XML Schema</em>'.
	 * @see WSDL1_1.ImportXMLSchema
	 * @generated
	 */
	EClass getImportXMLSchema();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.ImportXMLSchema#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see WSDL1_1.ImportXMLSchema#getNamespace()
	 * @see #getImportXMLSchema()
	 * @generated
	 */
	EAttribute getImportXMLSchema_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.ImportXMLSchema#getSchemaLocation <em>Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Location</em>'.
	 * @see WSDL1_1.ImportXMLSchema#getSchemaLocation()
	 * @see #getImportXMLSchema()
	 * @generated
	 */
	EAttribute getImportXMLSchema_SchemaLocation();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.ImportXMLSchema#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.ImportXMLSchema#getId()
	 * @see #getImportXMLSchema()
	 * @generated
	 */
	EAttribute getImportXMLSchema_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.ImportXMLSchema#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL1_1.ImportXMLSchema#getAnnotation()
	 * @see #getImportXMLSchema()
	 * @generated
	 */
	EReference getImportXMLSchema_Annotation();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.Redefine <em>Redefine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Redefine</em>'.
	 * @see WSDL1_1.Redefine
	 * @generated
	 */
	EClass getRedefine();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Redefine#getSchemaLocation <em>Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Location</em>'.
	 * @see WSDL1_1.Redefine#getSchemaLocation()
	 * @see #getRedefine()
	 * @generated
	 */
	EAttribute getRedefine_SchemaLocation();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Redefine#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.Redefine#getId()
	 * @see #getRedefine()
	 * @generated
	 */
	EAttribute getRedefine_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Redefine#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see WSDL1_1.Redefine#getAnnotation()
	 * @see #getRedefine()
	 * @generated
	 */
	EReference getRedefine_Annotation();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Redefine#getSimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple Type</em>'.
	 * @see WSDL1_1.Redefine#getSimpleType()
	 * @see #getRedefine()
	 * @generated
	 */
	EReference getRedefine_SimpleType();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Redefine#getComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complex Type</em>'.
	 * @see WSDL1_1.Redefine#getComplexType()
	 * @see #getRedefine()
	 * @generated
	 */
	EReference getRedefine_ComplexType();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Redefine#getAttributeGroup <em>Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Group</em>'.
	 * @see WSDL1_1.Redefine#getAttributeGroup()
	 * @see #getRedefine()
	 * @generated
	 */
	EReference getRedefine_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Redefine#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group</em>'.
	 * @see WSDL1_1.Redefine#getGroup()
	 * @see #getRedefine()
	 * @generated
	 */
	EReference getRedefine_Group();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see WSDL1_1.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Annotation#getAppinfo <em>Appinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Appinfo</em>'.
	 * @see WSDL1_1.Annotation#getAppinfo()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Appinfo();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Annotation#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see WSDL1_1.Annotation#getDocumentation()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Documentation();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.ComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Type</em>'.
	 * @see WSDL1_1.ComplexType
	 * @generated
	 */
	EClass getComplexType();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.ComplexType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL1_1.ComplexType#getName()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_Name();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.ComplexType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.ComplexType#getId()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_Id();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.ComplexType#getAbstractDef <em>Abstract Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract Def</em>'.
	 * @see WSDL1_1.ComplexType#getAbstractDef()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_AbstractDef();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.ComplexType#getFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see WSDL1_1.ComplexType#getFinal()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_Final();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.ComplexType#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block</em>'.
	 * @see WSDL1_1.ComplexType#getBlock()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_Block();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.ComplexType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mixed</em>'.
	 * @see WSDL1_1.ComplexType#getMixed()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_Mixed();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.ComplexType#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL1_1.ComplexType#getAnnotation()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.ComplexType#getSimpleContent <em>Simple Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Content</em>'.
	 * @see WSDL1_1.ComplexType#getSimpleContent()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_SimpleContent();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.ComplexType#getComplexContent <em>Complex Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Content</em>'.
	 * @see WSDL1_1.ComplexType#getComplexContent()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_ComplexContent();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.ComplexType#getAll <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All</em>'.
	 * @see WSDL1_1.ComplexType#getAll()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_All();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.ComplexType#getChoice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Choice</em>'.
	 * @see WSDL1_1.ComplexType#getChoice()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_Choice();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.ComplexType#getSequenceDef <em>Sequence Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Def</em>'.
	 * @see WSDL1_1.ComplexType#getSequenceDef()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_SequenceDef();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.ComplexType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group</em>'.
	 * @see WSDL1_1.ComplexType#getGroup()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.ComplexType#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see WSDL1_1.ComplexType#getAttribute()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.ComplexType#getAttributeGroup <em>Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Group</em>'.
	 * @see WSDL1_1.ComplexType#getAttributeGroup()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.ComplexType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Any Attribute</em>'.
	 * @see WSDL1_1.ComplexType#getAnyAttribute()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see WSDL1_1.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL1_1.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Element#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.Element#getId()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Element#getMinOccurs <em>Min Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Occurs</em>'.
	 * @see WSDL1_1.Element#getMinOccurs()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_MinOccurs();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Element#getMaxOccurs <em>Max Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Occurs</em>'.
	 * @see WSDL1_1.Element#getMaxOccurs()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_MaxOccurs();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Element#getNillable <em>Nillable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nillable</em>'.
	 * @see WSDL1_1.Element#getNillable()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Nillable();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Element#getAbstractDef <em>Abstract Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract Def</em>'.
	 * @see WSDL1_1.Element#getAbstractDef()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_AbstractDef();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Element#getFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see WSDL1_1.Element#getFinal()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Final();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Element#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block</em>'.
	 * @see WSDL1_1.Element#getBlock()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Block();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Element#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see WSDL1_1.Element#getDefault()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Default();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Element#getFixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed</em>'.
	 * @see WSDL1_1.Element#getFixed()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Fixed();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Element#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Form</em>'.
	 * @see WSDL1_1.Element#getForm()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Form();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Element#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL1_1.Element#getAnnotation()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Element#getComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Type</em>'.
	 * @see WSDL1_1.Element#getComplexType()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_ComplexType();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Element#getSimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Type</em>'.
	 * @see WSDL1_1.Element#getSimpleType()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_SimpleType();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Element#getUniqueDef <em>Unique Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unique Def</em>'.
	 * @see WSDL1_1.Element#getUniqueDef()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_UniqueDef();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Element#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Key</em>'.
	 * @see WSDL1_1.Element#getKey()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Key();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Element#getKeyref <em>Keyref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keyref</em>'.
	 * @see WSDL1_1.Element#getKeyref()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Keyref();

	/**
	 * Returns the meta object for the reference '{@link WSDL1_1.Element#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see WSDL1_1.Element#getRef()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Ref();

	/**
	 * Returns the meta object for the reference '{@link WSDL1_1.Element#getSubstitutionGroup <em>Substitution Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Substitution Group</em>'.
	 * @see WSDL1_1.Element#getSubstitutionGroup()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_SubstitutionGroup();

	/**
	 * Returns the meta object for the reference '{@link WSDL1_1.Element#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see WSDL1_1.Element#getType()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Type();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.ElementImported <em>Element Imported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Imported</em>'.
	 * @see WSDL1_1.ElementImported
	 * @generated
	 */
	EClass getElementImported();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.ElementImported#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see WSDL1_1.ElementImported#getUrl()
	 * @see #getElementImported()
	 * @generated
	 */
	EAttribute getElementImported_Url();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.ElementImported#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see WSDL1_1.ElementImported#getNamespace()
	 * @see #getElementImported()
	 * @generated
	 */
	EAttribute getElementImported_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.ElementImported#getOrig <em>Orig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orig</em>'.
	 * @see WSDL1_1.ElementImported#getOrig()
	 * @see #getElementImported()
	 * @generated
	 */
	EAttribute getElementImported_Orig();

	/**
	 * Returns the meta object for the reference list '{@link WSDL1_1.ElementImported#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Part</em>'.
	 * @see WSDL1_1.ElementImported#getPart()
	 * @see #getElementImported()
	 * @generated
	 */
	EReference getElementImported_Part();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see WSDL1_1.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL1_1.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Attribute#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.Attribute#getId()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Id();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Attribute#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use</em>'.
	 * @see WSDL1_1.Attribute#getUse()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Use();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Attribute#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see WSDL1_1.Attribute#getDefault()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Default();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Attribute#getFixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed</em>'.
	 * @see WSDL1_1.Attribute#getFixed()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Fixed();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Attribute#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Form</em>'.
	 * @see WSDL1_1.Attribute#getForm()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Form();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Attribute#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL1_1.Attribute#getAnnotation()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Attribute#getSimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Type</em>'.
	 * @see WSDL1_1.Attribute#getSimpleType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_SimpleType();

	/**
	 * Returns the meta object for the reference '{@link WSDL1_1.Attribute#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see WSDL1_1.Attribute#getRef()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Ref();

	/**
	 * Returns the meta object for the reference '{@link WSDL1_1.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see WSDL1_1.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Type();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.AttributeGroup <em>Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Group</em>'.
	 * @see WSDL1_1.AttributeGroup
	 * @generated
	 */
	EClass getAttributeGroup();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.AttributeGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL1_1.AttributeGroup#getName()
	 * @see #getAttributeGroup()
	 * @generated
	 */
	EAttribute getAttributeGroup_Name();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.AttributeGroup#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.AttributeGroup#getId()
	 * @see #getAttributeGroup()
	 * @generated
	 */
	EAttribute getAttributeGroup_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.AttributeGroup#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL1_1.AttributeGroup#getAnnotation()
	 * @see #getAttributeGroup()
	 * @generated
	 */
	EReference getAttributeGroup_Annotation();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.AttributeGroup#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see WSDL1_1.AttributeGroup#getAttribute()
	 * @see #getAttributeGroup()
	 * @generated
	 */
	EReference getAttributeGroup_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.AttributeGroup#getAttributeGroup <em>Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Group</em>'.
	 * @see WSDL1_1.AttributeGroup#getAttributeGroup()
	 * @see #getAttributeGroup()
	 * @generated
	 */
	EReference getAttributeGroup_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.AttributeGroup#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Any Attribute</em>'.
	 * @see WSDL1_1.AttributeGroup#getAnyAttribute()
	 * @see #getAttributeGroup()
	 * @generated
	 */
	EReference getAttributeGroup_AnyAttribute();

	/**
	 * Returns the meta object for the reference '{@link WSDL1_1.AttributeGroup#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see WSDL1_1.AttributeGroup#getRef()
	 * @see #getAttributeGroup()
	 * @generated
	 */
	EReference getAttributeGroup_Ref();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see WSDL1_1.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Group#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL1_1.Group#getName()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Name();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Group#getMinOccurs <em>Min Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Occurs</em>'.
	 * @see WSDL1_1.Group#getMinOccurs()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_MinOccurs();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Group#getMaxOccurs <em>Max Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Occurs</em>'.
	 * @see WSDL1_1.Group#getMaxOccurs()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_MaxOccurs();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Group#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.Group#getId()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Group#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL1_1.Group#getAnnotation()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Group#getAll <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All</em>'.
	 * @see WSDL1_1.Group#getAll()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_All();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Group#getChoice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Choice</em>'.
	 * @see WSDL1_1.Group#getChoice()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Choice();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Group#getSequenceDef <em>Sequence Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Def</em>'.
	 * @see WSDL1_1.Group#getSequenceDef()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_SequenceDef();

	/**
	 * Returns the meta object for the reference '{@link WSDL1_1.Group#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see WSDL1_1.Group#getRef()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Ref();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.Notation <em>Notation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notation</em>'.
	 * @see WSDL1_1.Notation
	 * @generated
	 */
	EClass getNotation();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Notation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL1_1.Notation#getName()
	 * @see #getNotation()
	 * @generated
	 */
	EAttribute getNotation_Name();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Notation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.Notation#getId()
	 * @see #getNotation()
	 * @generated
	 */
	EAttribute getNotation_Id();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Notation#getPublic <em>Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public</em>'.
	 * @see WSDL1_1.Notation#getPublic()
	 * @see #getNotation()
	 * @generated
	 */
	EAttribute getNotation_Public();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Notation#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System</em>'.
	 * @see WSDL1_1.Notation#getSystem()
	 * @see #getNotation()
	 * @generated
	 */
	EAttribute getNotation_System();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Notation#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL1_1.Notation#getAnnotation()
	 * @see #getNotation()
	 * @generated
	 */
	EReference getNotation_Annotation();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.SimpleContent <em>Simple Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Content</em>'.
	 * @see WSDL1_1.SimpleContent
	 * @generated
	 */
	EClass getSimpleContent();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.SimpleContent#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.SimpleContent#getId()
	 * @see #getSimpleContent()
	 * @generated
	 */
	EAttribute getSimpleContent_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.SimpleContent#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL1_1.SimpleContent#getAnnotation()
	 * @see #getSimpleContent()
	 * @generated
	 */
	EReference getSimpleContent_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.SimpleContent#getRestriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Restriction</em>'.
	 * @see WSDL1_1.SimpleContent#getRestriction()
	 * @see #getSimpleContent()
	 * @generated
	 */
	EReference getSimpleContent_Restriction();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.SimpleContent#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension</em>'.
	 * @see WSDL1_1.SimpleContent#getExtension()
	 * @see #getSimpleContent()
	 * @generated
	 */
	EReference getSimpleContent_Extension();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.ComplexContent <em>Complex Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Content</em>'.
	 * @see WSDL1_1.ComplexContent
	 * @generated
	 */
	EClass getComplexContent();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.ComplexContent#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mixed</em>'.
	 * @see WSDL1_1.ComplexContent#getMixed()
	 * @see #getComplexContent()
	 * @generated
	 */
	EAttribute getComplexContent_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.ComplexContent#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.ComplexContent#getId()
	 * @see #getComplexContent()
	 * @generated
	 */
	EAttribute getComplexContent_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.ComplexContent#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL1_1.ComplexContent#getAnnotation()
	 * @see #getComplexContent()
	 * @generated
	 */
	EReference getComplexContent_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.ComplexContent#getRestriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Restriction</em>'.
	 * @see WSDL1_1.ComplexContent#getRestriction()
	 * @see #getComplexContent()
	 * @generated
	 */
	EReference getComplexContent_Restriction();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.ComplexContent#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension</em>'.
	 * @see WSDL1_1.ComplexContent#getExtension()
	 * @see #getComplexContent()
	 * @generated
	 */
	EReference getComplexContent_Extension();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.Unique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unique</em>'.
	 * @see WSDL1_1.Unique
	 * @generated
	 */
	EClass getUnique();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Unique#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL1_1.Unique#getName()
	 * @see #getUnique()
	 * @generated
	 */
	EAttribute getUnique_Name();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Unique#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.Unique#getId()
	 * @see #getUnique()
	 * @generated
	 */
	EAttribute getUnique_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Unique#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL1_1.Unique#getAnnotation()
	 * @see #getUnique()
	 * @generated
	 */
	EReference getUnique_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Unique#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selector</em>'.
	 * @see WSDL1_1.Unique#getSelector()
	 * @see #getUnique()
	 * @generated
	 */
	EReference getUnique_Selector();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Unique#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field</em>'.
	 * @see WSDL1_1.Unique#getField()
	 * @see #getUnique()
	 * @generated
	 */
	EReference getUnique_Field();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.Key <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key</em>'.
	 * @see WSDL1_1.Key
	 * @generated
	 */
	EClass getKey();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Key#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL1_1.Key#getName()
	 * @see #getKey()
	 * @generated
	 */
	EAttribute getKey_Name();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Key#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.Key#getId()
	 * @see #getKey()
	 * @generated
	 */
	EAttribute getKey_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Key#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL1_1.Key#getAnnotation()
	 * @see #getKey()
	 * @generated
	 */
	EReference getKey_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Key#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selector</em>'.
	 * @see WSDL1_1.Key#getSelector()
	 * @see #getKey()
	 * @generated
	 */
	EReference getKey_Selector();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Key#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field</em>'.
	 * @see WSDL1_1.Key#getField()
	 * @see #getKey()
	 * @generated
	 */
	EReference getKey_Field();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.KeyRef <em>Key Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Ref</em>'.
	 * @see WSDL1_1.KeyRef
	 * @generated
	 */
	EClass getKeyRef();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.KeyRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL1_1.KeyRef#getName()
	 * @see #getKeyRef()
	 * @generated
	 */
	EAttribute getKeyRef_Name();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.KeyRef#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.KeyRef#getId()
	 * @see #getKeyRef()
	 * @generated
	 */
	EAttribute getKeyRef_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.KeyRef#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL1_1.KeyRef#getAnnotation()
	 * @see #getKeyRef()
	 * @generated
	 */
	EReference getKeyRef_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.KeyRef#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selector</em>'.
	 * @see WSDL1_1.KeyRef#getSelector()
	 * @see #getKeyRef()
	 * @generated
	 */
	EReference getKeyRef_Selector();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.KeyRef#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field</em>'.
	 * @see WSDL1_1.KeyRef#getField()
	 * @see #getKeyRef()
	 * @generated
	 */
	EReference getKeyRef_Field();

	/**
	 * Returns the meta object for the reference '{@link WSDL1_1.KeyRef#getRefer <em>Refer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refer</em>'.
	 * @see WSDL1_1.KeyRef#getRefer()
	 * @see #getKeyRef()
	 * @generated
	 */
	EReference getKeyRef_Refer();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.AnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Attribute</em>'.
	 * @see WSDL1_1.AnyAttribute
	 * @generated
	 */
	EClass getAnyAttribute();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.AnyAttribute#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see WSDL1_1.AnyAttribute#getNamespace()
	 * @see #getAnyAttribute()
	 * @generated
	 */
	EAttribute getAnyAttribute_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.AnyAttribute#getProcessContents <em>Process Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process Contents</em>'.
	 * @see WSDL1_1.AnyAttribute#getProcessContents()
	 * @see #getAnyAttribute()
	 * @generated
	 */
	EAttribute getAnyAttribute_ProcessContents();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.AnyAttribute#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.AnyAttribute#getId()
	 * @see #getAnyAttribute()
	 * @generated
	 */
	EAttribute getAnyAttribute_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.AnyAttribute#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL1_1.AnyAttribute#getAnnotation()
	 * @see #getAnyAttribute()
	 * @generated
	 */
	EReference getAnyAttribute_Annotation();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see WSDL1_1.Extension
	 * @generated
	 */
	EClass getExtension();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Extension#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.Extension#getId()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Extension#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL1_1.Extension#getAnnotation()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Extension#getAll <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All</em>'.
	 * @see WSDL1_1.Extension#getAll()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_All();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Extension#getChoice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Choice</em>'.
	 * @see WSDL1_1.Extension#getChoice()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Choice();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Extension#getSequenceDef <em>Sequence Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Def</em>'.
	 * @see WSDL1_1.Extension#getSequenceDef()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_SequenceDef();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Extension#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group</em>'.
	 * @see WSDL1_1.Extension#getGroup()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Extension#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see WSDL1_1.Extension#getAttribute()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Extension#getAttributeGroup <em>Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Group</em>'.
	 * @see WSDL1_1.Extension#getAttributeGroup()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Extension#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Any Attribute</em>'.
	 * @see WSDL1_1.Extension#getAnyAttribute()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_AnyAttribute();

	/**
	 * Returns the meta object for the reference '{@link WSDL1_1.Extension#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base</em>'.
	 * @see WSDL1_1.Extension#getBase()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Base();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.Selector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selector</em>'.
	 * @see WSDL1_1.Selector
	 * @generated
	 */
	EClass getSelector();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Selector#getXpath <em>Xpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xpath</em>'.
	 * @see WSDL1_1.Selector#getXpath()
	 * @see #getSelector()
	 * @generated
	 */
	EAttribute getSelector_Xpath();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Selector#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.Selector#getId()
	 * @see #getSelector()
	 * @generated
	 */
	EAttribute getSelector_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Selector#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL1_1.Selector#getAnnotation()
	 * @see #getSelector()
	 * @generated
	 */
	EReference getSelector_Annotation();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see WSDL1_1.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Field#getXpath <em>Xpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xpath</em>'.
	 * @see WSDL1_1.Field#getXpath()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Xpath();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Field#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.Field#getId()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Field#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL1_1.Field#getAnnotation()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Annotation();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.AppInfo <em>App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Info</em>'.
	 * @see WSDL1_1.AppInfo
	 * @generated
	 */
	EClass getAppInfo();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.AppInfo#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see WSDL1_1.AppInfo#getSource()
	 * @see #getAppInfo()
	 * @generated
	 */
	EAttribute getAppInfo_Source();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.AppInfo#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.AppInfo#getId()
	 * @see #getAppInfo()
	 * @generated
	 */
	EAttribute getAppInfo_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.AppInfo#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Any</em>'.
	 * @see WSDL1_1.AppInfo#getAny()
	 * @see #getAppInfo()
	 * @generated
	 */
	EReference getAppInfo_Any();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.DocumentationXMLSchema <em>Documentation XML Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation XML Schema</em>'.
	 * @see WSDL1_1.DocumentationXMLSchema
	 * @generated
	 */
	EClass getDocumentationXMLSchema();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.DocumentationXMLSchema#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see WSDL1_1.DocumentationXMLSchema#getSource()
	 * @see #getDocumentationXMLSchema()
	 * @generated
	 */
	EAttribute getDocumentationXMLSchema_Source();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.DocumentationXMLSchema#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.DocumentationXMLSchema#getId()
	 * @see #getDocumentationXMLSchema()
	 * @generated
	 */
	EAttribute getDocumentationXMLSchema_Id();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.DocumentationXMLSchema#getXml_lang <em>Xml lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xml lang</em>'.
	 * @see WSDL1_1.DocumentationXMLSchema#getXml_lang()
	 * @see #getDocumentationXMLSchema()
	 * @generated
	 */
	EAttribute getDocumentationXMLSchema_Xml_lang();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.DocumentationXMLSchema#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Any</em>'.
	 * @see WSDL1_1.DocumentationXMLSchema#getAny()
	 * @see #getDocumentationXMLSchema()
	 * @generated
	 */
	EReference getDocumentationXMLSchema_Any();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.DocumentationXMLSchema#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text</em>'.
	 * @see WSDL1_1.DocumentationXMLSchema#getText()
	 * @see #getDocumentationXMLSchema()
	 * @generated
	 */
	EReference getDocumentationXMLSchema_Text();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.Any <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any</em>'.
	 * @see WSDL1_1.Any
	 * @generated
	 */
	EClass getAny();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Any#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see WSDL1_1.Any#getNamespace()
	 * @see #getAny()
	 * @generated
	 */
	EAttribute getAny_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Any#getProcessContents <em>Process Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process Contents</em>'.
	 * @see WSDL1_1.Any#getProcessContents()
	 * @see #getAny()
	 * @generated
	 */
	EAttribute getAny_ProcessContents();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Any#getMinOccurs <em>Min Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Occurs</em>'.
	 * @see WSDL1_1.Any#getMinOccurs()
	 * @see #getAny()
	 * @generated
	 */
	EAttribute getAny_MinOccurs();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Any#getMaxOccurs <em>Max Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Occurs</em>'.
	 * @see WSDL1_1.Any#getMaxOccurs()
	 * @see #getAny()
	 * @generated
	 */
	EAttribute getAny_MaxOccurs();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Any#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.Any#getId()
	 * @see #getAny()
	 * @generated
	 */
	EAttribute getAny_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Any#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL1_1.Any#getAnnotation()
	 * @see #getAny()
	 * @generated
	 */
	EReference getAny_Annotation();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.All <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All</em>'.
	 * @see WSDL1_1.All
	 * @generated
	 */
	EClass getAll();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.All#getMinOccurs <em>Min Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Occurs</em>'.
	 * @see WSDL1_1.All#getMinOccurs()
	 * @see #getAll()
	 * @generated
	 */
	EAttribute getAll_MinOccurs();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.All#getMaxOccurs <em>Max Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Occurs</em>'.
	 * @see WSDL1_1.All#getMaxOccurs()
	 * @see #getAll()
	 * @generated
	 */
	EAttribute getAll_MaxOccurs();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.All#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.All#getId()
	 * @see #getAll()
	 * @generated
	 */
	EAttribute getAll_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.All#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL1_1.All#getAnnotation()
	 * @see #getAll()
	 * @generated
	 */
	EReference getAll_Annotation();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.All#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see WSDL1_1.All#getElement()
	 * @see #getAll()
	 * @generated
	 */
	EReference getAll_Element();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see WSDL1_1.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Choice#getMinOccurs <em>Min Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Occurs</em>'.
	 * @see WSDL1_1.Choice#getMinOccurs()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_MinOccurs();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Choice#getMaxOccurs <em>Max Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Occurs</em>'.
	 * @see WSDL1_1.Choice#getMaxOccurs()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_MaxOccurs();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Choice#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.Choice#getId()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Choice#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL1_1.Choice#getAnnotation()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_Annotation();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Choice#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see WSDL1_1.Choice#getElement()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_Element();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Choice#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group</em>'.
	 * @see WSDL1_1.Choice#getGroup()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Choice#getChoice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Choice</em>'.
	 * @see WSDL1_1.Choice#getChoice()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_Choice();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Choice#getSequenceDef <em>Sequence Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence Def</em>'.
	 * @see WSDL1_1.Choice#getSequenceDef()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_SequenceDef();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Choice#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any</em>'.
	 * @see WSDL1_1.Choice#getAny()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_Any();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.SequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Type</em>'.
	 * @see WSDL1_1.SequenceType
	 * @generated
	 */
	EClass getSequenceType();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.SequenceType#getMinOccurs <em>Min Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Occurs</em>'.
	 * @see WSDL1_1.SequenceType#getMinOccurs()
	 * @see #getSequenceType()
	 * @generated
	 */
	EAttribute getSequenceType_MinOccurs();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.SequenceType#getMaxOccurs <em>Max Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Occurs</em>'.
	 * @see WSDL1_1.SequenceType#getMaxOccurs()
	 * @see #getSequenceType()
	 * @generated
	 */
	EAttribute getSequenceType_MaxOccurs();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.SequenceType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.SequenceType#getId()
	 * @see #getSequenceType()
	 * @generated
	 */
	EAttribute getSequenceType_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.SequenceType#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL1_1.SequenceType#getAnnotation()
	 * @see #getSequenceType()
	 * @generated
	 */
	EReference getSequenceType_Annotation();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.SequenceType#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see WSDL1_1.SequenceType#getElement()
	 * @see #getSequenceType()
	 * @generated
	 */
	EReference getSequenceType_Element();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.SequenceType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group</em>'.
	 * @see WSDL1_1.SequenceType#getGroup()
	 * @see #getSequenceType()
	 * @generated
	 */
	EReference getSequenceType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.SequenceType#getChoice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Choice</em>'.
	 * @see WSDL1_1.SequenceType#getChoice()
	 * @see #getSequenceType()
	 * @generated
	 */
	EReference getSequenceType_Choice();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.SequenceType#getSequenceDef <em>Sequence Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence Def</em>'.
	 * @see WSDL1_1.SequenceType#getSequenceDef()
	 * @see #getSequenceType()
	 * @generated
	 */
	EReference getSequenceType_SequenceDef();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.SequenceType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any</em>'.
	 * @see WSDL1_1.SequenceType#getAny()
	 * @see #getSequenceType()
	 * @generated
	 */
	EReference getSequenceType_Any();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.SimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Type</em>'.
	 * @see WSDL1_1.SimpleType
	 * @generated
	 */
	EClass getSimpleType();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.SimpleType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL1_1.SimpleType#getName()
	 * @see #getSimpleType()
	 * @generated
	 */
	EAttribute getSimpleType_Name();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.SimpleType#getFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see WSDL1_1.SimpleType#getFinal()
	 * @see #getSimpleType()
	 * @generated
	 */
	EAttribute getSimpleType_Final();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.SimpleType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.SimpleType#getId()
	 * @see #getSimpleType()
	 * @generated
	 */
	EAttribute getSimpleType_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.SimpleType#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL1_1.SimpleType#getAnnotation()
	 * @see #getSimpleType()
	 * @generated
	 */
	EReference getSimpleType_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.SimpleType#getRestriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Restriction</em>'.
	 * @see WSDL1_1.SimpleType#getRestriction()
	 * @see #getSimpleType()
	 * @generated
	 */
	EReference getSimpleType_Restriction();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.SimpleType#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List</em>'.
	 * @see WSDL1_1.SimpleType#getList()
	 * @see #getSimpleType()
	 * @generated
	 */
	EReference getSimpleType_List();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.SimpleType#getUnion <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Union</em>'.
	 * @see WSDL1_1.SimpleType#getUnion()
	 * @see #getSimpleType()
	 * @generated
	 */
	EReference getSimpleType_Union();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see WSDL1_1.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.List#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.List#getId()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.List#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL1_1.List#getAnnotation()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.List#getSimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Type</em>'.
	 * @see WSDL1_1.List#getSimpleType()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_SimpleType();

	/**
	 * Returns the meta object for the reference '{@link WSDL1_1.List#getItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item Type</em>'.
	 * @see WSDL1_1.List#getItemType()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_ItemType();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.Union <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union</em>'.
	 * @see WSDL1_1.Union
	 * @generated
	 */
	EClass getUnion();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Union#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.Union#getId()
	 * @see #getUnion()
	 * @generated
	 */
	EAttribute getUnion_Id();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Union#getMemberTypes <em>Member Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member Types</em>'.
	 * @see WSDL1_1.Union#getMemberTypes()
	 * @see #getUnion()
	 * @generated
	 */
	EAttribute getUnion_MemberTypes();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Union#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL1_1.Union#getAnnotation()
	 * @see #getUnion()
	 * @generated
	 */
	EReference getUnion_Annotation();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Union#getSimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple Type</em>'.
	 * @see WSDL1_1.Union#getSimpleType()
	 * @see #getUnion()
	 * @generated
	 */
	EReference getUnion_SimpleType();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.Restriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restriction</em>'.
	 * @see WSDL1_1.Restriction
	 * @generated
	 */
	EClass getRestriction();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Restriction#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.Restriction#getId()
	 * @see #getRestriction()
	 * @generated
	 */
	EAttribute getRestriction_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Restriction#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL1_1.Restriction#getAnnotation()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Restriction#getAll <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All</em>'.
	 * @see WSDL1_1.Restriction#getAll()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_All();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Restriction#getChoice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Choice</em>'.
	 * @see WSDL1_1.Restriction#getChoice()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_Choice();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Restriction#getSequenceDef <em>Sequence Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Def</em>'.
	 * @see WSDL1_1.Restriction#getSequenceDef()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_SequenceDef();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Restriction#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group</em>'.
	 * @see WSDL1_1.Restriction#getGroup()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_Group();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Restriction#getSimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Type</em>'.
	 * @see WSDL1_1.Restriction#getSimpleType()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_SimpleType();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Restriction#getMinExclusive <em>Min Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Exclusive</em>'.
	 * @see WSDL1_1.Restriction#getMinExclusive()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_MinExclusive();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Restriction#getMinInclusive <em>Min Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Inclusive</em>'.
	 * @see WSDL1_1.Restriction#getMinInclusive()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_MinInclusive();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Restriction#getMaxExclusive <em>Max Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Exclusive</em>'.
	 * @see WSDL1_1.Restriction#getMaxExclusive()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_MaxExclusive();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Restriction#getMaxInclusive <em>Max Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Inclusive</em>'.
	 * @see WSDL1_1.Restriction#getMaxInclusive()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_MaxInclusive();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Restriction#getTotalDigits <em>Total Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Total Digits</em>'.
	 * @see WSDL1_1.Restriction#getTotalDigits()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_TotalDigits();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Restriction#getFractionDigits <em>Fraction Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fraction Digits</em>'.
	 * @see WSDL1_1.Restriction#getFractionDigits()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_FractionDigits();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Restriction#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see WSDL1_1.Restriction#getPattern()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_Pattern();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Restriction#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enumeration</em>'.
	 * @see WSDL1_1.Restriction#getEnumeration()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_Enumeration();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Restriction#getWhiteSpace <em>White Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>White Space</em>'.
	 * @see WSDL1_1.Restriction#getWhiteSpace()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_WhiteSpace();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Restriction#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Length</em>'.
	 * @see WSDL1_1.Restriction#getLength()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_Length();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Restriction#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Length</em>'.
	 * @see WSDL1_1.Restriction#getMaxLength()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_MaxLength();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Restriction#getMinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Length</em>'.
	 * @see WSDL1_1.Restriction#getMinLength()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_MinLength();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Restriction#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see WSDL1_1.Restriction#getAttribute()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Restriction#getAttributeGroup <em>Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Group</em>'.
	 * @see WSDL1_1.Restriction#getAttributeGroup()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Restriction#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Any Attribute</em>'.
	 * @see WSDL1_1.Restriction#getAnyAttribute()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_AnyAttribute();

	/**
	 * Returns the meta object for the reference '{@link WSDL1_1.Restriction#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base</em>'.
	 * @see WSDL1_1.Restriction#getBase()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_Base();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.MinInclusive <em>Min Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min Inclusive</em>'.
	 * @see WSDL1_1.MinInclusive
	 * @generated
	 */
	EClass getMinInclusive();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.MinInclusive#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see WSDL1_1.MinInclusive#getValue()
	 * @see #getMinInclusive()
	 * @generated
	 */
	EAttribute getMinInclusive_Value();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.MinInclusive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.MinInclusive#getId()
	 * @see #getMinInclusive()
	 * @generated
	 */
	EAttribute getMinInclusive_Id();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.MinInclusive#getFixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed</em>'.
	 * @see WSDL1_1.MinInclusive#getFixed()
	 * @see #getMinInclusive()
	 * @generated
	 */
	EAttribute getMinInclusive_Fixed();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.MinInclusive#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL1_1.MinInclusive#getAnnotation()
	 * @see #getMinInclusive()
	 * @generated
	 */
	EReference getMinInclusive_Annotation();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.MinExclusive <em>Min Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min Exclusive</em>'.
	 * @see WSDL1_1.MinExclusive
	 * @generated
	 */
	EClass getMinExclusive();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.MinExclusive#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see WSDL1_1.MinExclusive#getValue()
	 * @see #getMinExclusive()
	 * @generated
	 */
	EAttribute getMinExclusive_Value();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.MinExclusive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.MinExclusive#getId()
	 * @see #getMinExclusive()
	 * @generated
	 */
	EAttribute getMinExclusive_Id();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.MinExclusive#getFixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed</em>'.
	 * @see WSDL1_1.MinExclusive#getFixed()
	 * @see #getMinExclusive()
	 * @generated
	 */
	EAttribute getMinExclusive_Fixed();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.MinExclusive#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL1_1.MinExclusive#getAnnotation()
	 * @see #getMinExclusive()
	 * @generated
	 */
	EReference getMinExclusive_Annotation();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.MaxInclusive <em>Max Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Inclusive</em>'.
	 * @see WSDL1_1.MaxInclusive
	 * @generated
	 */
	EClass getMaxInclusive();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.MaxInclusive#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see WSDL1_1.MaxInclusive#getValue()
	 * @see #getMaxInclusive()
	 * @generated
	 */
	EAttribute getMaxInclusive_Value();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.MaxInclusive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.MaxInclusive#getId()
	 * @see #getMaxInclusive()
	 * @generated
	 */
	EAttribute getMaxInclusive_Id();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.MaxInclusive#getFixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed</em>'.
	 * @see WSDL1_1.MaxInclusive#getFixed()
	 * @see #getMaxInclusive()
	 * @generated
	 */
	EAttribute getMaxInclusive_Fixed();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.MaxInclusive#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL1_1.MaxInclusive#getAnnotation()
	 * @see #getMaxInclusive()
	 * @generated
	 */
	EReference getMaxInclusive_Annotation();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.MaxExclusive <em>Max Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Exclusive</em>'.
	 * @see WSDL1_1.MaxExclusive
	 * @generated
	 */
	EClass getMaxExclusive();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.MaxExclusive#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see WSDL1_1.MaxExclusive#getValue()
	 * @see #getMaxExclusive()
	 * @generated
	 */
	EAttribute getMaxExclusive_Value();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.MaxExclusive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.MaxExclusive#getId()
	 * @see #getMaxExclusive()
	 * @generated
	 */
	EAttribute getMaxExclusive_Id();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.MaxExclusive#getFixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed</em>'.
	 * @see WSDL1_1.MaxExclusive#getFixed()
	 * @see #getMaxExclusive()
	 * @generated
	 */
	EAttribute getMaxExclusive_Fixed();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.MaxExclusive#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL1_1.MaxExclusive#getAnnotation()
	 * @see #getMaxExclusive()
	 * @generated
	 */
	EReference getMaxExclusive_Annotation();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.TotalDigits <em>Total Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Total Digits</em>'.
	 * @see WSDL1_1.TotalDigits
	 * @generated
	 */
	EClass getTotalDigits();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.TotalDigits#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see WSDL1_1.TotalDigits#getValue()
	 * @see #getTotalDigits()
	 * @generated
	 */
	EAttribute getTotalDigits_Value();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.TotalDigits#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.TotalDigits#getId()
	 * @see #getTotalDigits()
	 * @generated
	 */
	EAttribute getTotalDigits_Id();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.TotalDigits#getFixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed</em>'.
	 * @see WSDL1_1.TotalDigits#getFixed()
	 * @see #getTotalDigits()
	 * @generated
	 */
	EAttribute getTotalDigits_Fixed();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.TotalDigits#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL1_1.TotalDigits#getAnnotation()
	 * @see #getTotalDigits()
	 * @generated
	 */
	EReference getTotalDigits_Annotation();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.FractionDigits <em>Fraction Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fraction Digits</em>'.
	 * @see WSDL1_1.FractionDigits
	 * @generated
	 */
	EClass getFractionDigits();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.FractionDigits#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see WSDL1_1.FractionDigits#getValue()
	 * @see #getFractionDigits()
	 * @generated
	 */
	EAttribute getFractionDigits_Value();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.FractionDigits#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.FractionDigits#getId()
	 * @see #getFractionDigits()
	 * @generated
	 */
	EAttribute getFractionDigits_Id();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.FractionDigits#getFixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed</em>'.
	 * @see WSDL1_1.FractionDigits#getFixed()
	 * @see #getFractionDigits()
	 * @generated
	 */
	EAttribute getFractionDigits_Fixed();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.FractionDigits#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL1_1.FractionDigits#getAnnotation()
	 * @see #getFractionDigits()
	 * @generated
	 */
	EReference getFractionDigits_Annotation();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern</em>'.
	 * @see WSDL1_1.Pattern
	 * @generated
	 */
	EClass getPattern();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Pattern#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see WSDL1_1.Pattern#getValue()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_Value();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Pattern#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.Pattern#getId()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Pattern#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL1_1.Pattern#getAnnotation()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_Annotation();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see WSDL1_1.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Enumeration#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see WSDL1_1.Enumeration#getValue()
	 * @see #getEnumeration()
	 * @generated
	 */
	EAttribute getEnumeration_Value();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Enumeration#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.Enumeration#getId()
	 * @see #getEnumeration()
	 * @generated
	 */
	EAttribute getEnumeration_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Enumeration#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL1_1.Enumeration#getAnnotation()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_Annotation();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.WhiteSpace <em>White Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>White Space</em>'.
	 * @see WSDL1_1.WhiteSpace
	 * @generated
	 */
	EClass getWhiteSpace();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.WhiteSpace#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see WSDL1_1.WhiteSpace#getValue()
	 * @see #getWhiteSpace()
	 * @generated
	 */
	EAttribute getWhiteSpace_Value();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.WhiteSpace#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.WhiteSpace#getId()
	 * @see #getWhiteSpace()
	 * @generated
	 */
	EAttribute getWhiteSpace_Id();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.WhiteSpace#getFixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed</em>'.
	 * @see WSDL1_1.WhiteSpace#getFixed()
	 * @see #getWhiteSpace()
	 * @generated
	 */
	EAttribute getWhiteSpace_Fixed();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.WhiteSpace#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL1_1.WhiteSpace#getAnnotation()
	 * @see #getWhiteSpace()
	 * @generated
	 */
	EReference getWhiteSpace_Annotation();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.Length <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length</em>'.
	 * @see WSDL1_1.Length
	 * @generated
	 */
	EClass getLength();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Length#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see WSDL1_1.Length#getValue()
	 * @see #getLength()
	 * @generated
	 */
	EAttribute getLength_Value();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Length#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.Length#getId()
	 * @see #getLength()
	 * @generated
	 */
	EAttribute getLength_Id();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Length#getFixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed</em>'.
	 * @see WSDL1_1.Length#getFixed()
	 * @see #getLength()
	 * @generated
	 */
	EAttribute getLength_Fixed();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Length#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL1_1.Length#getAnnotation()
	 * @see #getLength()
	 * @generated
	 */
	EReference getLength_Annotation();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.MaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Length</em>'.
	 * @see WSDL1_1.MaxLength
	 * @generated
	 */
	EClass getMaxLength();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.MaxLength#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see WSDL1_1.MaxLength#getValue()
	 * @see #getMaxLength()
	 * @generated
	 */
	EAttribute getMaxLength_Value();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.MaxLength#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.MaxLength#getId()
	 * @see #getMaxLength()
	 * @generated
	 */
	EAttribute getMaxLength_Id();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.MaxLength#getFixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed</em>'.
	 * @see WSDL1_1.MaxLength#getFixed()
	 * @see #getMaxLength()
	 * @generated
	 */
	EAttribute getMaxLength_Fixed();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.MaxLength#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL1_1.MaxLength#getAnnotation()
	 * @see #getMaxLength()
	 * @generated
	 */
	EReference getMaxLength_Annotation();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.MinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min Length</em>'.
	 * @see WSDL1_1.MinLength
	 * @generated
	 */
	EClass getMinLength();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.MinLength#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see WSDL1_1.MinLength#getValue()
	 * @see #getMinLength()
	 * @generated
	 */
	EAttribute getMinLength_Value();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.MinLength#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL1_1.MinLength#getId()
	 * @see #getMinLength()
	 * @generated
	 */
	EAttribute getMinLength_Id();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.MinLength#getFixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed</em>'.
	 * @see WSDL1_1.MinLength#getFixed()
	 * @see #getMinLength()
	 * @generated
	 */
	EAttribute getMinLength_Fixed();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.MinLength#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL1_1.MinLength#getAnnotation()
	 * @see #getMinLength()
	 * @generated
	 */
	EReference getMinLength_Annotation();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see WSDL1_1.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Object#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see WSDL1_1.Object#getDocumentation()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Documentation();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.BindingSOAP <em>Binding SOAP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding SOAP</em>'.
	 * @see WSDL1_1.BindingSOAP
	 * @generated
	 */
	EClass getBindingSOAP();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.BindingSOAP#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see WSDL1_1.BindingSOAP#getStyle()
	 * @see #getBindingSOAP()
	 * @generated
	 */
	EAttribute getBindingSOAP_Style();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.BindingSOAP#getTransport <em>Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transport</em>'.
	 * @see WSDL1_1.BindingSOAP#getTransport()
	 * @see #getBindingSOAP()
	 * @generated
	 */
	EAttribute getBindingSOAP_Transport();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.OperationSOAP <em>Operation SOAP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation SOAP</em>'.
	 * @see WSDL1_1.OperationSOAP
	 * @generated
	 */
	EClass getOperationSOAP();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.OperationSOAP#getSoapAction <em>Soap Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Soap Action</em>'.
	 * @see WSDL1_1.OperationSOAP#getSoapAction()
	 * @see #getOperationSOAP()
	 * @generated
	 */
	EAttribute getOperationSOAP_SoapAction();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.OperationSOAP#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see WSDL1_1.OperationSOAP#getStyle()
	 * @see #getOperationSOAP()
	 * @generated
	 */
	EAttribute getOperationSOAP_Style();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.BodySOAP <em>Body SOAP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body SOAP</em>'.
	 * @see WSDL1_1.BodySOAP
	 * @generated
	 */
	EClass getBodySOAP();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.BodySOAP#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parts</em>'.
	 * @see WSDL1_1.BodySOAP#getParts()
	 * @see #getBodySOAP()
	 * @generated
	 */
	EAttribute getBodySOAP_Parts();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.BodySOAP#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use</em>'.
	 * @see WSDL1_1.BodySOAP#getUse()
	 * @see #getBodySOAP()
	 * @generated
	 */
	EAttribute getBodySOAP_Use();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.BodySOAP#getEncodingStyle <em>Encoding Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding Style</em>'.
	 * @see WSDL1_1.BodySOAP#getEncodingStyle()
	 * @see #getBodySOAP()
	 * @generated
	 */
	EAttribute getBodySOAP_EncodingStyle();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.BodySOAP#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see WSDL1_1.BodySOAP#getNamespace()
	 * @see #getBodySOAP()
	 * @generated
	 */
	EAttribute getBodySOAP_Namespace();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.HeaderSOAP <em>Header SOAP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header SOAP</em>'.
	 * @see WSDL1_1.HeaderSOAP
	 * @generated
	 */
	EClass getHeaderSOAP();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.HeaderSOAP#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part</em>'.
	 * @see WSDL1_1.HeaderSOAP#getPart()
	 * @see #getHeaderSOAP()
	 * @generated
	 */
	EAttribute getHeaderSOAP_Part();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.HeaderSOAP#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use</em>'.
	 * @see WSDL1_1.HeaderSOAP#getUse()
	 * @see #getHeaderSOAP()
	 * @generated
	 */
	EAttribute getHeaderSOAP_Use();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.HeaderSOAP#getEncodingStyle <em>Encoding Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding Style</em>'.
	 * @see WSDL1_1.HeaderSOAP#getEncodingStyle()
	 * @see #getHeaderSOAP()
	 * @generated
	 */
	EAttribute getHeaderSOAP_EncodingStyle();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.HeaderSOAP#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see WSDL1_1.HeaderSOAP#getNamespace()
	 * @see #getHeaderSOAP()
	 * @generated
	 */
	EAttribute getHeaderSOAP_Namespace();

	/**
	 * Returns the meta object for the reference '{@link WSDL1_1.HeaderSOAP#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message</em>'.
	 * @see WSDL1_1.HeaderSOAP#getMessage()
	 * @see #getHeaderSOAP()
	 * @generated
	 */
	EReference getHeaderSOAP_Message();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.HeaderSOAP#getHeaderfault <em>Headerfault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Headerfault</em>'.
	 * @see WSDL1_1.HeaderSOAP#getHeaderfault()
	 * @see #getHeaderSOAP()
	 * @generated
	 */
	EReference getHeaderSOAP_Headerfault();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.HeaderFaultSOAP <em>Header Fault SOAP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Fault SOAP</em>'.
	 * @see WSDL1_1.HeaderFaultSOAP
	 * @generated
	 */
	EClass getHeaderFaultSOAP();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.HeaderFaultSOAP#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part</em>'.
	 * @see WSDL1_1.HeaderFaultSOAP#getPart()
	 * @see #getHeaderFaultSOAP()
	 * @generated
	 */
	EAttribute getHeaderFaultSOAP_Part();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.HeaderFaultSOAP#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use</em>'.
	 * @see WSDL1_1.HeaderFaultSOAP#getUse()
	 * @see #getHeaderFaultSOAP()
	 * @generated
	 */
	EAttribute getHeaderFaultSOAP_Use();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.HeaderFaultSOAP#getEncodingStyle <em>Encoding Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding Style</em>'.
	 * @see WSDL1_1.HeaderFaultSOAP#getEncodingStyle()
	 * @see #getHeaderFaultSOAP()
	 * @generated
	 */
	EAttribute getHeaderFaultSOAP_EncodingStyle();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.HeaderFaultSOAP#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see WSDL1_1.HeaderFaultSOAP#getNamespace()
	 * @see #getHeaderFaultSOAP()
	 * @generated
	 */
	EAttribute getHeaderFaultSOAP_Namespace();

	/**
	 * Returns the meta object for the reference '{@link WSDL1_1.HeaderFaultSOAP#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message</em>'.
	 * @see WSDL1_1.HeaderFaultSOAP#getMessage()
	 * @see #getHeaderFaultSOAP()
	 * @generated
	 */
	EReference getHeaderFaultSOAP_Message();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.AddressSOAP <em>Address SOAP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address SOAP</em>'.
	 * @see WSDL1_1.AddressSOAP
	 * @generated
	 */
	EClass getAddressSOAP();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.AddressSOAP#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see WSDL1_1.AddressSOAP#getLocation()
	 * @see #getAddressSOAP()
	 * @generated
	 */
	EAttribute getAddressSOAP_Location();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.FaultSOAP <em>Fault SOAP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fault SOAP</em>'.
	 * @see WSDL1_1.FaultSOAP
	 * @generated
	 */
	EClass getFaultSOAP();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.FaultSOAP#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL1_1.FaultSOAP#getName()
	 * @see #getFaultSOAP()
	 * @generated
	 */
	EAttribute getFaultSOAP_Name();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.FaultSOAP#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use</em>'.
	 * @see WSDL1_1.FaultSOAP#getUse()
	 * @see #getFaultSOAP()
	 * @generated
	 */
	EAttribute getFaultSOAP_Use();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.FaultSOAP#getEncodingStyle <em>Encoding Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding Style</em>'.
	 * @see WSDL1_1.FaultSOAP#getEncodingStyle()
	 * @see #getFaultSOAP()
	 * @generated
	 */
	EAttribute getFaultSOAP_EncodingStyle();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.FaultSOAP#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see WSDL1_1.FaultSOAP#getNamespace()
	 * @see #getFaultSOAP()
	 * @generated
	 */
	EAttribute getFaultSOAP_Namespace();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.AddressHTTP <em>Address HTTP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address HTTP</em>'.
	 * @see WSDL1_1.AddressHTTP
	 * @generated
	 */
	EClass getAddressHTTP();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.AddressHTTP#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see WSDL1_1.AddressHTTP#getLocation()
	 * @see #getAddressHTTP()
	 * @generated
	 */
	EAttribute getAddressHTTP_Location();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.OperationHTTP <em>Operation HTTP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation HTTP</em>'.
	 * @see WSDL1_1.OperationHTTP
	 * @generated
	 */
	EClass getOperationHTTP();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.OperationHTTP#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see WSDL1_1.OperationHTTP#getLocation()
	 * @see #getOperationHTTP()
	 * @generated
	 */
	EAttribute getOperationHTTP_Location();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.URLEncoded <em>URL Encoded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>URL Encoded</em>'.
	 * @see WSDL1_1.URLEncoded
	 * @generated
	 */
	EClass getURLEncoded();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.URLReplacement <em>URL Replacement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>URL Replacement</em>'.
	 * @see WSDL1_1.URLReplacement
	 * @generated
	 */
	EClass getURLReplacement();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.BindingHTTP <em>Binding HTTP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding HTTP</em>'.
	 * @see WSDL1_1.BindingHTTP
	 * @generated
	 */
	EClass getBindingHTTP();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.BindingHTTP#getVerb <em>Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verb</em>'.
	 * @see WSDL1_1.BindingHTTP#getVerb()
	 * @see #getBindingHTTP()
	 * @generated
	 */
	EAttribute getBindingHTTP_Verb();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.MIMEMultiPartRelated <em>MIME Multi Part Related</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MIME Multi Part Related</em>'.
	 * @see WSDL1_1.MIMEMultiPartRelated
	 * @generated
	 */
	EClass getMIMEMultiPartRelated();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.MIMEMultiPartRelated#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part</em>'.
	 * @see WSDL1_1.MIMEMultiPartRelated#getPart()
	 * @see #getMIMEMultiPartRelated()
	 * @generated
	 */
	EReference getMIMEMultiPartRelated_Part();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.MIMEPart <em>MIME Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MIME Part</em>'.
	 * @see WSDL1_1.MIMEPart
	 * @generated
	 */
	EClass getMIMEPart();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.MIMEPart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see WSDL1_1.MIMEPart#getContent()
	 * @see #getMIMEPart()
	 * @generated
	 */
	EReference getMIMEPart_Content();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.MIMEPart#getMimeXml <em>Mime Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mime Xml</em>'.
	 * @see WSDL1_1.MIMEPart#getMimeXml()
	 * @see #getMIMEPart()
	 * @generated
	 */
	EReference getMIMEPart_MimeXml();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.MIMEPart#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see WSDL1_1.MIMEPart#getBody()
	 * @see #getMIMEPart()
	 * @generated
	 */
	EReference getMIMEPart_Body();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.MIMEContent <em>MIME Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MIME Content</em>'.
	 * @see WSDL1_1.MIMEContent
	 * @generated
	 */
	EClass getMIMEContent();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.MIMEContent#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part</em>'.
	 * @see WSDL1_1.MIMEContent#getPart()
	 * @see #getMIMEContent()
	 * @generated
	 */
	EAttribute getMIMEContent_Part();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.MIMEContent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see WSDL1_1.MIMEContent#getType()
	 * @see #getMIMEContent()
	 * @generated
	 */
	EAttribute getMIMEContent_Type();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.MIMEXml <em>MIME Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MIME Xml</em>'.
	 * @see WSDL1_1.MIMEXml
	 * @generated
	 */
	EClass getMIMEXml();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.MIMEXml#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part</em>'.
	 * @see WSDL1_1.MIMEXml#getPart()
	 * @see #getMIMEXml()
	 * @generated
	 */
	EAttribute getMIMEXml_Part();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.PortTypeFault <em>Port Type Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Type Fault</em>'.
	 * @see WSDL1_1.PortTypeFault
	 * @generated
	 */
	EClass getPortTypeFault();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.PortTypeFault#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL1_1.PortTypeFault#getName()
	 * @see #getPortTypeFault()
	 * @generated
	 */
	EAttribute getPortTypeFault_Name();

	/**
	 * Returns the meta object for the reference '{@link WSDL1_1.PortTypeFault#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message</em>'.
	 * @see WSDL1_1.PortTypeFault#getMessage()
	 * @see #getPortTypeFault()
	 * @generated
	 */
	EReference getPortTypeFault_Message();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.Definitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definitions</em>'.
	 * @see WSDL1_1.Definitions
	 * @generated
	 */
	EClass getDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Definitions#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binding</em>'.
	 * @see WSDL1_1.Definitions#getBinding()
	 * @see #getDefinitions()
	 * @generated
	 */
	EReference getDefinitions_Binding();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Definitions#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see WSDL1_1.Definitions#getService()
	 * @see #getDefinitions()
	 * @generated
	 */
	EReference getDefinitions_Service();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Definitions#getPortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Type</em>'.
	 * @see WSDL1_1.Definitions#getPortType()
	 * @see #getDefinitions()
	 * @generated
	 */
	EReference getDefinitions_PortType();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Definitions#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message</em>'.
	 * @see WSDL1_1.Definitions#getMessage()
	 * @see #getDefinitions()
	 * @generated
	 */
	EReference getDefinitions_Message();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Definitions#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Types</em>'.
	 * @see WSDL1_1.Definitions#getTypes()
	 * @see #getDefinitions()
	 * @generated
	 */
	EReference getDefinitions_Types();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Definitions#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL1_1.Definitions#getName()
	 * @see #getDefinitions()
	 * @generated
	 */
	EAttribute getDefinitions_Name();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Definitions#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see WSDL1_1.Definitions#getTargetNamespace()
	 * @see #getDefinitions()
	 * @generated
	 */
	EAttribute getDefinitions_TargetNamespace();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Definitions#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Namespace</em>'.
	 * @see WSDL1_1.Definitions#getNamespace()
	 * @see #getDefinitions()
	 * @generated
	 */
	EReference getDefinitions_Namespace();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Definitions#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Import</em>'.
	 * @see WSDL1_1.Definitions#getImport()
	 * @see #getDefinitions()
	 * @generated
	 */
	EReference getDefinitions_Import();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.ElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Type</em>'.
	 * @see WSDL1_1.ElementType
	 * @generated
	 */
	EClass getElementType();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.ElementType#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schema</em>'.
	 * @see WSDL1_1.ElementType#getSchema()
	 * @see #getElementType()
	 * @generated
	 */
	EReference getElementType_Schema();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see WSDL1_1.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Message#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL1_1.Message#getName()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Message#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part</em>'.
	 * @see WSDL1_1.Message#getPart()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Part();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part</em>'.
	 * @see WSDL1_1.Part
	 * @generated
	 */
	EClass getPart();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Part#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL1_1.Part#getName()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_Name();

	/**
	 * Returns the meta object for the reference '{@link WSDL1_1.Part#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see WSDL1_1.Part#getElement()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_Element();

	/**
	 * Returns the meta object for the reference '{@link WSDL1_1.Part#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see WSDL1_1.Part#getType()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_Type();

	/**
	 * Returns the meta object for the reference '{@link WSDL1_1.Part#getElementImported <em>Element Imported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Imported</em>'.
	 * @see WSDL1_1.Part#getElementImported()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_ElementImported();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.PortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Type</em>'.
	 * @see WSDL1_1.PortType
	 * @generated
	 */
	EClass getPortType();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.PortType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL1_1.PortType#getName()
	 * @see #getPortType()
	 * @generated
	 */
	EAttribute getPortType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.PortType#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see WSDL1_1.PortType#getOperation()
	 * @see #getPortType()
	 * @generated
	 */
	EReference getPortType_Operation();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.PortTypeOperation <em>Port Type Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Type Operation</em>'.
	 * @see WSDL1_1.PortTypeOperation
	 * @generated
	 */
	EClass getPortTypeOperation();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.PortTypeOperation#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see WSDL1_1.PortTypeOperation#getOutput()
	 * @see #getPortTypeOperation()
	 * @generated
	 */
	EReference getPortTypeOperation_Output();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.PortTypeOperation#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input</em>'.
	 * @see WSDL1_1.PortTypeOperation#getInput()
	 * @see #getPortTypeOperation()
	 * @generated
	 */
	EReference getPortTypeOperation_Input();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.PortTypeOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL1_1.PortTypeOperation#getName()
	 * @see #getPortTypeOperation()
	 * @generated
	 */
	EAttribute getPortTypeOperation_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.PortTypeOperation#getFault <em>Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fault</em>'.
	 * @see WSDL1_1.PortTypeOperation#getFault()
	 * @see #getPortTypeOperation()
	 * @generated
	 */
	EReference getPortTypeOperation_Fault();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.PortTypeInput <em>Port Type Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Type Input</em>'.
	 * @see WSDL1_1.PortTypeInput
	 * @generated
	 */
	EClass getPortTypeInput();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.PortTypeInput#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL1_1.PortTypeInput#getName()
	 * @see #getPortTypeInput()
	 * @generated
	 */
	EAttribute getPortTypeInput_Name();

	/**
	 * Returns the meta object for the reference '{@link WSDL1_1.PortTypeInput#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message</em>'.
	 * @see WSDL1_1.PortTypeInput#getMessage()
	 * @see #getPortTypeInput()
	 * @generated
	 */
	EReference getPortTypeInput_Message();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.PortTypeOutput <em>Port Type Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Type Output</em>'.
	 * @see WSDL1_1.PortTypeOutput
	 * @generated
	 */
	EClass getPortTypeOutput();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.PortTypeOutput#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL1_1.PortTypeOutput#getName()
	 * @see #getPortTypeOutput()
	 * @generated
	 */
	EAttribute getPortTypeOutput_Name();

	/**
	 * Returns the meta object for the reference '{@link WSDL1_1.PortTypeOutput#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message</em>'.
	 * @see WSDL1_1.PortTypeOutput#getMessage()
	 * @see #getPortTypeOutput()
	 * @generated
	 */
	EReference getPortTypeOutput_Message();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see WSDL1_1.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Binding#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL1_1.Binding#getName()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_Name();

	/**
	 * Returns the meta object for the reference '{@link WSDL1_1.Binding#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see WSDL1_1.Binding#getType()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Binding#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see WSDL1_1.Binding#getOperation()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Operation();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Binding#getSoapbinding <em>Soapbinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Soapbinding</em>'.
	 * @see WSDL1_1.Binding#getSoapbinding()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Soapbinding();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Binding#getHttpbinding <em>Httpbinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Httpbinding</em>'.
	 * @see WSDL1_1.Binding#getHttpbinding()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Httpbinding();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.BindingOperation <em>Binding Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Operation</em>'.
	 * @see WSDL1_1.BindingOperation
	 * @generated
	 */
	EClass getBindingOperation();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.BindingOperation#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see WSDL1_1.BindingOperation#getOutput()
	 * @see #getBindingOperation()
	 * @generated
	 */
	EReference getBindingOperation_Output();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.BindingOperation#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input</em>'.
	 * @see WSDL1_1.BindingOperation#getInput()
	 * @see #getBindingOperation()
	 * @generated
	 */
	EReference getBindingOperation_Input();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.BindingOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL1_1.BindingOperation#getName()
	 * @see #getBindingOperation()
	 * @generated
	 */
	EAttribute getBindingOperation_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.BindingOperation#getFault <em>Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fault</em>'.
	 * @see WSDL1_1.BindingOperation#getFault()
	 * @see #getBindingOperation()
	 * @generated
	 */
	EReference getBindingOperation_Fault();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.BindingOperation#getSoapoperation <em>Soapoperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Soapoperation</em>'.
	 * @see WSDL1_1.BindingOperation#getSoapoperation()
	 * @see #getBindingOperation()
	 * @generated
	 */
	EReference getBindingOperation_Soapoperation();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.BindingOperation#getHttpoperation <em>Httpoperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Httpoperation</em>'.
	 * @see WSDL1_1.BindingOperation#getHttpoperation()
	 * @see #getBindingOperation()
	 * @generated
	 */
	EReference getBindingOperation_Httpoperation();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.BindingInput <em>Binding Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Input</em>'.
	 * @see WSDL1_1.BindingInput
	 * @generated
	 */
	EClass getBindingInput();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.BindingInput#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see WSDL1_1.BindingInput#getBody()
	 * @see #getBindingInput()
	 * @generated
	 */
	EReference getBindingInput_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.BindingInput#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Header</em>'.
	 * @see WSDL1_1.BindingInput#getHeader()
	 * @see #getBindingInput()
	 * @generated
	 */
	EReference getBindingInput_Header();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.BindingInput#getUrlReplacement <em>Url Replacement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Url Replacement</em>'.
	 * @see WSDL1_1.BindingInput#getUrlReplacement()
	 * @see #getBindingInput()
	 * @generated
	 */
	EReference getBindingInput_UrlReplacement();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.BindingInput#getUrlEncoded <em>Url Encoded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Url Encoded</em>'.
	 * @see WSDL1_1.BindingInput#getUrlEncoded()
	 * @see #getBindingInput()
	 * @generated
	 */
	EReference getBindingInput_UrlEncoded();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.BindingInput#getMultipartRelated <em>Multipart Related</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Multipart Related</em>'.
	 * @see WSDL1_1.BindingInput#getMultipartRelated()
	 * @see #getBindingInput()
	 * @generated
	 */
	EReference getBindingInput_MultipartRelated();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.BindingInput#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see WSDL1_1.BindingInput#getContent()
	 * @see #getBindingInput()
	 * @generated
	 */
	EReference getBindingInput_Content();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.BindingInput#getMimeXml <em>Mime Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mime Xml</em>'.
	 * @see WSDL1_1.BindingInput#getMimeXml()
	 * @see #getBindingInput()
	 * @generated
	 */
	EReference getBindingInput_MimeXml();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.BindingOutput <em>Binding Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Output</em>'.
	 * @see WSDL1_1.BindingOutput
	 * @generated
	 */
	EClass getBindingOutput();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.BindingOutput#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see WSDL1_1.BindingOutput#getBody()
	 * @see #getBindingOutput()
	 * @generated
	 */
	EReference getBindingOutput_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.BindingOutput#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Header</em>'.
	 * @see WSDL1_1.BindingOutput#getHeader()
	 * @see #getBindingOutput()
	 * @generated
	 */
	EReference getBindingOutput_Header();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.BindingOutput#getMultipartRelated <em>Multipart Related</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Multipart Related</em>'.
	 * @see WSDL1_1.BindingOutput#getMultipartRelated()
	 * @see #getBindingOutput()
	 * @generated
	 */
	EReference getBindingOutput_MultipartRelated();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.BindingOutput#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see WSDL1_1.BindingOutput#getContent()
	 * @see #getBindingOutput()
	 * @generated
	 */
	EReference getBindingOutput_Content();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.BindingOutput#getMimeXml <em>Mime Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mime Xml</em>'.
	 * @see WSDL1_1.BindingOutput#getMimeXml()
	 * @see #getBindingOutput()
	 * @generated
	 */
	EReference getBindingOutput_MimeXml();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.BindingOutput#getUrlReplacement <em>Url Replacement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Url Replacement</em>'.
	 * @see WSDL1_1.BindingOutput#getUrlReplacement()
	 * @see #getBindingOutput()
	 * @generated
	 */
	EReference getBindingOutput_UrlReplacement();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.BindingOutput#getUrlEncoded <em>Url Encoded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Url Encoded</em>'.
	 * @see WSDL1_1.BindingOutput#getUrlEncoded()
	 * @see #getBindingOutput()
	 * @generated
	 */
	EReference getBindingOutput_UrlEncoded();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.BindingFault <em>Binding Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Fault</em>'.
	 * @see WSDL1_1.BindingFault
	 * @generated
	 */
	EClass getBindingFault();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.BindingFault#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL1_1.BindingFault#getName()
	 * @see #getBindingFault()
	 * @generated
	 */
	EAttribute getBindingFault_Name();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.BindingFault#getFault <em>Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fault</em>'.
	 * @see WSDL1_1.BindingFault#getFault()
	 * @see #getBindingFault()
	 * @generated
	 */
	EReference getBindingFault_Fault();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.BindingFault#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see WSDL1_1.BindingFault#getBody()
	 * @see #getBindingFault()
	 * @generated
	 */
	EReference getBindingFault_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.BindingFault#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Header</em>'.
	 * @see WSDL1_1.BindingFault#getHeader()
	 * @see #getBindingFault()
	 * @generated
	 */
	EReference getBindingFault_Header();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.BindingFault#getMultipartRelated <em>Multipart Related</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Multipart Related</em>'.
	 * @see WSDL1_1.BindingFault#getMultipartRelated()
	 * @see #getBindingFault()
	 * @generated
	 */
	EReference getBindingFault_MultipartRelated();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.BindingFault#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see WSDL1_1.BindingFault#getContent()
	 * @see #getBindingFault()
	 * @generated
	 */
	EReference getBindingFault_Content();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.BindingFault#getMimeXml <em>Mime Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mime Xml</em>'.
	 * @see WSDL1_1.BindingFault#getMimeXml()
	 * @see #getBindingFault()
	 * @generated
	 */
	EReference getBindingFault_MimeXml();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.BindingFault#getUrlReplacement <em>Url Replacement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Url Replacement</em>'.
	 * @see WSDL1_1.BindingFault#getUrlReplacement()
	 * @see #getBindingFault()
	 * @generated
	 */
	EReference getBindingFault_UrlReplacement();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.BindingFault#getUrlEncoded <em>Url Encoded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Url Encoded</em>'.
	 * @see WSDL1_1.BindingFault#getUrlEncoded()
	 * @see #getBindingFault()
	 * @generated
	 */
	EReference getBindingFault_UrlEncoded();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see WSDL1_1.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL1_1.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Service#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see WSDL1_1.Service#getPort()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Port();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see WSDL1_1.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Port#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL1_1.Port#getName()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Name();

	/**
	 * Returns the meta object for the reference '{@link WSDL1_1.Port#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binding</em>'.
	 * @see WSDL1_1.Port#getBinding()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Binding();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Port#getSoapAddress <em>Soap Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Soap Address</em>'.
	 * @see WSDL1_1.Port#getSoapAddress()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_SoapAddress();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL1_1.Port#getHttpAddress <em>Http Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Http Address</em>'.
	 * @see WSDL1_1.Port#getHttpAddress()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_HttpAddress();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see WSDL1_1.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Import#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see WSDL1_1.Import#getLocation()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Location();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Import#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see WSDL1_1.Import#getNamespace()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Namespace();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation</em>'.
	 * @see WSDL1_1.Documentation
	 * @generated
	 */
	EClass getDocumentation();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL1_1.Documentation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text</em>'.
	 * @see WSDL1_1.Documentation#getText()
	 * @see #getDocumentation()
	 * @generated
	 */
	EReference getDocumentation_Text();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see WSDL1_1.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Text#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see WSDL1_1.Text#getText()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Text();

	/**
	 * Returns the meta object for class '{@link WSDL1_1.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace</em>'.
	 * @see WSDL1_1.Namespace
	 * @generated
	 */
	EClass getNamespace();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Namespace#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL1_1.Namespace#getName()
	 * @see #getNamespace()
	 * @generated
	 */
	EAttribute getNamespace_Name();

	/**
	 * Returns the meta object for the attribute '{@link WSDL1_1.Namespace#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see WSDL1_1.Namespace#getValue()
	 * @see #getNamespace()
	 * @generated
	 */
	EAttribute getNamespace_Value();

	/**
	 * Returns the meta object for the container reference '{@link WSDL1_1.Namespace#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Definition</em>'.
	 * @see WSDL1_1.Namespace#getDefinition()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_Definition();

	/**
	 * Returns the meta object for enum '{@link WSDL1_1.formValues <em>form Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>form Values</em>'.
	 * @see WSDL1_1.formValues
	 * @generated
	 */
	EEnum getformValues();

	/**
	 * Returns the meta object for enum '{@link WSDL1_1.usesValues <em>uses Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>uses Values</em>'.
	 * @see WSDL1_1.usesValues
	 * @generated
	 */
	EEnum getusesValues();

	/**
	 * Returns the meta object for enum '{@link WSDL1_1.processContentsValue <em>process Contents Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>process Contents Value</em>'.
	 * @see WSDL1_1.processContentsValue
	 * @generated
	 */
	EEnum getprocessContentsValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WSDL1_1Factory getWSDL1_1Factory();

} //WSDL1_1Package
