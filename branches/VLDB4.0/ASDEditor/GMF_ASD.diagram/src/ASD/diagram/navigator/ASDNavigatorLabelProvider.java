/*
 * 
 */
package ASD.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import ASD.ServiceDescription;
import ASD.diagram.edit.parts.Annotation2EditPart;
import ASD.diagram.edit.parts.AnnotationEditPart;
import ASD.diagram.edit.parts.AnnotationKey3EditPart;
import ASD.diagram.edit.parts.AnnotationKeyEditPart;
import ASD.diagram.edit.parts.AssertionEditPart;
import ASD.diagram.edit.parts.AssertionNameEditPart;
import ASD.diagram.edit.parts.AssertionSetEditPart;
import ASD.diagram.edit.parts.AssertionSetNameEditPart;
import ASD.diagram.edit.parts.InfoType2EditPart;
import ASD.diagram.edit.parts.InfoTypeEditPart;
import ASD.diagram.edit.parts.InfoTypeImported2EditPart;
import ASD.diagram.edit.parts.InfoTypeImportedEditPart;
import ASD.diagram.edit.parts.InfoTypeImportedName3EditPart;
import ASD.diagram.edit.parts.InfoTypeImportedNameEditPart;
import ASD.diagram.edit.parts.InfoTypeName3EditPart;
import ASD.diagram.edit.parts.InfoTypeNameEditPart;
import ASD.diagram.edit.parts.InfoTypeRefEditPart;
import ASD.diagram.edit.parts.MessageEditPart;
import ASD.diagram.edit.parts.MessageInfoTypeEditPart;
import ASD.diagram.edit.parts.MessageNameEditPart;
import ASD.diagram.edit.parts.OperationEditPart;
import ASD.diagram.edit.parts.OperationNameEditPart;
import ASD.diagram.edit.parts.ProfileEditPart;
import ASD.diagram.edit.parts.ProfileNameEditPart;
import ASD.diagram.edit.parts.ProfileRefersEditPart;
import ASD.diagram.edit.parts.ServiceDescriptionEditPart;
import ASD.diagram.part.ASDDiagramEditorPlugin;
import ASD.diagram.part.ASDVisualIDRegistry;
import ASD.diagram.providers.ASDElementTypes;
import ASD.diagram.providers.ASDParserProvider;

/**
 * @generated
 */
public class ASDNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		ASDDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		ASDDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ASDNavigatorItem
				&& !isOwnView(((ASDNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof ASDNavigatorGroup) {
			ASDNavigatorGroup group = (ASDNavigatorGroup) element;
			return ASDDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof ASDNavigatorItem) {
			ASDNavigatorItem navigatorItem = (ASDNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (ASDVisualIDRegistry.getVisualID(view)) {
		case InfoTypeRefEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ASD?InfoType?ref", ASDElementTypes.InfoTypeRef_4002); //$NON-NLS-1$
		case MessageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ASD?Message", ASDElementTypes.Message_3004); //$NON-NLS-1$
		case MessageInfoTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ASD?Message?infoType", ASDElementTypes.MessageInfoType_4001); //$NON-NLS-1$
		case Annotation2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ASD?Annotation", ASDElementTypes.Annotation_3003); //$NON-NLS-1$
		case InfoType2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ASD?InfoType", ASDElementTypes.InfoType_3002); //$NON-NLS-1$
		case ProfileEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ASD?Profile", ASDElementTypes.Profile_2004); //$NON-NLS-1$
		case OperationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ASD?Operation", ASDElementTypes.Operation_2002); //$NON-NLS-1$
		case InfoTypeImported2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ASD?InfoTypeImported", ASDElementTypes.InfoTypeImported_3001); //$NON-NLS-1$
		case InfoTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ASD?InfoType", ASDElementTypes.InfoType_2003); //$NON-NLS-1$
		case InfoTypeImportedEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ASD?InfoTypeImported", ASDElementTypes.InfoTypeImported_2001); //$NON-NLS-1$
		case AnnotationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ASD?Annotation", ASDElementTypes.Annotation_2005); //$NON-NLS-1$
		case AssertionSetEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ASD?AssertionSet", ASDElementTypes.AssertionSet_3005); //$NON-NLS-1$
		case AssertionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ASD?Assertion", ASDElementTypes.Assertion_3006); //$NON-NLS-1$
		case ServiceDescriptionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://ASD?ServiceDescription", ASDElementTypes.ServiceDescription_1000); //$NON-NLS-1$
		case ProfileRefersEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ASD?Profile?refers", ASDElementTypes.ProfileRefers_4003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ASDDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& ASDElementTypes.isKnownElementType(elementType)) {
			image = ASDElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof ASDNavigatorGroup) {
			ASDNavigatorGroup group = (ASDNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ASDNavigatorItem) {
			ASDNavigatorItem navigatorItem = (ASDNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (ASDVisualIDRegistry.getVisualID(view)) {
		case InfoTypeRefEditPart.VISUAL_ID:
			return getInfoTypeRef_4002Text(view);
		case MessageEditPart.VISUAL_ID:
			return getMessage_3004Text(view);
		case MessageInfoTypeEditPart.VISUAL_ID:
			return getMessageInfoType_4001Text(view);
		case Annotation2EditPart.VISUAL_ID:
			return getAnnotation_3003Text(view);
		case InfoType2EditPart.VISUAL_ID:
			return getInfoType_3002Text(view);
		case ProfileEditPart.VISUAL_ID:
			return getProfile_2004Text(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_2002Text(view);
		case InfoTypeImported2EditPart.VISUAL_ID:
			return getInfoTypeImported_3001Text(view);
		case InfoTypeEditPart.VISUAL_ID:
			return getInfoType_2003Text(view);
		case InfoTypeImportedEditPart.VISUAL_ID:
			return getInfoTypeImported_2001Text(view);
		case AnnotationEditPart.VISUAL_ID:
			return getAnnotation_2005Text(view);
		case AssertionSetEditPart.VISUAL_ID:
			return getAssertionSet_3005Text(view);
		case AssertionEditPart.VISUAL_ID:
			return getAssertion_3006Text(view);
		case ServiceDescriptionEditPart.VISUAL_ID:
			return getServiceDescription_1000Text(view);
		case ProfileRefersEditPart.VISUAL_ID:
			return getProfileRefers_4003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getInfoTypeRef_4002Text(View view) {
		IParser parser = ASDParserProvider.getParser(
				ASDElementTypes.InfoTypeRef_4002,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASDDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMessage_3004Text(View view) {
		IParser parser = ASDParserProvider.getParser(
				ASDElementTypes.Message_3004,
				view.getElement() != null ? view.getElement() : view,
				ASDVisualIDRegistry.getType(MessageNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASDDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMessageInfoType_4001Text(View view) {
		IParser parser = ASDParserProvider.getParser(
				ASDElementTypes.MessageInfoType_4001,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASDDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAnnotation_3003Text(View view) {
		IParser parser = ASDParserProvider.getParser(
				ASDElementTypes.Annotation_3003,
				view.getElement() != null ? view.getElement() : view,
				ASDVisualIDRegistry.getType(AnnotationKey3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASDDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInfoType_3002Text(View view) {
		IParser parser = ASDParserProvider.getParser(
				ASDElementTypes.InfoType_3002,
				view.getElement() != null ? view.getElement() : view,
				ASDVisualIDRegistry.getType(InfoTypeName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASDDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProfile_2004Text(View view) {
		IParser parser = ASDParserProvider.getParser(
				ASDElementTypes.Profile_2004,
				view.getElement() != null ? view.getElement() : view,
				ASDVisualIDRegistry.getType(ProfileNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASDDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5045); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOperation_2002Text(View view) {
		IParser parser = ASDParserProvider.getParser(
				ASDElementTypes.Operation_2002,
				view.getElement() != null ? view.getElement() : view,
				ASDVisualIDRegistry.getType(OperationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASDDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInfoTypeImported_3001Text(View view) {
		IParser parser = ASDParserProvider.getParser(
				ASDElementTypes.InfoTypeImported_3001,
				view.getElement() != null ? view.getElement() : view,
				ASDVisualIDRegistry
						.getType(InfoTypeImportedName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASDDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInfoType_2003Text(View view) {
		IParser parser = ASDParserProvider.getParser(
				ASDElementTypes.InfoType_2003,
				view.getElement() != null ? view.getElement() : view,
				ASDVisualIDRegistry.getType(InfoTypeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASDDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInfoTypeImported_2001Text(View view) {
		IParser parser = ASDParserProvider.getParser(
				ASDElementTypes.InfoTypeImported_2001,
				view.getElement() != null ? view.getElement() : view,
				ASDVisualIDRegistry
						.getType(InfoTypeImportedNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASDDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAnnotation_2005Text(View view) {
		IParser parser = ASDParserProvider.getParser(
				ASDElementTypes.Annotation_2005,
				view.getElement() != null ? view.getElement() : view,
				ASDVisualIDRegistry.getType(AnnotationKeyEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASDDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5047); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssertionSet_3005Text(View view) {
		IParser parser = ASDParserProvider
				.getParser(ASDElementTypes.AssertionSet_3005,
						view.getElement() != null ? view.getElement() : view,
						ASDVisualIDRegistry
								.getType(AssertionSetNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASDDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5042); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssertion_3006Text(View view) {
		IParser parser = ASDParserProvider.getParser(
				ASDElementTypes.Assertion_3006,
				view.getElement() != null ? view.getElement() : view,
				ASDVisualIDRegistry.getType(AssertionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASDDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getServiceDescription_1000Text(View view) {
		ServiceDescription domainModelElement = (ServiceDescription) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ASDDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProfileRefers_4003Text(View view) {
		IParser parser = ASDParserProvider.getParser(
				ASDElementTypes.ProfileRefers_4003,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ASDDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ServiceDescriptionEditPart.MODEL_ID.equals(ASDVisualIDRegistry
				.getModelID(view));
	}

}
