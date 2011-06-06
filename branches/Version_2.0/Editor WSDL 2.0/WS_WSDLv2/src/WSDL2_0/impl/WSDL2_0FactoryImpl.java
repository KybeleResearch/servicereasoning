/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL2_0.impl;

import WSDL2_0.AdicionalInformationType;
import WSDL2_0.All;
import WSDL2_0.Annotation;
import WSDL2_0.Any;
import WSDL2_0.AnyAttribute;
import WSDL2_0.AppInfo;
import WSDL2_0.Attribute;
import WSDL2_0.AttributeGroup;
import WSDL2_0.Binding;
import WSDL2_0.BindingFault;
import WSDL2_0.BindingInfault;
import WSDL2_0.BindingInput;
import WSDL2_0.BindingOperation;
import WSDL2_0.BindingOutfault;
import WSDL2_0.BindingOutput;
import WSDL2_0.Choice;
import WSDL2_0.ComplexContent;
import WSDL2_0.ComplexType;
import WSDL2_0.Description;
import WSDL2_0.Documentation;
import WSDL2_0.DocumentationXMLSchema;
import WSDL2_0.Element;
import WSDL2_0.ElementImported;
import WSDL2_0.ElementType;
import WSDL2_0.EndPoint;
import WSDL2_0.Enumeration;
import WSDL2_0.Extension;
import WSDL2_0.Field;
import WSDL2_0.FractionDigits;
import WSDL2_0.Group;
import WSDL2_0.Import;
import WSDL2_0.ImportXMLSchema;
import WSDL2_0.Include;
import WSDL2_0.IncludeXMLSchema;
import WSDL2_0.Interface;
import WSDL2_0.InterfaceFault;
import WSDL2_0.InterfaceInfault;
import WSDL2_0.InterfaceInput;
import WSDL2_0.InterfaceOperation;
import WSDL2_0.InterfaceOutfault;
import WSDL2_0.InterfaceOutput;
import WSDL2_0.Key;
import WSDL2_0.KeyRef;
import WSDL2_0.Length;
import WSDL2_0.List;
import WSDL2_0.MaxExclusive;
import WSDL2_0.MaxInclusive;
import WSDL2_0.MaxLength;
import WSDL2_0.MinExclusive;
import WSDL2_0.MinInclusive;
import WSDL2_0.MinLength;
import WSDL2_0.Namespace;
import WSDL2_0.Notation;
import WSDL2_0.Pattern;
import WSDL2_0.Redefine;
import WSDL2_0.Restriction;
import WSDL2_0.Schema;
import WSDL2_0.Selector;
import WSDL2_0.SequenceType;
import WSDL2_0.Service;
import WSDL2_0.SimpleContent;
import WSDL2_0.SimpleType;
import WSDL2_0.Text;
import WSDL2_0.TotalDigits;
import WSDL2_0.TypeRef;
import WSDL2_0.Union;
import WSDL2_0.Unique;
import WSDL2_0.WSDL2_0Factory;
import WSDL2_0.WSDL2_0Package;
import WSDL2_0.WhiteSpace;
import WSDL2_0.Whttp_Header;
import WSDL2_0.Wsoap_Header;
import WSDL2_0.Wsoap_Module;
import WSDL2_0.formValues;
import WSDL2_0.processContentsValue;
import WSDL2_0.usesValues;

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
public class WSDL2_0FactoryImpl extends EFactoryImpl implements WSDL2_0Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WSDL2_0Factory init() {
		try {
			WSDL2_0Factory theWSDL2_0Factory = (WSDL2_0Factory)EPackage.Registry.INSTANCE.getEFactory("http://WSDLv2"); 
			if (theWSDL2_0Factory != null) {
				return theWSDL2_0Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WSDL2_0FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WSDL2_0FactoryImpl() {
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
			case WSDL2_0Package.SCHEMA: return createSchema();
			case WSDL2_0Package.ADICIONAL_INFORMATION_TYPE: return createAdicionalInformationType();
			case WSDL2_0Package.TYPE_REF: return createTypeRef();
			case WSDL2_0Package.INCLUDE_XML_SCHEMA: return createIncludeXMLSchema();
			case WSDL2_0Package.IMPORT_XML_SCHEMA: return createImportXMLSchema();
			case WSDL2_0Package.REDEFINE: return createRedefine();
			case WSDL2_0Package.ANNOTATION: return createAnnotation();
			case WSDL2_0Package.COMPLEX_TYPE: return createComplexType();
			case WSDL2_0Package.ELEMENT: return createElement();
			case WSDL2_0Package.ELEMENT_IMPORTED: return createElementImported();
			case WSDL2_0Package.ATTRIBUTE: return createAttribute();
			case WSDL2_0Package.ATTRIBUTE_GROUP: return createAttributeGroup();
			case WSDL2_0Package.GROUP: return createGroup();
			case WSDL2_0Package.NOTATION: return createNotation();
			case WSDL2_0Package.SIMPLE_CONTENT: return createSimpleContent();
			case WSDL2_0Package.COMPLEX_CONTENT: return createComplexContent();
			case WSDL2_0Package.UNIQUE: return createUnique();
			case WSDL2_0Package.KEY: return createKey();
			case WSDL2_0Package.KEY_REF: return createKeyRef();
			case WSDL2_0Package.ANY_ATTRIBUTE: return createAnyAttribute();
			case WSDL2_0Package.EXTENSION: return createExtension();
			case WSDL2_0Package.SELECTOR: return createSelector();
			case WSDL2_0Package.FIELD: return createField();
			case WSDL2_0Package.APP_INFO: return createAppInfo();
			case WSDL2_0Package.DOCUMENTATION_XML_SCHEMA: return createDocumentationXMLSchema();
			case WSDL2_0Package.ANY: return createAny();
			case WSDL2_0Package.ALL: return createAll();
			case WSDL2_0Package.CHOICE: return createChoice();
			case WSDL2_0Package.SEQUENCE_TYPE: return createSequenceType();
			case WSDL2_0Package.SIMPLE_TYPE: return createSimpleType();
			case WSDL2_0Package.LIST: return createList();
			case WSDL2_0Package.UNION: return createUnion();
			case WSDL2_0Package.RESTRICTION: return createRestriction();
			case WSDL2_0Package.MIN_INCLUSIVE: return createMinInclusive();
			case WSDL2_0Package.MIN_EXCLUSIVE: return createMinExclusive();
			case WSDL2_0Package.MAX_INCLUSIVE: return createMaxInclusive();
			case WSDL2_0Package.MAX_EXCLUSIVE: return createMaxExclusive();
			case WSDL2_0Package.TOTAL_DIGITS: return createTotalDigits();
			case WSDL2_0Package.FRACTION_DIGITS: return createFractionDigits();
			case WSDL2_0Package.PATTERN: return createPattern();
			case WSDL2_0Package.ENUMERATION: return createEnumeration();
			case WSDL2_0Package.WHITE_SPACE: return createWhiteSpace();
			case WSDL2_0Package.LENGTH: return createLength();
			case WSDL2_0Package.MAX_LENGTH: return createMaxLength();
			case WSDL2_0Package.MIN_LENGTH: return createMinLength();
			case WSDL2_0Package.TEXT: return createText();
			case WSDL2_0Package.OBJECT: return createObject();
			case WSDL2_0Package.DESCRIPTION: return createDescription();
			case WSDL2_0Package.INTERFACE: return createInterface();
			case WSDL2_0Package.INTERFACE_FAULT: return createInterfaceFault();
			case WSDL2_0Package.INTERFACE_OPERATION: return createInterfaceOperation();
			case WSDL2_0Package.INTERFACE_INPUT: return createInterfaceInput();
			case WSDL2_0Package.INTERFACE_OUTPUT: return createInterfaceOutput();
			case WSDL2_0Package.INTERFACE_INFAULT: return createInterfaceInfault();
			case WSDL2_0Package.INTERFACE_OUTFAULT: return createInterfaceOutfault();
			case WSDL2_0Package.BINDING: return createBinding();
			case WSDL2_0Package.BINDING_FAULT: return createBindingFault();
			case WSDL2_0Package.BINDING_OPERATION: return createBindingOperation();
			case WSDL2_0Package.BINDING_INPUT: return createBindingInput();
			case WSDL2_0Package.BINDING_OUTPUT: return createBindingOutput();
			case WSDL2_0Package.BINDING_INFAULT: return createBindingInfault();
			case WSDL2_0Package.BINDING_OUTFAULT: return createBindingOutfault();
			case WSDL2_0Package.SERVICE: return createService();
			case WSDL2_0Package.END_POINT: return createEndPoint();
			case WSDL2_0Package.ELEMENT_TYPE: return createElementType();
			case WSDL2_0Package.INCLUDE: return createInclude();
			case WSDL2_0Package.IMPORT: return createImport();
			case WSDL2_0Package.DOCUMENTATION: return createDocumentation();
			case WSDL2_0Package.NAMESPACE: return createNamespace();
			case WSDL2_0Package.WSOAP_MODULE: return createWsoap_Module();
			case WSDL2_0Package.WSOAP_HEADER: return createWsoap_Header();
			case WSDL2_0Package.WHTTP_HEADER: return createWhttp_Header();
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
			case WSDL2_0Package.FORM_VALUES:
				return createformValuesFromString(eDataType, initialValue);
			case WSDL2_0Package.USES_VALUES:
				return createusesValuesFromString(eDataType, initialValue);
			case WSDL2_0Package.PROCESS_CONTENTS_VALUE:
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
			case WSDL2_0Package.FORM_VALUES:
				return convertformValuesToString(eDataType, instanceValue);
			case WSDL2_0Package.USES_VALUES:
				return convertusesValuesToString(eDataType, instanceValue);
			case WSDL2_0Package.PROCESS_CONTENTS_VALUE:
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
	public IncludeXMLSchema createIncludeXMLSchema() {
		IncludeXMLSchemaImpl includeXMLSchema = new IncludeXMLSchemaImpl();
		return includeXMLSchema;
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
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WSDL2_0.Object createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description createDescription() {
		DescriptionImpl description = new DescriptionImpl();
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceFault createInterfaceFault() {
		InterfaceFaultImpl interfaceFault = new InterfaceFaultImpl();
		return interfaceFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceOperation createInterfaceOperation() {
		InterfaceOperationImpl interfaceOperation = new InterfaceOperationImpl();
		return interfaceOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceInput createInterfaceInput() {
		InterfaceInputImpl interfaceInput = new InterfaceInputImpl();
		return interfaceInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceOutput createInterfaceOutput() {
		InterfaceOutputImpl interfaceOutput = new InterfaceOutputImpl();
		return interfaceOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceInfault createInterfaceInfault() {
		InterfaceInfaultImpl interfaceInfault = new InterfaceInfaultImpl();
		return interfaceInfault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceOutfault createInterfaceOutfault() {
		InterfaceOutfaultImpl interfaceOutfault = new InterfaceOutfaultImpl();
		return interfaceOutfault;
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
	public BindingFault createBindingFault() {
		BindingFaultImpl bindingFault = new BindingFaultImpl();
		return bindingFault;
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
	public BindingInfault createBindingInfault() {
		BindingInfaultImpl bindingInfault = new BindingInfaultImpl();
		return bindingInfault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingOutfault createBindingOutfault() {
		BindingOutfaultImpl bindingOutfault = new BindingOutfaultImpl();
		return bindingOutfault;
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
	public EndPoint createEndPoint() {
		EndPointImpl endPoint = new EndPointImpl();
		return endPoint;
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
	public Include createInclude() {
		IncludeImpl include = new IncludeImpl();
		return include;
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
	public Namespace createNamespace() {
		NamespaceImpl namespace = new NamespaceImpl();
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wsoap_Module createWsoap_Module() {
		Wsoap_ModuleImpl wsoap_Module = new Wsoap_ModuleImpl();
		return wsoap_Module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wsoap_Header createWsoap_Header() {
		Wsoap_HeaderImpl wsoap_Header = new Wsoap_HeaderImpl();
		return wsoap_Header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Whttp_Header createWhttp_Header() {
		Whttp_HeaderImpl whttp_Header = new Whttp_HeaderImpl();
		return whttp_Header;
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
	public WSDL2_0Package getWSDL2_0Package() {
		return (WSDL2_0Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WSDL2_0Package getPackage() {
		return WSDL2_0Package.eINSTANCE;
	}

} //WSDL2_0FactoryImpl
