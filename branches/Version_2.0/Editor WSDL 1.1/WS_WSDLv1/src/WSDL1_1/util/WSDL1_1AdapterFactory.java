/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL1_1.util;

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
import WSDL1_1.WSDL1_1Package;
import WSDL1_1.WhiteSpace;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see WSDL1_1.WSDL1_1Package
 * @generated
 */
public class WSDL1_1AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WSDL1_1Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WSDL1_1AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WSDL1_1Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WSDL1_1Switch<Adapter> modelSwitch =
		new WSDL1_1Switch<Adapter>() {
			@Override
			public Adapter caseSchema(Schema object) {
				return createSchemaAdapter();
			}
			@Override
			public Adapter caseAdicionalInformationType(AdicionalInformationType object) {
				return createAdicionalInformationTypeAdapter();
			}
			@Override
			public Adapter caseTypeRef(TypeRef object) {
				return createTypeRefAdapter();
			}
			@Override
			public Adapter caseInclude(Include object) {
				return createIncludeAdapter();
			}
			@Override
			public Adapter caseImportXMLSchema(ImportXMLSchema object) {
				return createImportXMLSchemaAdapter();
			}
			@Override
			public Adapter caseRedefine(Redefine object) {
				return createRedefineAdapter();
			}
			@Override
			public Adapter caseAnnotation(Annotation object) {
				return createAnnotationAdapter();
			}
			@Override
			public Adapter caseComplexType(ComplexType object) {
				return createComplexTypeAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseElementImported(ElementImported object) {
				return createElementImportedAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseAttributeGroup(AttributeGroup object) {
				return createAttributeGroupAdapter();
			}
			@Override
			public Adapter caseGroup(Group object) {
				return createGroupAdapter();
			}
			@Override
			public Adapter caseNotation(Notation object) {
				return createNotationAdapter();
			}
			@Override
			public Adapter caseSimpleContent(SimpleContent object) {
				return createSimpleContentAdapter();
			}
			@Override
			public Adapter caseComplexContent(ComplexContent object) {
				return createComplexContentAdapter();
			}
			@Override
			public Adapter caseUnique(Unique object) {
				return createUniqueAdapter();
			}
			@Override
			public Adapter caseKey(Key object) {
				return createKeyAdapter();
			}
			@Override
			public Adapter caseKeyRef(KeyRef object) {
				return createKeyRefAdapter();
			}
			@Override
			public Adapter caseAnyAttribute(AnyAttribute object) {
				return createAnyAttributeAdapter();
			}
			@Override
			public Adapter caseExtension(Extension object) {
				return createExtensionAdapter();
			}
			@Override
			public Adapter caseSelector(Selector object) {
				return createSelectorAdapter();
			}
			@Override
			public Adapter caseField(Field object) {
				return createFieldAdapter();
			}
			@Override
			public Adapter caseAppInfo(AppInfo object) {
				return createAppInfoAdapter();
			}
			@Override
			public Adapter caseDocumentationXMLSchema(DocumentationXMLSchema object) {
				return createDocumentationXMLSchemaAdapter();
			}
			@Override
			public Adapter caseAny(Any object) {
				return createAnyAdapter();
			}
			@Override
			public Adapter caseAll(All object) {
				return createAllAdapter();
			}
			@Override
			public Adapter caseChoice(Choice object) {
				return createChoiceAdapter();
			}
			@Override
			public Adapter caseSequenceType(SequenceType object) {
				return createSequenceTypeAdapter();
			}
			@Override
			public Adapter caseSimpleType(SimpleType object) {
				return createSimpleTypeAdapter();
			}
			@Override
			public Adapter caseList(List object) {
				return createListAdapter();
			}
			@Override
			public Adapter caseUnion(Union object) {
				return createUnionAdapter();
			}
			@Override
			public Adapter caseRestriction(Restriction object) {
				return createRestrictionAdapter();
			}
			@Override
			public Adapter caseMinInclusive(MinInclusive object) {
				return createMinInclusiveAdapter();
			}
			@Override
			public Adapter caseMinExclusive(MinExclusive object) {
				return createMinExclusiveAdapter();
			}
			@Override
			public Adapter caseMaxInclusive(MaxInclusive object) {
				return createMaxInclusiveAdapter();
			}
			@Override
			public Adapter caseMaxExclusive(MaxExclusive object) {
				return createMaxExclusiveAdapter();
			}
			@Override
			public Adapter caseTotalDigits(TotalDigits object) {
				return createTotalDigitsAdapter();
			}
			@Override
			public Adapter caseFractionDigits(FractionDigits object) {
				return createFractionDigitsAdapter();
			}
			@Override
			public Adapter casePattern(Pattern object) {
				return createPatternAdapter();
			}
			@Override
			public Adapter caseEnumeration(Enumeration object) {
				return createEnumerationAdapter();
			}
			@Override
			public Adapter caseWhiteSpace(WhiteSpace object) {
				return createWhiteSpaceAdapter();
			}
			@Override
			public Adapter caseLength(Length object) {
				return createLengthAdapter();
			}
			@Override
			public Adapter caseMaxLength(MaxLength object) {
				return createMaxLengthAdapter();
			}
			@Override
			public Adapter caseMinLength(MinLength object) {
				return createMinLengthAdapter();
			}
			@Override
			public Adapter caseObject(WSDL1_1.Object object) {
				return createObjectAdapter();
			}
			@Override
			public Adapter caseBindingSOAP(BindingSOAP object) {
				return createBindingSOAPAdapter();
			}
			@Override
			public Adapter caseOperationSOAP(OperationSOAP object) {
				return createOperationSOAPAdapter();
			}
			@Override
			public Adapter caseBodySOAP(BodySOAP object) {
				return createBodySOAPAdapter();
			}
			@Override
			public Adapter caseHeaderSOAP(HeaderSOAP object) {
				return createHeaderSOAPAdapter();
			}
			@Override
			public Adapter caseHeaderFaultSOAP(HeaderFaultSOAP object) {
				return createHeaderFaultSOAPAdapter();
			}
			@Override
			public Adapter caseAddressSOAP(AddressSOAP object) {
				return createAddressSOAPAdapter();
			}
			@Override
			public Adapter caseFaultSOAP(FaultSOAP object) {
				return createFaultSOAPAdapter();
			}
			@Override
			public Adapter caseAddressHTTP(AddressHTTP object) {
				return createAddressHTTPAdapter();
			}
			@Override
			public Adapter caseOperationHTTP(OperationHTTP object) {
				return createOperationHTTPAdapter();
			}
			@Override
			public Adapter caseURLEncoded(URLEncoded object) {
				return createURLEncodedAdapter();
			}
			@Override
			public Adapter caseURLReplacement(URLReplacement object) {
				return createURLReplacementAdapter();
			}
			@Override
			public Adapter caseBindingHTTP(BindingHTTP object) {
				return createBindingHTTPAdapter();
			}
			@Override
			public Adapter caseMIMEMultiPartRelated(MIMEMultiPartRelated object) {
				return createMIMEMultiPartRelatedAdapter();
			}
			@Override
			public Adapter caseMIMEPart(MIMEPart object) {
				return createMIMEPartAdapter();
			}
			@Override
			public Adapter caseMIMEContent(MIMEContent object) {
				return createMIMEContentAdapter();
			}
			@Override
			public Adapter caseMIMEXml(MIMEXml object) {
				return createMIMEXmlAdapter();
			}
			@Override
			public Adapter casePortTypeFault(PortTypeFault object) {
				return createPortTypeFaultAdapter();
			}
			@Override
			public Adapter caseDefinitions(Definitions object) {
				return createDefinitionsAdapter();
			}
			@Override
			public Adapter caseElementType(ElementType object) {
				return createElementTypeAdapter();
			}
			@Override
			public Adapter caseMessage(Message object) {
				return createMessageAdapter();
			}
			@Override
			public Adapter casePart(Part object) {
				return createPartAdapter();
			}
			@Override
			public Adapter casePortType(PortType object) {
				return createPortTypeAdapter();
			}
			@Override
			public Adapter casePortTypeOperation(PortTypeOperation object) {
				return createPortTypeOperationAdapter();
			}
			@Override
			public Adapter casePortTypeInput(PortTypeInput object) {
				return createPortTypeInputAdapter();
			}
			@Override
			public Adapter casePortTypeOutput(PortTypeOutput object) {
				return createPortTypeOutputAdapter();
			}
			@Override
			public Adapter caseBinding(Binding object) {
				return createBindingAdapter();
			}
			@Override
			public Adapter caseBindingOperation(BindingOperation object) {
				return createBindingOperationAdapter();
			}
			@Override
			public Adapter caseBindingInput(BindingInput object) {
				return createBindingInputAdapter();
			}
			@Override
			public Adapter caseBindingOutput(BindingOutput object) {
				return createBindingOutputAdapter();
			}
			@Override
			public Adapter caseBindingFault(BindingFault object) {
				return createBindingFaultAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseImport(Import object) {
				return createImportAdapter();
			}
			@Override
			public Adapter caseDocumentation(Documentation object) {
				return createDocumentationAdapter();
			}
			@Override
			public Adapter caseText(Text object) {
				return createTextAdapter();
			}
			@Override
			public Adapter caseNamespace(Namespace object) {
				return createNamespaceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.Schema
	 * @generated
	 */
	public Adapter createSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.AdicionalInformationType <em>Adicional Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.AdicionalInformationType
	 * @generated
	 */
	public Adapter createAdicionalInformationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.TypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.TypeRef
	 * @generated
	 */
	public Adapter createTypeRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.Include <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.Include
	 * @generated
	 */
	public Adapter createIncludeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.ImportXMLSchema <em>Import XML Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.ImportXMLSchema
	 * @generated
	 */
	public Adapter createImportXMLSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.Redefine <em>Redefine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.Redefine
	 * @generated
	 */
	public Adapter createRedefineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.ComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.ComplexType
	 * @generated
	 */
	public Adapter createComplexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.ElementImported <em>Element Imported</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.ElementImported
	 * @generated
	 */
	public Adapter createElementImportedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.AttributeGroup <em>Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.AttributeGroup
	 * @generated
	 */
	public Adapter createAttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.Group
	 * @generated
	 */
	public Adapter createGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.Notation <em>Notation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.Notation
	 * @generated
	 */
	public Adapter createNotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.SimpleContent <em>Simple Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.SimpleContent
	 * @generated
	 */
	public Adapter createSimpleContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.ComplexContent <em>Complex Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.ComplexContent
	 * @generated
	 */
	public Adapter createComplexContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.Unique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.Unique
	 * @generated
	 */
	public Adapter createUniqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.Key <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.Key
	 * @generated
	 */
	public Adapter createKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.KeyRef <em>Key Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.KeyRef
	 * @generated
	 */
	public Adapter createKeyRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.AnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.AnyAttribute
	 * @generated
	 */
	public Adapter createAnyAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.Extension
	 * @generated
	 */
	public Adapter createExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.Selector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.Selector
	 * @generated
	 */
	public Adapter createSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.AppInfo <em>App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.AppInfo
	 * @generated
	 */
	public Adapter createAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.DocumentationXMLSchema <em>Documentation XML Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.DocumentationXMLSchema
	 * @generated
	 */
	public Adapter createDocumentationXMLSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.Any <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.Any
	 * @generated
	 */
	public Adapter createAnyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.All <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.All
	 * @generated
	 */
	public Adapter createAllAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.Choice
	 * @generated
	 */
	public Adapter createChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.SequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.SequenceType
	 * @generated
	 */
	public Adapter createSequenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.SimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.SimpleType
	 * @generated
	 */
	public Adapter createSimpleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.List
	 * @generated
	 */
	public Adapter createListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.Union <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.Union
	 * @generated
	 */
	public Adapter createUnionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.Restriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.Restriction
	 * @generated
	 */
	public Adapter createRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.MinInclusive <em>Min Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.MinInclusive
	 * @generated
	 */
	public Adapter createMinInclusiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.MinExclusive <em>Min Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.MinExclusive
	 * @generated
	 */
	public Adapter createMinExclusiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.MaxInclusive <em>Max Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.MaxInclusive
	 * @generated
	 */
	public Adapter createMaxInclusiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.MaxExclusive <em>Max Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.MaxExclusive
	 * @generated
	 */
	public Adapter createMaxExclusiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.TotalDigits <em>Total Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.TotalDigits
	 * @generated
	 */
	public Adapter createTotalDigitsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.FractionDigits <em>Fraction Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.FractionDigits
	 * @generated
	 */
	public Adapter createFractionDigitsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.Pattern
	 * @generated
	 */
	public Adapter createPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.Enumeration
	 * @generated
	 */
	public Adapter createEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.WhiteSpace <em>White Space</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.WhiteSpace
	 * @generated
	 */
	public Adapter createWhiteSpaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.Length <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.Length
	 * @generated
	 */
	public Adapter createLengthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.MaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.MaxLength
	 * @generated
	 */
	public Adapter createMaxLengthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.MinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.MinLength
	 * @generated
	 */
	public Adapter createMinLengthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.BindingSOAP <em>Binding SOAP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.BindingSOAP
	 * @generated
	 */
	public Adapter createBindingSOAPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.OperationSOAP <em>Operation SOAP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.OperationSOAP
	 * @generated
	 */
	public Adapter createOperationSOAPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.BodySOAP <em>Body SOAP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.BodySOAP
	 * @generated
	 */
	public Adapter createBodySOAPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.HeaderSOAP <em>Header SOAP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.HeaderSOAP
	 * @generated
	 */
	public Adapter createHeaderSOAPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.HeaderFaultSOAP <em>Header Fault SOAP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.HeaderFaultSOAP
	 * @generated
	 */
	public Adapter createHeaderFaultSOAPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.AddressSOAP <em>Address SOAP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.AddressSOAP
	 * @generated
	 */
	public Adapter createAddressSOAPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.FaultSOAP <em>Fault SOAP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.FaultSOAP
	 * @generated
	 */
	public Adapter createFaultSOAPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.AddressHTTP <em>Address HTTP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.AddressHTTP
	 * @generated
	 */
	public Adapter createAddressHTTPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.OperationHTTP <em>Operation HTTP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.OperationHTTP
	 * @generated
	 */
	public Adapter createOperationHTTPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.URLEncoded <em>URL Encoded</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.URLEncoded
	 * @generated
	 */
	public Adapter createURLEncodedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.URLReplacement <em>URL Replacement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.URLReplacement
	 * @generated
	 */
	public Adapter createURLReplacementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.BindingHTTP <em>Binding HTTP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.BindingHTTP
	 * @generated
	 */
	public Adapter createBindingHTTPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.MIMEMultiPartRelated <em>MIME Multi Part Related</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.MIMEMultiPartRelated
	 * @generated
	 */
	public Adapter createMIMEMultiPartRelatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.MIMEPart <em>MIME Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.MIMEPart
	 * @generated
	 */
	public Adapter createMIMEPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.MIMEContent <em>MIME Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.MIMEContent
	 * @generated
	 */
	public Adapter createMIMEContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.MIMEXml <em>MIME Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.MIMEXml
	 * @generated
	 */
	public Adapter createMIMEXmlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.PortTypeFault <em>Port Type Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.PortTypeFault
	 * @generated
	 */
	public Adapter createPortTypeFaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.Definitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.Definitions
	 * @generated
	 */
	public Adapter createDefinitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.ElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.ElementType
	 * @generated
	 */
	public Adapter createElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.Part
	 * @generated
	 */
	public Adapter createPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.PortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.PortType
	 * @generated
	 */
	public Adapter createPortTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.PortTypeOperation <em>Port Type Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.PortTypeOperation
	 * @generated
	 */
	public Adapter createPortTypeOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.PortTypeInput <em>Port Type Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.PortTypeInput
	 * @generated
	 */
	public Adapter createPortTypeInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.PortTypeOutput <em>Port Type Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.PortTypeOutput
	 * @generated
	 */
	public Adapter createPortTypeOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.Binding
	 * @generated
	 */
	public Adapter createBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.BindingOperation <em>Binding Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.BindingOperation
	 * @generated
	 */
	public Adapter createBindingOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.BindingInput <em>Binding Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.BindingInput
	 * @generated
	 */
	public Adapter createBindingInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.BindingOutput <em>Binding Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.BindingOutput
	 * @generated
	 */
	public Adapter createBindingOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.BindingFault <em>Binding Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.BindingFault
	 * @generated
	 */
	public Adapter createBindingFaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.Import
	 * @generated
	 */
	public Adapter createImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.Documentation
	 * @generated
	 */
	public Adapter createDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.Text
	 * @generated
	 */
	public Adapter createTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL1_1.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL1_1.Namespace
	 * @generated
	 */
	public Adapter createNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //WSDL1_1AdapterFactory
