/*
 * 
 */
package ASD.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import ASD.diagram.edit.parts.AssertionAssertionAnnotationsCompartmentEditPart;
import ASD.diagram.edit.parts.AssertionSetAssertionSetAnnotationsCompartmentEditPart;
import ASD.diagram.edit.parts.AssertionSetAssertionSetAssertionsCompartmentEditPart;
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
import ASD.diagram.edit.parts.MessageEditPart;
import ASD.diagram.edit.parts.MessageMessageAnnotationsCompartmentEditPart;
import ASD.diagram.edit.parts.OperationEditPart;
import ASD.diagram.edit.parts.OperationOperationAnnotationsCompartmentEditPart;
import ASD.diagram.edit.parts.OperationOperationContentsCompartmentEditPart;
import ASD.diagram.edit.parts.ProfileEditPart;
import ASD.diagram.edit.parts.ProfileProfileAnnotationsCompartmentEditPart;
import ASD.diagram.edit.parts.ProfileProfileSetsCompartmentEditPart;
import ASD.diagram.edit.parts.ServiceDescriptionEditPart;
import ASD.diagram.part.ASDDiagramEditorPlugin;
import ASD.diagram.part.Messages;

/**
 * @generated
 */
public class ASDModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof ServiceDescriptionEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(5);
			types.add(ASDElementTypes.InfoTypeImported_2001);
			types.add(ASDElementTypes.Operation_2002);
			types.add(ASDElementTypes.InfoType_2003);
			types.add(ASDElementTypes.Profile_2004);
			types.add(ASDElementTypes.Annotation_2005);
			return types;
		}
		if (editPart instanceof InfoTypeImportedInfoTypeImportedAnnotationsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ASDElementTypes.Annotation_3003);
			return types;
		}
		if (editPart instanceof InfoTypeImportedInfoTypeImportedInfoTypeCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ASDElementTypes.InfoTypeImported_3001);
			types.add(ASDElementTypes.InfoType_3002);
			return types;
		}
		if (editPart instanceof InfoTypeImportedInfoTypeImportedAnnotationsCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ASDElementTypes.Annotation_3003);
			return types;
		}
		if (editPart instanceof InfoTypeImportedInfoTypeImportedInfoTypeCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ASDElementTypes.InfoTypeImported_3001);
			types.add(ASDElementTypes.InfoType_3002);
			return types;
		}
		if (editPart instanceof InfoTypeInfoTypeAnnotationsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ASDElementTypes.Annotation_3003);
			return types;
		}
		if (editPart instanceof InfoTypeInfoTypeInfoTypeCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ASDElementTypes.InfoTypeImported_3001);
			types.add(ASDElementTypes.InfoType_3002);
			return types;
		}
		if (editPart instanceof OperationOperationAnnotationsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ASDElementTypes.Annotation_3003);
			return types;
		}
		if (editPart instanceof OperationOperationContentsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ASDElementTypes.Message_3004);
			return types;
		}
		if (editPart instanceof MessageMessageAnnotationsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ASDElementTypes.Annotation_3003);
			return types;
		}
		if (editPart instanceof InfoTypeInfoTypeAnnotationsCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ASDElementTypes.Annotation_3003);
			return types;
		}
		if (editPart instanceof InfoTypeInfoTypeInfoTypeCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ASDElementTypes.InfoTypeImported_3001);
			types.add(ASDElementTypes.InfoType_3002);
			return types;
		}
		if (editPart instanceof ProfileProfileAnnotationsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ASDElementTypes.Annotation_3003);
			return types;
		}
		if (editPart instanceof ProfileProfileSetsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ASDElementTypes.AssertionSet_3005);
			return types;
		}
		if (editPart instanceof AssertionSetAssertionSetAnnotationsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ASDElementTypes.Annotation_3003);
			return types;
		}
		if (editPart instanceof AssertionSetAssertionSetAssertionsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ASDElementTypes.Assertion_3006);
			return types;
		}
		if (editPart instanceof AssertionAssertionAnnotationsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ASDElementTypes.Annotation_3003);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof InfoTypeImportedEditPart) {
			return ((InfoTypeImportedEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof InfoTypeEditPart) {
			return ((InfoTypeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ProfileEditPart) {
			return ((ProfileEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof InfoTypeImported2EditPart) {
			return ((InfoTypeImported2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof InfoType2EditPart) {
			return ((InfoType2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof MessageEditPart) {
			return ((MessageEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof InfoTypeImportedEditPart) {
			return ((InfoTypeImportedEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof OperationEditPart) {
			return ((OperationEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof InfoTypeEditPart) {
			return ((InfoTypeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof InfoTypeImported2EditPart) {
			return ((InfoTypeImported2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof InfoType2EditPart) {
			return ((InfoType2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof InfoTypeImportedEditPart) {
			return ((InfoTypeImportedEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof InfoTypeEditPart) {
			return ((InfoTypeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ProfileEditPart) {
			return ((ProfileEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof InfoTypeImported2EditPart) {
			return ((InfoTypeImported2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof InfoType2EditPart) {
			return ((InfoType2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof MessageEditPart) {
			return ((MessageEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof InfoTypeImportedEditPart) {
			return ((InfoTypeImportedEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof OperationEditPart) {
			return ((OperationEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof InfoTypeEditPart) {
			return ((InfoTypeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof InfoTypeImported2EditPart) {
			return ((InfoTypeImported2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof InfoType2EditPart) {
			return ((InfoType2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof InfoTypeImportedEditPart) {
			return ((InfoTypeImportedEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof InfoTypeEditPart) {
			return ((InfoTypeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ProfileEditPart) {
			return ((ProfileEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof InfoTypeImported2EditPart) {
			return ((InfoTypeImported2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof InfoType2EditPart) {
			return ((InfoType2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof MessageEditPart) {
			return ((MessageEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
				.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				ASDDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.ASDModelingAssistantProviderMessage);
		dialog.setTitle(Messages.ASDModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
