/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL2_0.util;

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
import WSDL2_0.WSDL2_0Package;
import WSDL2_0.WhiteSpace;
import WSDL2_0.Whttp_Header;
import WSDL2_0.Wsoap_Header;
import WSDL2_0.Wsoap_Module;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see WSDL2_0.WSDL2_0Package
 * @generated
 */
public class WSDL2_0AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WSDL2_0Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WSDL2_0AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WSDL2_0Package.eINSTANCE;
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
	protected WSDL2_0Switch<Adapter> modelSwitch =
		new WSDL2_0Switch<Adapter>() {
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
			public Adapter caseIncludeXMLSchema(IncludeXMLSchema object) {
				return createIncludeXMLSchemaAdapter();
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
			public Adapter caseText(Text object) {
				return createTextAdapter();
			}
			@Override
			public Adapter caseObject(WSDL2_0.Object object) {
				return createObjectAdapter();
			}
			@Override
			public Adapter caseDescription(Description object) {
				return createDescriptionAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseInterfaceFault(InterfaceFault object) {
				return createInterfaceFaultAdapter();
			}
			@Override
			public Adapter caseInterfaceOperation(InterfaceOperation object) {
				return createInterfaceOperationAdapter();
			}
			@Override
			public Adapter caseInterfaceInput(InterfaceInput object) {
				return createInterfaceInputAdapter();
			}
			@Override
			public Adapter caseInterfaceOutput(InterfaceOutput object) {
				return createInterfaceOutputAdapter();
			}
			@Override
			public Adapter caseInterfaceInfault(InterfaceInfault object) {
				return createInterfaceInfaultAdapter();
			}
			@Override
			public Adapter caseInterfaceOutfault(InterfaceOutfault object) {
				return createInterfaceOutfaultAdapter();
			}
			@Override
			public Adapter caseBinding(Binding object) {
				return createBindingAdapter();
			}
			@Override
			public Adapter caseBindingFault(BindingFault object) {
				return createBindingFaultAdapter();
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
			public Adapter caseBindingInfault(BindingInfault object) {
				return createBindingInfaultAdapter();
			}
			@Override
			public Adapter caseBindingOutfault(BindingOutfault object) {
				return createBindingOutfaultAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseEndPoint(EndPoint object) {
				return createEndPointAdapter();
			}
			@Override
			public Adapter caseElementType(ElementType object) {
				return createElementTypeAdapter();
			}
			@Override
			public Adapter caseInclude(Include object) {
				return createIncludeAdapter();
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
			public Adapter caseNamespace(Namespace object) {
				return createNamespaceAdapter();
			}
			@Override
			public Adapter caseWsoap_Module(Wsoap_Module object) {
				return createWsoap_ModuleAdapter();
			}
			@Override
			public Adapter caseWsoap_Header(Wsoap_Header object) {
				return createWsoap_HeaderAdapter();
			}
			@Override
			public Adapter caseWhttp_Header(Whttp_Header object) {
				return createWhttp_HeaderAdapter();
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
	 * Creates a new adapter for an object of class '{@link WSDL2_0.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.Schema
	 * @generated
	 */
	public Adapter createSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.AdicionalInformationType <em>Adicional Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.AdicionalInformationType
	 * @generated
	 */
	public Adapter createAdicionalInformationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.TypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.TypeRef
	 * @generated
	 */
	public Adapter createTypeRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.IncludeXMLSchema <em>Include XML Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.IncludeXMLSchema
	 * @generated
	 */
	public Adapter createIncludeXMLSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.ImportXMLSchema <em>Import XML Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.ImportXMLSchema
	 * @generated
	 */
	public Adapter createImportXMLSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.Redefine <em>Redefine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.Redefine
	 * @generated
	 */
	public Adapter createRedefineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.ComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.ComplexType
	 * @generated
	 */
	public Adapter createComplexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.ElementImported <em>Element Imported</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.ElementImported
	 * @generated
	 */
	public Adapter createElementImportedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.AttributeGroup <em>Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.AttributeGroup
	 * @generated
	 */
	public Adapter createAttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.Group
	 * @generated
	 */
	public Adapter createGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.Notation <em>Notation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.Notation
	 * @generated
	 */
	public Adapter createNotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.SimpleContent <em>Simple Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.SimpleContent
	 * @generated
	 */
	public Adapter createSimpleContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.ComplexContent <em>Complex Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.ComplexContent
	 * @generated
	 */
	public Adapter createComplexContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.Unique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.Unique
	 * @generated
	 */
	public Adapter createUniqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.Key <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.Key
	 * @generated
	 */
	public Adapter createKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.KeyRef <em>Key Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.KeyRef
	 * @generated
	 */
	public Adapter createKeyRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.AnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.AnyAttribute
	 * @generated
	 */
	public Adapter createAnyAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.Extension
	 * @generated
	 */
	public Adapter createExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.Selector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.Selector
	 * @generated
	 */
	public Adapter createSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.AppInfo <em>App Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.AppInfo
	 * @generated
	 */
	public Adapter createAppInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.DocumentationXMLSchema <em>Documentation XML Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.DocumentationXMLSchema
	 * @generated
	 */
	public Adapter createDocumentationXMLSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.Any <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.Any
	 * @generated
	 */
	public Adapter createAnyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.All <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.All
	 * @generated
	 */
	public Adapter createAllAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.Choice
	 * @generated
	 */
	public Adapter createChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.SequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.SequenceType
	 * @generated
	 */
	public Adapter createSequenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.SimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.SimpleType
	 * @generated
	 */
	public Adapter createSimpleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.List
	 * @generated
	 */
	public Adapter createListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.Union <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.Union
	 * @generated
	 */
	public Adapter createUnionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.Restriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.Restriction
	 * @generated
	 */
	public Adapter createRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.MinInclusive <em>Min Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.MinInclusive
	 * @generated
	 */
	public Adapter createMinInclusiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.MinExclusive <em>Min Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.MinExclusive
	 * @generated
	 */
	public Adapter createMinExclusiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.MaxInclusive <em>Max Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.MaxInclusive
	 * @generated
	 */
	public Adapter createMaxInclusiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.MaxExclusive <em>Max Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.MaxExclusive
	 * @generated
	 */
	public Adapter createMaxExclusiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.TotalDigits <em>Total Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.TotalDigits
	 * @generated
	 */
	public Adapter createTotalDigitsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.FractionDigits <em>Fraction Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.FractionDigits
	 * @generated
	 */
	public Adapter createFractionDigitsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.Pattern
	 * @generated
	 */
	public Adapter createPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.Enumeration
	 * @generated
	 */
	public Adapter createEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.WhiteSpace <em>White Space</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.WhiteSpace
	 * @generated
	 */
	public Adapter createWhiteSpaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.Length <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.Length
	 * @generated
	 */
	public Adapter createLengthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.MaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.MaxLength
	 * @generated
	 */
	public Adapter createMaxLengthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.MinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.MinLength
	 * @generated
	 */
	public Adapter createMinLengthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.Text
	 * @generated
	 */
	public Adapter createTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.Description
	 * @generated
	 */
	public Adapter createDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.InterfaceFault <em>Interface Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.InterfaceFault
	 * @generated
	 */
	public Adapter createInterfaceFaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.InterfaceOperation <em>Interface Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.InterfaceOperation
	 * @generated
	 */
	public Adapter createInterfaceOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.InterfaceInput <em>Interface Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.InterfaceInput
	 * @generated
	 */
	public Adapter createInterfaceInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.InterfaceOutput <em>Interface Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.InterfaceOutput
	 * @generated
	 */
	public Adapter createInterfaceOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.InterfaceInfault <em>Interface Infault</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.InterfaceInfault
	 * @generated
	 */
	public Adapter createInterfaceInfaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.InterfaceOutfault <em>Interface Outfault</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.InterfaceOutfault
	 * @generated
	 */
	public Adapter createInterfaceOutfaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.Binding
	 * @generated
	 */
	public Adapter createBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.BindingFault <em>Binding Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.BindingFault
	 * @generated
	 */
	public Adapter createBindingFaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.BindingOperation <em>Binding Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.BindingOperation
	 * @generated
	 */
	public Adapter createBindingOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.BindingInput <em>Binding Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.BindingInput
	 * @generated
	 */
	public Adapter createBindingInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.BindingOutput <em>Binding Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.BindingOutput
	 * @generated
	 */
	public Adapter createBindingOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.BindingInfault <em>Binding Infault</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.BindingInfault
	 * @generated
	 */
	public Adapter createBindingInfaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.BindingOutfault <em>Binding Outfault</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.BindingOutfault
	 * @generated
	 */
	public Adapter createBindingOutfaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.EndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.EndPoint
	 * @generated
	 */
	public Adapter createEndPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.ElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.ElementType
	 * @generated
	 */
	public Adapter createElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.Include <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.Include
	 * @generated
	 */
	public Adapter createIncludeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.Import
	 * @generated
	 */
	public Adapter createImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.Documentation
	 * @generated
	 */
	public Adapter createDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.Namespace
	 * @generated
	 */
	public Adapter createNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.Wsoap_Module <em>Wsoap Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.Wsoap_Module
	 * @generated
	 */
	public Adapter createWsoap_ModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.Wsoap_Header <em>Wsoap Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.Wsoap_Header
	 * @generated
	 */
	public Adapter createWsoap_HeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link WSDL2_0.Whttp_Header <em>Whttp Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see WSDL2_0.Whttp_Header
	 * @generated
	 */
	public Adapter createWhttp_HeaderAdapter() {
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

} //WSDL2_0AdapterFactory
