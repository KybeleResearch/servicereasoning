/*
 * 
 */
package ASD.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import ASD.ASDPackage;
import ASD.diagram.edit.parts.AnnotationKey2EditPart;
import ASD.diagram.edit.parts.AnnotationKey3EditPart;
import ASD.diagram.edit.parts.AnnotationKey4EditPart;
import ASD.diagram.edit.parts.AnnotationKeyEditPart;
import ASD.diagram.edit.parts.AnnotationValue2EditPart;
import ASD.diagram.edit.parts.AnnotationValueEditPart;
import ASD.diagram.edit.parts.AssertionDimensionEditPart;
import ASD.diagram.edit.parts.AssertionDimensionTypeEditPart;
import ASD.diagram.edit.parts.AssertionIntentionEditPart;
import ASD.diagram.edit.parts.AssertionLTypeEditPart;
import ASD.diagram.edit.parts.AssertionMaxValEditPart;
import ASD.diagram.edit.parts.AssertionMinValEditPart;
import ASD.diagram.edit.parts.AssertionName2EditPart;
import ASD.diagram.edit.parts.AssertionNameEditPart;
import ASD.diagram.edit.parts.AssertionSetLTypeEditPart;
import ASD.diagram.edit.parts.AssertionSetName2EditPart;
import ASD.diagram.edit.parts.AssertionSetNameEditPart;
import ASD.diagram.edit.parts.AssertionSubsetEditPart;
import ASD.diagram.edit.parts.InfoTypeImportedName2EditPart;
import ASD.diagram.edit.parts.InfoTypeImportedName3EditPart;
import ASD.diagram.edit.parts.InfoTypeImportedName4EditPart;
import ASD.diagram.edit.parts.InfoTypeImportedNameEditPart;
import ASD.diagram.edit.parts.InfoTypeImportedSubset2EditPart;
import ASD.diagram.edit.parts.InfoTypeImportedSubsetEditPart;
import ASD.diagram.edit.parts.InfoTypeImportedUrl2EditPart;
import ASD.diagram.edit.parts.InfoTypeImportedUrlEditPart;
import ASD.diagram.edit.parts.InfoTypeImportedValueRange2EditPart;
import ASD.diagram.edit.parts.InfoTypeImportedValueRangeEditPart;
import ASD.diagram.edit.parts.InfoTypeImportedValueType2EditPart;
import ASD.diagram.edit.parts.InfoTypeImportedValueTypeEditPart;
import ASD.diagram.edit.parts.InfoTypeName2EditPart;
import ASD.diagram.edit.parts.InfoTypeName3EditPart;
import ASD.diagram.edit.parts.InfoTypeName4EditPart;
import ASD.diagram.edit.parts.InfoTypeNameEditPart;
import ASD.diagram.edit.parts.InfoTypeSubset2EditPart;
import ASD.diagram.edit.parts.InfoTypeSubsetEditPart;
import ASD.diagram.edit.parts.InfoTypeValueRange2EditPart;
import ASD.diagram.edit.parts.InfoTypeValueRangeEditPart;
import ASD.diagram.edit.parts.InfoTypeValueType2EditPart;
import ASD.diagram.edit.parts.InfoTypeValueTypeEditPart;
import ASD.diagram.edit.parts.MessageName2EditPart;
import ASD.diagram.edit.parts.MessageNameEditPart;
import ASD.diagram.edit.parts.MessageRoleEditPart;
import ASD.diagram.edit.parts.MessageSubsetEditPart;
import ASD.diagram.edit.parts.OperationMessagePatternEditPart;
import ASD.diagram.edit.parts.OperationName2EditPart;
import ASD.diagram.edit.parts.OperationNameEditPart;
import ASD.diagram.edit.parts.ProfileName2EditPart;
import ASD.diagram.edit.parts.ProfileNameEditPart;
import ASD.diagram.parsers.MessageFormatParser;
import ASD.diagram.part.ASDVisualIDRegistry;

/**
 * @generated
 */
public class ASDParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser infoTypeImportedName_5015Parser;

	/**
	 * @generated
	 */
	private IParser getInfoTypeImportedName_5015Parser() {
		if (infoTypeImportedName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("InfoTypeImported: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("InfoTypeImported: {0}"); //$NON-NLS-1$
			parser.setEditPattern("InfoTypeImported: {0}"); //$NON-NLS-1$
			infoTypeImportedName_5015Parser = parser;
		}
		return infoTypeImportedName_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser infoTypeImportedName_5016Parser;

	/**
	 * @generated
	 */
	private IParser getInfoTypeImportedName_5016Parser() {
		if (infoTypeImportedName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- Name: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- Name: {0}"); //$NON-NLS-1$
			parser.setEditPattern("- Name: {0}"); //$NON-NLS-1$
			infoTypeImportedName_5016Parser = parser;
		}
		return infoTypeImportedName_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser infoTypeImportedValueType_5017Parser;

	/**
	 * @generated
	 */
	private IParser getInfoTypeImportedValueType_5017Parser() {
		if (infoTypeImportedValueType_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getInfoType_ValueType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- ValueType: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- ValueType: {0}"); //$NON-NLS-1$
			parser.setEditPattern("- ValueType: {0}"); //$NON-NLS-1$
			infoTypeImportedValueType_5017Parser = parser;
		}
		return infoTypeImportedValueType_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser infoTypeImportedValueRange_5018Parser;

	/**
	 * @generated
	 */
	private IParser getInfoTypeImportedValueRange_5018Parser() {
		if (infoTypeImportedValueRange_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getInfoType_ValueRange() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- ValueRange: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- ValueRange: {0}"); //$NON-NLS-1$
			parser.setEditPattern("- ValueRange: {0}"); //$NON-NLS-1$
			infoTypeImportedValueRange_5018Parser = parser;
		}
		return infoTypeImportedValueRange_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser infoTypeImportedSubset_5019Parser;

	/**
	 * @generated
	 */
	private IParser getInfoTypeImportedSubset_5019Parser() {
		if (infoTypeImportedSubset_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getInfoType_Subset() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- Subset: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- Subset: {0}"); //$NON-NLS-1$
			parser.setEditPattern("- Subset: {0}"); //$NON-NLS-1$
			infoTypeImportedSubset_5019Parser = parser;
		}
		return infoTypeImportedSubset_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser infoTypeImportedUrl_5020Parser;

	/**
	 * @generated
	 */
	private IParser getInfoTypeImportedUrl_5020Parser() {
		if (infoTypeImportedUrl_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getInfoTypeImported_Url() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- URL: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- URL: {0}"); //$NON-NLS-1$
			parser.setEditPattern("- URL: {0}"); //$NON-NLS-1$
			infoTypeImportedUrl_5020Parser = parser;
		}
		return infoTypeImportedUrl_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser operationName_5025Parser;

	/**
	 * @generated
	 */
	private IParser getOperationName_5025Parser() {
		if (operationName_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Operation: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Operation: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Operation: {0}"); //$NON-NLS-1$
			operationName_5025Parser = parser;
		}
		return operationName_5025Parser;
	}

	/**
	 * @generated
	 */
	private IParser operationName_5026Parser;

	/**
	 * @generated
	 */
	private IParser getOperationName_5026Parser() {
		if (operationName_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- Name: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- Name: {0}"); //$NON-NLS-1$
			parser.setEditPattern("- Name: {0}"); //$NON-NLS-1$
			operationName_5026Parser = parser;
		}
		return operationName_5026Parser;
	}

	/**
	 * @generated
	 */
	private IParser operationMessagePattern_5027Parser;

	/**
	 * @generated
	 */
	private IParser getOperationMessagePattern_5027Parser() {
		if (operationMessagePattern_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getOperation_MessagePattern() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- MessagePattern: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- MessagePattern: {0}"); //$NON-NLS-1$
			parser.setEditPattern("- MessagePattern: {0}"); //$NON-NLS-1$
			operationMessagePattern_5027Parser = parser;
		}
		return operationMessagePattern_5027Parser;
	}

	/**
	 * @generated
	 */
	private IParser infoTypeName_5028Parser;

	/**
	 * @generated
	 */
	private IParser getInfoTypeName_5028Parser() {
		if (infoTypeName_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("InfoType: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("InfoType: {0}"); //$NON-NLS-1$
			parser.setEditPattern("InfoType: {0}"); //$NON-NLS-1$
			infoTypeName_5028Parser = parser;
		}
		return infoTypeName_5028Parser;
	}

	/**
	 * @generated
	 */
	private IParser infoTypeName_5029Parser;

	/**
	 * @generated
	 */
	private IParser getInfoTypeName_5029Parser() {
		if (infoTypeName_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- Name: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- Name: {0}"); //$NON-NLS-1$
			parser.setEditPattern("- Name: {0}"); //$NON-NLS-1$
			infoTypeName_5029Parser = parser;
		}
		return infoTypeName_5029Parser;
	}

	/**
	 * @generated
	 */
	private IParser infoTypeValueType_5030Parser;

	/**
	 * @generated
	 */
	private IParser getInfoTypeValueType_5030Parser() {
		if (infoTypeValueType_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getInfoType_ValueType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- ValueType: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- ValueType: {0}"); //$NON-NLS-1$
			parser.setEditPattern("- ValueType: {0}"); //$NON-NLS-1$
			infoTypeValueType_5030Parser = parser;
		}
		return infoTypeValueType_5030Parser;
	}

	/**
	 * @generated
	 */
	private IParser infoTypeValueRange_5031Parser;

	/**
	 * @generated
	 */
	private IParser getInfoTypeValueRange_5031Parser() {
		if (infoTypeValueRange_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getInfoType_ValueRange() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- ValueRange: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- ValueRange: {0}"); //$NON-NLS-1$
			parser.setEditPattern("- ValueRange: {0}"); //$NON-NLS-1$
			infoTypeValueRange_5031Parser = parser;
		}
		return infoTypeValueRange_5031Parser;
	}

	/**
	 * @generated
	 */
	private IParser infoTypeSubset_5032Parser;

	/**
	 * @generated
	 */
	private IParser getInfoTypeSubset_5032Parser() {
		if (infoTypeSubset_5032Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getInfoType_Subset() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- Subset: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- Subset: {0}"); //$NON-NLS-1$
			parser.setEditPattern("- Subset: {0}"); //$NON-NLS-1$
			infoTypeSubset_5032Parser = parser;
		}
		return infoTypeSubset_5032Parser;
	}

	/**
	 * @generated
	 */
	private IParser profileName_5045Parser;

	/**
	 * @generated
	 */
	private IParser getProfileName_5045Parser() {
		if (profileName_5045Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Profile: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Profile: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Profile: {0}"); //$NON-NLS-1$
			profileName_5045Parser = parser;
		}
		return profileName_5045Parser;
	}

	/**
	 * @generated
	 */
	private IParser profileName_5046Parser;

	/**
	 * @generated
	 */
	private IParser getProfileName_5046Parser() {
		if (profileName_5046Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- Name: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- Name: {0}"); //$NON-NLS-1$
			parser.setEditPattern("- Name: {0}"); //$NON-NLS-1$
			profileName_5046Parser = parser;
		}
		return profileName_5046Parser;
	}

	/**
	 * @generated
	 */
	private IParser annotationKey_5047Parser;

	/**
	 * @generated
	 */
	private IParser getAnnotationKey_5047Parser() {
		if (annotationKey_5047Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getAnnotation_Key() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Annotation: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Annotation: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Annotation: {0}"); //$NON-NLS-1$
			annotationKey_5047Parser = parser;
		}
		return annotationKey_5047Parser;
	}

	/**
	 * @generated
	 */
	private IParser annotationKey_5048Parser;

	/**
	 * @generated
	 */
	private IParser getAnnotationKey_5048Parser() {
		if (annotationKey_5048Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getAnnotation_Key() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- Key: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- Key: {0}"); //$NON-NLS-1$
			parser.setEditPattern("- Key: {0}"); //$NON-NLS-1$
			annotationKey_5048Parser = parser;
		}
		return annotationKey_5048Parser;
	}

	/**
	 * @generated
	 */
	private IParser annotationValue_5049Parser;

	/**
	 * @generated
	 */
	private IParser getAnnotationValue_5049Parser() {
		if (annotationValue_5049Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getAnnotation_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- Value: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- Value: {0}"); //$NON-NLS-1$
			parser.setEditPattern("- Value: {0}"); //$NON-NLS-1$
			annotationValue_5049Parser = parser;
		}
		return annotationValue_5049Parser;
	}

	/**
	 * @generated
	 */
	private IParser infoTypeImportedName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getInfoTypeImportedName_5009Parser() {
		if (infoTypeImportedName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("InfoTypeImported: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("InfoTypeImported: {0}"); //$NON-NLS-1$
			parser.setEditPattern("InfoTypeImported: {0}"); //$NON-NLS-1$
			infoTypeImportedName_5009Parser = parser;
		}
		return infoTypeImportedName_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser infoTypeImportedName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getInfoTypeImportedName_5010Parser() {
		if (infoTypeImportedName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- Name: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- Name: {0}"); //$NON-NLS-1$
			parser.setEditPattern("- Name: {0}"); //$NON-NLS-1$
			infoTypeImportedName_5010Parser = parser;
		}
		return infoTypeImportedName_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser infoTypeImportedValueType_5011Parser;

	/**
	 * @generated
	 */
	private IParser getInfoTypeImportedValueType_5011Parser() {
		if (infoTypeImportedValueType_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getInfoType_ValueType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- ValueType: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- ValueType: {0}"); //$NON-NLS-1$
			parser.setEditPattern("- ValueType: {0}"); //$NON-NLS-1$
			infoTypeImportedValueType_5011Parser = parser;
		}
		return infoTypeImportedValueType_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser infoTypeImportedValueRange_5012Parser;

	/**
	 * @generated
	 */
	private IParser getInfoTypeImportedValueRange_5012Parser() {
		if (infoTypeImportedValueRange_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getInfoType_ValueRange() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- ValueRange: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- ValueRange: {0}"); //$NON-NLS-1$
			parser.setEditPattern("- ValueRange: {0}"); //$NON-NLS-1$
			infoTypeImportedValueRange_5012Parser = parser;
		}
		return infoTypeImportedValueRange_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser infoTypeImportedSubset_5013Parser;

	/**
	 * @generated
	 */
	private IParser getInfoTypeImportedSubset_5013Parser() {
		if (infoTypeImportedSubset_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getInfoType_Subset() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- Subset: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- Subset: {0}"); //$NON-NLS-1$
			parser.setEditPattern("- Subset: {0}"); //$NON-NLS-1$
			infoTypeImportedSubset_5013Parser = parser;
		}
		return infoTypeImportedSubset_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser infoTypeImportedUrl_5014Parser;

	/**
	 * @generated
	 */
	private IParser getInfoTypeImportedUrl_5014Parser() {
		if (infoTypeImportedUrl_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getInfoTypeImported_Url() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- URL: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- URL: {0}"); //$NON-NLS-1$
			parser.setEditPattern("- URL: {0}"); //$NON-NLS-1$
			infoTypeImportedUrl_5014Parser = parser;
		}
		return infoTypeImportedUrl_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser infoTypeName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getInfoTypeName_5004Parser() {
		if (infoTypeName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("InfoType: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("InfoType: {0}"); //$NON-NLS-1$
			parser.setEditPattern("InfoType: {0}"); //$NON-NLS-1$
			infoTypeName_5004Parser = parser;
		}
		return infoTypeName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser infoTypeName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getInfoTypeName_5005Parser() {
		if (infoTypeName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- Name: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- Name: {0}"); //$NON-NLS-1$
			parser.setEditPattern("- Name: {0}"); //$NON-NLS-1$
			infoTypeName_5005Parser = parser;
		}
		return infoTypeName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser infoTypeValueType_5006Parser;

	/**
	 * @generated
	 */
	private IParser getInfoTypeValueType_5006Parser() {
		if (infoTypeValueType_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getInfoType_ValueType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- ValueType: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- ValueType: {0}"); //$NON-NLS-1$
			parser.setEditPattern("- ValueType: {0}"); //$NON-NLS-1$
			infoTypeValueType_5006Parser = parser;
		}
		return infoTypeValueType_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser infoTypeValueRange_5007Parser;

	/**
	 * @generated
	 */
	private IParser getInfoTypeValueRange_5007Parser() {
		if (infoTypeValueRange_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getInfoType_ValueRange() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- ValueRange: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- ValueRange: {0}"); //$NON-NLS-1$
			parser.setEditPattern("- ValueRange: {0}"); //$NON-NLS-1$
			infoTypeValueRange_5007Parser = parser;
		}
		return infoTypeValueRange_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser infoTypeSubset_5008Parser;

	/**
	 * @generated
	 */
	private IParser getInfoTypeSubset_5008Parser() {
		if (infoTypeSubset_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getInfoType_Subset() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- Subset: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- Subset: {0}"); //$NON-NLS-1$
			parser.setEditPattern("- Subset: {0}"); //$NON-NLS-1$
			infoTypeSubset_5008Parser = parser;
		}
		return infoTypeSubset_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser annotationKey_5001Parser;

	/**
	 * @generated
	 */
	private IParser getAnnotationKey_5001Parser() {
		if (annotationKey_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getAnnotation_Key() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Annotation: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Annotation: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Annotation: {0}"); //$NON-NLS-1$
			annotationKey_5001Parser = parser;
		}
		return annotationKey_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser annotationKey_5002Parser;

	/**
	 * @generated
	 */
	private IParser getAnnotationKey_5002Parser() {
		if (annotationKey_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getAnnotation_Key() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- Key: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- Key: {0}"); //$NON-NLS-1$
			parser.setEditPattern("- Key: {0}"); //$NON-NLS-1$
			annotationKey_5002Parser = parser;
		}
		return annotationKey_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser annotationValue_5003Parser;

	/**
	 * @generated
	 */
	private IParser getAnnotationValue_5003Parser() {
		if (annotationValue_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getAnnotation_Value() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- Value: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- Value: {0}"); //$NON-NLS-1$
			parser.setEditPattern("- Value: {0}"); //$NON-NLS-1$
			annotationValue_5003Parser = parser;
		}
		return annotationValue_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser messageName_5021Parser;

	/**
	 * @generated
	 */
	private IParser getMessageName_5021Parser() {
		if (messageName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Message: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Message: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Message: {0}"); //$NON-NLS-1$
			messageName_5021Parser = parser;
		}
		return messageName_5021Parser;
	}

	/**
	 * @generated
	 */
	private IParser messageName_5022Parser;

	/**
	 * @generated
	 */
	private IParser getMessageName_5022Parser() {
		if (messageName_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- Name: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- Name: {0}"); //$NON-NLS-1$
			parser.setEditPattern("- Name: {0}"); //$NON-NLS-1$
			messageName_5022Parser = parser;
		}
		return messageName_5022Parser;
	}

	/**
	 * @generated
	 */
	private IParser messageRole_5023Parser;

	/**
	 * @generated
	 */
	private IParser getMessageRole_5023Parser() {
		if (messageRole_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getMessage_Role() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- Role: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- Role: {0}"); //$NON-NLS-1$
			parser.setEditPattern("- Role: {0}"); //$NON-NLS-1$
			messageRole_5023Parser = parser;
		}
		return messageRole_5023Parser;
	}

	/**
	 * @generated
	 */
	private IParser messageSubset_5024Parser;

	/**
	 * @generated
	 */
	private IParser getMessageSubset_5024Parser() {
		if (messageSubset_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getMessage_Subset() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- Subset: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- Subset: {0}"); //$NON-NLS-1$
			parser.setEditPattern("- Subset: {0}"); //$NON-NLS-1$
			messageSubset_5024Parser = parser;
		}
		return messageSubset_5024Parser;
	}

	/**
	 * @generated
	 */
	private IParser assertionSetName_5042Parser;

	/**
	 * @generated
	 */
	private IParser getAssertionSetName_5042Parser() {
		if (assertionSetName_5042Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("AssertionSet: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("AssertionSet: {0}"); //$NON-NLS-1$
			parser.setEditPattern("AssertionSet: {0}"); //$NON-NLS-1$
			assertionSetName_5042Parser = parser;
		}
		return assertionSetName_5042Parser;
	}

	/**
	 * @generated
	 */
	private IParser assertionSetName_5043Parser;

	/**
	 * @generated
	 */
	private IParser getAssertionSetName_5043Parser() {
		if (assertionSetName_5043Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- Name: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- Name: {0}"); //$NON-NLS-1$
			parser.setEditPattern("- Name: {0}"); //$NON-NLS-1$
			assertionSetName_5043Parser = parser;
		}
		return assertionSetName_5043Parser;
	}

	/**
	 * @generated
	 */
	private IParser assertionSetLType_5044Parser;

	/**
	 * @generated
	 */
	private IParser getAssertionSetLType_5044Parser() {
		if (assertionSetLType_5044Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getAssertionSet_LType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- LType: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- LType: {0}"); //$NON-NLS-1$
			parser.setEditPattern("- LType: {0}"); //$NON-NLS-1$
			assertionSetLType_5044Parser = parser;
		}
		return assertionSetLType_5044Parser;
	}

	/**
	 * @generated
	 */
	private IParser assertionName_5033Parser;

	/**
	 * @generated
	 */
	private IParser getAssertionName_5033Parser() {
		if (assertionName_5033Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Assertion: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Assertion: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Assertion: {0}"); //$NON-NLS-1$
			assertionName_5033Parser = parser;
		}
		return assertionName_5033Parser;
	}

	/**
	 * @generated
	 */
	private IParser assertionName_5034Parser;

	/**
	 * @generated
	 */
	private IParser getAssertionName_5034Parser() {
		if (assertionName_5034Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- Name: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- Name: {0}"); //$NON-NLS-1$
			parser.setEditPattern("- Name: {0}"); //$NON-NLS-1$
			assertionName_5034Parser = parser;
		}
		return assertionName_5034Parser;
	}

	/**
	 * @generated
	 */
	private IParser assertionDimension_5035Parser;

	/**
	 * @generated
	 */
	private IParser getAssertionDimension_5035Parser() {
		if (assertionDimension_5035Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getAssertion_Dimension() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- Dimension: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- Dimension: {0}"); //$NON-NLS-1$
			parser.setEditPattern("- Dimension: {0}"); //$NON-NLS-1$
			assertionDimension_5035Parser = parser;
		}
		return assertionDimension_5035Parser;
	}

	/**
	 * @generated
	 */
	private IParser assertionDimensionType_5036Parser;

	/**
	 * @generated
	 */
	private IParser getAssertionDimensionType_5036Parser() {
		if (assertionDimensionType_5036Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getAssertion_DimensionType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- DimensionType: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- DimensionType: {0}"); //$NON-NLS-1$
			parser.setEditPattern("- DimensionType: {0}"); //$NON-NLS-1$
			assertionDimensionType_5036Parser = parser;
		}
		return assertionDimensionType_5036Parser;
	}

	/**
	 * @generated
	 */
	private IParser assertionIntention_5037Parser;

	/**
	 * @generated
	 */
	private IParser getAssertionIntention_5037Parser() {
		if (assertionIntention_5037Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getAssertion_Intention() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- Intention: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- Intention: {0}"); //$NON-NLS-1$
			parser.setEditPattern("- Intention: {0}"); //$NON-NLS-1$
			assertionIntention_5037Parser = parser;
		}
		return assertionIntention_5037Parser;
	}

	/**
	 * @generated
	 */
	private IParser assertionMinVal_5038Parser;

	/**
	 * @generated
	 */
	private IParser getAssertionMinVal_5038Parser() {
		if (assertionMinVal_5038Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getAssertion_MinVal() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- MinVal: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- MinVal: {0}"); //$NON-NLS-1$
			parser.setEditPattern("- MinVal: {0}"); //$NON-NLS-1$
			assertionMinVal_5038Parser = parser;
		}
		return assertionMinVal_5038Parser;
	}

	/**
	 * @generated
	 */
	private IParser assertionMaxVal_5039Parser;

	/**
	 * @generated
	 */
	private IParser getAssertionMaxVal_5039Parser() {
		if (assertionMaxVal_5039Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getAssertion_MaxVal() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- MaxVal: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- MaxVal: {0}"); //$NON-NLS-1$
			parser.setEditPattern("- MaxVal: {0}"); //$NON-NLS-1$
			assertionMaxVal_5039Parser = parser;
		}
		return assertionMaxVal_5039Parser;
	}

	/**
	 * @generated
	 */
	private IParser assertionLType_5040Parser;

	/**
	 * @generated
	 */
	private IParser getAssertionLType_5040Parser() {
		if (assertionLType_5040Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getAssertion_LType() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- LType: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- LType: {0}"); //$NON-NLS-1$
			parser.setEditPattern("- LType: {0}"); //$NON-NLS-1$
			assertionLType_5040Parser = parser;
		}
		return assertionLType_5040Parser;
	}

	/**
	 * @generated
	 */
	private IParser assertionSubset_5041Parser;

	/**
	 * @generated
	 */
	private IParser getAssertionSubset_5041Parser() {
		if (assertionSubset_5041Parser == null) {
			EAttribute[] features = new EAttribute[] { ASDPackage.eINSTANCE
					.getAssertion_Subset() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("- Subset: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("- Subset: {0}"); //$NON-NLS-1$
			parser.setEditPattern("- Subset: {0}"); //$NON-NLS-1$
			assertionSubset_5041Parser = parser;
		}
		return assertionSubset_5041Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case InfoTypeImportedNameEditPart.VISUAL_ID:
			return getInfoTypeImportedName_5015Parser();
		case InfoTypeImportedName2EditPart.VISUAL_ID:
			return getInfoTypeImportedName_5016Parser();
		case InfoTypeImportedValueTypeEditPart.VISUAL_ID:
			return getInfoTypeImportedValueType_5017Parser();
		case InfoTypeImportedValueRangeEditPart.VISUAL_ID:
			return getInfoTypeImportedValueRange_5018Parser();
		case InfoTypeImportedSubsetEditPart.VISUAL_ID:
			return getInfoTypeImportedSubset_5019Parser();
		case InfoTypeImportedUrlEditPart.VISUAL_ID:
			return getInfoTypeImportedUrl_5020Parser();
		case OperationNameEditPart.VISUAL_ID:
			return getOperationName_5025Parser();
		case OperationName2EditPart.VISUAL_ID:
			return getOperationName_5026Parser();
		case OperationMessagePatternEditPart.VISUAL_ID:
			return getOperationMessagePattern_5027Parser();
		case InfoTypeNameEditPart.VISUAL_ID:
			return getInfoTypeName_5028Parser();
		case InfoTypeName2EditPart.VISUAL_ID:
			return getInfoTypeName_5029Parser();
		case InfoTypeValueTypeEditPart.VISUAL_ID:
			return getInfoTypeValueType_5030Parser();
		case InfoTypeValueRangeEditPart.VISUAL_ID:
			return getInfoTypeValueRange_5031Parser();
		case InfoTypeSubsetEditPart.VISUAL_ID:
			return getInfoTypeSubset_5032Parser();
		case ProfileNameEditPart.VISUAL_ID:
			return getProfileName_5045Parser();
		case ProfileName2EditPart.VISUAL_ID:
			return getProfileName_5046Parser();
		case AnnotationKeyEditPart.VISUAL_ID:
			return getAnnotationKey_5047Parser();
		case AnnotationKey2EditPart.VISUAL_ID:
			return getAnnotationKey_5048Parser();
		case AnnotationValueEditPart.VISUAL_ID:
			return getAnnotationValue_5049Parser();
		case InfoTypeImportedName3EditPart.VISUAL_ID:
			return getInfoTypeImportedName_5009Parser();
		case InfoTypeImportedName4EditPart.VISUAL_ID:
			return getInfoTypeImportedName_5010Parser();
		case InfoTypeImportedValueType2EditPart.VISUAL_ID:
			return getInfoTypeImportedValueType_5011Parser();
		case InfoTypeImportedValueRange2EditPart.VISUAL_ID:
			return getInfoTypeImportedValueRange_5012Parser();
		case InfoTypeImportedSubset2EditPart.VISUAL_ID:
			return getInfoTypeImportedSubset_5013Parser();
		case InfoTypeImportedUrl2EditPart.VISUAL_ID:
			return getInfoTypeImportedUrl_5014Parser();
		case InfoTypeName3EditPart.VISUAL_ID:
			return getInfoTypeName_5004Parser();
		case InfoTypeName4EditPart.VISUAL_ID:
			return getInfoTypeName_5005Parser();
		case InfoTypeValueType2EditPart.VISUAL_ID:
			return getInfoTypeValueType_5006Parser();
		case InfoTypeValueRange2EditPart.VISUAL_ID:
			return getInfoTypeValueRange_5007Parser();
		case InfoTypeSubset2EditPart.VISUAL_ID:
			return getInfoTypeSubset_5008Parser();
		case AnnotationKey3EditPart.VISUAL_ID:
			return getAnnotationKey_5001Parser();
		case AnnotationKey4EditPart.VISUAL_ID:
			return getAnnotationKey_5002Parser();
		case AnnotationValue2EditPart.VISUAL_ID:
			return getAnnotationValue_5003Parser();
		case MessageNameEditPart.VISUAL_ID:
			return getMessageName_5021Parser();
		case MessageName2EditPart.VISUAL_ID:
			return getMessageName_5022Parser();
		case MessageRoleEditPart.VISUAL_ID:
			return getMessageRole_5023Parser();
		case MessageSubsetEditPart.VISUAL_ID:
			return getMessageSubset_5024Parser();
		case AssertionSetNameEditPart.VISUAL_ID:
			return getAssertionSetName_5042Parser();
		case AssertionSetName2EditPart.VISUAL_ID:
			return getAssertionSetName_5043Parser();
		case AssertionSetLTypeEditPart.VISUAL_ID:
			return getAssertionSetLType_5044Parser();
		case AssertionNameEditPart.VISUAL_ID:
			return getAssertionName_5033Parser();
		case AssertionName2EditPart.VISUAL_ID:
			return getAssertionName_5034Parser();
		case AssertionDimensionEditPart.VISUAL_ID:
			return getAssertionDimension_5035Parser();
		case AssertionDimensionTypeEditPart.VISUAL_ID:
			return getAssertionDimensionType_5036Parser();
		case AssertionIntentionEditPart.VISUAL_ID:
			return getAssertionIntention_5037Parser();
		case AssertionMinValEditPart.VISUAL_ID:
			return getAssertionMinVal_5038Parser();
		case AssertionMaxValEditPart.VISUAL_ID:
			return getAssertionMaxVal_5039Parser();
		case AssertionLTypeEditPart.VISUAL_ID:
			return getAssertionLType_5040Parser();
		case AssertionSubsetEditPart.VISUAL_ID:
			return getAssertionSubset_5041Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(ASDVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ASDVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ASDElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
