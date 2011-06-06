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
 * @see WSDL1_1.WSDL1_1Package
 * @generated
 */
public class WSDL1_1Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WSDL1_1Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WSDL1_1Switch() {
		if (modelPackage == null) {
			modelPackage = WSDL1_1Package.eINSTANCE;
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
			case WSDL1_1Package.SCHEMA: {
				Schema schema = (Schema)theEObject;
				T result = caseSchema(schema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.ADICIONAL_INFORMATION_TYPE: {
				AdicionalInformationType adicionalInformationType = (AdicionalInformationType)theEObject;
				T result = caseAdicionalInformationType(adicionalInformationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.TYPE_REF: {
				TypeRef typeRef = (TypeRef)theEObject;
				T result = caseTypeRef(typeRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.INCLUDE: {
				Include include = (Include)theEObject;
				T result = caseInclude(include);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.IMPORT_XML_SCHEMA: {
				ImportXMLSchema importXMLSchema = (ImportXMLSchema)theEObject;
				T result = caseImportXMLSchema(importXMLSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.REDEFINE: {
				Redefine redefine = (Redefine)theEObject;
				T result = caseRedefine(redefine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.COMPLEX_TYPE: {
				ComplexType complexType = (ComplexType)theEObject;
				T result = caseComplexType(complexType);
				if (result == null) result = caseTypeRef(complexType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = caseAdicionalInformationType(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.ELEMENT_IMPORTED: {
				ElementImported elementImported = (ElementImported)theEObject;
				T result = caseElementImported(elementImported);
				if (result == null) result = caseElement(elementImported);
				if (result == null) result = caseAdicionalInformationType(elementImported);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = caseAdicionalInformationType(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.ATTRIBUTE_GROUP: {
				AttributeGroup attributeGroup = (AttributeGroup)theEObject;
				T result = caseAttributeGroup(attributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.GROUP: {
				Group group = (Group)theEObject;
				T result = caseGroup(group);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.NOTATION: {
				Notation notation = (Notation)theEObject;
				T result = caseNotation(notation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.SIMPLE_CONTENT: {
				SimpleContent simpleContent = (SimpleContent)theEObject;
				T result = caseSimpleContent(simpleContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.COMPLEX_CONTENT: {
				ComplexContent complexContent = (ComplexContent)theEObject;
				T result = caseComplexContent(complexContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.UNIQUE: {
				Unique unique = (Unique)theEObject;
				T result = caseUnique(unique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.KEY: {
				Key key = (Key)theEObject;
				T result = caseKey(key);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.KEY_REF: {
				KeyRef keyRef = (KeyRef)theEObject;
				T result = caseKeyRef(keyRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.ANY_ATTRIBUTE: {
				AnyAttribute anyAttribute = (AnyAttribute)theEObject;
				T result = caseAnyAttribute(anyAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.EXTENSION: {
				Extension extension = (Extension)theEObject;
				T result = caseExtension(extension);
				if (result == null) result = caseAdicionalInformationType(extension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.SELECTOR: {
				Selector selector = (Selector)theEObject;
				T result = caseSelector(selector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.FIELD: {
				Field field = (Field)theEObject;
				T result = caseField(field);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.APP_INFO: {
				AppInfo appInfo = (AppInfo)theEObject;
				T result = caseAppInfo(appInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.DOCUMENTATION_XML_SCHEMA: {
				DocumentationXMLSchema documentationXMLSchema = (DocumentationXMLSchema)theEObject;
				T result = caseDocumentationXMLSchema(documentationXMLSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.ANY: {
				Any any = (Any)theEObject;
				T result = caseAny(any);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.ALL: {
				All all = (All)theEObject;
				T result = caseAll(all);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.CHOICE: {
				Choice choice = (Choice)theEObject;
				T result = caseChoice(choice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.SEQUENCE_TYPE: {
				SequenceType sequenceType = (SequenceType)theEObject;
				T result = caseSequenceType(sequenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.SIMPLE_TYPE: {
				SimpleType simpleType = (SimpleType)theEObject;
				T result = caseSimpleType(simpleType);
				if (result == null) result = caseTypeRef(simpleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.LIST: {
				WSDL1_1.List list = (WSDL1_1.List)theEObject;
				T result = caseList(list);
				if (result == null) result = caseAdicionalInformationType(list);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.UNION: {
				Union union = (Union)theEObject;
				T result = caseUnion(union);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.RESTRICTION: {
				Restriction restriction = (Restriction)theEObject;
				T result = caseRestriction(restriction);
				if (result == null) result = caseAdicionalInformationType(restriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.MIN_INCLUSIVE: {
				MinInclusive minInclusive = (MinInclusive)theEObject;
				T result = caseMinInclusive(minInclusive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.MIN_EXCLUSIVE: {
				MinExclusive minExclusive = (MinExclusive)theEObject;
				T result = caseMinExclusive(minExclusive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.MAX_INCLUSIVE: {
				MaxInclusive maxInclusive = (MaxInclusive)theEObject;
				T result = caseMaxInclusive(maxInclusive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.MAX_EXCLUSIVE: {
				MaxExclusive maxExclusive = (MaxExclusive)theEObject;
				T result = caseMaxExclusive(maxExclusive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.TOTAL_DIGITS: {
				TotalDigits totalDigits = (TotalDigits)theEObject;
				T result = caseTotalDigits(totalDigits);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.FRACTION_DIGITS: {
				FractionDigits fractionDigits = (FractionDigits)theEObject;
				T result = caseFractionDigits(fractionDigits);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.PATTERN: {
				Pattern pattern = (Pattern)theEObject;
				T result = casePattern(pattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.ENUMERATION: {
				Enumeration enumeration = (Enumeration)theEObject;
				T result = caseEnumeration(enumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.WHITE_SPACE: {
				WhiteSpace whiteSpace = (WhiteSpace)theEObject;
				T result = caseWhiteSpace(whiteSpace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.LENGTH: {
				Length length = (Length)theEObject;
				T result = caseLength(length);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.MAX_LENGTH: {
				MaxLength maxLength = (MaxLength)theEObject;
				T result = caseMaxLength(maxLength);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.MIN_LENGTH: {
				MinLength minLength = (MinLength)theEObject;
				T result = caseMinLength(minLength);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.OBJECT: {
				WSDL1_1.Object object = (WSDL1_1.Object)theEObject;
				T result = caseObject(object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.BINDING_SOAP: {
				BindingSOAP bindingSOAP = (BindingSOAP)theEObject;
				T result = caseBindingSOAP(bindingSOAP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.OPERATION_SOAP: {
				OperationSOAP operationSOAP = (OperationSOAP)theEObject;
				T result = caseOperationSOAP(operationSOAP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.BODY_SOAP: {
				BodySOAP bodySOAP = (BodySOAP)theEObject;
				T result = caseBodySOAP(bodySOAP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.HEADER_SOAP: {
				HeaderSOAP headerSOAP = (HeaderSOAP)theEObject;
				T result = caseHeaderSOAP(headerSOAP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.HEADER_FAULT_SOAP: {
				HeaderFaultSOAP headerFaultSOAP = (HeaderFaultSOAP)theEObject;
				T result = caseHeaderFaultSOAP(headerFaultSOAP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.ADDRESS_SOAP: {
				AddressSOAP addressSOAP = (AddressSOAP)theEObject;
				T result = caseAddressSOAP(addressSOAP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.FAULT_SOAP: {
				FaultSOAP faultSOAP = (FaultSOAP)theEObject;
				T result = caseFaultSOAP(faultSOAP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.ADDRESS_HTTP: {
				AddressHTTP addressHTTP = (AddressHTTP)theEObject;
				T result = caseAddressHTTP(addressHTTP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.OPERATION_HTTP: {
				OperationHTTP operationHTTP = (OperationHTTP)theEObject;
				T result = caseOperationHTTP(operationHTTP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.URL_ENCODED: {
				URLEncoded urlEncoded = (URLEncoded)theEObject;
				T result = caseURLEncoded(urlEncoded);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.URL_REPLACEMENT: {
				URLReplacement urlReplacement = (URLReplacement)theEObject;
				T result = caseURLReplacement(urlReplacement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.BINDING_HTTP: {
				BindingHTTP bindingHTTP = (BindingHTTP)theEObject;
				T result = caseBindingHTTP(bindingHTTP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.MIME_MULTI_PART_RELATED: {
				MIMEMultiPartRelated mimeMultiPartRelated = (MIMEMultiPartRelated)theEObject;
				T result = caseMIMEMultiPartRelated(mimeMultiPartRelated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.MIME_PART: {
				MIMEPart mimePart = (MIMEPart)theEObject;
				T result = caseMIMEPart(mimePart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.MIME_CONTENT: {
				MIMEContent mimeContent = (MIMEContent)theEObject;
				T result = caseMIMEContent(mimeContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.MIME_XML: {
				MIMEXml mimeXml = (MIMEXml)theEObject;
				T result = caseMIMEXml(mimeXml);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.PORT_TYPE_FAULT: {
				PortTypeFault portTypeFault = (PortTypeFault)theEObject;
				T result = casePortTypeFault(portTypeFault);
				if (result == null) result = caseObject(portTypeFault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.DEFINITIONS: {
				Definitions definitions = (Definitions)theEObject;
				T result = caseDefinitions(definitions);
				if (result == null) result = caseObject(definitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.ELEMENT_TYPE: {
				ElementType elementType = (ElementType)theEObject;
				T result = caseElementType(elementType);
				if (result == null) result = caseObject(elementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.MESSAGE: {
				Message message = (Message)theEObject;
				T result = caseMessage(message);
				if (result == null) result = caseObject(message);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.PART: {
				Part part = (Part)theEObject;
				T result = casePart(part);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.PORT_TYPE: {
				PortType portType = (PortType)theEObject;
				T result = casePortType(portType);
				if (result == null) result = caseObject(portType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.PORT_TYPE_OPERATION: {
				PortTypeOperation portTypeOperation = (PortTypeOperation)theEObject;
				T result = casePortTypeOperation(portTypeOperation);
				if (result == null) result = caseObject(portTypeOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.PORT_TYPE_INPUT: {
				PortTypeInput portTypeInput = (PortTypeInput)theEObject;
				T result = casePortTypeInput(portTypeInput);
				if (result == null) result = caseObject(portTypeInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.PORT_TYPE_OUTPUT: {
				PortTypeOutput portTypeOutput = (PortTypeOutput)theEObject;
				T result = casePortTypeOutput(portTypeOutput);
				if (result == null) result = caseObject(portTypeOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.BINDING: {
				Binding binding = (Binding)theEObject;
				T result = caseBinding(binding);
				if (result == null) result = caseObject(binding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.BINDING_OPERATION: {
				BindingOperation bindingOperation = (BindingOperation)theEObject;
				T result = caseBindingOperation(bindingOperation);
				if (result == null) result = caseObject(bindingOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.BINDING_INPUT: {
				BindingInput bindingInput = (BindingInput)theEObject;
				T result = caseBindingInput(bindingInput);
				if (result == null) result = caseObject(bindingInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.BINDING_OUTPUT: {
				BindingOutput bindingOutput = (BindingOutput)theEObject;
				T result = caseBindingOutput(bindingOutput);
				if (result == null) result = caseObject(bindingOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.BINDING_FAULT: {
				BindingFault bindingFault = (BindingFault)theEObject;
				T result = caseBindingFault(bindingFault);
				if (result == null) result = caseObject(bindingFault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = caseObject(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = caseObject(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.IMPORT: {
				Import import_ = (Import)theEObject;
				T result = caseImport(import_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.DOCUMENTATION: {
				Documentation documentation = (Documentation)theEObject;
				T result = caseDocumentation(documentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.TEXT: {
				Text text = (Text)theEObject;
				T result = caseText(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WSDL1_1Package.NAMESPACE: {
				Namespace namespace = (Namespace)theEObject;
				T result = caseNamespace(namespace);
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
	public T caseList(WSDL1_1.List object) {
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
	public T caseObject(WSDL1_1.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding SOAP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding SOAP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingSOAP(BindingSOAP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation SOAP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation SOAP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationSOAP(OperationSOAP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body SOAP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body SOAP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodySOAP(BodySOAP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header SOAP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header SOAP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaderSOAP(HeaderSOAP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header Fault SOAP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header Fault SOAP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeaderFaultSOAP(HeaderFaultSOAP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address SOAP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address SOAP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressSOAP(AddressSOAP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fault SOAP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fault SOAP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaultSOAP(FaultSOAP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address HTTP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address HTTP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressHTTP(AddressHTTP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation HTTP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation HTTP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationHTTP(OperationHTTP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>URL Encoded</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>URL Encoded</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseURLEncoded(URLEncoded object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>URL Replacement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>URL Replacement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseURLReplacement(URLReplacement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding HTTP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding HTTP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingHTTP(BindingHTTP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MIME Multi Part Related</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MIME Multi Part Related</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMIMEMultiPartRelated(MIMEMultiPartRelated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MIME Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MIME Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMIMEPart(MIMEPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MIME Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MIME Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMIMEContent(MIMEContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MIME Xml</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MIME Xml</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMIMEXml(MIMEXml object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Type Fault</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Type Fault</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortTypeFault(PortTypeFault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinitions(Definitions object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePart(Part object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortType(PortType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Type Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Type Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortTypeOperation(PortTypeOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Type Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Type Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortTypeInput(PortTypeInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Type Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Type Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortTypeOutput(PortTypeOutput object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
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

} //WSDL1_1Switch
