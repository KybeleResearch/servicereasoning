/*
 * 
 */
package ASD.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

import ASD.ASDPackage;
import ASD.Annotation;
import ASD.Assertion;
import ASD.AssertionSet;
import ASD.InfoType;
import ASD.InfoTypeImported;
import ASD.Message;
import ASD.Operation;
import ASD.Profile;
import ASD.ServiceDescription;
import ASD.diagram.edit.parts.Annotation2EditPart;
import ASD.diagram.edit.parts.AnnotationEditPart;
import ASD.diagram.edit.parts.AssertionAssertionAnnotationsCompartmentEditPart;
import ASD.diagram.edit.parts.AssertionEditPart;
import ASD.diagram.edit.parts.AssertionSetAssertionSetAnnotationsCompartmentEditPart;
import ASD.diagram.edit.parts.AssertionSetAssertionSetAssertionsCompartmentEditPart;
import ASD.diagram.edit.parts.AssertionSetEditPart;
import ASD.diagram.edit.parts.InfoType2EditPart;
import ASD.diagram.edit.parts.InfoTypeEditPart;
import ASD.diagram.edit.parts.InfoTypeImported2EditPart;
import ASD.diagram.edit.parts.InfoTypeImportedEditPart;
import ASD.diagram.edit.parts.InfoTypeImportedInfoTypeImportedAnnotationsCompartment2EditPart;
import ASD.diagram.edit.parts.InfoTypeImportedInfoTypeImportedAnnotationsCompartmentEditPart;
import ASD.diagram.edit.parts.InfoTypeImportedInfoTypeImportedInfoTypeCompartment2EditPart;
import ASD.diagram.edit.parts.InfoTypeImportedInfoTypeImportedInfoTypeCompartmentEditPart;
import ASD.diagram.edit.parts.InfoTypeInfoTypeAnnotationsCompartment2EditPart;
import ASD.diagram.edit.parts.InfoTypeInfoTypeAnnotationsCompartmentEditPart;
import ASD.diagram.edit.parts.InfoTypeInfoTypeInfoTypeCompartment2EditPart;
import ASD.diagram.edit.parts.InfoTypeInfoTypeInfoTypeCompartmentEditPart;
import ASD.diagram.edit.parts.InfoTypeRefEditPart;
import ASD.diagram.edit.parts.MessageEditPart;
import ASD.diagram.edit.parts.MessageInfoTypeEditPart;
import ASD.diagram.edit.parts.MessageMessageAnnotationsCompartmentEditPart;
import ASD.diagram.edit.parts.OperationEditPart;
import ASD.diagram.edit.parts.OperationOperationAnnotationsCompartmentEditPart;
import ASD.diagram.edit.parts.OperationOperationContentsCompartmentEditPart;
import ASD.diagram.edit.parts.ProfileEditPart;
import ASD.diagram.edit.parts.ProfileProfileAnnotationsCompartmentEditPart;
import ASD.diagram.edit.parts.ProfileProfileSetsCompartmentEditPart;
import ASD.diagram.edit.parts.ProfileRefersEditPart;
import ASD.diagram.edit.parts.ServiceDescriptionEditPart;
import ASD.diagram.providers.ASDElementTypes;

/**
 * @generated
 */
public class ASDDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<ASDNodeDescriptor> getSemanticChildren(View view) {
		switch (ASDVisualIDRegistry.getVisualID(view)) {
		case ServiceDescriptionEditPart.VISUAL_ID:
			return getServiceDescription_1000SemanticChildren(view);
		case InfoTypeImportedInfoTypeImportedAnnotationsCompartmentEditPart.VISUAL_ID:
			return getInfoTypeImportedInfoTypeImportedAnnotationsCompartment_7001SemanticChildren(view);
		case InfoTypeImportedInfoTypeImportedInfoTypeCompartmentEditPart.VISUAL_ID:
			return getInfoTypeImportedInfoTypeImportedInfoTypeCompartment_7002SemanticChildren(view);
		case InfoTypeImportedInfoTypeImportedAnnotationsCompartment2EditPart.VISUAL_ID:
			return getInfoTypeImportedInfoTypeImportedAnnotationsCompartment_7003SemanticChildren(view);
		case InfoTypeImportedInfoTypeImportedInfoTypeCompartment2EditPart.VISUAL_ID:
			return getInfoTypeImportedInfoTypeImportedInfoTypeCompartment_7004SemanticChildren(view);
		case InfoTypeInfoTypeAnnotationsCompartmentEditPart.VISUAL_ID:
			return getInfoTypeInfoTypeAnnotationsCompartment_7005SemanticChildren(view);
		case InfoTypeInfoTypeInfoTypeCompartmentEditPart.VISUAL_ID:
			return getInfoTypeInfoTypeInfoTypeCompartment_7006SemanticChildren(view);
		case OperationOperationAnnotationsCompartmentEditPart.VISUAL_ID:
			return getOperationOperationAnnotationsCompartment_7007SemanticChildren(view);
		case OperationOperationContentsCompartmentEditPart.VISUAL_ID:
			return getOperationOperationContentsCompartment_7008SemanticChildren(view);
		case MessageMessageAnnotationsCompartmentEditPart.VISUAL_ID:
			return getMessageMessageAnnotationsCompartment_7009SemanticChildren(view);
		case InfoTypeInfoTypeAnnotationsCompartment2EditPart.VISUAL_ID:
			return getInfoTypeInfoTypeAnnotationsCompartment_7010SemanticChildren(view);
		case InfoTypeInfoTypeInfoTypeCompartment2EditPart.VISUAL_ID:
			return getInfoTypeInfoTypeInfoTypeCompartment_7011SemanticChildren(view);
		case ProfileProfileAnnotationsCompartmentEditPart.VISUAL_ID:
			return getProfileProfileAnnotationsCompartment_7012SemanticChildren(view);
		case ProfileProfileSetsCompartmentEditPart.VISUAL_ID:
			return getProfileProfileSetsCompartment_7013SemanticChildren(view);
		case AssertionSetAssertionSetAnnotationsCompartmentEditPart.VISUAL_ID:
			return getAssertionSetAssertionSetAnnotationsCompartment_7014SemanticChildren(view);
		case AssertionSetAssertionSetAssertionsCompartmentEditPart.VISUAL_ID:
			return getAssertionSetAssertionSetAssertionsCompartment_7015SemanticChildren(view);
		case AssertionAssertionAnnotationsCompartmentEditPart.VISUAL_ID:
			return getAssertionAssertionAnnotationsCompartment_7016SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASDNodeDescriptor> getServiceDescription_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ServiceDescription modelElement = (ServiceDescription) view
				.getElement();
		LinkedList<ASDNodeDescriptor> result = new LinkedList<ASDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInfotypes().iterator(); it
				.hasNext();) {
			InfoType childElement = (InfoType) it.next();
			int visualID = ASDVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InfoTypeImportedEditPart.VISUAL_ID) {
				result.add(new ASDNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InfoTypeEditPart.VISUAL_ID) {
				result.add(new ASDNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOperations().iterator(); it
				.hasNext();) {
			Operation childElement = (Operation) it.next();
			int visualID = ASDVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OperationEditPart.VISUAL_ID) {
				result.add(new ASDNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getProfiles().iterator(); it
				.hasNext();) {
			Profile childElement = (Profile) it.next();
			int visualID = ASDVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ProfileEditPart.VISUAL_ID) {
				result.add(new ASDNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getAnnotations().iterator(); it
				.hasNext();) {
			Annotation childElement = (Annotation) it.next();
			int visualID = ASDVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AnnotationEditPart.VISUAL_ID) {
				result.add(new ASDNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASDNodeDescriptor> getInfoTypeImportedInfoTypeImportedAnnotationsCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		InfoTypeImported modelElement = (InfoTypeImported) containerView
				.getElement();
		LinkedList<ASDNodeDescriptor> result = new LinkedList<ASDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAnnotations().iterator(); it
				.hasNext();) {
			Annotation childElement = (Annotation) it.next();
			int visualID = ASDVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Annotation2EditPart.VISUAL_ID) {
				result.add(new ASDNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASDNodeDescriptor> getInfoTypeImportedInfoTypeImportedInfoTypeCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		InfoTypeImported modelElement = (InfoTypeImported) containerView
				.getElement();
		LinkedList<ASDNodeDescriptor> result = new LinkedList<ASDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInfoType().iterator(); it
				.hasNext();) {
			InfoType childElement = (InfoType) it.next();
			int visualID = ASDVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InfoTypeImported2EditPart.VISUAL_ID) {
				result.add(new ASDNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InfoType2EditPart.VISUAL_ID) {
				result.add(new ASDNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASDNodeDescriptor> getInfoTypeImportedInfoTypeImportedAnnotationsCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		InfoTypeImported modelElement = (InfoTypeImported) containerView
				.getElement();
		LinkedList<ASDNodeDescriptor> result = new LinkedList<ASDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAnnotations().iterator(); it
				.hasNext();) {
			Annotation childElement = (Annotation) it.next();
			int visualID = ASDVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Annotation2EditPart.VISUAL_ID) {
				result.add(new ASDNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASDNodeDescriptor> getInfoTypeImportedInfoTypeImportedInfoTypeCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		InfoTypeImported modelElement = (InfoTypeImported) containerView
				.getElement();
		LinkedList<ASDNodeDescriptor> result = new LinkedList<ASDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInfoType().iterator(); it
				.hasNext();) {
			InfoType childElement = (InfoType) it.next();
			int visualID = ASDVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InfoTypeImported2EditPart.VISUAL_ID) {
				result.add(new ASDNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InfoType2EditPart.VISUAL_ID) {
				result.add(new ASDNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASDNodeDescriptor> getInfoTypeInfoTypeAnnotationsCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		InfoType modelElement = (InfoType) containerView.getElement();
		LinkedList<ASDNodeDescriptor> result = new LinkedList<ASDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAnnotations().iterator(); it
				.hasNext();) {
			Annotation childElement = (Annotation) it.next();
			int visualID = ASDVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Annotation2EditPart.VISUAL_ID) {
				result.add(new ASDNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASDNodeDescriptor> getInfoTypeInfoTypeInfoTypeCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		InfoType modelElement = (InfoType) containerView.getElement();
		LinkedList<ASDNodeDescriptor> result = new LinkedList<ASDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInfoType().iterator(); it
				.hasNext();) {
			InfoType childElement = (InfoType) it.next();
			int visualID = ASDVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InfoTypeImported2EditPart.VISUAL_ID) {
				result.add(new ASDNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InfoType2EditPart.VISUAL_ID) {
				result.add(new ASDNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASDNodeDescriptor> getOperationOperationAnnotationsCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Operation modelElement = (Operation) containerView.getElement();
		LinkedList<ASDNodeDescriptor> result = new LinkedList<ASDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAnnotations().iterator(); it
				.hasNext();) {
			Annotation childElement = (Annotation) it.next();
			int visualID = ASDVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Annotation2EditPart.VISUAL_ID) {
				result.add(new ASDNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASDNodeDescriptor> getOperationOperationContentsCompartment_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Operation modelElement = (Operation) containerView.getElement();
		LinkedList<ASDNodeDescriptor> result = new LinkedList<ASDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getContents().iterator(); it
				.hasNext();) {
			Message childElement = (Message) it.next();
			int visualID = ASDVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MessageEditPart.VISUAL_ID) {
				result.add(new ASDNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASDNodeDescriptor> getMessageMessageAnnotationsCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Message modelElement = (Message) containerView.getElement();
		LinkedList<ASDNodeDescriptor> result = new LinkedList<ASDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAnnotations().iterator(); it
				.hasNext();) {
			Annotation childElement = (Annotation) it.next();
			int visualID = ASDVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Annotation2EditPart.VISUAL_ID) {
				result.add(new ASDNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASDNodeDescriptor> getInfoTypeInfoTypeAnnotationsCompartment_7010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		InfoType modelElement = (InfoType) containerView.getElement();
		LinkedList<ASDNodeDescriptor> result = new LinkedList<ASDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAnnotations().iterator(); it
				.hasNext();) {
			Annotation childElement = (Annotation) it.next();
			int visualID = ASDVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Annotation2EditPart.VISUAL_ID) {
				result.add(new ASDNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASDNodeDescriptor> getInfoTypeInfoTypeInfoTypeCompartment_7011SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		InfoType modelElement = (InfoType) containerView.getElement();
		LinkedList<ASDNodeDescriptor> result = new LinkedList<ASDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInfoType().iterator(); it
				.hasNext();) {
			InfoType childElement = (InfoType) it.next();
			int visualID = ASDVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InfoTypeImported2EditPart.VISUAL_ID) {
				result.add(new ASDNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InfoType2EditPart.VISUAL_ID) {
				result.add(new ASDNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASDNodeDescriptor> getProfileProfileAnnotationsCompartment_7012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Profile modelElement = (Profile) containerView.getElement();
		LinkedList<ASDNodeDescriptor> result = new LinkedList<ASDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAnnotations().iterator(); it
				.hasNext();) {
			Annotation childElement = (Annotation) it.next();
			int visualID = ASDVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Annotation2EditPart.VISUAL_ID) {
				result.add(new ASDNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASDNodeDescriptor> getProfileProfileSetsCompartment_7013SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Profile modelElement = (Profile) containerView.getElement();
		LinkedList<ASDNodeDescriptor> result = new LinkedList<ASDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSets().iterator(); it.hasNext();) {
			AssertionSet childElement = (AssertionSet) it.next();
			int visualID = ASDVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AssertionSetEditPart.VISUAL_ID) {
				result.add(new ASDNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASDNodeDescriptor> getAssertionSetAssertionSetAnnotationsCompartment_7014SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AssertionSet modelElement = (AssertionSet) containerView.getElement();
		LinkedList<ASDNodeDescriptor> result = new LinkedList<ASDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAnnotations().iterator(); it
				.hasNext();) {
			Annotation childElement = (Annotation) it.next();
			int visualID = ASDVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Annotation2EditPart.VISUAL_ID) {
				result.add(new ASDNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASDNodeDescriptor> getAssertionSetAssertionSetAssertionsCompartment_7015SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AssertionSet modelElement = (AssertionSet) containerView.getElement();
		LinkedList<ASDNodeDescriptor> result = new LinkedList<ASDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAssertions().iterator(); it
				.hasNext();) {
			Assertion childElement = (Assertion) it.next();
			int visualID = ASDVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AssertionEditPart.VISUAL_ID) {
				result.add(new ASDNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASDNodeDescriptor> getAssertionAssertionAnnotationsCompartment_7016SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Assertion modelElement = (Assertion) containerView.getElement();
		LinkedList<ASDNodeDescriptor> result = new LinkedList<ASDNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAnnotations().iterator(); it
				.hasNext();) {
			Annotation childElement = (Annotation) it.next();
			int visualID = ASDVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Annotation2EditPart.VISUAL_ID) {
				result.add(new ASDNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASDLinkDescriptor> getContainedLinks(View view) {
		switch (ASDVisualIDRegistry.getVisualID(view)) {
		case ServiceDescriptionEditPart.VISUAL_ID:
			return getServiceDescription_1000ContainedLinks(view);
		case InfoTypeImportedEditPart.VISUAL_ID:
			return getInfoTypeImported_2001ContainedLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_2002ContainedLinks(view);
		case InfoTypeEditPart.VISUAL_ID:
			return getInfoType_2003ContainedLinks(view);
		case ProfileEditPart.VISUAL_ID:
			return getProfile_2004ContainedLinks(view);
		case AnnotationEditPart.VISUAL_ID:
			return getAnnotation_2005ContainedLinks(view);
		case InfoTypeImported2EditPart.VISUAL_ID:
			return getInfoTypeImported_3001ContainedLinks(view);
		case InfoType2EditPart.VISUAL_ID:
			return getInfoType_3002ContainedLinks(view);
		case Annotation2EditPart.VISUAL_ID:
			return getAnnotation_3003ContainedLinks(view);
		case MessageEditPart.VISUAL_ID:
			return getMessage_3004ContainedLinks(view);
		case AssertionSetEditPart.VISUAL_ID:
			return getAssertionSet_3005ContainedLinks(view);
		case AssertionEditPart.VISUAL_ID:
			return getAssertion_3006ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASDLinkDescriptor> getIncomingLinks(View view) {
		switch (ASDVisualIDRegistry.getVisualID(view)) {
		case InfoTypeImportedEditPart.VISUAL_ID:
			return getInfoTypeImported_2001IncomingLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_2002IncomingLinks(view);
		case InfoTypeEditPart.VISUAL_ID:
			return getInfoType_2003IncomingLinks(view);
		case ProfileEditPart.VISUAL_ID:
			return getProfile_2004IncomingLinks(view);
		case AnnotationEditPart.VISUAL_ID:
			return getAnnotation_2005IncomingLinks(view);
		case InfoTypeImported2EditPart.VISUAL_ID:
			return getInfoTypeImported_3001IncomingLinks(view);
		case InfoType2EditPart.VISUAL_ID:
			return getInfoType_3002IncomingLinks(view);
		case Annotation2EditPart.VISUAL_ID:
			return getAnnotation_3003IncomingLinks(view);
		case MessageEditPart.VISUAL_ID:
			return getMessage_3004IncomingLinks(view);
		case AssertionSetEditPart.VISUAL_ID:
			return getAssertionSet_3005IncomingLinks(view);
		case AssertionEditPart.VISUAL_ID:
			return getAssertion_3006IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASDLinkDescriptor> getOutgoingLinks(View view) {
		switch (ASDVisualIDRegistry.getVisualID(view)) {
		case InfoTypeImportedEditPart.VISUAL_ID:
			return getInfoTypeImported_2001OutgoingLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_2002OutgoingLinks(view);
		case InfoTypeEditPart.VISUAL_ID:
			return getInfoType_2003OutgoingLinks(view);
		case ProfileEditPart.VISUAL_ID:
			return getProfile_2004OutgoingLinks(view);
		case AnnotationEditPart.VISUAL_ID:
			return getAnnotation_2005OutgoingLinks(view);
		case InfoTypeImported2EditPart.VISUAL_ID:
			return getInfoTypeImported_3001OutgoingLinks(view);
		case InfoType2EditPart.VISUAL_ID:
			return getInfoType_3002OutgoingLinks(view);
		case Annotation2EditPart.VISUAL_ID:
			return getAnnotation_3003OutgoingLinks(view);
		case MessageEditPart.VISUAL_ID:
			return getMessage_3004OutgoingLinks(view);
		case AssertionSetEditPart.VISUAL_ID:
			return getAssertionSet_3005OutgoingLinks(view);
		case AssertionEditPart.VISUAL_ID:
			return getAssertion_3006OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASDLinkDescriptor> getServiceDescription_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASDLinkDescriptor> getInfoTypeImported_2001ContainedLinks(
			View view) {
		InfoTypeImported modelElement = (InfoTypeImported) view.getElement();
		LinkedList<ASDLinkDescriptor> result = new LinkedList<ASDLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_InfoType_Ref_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASDLinkDescriptor> getOperation_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASDLinkDescriptor> getInfoType_2003ContainedLinks(
			View view) {
		InfoType modelElement = (InfoType) view.getElement();
		LinkedList<ASDLinkDescriptor> result = new LinkedList<ASDLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_InfoType_Ref_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASDLinkDescriptor> getProfile_2004ContainedLinks(
			View view) {
		Profile modelElement = (Profile) view.getElement();
		LinkedList<ASDLinkDescriptor> result = new LinkedList<ASDLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Profile_Refers_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASDLinkDescriptor> getAnnotation_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASDLinkDescriptor> getInfoTypeImported_3001ContainedLinks(
			View view) {
		InfoTypeImported modelElement = (InfoTypeImported) view.getElement();
		LinkedList<ASDLinkDescriptor> result = new LinkedList<ASDLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_InfoType_Ref_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASDLinkDescriptor> getInfoType_3002ContainedLinks(
			View view) {
		InfoType modelElement = (InfoType) view.getElement();
		LinkedList<ASDLinkDescriptor> result = new LinkedList<ASDLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_InfoType_Ref_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASDLinkDescriptor> getAnnotation_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASDLinkDescriptor> getMessage_3004ContainedLinks(
			View view) {
		Message modelElement = (Message) view.getElement();
		LinkedList<ASDLinkDescriptor> result = new LinkedList<ASDLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Message_InfoType_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASDLinkDescriptor> getAssertionSet_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASDLinkDescriptor> getAssertion_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASDLinkDescriptor> getInfoTypeImported_2001IncomingLinks(
			View view) {
		InfoTypeImported modelElement = (InfoTypeImported) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ASDLinkDescriptor> result = new LinkedList<ASDLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Message_InfoType_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_InfoType_Ref_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASDLinkDescriptor> getOperation_2002IncomingLinks(
			View view) {
		Operation modelElement = (Operation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ASDLinkDescriptor> result = new LinkedList<ASDLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Profile_Refers_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASDLinkDescriptor> getInfoType_2003IncomingLinks(
			View view) {
		InfoType modelElement = (InfoType) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ASDLinkDescriptor> result = new LinkedList<ASDLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Message_InfoType_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_InfoType_Ref_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASDLinkDescriptor> getProfile_2004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASDLinkDescriptor> getAnnotation_2005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASDLinkDescriptor> getInfoTypeImported_3001IncomingLinks(
			View view) {
		InfoTypeImported modelElement = (InfoTypeImported) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ASDLinkDescriptor> result = new LinkedList<ASDLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Message_InfoType_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_InfoType_Ref_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASDLinkDescriptor> getInfoType_3002IncomingLinks(
			View view) {
		InfoType modelElement = (InfoType) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ASDLinkDescriptor> result = new LinkedList<ASDLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Message_InfoType_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_InfoType_Ref_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASDLinkDescriptor> getAnnotation_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASDLinkDescriptor> getMessage_3004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASDLinkDescriptor> getAssertionSet_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASDLinkDescriptor> getAssertion_3006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASDLinkDescriptor> getInfoTypeImported_2001OutgoingLinks(
			View view) {
		InfoTypeImported modelElement = (InfoTypeImported) view.getElement();
		LinkedList<ASDLinkDescriptor> result = new LinkedList<ASDLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_InfoType_Ref_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASDLinkDescriptor> getOperation_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASDLinkDescriptor> getInfoType_2003OutgoingLinks(
			View view) {
		InfoType modelElement = (InfoType) view.getElement();
		LinkedList<ASDLinkDescriptor> result = new LinkedList<ASDLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_InfoType_Ref_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASDLinkDescriptor> getProfile_2004OutgoingLinks(View view) {
		Profile modelElement = (Profile) view.getElement();
		LinkedList<ASDLinkDescriptor> result = new LinkedList<ASDLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Profile_Refers_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASDLinkDescriptor> getAnnotation_2005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASDLinkDescriptor> getInfoTypeImported_3001OutgoingLinks(
			View view) {
		InfoTypeImported modelElement = (InfoTypeImported) view.getElement();
		LinkedList<ASDLinkDescriptor> result = new LinkedList<ASDLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_InfoType_Ref_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASDLinkDescriptor> getInfoType_3002OutgoingLinks(
			View view) {
		InfoType modelElement = (InfoType) view.getElement();
		LinkedList<ASDLinkDescriptor> result = new LinkedList<ASDLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_InfoType_Ref_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASDLinkDescriptor> getAnnotation_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASDLinkDescriptor> getMessage_3004OutgoingLinks(View view) {
		Message modelElement = (Message) view.getElement();
		LinkedList<ASDLinkDescriptor> result = new LinkedList<ASDLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Message_InfoType_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ASDLinkDescriptor> getAssertionSet_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ASDLinkDescriptor> getAssertion_3006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<ASDLinkDescriptor> getIncomingFeatureModelFacetLinks_Message_InfoType_4001(
			InfoType target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ASDLinkDescriptor> result = new LinkedList<ASDLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ASDPackage.eINSTANCE
					.getMessage_InfoType()) {
				result.add(new ASDLinkDescriptor(setting.getEObject(), target,
						ASDElementTypes.MessageInfoType_4001,
						MessageInfoTypeEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ASDLinkDescriptor> getIncomingFeatureModelFacetLinks_InfoType_Ref_4002(
			InfoType target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ASDLinkDescriptor> result = new LinkedList<ASDLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ASDPackage.eINSTANCE
					.getInfoType_Ref()) {
				result.add(new ASDLinkDescriptor(setting.getEObject(), target,
						ASDElementTypes.InfoTypeRef_4002,
						InfoTypeRefEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ASDLinkDescriptor> getIncomingFeatureModelFacetLinks_Profile_Refers_4003(
			Operation target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ASDLinkDescriptor> result = new LinkedList<ASDLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ASDPackage.eINSTANCE
					.getProfile_Refers()) {
				result.add(new ASDLinkDescriptor(setting.getEObject(), target,
						ASDElementTypes.ProfileRefers_4003,
						ProfileRefersEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ASDLinkDescriptor> getOutgoingFeatureModelFacetLinks_Message_InfoType_4001(
			Message source) {
		LinkedList<ASDLinkDescriptor> result = new LinkedList<ASDLinkDescriptor>();
		for (Iterator<?> destinations = source.getInfoType().iterator(); destinations
				.hasNext();) {
			InfoType destination = (InfoType) destinations.next();
			result.add(new ASDLinkDescriptor(source, destination,
					ASDElementTypes.MessageInfoType_4001,
					MessageInfoTypeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ASDLinkDescriptor> getOutgoingFeatureModelFacetLinks_InfoType_Ref_4002(
			InfoType source) {
		LinkedList<ASDLinkDescriptor> result = new LinkedList<ASDLinkDescriptor>();
		InfoType destination = source.getRef();
		if (destination == null) {
			return result;
		}
		result.add(new ASDLinkDescriptor(source, destination,
				ASDElementTypes.InfoTypeRef_4002, InfoTypeRefEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ASDLinkDescriptor> getOutgoingFeatureModelFacetLinks_Profile_Refers_4003(
			Profile source) {
		LinkedList<ASDLinkDescriptor> result = new LinkedList<ASDLinkDescriptor>();
		for (Iterator<?> destinations = source.getRefers().iterator(); destinations
				.hasNext();) {
			Operation destination = (Operation) destinations.next();
			result.add(new ASDLinkDescriptor(source, destination,
					ASDElementTypes.ProfileRefers_4003,
					ProfileRefersEditPart.VISUAL_ID));
		}
		return result;
	}

}
