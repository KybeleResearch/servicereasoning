/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL1_1.impl;

import WSDL1_1.AddressHTTP;
import WSDL1_1.AddressSOAP;
import WSDL1_1.AdicionalInformationType;
import WSDL1_1.All;
import WSDL1_1.Annotation;
import WSDL1_1.Any;
import WSDL1_1.AnyAttribute;
import WSDL1_1.AppInfo;
import WSDL1_1.Attribute;
import WSDL1_1.AttributeGroup;
import WSDL1_1.Binding;
import WSDL1_1.BindingFault;
import WSDL1_1.BindingHTTP;
import WSDL1_1.BindingInput;
import WSDL1_1.BindingOperation;
import WSDL1_1.BindingOutput;
import WSDL1_1.BindingSOAP;
import WSDL1_1.BodySOAP;
import WSDL1_1.Choice;
import WSDL1_1.ComplexContent;
import WSDL1_1.ComplexType;
import WSDL1_1.Definitions;
import WSDL1_1.Documentation;
import WSDL1_1.DocumentationXMLSchema;
import WSDL1_1.Element;
import WSDL1_1.ElementImported;
import WSDL1_1.ElementType;
import WSDL1_1.Enumeration;
import WSDL1_1.Extension;
import WSDL1_1.FaultSOAP;
import WSDL1_1.Field;
import WSDL1_1.FractionDigits;
import WSDL1_1.Group;
import WSDL1_1.HeaderFaultSOAP;
import WSDL1_1.HeaderSOAP;
import WSDL1_1.Import;
import WSDL1_1.ImportXMLSchema;
import WSDL1_1.Include;
import WSDL1_1.Key;
import WSDL1_1.KeyRef;
import WSDL1_1.Length;
import WSDL1_1.List;
import WSDL1_1.MIMEContent;
import WSDL1_1.MIMEMultiPartRelated;
import WSDL1_1.MIMEPart;
import WSDL1_1.MIMEXml;
import WSDL1_1.MaxExclusive;
import WSDL1_1.MaxInclusive;
import WSDL1_1.MaxLength;
import WSDL1_1.Message;
import WSDL1_1.MinExclusive;
import WSDL1_1.MinInclusive;
import WSDL1_1.MinLength;
import WSDL1_1.Namespace;
import WSDL1_1.Notation;
import WSDL1_1.OperationHTTP;
import WSDL1_1.OperationSOAP;
import WSDL1_1.Part;
import WSDL1_1.Pattern;
import WSDL1_1.Port;
import WSDL1_1.PortType;
import WSDL1_1.PortTypeFault;
import WSDL1_1.PortTypeInput;
import WSDL1_1.PortTypeOperation;
import WSDL1_1.PortTypeOutput;
import WSDL1_1.Redefine;
import WSDL1_1.Restriction;
import WSDL1_1.Schema;
import WSDL1_1.Selector;
import WSDL1_1.SequenceType;
import WSDL1_1.Service;
import WSDL1_1.SimpleContent;
import WSDL1_1.SimpleType;
import WSDL1_1.Text;
import WSDL1_1.TotalDigits;
import WSDL1_1.TypeRef;
import WSDL1_1.URLEncoded;
import WSDL1_1.URLReplacement;
import WSDL1_1.Union;
import WSDL1_1.Unique;
import WSDL1_1.WSDL1_1Factory;
import WSDL1_1.WSDL1_1Package;
import WSDL1_1.WhiteSpace;
import WSDL1_1.formValues;
import WSDL1_1.processContentsValue;
import WSDL1_1.usesValues;

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
public class WSDL1_1FactoryImpl extends EFactoryImpl implements WSDL1_1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WSDL1_1Factory init() {
		try {
			WSDL1_1Factory theWSDL1_1Factory = (WSDL1_1Factory)EPackage.Registry.INSTANCE.getEFactory("http://WSDLv1"); 
			if (theWSDL1_1Factory != null) {
				return theWSDL1_1Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WSDL1_1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WSDL1_1FactoryImpl() {
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
			case WSDL1_1Package.SCHEMA: return createSchema();
			case WSDL1_1Package.ADICIONAL_INFORMATION_TYPE: return createAdicionalInformationType();
			case WSDL1_1Package.TYPE_REF: return createTypeRef();
			case WSDL1_1Package.INCLUDE: return createInclude();
			case WSDL1_1Package.IMPORT_XML_SCHEMA: return createImportXMLSchema();
			case WSDL1_1Package.REDEFINE: return createRedefine();
			case WSDL1_1Package.ANNOTATION: return createAnnotation();
			case WSDL1_1Package.COMPLEX_TYPE: return createComplexType();
			case WSDL1_1Package.ELEMENT: return createElement();
			case WSDL1_1Package.ELEMENT_IMPORTED: return createElementImported();
			case WSDL1_1Package.ATTRIBUTE: return createAttribute();
			case WSDL1_1Package.ATTRIBUTE_GROUP: return createAttributeGroup();
			case WSDL1_1Package.GROUP: return createGroup();
			case WSDL1_1Package.NOTATION: return createNotation();
			case WSDL1_1Package.SIMPLE_CONTENT: return createSimpleContent();
			case WSDL1_1Package.COMPLEX_CONTENT: return createComplexContent();
			case WSDL1_1Package.UNIQUE: return createUnique();
			case WSDL1_1Package.KEY: return createKey();
			case WSDL1_1Package.KEY_REF: return createKeyRef();
			case WSDL1_1Package.ANY_ATTRIBUTE: return createAnyAttribute();
			case WSDL1_1Package.EXTENSION: return createExtension();
			case WSDL1_1Package.SELECTOR: return createSelector();
			case WSDL1_1Package.FIELD: return createField();
			case WSDL1_1Package.APP_INFO: return createAppInfo();
			case WSDL1_1Package.DOCUMENTATION_XML_SCHEMA: return createDocumentationXMLSchema();
			case WSDL1_1Package.ANY: return createAny();
			case WSDL1_1Package.ALL: return createAll();
			case WSDL1_1Package.CHOICE: return createChoice();
			case WSDL1_1Package.SEQUENCE_TYPE: return createSequenceType();
			case WSDL1_1Package.SIMPLE_TYPE: return createSimpleType();
			case WSDL1_1Package.LIST: return createList();
			case WSDL1_1Package.UNION: return createUnion();
			case WSDL1_1Package.RESTRICTION: return createRestriction();
			case WSDL1_1Package.MIN_INCLUSIVE: return createMinInclusive();
			case WSDL1_1Package.MIN_EXCLUSIVE: return createMinExclusive();
			case WSDL1_1Package.MAX_INCLUSIVE: return createMaxInclusive();
			case WSDL1_1Package.MAX_EXCLUSIVE: return createMaxExclusive();
			case WSDL1_1Package.TOTAL_DIGITS: return createTotalDigits();
			case WSDL1_1Package.FRACTION_DIGITS: return createFractionDigits();
			case WSDL1_1Package.PATTERN: return createPattern();
			case WSDL1_1Package.ENUMERATION: return createEnumeration();
			case WSDL1_1Package.WHITE_SPACE: return createWhiteSpace();
			case WSDL1_1Package.LENGTH: return createLength();
			case WSDL1_1Package.MAX_LENGTH: return createMaxLength();
			case WSDL1_1Package.MIN_LENGTH: return createMinLength();
			case WSDL1_1Package.OBJECT: return createObject();
			case WSDL1_1Package.BINDING_SOAP: return createBindingSOAP();
			case WSDL1_1Package.OPERATION_SOAP: return createOperationSOAP();
			case WSDL1_1Package.BODY_SOAP: return createBodySOAP();
			case WSDL1_1Package.HEADER_SOAP: return createHeaderSOAP();
			case WSDL1_1Package.HEADER_FAULT_SOAP: return createHeaderFaultSOAP();
			case WSDL1_1Package.ADDRESS_SOAP: return createAddressSOAP();
			case WSDL1_1Package.FAULT_SOAP: return createFaultSOAP();
			case WSDL1_1Package.ADDRESS_HTTP: return createAddressHTTP();
			case WSDL1_1Package.OPERATION_HTTP: return createOperationHTTP();
			case WSDL1_1Package.URL_ENCODED: return createURLEncoded();
			case WSDL1_1Package.URL_REPLACEMENT: return createURLReplacement();
			case WSDL1_1Package.BINDING_HTTP: return createBindingHTTP();
			case WSDL1_1Package.MIME_MULTI_PART_RELATED: return createMIMEMultiPartRelated();
			case WSDL1_1Package.MIME_PART: return createMIMEPart();
			case WSDL1_1Package.MIME_CONTENT: return createMIMEContent();
			case WSDL1_1Package.MIME_XML: return createMIMEXml();
			case WSDL1_1Package.PORT_TYPE_FAULT: return createPortTypeFault();
			case WSDL1_1Package.DEFINITIONS: return createDefinitions();
			case WSDL1_1Package.ELEMENT_TYPE: return createElementType();
			case WSDL1_1Package.MESSAGE: return createMessage();
			case WSDL1_1Package.PART: return createPart();
			case WSDL1_1Package.PORT_TYPE: return createPortType();
			case WSDL1_1Package.PORT_TYPE_OPERATION: return createPortTypeOperation();
			case WSDL1_1Package.PORT_TYPE_INPUT: return createPortTypeInput();
			case WSDL1_1Package.PORT_TYPE_OUTPUT: return createPortTypeOutput();
			case WSDL1_1Package.BINDING: return createBinding();
			case WSDL1_1Package.BINDING_OPERATION: return createBindingOperation();
			case WSDL1_1Package.BINDING_INPUT: return createBindingInput();
			case WSDL1_1Package.BINDING_OUTPUT: return createBindingOutput();
			case WSDL1_1Package.BINDING_FAULT: return createBindingFault();
			case WSDL1_1Package.SERVICE: return createService();
			case WSDL1_1Package.PORT: return createPort();
			case WSDL1_1Package.IMPORT: return createImport();
			case WSDL1_1Package.DOCUMENTATION: return createDocumentation();
			case WSDL1_1Package.TEXT: return createText();
			case WSDL1_1Package.NAMESPACE: return createNamespace();
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
			case WSDL1_1Package.FORM_VALUES:
				return createformValuesFromString(eDataType, initialValue);
			case WSDL1_1Package.USES_VALUES:
				return createusesValuesFromString(eDataType, initialValue);
			case WSDL1_1Package.PROCESS_CONTENTS_VALUE:
				return createprocessContentsValueFromString(eDataType, initialValue);
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
			case WSDL1_1Package.FORM_VALUES:
				return convertformValuesToString(eDataType, instanceValue);
			case WSDL1_1Package.USES_VALUES:
				return convertusesValuesToString(eDataType, instanceValue);
			case WSDL1_1Package.PROCESS_CONTENTS_VALUE:
				return convertprocessContentsValueToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema createSchema() {
		SchemaImpl schema = new SchemaImpl();
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdicionalInformationType createAdicionalInformationType() {
		AdicionalInformationTypeImpl adicionalInformationType = new AdicionalInformationTypeImpl();
		return adicionalInformationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRef createTypeRef() {
		TypeRefImpl typeRef = new TypeRefImpl();
		return typeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Include createInclude() {
		IncludeImpl include = new IncludeImpl();
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportXMLSchema createImportXMLSchema() {
		ImportXMLSchemaImpl importXMLSchema = new ImportXMLSchemaImpl();
		return importXMLSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Redefine createRedefine() {
		RedefineImpl redefine = new RedefineImpl();
		return redefine;
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
	public ComplexType createComplexType() {
		ComplexTypeImpl complexType = new ComplexTypeImpl();
		return complexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementImported createElementImported() {
		ElementImportedImpl elementImported = new ElementImportedImpl();
		return elementImported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeGroup createAttributeGroup() {
		AttributeGroupImpl attributeGroup = new AttributeGroupImpl();
		return attributeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Notation createNotation() {
		NotationImpl notation = new NotationImpl();
		return notation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleContent createSimpleContent() {
		SimpleContentImpl simpleContent = new SimpleContentImpl();
		return simpleContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexContent createComplexContent() {
		ComplexContentImpl complexContent = new ComplexContentImpl();
		return complexContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unique createUnique() {
		UniqueImpl unique = new UniqueImpl();
		return unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Key createKey() {
		KeyImpl key = new KeyImpl();
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyRef createKeyRef() {
		KeyRefImpl keyRef = new KeyRefImpl();
		return keyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyAttribute createAnyAttribute() {
		AnyAttributeImpl anyAttribute = new AnyAttributeImpl();
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension createExtension() {
		ExtensionImpl extension = new ExtensionImpl();
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selector createSelector() {
		SelectorImpl selector = new SelectorImpl();
		return selector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppInfo createAppInfo() {
		AppInfoImpl appInfo = new AppInfoImpl();
		return appInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentationXMLSchema createDocumentationXMLSchema() {
		DocumentationXMLSchemaImpl documentationXMLSchema = new DocumentationXMLSchemaImpl();
		return documentationXMLSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Any createAny() {
		AnyImpl any = new AnyImpl();
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public All createAll() {
		AllImpl all = new AllImpl();
		return all;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choice createChoice() {
		ChoiceImpl choice = new ChoiceImpl();
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceType createSequenceType() {
		SequenceTypeImpl sequenceType = new SequenceTypeImpl();
		return sequenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleType createSimpleType() {
		SimpleTypeImpl simpleType = new SimpleTypeImpl();
		return simpleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createList() {
		ListImpl list = new ListImpl();
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Union createUnion() {
		UnionImpl union = new UnionImpl();
		return union;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Restriction createRestriction() {
		RestrictionImpl restriction = new RestrictionImpl();
		return restriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinInclusive createMinInclusive() {
		MinInclusiveImpl minInclusive = new MinInclusiveImpl();
		return minInclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinExclusive createMinExclusive() {
		MinExclusiveImpl minExclusive = new MinExclusiveImpl();
		return minExclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxInclusive createMaxInclusive() {
		MaxInclusiveImpl maxInclusive = new MaxInclusiveImpl();
		return maxInclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxExclusive createMaxExclusive() {
		MaxExclusiveImpl maxExclusive = new MaxExclusiveImpl();
		return maxExclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalDigits createTotalDigits() {
		TotalDigitsImpl totalDigits = new TotalDigitsImpl();
		return totalDigits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FractionDigits createFractionDigits() {
		FractionDigitsImpl fractionDigits = new FractionDigitsImpl();
		return fractionDigits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern createPattern() {
		PatternImpl pattern = new PatternImpl();
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhiteSpace createWhiteSpace() {
		WhiteSpaceImpl whiteSpace = new WhiteSpaceImpl();
		return whiteSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Length createLength() {
		LengthImpl length = new LengthImpl();
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxLength createMaxLength() {
		MaxLengthImpl maxLength = new MaxLengthImpl();
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinLength createMinLength() {
		MinLengthImpl minLength = new MinLengthImpl();
		return minLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WSDL1_1.Object createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingSOAP createBindingSOAP() {
		BindingSOAPImpl bindingSOAP = new BindingSOAPImpl();
		return bindingSOAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationSOAP createOperationSOAP() {
		OperationSOAPImpl operationSOAP = new OperationSOAPImpl();
		return operationSOAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodySOAP createBodySOAP() {
		BodySOAPImpl bodySOAP = new BodySOAPImpl();
		return bodySOAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderSOAP createHeaderSOAP() {
		HeaderSOAPImpl headerSOAP = new HeaderSOAPImpl();
		return headerSOAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderFaultSOAP createHeaderFaultSOAP() {
		HeaderFaultSOAPImpl headerFaultSOAP = new HeaderFaultSOAPImpl();
		return headerFaultSOAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressSOAP createAddressSOAP() {
		AddressSOAPImpl addressSOAP = new AddressSOAPImpl();
		return addressSOAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultSOAP createFaultSOAP() {
		FaultSOAPImpl faultSOAP = new FaultSOAPImpl();
		return faultSOAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressHTTP createAddressHTTP() {
		AddressHTTPImpl addressHTTP = new AddressHTTPImpl();
		return addressHTTP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationHTTP createOperationHTTP() {
		OperationHTTPImpl operationHTTP = new OperationHTTPImpl();
		return operationHTTP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URLEncoded createURLEncoded() {
		URLEncodedImpl urlEncoded = new URLEncodedImpl();
		return urlEncoded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URLReplacement createURLReplacement() {
		URLReplacementImpl urlReplacement = new URLReplacementImpl();
		return urlReplacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingHTTP createBindingHTTP() {
		BindingHTTPImpl bindingHTTP = new BindingHTTPImpl();
		return bindingHTTP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MIMEMultiPartRelated createMIMEMultiPartRelated() {
		MIMEMultiPartRelatedImpl mimeMultiPartRelated = new MIMEMultiPartRelatedImpl();
		return mimeMultiPartRelated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MIMEPart createMIMEPart() {
		MIMEPartImpl mimePart = new MIMEPartImpl();
		return mimePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MIMEContent createMIMEContent() {
		MIMEContentImpl mimeContent = new MIMEContentImpl();
		return mimeContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MIMEXml createMIMEXml() {
		MIMEXmlImpl mimeXml = new MIMEXmlImpl();
		return mimeXml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortTypeFault createPortTypeFault() {
		PortTypeFaultImpl portTypeFault = new PortTypeFaultImpl();
		return portTypeFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Definitions createDefinitions() {
		DefinitionsImpl definitions = new DefinitionsImpl();
		return definitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementType createElementType() {
		ElementTypeImpl elementType = new ElementTypeImpl();
		return elementType;
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
	public Part createPart() {
		PartImpl part = new PartImpl();
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType createPortType() {
		PortTypeImpl portType = new PortTypeImpl();
		return portType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortTypeOperation createPortTypeOperation() {
		PortTypeOperationImpl portTypeOperation = new PortTypeOperationImpl();
		return portTypeOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortTypeInput createPortTypeInput() {
		PortTypeInputImpl portTypeInput = new PortTypeInputImpl();
		return portTypeInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortTypeOutput createPortTypeOutput() {
		PortTypeOutputImpl portTypeOutput = new PortTypeOutputImpl();
		return portTypeOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding createBinding() {
		BindingImpl binding = new BindingImpl();
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingOperation createBindingOperation() {
		BindingOperationImpl bindingOperation = new BindingOperationImpl();
		return bindingOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingInput createBindingInput() {
		BindingInputImpl bindingInput = new BindingInputImpl();
		return bindingInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingOutput createBindingOutput() {
		BindingOutputImpl bindingOutput = new BindingOutputImpl();
		return bindingOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingFault createBindingFault() {
		BindingFaultImpl bindingFault = new BindingFaultImpl();
		return bindingFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documentation createDocumentation() {
		DocumentationImpl documentation = new DocumentationImpl();
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace createNamespace() {
		NamespaceImpl namespace = new NamespaceImpl();
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public formValues createformValuesFromString(EDataType eDataType, String initialValue) {
		formValues result = formValues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertformValuesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public usesValues createusesValuesFromString(EDataType eDataType, String initialValue) {
		usesValues result = usesValues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertusesValuesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public processContentsValue createprocessContentsValueFromString(EDataType eDataType, String initialValue) {
		processContentsValue result = processContentsValue.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertprocessContentsValueToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WSDL1_1Package getWSDL1_1Package() {
		return (WSDL1_1Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WSDL1_1Package getPackage() {
		return WSDL1_1Package.eINSTANCE;
	}

} //WSDL1_1FactoryImpl
