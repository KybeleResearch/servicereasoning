/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL2_0;

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
 * @see WSDL2_0.WSDL2_0Factory
 * @model kind="package"
 * @generated
 */
public interface WSDL2_0Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "WSDL2_0";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://WSDLv2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "WS_WSDLv2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WSDL2_0Package eINSTANCE = WSDL2_0.impl.WSDL2_0PackageImpl.init();

	/**
	 * The meta object id for the '{@link WSDL2_0.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.SchemaImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getSchema()
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
	 * The meta object id for the '{@link WSDL2_0.impl.AdicionalInformationTypeImpl <em>Adicional Information Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.AdicionalInformationTypeImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getAdicionalInformationType()
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
	 * The meta object id for the '{@link WSDL2_0.impl.TypeRefImpl <em>Type Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.TypeRefImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getTypeRef()
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
	 * The meta object id for the '{@link WSDL2_0.impl.IncludeXMLSchemaImpl <em>Include XML Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.IncludeXMLSchemaImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getIncludeXMLSchema()
	 * @generated
	 */
	int INCLUDE_XML_SCHEMA = 3;

	/**
	 * The feature id for the '<em><b>Schema Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_XML_SCHEMA__SCHEMA_LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_XML_SCHEMA__ID = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_XML_SCHEMA__ANNOTATION = 2;

	/**
	 * The number of structural features of the '<em>Include XML Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_XML_SCHEMA_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link WSDL2_0.impl.ImportXMLSchemaImpl <em>Import XML Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.ImportXMLSchemaImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getImportXMLSchema()
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
	 * The meta object id for the '{@link WSDL2_0.impl.RedefineImpl <em>Redefine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.RedefineImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getRedefine()
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
	 * The meta object id for the '{@link WSDL2_0.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.AnnotationImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getAnnotation()
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
	 * The meta object id for the '{@link WSDL2_0.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.ComplexTypeImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getComplexType()
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
	 * The meta object id for the '{@link WSDL2_0.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.ElementImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getElement()
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
	 * The meta object id for the '{@link WSDL2_0.impl.ElementImportedImpl <em>Element Imported</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.ElementImportedImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getElementImported()
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
	 * The feature id for the '<em><b>Message</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORTED__MESSAGE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Element Imported</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_IMPORTED_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link WSDL2_0.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.AttributeImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getAttribute()
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
	 * The meta object id for the '{@link WSDL2_0.impl.AttributeGroupImpl <em>Attribute Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.AttributeGroupImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getAttributeGroup()
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
	 * The meta object id for the '{@link WSDL2_0.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.GroupImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getGroup()
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
	 * The meta object id for the '{@link WSDL2_0.impl.NotationImpl <em>Notation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.NotationImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getNotation()
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
	 * The meta object id for the '{@link WSDL2_0.impl.SimpleContentImpl <em>Simple Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.SimpleContentImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getSimpleContent()
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
	 * The meta object id for the '{@link WSDL2_0.impl.ComplexContentImpl <em>Complex Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.ComplexContentImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getComplexContent()
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
	 * The meta object id for the '{@link WSDL2_0.impl.UniqueImpl <em>Unique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.UniqueImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getUnique()
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
	 * The meta object id for the '{@link WSDL2_0.impl.KeyImpl <em>Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.KeyImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getKey()
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
	 * The meta object id for the '{@link WSDL2_0.impl.KeyRefImpl <em>Key Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.KeyRefImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getKeyRef()
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
	 * The meta object id for the '{@link WSDL2_0.impl.AnyAttributeImpl <em>Any Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.AnyAttributeImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getAnyAttribute()
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
	 * The meta object id for the '{@link WSDL2_0.impl.ExtensionImpl <em>Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.ExtensionImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getExtension()
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
	 * The meta object id for the '{@link WSDL2_0.impl.SelectorImpl <em>Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.SelectorImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getSelector()
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
	 * The meta object id for the '{@link WSDL2_0.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.FieldImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getField()
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
	 * The meta object id for the '{@link WSDL2_0.impl.AppInfoImpl <em>App Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.AppInfoImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getAppInfo()
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
	 * The meta object id for the '{@link WSDL2_0.impl.DocumentationXMLSchemaImpl <em>Documentation XML Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.DocumentationXMLSchemaImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getDocumentationXMLSchema()
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
	 * The meta object id for the '{@link WSDL2_0.impl.AnyImpl <em>Any</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.AnyImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getAny()
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
	 * The meta object id for the '{@link WSDL2_0.impl.AllImpl <em>All</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.AllImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getAll()
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
	 * The meta object id for the '{@link WSDL2_0.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.ChoiceImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getChoice()
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
	 * The meta object id for the '{@link WSDL2_0.impl.SequenceTypeImpl <em>Sequence Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.SequenceTypeImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getSequenceType()
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
	 * The meta object id for the '{@link WSDL2_0.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.SimpleTypeImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getSimpleType()
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
	 * The meta object id for the '{@link WSDL2_0.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.ListImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getList()
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
	 * The meta object id for the '{@link WSDL2_0.impl.UnionImpl <em>Union</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.UnionImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getUnion()
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
	 * The meta object id for the '{@link WSDL2_0.impl.RestrictionImpl <em>Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.RestrictionImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getRestriction()
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
	 * The meta object id for the '{@link WSDL2_0.impl.MinInclusiveImpl <em>Min Inclusive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.MinInclusiveImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getMinInclusive()
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
	 * The meta object id for the '{@link WSDL2_0.impl.MinExclusiveImpl <em>Min Exclusive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.MinExclusiveImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getMinExclusive()
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
	 * The meta object id for the '{@link WSDL2_0.impl.MaxInclusiveImpl <em>Max Inclusive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.MaxInclusiveImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getMaxInclusive()
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
	 * The meta object id for the '{@link WSDL2_0.impl.MaxExclusiveImpl <em>Max Exclusive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.MaxExclusiveImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getMaxExclusive()
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
	 * The meta object id for the '{@link WSDL2_0.impl.TotalDigitsImpl <em>Total Digits</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.TotalDigitsImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getTotalDigits()
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
	 * The meta object id for the '{@link WSDL2_0.impl.FractionDigitsImpl <em>Fraction Digits</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.FractionDigitsImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getFractionDigits()
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
	 * The meta object id for the '{@link WSDL2_0.impl.PatternImpl <em>Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.PatternImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getPattern()
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
	 * The meta object id for the '{@link WSDL2_0.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.EnumerationImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getEnumeration()
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
	 * The meta object id for the '{@link WSDL2_0.impl.WhiteSpaceImpl <em>White Space</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.WhiteSpaceImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getWhiteSpace()
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
	 * The meta object id for the '{@link WSDL2_0.impl.LengthImpl <em>Length</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.LengthImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getLength()
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
	 * The meta object id for the '{@link WSDL2_0.impl.MaxLengthImpl <em>Max Length</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.MaxLengthImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getMaxLength()
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
	 * The meta object id for the '{@link WSDL2_0.impl.MinLengthImpl <em>Min Length</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.MinLengthImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getMinLength()
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
	 * The meta object id for the '{@link WSDL2_0.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.TextImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getText()
	 * @generated
	 */
	int TEXT = 45;

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
	 * The meta object id for the '{@link WSDL2_0.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.ObjectImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 46;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Element Imported</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__ELEMENT_IMPORTED = 1;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link WSDL2_0.impl.DescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.DescriptionImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getDescription()
	 * @generated
	 */
	int DESCRIPTION = 47;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__DOCUMENTATION = OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Element Imported</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__ELEMENT_IMPORTED = OBJECT__ELEMENT_IMPORTED;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__TARGET_NAMESPACE = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__IMPORT = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__INCLUDE = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__TYPES = OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__INTERFACE = OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__BINDING = OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__SERVICE = OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__NAMESPACE = OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link WSDL2_0.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.InterfaceImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 48;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__DOCUMENTATION = OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Element Imported</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ELEMENT_IMPORTED = OBJECT__ELEMENT_IMPORTED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Style Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__STYLE_DEFAULT = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__FAULT = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__OPERATION = OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Extends Def</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__EXTENDS_DEF = OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link WSDL2_0.impl.InterfaceFaultImpl <em>Interface Fault</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.InterfaceFaultImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getInterfaceFault()
	 * @generated
	 */
	int INTERFACE_FAULT = 49;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAULT__DOCUMENTATION = OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Element Imported</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAULT__ELEMENT_IMPORTED = OBJECT__ELEMENT_IMPORTED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAULT__NAME = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAULT__ELEMENT = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interface Fault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FAULT_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link WSDL2_0.impl.InterfaceOperationImpl <em>Interface Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.InterfaceOperationImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getInterfaceOperation()
	 * @generated
	 */
	int INTERFACE_OPERATION = 50;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION__DOCUMENTATION = OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Element Imported</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION__ELEMENT_IMPORTED = OBJECT__ELEMENT_IMPORTED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION__NAME = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION__PATTERN = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION__STYLE = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Wsdlx safe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION__WSDLX_SAFE = OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Wrpc signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION__WRPC_SIGNATURE = OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION__INPUT = OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION__OUTPUT = OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Infault</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION__INFAULT = OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Outfault</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION__OUTFAULT = OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Interface Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link WSDL2_0.impl.InterfaceInputImpl <em>Interface Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.InterfaceInputImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getInterfaceInput()
	 * @generated
	 */
	int INTERFACE_INPUT = 51;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_INPUT__DOCUMENTATION = OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Element Imported</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_INPUT__ELEMENT_IMPORTED = OBJECT__ELEMENT_IMPORTED;

	/**
	 * The feature id for the '<em><b>Message Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_INPUT__MESSAGE_LABEL = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_INPUT__ELEMENT = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interface Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_INPUT_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link WSDL2_0.impl.InterfaceOutputImpl <em>Interface Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.InterfaceOutputImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getInterfaceOutput()
	 * @generated
	 */
	int INTERFACE_OUTPUT = 52;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OUTPUT__DOCUMENTATION = OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Element Imported</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OUTPUT__ELEMENT_IMPORTED = OBJECT__ELEMENT_IMPORTED;

	/**
	 * The feature id for the '<em><b>Message Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OUTPUT__MESSAGE_LABEL = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OUTPUT__ELEMENT = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interface Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OUTPUT_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link WSDL2_0.impl.InterfaceInfaultImpl <em>Interface Infault</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.InterfaceInfaultImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getInterfaceInfault()
	 * @generated
	 */
	int INTERFACE_INFAULT = 53;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_INFAULT__DOCUMENTATION = OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Element Imported</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_INFAULT__ELEMENT_IMPORTED = OBJECT__ELEMENT_IMPORTED;

	/**
	 * The feature id for the '<em><b>Message Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_INFAULT__MESSAGE_LABEL = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_INFAULT__REF = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interface Infault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_INFAULT_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link WSDL2_0.impl.InterfaceOutfaultImpl <em>Interface Outfault</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.InterfaceOutfaultImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getInterfaceOutfault()
	 * @generated
	 */
	int INTERFACE_OUTFAULT = 54;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OUTFAULT__DOCUMENTATION = OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Element Imported</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OUTFAULT__ELEMENT_IMPORTED = OBJECT__ELEMENT_IMPORTED;

	/**
	 * The feature id for the '<em><b>Message Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OUTFAULT__MESSAGE_LABEL = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OUTFAULT__REF = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interface Outfault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OUTFAULT_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link WSDL2_0.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.BindingImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 55;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__DOCUMENTATION = OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Element Imported</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__ELEMENT_IMPORTED = OBJECT__ELEMENT_IMPORTED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__NAME = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__TYPE = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Wsoap version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__WSOAP_VERSION = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Wsoap protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__WSOAP_PROTOCOL = OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Whttp method Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__WHTTP_METHOD_DEFAULT = OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Wsoap mep Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__WSOAP_MEP_DEFAULT = OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Whttp query Parameter Separator Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__WHTTP_QUERY_PARAMETER_SEPARATOR_DEFAULT = OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Whttp cookies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__WHTTP_COOKIES = OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Whttp content Encoding Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__WHTTP_CONTENT_ENCODING_DEFAULT = OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__FAULT = OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__OPERATION = OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Wsoap module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__WSOAP_MODULE = OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__INTERFACE = OBJECT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link WSDL2_0.impl.BindingFaultImpl <em>Binding Fault</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.BindingFaultImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getBindingFault()
	 * @generated
	 */
	int BINDING_FAULT = 56;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FAULT__DOCUMENTATION = OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Element Imported</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FAULT__ELEMENT_IMPORTED = OBJECT__ELEMENT_IMPORTED;

	/**
	 * The feature id for the '<em><b>Wsoap code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FAULT__WSOAP_CODE = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Wsoap subcodes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FAULT__WSOAP_SUBCODES = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Whttp code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FAULT__WHTTP_CODE = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Whttp content Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FAULT__WHTTP_CONTENT_ENCODING = OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Wsoap module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FAULT__WSOAP_MODULE = OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Wsoap header</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FAULT__WSOAP_HEADER = OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Whttp header</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FAULT__WHTTP_HEADER = OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FAULT__REF = OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Binding Fault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FAULT_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link WSDL2_0.impl.BindingOperationImpl <em>Binding Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.BindingOperationImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getBindingOperation()
	 * @generated
	 */
	int BINDING_OPERATION = 57;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION__DOCUMENTATION = OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Element Imported</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION__ELEMENT_IMPORTED = OBJECT__ELEMENT_IMPORTED;

	/**
	 * The feature id for the '<em><b>Wsoap mep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION__WSOAP_MEP = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Wsoap action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION__WSOAP_ACTION = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Whttp location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION__WHTTP_LOCATION = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Whttp method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION__WHTTP_METHOD = OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Whttp input Serialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION__WHTTP_INPUT_SERIALIZATION = OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Whttp output Serialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION__WHTTP_OUTPUT_SERIALIZATION = OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Whttp fault Serialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION__WHTTP_FAULT_SERIALIZATION = OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Whttp query Parameter Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION__WHTTP_QUERY_PARAMETER_SEPARATOR = OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Whttp content Encoding Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION__WHTTP_CONTENT_ENCODING_DEFAULT = OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Whttp ignore Uncited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION__WHTTP_IGNORE_UNCITED = OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION__INPUT = OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION__OUTPUT = OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Infault</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION__INFAULT = OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Outfault</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION__OUTFAULT = OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Wsoap module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION__WSOAP_MODULE = OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION__REF = OBJECT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Binding Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link WSDL2_0.impl.BindingInputImpl <em>Binding Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.BindingInputImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getBindingInput()
	 * @generated
	 */
	int BINDING_INPUT = 58;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INPUT__DOCUMENTATION = OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Element Imported</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INPUT__ELEMENT_IMPORTED = OBJECT__ELEMENT_IMPORTED;

	/**
	 * The feature id for the '<em><b>Message Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INPUT__MESSAGE_LABEL = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Whttp content Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INPUT__WHTTP_CONTENT_ENCODING = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Wsoap module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INPUT__WSOAP_MODULE = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Wsoap header</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INPUT__WSOAP_HEADER = OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Whttp header</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INPUT__WHTTP_HEADER = OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Binding Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INPUT_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link WSDL2_0.impl.BindingOutputImpl <em>Binding Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.BindingOutputImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getBindingOutput()
	 * @generated
	 */
	int BINDING_OUTPUT = 59;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTPUT__DOCUMENTATION = OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Element Imported</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTPUT__ELEMENT_IMPORTED = OBJECT__ELEMENT_IMPORTED;

	/**
	 * The feature id for the '<em><b>Message Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTPUT__MESSAGE_LABEL = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Whttp content Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTPUT__WHTTP_CONTENT_ENCODING = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Wsoap module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTPUT__WSOAP_MODULE = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Wsoap header</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTPUT__WSOAP_HEADER = OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Whttp header</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTPUT__WHTTP_HEADER = OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Binding Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTPUT_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link WSDL2_0.impl.BindingInfaultImpl <em>Binding Infault</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.BindingInfaultImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getBindingInfault()
	 * @generated
	 */
	int BINDING_INFAULT = 60;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INFAULT__DOCUMENTATION = OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Element Imported</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INFAULT__ELEMENT_IMPORTED = OBJECT__ELEMENT_IMPORTED;

	/**
	 * The feature id for the '<em><b>Message Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INFAULT__MESSAGE_LABEL = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INFAULT__REF = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Wsoap module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INFAULT__WSOAP_MODULE = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binding Infault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_INFAULT_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link WSDL2_0.impl.BindingOutfaultImpl <em>Binding Outfault</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.BindingOutfaultImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getBindingOutfault()
	 * @generated
	 */
	int BINDING_OUTFAULT = 61;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTFAULT__DOCUMENTATION = OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Element Imported</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTFAULT__ELEMENT_IMPORTED = OBJECT__ELEMENT_IMPORTED;

	/**
	 * The feature id for the '<em><b>Message Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTFAULT__MESSAGE_LABEL = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTFAULT__REF = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Wsoap module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTFAULT__WSOAP_MODULE = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binding Outfault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OUTFAULT_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link WSDL2_0.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.ServiceImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 62;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DOCUMENTATION = OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Element Imported</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ELEMENT_IMPORTED = OBJECT__ELEMENT_IMPORTED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Endpoint Def</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ENDPOINT_DEF = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__INTERFACE = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link WSDL2_0.impl.EndPointImpl <em>End Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.EndPointImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getEndPoint()
	 * @generated
	 */
	int END_POINT = 63;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__DOCUMENTATION = OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Element Imported</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__ELEMENT_IMPORTED = OBJECT__ELEMENT_IMPORTED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__NAME = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__ADDRESS = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Whttp authentication Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__WHTTP_AUTHENTICATION_SCHEME = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Whttp authentication Realm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__WHTTP_AUTHENTICATION_REALM = OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__BINDING = OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link WSDL2_0.impl.ElementTypeImpl <em>Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.ElementTypeImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getElementType()
	 * @generated
	 */
	int ELEMENT_TYPE = 64;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__DOCUMENTATION = OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Element Imported</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__ELEMENT_IMPORTED = OBJECT__ELEMENT_IMPORTED;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__IMPORT = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__SCHEMA = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link WSDL2_0.impl.IncludeImpl <em>Include</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.IncludeImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getInclude()
	 * @generated
	 */
	int INCLUDE = 65;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__DOCUMENTATION = OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Element Imported</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__ELEMENT_IMPORTED = OBJECT__ELEMENT_IMPORTED;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__LOCATION = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Include</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link WSDL2_0.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.ImportImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 66;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__DOCUMENTATION = OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Element Imported</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__ELEMENT_IMPORTED = OBJECT__ELEMENT_IMPORTED;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__NAMESPACE = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__LOCATION = OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link WSDL2_0.impl.DocumentationImpl <em>Documentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.DocumentationImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getDocumentation()
	 * @generated
	 */
	int DOCUMENTATION = 67;

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
	 * The meta object id for the '{@link WSDL2_0.impl.NamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.NamespaceImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getNamespace()
	 * @generated
	 */
	int NAMESPACE = 68;

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
	 * The feature id for the '<em><b>Description</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link WSDL2_0.impl.Wsoap_ModuleImpl <em>Wsoap Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.Wsoap_ModuleImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getWsoap_Module()
	 * @generated
	 */
	int WSOAP_MODULE = 69;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSOAP_MODULE__REF = 0;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSOAP_MODULE__REQUIRED = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSOAP_MODULE__DOCUMENTATION = 2;

	/**
	 * The number of structural features of the '<em>Wsoap Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSOAP_MODULE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link WSDL2_0.impl.Wsoap_HeaderImpl <em>Wsoap Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.Wsoap_HeaderImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getWsoap_Header()
	 * @generated
	 */
	int WSOAP_HEADER = 70;

	/**
	 * The feature id for the '<em><b>Must Understand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSOAP_HEADER__MUST_UNDERSTAND = 0;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSOAP_HEADER__REQUIRED = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSOAP_HEADER__DOCUMENTATION = 2;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSOAP_HEADER__ELEMENT = 3;

	/**
	 * The number of structural features of the '<em>Wsoap Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSOAP_HEADER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link WSDL2_0.impl.Whttp_HeaderImpl <em>Whttp Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.impl.Whttp_HeaderImpl
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getWhttp_Header()
	 * @generated
	 */
	int WHTTP_HEADER = 71;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHTTP_HEADER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHTTP_HEADER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHTTP_HEADER__REQUIRED = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHTTP_HEADER__DOCUMENTATION = 3;

	/**
	 * The number of structural features of the '<em>Whttp Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHTTP_HEADER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link WSDL2_0.formValues <em>form Values</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.formValues
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getformValues()
	 * @generated
	 */
	int FORM_VALUES = 72;

	/**
	 * The meta object id for the '{@link WSDL2_0.usesValues <em>uses Values</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.usesValues
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getusesValues()
	 * @generated
	 */
	int USES_VALUES = 73;

	/**
	 * The meta object id for the '{@link WSDL2_0.processContentsValue <em>process Contents Value</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WSDL2_0.processContentsValue
	 * @see WSDL2_0.impl.WSDL2_0PackageImpl#getprocessContentsValue()
	 * @generated
	 */
	int PROCESS_CONTENTS_VALUE = 74;


	/**
	 * Returns the meta object for class '{@link WSDL2_0.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see WSDL2_0.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Schema#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see WSDL2_0.Schema#getTargetNamespace()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_TargetNamespace();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Schema#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see WSDL2_0.Schema#getVersion()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Version();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Schema#getNds <em>Nds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nds</em>'.
	 * @see WSDL2_0.Schema#getNds()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Nds();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Schema#getNsSchema <em>Ns Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns Schema</em>'.
	 * @see WSDL2_0.Schema#getNsSchema()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_NsSchema();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Schema#getFinalDefault <em>Final Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final Default</em>'.
	 * @see WSDL2_0.Schema#getFinalDefault()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_FinalDefault();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Schema#getBlockDefault <em>Block Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block Default</em>'.
	 * @see WSDL2_0.Schema#getBlockDefault()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_BlockDefault();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Schema#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.Schema#getId()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Id();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Schema#getElementFormDefault <em>Element Form Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Form Default</em>'.
	 * @see WSDL2_0.Schema#getElementFormDefault()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_ElementFormDefault();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Schema#getAttributeFormDefault <em>Attribute Form Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Form Default</em>'.
	 * @see WSDL2_0.Schema#getAttributeFormDefault()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_AttributeFormDefault();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Schema#getXml_lang <em>Xml lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xml lang</em>'.
	 * @see WSDL2_0.Schema#getXml_lang()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Xml_lang();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Schema#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include</em>'.
	 * @see WSDL2_0.Schema#getInclude()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Include();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Schema#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Import</em>'.
	 * @see WSDL2_0.Schema#getImport()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Import();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Schema#getRedefine <em>Redefine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Redefine</em>'.
	 * @see WSDL2_0.Schema#getRedefine()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Redefine();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Schema#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see WSDL2_0.Schema#getAnnotation()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Annotation();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Schema#getSimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple Type</em>'.
	 * @see WSDL2_0.Schema#getSimpleType()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_SimpleType();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Schema#getComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complex Type</em>'.
	 * @see WSDL2_0.Schema#getComplexType()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_ComplexType();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Schema#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see WSDL2_0.Schema#getElement()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Element();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Schema#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see WSDL2_0.Schema#getAttribute()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Schema#getAttributeGroup <em>Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Group</em>'.
	 * @see WSDL2_0.Schema#getAttributeGroup()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Schema#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group</em>'.
	 * @see WSDL2_0.Schema#getGroup()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Schema#getNotation <em>Notation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notation</em>'.
	 * @see WSDL2_0.Schema#getNotation()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Notation();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.AdicionalInformationType <em>Adicional Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adicional Information Type</em>'.
	 * @see WSDL2_0.AdicionalInformationType
	 * @generated
	 */
	EClass getAdicionalInformationType();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.AdicionalInformationType#getPrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primitive Type</em>'.
	 * @see WSDL2_0.AdicionalInformationType#getPrimitiveType()
	 * @see #getAdicionalInformationType()
	 * @generated
	 */
	EAttribute getAdicionalInformationType_PrimitiveType();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.TypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Ref</em>'.
	 * @see WSDL2_0.TypeRef
	 * @generated
	 */
	EClass getTypeRef();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.IncludeXMLSchema <em>Include XML Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Include XML Schema</em>'.
	 * @see WSDL2_0.IncludeXMLSchema
	 * @generated
	 */
	EClass getIncludeXMLSchema();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.IncludeXMLSchema#getSchemaLocation <em>Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Location</em>'.
	 * @see WSDL2_0.IncludeXMLSchema#getSchemaLocation()
	 * @see #getIncludeXMLSchema()
	 * @generated
	 */
	EAttribute getIncludeXMLSchema_SchemaLocation();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.IncludeXMLSchema#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.IncludeXMLSchema#getId()
	 * @see #getIncludeXMLSchema()
	 * @generated
	 */
	EAttribute getIncludeXMLSchema_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.IncludeXMLSchema#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL2_0.IncludeXMLSchema#getAnnotation()
	 * @see #getIncludeXMLSchema()
	 * @generated
	 */
	EReference getIncludeXMLSchema_Annotation();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.ImportXMLSchema <em>Import XML Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import XML Schema</em>'.
	 * @see WSDL2_0.ImportXMLSchema
	 * @generated
	 */
	EClass getImportXMLSchema();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.ImportXMLSchema#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see WSDL2_0.ImportXMLSchema#getNamespace()
	 * @see #getImportXMLSchema()
	 * @generated
	 */
	EAttribute getImportXMLSchema_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.ImportXMLSchema#getSchemaLocation <em>Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Location</em>'.
	 * @see WSDL2_0.ImportXMLSchema#getSchemaLocation()
	 * @see #getImportXMLSchema()
	 * @generated
	 */
	EAttribute getImportXMLSchema_SchemaLocation();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.ImportXMLSchema#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.ImportXMLSchema#getId()
	 * @see #getImportXMLSchema()
	 * @generated
	 */
	EAttribute getImportXMLSchema_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.ImportXMLSchema#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL2_0.ImportXMLSchema#getAnnotation()
	 * @see #getImportXMLSchema()
	 * @generated
	 */
	EReference getImportXMLSchema_Annotation();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.Redefine <em>Redefine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Redefine</em>'.
	 * @see WSDL2_0.Redefine
	 * @generated
	 */
	EClass getRedefine();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Redefine#getSchemaLocation <em>Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Location</em>'.
	 * @see WSDL2_0.Redefine#getSchemaLocation()
	 * @see #getRedefine()
	 * @generated
	 */
	EAttribute getRedefine_SchemaLocation();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Redefine#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.Redefine#getId()
	 * @see #getRedefine()
	 * @generated
	 */
	EAttribute getRedefine_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Redefine#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see WSDL2_0.Redefine#getAnnotation()
	 * @see #getRedefine()
	 * @generated
	 */
	EReference getRedefine_Annotation();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Redefine#getSimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple Type</em>'.
	 * @see WSDL2_0.Redefine#getSimpleType()
	 * @see #getRedefine()
	 * @generated
	 */
	EReference getRedefine_SimpleType();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Redefine#getComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complex Type</em>'.
	 * @see WSDL2_0.Redefine#getComplexType()
	 * @see #getRedefine()
	 * @generated
	 */
	EReference getRedefine_ComplexType();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Redefine#getAttributeGroup <em>Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Group</em>'.
	 * @see WSDL2_0.Redefine#getAttributeGroup()
	 * @see #getRedefine()
	 * @generated
	 */
	EReference getRedefine_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Redefine#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group</em>'.
	 * @see WSDL2_0.Redefine#getGroup()
	 * @see #getRedefine()
	 * @generated
	 */
	EReference getRedefine_Group();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see WSDL2_0.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Annotation#getAppinfo <em>Appinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Appinfo</em>'.
	 * @see WSDL2_0.Annotation#getAppinfo()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Appinfo();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Annotation#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see WSDL2_0.Annotation#getDocumentation()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Documentation();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.ComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Type</em>'.
	 * @see WSDL2_0.ComplexType
	 * @generated
	 */
	EClass getComplexType();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.ComplexType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL2_0.ComplexType#getName()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_Name();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.ComplexType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.ComplexType#getId()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_Id();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.ComplexType#getAbstractDef <em>Abstract Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract Def</em>'.
	 * @see WSDL2_0.ComplexType#getAbstractDef()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_AbstractDef();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.ComplexType#getFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see WSDL2_0.ComplexType#getFinal()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_Final();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.ComplexType#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block</em>'.
	 * @see WSDL2_0.ComplexType#getBlock()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_Block();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.ComplexType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mixed</em>'.
	 * @see WSDL2_0.ComplexType#getMixed()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_Mixed();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.ComplexType#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL2_0.ComplexType#getAnnotation()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.ComplexType#getSimpleContent <em>Simple Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Content</em>'.
	 * @see WSDL2_0.ComplexType#getSimpleContent()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_SimpleContent();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.ComplexType#getComplexContent <em>Complex Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Content</em>'.
	 * @see WSDL2_0.ComplexType#getComplexContent()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_ComplexContent();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.ComplexType#getAll <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All</em>'.
	 * @see WSDL2_0.ComplexType#getAll()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_All();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.ComplexType#getChoice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Choice</em>'.
	 * @see WSDL2_0.ComplexType#getChoice()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_Choice();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.ComplexType#getSequenceDef <em>Sequence Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Def</em>'.
	 * @see WSDL2_0.ComplexType#getSequenceDef()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_SequenceDef();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.ComplexType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group</em>'.
	 * @see WSDL2_0.ComplexType#getGroup()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.ComplexType#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see WSDL2_0.ComplexType#getAttribute()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.ComplexType#getAttributeGroup <em>Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Group</em>'.
	 * @see WSDL2_0.ComplexType#getAttributeGroup()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.ComplexType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Any Attribute</em>'.
	 * @see WSDL2_0.ComplexType#getAnyAttribute()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see WSDL2_0.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL2_0.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Element#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.Element#getId()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Element#getMinOccurs <em>Min Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Occurs</em>'.
	 * @see WSDL2_0.Element#getMinOccurs()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_MinOccurs();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Element#getMaxOccurs <em>Max Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Occurs</em>'.
	 * @see WSDL2_0.Element#getMaxOccurs()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_MaxOccurs();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Element#getNillable <em>Nillable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nillable</em>'.
	 * @see WSDL2_0.Element#getNillable()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Nillable();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Element#getAbstractDef <em>Abstract Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract Def</em>'.
	 * @see WSDL2_0.Element#getAbstractDef()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_AbstractDef();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Element#getFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see WSDL2_0.Element#getFinal()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Final();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Element#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block</em>'.
	 * @see WSDL2_0.Element#getBlock()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Block();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Element#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see WSDL2_0.Element#getDefault()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Default();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Element#getFixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed</em>'.
	 * @see WSDL2_0.Element#getFixed()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Fixed();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Element#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Form</em>'.
	 * @see WSDL2_0.Element#getForm()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Form();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Element#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL2_0.Element#getAnnotation()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Element#getComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Type</em>'.
	 * @see WSDL2_0.Element#getComplexType()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_ComplexType();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Element#getSimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Type</em>'.
	 * @see WSDL2_0.Element#getSimpleType()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_SimpleType();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Element#getUniqueDef <em>Unique Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unique Def</em>'.
	 * @see WSDL2_0.Element#getUniqueDef()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_UniqueDef();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Element#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Key</em>'.
	 * @see WSDL2_0.Element#getKey()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Key();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Element#getKeyref <em>Keyref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keyref</em>'.
	 * @see WSDL2_0.Element#getKeyref()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Keyref();

	/**
	 * Returns the meta object for the reference '{@link WSDL2_0.Element#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see WSDL2_0.Element#getRef()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Ref();

	/**
	 * Returns the meta object for the reference '{@link WSDL2_0.Element#getSubstitutionGroup <em>Substitution Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Substitution Group</em>'.
	 * @see WSDL2_0.Element#getSubstitutionGroup()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_SubstitutionGroup();

	/**
	 * Returns the meta object for the reference '{@link WSDL2_0.Element#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see WSDL2_0.Element#getType()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Type();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.ElementImported <em>Element Imported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Imported</em>'.
	 * @see WSDL2_0.ElementImported
	 * @generated
	 */
	EClass getElementImported();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.ElementImported#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see WSDL2_0.ElementImported#getUrl()
	 * @see #getElementImported()
	 * @generated
	 */
	EAttribute getElementImported_Url();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.ElementImported#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see WSDL2_0.ElementImported#getNamespace()
	 * @see #getElementImported()
	 * @generated
	 */
	EAttribute getElementImported_Namespace();

	/**
	 * Returns the meta object for the reference list '{@link WSDL2_0.ElementImported#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Message</em>'.
	 * @see WSDL2_0.ElementImported#getMessage()
	 * @see #getElementImported()
	 * @generated
	 */
	EReference getElementImported_Message();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see WSDL2_0.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL2_0.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Attribute#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.Attribute#getId()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Id();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Attribute#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use</em>'.
	 * @see WSDL2_0.Attribute#getUse()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Use();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Attribute#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see WSDL2_0.Attribute#getDefault()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Default();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Attribute#getFixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed</em>'.
	 * @see WSDL2_0.Attribute#getFixed()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Fixed();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Attribute#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Form</em>'.
	 * @see WSDL2_0.Attribute#getForm()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Form();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Attribute#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL2_0.Attribute#getAnnotation()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Attribute#getSimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Type</em>'.
	 * @see WSDL2_0.Attribute#getSimpleType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_SimpleType();

	/**
	 * Returns the meta object for the reference '{@link WSDL2_0.Attribute#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see WSDL2_0.Attribute#getRef()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Ref();

	/**
	 * Returns the meta object for the reference '{@link WSDL2_0.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see WSDL2_0.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Type();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.AttributeGroup <em>Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Group</em>'.
	 * @see WSDL2_0.AttributeGroup
	 * @generated
	 */
	EClass getAttributeGroup();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.AttributeGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL2_0.AttributeGroup#getName()
	 * @see #getAttributeGroup()
	 * @generated
	 */
	EAttribute getAttributeGroup_Name();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.AttributeGroup#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.AttributeGroup#getId()
	 * @see #getAttributeGroup()
	 * @generated
	 */
	EAttribute getAttributeGroup_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.AttributeGroup#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL2_0.AttributeGroup#getAnnotation()
	 * @see #getAttributeGroup()
	 * @generated
	 */
	EReference getAttributeGroup_Annotation();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.AttributeGroup#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see WSDL2_0.AttributeGroup#getAttribute()
	 * @see #getAttributeGroup()
	 * @generated
	 */
	EReference getAttributeGroup_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.AttributeGroup#getAttributeGroup <em>Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Group</em>'.
	 * @see WSDL2_0.AttributeGroup#getAttributeGroup()
	 * @see #getAttributeGroup()
	 * @generated
	 */
	EReference getAttributeGroup_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.AttributeGroup#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Any Attribute</em>'.
	 * @see WSDL2_0.AttributeGroup#getAnyAttribute()
	 * @see #getAttributeGroup()
	 * @generated
	 */
	EReference getAttributeGroup_AnyAttribute();

	/**
	 * Returns the meta object for the reference '{@link WSDL2_0.AttributeGroup#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see WSDL2_0.AttributeGroup#getRef()
	 * @see #getAttributeGroup()
	 * @generated
	 */
	EReference getAttributeGroup_Ref();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see WSDL2_0.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Group#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL2_0.Group#getName()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Name();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Group#getMinOccurs <em>Min Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Occurs</em>'.
	 * @see WSDL2_0.Group#getMinOccurs()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_MinOccurs();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Group#getMaxOccurs <em>Max Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Occurs</em>'.
	 * @see WSDL2_0.Group#getMaxOccurs()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_MaxOccurs();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Group#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.Group#getId()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Group#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL2_0.Group#getAnnotation()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Group#getAll <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All</em>'.
	 * @see WSDL2_0.Group#getAll()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_All();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Group#getChoice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Choice</em>'.
	 * @see WSDL2_0.Group#getChoice()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Choice();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Group#getSequenceDef <em>Sequence Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Def</em>'.
	 * @see WSDL2_0.Group#getSequenceDef()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_SequenceDef();

	/**
	 * Returns the meta object for the reference '{@link WSDL2_0.Group#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see WSDL2_0.Group#getRef()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Ref();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.Notation <em>Notation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notation</em>'.
	 * @see WSDL2_0.Notation
	 * @generated
	 */
	EClass getNotation();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Notation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL2_0.Notation#getName()
	 * @see #getNotation()
	 * @generated
	 */
	EAttribute getNotation_Name();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Notation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.Notation#getId()
	 * @see #getNotation()
	 * @generated
	 */
	EAttribute getNotation_Id();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Notation#getPublic <em>Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public</em>'.
	 * @see WSDL2_0.Notation#getPublic()
	 * @see #getNotation()
	 * @generated
	 */
	EAttribute getNotation_Public();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Notation#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System</em>'.
	 * @see WSDL2_0.Notation#getSystem()
	 * @see #getNotation()
	 * @generated
	 */
	EAttribute getNotation_System();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Notation#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL2_0.Notation#getAnnotation()
	 * @see #getNotation()
	 * @generated
	 */
	EReference getNotation_Annotation();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.SimpleContent <em>Simple Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Content</em>'.
	 * @see WSDL2_0.SimpleContent
	 * @generated
	 */
	EClass getSimpleContent();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.SimpleContent#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.SimpleContent#getId()
	 * @see #getSimpleContent()
	 * @generated
	 */
	EAttribute getSimpleContent_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.SimpleContent#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL2_0.SimpleContent#getAnnotation()
	 * @see #getSimpleContent()
	 * @generated
	 */
	EReference getSimpleContent_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.SimpleContent#getRestriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Restriction</em>'.
	 * @see WSDL2_0.SimpleContent#getRestriction()
	 * @see #getSimpleContent()
	 * @generated
	 */
	EReference getSimpleContent_Restriction();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.SimpleContent#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension</em>'.
	 * @see WSDL2_0.SimpleContent#getExtension()
	 * @see #getSimpleContent()
	 * @generated
	 */
	EReference getSimpleContent_Extension();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.ComplexContent <em>Complex Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Content</em>'.
	 * @see WSDL2_0.ComplexContent
	 * @generated
	 */
	EClass getComplexContent();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.ComplexContent#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mixed</em>'.
	 * @see WSDL2_0.ComplexContent#getMixed()
	 * @see #getComplexContent()
	 * @generated
	 */
	EAttribute getComplexContent_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.ComplexContent#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.ComplexContent#getId()
	 * @see #getComplexContent()
	 * @generated
	 */
	EAttribute getComplexContent_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.ComplexContent#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL2_0.ComplexContent#getAnnotation()
	 * @see #getComplexContent()
	 * @generated
	 */
	EReference getComplexContent_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.ComplexContent#getRestriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Restriction</em>'.
	 * @see WSDL2_0.ComplexContent#getRestriction()
	 * @see #getComplexContent()
	 * @generated
	 */
	EReference getComplexContent_Restriction();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.ComplexContent#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension</em>'.
	 * @see WSDL2_0.ComplexContent#getExtension()
	 * @see #getComplexContent()
	 * @generated
	 */
	EReference getComplexContent_Extension();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.Unique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unique</em>'.
	 * @see WSDL2_0.Unique
	 * @generated
	 */
	EClass getUnique();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Unique#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL2_0.Unique#getName()
	 * @see #getUnique()
	 * @generated
	 */
	EAttribute getUnique_Name();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Unique#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.Unique#getId()
	 * @see #getUnique()
	 * @generated
	 */
	EAttribute getUnique_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Unique#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL2_0.Unique#getAnnotation()
	 * @see #getUnique()
	 * @generated
	 */
	EReference getUnique_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Unique#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selector</em>'.
	 * @see WSDL2_0.Unique#getSelector()
	 * @see #getUnique()
	 * @generated
	 */
	EReference getUnique_Selector();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Unique#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field</em>'.
	 * @see WSDL2_0.Unique#getField()
	 * @see #getUnique()
	 * @generated
	 */
	EReference getUnique_Field();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.Key <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key</em>'.
	 * @see WSDL2_0.Key
	 * @generated
	 */
	EClass getKey();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Key#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL2_0.Key#getName()
	 * @see #getKey()
	 * @generated
	 */
	EAttribute getKey_Name();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Key#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.Key#getId()
	 * @see #getKey()
	 * @generated
	 */
	EAttribute getKey_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Key#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL2_0.Key#getAnnotation()
	 * @see #getKey()
	 * @generated
	 */
	EReference getKey_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Key#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selector</em>'.
	 * @see WSDL2_0.Key#getSelector()
	 * @see #getKey()
	 * @generated
	 */
	EReference getKey_Selector();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Key#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field</em>'.
	 * @see WSDL2_0.Key#getField()
	 * @see #getKey()
	 * @generated
	 */
	EReference getKey_Field();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.KeyRef <em>Key Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Ref</em>'.
	 * @see WSDL2_0.KeyRef
	 * @generated
	 */
	EClass getKeyRef();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.KeyRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL2_0.KeyRef#getName()
	 * @see #getKeyRef()
	 * @generated
	 */
	EAttribute getKeyRef_Name();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.KeyRef#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.KeyRef#getId()
	 * @see #getKeyRef()
	 * @generated
	 */
	EAttribute getKeyRef_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.KeyRef#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL2_0.KeyRef#getAnnotation()
	 * @see #getKeyRef()
	 * @generated
	 */
	EReference getKeyRef_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.KeyRef#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selector</em>'.
	 * @see WSDL2_0.KeyRef#getSelector()
	 * @see #getKeyRef()
	 * @generated
	 */
	EReference getKeyRef_Selector();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.KeyRef#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field</em>'.
	 * @see WSDL2_0.KeyRef#getField()
	 * @see #getKeyRef()
	 * @generated
	 */
	EReference getKeyRef_Field();

	/**
	 * Returns the meta object for the reference '{@link WSDL2_0.KeyRef#getRefer <em>Refer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refer</em>'.
	 * @see WSDL2_0.KeyRef#getRefer()
	 * @see #getKeyRef()
	 * @generated
	 */
	EReference getKeyRef_Refer();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.AnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Attribute</em>'.
	 * @see WSDL2_0.AnyAttribute
	 * @generated
	 */
	EClass getAnyAttribute();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.AnyAttribute#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see WSDL2_0.AnyAttribute#getNamespace()
	 * @see #getAnyAttribute()
	 * @generated
	 */
	EAttribute getAnyAttribute_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.AnyAttribute#getProcessContents <em>Process Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process Contents</em>'.
	 * @see WSDL2_0.AnyAttribute#getProcessContents()
	 * @see #getAnyAttribute()
	 * @generated
	 */
	EAttribute getAnyAttribute_ProcessContents();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.AnyAttribute#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.AnyAttribute#getId()
	 * @see #getAnyAttribute()
	 * @generated
	 */
	EAttribute getAnyAttribute_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.AnyAttribute#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL2_0.AnyAttribute#getAnnotation()
	 * @see #getAnyAttribute()
	 * @generated
	 */
	EReference getAnyAttribute_Annotation();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see WSDL2_0.Extension
	 * @generated
	 */
	EClass getExtension();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Extension#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.Extension#getId()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Extension#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL2_0.Extension#getAnnotation()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Extension#getAll <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All</em>'.
	 * @see WSDL2_0.Extension#getAll()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_All();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Extension#getChoice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Choice</em>'.
	 * @see WSDL2_0.Extension#getChoice()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Choice();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Extension#getSequenceDef <em>Sequence Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Def</em>'.
	 * @see WSDL2_0.Extension#getSequenceDef()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_SequenceDef();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Extension#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group</em>'.
	 * @see WSDL2_0.Extension#getGroup()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Extension#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see WSDL2_0.Extension#getAttribute()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Extension#getAttributeGroup <em>Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Group</em>'.
	 * @see WSDL2_0.Extension#getAttributeGroup()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Extension#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Any Attribute</em>'.
	 * @see WSDL2_0.Extension#getAnyAttribute()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_AnyAttribute();

	/**
	 * Returns the meta object for the reference '{@link WSDL2_0.Extension#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base</em>'.
	 * @see WSDL2_0.Extension#getBase()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Base();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.Selector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selector</em>'.
	 * @see WSDL2_0.Selector
	 * @generated
	 */
	EClass getSelector();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Selector#getXpath <em>Xpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xpath</em>'.
	 * @see WSDL2_0.Selector#getXpath()
	 * @see #getSelector()
	 * @generated
	 */
	EAttribute getSelector_Xpath();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Selector#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.Selector#getId()
	 * @see #getSelector()
	 * @generated
	 */
	EAttribute getSelector_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Selector#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL2_0.Selector#getAnnotation()
	 * @see #getSelector()
	 * @generated
	 */
	EReference getSelector_Annotation();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see WSDL2_0.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Field#getXpath <em>Xpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xpath</em>'.
	 * @see WSDL2_0.Field#getXpath()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Xpath();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Field#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.Field#getId()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Field#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL2_0.Field#getAnnotation()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Annotation();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.AppInfo <em>App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Info</em>'.
	 * @see WSDL2_0.AppInfo
	 * @generated
	 */
	EClass getAppInfo();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.AppInfo#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see WSDL2_0.AppInfo#getSource()
	 * @see #getAppInfo()
	 * @generated
	 */
	EAttribute getAppInfo_Source();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.AppInfo#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.AppInfo#getId()
	 * @see #getAppInfo()
	 * @generated
	 */
	EAttribute getAppInfo_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.AppInfo#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Any</em>'.
	 * @see WSDL2_0.AppInfo#getAny()
	 * @see #getAppInfo()
	 * @generated
	 */
	EReference getAppInfo_Any();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.DocumentationXMLSchema <em>Documentation XML Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation XML Schema</em>'.
	 * @see WSDL2_0.DocumentationXMLSchema
	 * @generated
	 */
	EClass getDocumentationXMLSchema();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.DocumentationXMLSchema#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see WSDL2_0.DocumentationXMLSchema#getSource()
	 * @see #getDocumentationXMLSchema()
	 * @generated
	 */
	EAttribute getDocumentationXMLSchema_Source();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.DocumentationXMLSchema#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.DocumentationXMLSchema#getId()
	 * @see #getDocumentationXMLSchema()
	 * @generated
	 */
	EAttribute getDocumentationXMLSchema_Id();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.DocumentationXMLSchema#getXml_lang <em>Xml lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xml lang</em>'.
	 * @see WSDL2_0.DocumentationXMLSchema#getXml_lang()
	 * @see #getDocumentationXMLSchema()
	 * @generated
	 */
	EAttribute getDocumentationXMLSchema_Xml_lang();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.DocumentationXMLSchema#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Any</em>'.
	 * @see WSDL2_0.DocumentationXMLSchema#getAny()
	 * @see #getDocumentationXMLSchema()
	 * @generated
	 */
	EReference getDocumentationXMLSchema_Any();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.DocumentationXMLSchema#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text</em>'.
	 * @see WSDL2_0.DocumentationXMLSchema#getText()
	 * @see #getDocumentationXMLSchema()
	 * @generated
	 */
	EReference getDocumentationXMLSchema_Text();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.Any <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any</em>'.
	 * @see WSDL2_0.Any
	 * @generated
	 */
	EClass getAny();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Any#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see WSDL2_0.Any#getNamespace()
	 * @see #getAny()
	 * @generated
	 */
	EAttribute getAny_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Any#getProcessContents <em>Process Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process Contents</em>'.
	 * @see WSDL2_0.Any#getProcessContents()
	 * @see #getAny()
	 * @generated
	 */
	EAttribute getAny_ProcessContents();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Any#getMinOccurs <em>Min Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Occurs</em>'.
	 * @see WSDL2_0.Any#getMinOccurs()
	 * @see #getAny()
	 * @generated
	 */
	EAttribute getAny_MinOccurs();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Any#getMaxOccurs <em>Max Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Occurs</em>'.
	 * @see WSDL2_0.Any#getMaxOccurs()
	 * @see #getAny()
	 * @generated
	 */
	EAttribute getAny_MaxOccurs();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Any#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.Any#getId()
	 * @see #getAny()
	 * @generated
	 */
	EAttribute getAny_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Any#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL2_0.Any#getAnnotation()
	 * @see #getAny()
	 * @generated
	 */
	EReference getAny_Annotation();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.All <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All</em>'.
	 * @see WSDL2_0.All
	 * @generated
	 */
	EClass getAll();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.All#getMinOccurs <em>Min Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Occurs</em>'.
	 * @see WSDL2_0.All#getMinOccurs()
	 * @see #getAll()
	 * @generated
	 */
	EAttribute getAll_MinOccurs();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.All#getMaxOccurs <em>Max Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Occurs</em>'.
	 * @see WSDL2_0.All#getMaxOccurs()
	 * @see #getAll()
	 * @generated
	 */
	EAttribute getAll_MaxOccurs();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.All#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.All#getId()
	 * @see #getAll()
	 * @generated
	 */
	EAttribute getAll_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.All#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL2_0.All#getAnnotation()
	 * @see #getAll()
	 * @generated
	 */
	EReference getAll_Annotation();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.All#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see WSDL2_0.All#getElement()
	 * @see #getAll()
	 * @generated
	 */
	EReference getAll_Element();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see WSDL2_0.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Choice#getMinOccurs <em>Min Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Occurs</em>'.
	 * @see WSDL2_0.Choice#getMinOccurs()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_MinOccurs();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Choice#getMaxOccurs <em>Max Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Occurs</em>'.
	 * @see WSDL2_0.Choice#getMaxOccurs()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_MaxOccurs();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Choice#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.Choice#getId()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Choice#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL2_0.Choice#getAnnotation()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_Annotation();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Choice#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see WSDL2_0.Choice#getElement()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_Element();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Choice#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group</em>'.
	 * @see WSDL2_0.Choice#getGroup()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Choice#getChoice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Choice</em>'.
	 * @see WSDL2_0.Choice#getChoice()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_Choice();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Choice#getSequenceDef <em>Sequence Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence Def</em>'.
	 * @see WSDL2_0.Choice#getSequenceDef()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_SequenceDef();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Choice#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any</em>'.
	 * @see WSDL2_0.Choice#getAny()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_Any();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.SequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Type</em>'.
	 * @see WSDL2_0.SequenceType
	 * @generated
	 */
	EClass getSequenceType();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.SequenceType#getMinOccurs <em>Min Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Occurs</em>'.
	 * @see WSDL2_0.SequenceType#getMinOccurs()
	 * @see #getSequenceType()
	 * @generated
	 */
	EAttribute getSequenceType_MinOccurs();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.SequenceType#getMaxOccurs <em>Max Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Occurs</em>'.
	 * @see WSDL2_0.SequenceType#getMaxOccurs()
	 * @see #getSequenceType()
	 * @generated
	 */
	EAttribute getSequenceType_MaxOccurs();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.SequenceType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.SequenceType#getId()
	 * @see #getSequenceType()
	 * @generated
	 */
	EAttribute getSequenceType_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.SequenceType#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL2_0.SequenceType#getAnnotation()
	 * @see #getSequenceType()
	 * @generated
	 */
	EReference getSequenceType_Annotation();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.SequenceType#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see WSDL2_0.SequenceType#getElement()
	 * @see #getSequenceType()
	 * @generated
	 */
	EReference getSequenceType_Element();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.SequenceType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group</em>'.
	 * @see WSDL2_0.SequenceType#getGroup()
	 * @see #getSequenceType()
	 * @generated
	 */
	EReference getSequenceType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.SequenceType#getChoice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Choice</em>'.
	 * @see WSDL2_0.SequenceType#getChoice()
	 * @see #getSequenceType()
	 * @generated
	 */
	EReference getSequenceType_Choice();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.SequenceType#getSequenceDef <em>Sequence Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence Def</em>'.
	 * @see WSDL2_0.SequenceType#getSequenceDef()
	 * @see #getSequenceType()
	 * @generated
	 */
	EReference getSequenceType_SequenceDef();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.SequenceType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any</em>'.
	 * @see WSDL2_0.SequenceType#getAny()
	 * @see #getSequenceType()
	 * @generated
	 */
	EReference getSequenceType_Any();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.SimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Type</em>'.
	 * @see WSDL2_0.SimpleType
	 * @generated
	 */
	EClass getSimpleType();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.SimpleType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL2_0.SimpleType#getName()
	 * @see #getSimpleType()
	 * @generated
	 */
	EAttribute getSimpleType_Name();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.SimpleType#getFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see WSDL2_0.SimpleType#getFinal()
	 * @see #getSimpleType()
	 * @generated
	 */
	EAttribute getSimpleType_Final();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.SimpleType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.SimpleType#getId()
	 * @see #getSimpleType()
	 * @generated
	 */
	EAttribute getSimpleType_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.SimpleType#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL2_0.SimpleType#getAnnotation()
	 * @see #getSimpleType()
	 * @generated
	 */
	EReference getSimpleType_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.SimpleType#getRestriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Restriction</em>'.
	 * @see WSDL2_0.SimpleType#getRestriction()
	 * @see #getSimpleType()
	 * @generated
	 */
	EReference getSimpleType_Restriction();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.SimpleType#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List</em>'.
	 * @see WSDL2_0.SimpleType#getList()
	 * @see #getSimpleType()
	 * @generated
	 */
	EReference getSimpleType_List();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.SimpleType#getUnion <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Union</em>'.
	 * @see WSDL2_0.SimpleType#getUnion()
	 * @see #getSimpleType()
	 * @generated
	 */
	EReference getSimpleType_Union();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see WSDL2_0.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.List#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.List#getId()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.List#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL2_0.List#getAnnotation()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.List#getSimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Type</em>'.
	 * @see WSDL2_0.List#getSimpleType()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_SimpleType();

	/**
	 * Returns the meta object for the reference '{@link WSDL2_0.List#getItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item Type</em>'.
	 * @see WSDL2_0.List#getItemType()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_ItemType();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.Union <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union</em>'.
	 * @see WSDL2_0.Union
	 * @generated
	 */
	EClass getUnion();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Union#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.Union#getId()
	 * @see #getUnion()
	 * @generated
	 */
	EAttribute getUnion_Id();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Union#getMemberTypes <em>Member Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member Types</em>'.
	 * @see WSDL2_0.Union#getMemberTypes()
	 * @see #getUnion()
	 * @generated
	 */
	EAttribute getUnion_MemberTypes();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Union#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL2_0.Union#getAnnotation()
	 * @see #getUnion()
	 * @generated
	 */
	EReference getUnion_Annotation();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Union#getSimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple Type</em>'.
	 * @see WSDL2_0.Union#getSimpleType()
	 * @see #getUnion()
	 * @generated
	 */
	EReference getUnion_SimpleType();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.Restriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restriction</em>'.
	 * @see WSDL2_0.Restriction
	 * @generated
	 */
	EClass getRestriction();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Restriction#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.Restriction#getId()
	 * @see #getRestriction()
	 * @generated
	 */
	EAttribute getRestriction_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Restriction#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL2_0.Restriction#getAnnotation()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Restriction#getAll <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All</em>'.
	 * @see WSDL2_0.Restriction#getAll()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_All();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Restriction#getChoice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Choice</em>'.
	 * @see WSDL2_0.Restriction#getChoice()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_Choice();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Restriction#getSequenceDef <em>Sequence Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Def</em>'.
	 * @see WSDL2_0.Restriction#getSequenceDef()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_SequenceDef();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Restriction#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group</em>'.
	 * @see WSDL2_0.Restriction#getGroup()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_Group();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Restriction#getSimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Type</em>'.
	 * @see WSDL2_0.Restriction#getSimpleType()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_SimpleType();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Restriction#getMinExclusive <em>Min Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Exclusive</em>'.
	 * @see WSDL2_0.Restriction#getMinExclusive()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_MinExclusive();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Restriction#getMinInclusive <em>Min Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Inclusive</em>'.
	 * @see WSDL2_0.Restriction#getMinInclusive()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_MinInclusive();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Restriction#getMaxExclusive <em>Max Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Exclusive</em>'.
	 * @see WSDL2_0.Restriction#getMaxExclusive()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_MaxExclusive();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Restriction#getMaxInclusive <em>Max Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Inclusive</em>'.
	 * @see WSDL2_0.Restriction#getMaxInclusive()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_MaxInclusive();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Restriction#getTotalDigits <em>Total Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Total Digits</em>'.
	 * @see WSDL2_0.Restriction#getTotalDigits()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_TotalDigits();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Restriction#getFractionDigits <em>Fraction Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fraction Digits</em>'.
	 * @see WSDL2_0.Restriction#getFractionDigits()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_FractionDigits();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Restriction#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see WSDL2_0.Restriction#getPattern()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_Pattern();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Restriction#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enumeration</em>'.
	 * @see WSDL2_0.Restriction#getEnumeration()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_Enumeration();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Restriction#getWhiteSpace <em>White Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>White Space</em>'.
	 * @see WSDL2_0.Restriction#getWhiteSpace()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_WhiteSpace();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Restriction#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Length</em>'.
	 * @see WSDL2_0.Restriction#getLength()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_Length();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Restriction#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Length</em>'.
	 * @see WSDL2_0.Restriction#getMaxLength()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_MaxLength();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Restriction#getMinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Length</em>'.
	 * @see WSDL2_0.Restriction#getMinLength()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_MinLength();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Restriction#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see WSDL2_0.Restriction#getAttribute()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Restriction#getAttributeGroup <em>Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Group</em>'.
	 * @see WSDL2_0.Restriction#getAttributeGroup()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_AttributeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Restriction#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Any Attribute</em>'.
	 * @see WSDL2_0.Restriction#getAnyAttribute()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_AnyAttribute();

	/**
	 * Returns the meta object for the reference '{@link WSDL2_0.Restriction#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base</em>'.
	 * @see WSDL2_0.Restriction#getBase()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_Base();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.MinInclusive <em>Min Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min Inclusive</em>'.
	 * @see WSDL2_0.MinInclusive
	 * @generated
	 */
	EClass getMinInclusive();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.MinInclusive#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see WSDL2_0.MinInclusive#getValue()
	 * @see #getMinInclusive()
	 * @generated
	 */
	EAttribute getMinInclusive_Value();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.MinInclusive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.MinInclusive#getId()
	 * @see #getMinInclusive()
	 * @generated
	 */
	EAttribute getMinInclusive_Id();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.MinInclusive#getFixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed</em>'.
	 * @see WSDL2_0.MinInclusive#getFixed()
	 * @see #getMinInclusive()
	 * @generated
	 */
	EAttribute getMinInclusive_Fixed();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.MinInclusive#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL2_0.MinInclusive#getAnnotation()
	 * @see #getMinInclusive()
	 * @generated
	 */
	EReference getMinInclusive_Annotation();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.MinExclusive <em>Min Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min Exclusive</em>'.
	 * @see WSDL2_0.MinExclusive
	 * @generated
	 */
	EClass getMinExclusive();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.MinExclusive#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see WSDL2_0.MinExclusive#getValue()
	 * @see #getMinExclusive()
	 * @generated
	 */
	EAttribute getMinExclusive_Value();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.MinExclusive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.MinExclusive#getId()
	 * @see #getMinExclusive()
	 * @generated
	 */
	EAttribute getMinExclusive_Id();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.MinExclusive#getFixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed</em>'.
	 * @see WSDL2_0.MinExclusive#getFixed()
	 * @see #getMinExclusive()
	 * @generated
	 */
	EAttribute getMinExclusive_Fixed();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.MinExclusive#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL2_0.MinExclusive#getAnnotation()
	 * @see #getMinExclusive()
	 * @generated
	 */
	EReference getMinExclusive_Annotation();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.MaxInclusive <em>Max Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Inclusive</em>'.
	 * @see WSDL2_0.MaxInclusive
	 * @generated
	 */
	EClass getMaxInclusive();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.MaxInclusive#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see WSDL2_0.MaxInclusive#getValue()
	 * @see #getMaxInclusive()
	 * @generated
	 */
	EAttribute getMaxInclusive_Value();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.MaxInclusive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.MaxInclusive#getId()
	 * @see #getMaxInclusive()
	 * @generated
	 */
	EAttribute getMaxInclusive_Id();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.MaxInclusive#getFixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed</em>'.
	 * @see WSDL2_0.MaxInclusive#getFixed()
	 * @see #getMaxInclusive()
	 * @generated
	 */
	EAttribute getMaxInclusive_Fixed();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.MaxInclusive#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL2_0.MaxInclusive#getAnnotation()
	 * @see #getMaxInclusive()
	 * @generated
	 */
	EReference getMaxInclusive_Annotation();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.MaxExclusive <em>Max Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Exclusive</em>'.
	 * @see WSDL2_0.MaxExclusive
	 * @generated
	 */
	EClass getMaxExclusive();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.MaxExclusive#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see WSDL2_0.MaxExclusive#getValue()
	 * @see #getMaxExclusive()
	 * @generated
	 */
	EAttribute getMaxExclusive_Value();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.MaxExclusive#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.MaxExclusive#getId()
	 * @see #getMaxExclusive()
	 * @generated
	 */
	EAttribute getMaxExclusive_Id();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.MaxExclusive#getFixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed</em>'.
	 * @see WSDL2_0.MaxExclusive#getFixed()
	 * @see #getMaxExclusive()
	 * @generated
	 */
	EAttribute getMaxExclusive_Fixed();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.MaxExclusive#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL2_0.MaxExclusive#getAnnotation()
	 * @see #getMaxExclusive()
	 * @generated
	 */
	EReference getMaxExclusive_Annotation();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.TotalDigits <em>Total Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Total Digits</em>'.
	 * @see WSDL2_0.TotalDigits
	 * @generated
	 */
	EClass getTotalDigits();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.TotalDigits#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see WSDL2_0.TotalDigits#getValue()
	 * @see #getTotalDigits()
	 * @generated
	 */
	EAttribute getTotalDigits_Value();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.TotalDigits#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.TotalDigits#getId()
	 * @see #getTotalDigits()
	 * @generated
	 */
	EAttribute getTotalDigits_Id();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.TotalDigits#getFixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed</em>'.
	 * @see WSDL2_0.TotalDigits#getFixed()
	 * @see #getTotalDigits()
	 * @generated
	 */
	EAttribute getTotalDigits_Fixed();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.TotalDigits#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL2_0.TotalDigits#getAnnotation()
	 * @see #getTotalDigits()
	 * @generated
	 */
	EReference getTotalDigits_Annotation();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.FractionDigits <em>Fraction Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fraction Digits</em>'.
	 * @see WSDL2_0.FractionDigits
	 * @generated
	 */
	EClass getFractionDigits();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.FractionDigits#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see WSDL2_0.FractionDigits#getValue()
	 * @see #getFractionDigits()
	 * @generated
	 */
	EAttribute getFractionDigits_Value();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.FractionDigits#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.FractionDigits#getId()
	 * @see #getFractionDigits()
	 * @generated
	 */
	EAttribute getFractionDigits_Id();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.FractionDigits#getFixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed</em>'.
	 * @see WSDL2_0.FractionDigits#getFixed()
	 * @see #getFractionDigits()
	 * @generated
	 */
	EAttribute getFractionDigits_Fixed();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.FractionDigits#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL2_0.FractionDigits#getAnnotation()
	 * @see #getFractionDigits()
	 * @generated
	 */
	EReference getFractionDigits_Annotation();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern</em>'.
	 * @see WSDL2_0.Pattern
	 * @generated
	 */
	EClass getPattern();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Pattern#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see WSDL2_0.Pattern#getValue()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_Value();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Pattern#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.Pattern#getId()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Pattern#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL2_0.Pattern#getAnnotation()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_Annotation();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see WSDL2_0.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Enumeration#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see WSDL2_0.Enumeration#getValue()
	 * @see #getEnumeration()
	 * @generated
	 */
	EAttribute getEnumeration_Value();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Enumeration#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.Enumeration#getId()
	 * @see #getEnumeration()
	 * @generated
	 */
	EAttribute getEnumeration_Id();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Enumeration#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL2_0.Enumeration#getAnnotation()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_Annotation();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.WhiteSpace <em>White Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>White Space</em>'.
	 * @see WSDL2_0.WhiteSpace
	 * @generated
	 */
	EClass getWhiteSpace();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.WhiteSpace#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see WSDL2_0.WhiteSpace#getValue()
	 * @see #getWhiteSpace()
	 * @generated
	 */
	EAttribute getWhiteSpace_Value();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.WhiteSpace#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.WhiteSpace#getId()
	 * @see #getWhiteSpace()
	 * @generated
	 */
	EAttribute getWhiteSpace_Id();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.WhiteSpace#getFixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed</em>'.
	 * @see WSDL2_0.WhiteSpace#getFixed()
	 * @see #getWhiteSpace()
	 * @generated
	 */
	EAttribute getWhiteSpace_Fixed();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.WhiteSpace#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL2_0.WhiteSpace#getAnnotation()
	 * @see #getWhiteSpace()
	 * @generated
	 */
	EReference getWhiteSpace_Annotation();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.Length <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length</em>'.
	 * @see WSDL2_0.Length
	 * @generated
	 */
	EClass getLength();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Length#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see WSDL2_0.Length#getValue()
	 * @see #getLength()
	 * @generated
	 */
	EAttribute getLength_Value();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Length#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.Length#getId()
	 * @see #getLength()
	 * @generated
	 */
	EAttribute getLength_Id();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Length#getFixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed</em>'.
	 * @see WSDL2_0.Length#getFixed()
	 * @see #getLength()
	 * @generated
	 */
	EAttribute getLength_Fixed();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Length#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL2_0.Length#getAnnotation()
	 * @see #getLength()
	 * @generated
	 */
	EReference getLength_Annotation();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.MaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Length</em>'.
	 * @see WSDL2_0.MaxLength
	 * @generated
	 */
	EClass getMaxLength();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.MaxLength#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see WSDL2_0.MaxLength#getValue()
	 * @see #getMaxLength()
	 * @generated
	 */
	EAttribute getMaxLength_Value();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.MaxLength#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.MaxLength#getId()
	 * @see #getMaxLength()
	 * @generated
	 */
	EAttribute getMaxLength_Id();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.MaxLength#getFixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed</em>'.
	 * @see WSDL2_0.MaxLength#getFixed()
	 * @see #getMaxLength()
	 * @generated
	 */
	EAttribute getMaxLength_Fixed();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.MaxLength#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL2_0.MaxLength#getAnnotation()
	 * @see #getMaxLength()
	 * @generated
	 */
	EReference getMaxLength_Annotation();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.MinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min Length</em>'.
	 * @see WSDL2_0.MinLength
	 * @generated
	 */
	EClass getMinLength();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.MinLength#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see WSDL2_0.MinLength#getValue()
	 * @see #getMinLength()
	 * @generated
	 */
	EAttribute getMinLength_Value();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.MinLength#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WSDL2_0.MinLength#getId()
	 * @see #getMinLength()
	 * @generated
	 */
	EAttribute getMinLength_Id();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.MinLength#getFixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed</em>'.
	 * @see WSDL2_0.MinLength#getFixed()
	 * @see #getMinLength()
	 * @generated
	 */
	EAttribute getMinLength_Fixed();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.MinLength#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see WSDL2_0.MinLength#getAnnotation()
	 * @see #getMinLength()
	 * @generated
	 */
	EReference getMinLength_Annotation();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see WSDL2_0.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Text#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see WSDL2_0.Text#getText()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Text();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see WSDL2_0.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Object#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see WSDL2_0.Object#getDocumentation()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Documentation();

	/**
	 * Returns the meta object for the reference '{@link WSDL2_0.Object#getElementImported <em>Element Imported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Imported</em>'.
	 * @see WSDL2_0.Object#getElementImported()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_ElementImported();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see WSDL2_0.Description
	 * @generated
	 */
	EClass getDescription();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Description#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see WSDL2_0.Description#getTargetNamespace()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_TargetNamespace();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Description#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Import</em>'.
	 * @see WSDL2_0.Description#getImport()
	 * @see #getDescription()
	 * @generated
	 */
	EReference getDescription_Import();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Description#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include</em>'.
	 * @see WSDL2_0.Description#getInclude()
	 * @see #getDescription()
	 * @generated
	 */
	EReference getDescription_Include();

	/**
	 * Returns the meta object for the containment reference '{@link WSDL2_0.Description#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Types</em>'.
	 * @see WSDL2_0.Description#getTypes()
	 * @see #getDescription()
	 * @generated
	 */
	EReference getDescription_Types();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Description#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see WSDL2_0.Description#getInterface()
	 * @see #getDescription()
	 * @generated
	 */
	EReference getDescription_Interface();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Description#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binding</em>'.
	 * @see WSDL2_0.Description#getBinding()
	 * @see #getDescription()
	 * @generated
	 */
	EReference getDescription_Binding();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Description#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see WSDL2_0.Description#getService()
	 * @see #getDescription()
	 * @generated
	 */
	EReference getDescription_Service();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Description#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Namespace</em>'.
	 * @see WSDL2_0.Description#getNamespace()
	 * @see #getDescription()
	 * @generated
	 */
	EReference getDescription_Namespace();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see WSDL2_0.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Interface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL2_0.Interface#getName()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Name();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Interface#getStyleDefault <em>Style Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Default</em>'.
	 * @see WSDL2_0.Interface#getStyleDefault()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_StyleDefault();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Interface#getFault <em>Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fault</em>'.
	 * @see WSDL2_0.Interface#getFault()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Fault();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Interface#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see WSDL2_0.Interface#getOperation()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Operation();

	/**
	 * Returns the meta object for the reference list '{@link WSDL2_0.Interface#getExtendsDef <em>Extends Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extends Def</em>'.
	 * @see WSDL2_0.Interface#getExtendsDef()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_ExtendsDef();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.InterfaceFault <em>Interface Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Fault</em>'.
	 * @see WSDL2_0.InterfaceFault
	 * @generated
	 */
	EClass getInterfaceFault();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.InterfaceFault#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL2_0.InterfaceFault#getName()
	 * @see #getInterfaceFault()
	 * @generated
	 */
	EAttribute getInterfaceFault_Name();

	/**
	 * Returns the meta object for the reference '{@link WSDL2_0.InterfaceFault#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see WSDL2_0.InterfaceFault#getElement()
	 * @see #getInterfaceFault()
	 * @generated
	 */
	EReference getInterfaceFault_Element();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.InterfaceOperation <em>Interface Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Operation</em>'.
	 * @see WSDL2_0.InterfaceOperation
	 * @generated
	 */
	EClass getInterfaceOperation();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.InterfaceOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL2_0.InterfaceOperation#getName()
	 * @see #getInterfaceOperation()
	 * @generated
	 */
	EAttribute getInterfaceOperation_Name();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.InterfaceOperation#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see WSDL2_0.InterfaceOperation#getPattern()
	 * @see #getInterfaceOperation()
	 * @generated
	 */
	EAttribute getInterfaceOperation_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.InterfaceOperation#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see WSDL2_0.InterfaceOperation#getStyle()
	 * @see #getInterfaceOperation()
	 * @generated
	 */
	EAttribute getInterfaceOperation_Style();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.InterfaceOperation#getWsdlx_safe <em>Wsdlx safe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wsdlx safe</em>'.
	 * @see WSDL2_0.InterfaceOperation#getWsdlx_safe()
	 * @see #getInterfaceOperation()
	 * @generated
	 */
	EAttribute getInterfaceOperation_Wsdlx_safe();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.InterfaceOperation#getWrpc_signature <em>Wrpc signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wrpc signature</em>'.
	 * @see WSDL2_0.InterfaceOperation#getWrpc_signature()
	 * @see #getInterfaceOperation()
	 * @generated
	 */
	EAttribute getInterfaceOperation_Wrpc_signature();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.InterfaceOperation#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see WSDL2_0.InterfaceOperation#getInput()
	 * @see #getInterfaceOperation()
	 * @generated
	 */
	EReference getInterfaceOperation_Input();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.InterfaceOperation#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see WSDL2_0.InterfaceOperation#getOutput()
	 * @see #getInterfaceOperation()
	 * @generated
	 */
	EReference getInterfaceOperation_Output();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.InterfaceOperation#getInfault <em>Infault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Infault</em>'.
	 * @see WSDL2_0.InterfaceOperation#getInfault()
	 * @see #getInterfaceOperation()
	 * @generated
	 */
	EReference getInterfaceOperation_Infault();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.InterfaceOperation#getOutfault <em>Outfault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outfault</em>'.
	 * @see WSDL2_0.InterfaceOperation#getOutfault()
	 * @see #getInterfaceOperation()
	 * @generated
	 */
	EReference getInterfaceOperation_Outfault();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.InterfaceInput <em>Interface Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Input</em>'.
	 * @see WSDL2_0.InterfaceInput
	 * @generated
	 */
	EClass getInterfaceInput();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.InterfaceInput#getMessageLabel <em>Message Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Label</em>'.
	 * @see WSDL2_0.InterfaceInput#getMessageLabel()
	 * @see #getInterfaceInput()
	 * @generated
	 */
	EAttribute getInterfaceInput_MessageLabel();

	/**
	 * Returns the meta object for the reference '{@link WSDL2_0.InterfaceInput#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see WSDL2_0.InterfaceInput#getElement()
	 * @see #getInterfaceInput()
	 * @generated
	 */
	EReference getInterfaceInput_Element();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.InterfaceOutput <em>Interface Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Output</em>'.
	 * @see WSDL2_0.InterfaceOutput
	 * @generated
	 */
	EClass getInterfaceOutput();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.InterfaceOutput#getMessageLabel <em>Message Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Label</em>'.
	 * @see WSDL2_0.InterfaceOutput#getMessageLabel()
	 * @see #getInterfaceOutput()
	 * @generated
	 */
	EAttribute getInterfaceOutput_MessageLabel();

	/**
	 * Returns the meta object for the reference '{@link WSDL2_0.InterfaceOutput#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see WSDL2_0.InterfaceOutput#getElement()
	 * @see #getInterfaceOutput()
	 * @generated
	 */
	EReference getInterfaceOutput_Element();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.InterfaceInfault <em>Interface Infault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Infault</em>'.
	 * @see WSDL2_0.InterfaceInfault
	 * @generated
	 */
	EClass getInterfaceInfault();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.InterfaceInfault#getMessageLabel <em>Message Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Label</em>'.
	 * @see WSDL2_0.InterfaceInfault#getMessageLabel()
	 * @see #getInterfaceInfault()
	 * @generated
	 */
	EAttribute getInterfaceInfault_MessageLabel();

	/**
	 * Returns the meta object for the reference '{@link WSDL2_0.InterfaceInfault#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see WSDL2_0.InterfaceInfault#getRef()
	 * @see #getInterfaceInfault()
	 * @generated
	 */
	EReference getInterfaceInfault_Ref();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.InterfaceOutfault <em>Interface Outfault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Outfault</em>'.
	 * @see WSDL2_0.InterfaceOutfault
	 * @generated
	 */
	EClass getInterfaceOutfault();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.InterfaceOutfault#getMessageLabel <em>Message Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Label</em>'.
	 * @see WSDL2_0.InterfaceOutfault#getMessageLabel()
	 * @see #getInterfaceOutfault()
	 * @generated
	 */
	EAttribute getInterfaceOutfault_MessageLabel();

	/**
	 * Returns the meta object for the reference '{@link WSDL2_0.InterfaceOutfault#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see WSDL2_0.InterfaceOutfault#getRef()
	 * @see #getInterfaceOutfault()
	 * @generated
	 */
	EReference getInterfaceOutfault_Ref();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see WSDL2_0.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Binding#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL2_0.Binding#getName()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_Name();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Binding#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see WSDL2_0.Binding#getType()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_Type();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Binding#getWsoap_version <em>Wsoap version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wsoap version</em>'.
	 * @see WSDL2_0.Binding#getWsoap_version()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_Wsoap_version();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Binding#getWsoap_protocol <em>Wsoap protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wsoap protocol</em>'.
	 * @see WSDL2_0.Binding#getWsoap_protocol()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_Wsoap_protocol();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Binding#getWhttp_methodDefault <em>Whttp method Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Whttp method Default</em>'.
	 * @see WSDL2_0.Binding#getWhttp_methodDefault()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_Whttp_methodDefault();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Binding#getWsoap_mepDefault <em>Wsoap mep Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wsoap mep Default</em>'.
	 * @see WSDL2_0.Binding#getWsoap_mepDefault()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_Wsoap_mepDefault();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Binding#getWhttp_queryParameterSeparatorDefault <em>Whttp query Parameter Separator Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Whttp query Parameter Separator Default</em>'.
	 * @see WSDL2_0.Binding#getWhttp_queryParameterSeparatorDefault()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_Whttp_queryParameterSeparatorDefault();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Binding#getWhttp_cookies <em>Whttp cookies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Whttp cookies</em>'.
	 * @see WSDL2_0.Binding#getWhttp_cookies()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_Whttp_cookies();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Binding#getWhttp_contentEncodingDefault <em>Whttp content Encoding Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Whttp content Encoding Default</em>'.
	 * @see WSDL2_0.Binding#getWhttp_contentEncodingDefault()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_Whttp_contentEncodingDefault();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Binding#getFault <em>Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fault</em>'.
	 * @see WSDL2_0.Binding#getFault()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Fault();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Binding#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see WSDL2_0.Binding#getOperation()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Operation();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Binding#getWsoap_module <em>Wsoap module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wsoap module</em>'.
	 * @see WSDL2_0.Binding#getWsoap_module()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Wsoap_module();

	/**
	 * Returns the meta object for the reference '{@link WSDL2_0.Binding#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see WSDL2_0.Binding#getInterface()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Interface();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.BindingFault <em>Binding Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Fault</em>'.
	 * @see WSDL2_0.BindingFault
	 * @generated
	 */
	EClass getBindingFault();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.BindingFault#getWsoap_code <em>Wsoap code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wsoap code</em>'.
	 * @see WSDL2_0.BindingFault#getWsoap_code()
	 * @see #getBindingFault()
	 * @generated
	 */
	EAttribute getBindingFault_Wsoap_code();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.BindingFault#getWsoap_subcodes <em>Wsoap subcodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wsoap subcodes</em>'.
	 * @see WSDL2_0.BindingFault#getWsoap_subcodes()
	 * @see #getBindingFault()
	 * @generated
	 */
	EAttribute getBindingFault_Wsoap_subcodes();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.BindingFault#getWhttp_code <em>Whttp code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Whttp code</em>'.
	 * @see WSDL2_0.BindingFault#getWhttp_code()
	 * @see #getBindingFault()
	 * @generated
	 */
	EAttribute getBindingFault_Whttp_code();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.BindingFault#getWhttp_contentEncoding <em>Whttp content Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Whttp content Encoding</em>'.
	 * @see WSDL2_0.BindingFault#getWhttp_contentEncoding()
	 * @see #getBindingFault()
	 * @generated
	 */
	EAttribute getBindingFault_Whttp_contentEncoding();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.BindingFault#getWsoap_module <em>Wsoap module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wsoap module</em>'.
	 * @see WSDL2_0.BindingFault#getWsoap_module()
	 * @see #getBindingFault()
	 * @generated
	 */
	EReference getBindingFault_Wsoap_module();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.BindingFault#getWsoap_header <em>Wsoap header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wsoap header</em>'.
	 * @see WSDL2_0.BindingFault#getWsoap_header()
	 * @see #getBindingFault()
	 * @generated
	 */
	EReference getBindingFault_Wsoap_header();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.BindingFault#getWhttp_header <em>Whttp header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Whttp header</em>'.
	 * @see WSDL2_0.BindingFault#getWhttp_header()
	 * @see #getBindingFault()
	 * @generated
	 */
	EReference getBindingFault_Whttp_header();

	/**
	 * Returns the meta object for the reference '{@link WSDL2_0.BindingFault#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see WSDL2_0.BindingFault#getRef()
	 * @see #getBindingFault()
	 * @generated
	 */
	EReference getBindingFault_Ref();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.BindingOperation <em>Binding Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Operation</em>'.
	 * @see WSDL2_0.BindingOperation
	 * @generated
	 */
	EClass getBindingOperation();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.BindingOperation#getWsoap_mep <em>Wsoap mep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wsoap mep</em>'.
	 * @see WSDL2_0.BindingOperation#getWsoap_mep()
	 * @see #getBindingOperation()
	 * @generated
	 */
	EAttribute getBindingOperation_Wsoap_mep();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.BindingOperation#getWsoap_action <em>Wsoap action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wsoap action</em>'.
	 * @see WSDL2_0.BindingOperation#getWsoap_action()
	 * @see #getBindingOperation()
	 * @generated
	 */
	EAttribute getBindingOperation_Wsoap_action();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.BindingOperation#getWhttp_location <em>Whttp location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Whttp location</em>'.
	 * @see WSDL2_0.BindingOperation#getWhttp_location()
	 * @see #getBindingOperation()
	 * @generated
	 */
	EAttribute getBindingOperation_Whttp_location();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.BindingOperation#getWhttp_method <em>Whttp method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Whttp method</em>'.
	 * @see WSDL2_0.BindingOperation#getWhttp_method()
	 * @see #getBindingOperation()
	 * @generated
	 */
	EAttribute getBindingOperation_Whttp_method();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.BindingOperation#getWhttp_inputSerialization <em>Whttp input Serialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Whttp input Serialization</em>'.
	 * @see WSDL2_0.BindingOperation#getWhttp_inputSerialization()
	 * @see #getBindingOperation()
	 * @generated
	 */
	EAttribute getBindingOperation_Whttp_inputSerialization();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.BindingOperation#getWhttp_outputSerialization <em>Whttp output Serialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Whttp output Serialization</em>'.
	 * @see WSDL2_0.BindingOperation#getWhttp_outputSerialization()
	 * @see #getBindingOperation()
	 * @generated
	 */
	EAttribute getBindingOperation_Whttp_outputSerialization();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.BindingOperation#getWhttp_faultSerialization <em>Whttp fault Serialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Whttp fault Serialization</em>'.
	 * @see WSDL2_0.BindingOperation#getWhttp_faultSerialization()
	 * @see #getBindingOperation()
	 * @generated
	 */
	EAttribute getBindingOperation_Whttp_faultSerialization();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.BindingOperation#getWhttp_queryParameterSeparator <em>Whttp query Parameter Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Whttp query Parameter Separator</em>'.
	 * @see WSDL2_0.BindingOperation#getWhttp_queryParameterSeparator()
	 * @see #getBindingOperation()
	 * @generated
	 */
	EAttribute getBindingOperation_Whttp_queryParameterSeparator();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.BindingOperation#getWhttp_contentEncodingDefault <em>Whttp content Encoding Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Whttp content Encoding Default</em>'.
	 * @see WSDL2_0.BindingOperation#getWhttp_contentEncodingDefault()
	 * @see #getBindingOperation()
	 * @generated
	 */
	EAttribute getBindingOperation_Whttp_contentEncodingDefault();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.BindingOperation#getWhttp_ignoreUncited <em>Whttp ignore Uncited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Whttp ignore Uncited</em>'.
	 * @see WSDL2_0.BindingOperation#getWhttp_ignoreUncited()
	 * @see #getBindingOperation()
	 * @generated
	 */
	EAttribute getBindingOperation_Whttp_ignoreUncited();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.BindingOperation#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see WSDL2_0.BindingOperation#getInput()
	 * @see #getBindingOperation()
	 * @generated
	 */
	EReference getBindingOperation_Input();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.BindingOperation#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see WSDL2_0.BindingOperation#getOutput()
	 * @see #getBindingOperation()
	 * @generated
	 */
	EReference getBindingOperation_Output();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.BindingOperation#getInfault <em>Infault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Infault</em>'.
	 * @see WSDL2_0.BindingOperation#getInfault()
	 * @see #getBindingOperation()
	 * @generated
	 */
	EReference getBindingOperation_Infault();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.BindingOperation#getOutfault <em>Outfault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outfault</em>'.
	 * @see WSDL2_0.BindingOperation#getOutfault()
	 * @see #getBindingOperation()
	 * @generated
	 */
	EReference getBindingOperation_Outfault();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.BindingOperation#getWsoap_module <em>Wsoap module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wsoap module</em>'.
	 * @see WSDL2_0.BindingOperation#getWsoap_module()
	 * @see #getBindingOperation()
	 * @generated
	 */
	EReference getBindingOperation_Wsoap_module();

	/**
	 * Returns the meta object for the reference '{@link WSDL2_0.BindingOperation#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see WSDL2_0.BindingOperation#getRef()
	 * @see #getBindingOperation()
	 * @generated
	 */
	EReference getBindingOperation_Ref();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.BindingInput <em>Binding Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Input</em>'.
	 * @see WSDL2_0.BindingInput
	 * @generated
	 */
	EClass getBindingInput();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.BindingInput#getMessageLabel <em>Message Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Label</em>'.
	 * @see WSDL2_0.BindingInput#getMessageLabel()
	 * @see #getBindingInput()
	 * @generated
	 */
	EAttribute getBindingInput_MessageLabel();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.BindingInput#getWhttp_contentEncoding <em>Whttp content Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Whttp content Encoding</em>'.
	 * @see WSDL2_0.BindingInput#getWhttp_contentEncoding()
	 * @see #getBindingInput()
	 * @generated
	 */
	EAttribute getBindingInput_Whttp_contentEncoding();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.BindingInput#getWsoap_module <em>Wsoap module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wsoap module</em>'.
	 * @see WSDL2_0.BindingInput#getWsoap_module()
	 * @see #getBindingInput()
	 * @generated
	 */
	EReference getBindingInput_Wsoap_module();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.BindingInput#getWsoap_header <em>Wsoap header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wsoap header</em>'.
	 * @see WSDL2_0.BindingInput#getWsoap_header()
	 * @see #getBindingInput()
	 * @generated
	 */
	EReference getBindingInput_Wsoap_header();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.BindingInput#getWhttp_header <em>Whttp header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Whttp header</em>'.
	 * @see WSDL2_0.BindingInput#getWhttp_header()
	 * @see #getBindingInput()
	 * @generated
	 */
	EReference getBindingInput_Whttp_header();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.BindingOutput <em>Binding Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Output</em>'.
	 * @see WSDL2_0.BindingOutput
	 * @generated
	 */
	EClass getBindingOutput();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.BindingOutput#getMessageLabel <em>Message Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Label</em>'.
	 * @see WSDL2_0.BindingOutput#getMessageLabel()
	 * @see #getBindingOutput()
	 * @generated
	 */
	EAttribute getBindingOutput_MessageLabel();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.BindingOutput#getWhttp_contentEncoding <em>Whttp content Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Whttp content Encoding</em>'.
	 * @see WSDL2_0.BindingOutput#getWhttp_contentEncoding()
	 * @see #getBindingOutput()
	 * @generated
	 */
	EAttribute getBindingOutput_Whttp_contentEncoding();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.BindingOutput#getWsoap_module <em>Wsoap module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wsoap module</em>'.
	 * @see WSDL2_0.BindingOutput#getWsoap_module()
	 * @see #getBindingOutput()
	 * @generated
	 */
	EReference getBindingOutput_Wsoap_module();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.BindingOutput#getWsoap_header <em>Wsoap header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wsoap header</em>'.
	 * @see WSDL2_0.BindingOutput#getWsoap_header()
	 * @see #getBindingOutput()
	 * @generated
	 */
	EReference getBindingOutput_Wsoap_header();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.BindingOutput#getWhttp_header <em>Whttp header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Whttp header</em>'.
	 * @see WSDL2_0.BindingOutput#getWhttp_header()
	 * @see #getBindingOutput()
	 * @generated
	 */
	EReference getBindingOutput_Whttp_header();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.BindingInfault <em>Binding Infault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Infault</em>'.
	 * @see WSDL2_0.BindingInfault
	 * @generated
	 */
	EClass getBindingInfault();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.BindingInfault#getMessageLabel <em>Message Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Label</em>'.
	 * @see WSDL2_0.BindingInfault#getMessageLabel()
	 * @see #getBindingInfault()
	 * @generated
	 */
	EAttribute getBindingInfault_MessageLabel();

	/**
	 * Returns the meta object for the reference '{@link WSDL2_0.BindingInfault#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see WSDL2_0.BindingInfault#getRef()
	 * @see #getBindingInfault()
	 * @generated
	 */
	EReference getBindingInfault_Ref();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.BindingInfault#getWsoap_module <em>Wsoap module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wsoap module</em>'.
	 * @see WSDL2_0.BindingInfault#getWsoap_module()
	 * @see #getBindingInfault()
	 * @generated
	 */
	EReference getBindingInfault_Wsoap_module();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.BindingOutfault <em>Binding Outfault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Outfault</em>'.
	 * @see WSDL2_0.BindingOutfault
	 * @generated
	 */
	EClass getBindingOutfault();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.BindingOutfault#getMessageLabel <em>Message Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Label</em>'.
	 * @see WSDL2_0.BindingOutfault#getMessageLabel()
	 * @see #getBindingOutfault()
	 * @generated
	 */
	EAttribute getBindingOutfault_MessageLabel();

	/**
	 * Returns the meta object for the reference '{@link WSDL2_0.BindingOutfault#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see WSDL2_0.BindingOutfault#getRef()
	 * @see #getBindingOutfault()
	 * @generated
	 */
	EReference getBindingOutfault_Ref();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.BindingOutfault#getWsoap_module <em>Wsoap module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wsoap module</em>'.
	 * @see WSDL2_0.BindingOutfault#getWsoap_module()
	 * @see #getBindingOutfault()
	 * @generated
	 */
	EReference getBindingOutfault_Wsoap_module();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see WSDL2_0.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL2_0.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Service#getEndpointDef <em>Endpoint Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Endpoint Def</em>'.
	 * @see WSDL2_0.Service#getEndpointDef()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_EndpointDef();

	/**
	 * Returns the meta object for the reference '{@link WSDL2_0.Service#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see WSDL2_0.Service#getInterface()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Interface();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.EndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Point</em>'.
	 * @see WSDL2_0.EndPoint
	 * @generated
	 */
	EClass getEndPoint();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.EndPoint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL2_0.EndPoint#getName()
	 * @see #getEndPoint()
	 * @generated
	 */
	EAttribute getEndPoint_Name();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.EndPoint#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see WSDL2_0.EndPoint#getAddress()
	 * @see #getEndPoint()
	 * @generated
	 */
	EAttribute getEndPoint_Address();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.EndPoint#getWhttp_authenticationScheme <em>Whttp authentication Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Whttp authentication Scheme</em>'.
	 * @see WSDL2_0.EndPoint#getWhttp_authenticationScheme()
	 * @see #getEndPoint()
	 * @generated
	 */
	EAttribute getEndPoint_Whttp_authenticationScheme();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.EndPoint#getWhttp_authenticationRealm <em>Whttp authentication Realm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Whttp authentication Realm</em>'.
	 * @see WSDL2_0.EndPoint#getWhttp_authenticationRealm()
	 * @see #getEndPoint()
	 * @generated
	 */
	EAttribute getEndPoint_Whttp_authenticationRealm();

	/**
	 * Returns the meta object for the reference '{@link WSDL2_0.EndPoint#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binding</em>'.
	 * @see WSDL2_0.EndPoint#getBinding()
	 * @see #getEndPoint()
	 * @generated
	 */
	EReference getEndPoint_Binding();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.ElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Type</em>'.
	 * @see WSDL2_0.ElementType
	 * @generated
	 */
	EClass getElementType();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.ElementType#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Import</em>'.
	 * @see WSDL2_0.ElementType#getImport()
	 * @see #getElementType()
	 * @generated
	 */
	EReference getElementType_Import();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.ElementType#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schema</em>'.
	 * @see WSDL2_0.ElementType#getSchema()
	 * @see #getElementType()
	 * @generated
	 */
	EReference getElementType_Schema();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.Include <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Include</em>'.
	 * @see WSDL2_0.Include
	 * @generated
	 */
	EClass getInclude();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Include#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see WSDL2_0.Include#getLocation()
	 * @see #getInclude()
	 * @generated
	 */
	EAttribute getInclude_Location();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see WSDL2_0.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Import#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see WSDL2_0.Import#getNamespace()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Import#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see WSDL2_0.Import#getLocation()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Location();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation</em>'.
	 * @see WSDL2_0.Documentation
	 * @generated
	 */
	EClass getDocumentation();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Documentation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text</em>'.
	 * @see WSDL2_0.Documentation#getText()
	 * @see #getDocumentation()
	 * @generated
	 */
	EReference getDocumentation_Text();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace</em>'.
	 * @see WSDL2_0.Namespace
	 * @generated
	 */
	EClass getNamespace();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Namespace#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL2_0.Namespace#getName()
	 * @see #getNamespace()
	 * @generated
	 */
	EAttribute getNamespace_Name();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Namespace#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see WSDL2_0.Namespace#getValue()
	 * @see #getNamespace()
	 * @generated
	 */
	EAttribute getNamespace_Value();

	/**
	 * Returns the meta object for the container reference '{@link WSDL2_0.Namespace#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Description</em>'.
	 * @see WSDL2_0.Namespace#getDescription()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_Description();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.Wsoap_Module <em>Wsoap Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wsoap Module</em>'.
	 * @see WSDL2_0.Wsoap_Module
	 * @generated
	 */
	EClass getWsoap_Module();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Wsoap_Module#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see WSDL2_0.Wsoap_Module#getRef()
	 * @see #getWsoap_Module()
	 * @generated
	 */
	EAttribute getWsoap_Module_Ref();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Wsoap_Module#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see WSDL2_0.Wsoap_Module#getRequired()
	 * @see #getWsoap_Module()
	 * @generated
	 */
	EAttribute getWsoap_Module_Required();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Wsoap_Module#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see WSDL2_0.Wsoap_Module#getDocumentation()
	 * @see #getWsoap_Module()
	 * @generated
	 */
	EReference getWsoap_Module_Documentation();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.Wsoap_Header <em>Wsoap Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wsoap Header</em>'.
	 * @see WSDL2_0.Wsoap_Header
	 * @generated
	 */
	EClass getWsoap_Header();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Wsoap_Header#getMustUnderstand <em>Must Understand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Must Understand</em>'.
	 * @see WSDL2_0.Wsoap_Header#getMustUnderstand()
	 * @see #getWsoap_Header()
	 * @generated
	 */
	EAttribute getWsoap_Header_MustUnderstand();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Wsoap_Header#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see WSDL2_0.Wsoap_Header#getRequired()
	 * @see #getWsoap_Header()
	 * @generated
	 */
	EAttribute getWsoap_Header_Required();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Wsoap_Header#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see WSDL2_0.Wsoap_Header#getDocumentation()
	 * @see #getWsoap_Header()
	 * @generated
	 */
	EReference getWsoap_Header_Documentation();

	/**
	 * Returns the meta object for the reference '{@link WSDL2_0.Wsoap_Header#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see WSDL2_0.Wsoap_Header#getElement()
	 * @see #getWsoap_Header()
	 * @generated
	 */
	EReference getWsoap_Header_Element();

	/**
	 * Returns the meta object for class '{@link WSDL2_0.Whttp_Header <em>Whttp Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Whttp Header</em>'.
	 * @see WSDL2_0.Whttp_Header
	 * @generated
	 */
	EClass getWhttp_Header();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Whttp_Header#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WSDL2_0.Whttp_Header#getName()
	 * @see #getWhttp_Header()
	 * @generated
	 */
	EAttribute getWhttp_Header_Name();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Whttp_Header#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see WSDL2_0.Whttp_Header#getType()
	 * @see #getWhttp_Header()
	 * @generated
	 */
	EAttribute getWhttp_Header_Type();

	/**
	 * Returns the meta object for the attribute '{@link WSDL2_0.Whttp_Header#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see WSDL2_0.Whttp_Header#getRequired()
	 * @see #getWhttp_Header()
	 * @generated
	 */
	EAttribute getWhttp_Header_Required();

	/**
	 * Returns the meta object for the containment reference list '{@link WSDL2_0.Whttp_Header#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see WSDL2_0.Whttp_Header#getDocumentation()
	 * @see #getWhttp_Header()
	 * @generated
	 */
	EReference getWhttp_Header_Documentation();

	/**
	 * Returns the meta object for enum '{@link WSDL2_0.formValues <em>form Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>form Values</em>'.
	 * @see WSDL2_0.formValues
	 * @generated
	 */
	EEnum getformValues();

	/**
	 * Returns the meta object for enum '{@link WSDL2_0.usesValues <em>uses Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>uses Values</em>'.
	 * @see WSDL2_0.usesValues
	 * @generated
	 */
	EEnum getusesValues();

	/**
	 * Returns the meta object for enum '{@link WSDL2_0.processContentsValue <em>process Contents Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>process Contents Value</em>'.
	 * @see WSDL2_0.processContentsValue
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
	WSDL2_0Factory getWSDL2_0Factory();

} //WSDL2_0Package
