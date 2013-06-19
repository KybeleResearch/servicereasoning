/*
 * 
 */
package ASD.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import ASD.ASDPackage;
import ASD.ServiceDescription;
import ASD.diagram.edit.parts.Annotation2EditPart;
import ASD.diagram.edit.parts.AnnotationEditPart;
import ASD.diagram.edit.parts.AnnotationKey2EditPart;
import ASD.diagram.edit.parts.AnnotationKey3EditPart;
import ASD.diagram.edit.parts.AnnotationKey4EditPart;
import ASD.diagram.edit.parts.AnnotationKeyEditPart;
import ASD.diagram.edit.parts.AnnotationValue2EditPart;
import ASD.diagram.edit.parts.AnnotationValueEditPart;
import ASD.diagram.edit.parts.AssertionAssertionAnnotationsCompartmentEditPart;
import ASD.diagram.edit.parts.AssertionDimensionEditPart;
import ASD.diagram.edit.parts.AssertionDimensionTypeEditPart;
import ASD.diagram.edit.parts.AssertionEditPart;
import ASD.diagram.edit.parts.AssertionIntentionEditPart;
import ASD.diagram.edit.parts.AssertionLTypeEditPart;
import ASD.diagram.edit.parts.AssertionMaxValEditPart;
import ASD.diagram.edit.parts.AssertionMinValEditPart;
import ASD.diagram.edit.parts.AssertionName2EditPart;
import ASD.diagram.edit.parts.AssertionNameEditPart;
import ASD.diagram.edit.parts.AssertionSetAssertionSetAnnotationsCompartmentEditPart;
import ASD.diagram.edit.parts.AssertionSetAssertionSetAssertionsCompartmentEditPart;
import ASD.diagram.edit.parts.AssertionSetEditPart;
import ASD.diagram.edit.parts.AssertionSetLTypeEditPart;
import ASD.diagram.edit.parts.AssertionSetName2EditPart;
import ASD.diagram.edit.parts.AssertionSetNameEditPart;
import ASD.diagram.edit.parts.AssertionSubsetEditPart;
import ASD.diagram.edit.parts.InfoType2EditPart;
import ASD.diagram.edit.parts.InfoTypeEditPart;
import ASD.diagram.edit.parts.InfoTypeImported2EditPart;
import ASD.diagram.edit.parts.InfoTypeImportedEditPart;
import ASD.diagram.edit.parts.InfoTypeImportedInfoTypeImportedAnnotationsCompartment2EditPart;
import ASD.diagram.edit.parts.InfoTypeImportedInfoTypeImportedAnnotationsCompartmentEditPart;
import ASD.diagram.edit.parts.InfoTypeImportedInfoTypeImportedInfoTypeCompartment2EditPart;
import ASD.diagram.edit.parts.InfoTypeImportedInfoTypeImportedInfoTypeCompartmentEditPart;
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
import ASD.diagram.edit.parts.InfoTypeInfoTypeAnnotationsCompartment2EditPart;
import ASD.diagram.edit.parts.InfoTypeInfoTypeAnnotationsCompartmentEditPart;
import ASD.diagram.edit.parts.InfoTypeInfoTypeInfoTypeCompartment2EditPart;
import ASD.diagram.edit.parts.InfoTypeInfoTypeInfoTypeCompartmentEditPart;
import ASD.diagram.edit.parts.InfoTypeName2EditPart;
import ASD.diagram.edit.parts.InfoTypeName3EditPart;
import ASD.diagram.edit.parts.InfoTypeName4EditPart;
import ASD.diagram.edit.parts.InfoTypeNameEditPart;
import ASD.diagram.edit.parts.InfoTypeRefEditPart;
import ASD.diagram.edit.parts.InfoTypeSubset2EditPart;
import ASD.diagram.edit.parts.InfoTypeSubsetEditPart;
import ASD.diagram.edit.parts.InfoTypeValueRange2EditPart;
import ASD.diagram.edit.parts.InfoTypeValueRangeEditPart;
import ASD.diagram.edit.parts.InfoTypeValueType2EditPart;
import ASD.diagram.edit.parts.InfoTypeValueTypeEditPart;
import ASD.diagram.edit.parts.MessageEditPart;
import ASD.diagram.edit.parts.MessageInfoTypeEditPart;
import ASD.diagram.edit.parts.MessageMessageAnnotationsCompartmentEditPart;
import ASD.diagram.edit.parts.MessageName2EditPart;
import ASD.diagram.edit.parts.MessageNameEditPart;
import ASD.diagram.edit.parts.MessageRoleEditPart;
import ASD.diagram.edit.parts.MessageSubsetEditPart;
import ASD.diagram.edit.parts.OperationEditPart;
import ASD.diagram.edit.parts.OperationMessagePatternEditPart;
import ASD.diagram.edit.parts.OperationName2EditPart;
import ASD.diagram.edit.parts.OperationNameEditPart;
import ASD.diagram.edit.parts.OperationOperationAnnotationsCompartmentEditPart;
import ASD.diagram.edit.parts.OperationOperationContentsCompartmentEditPart;
import ASD.diagram.edit.parts.ProfileEditPart;
import ASD.diagram.edit.parts.ProfileName2EditPart;
import ASD.diagram.edit.parts.ProfileNameEditPart;
import ASD.diagram.edit.parts.ProfileProfileAnnotationsCompartmentEditPart;
import ASD.diagram.edit.parts.ProfileProfileSetsCompartmentEditPart;
import ASD.diagram.edit.parts.ProfileRefersEditPart;
import ASD.diagram.edit.parts.ServiceDescriptionEditPart;
import ASD.diagram.edit.parts.WrappingLabel2EditPart;
import ASD.diagram.edit.parts.WrappingLabel3EditPart;
import ASD.diagram.edit.parts.WrappingLabelEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ASDVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "GMF_ASD.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ServiceDescriptionEditPart.MODEL_ID.equals(view.getType())) {
				return ServiceDescriptionEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return ASD.diagram.part.ASDVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				ASDDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ASDPackage.eINSTANCE.getServiceDescription().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((ServiceDescription) domainElement)) {
			return ServiceDescriptionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = ASD.diagram.part.ASDVisualIDRegistry
				.getModelID(containerView);
		if (!ServiceDescriptionEditPart.MODEL_ID.equals(containerModelID)
				&& !"xmi".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (ServiceDescriptionEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = ASD.diagram.part.ASDVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ServiceDescriptionEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ServiceDescriptionEditPart.VISUAL_ID:
			if (ASDPackage.eINSTANCE.getInfoTypeImported().isSuperTypeOf(
					domainElement.eClass())) {
				return InfoTypeImportedEditPart.VISUAL_ID;
			}
			if (ASDPackage.eINSTANCE.getOperation().isSuperTypeOf(
					domainElement.eClass())) {
				return OperationEditPart.VISUAL_ID;
			}
			if (ASDPackage.eINSTANCE.getInfoType().isSuperTypeOf(
					domainElement.eClass())) {
				return InfoTypeEditPart.VISUAL_ID;
			}
			if (ASDPackage.eINSTANCE.getProfile().isSuperTypeOf(
					domainElement.eClass())) {
				return ProfileEditPart.VISUAL_ID;
			}
			if (ASDPackage.eINSTANCE.getAnnotation().isSuperTypeOf(
					domainElement.eClass())) {
				return AnnotationEditPart.VISUAL_ID;
			}
			break;
		case InfoTypeImportedInfoTypeImportedAnnotationsCompartmentEditPart.VISUAL_ID:
			if (ASDPackage.eINSTANCE.getAnnotation().isSuperTypeOf(
					domainElement.eClass())) {
				return Annotation2EditPart.VISUAL_ID;
			}
			break;
		case InfoTypeImportedInfoTypeImportedInfoTypeCompartmentEditPart.VISUAL_ID:
			if (ASDPackage.eINSTANCE.getInfoTypeImported().isSuperTypeOf(
					domainElement.eClass())) {
				return InfoTypeImported2EditPart.VISUAL_ID;
			}
			if (ASDPackage.eINSTANCE.getInfoType().isSuperTypeOf(
					domainElement.eClass())) {
				return InfoType2EditPart.VISUAL_ID;
			}
			break;
		case InfoTypeImportedInfoTypeImportedAnnotationsCompartment2EditPart.VISUAL_ID:
			if (ASDPackage.eINSTANCE.getAnnotation().isSuperTypeOf(
					domainElement.eClass())) {
				return Annotation2EditPart.VISUAL_ID;
			}
			break;
		case InfoTypeImportedInfoTypeImportedInfoTypeCompartment2EditPart.VISUAL_ID:
			if (ASDPackage.eINSTANCE.getInfoTypeImported().isSuperTypeOf(
					domainElement.eClass())) {
				return InfoTypeImported2EditPart.VISUAL_ID;
			}
			if (ASDPackage.eINSTANCE.getInfoType().isSuperTypeOf(
					domainElement.eClass())) {
				return InfoType2EditPart.VISUAL_ID;
			}
			break;
		case InfoTypeInfoTypeAnnotationsCompartmentEditPart.VISUAL_ID:
			if (ASDPackage.eINSTANCE.getAnnotation().isSuperTypeOf(
					domainElement.eClass())) {
				return Annotation2EditPart.VISUAL_ID;
			}
			break;
		case InfoTypeInfoTypeInfoTypeCompartmentEditPart.VISUAL_ID:
			if (ASDPackage.eINSTANCE.getInfoTypeImported().isSuperTypeOf(
					domainElement.eClass())) {
				return InfoTypeImported2EditPart.VISUAL_ID;
			}
			if (ASDPackage.eINSTANCE.getInfoType().isSuperTypeOf(
					domainElement.eClass())) {
				return InfoType2EditPart.VISUAL_ID;
			}
			break;
		case OperationOperationAnnotationsCompartmentEditPart.VISUAL_ID:
			if (ASDPackage.eINSTANCE.getAnnotation().isSuperTypeOf(
					domainElement.eClass())) {
				return Annotation2EditPart.VISUAL_ID;
			}
			break;
		case OperationOperationContentsCompartmentEditPart.VISUAL_ID:
			if (ASDPackage.eINSTANCE.getMessage().isSuperTypeOf(
					domainElement.eClass())) {
				return MessageEditPart.VISUAL_ID;
			}
			break;
		case MessageMessageAnnotationsCompartmentEditPart.VISUAL_ID:
			if (ASDPackage.eINSTANCE.getAnnotation().isSuperTypeOf(
					domainElement.eClass())) {
				return Annotation2EditPart.VISUAL_ID;
			}
			break;
		case InfoTypeInfoTypeAnnotationsCompartment2EditPart.VISUAL_ID:
			if (ASDPackage.eINSTANCE.getAnnotation().isSuperTypeOf(
					domainElement.eClass())) {
				return Annotation2EditPart.VISUAL_ID;
			}
			break;
		case InfoTypeInfoTypeInfoTypeCompartment2EditPart.VISUAL_ID:
			if (ASDPackage.eINSTANCE.getInfoTypeImported().isSuperTypeOf(
					domainElement.eClass())) {
				return InfoTypeImported2EditPart.VISUAL_ID;
			}
			if (ASDPackage.eINSTANCE.getInfoType().isSuperTypeOf(
					domainElement.eClass())) {
				return InfoType2EditPart.VISUAL_ID;
			}
			break;
		case ProfileProfileAnnotationsCompartmentEditPart.VISUAL_ID:
			if (ASDPackage.eINSTANCE.getAnnotation().isSuperTypeOf(
					domainElement.eClass())) {
				return Annotation2EditPart.VISUAL_ID;
			}
			break;
		case ProfileProfileSetsCompartmentEditPart.VISUAL_ID:
			if (ASDPackage.eINSTANCE.getAssertionSet().isSuperTypeOf(
					domainElement.eClass())) {
				return AssertionSetEditPart.VISUAL_ID;
			}
			break;
		case AssertionSetAssertionSetAnnotationsCompartmentEditPart.VISUAL_ID:
			if (ASDPackage.eINSTANCE.getAnnotation().isSuperTypeOf(
					domainElement.eClass())) {
				return Annotation2EditPart.VISUAL_ID;
			}
			break;
		case AssertionSetAssertionSetAssertionsCompartmentEditPart.VISUAL_ID:
			if (ASDPackage.eINSTANCE.getAssertion().isSuperTypeOf(
					domainElement.eClass())) {
				return AssertionEditPart.VISUAL_ID;
			}
			break;
		case AssertionAssertionAnnotationsCompartmentEditPart.VISUAL_ID:
			if (ASDPackage.eINSTANCE.getAnnotation().isSuperTypeOf(
					domainElement.eClass())) {
				return Annotation2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = ASD.diagram.part.ASDVisualIDRegistry
				.getModelID(containerView);
		if (!ServiceDescriptionEditPart.MODEL_ID.equals(containerModelID)
				&& !"xmi".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (ServiceDescriptionEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = ASD.diagram.part.ASDVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ServiceDescriptionEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ServiceDescriptionEditPart.VISUAL_ID:
			if (InfoTypeImportedEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OperationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InfoTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProfileEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnnotationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InfoTypeImportedEditPart.VISUAL_ID:
			if (InfoTypeImportedNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InfoTypeImportedName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InfoTypeImportedValueTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InfoTypeImportedValueRangeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InfoTypeImportedSubsetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InfoTypeImportedUrlEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InfoTypeImportedInfoTypeImportedAnnotationsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InfoTypeImportedInfoTypeImportedInfoTypeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OperationEditPart.VISUAL_ID:
			if (OperationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OperationName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OperationMessagePatternEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OperationOperationAnnotationsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OperationOperationContentsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InfoTypeEditPart.VISUAL_ID:
			if (InfoTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InfoTypeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InfoTypeValueTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InfoTypeValueRangeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InfoTypeSubsetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InfoTypeInfoTypeAnnotationsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InfoTypeInfoTypeInfoTypeCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProfileEditPart.VISUAL_ID:
			if (ProfileNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProfileName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProfileProfileAnnotationsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProfileProfileSetsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AnnotationEditPart.VISUAL_ID:
			if (AnnotationKeyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnnotationKey2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnnotationValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InfoTypeImported2EditPart.VISUAL_ID:
			if (InfoTypeImportedName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InfoTypeImportedName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InfoTypeImportedValueType2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InfoTypeImportedValueRange2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InfoTypeImportedSubset2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InfoTypeImportedUrl2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InfoTypeImportedInfoTypeImportedAnnotationsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InfoTypeImportedInfoTypeImportedInfoTypeCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InfoType2EditPart.VISUAL_ID:
			if (InfoTypeName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InfoTypeName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InfoTypeValueType2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InfoTypeValueRange2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InfoTypeSubset2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InfoTypeInfoTypeAnnotationsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InfoTypeInfoTypeInfoTypeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Annotation2EditPart.VISUAL_ID:
			if (AnnotationKey3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnnotationKey4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AnnotationValue2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MessageEditPart.VISUAL_ID:
			if (MessageNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MessageName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MessageRoleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MessageSubsetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MessageMessageAnnotationsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssertionSetEditPart.VISUAL_ID:
			if (AssertionSetNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssertionSetName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssertionSetLTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssertionSetAssertionSetAnnotationsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssertionSetAssertionSetAssertionsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssertionEditPart.VISUAL_ID:
			if (AssertionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssertionName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssertionDimensionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssertionDimensionTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssertionIntentionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssertionMinValEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssertionMaxValEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssertionLTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssertionSubsetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssertionAssertionAnnotationsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InfoTypeImportedInfoTypeImportedAnnotationsCompartmentEditPart.VISUAL_ID:
			if (Annotation2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InfoTypeImportedInfoTypeImportedInfoTypeCompartmentEditPart.VISUAL_ID:
			if (InfoTypeImported2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InfoType2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InfoTypeImportedInfoTypeImportedAnnotationsCompartment2EditPart.VISUAL_ID:
			if (Annotation2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InfoTypeImportedInfoTypeImportedInfoTypeCompartment2EditPart.VISUAL_ID:
			if (InfoTypeImported2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InfoType2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InfoTypeInfoTypeAnnotationsCompartmentEditPart.VISUAL_ID:
			if (Annotation2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InfoTypeInfoTypeInfoTypeCompartmentEditPart.VISUAL_ID:
			if (InfoTypeImported2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InfoType2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OperationOperationAnnotationsCompartmentEditPart.VISUAL_ID:
			if (Annotation2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OperationOperationContentsCompartmentEditPart.VISUAL_ID:
			if (MessageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MessageMessageAnnotationsCompartmentEditPart.VISUAL_ID:
			if (Annotation2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InfoTypeInfoTypeAnnotationsCompartment2EditPart.VISUAL_ID:
			if (Annotation2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InfoTypeInfoTypeInfoTypeCompartment2EditPart.VISUAL_ID:
			if (InfoTypeImported2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InfoType2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProfileProfileAnnotationsCompartmentEditPart.VISUAL_ID:
			if (Annotation2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProfileProfileSetsCompartmentEditPart.VISUAL_ID:
			if (AssertionSetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssertionSetAssertionSetAnnotationsCompartmentEditPart.VISUAL_ID:
			if (Annotation2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssertionSetAssertionSetAssertionsCompartmentEditPart.VISUAL_ID:
			if (AssertionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssertionAssertionAnnotationsCompartmentEditPart.VISUAL_ID:
			if (Annotation2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MessageInfoTypeEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InfoTypeRefEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProfileRefersEditPart.VISUAL_ID:
			if (WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(ServiceDescription element) {
		return true;
	}

}
