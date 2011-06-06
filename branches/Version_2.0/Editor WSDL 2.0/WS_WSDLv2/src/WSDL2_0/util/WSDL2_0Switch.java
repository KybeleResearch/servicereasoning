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

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see WSDL2_0.WSDL2_0Package
 * @generated
 */
public class WSDL2_0Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WSDL2_0Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WSDL2_0Switch() {
		if (modelPackage == null) {
			modelPackage = WSDL2_0Package.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case WSDL2_0Package.SCHEMA: {
				Schema schema = (Schema)theEObject;
				T result = caseSchema(schema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.ADICIONAL_INFORMATION_TYPE: {
				AdicionalInformationType adicionalInformationType = (AdicionalInformationType)theEObject;
				T result = caseAdicionalInformationType(adicionalInformationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.TYPE_REF: {
				TypeRef typeRef = (TypeRef)theEObject;
				T result = caseTypeRef(typeRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.INCLUDE_XML_SCHEMA: {
				IncludeXMLSchema includeXMLSchema = (IncludeXMLSchema)theEObject;
				T result = caseIncludeXMLSchema(includeXMLSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.IMPORT_XML_SCHEMA: {
				ImportXMLSchema importXMLSchema = (ImportXMLSchema)theEObject;
				T result = caseImportXMLSchema(importXMLSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.REDEFINE: {
				Redefine redefine = (Redefine)theEObject;
				T result = caseRedefine(redefine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.COMPLEX_TYPE: {
				ComplexType complexType = (ComplexType)theEObject;
				T result = caseComplexType(complexType);
				if (result == null) result = caseTypeRef(complexType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = caseAdicionalInformationType(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.ELEMENT_IMPORTED: {
				ElementImported elementImported = (ElementImported)theEObject;
				T result = caseElementImported(elementImported);
				if (result == null) result = caseElement(elementImported);
				if (result == null) result = caseAdicionalInformationType(elementImported);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = caseAdicionalInformationType(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.ATTRIBUTE_GROUP: {
				AttributeGroup attributeGroup = (AttributeGroup)theEObject;
				T result = caseAttributeGroup(attributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.GROUP: {
				Group group = (Group)theEObject;
				T result = caseGroup(group);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.NOTATION: {
				Notation notation = (Notation)theEObject;
				T result = caseNotation(notation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.SIMPLE_CONTENT: {
				SimpleContent simpleContent = (SimpleContent)theEObject;
				T result = caseSimpleContent(simpleContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.COMPLEX_CONTENT: {
				ComplexContent complexContent = (ComplexContent)theEObject;
				T result = caseComplexContent(complexContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.UNIQUE: {
				Unique unique = (Unique)theEObject;
				T result = caseUnique(unique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.KEY: {
				Key key = (Key)theEObject;
				T result = caseKey(key);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.KEY_REF: {
				KeyRef keyRef = (KeyRef)theEObject;
				T result = caseKeyRef(keyRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.ANY_ATTRIBUTE: {
				AnyAttribute anyAttribute = (AnyAttribute)theEObject;
				T result = caseAnyAttribute(anyAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.EXTENSION: {
				Extension extension = (Extension)theEObject;
				T result = caseExtension(extension);
				if (result == null) result = caseAdicionalInformationType(extension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.SELECTOR: {
				Selector selector = (Selector)theEObject;
				T result = caseSelector(selector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.FIELD: {
				Field field = (Field)theEObject;
				T result = caseField(field);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.APP_INFO: {
				AppInfo appInfo = (AppInfo)theEObject;
				T result = caseAppInfo(appInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.DOCUMENTATION_XML_SCHEMA: {
				DocumentationXMLSchema documentationXMLSchema = (DocumentationXMLSchema)theEObject;
				T result = caseDocumentationXMLSchema(documentationXMLSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.ANY: {
				Any any = (Any)theEObject;
				T result = caseAny(any);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.ALL: {
				All all = (All)theEObject;
				T result = caseAll(all);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.CHOICE: {
				Choice choice = (Choice)theEObject;
				T result = caseChoice(choice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.SEQUENCE_TYPE: {
				SequenceType sequenceType = (SequenceType)theEObject;
				T result = caseSequenceType(sequenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.SIMPLE_TYPE: {
				SimpleType simpleType = (SimpleType)theEObject;
				T result = caseSimpleType(simpleType);
				if (result == null) result = caseTypeRef(simpleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.LIST: {
				WSDL2_0.List list = (WSDL2_0.List)theEObject;
				T result = caseList(list);
				if (result == null) result = caseAdicionalInformationType(list);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.UNION: {
				Union union = (Union)theEObject;
				T result = caseUnion(union);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.RESTRICTION: {
				Restriction restriction = (Restriction)theEObject;
				T result = caseRestriction(restriction);
				if (result == null) result = caseAdicionalInformationType(restriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.MIN_INCLUSIVE: {
				MinInclusive minInclusive = (MinInclusive)theEObject;
				T result = caseMinInclusive(minInclusive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.MIN_EXCLUSIVE: {
				MinExclusive minExclusive = (MinExclusive)theEObject;
				T result = caseMinExclusive(minExclusive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.MAX_INCLUSIVE: {
				MaxInclusive maxInclusive = (MaxInclusive)theEObject;
				T result = caseMaxInclusive(maxInclusive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.MAX_EXCLUSIVE: {
				MaxExclusive maxExclusive = (MaxExclusive)theEObject;
				T result = caseMaxExclusive(maxExclusive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.TOTAL_DIGITS: {
				TotalDigits totalDigits = (TotalDigits)theEObject;
				T result = caseTotalDigits(totalDigits);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.FRACTION_DIGITS: {
				FractionDigits fractionDigits = (FractionDigits)theEObject;
				T result = caseFractionDigits(fractionDigits);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.PATTERN: {
				Pattern pattern = (Pattern)theEObject;
				T result = casePattern(pattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.ENUMERATION: {
				Enumeration enumeration = (Enumeration)theEObject;
				T result = caseEnumeration(enumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.WHITE_SPACE: {
				WhiteSpace whiteSpace = (WhiteSpace)theEObject;
				T result = caseWhiteSpace(whiteSpace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.LENGTH: {
				Length length = (Length)theEObject;
				T result = caseLength(length);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.MAX_LENGTH: {
				MaxLength maxLength = (MaxLength)theEObject;
				T result = caseMaxLength(maxLength);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.MIN_LENGTH: {
				MinLength minLength = (MinLength)theEObject;
				T result = caseMinLength(minLength);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.TEXT: {
				Text text = (Text)theEObject;
				T result = caseText(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.OBJECT: {
				WSDL2_0.Object object = (WSDL2_0.Object)theEObject;
				T result = caseObject(object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.DESCRIPTION: {
				Description description = (Description)theEObject;
				T result = caseDescription(description);
				if (result == null) result = caseObject(description);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.INTERFACE: {
				Interface interface_ = (Interface)theEObject;
				T result = caseInterface(interface_);
				if (result == null) result = caseObject(interface_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.INTERFACE_FAULT: {
				InterfaceFault interfaceFault = (InterfaceFault)theEObject;
				T result = caseInterfaceFault(interfaceFault);
				if (result == null) result = caseObject(interfaceFault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.INTERFACE_OPERATION: {
				InterfaceOperation interfaceOperation = (InterfaceOperation)theEObject;
				T result = caseInterfaceOperation(interfaceOperation);
				if (result == null) result = caseObject(interfaceOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.INTERFACE_INPUT: {
				InterfaceInput interfaceInput = (InterfaceInput)theEObject;
				T result = caseInterfaceInput(interfaceInput);
				if (result == null) result = caseObject(interfaceInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.INTERFACE_OUTPUT: {
				InterfaceOutput interfaceOutput = (InterfaceOutput)theEObject;
				T result = caseInterfaceOutput(interfaceOutput);
				if (result == null) result = caseObject(interfaceOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.INTERFACE_INFAULT: {
				InterfaceInfault interfaceInfault = (InterfaceInfault)theEObject;
				T result = caseInterfaceInfault(interfaceInfault);
				if (result == null) result = caseObject(interfaceInfault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.INTERFACE_OUTFAULT: {
				InterfaceOutfault interfaceOutfault = (InterfaceOutfault)theEObject;
				T result = caseInterfaceOutfault(interfaceOutfault);
				if (result == null) result = caseObject(interfaceOutfault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.BINDING: {
				Binding binding = (Binding)theEObject;
				T result = caseBinding(binding);
				if (result == null) result = caseObject(binding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.BINDING_FAULT: {
				BindingFault bindingFault = (BindingFault)theEObject;
				T result = caseBindingFault(bindingFault);
				if (result == null) result = caseObject(bindingFault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.BINDING_OPERATION: {
				BindingOperation bindingOperation = (BindingOperation)theEObject;
				T result = caseBindingOperation(bindingOperation);
				if (result == null) result = caseObject(bindingOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.BINDING_INPUT: {
				BindingInput bindingInput = (BindingInput)theEObject;
				T result = caseBindingInput(bindingInput);
				if (result == null) result = caseObject(bindingInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.BINDING_OUTPUT: {
				BindingOutput bindingOutput = (BindingOutput)theEObject;
				T result = caseBindingOutput(bindingOutput);
				if (result == null) result = caseObject(bindingOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.BINDING_INFAULT: {
				BindingInfault bindingInfault = (BindingInfault)theEObject;
				T result = caseBindingInfault(bindingInfault);
				if (result == null) result = caseObject(bindingInfault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.BINDING_OUTFAULT: {
				BindingOutfault bindingOutfault = (BindingOutfault)theEObject;
				T result = caseBindingOutfault(bindingOutfault);
				if (result == null) result = caseObject(bindingOutfault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = caseObject(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.END_POINT: {
				EndPoint endPoint = (EndPoint)theEObject;
				T result = caseEndPoint(endPoint);
				if (result == null) result = caseObject(endPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.ELEMENT_TYPE: {
				ElementType elementType = (ElementType)theEObject;
				T result = caseElementType(elementType);
				if (result == null) result = caseObject(elementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.INCLUDE: {
				Include include = (Include)theEObject;
				T result = caseInclude(include);
				if (result == null) result = caseObject(include);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.IMPORT: {
				Import import_ = (Import)theEObject;
				T result = caseImport(import_);
				if (result == null) result = caseObject(import_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.DOCUMENTATION: {
				Documentation documentation = (Documentation)theEObject;
				T result = caseDocumentation(documentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.NAMESPACE: {
				Namespace namespace = (Namespace)theEObject;
				T result = caseNamespace(namespace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.WSOAP_MODULE: {
				Wsoap_Module wsoap_Module = (Wsoap_Module)theEObject;
				T result = caseWsoap_Module(wsoap_Module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.WSOAP_HEADER: {
				Wsoap_Header wsoap_Header = (Wsoap_Header)theEObject;
				T result = caseWsoap_Header(wsoap_Header);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL2_0Package.WHTTP_HEADER: {
				Whttp_Header whttp_Header = (Whttp_Header)theEObject;
				T result = caseWhttp_Header(whttp_Header);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchema(Schema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adicional Information Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adicional Information Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdicionalInformationType(AdicionalInformationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeRef(TypeRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Include XML Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Include XML Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncludeXMLSchema(IncludeXMLSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import XML Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import XML Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportXMLSchema(ImportXMLSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Redefine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Redefine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedefine(Redefine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexType(ComplexType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Imported</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Imported</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementImported(ElementImported object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeGroup(AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroup(Group object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotation(Notation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleContent(SimpleContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexContent(ComplexContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnique(Unique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKey(Key object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyRef(KeyRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnyAttribute(AnyAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtension(Extension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelector(Selector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseField(Field object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppInfo(AppInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documentation XML Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documentation XML Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentationXMLSchema(DocumentationXMLSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAny(Any object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAll(All object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoice(Choice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceType(SequenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleType(SimpleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseList(WSDL2_0.List object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Union</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Union</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnion(Union object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestriction(Restriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Min Inclusive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Min Inclusive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinInclusive(MinInclusive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Min Exclusive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Min Exclusive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinExclusive(MinExclusive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Inclusive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Inclusive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaxInclusive(MaxInclusive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Exclusive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Exclusive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaxExclusive(MaxExclusive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Total Digits</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Total Digits</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTotalDigits(TotalDigits object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fraction Digits</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fraction Digits</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFractionDigits(FractionDigits object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern(Pattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeration(Enumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>White Space</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>White Space</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhiteSpace(WhiteSpace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Length</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLength(Length object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Length</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Length</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaxLength(MaxLength object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Min Length</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Min Length</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinLength(MinLength object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject(WSDL2_0.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescription(Description object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Fault</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Fault</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceFault(InterfaceFault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceOperation(InterfaceOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceInput(InterfaceInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceOutput(InterfaceOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Infault</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Infault</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceInfault(InterfaceInfault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Outfault</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Outfault</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceOutfault(InterfaceOutfault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinding(Binding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Fault</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Fault</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingFault(BindingFault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingOperation(BindingOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingInput(BindingInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingOutput(BindingOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Infault</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Infault</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingInfault(BindingInfault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Outfault</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Outfault</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingOutfault(BindingOutfault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndPoint(EndPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementType(ElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Include</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Include</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInclude(Include object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport(Import object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentation(Documentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespace(Namespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wsoap Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wsoap Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWsoap_Module(Wsoap_Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wsoap Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wsoap Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWsoap_Header(Wsoap_Header object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Whttp Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Whttp Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhttp_Header(Whttp_Header object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //WSDL2_0Switch
