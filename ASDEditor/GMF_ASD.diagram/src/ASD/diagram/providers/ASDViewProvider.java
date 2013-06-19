/*
 * 
 */
package ASD.diagram.providers;

import java.util.ArrayList;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.providers.IViewProvider;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateEdgeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateNodeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewForKindOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewOperation;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.DecorationNode;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.MeasurementUnit;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.RelativeBendpoints;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.gmf.runtime.notation.TitleStyle;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;

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
import ASD.diagram.part.ASDVisualIDRegistry;

/**
 * @generated
 */
public class ASDViewProvider extends AbstractProvider implements IViewProvider {

	/**
	 * @generated
	 */
	public final boolean provides(IOperation operation) {
		if (operation instanceof CreateViewForKindOperation) {
			return provides((CreateViewForKindOperation) operation);
		}
		assert operation instanceof CreateViewOperation;
		if (operation instanceof CreateDiagramViewOperation) {
			return provides((CreateDiagramViewOperation) operation);
		} else if (operation instanceof CreateEdgeViewOperation) {
			return provides((CreateEdgeViewOperation) operation);
		} else if (operation instanceof CreateNodeViewOperation) {
			return provides((CreateNodeViewOperation) operation);
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateViewForKindOperation op) {
		/*
		 if (op.getViewKind() == Node.class)
		 return getNodeViewClass(op.getSemanticAdapter(), op.getContainerView(), op.getSemanticHint()) != null;
		 if (op.getViewKind() == Edge.class)
		 return getEdgeViewClass(op.getSemanticAdapter(), op.getContainerView(), op.getSemanticHint()) != null;
		 */
		return true;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateDiagramViewOperation op) {
		return ServiceDescriptionEditPart.MODEL_ID.equals(op.getSemanticHint())
				&& ASDVisualIDRegistry.getDiagramVisualID(getSemanticElement(op
						.getSemanticAdapter())) != -1;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateNodeViewOperation op) {
		if (op.getContainerView() == null) {
			return false;
		}
		IElementType elementType = getSemanticElementType(op
				.getSemanticAdapter());
		EObject domainElement = getSemanticElement(op.getSemanticAdapter());
		int visualID;
		if (op.getSemanticHint() == null) {
			// Semantic hint is not specified. Can be a result of call from CanonicalEditPolicy.
			// In this situation there should be NO elementType, visualID will be determined
			// by VisualIDRegistry.getNodeVisualID() for domainElement.
			if (elementType != null || domainElement == null) {
				return false;
			}
			visualID = ASDVisualIDRegistry.getNodeVisualID(
					op.getContainerView(), domainElement);
		} else {
			visualID = ASDVisualIDRegistry.getVisualID(op.getSemanticHint());
			if (elementType != null) {
				if (!ASDElementTypes.isKnownElementType(elementType)
						|| (!(elementType instanceof IHintedType))) {
					return false; // foreign element type
				}
				String elementTypeHint = ((IHintedType) elementType)
						.getSemanticHint();
				if (!op.getSemanticHint().equals(elementTypeHint)) {
					return false; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null
						&& visualID != ASDVisualIDRegistry.getNodeVisualID(
								op.getContainerView(), domainElement)) {
					return false; // visual id for node EClass should match visual id from element type
				}
			} else {
				if (!ServiceDescriptionEditPart.MODEL_ID
						.equals(ASDVisualIDRegistry.getModelID(op
								.getContainerView()))) {
					return false; // foreign diagram
				}
				switch (visualID) {
				case InfoTypeImportedEditPart.VISUAL_ID:
				case OperationEditPart.VISUAL_ID:
				case ProfileEditPart.VISUAL_ID:
				case InfoType2EditPart.VISUAL_ID:
				case Annotation2EditPart.VISUAL_ID:
				case MessageEditPart.VISUAL_ID:
				case AssertionSetEditPart.VISUAL_ID:
				case AssertionEditPart.VISUAL_ID:
				case InfoTypeEditPart.VISUAL_ID:
				case AnnotationEditPart.VISUAL_ID:
				case InfoTypeImported2EditPart.VISUAL_ID:
					if (domainElement == null
							|| visualID != ASDVisualIDRegistry.getNodeVisualID(
									op.getContainerView(), domainElement)) {
						return false; // visual id in semantic hint should match visual id for domain element
					}
					break;
				default:
					return false;
				}
			}
		}
		return InfoTypeImportedEditPart.VISUAL_ID == visualID
				|| OperationEditPart.VISUAL_ID == visualID
				|| InfoTypeEditPart.VISUAL_ID == visualID
				|| ProfileEditPart.VISUAL_ID == visualID
				|| AnnotationEditPart.VISUAL_ID == visualID
				|| InfoTypeImported2EditPart.VISUAL_ID == visualID
				|| InfoType2EditPart.VISUAL_ID == visualID
				|| Annotation2EditPart.VISUAL_ID == visualID
				|| MessageEditPart.VISUAL_ID == visualID
				|| AssertionSetEditPart.VISUAL_ID == visualID
				|| AssertionEditPart.VISUAL_ID == visualID;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateEdgeViewOperation op) {
		IElementType elementType = getSemanticElementType(op
				.getSemanticAdapter());
		if (!ASDElementTypes.isKnownElementType(elementType)
				|| (!(elementType instanceof IHintedType))) {
			return false; // foreign element type
		}
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		if (elementTypeHint == null
				|| (op.getSemanticHint() != null && !elementTypeHint.equals(op
						.getSemanticHint()))) {
			return false; // our hint is visual id and must be specified, and it should be the same as in element type
		}
		int visualID = ASDVisualIDRegistry.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(op.getSemanticAdapter());
		if (domainElement != null
				&& visualID != ASDVisualIDRegistry
						.getLinkWithClassVisualID(domainElement)) {
			return false; // visual id for link EClass should match visual id from element type
		}
		return true;
	}

	/**
	 * @generated
	 */
	public Diagram createDiagram(IAdaptable semanticAdapter,
			String diagramKind, PreferencesHint preferencesHint) {
		Diagram diagram = NotationFactory.eINSTANCE.createDiagram();
		diagram.getStyles().add(NotationFactory.eINSTANCE.createDiagramStyle());
		diagram.setType(ServiceDescriptionEditPart.MODEL_ID);
		diagram.setElement(getSemanticElement(semanticAdapter));
		diagram.setMeasurementUnit(MeasurementUnit.PIXEL_LITERAL);
		return diagram;
	}

	/**
	 * @generated
	 */
	public Node createNode(IAdaptable semanticAdapter, View containerView,
			String semanticHint, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		final EObject domainElement = getSemanticElement(semanticAdapter);
		final int visualID;
		if (semanticHint == null) {
			visualID = ASDVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		} else {
			visualID = ASDVisualIDRegistry.getVisualID(semanticHint);
		}
		switch (visualID) {
		case InfoTypeImportedEditPart.VISUAL_ID:
			return createInfoTypeImported_2001(domainElement, containerView,
					index, persisted, preferencesHint);
		case OperationEditPart.VISUAL_ID:
			return createOperation_2002(domainElement, containerView, index,
					persisted, preferencesHint);
		case InfoTypeEditPart.VISUAL_ID:
			return createInfoType_2003(domainElement, containerView, index,
					persisted, preferencesHint);
		case ProfileEditPart.VISUAL_ID:
			return createProfile_2004(domainElement, containerView, index,
					persisted, preferencesHint);
		case AnnotationEditPart.VISUAL_ID:
			return createAnnotation_2005(domainElement, containerView, index,
					persisted, preferencesHint);
		case InfoTypeImported2EditPart.VISUAL_ID:
			return createInfoTypeImported_3001(domainElement, containerView,
					index, persisted, preferencesHint);
		case InfoType2EditPart.VISUAL_ID:
			return createInfoType_3002(domainElement, containerView, index,
					persisted, preferencesHint);
		case Annotation2EditPart.VISUAL_ID:
			return createAnnotation_3003(domainElement, containerView, index,
					persisted, preferencesHint);
		case MessageEditPart.VISUAL_ID:
			return createMessage_3004(domainElement, containerView, index,
					persisted, preferencesHint);
		case AssertionSetEditPart.VISUAL_ID:
			return createAssertionSet_3005(domainElement, containerView, index,
					persisted, preferencesHint);
		case AssertionEditPart.VISUAL_ID:
			return createAssertion_3006(domainElement, containerView, index,
					persisted, preferencesHint);
		}
		// can't happen, provided #provides(CreateNodeViewOperation) is correct
		return null;
	}

	/**
	 * @generated
	 */
	public Edge createEdge(IAdaptable semanticAdapter, View containerView,
			String semanticHint, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		switch (ASDVisualIDRegistry.getVisualID(elementTypeHint)) {
		case MessageInfoTypeEditPart.VISUAL_ID:
			return createMessageInfoType_4001(containerView, index, persisted,
					preferencesHint);
		case InfoTypeRefEditPart.VISUAL_ID:
			return createInfoTypeRef_4002(containerView, index, persisted,
					preferencesHint);
		case ProfileRefersEditPart.VISUAL_ID:
			return createProfileRefers_4003(containerView, index, persisted,
					preferencesHint);
		}
		// can never happen, provided #provides(CreateEdgeViewOperation) is correct
		return null;
	}

	/**
	 * @generated
	 */
	public Node createInfoTypeImported_2001(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles()
				.add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createLineStyle());
		node.getStyles().add(
				NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(ASDVisualIDRegistry
				.getType(InfoTypeImportedEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Node label5015 = createLabel(node,
				ASDVisualIDRegistry
						.getType(InfoTypeImportedNameEditPart.VISUAL_ID));
		Node label5016 = createLabel(node,
				ASDVisualIDRegistry
						.getType(InfoTypeImportedName2EditPart.VISUAL_ID));
		Node label5017 = createLabel(node,
				ASDVisualIDRegistry
						.getType(InfoTypeImportedValueTypeEditPart.VISUAL_ID));
		Node label5018 = createLabel(node,
				ASDVisualIDRegistry
						.getType(InfoTypeImportedValueRangeEditPart.VISUAL_ID));
		Node label5019 = createLabel(node,
				ASDVisualIDRegistry
						.getType(InfoTypeImportedSubsetEditPart.VISUAL_ID));
		Node label5020 = createLabel(node,
				ASDVisualIDRegistry
						.getType(InfoTypeImportedUrlEditPart.VISUAL_ID));
		createCompartment(
				node,
				ASDVisualIDRegistry
						.getType(InfoTypeImportedInfoTypeImportedAnnotationsCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		createCompartment(
				node,
				ASDVisualIDRegistry
						.getType(InfoTypeImportedInfoTypeImportedInfoTypeCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createOperation_2002(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles()
				.add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createLineStyle());
		node.getStyles().add(
				NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(ASDVisualIDRegistry.getType(OperationEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Node label5025 = createLabel(node,
				ASDVisualIDRegistry.getType(OperationNameEditPart.VISUAL_ID));
		Node label5026 = createLabel(node,
				ASDVisualIDRegistry.getType(OperationName2EditPart.VISUAL_ID));
		Node label5027 = createLabel(node,
				ASDVisualIDRegistry
						.getType(OperationMessagePatternEditPart.VISUAL_ID));
		createCompartment(
				node,
				ASDVisualIDRegistry
						.getType(OperationOperationAnnotationsCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		createCompartment(
				node,
				ASDVisualIDRegistry
						.getType(OperationOperationContentsCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createInfoType_2003(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles()
				.add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createLineStyle());
		node.getStyles().add(
				NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(ASDVisualIDRegistry.getType(InfoTypeEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Node label5028 = createLabel(node,
				ASDVisualIDRegistry.getType(InfoTypeNameEditPart.VISUAL_ID));
		Node label5029 = createLabel(node,
				ASDVisualIDRegistry.getType(InfoTypeName2EditPart.VISUAL_ID));
		Node label5030 = createLabel(node,
				ASDVisualIDRegistry
						.getType(InfoTypeValueTypeEditPart.VISUAL_ID));
		Node label5031 = createLabel(node,
				ASDVisualIDRegistry
						.getType(InfoTypeValueRangeEditPart.VISUAL_ID));
		Node label5032 = createLabel(node,
				ASDVisualIDRegistry.getType(InfoTypeSubsetEditPart.VISUAL_ID));
		createCompartment(
				node,
				ASDVisualIDRegistry
						.getType(InfoTypeInfoTypeAnnotationsCompartment2EditPart.VISUAL_ID),
				true, false, false, false);
		createCompartment(
				node,
				ASDVisualIDRegistry
						.getType(InfoTypeInfoTypeInfoTypeCompartment2EditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createProfile_2004(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles()
				.add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createLineStyle());
		node.getStyles().add(
				NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(ASDVisualIDRegistry.getType(ProfileEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Node label5045 = createLabel(node,
				ASDVisualIDRegistry.getType(ProfileNameEditPart.VISUAL_ID));
		Node label5046 = createLabel(node,
				ASDVisualIDRegistry.getType(ProfileName2EditPart.VISUAL_ID));
		createCompartment(
				node,
				ASDVisualIDRegistry
						.getType(ProfileProfileAnnotationsCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		createCompartment(
				node,
				ASDVisualIDRegistry
						.getType(ProfileProfileSetsCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createAnnotation_2005(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles()
				.add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createLineStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(ASDVisualIDRegistry.getType(AnnotationEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Node label5047 = createLabel(node,
				ASDVisualIDRegistry.getType(AnnotationKeyEditPart.VISUAL_ID));
		Node label5048 = createLabel(node,
				ASDVisualIDRegistry.getType(AnnotationKey2EditPart.VISUAL_ID));
		Node label5049 = createLabel(node,
				ASDVisualIDRegistry.getType(AnnotationValueEditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createInfoTypeImported_3001(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles()
				.add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createLineStyle());
		node.getStyles().add(
				NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(ASDVisualIDRegistry
				.getType(InfoTypeImported2EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Node label5009 = createLabel(node,
				ASDVisualIDRegistry
						.getType(InfoTypeImportedName3EditPart.VISUAL_ID));
		Node label5010 = createLabel(node,
				ASDVisualIDRegistry
						.getType(InfoTypeImportedName4EditPart.VISUAL_ID));
		Node label5011 = createLabel(node,
				ASDVisualIDRegistry
						.getType(InfoTypeImportedValueType2EditPart.VISUAL_ID));
		Node label5012 = createLabel(node,
				ASDVisualIDRegistry
						.getType(InfoTypeImportedValueRange2EditPart.VISUAL_ID));
		Node label5013 = createLabel(node,
				ASDVisualIDRegistry
						.getType(InfoTypeImportedSubset2EditPart.VISUAL_ID));
		Node label5014 = createLabel(node,
				ASDVisualIDRegistry
						.getType(InfoTypeImportedUrl2EditPart.VISUAL_ID));
		createCompartment(
				node,
				ASDVisualIDRegistry
						.getType(InfoTypeImportedInfoTypeImportedAnnotationsCompartment2EditPart.VISUAL_ID),
				true, false, false, false);
		createCompartment(
				node,
				ASDVisualIDRegistry
						.getType(InfoTypeImportedInfoTypeImportedInfoTypeCompartment2EditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createInfoType_3002(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles()
				.add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createLineStyle());
		node.getStyles().add(
				NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(ASDVisualIDRegistry.getType(InfoType2EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Node label5004 = createLabel(node,
				ASDVisualIDRegistry.getType(InfoTypeName3EditPart.VISUAL_ID));
		Node label5005 = createLabel(node,
				ASDVisualIDRegistry.getType(InfoTypeName4EditPart.VISUAL_ID));
		Node label5006 = createLabel(node,
				ASDVisualIDRegistry
						.getType(InfoTypeValueType2EditPart.VISUAL_ID));
		Node label5007 = createLabel(node,
				ASDVisualIDRegistry
						.getType(InfoTypeValueRange2EditPart.VISUAL_ID));
		Node label5008 = createLabel(node,
				ASDVisualIDRegistry.getType(InfoTypeSubset2EditPart.VISUAL_ID));
		createCompartment(
				node,
				ASDVisualIDRegistry
						.getType(InfoTypeInfoTypeAnnotationsCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		createCompartment(
				node,
				ASDVisualIDRegistry
						.getType(InfoTypeInfoTypeInfoTypeCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createAnnotation_3003(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles()
				.add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createLineStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(ASDVisualIDRegistry.getType(Annotation2EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Node label5001 = createLabel(node,
				ASDVisualIDRegistry.getType(AnnotationKey3EditPart.VISUAL_ID));
		Node label5002 = createLabel(node,
				ASDVisualIDRegistry.getType(AnnotationKey4EditPart.VISUAL_ID));
		Node label5003 = createLabel(node,
				ASDVisualIDRegistry.getType(AnnotationValue2EditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createMessage_3004(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles()
				.add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createLineStyle());
		node.getStyles().add(
				NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(ASDVisualIDRegistry.getType(MessageEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Node label5021 = createLabel(node,
				ASDVisualIDRegistry.getType(MessageNameEditPart.VISUAL_ID));
		Node label5022 = createLabel(node,
				ASDVisualIDRegistry.getType(MessageName2EditPart.VISUAL_ID));
		Node label5023 = createLabel(node,
				ASDVisualIDRegistry.getType(MessageRoleEditPart.VISUAL_ID));
		Node label5024 = createLabel(node,
				ASDVisualIDRegistry.getType(MessageSubsetEditPart.VISUAL_ID));
		createCompartment(
				node,
				ASDVisualIDRegistry
						.getType(MessageMessageAnnotationsCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createAssertionSet_3005(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles()
				.add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createLineStyle());
		node.getStyles().add(
				NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(ASDVisualIDRegistry
				.getType(AssertionSetEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Node label5042 = createLabel(node,
				ASDVisualIDRegistry.getType(AssertionSetNameEditPart.VISUAL_ID));
		Node label5043 = createLabel(node,
				ASDVisualIDRegistry
						.getType(AssertionSetName2EditPart.VISUAL_ID));
		Node label5044 = createLabel(node,
				ASDVisualIDRegistry
						.getType(AssertionSetLTypeEditPart.VISUAL_ID));
		createCompartment(
				node,
				ASDVisualIDRegistry
						.getType(AssertionSetAssertionSetAnnotationsCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		createCompartment(
				node,
				ASDVisualIDRegistry
						.getType(AssertionSetAssertionSetAssertionsCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createAssertion_3006(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles()
				.add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		node.getStyles().add(NotationFactory.eINSTANCE.createLineStyle());
		node.getStyles().add(
				NotationFactory.eINSTANCE.createHintedDiagramLinkStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(ASDVisualIDRegistry.getType(AssertionEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Node label5033 = createLabel(node,
				ASDVisualIDRegistry.getType(AssertionNameEditPart.VISUAL_ID));
		Node label5034 = createLabel(node,
				ASDVisualIDRegistry.getType(AssertionName2EditPart.VISUAL_ID));
		Node label5035 = createLabel(node,
				ASDVisualIDRegistry
						.getType(AssertionDimensionEditPart.VISUAL_ID));
		Node label5036 = createLabel(node,
				ASDVisualIDRegistry
						.getType(AssertionDimensionTypeEditPart.VISUAL_ID));
		Node label5037 = createLabel(node,
				ASDVisualIDRegistry
						.getType(AssertionIntentionEditPart.VISUAL_ID));
		Node label5038 = createLabel(node,
				ASDVisualIDRegistry.getType(AssertionMinValEditPart.VISUAL_ID));
		Node label5039 = createLabel(node,
				ASDVisualIDRegistry.getType(AssertionMaxValEditPart.VISUAL_ID));
		Node label5040 = createLabel(node,
				ASDVisualIDRegistry.getType(AssertionLTypeEditPart.VISUAL_ID));
		Node label5041 = createLabel(node,
				ASDVisualIDRegistry.getType(AssertionSubsetEditPart.VISUAL_ID));
		createCompartment(
				node,
				ASDVisualIDRegistry
						.getType(AssertionAssertionAnnotationsCompartmentEditPart.VISUAL_ID),
				true, false, false, false);
		return node;
	}

	/**
	 * @generated
	 */
	public Edge createMessageInfoType_4001(View containerView, int index,
			boolean persisted, PreferencesHint preferencesHint) {
		Edge edge = NotationFactory.eINSTANCE.createEdge();
		edge.getStyles().add(NotationFactory.eINSTANCE.createRoutingStyle());
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE
				.createRelativeBendpoints();
		ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(
				2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(ASDVisualIDRegistry
				.getType(MessageInfoTypeEditPart.VISUAL_ID));
		edge.setElement(null);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();
		FontStyle edgeFontStyle = (FontStyle) edge
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Routing routing = Routing.get(prefStore
				.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge,
					NotationPackage.eINSTANCE.getRoutingStyle_Routing(),
					routing);
		}
		Node label6001 = createLabel(edge,
				ASDVisualIDRegistry.getType(WrappingLabelEditPart.VISUAL_ID));
		label6001.getStyles().add(
				NotationFactory.eINSTANCE.createDescriptionStyle());
		label6001.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location6001 = (Location) label6001.getLayoutConstraint();
		location6001.setX(0);
		location6001.setY(40);
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createInfoTypeRef_4002(View containerView, int index,
			boolean persisted, PreferencesHint preferencesHint) {
		Edge edge = NotationFactory.eINSTANCE.createEdge();
		edge.getStyles().add(NotationFactory.eINSTANCE.createRoutingStyle());
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE
				.createRelativeBendpoints();
		ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(
				2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(ASDVisualIDRegistry.getType(InfoTypeRefEditPart.VISUAL_ID));
		edge.setElement(null);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();
		FontStyle edgeFontStyle = (FontStyle) edge
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Routing routing = Routing.get(prefStore
				.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge,
					NotationPackage.eINSTANCE.getRoutingStyle_Routing(),
					routing);
		}
		Node label6002 = createLabel(edge,
				ASDVisualIDRegistry.getType(WrappingLabel2EditPart.VISUAL_ID));
		label6002.getStyles().add(
				NotationFactory.eINSTANCE.createDescriptionStyle());
		label6002.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location6002 = (Location) label6002.getLayoutConstraint();
		location6002.setX(0);
		location6002.setY(40);
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createProfileRefers_4003(View containerView, int index,
			boolean persisted, PreferencesHint preferencesHint) {
		Edge edge = NotationFactory.eINSTANCE.createEdge();
		edge.getStyles().add(NotationFactory.eINSTANCE.createRoutingStyle());
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE
				.createRelativeBendpoints();
		ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(
				2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(ASDVisualIDRegistry
				.getType(ProfileRefersEditPart.VISUAL_ID));
		edge.setElement(null);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();
		FontStyle edgeFontStyle = (FontStyle) edge
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Routing routing = Routing.get(prefStore
				.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge,
					NotationPackage.eINSTANCE.getRoutingStyle_Routing(),
					routing);
		}
		Node label6003 = createLabel(edge,
				ASDVisualIDRegistry.getType(WrappingLabel3EditPart.VISUAL_ID));
		label6003.getStyles().add(
				NotationFactory.eINSTANCE.createDescriptionStyle());
		label6003.setLayoutConstraint(NotationFactory.eINSTANCE
				.createLocation());
		Location location6003 = (Location) label6003.getLayoutConstraint();
		location6003.setX(0);
		location6003.setY(40);
		return edge;
	}

	/**
	 * @generated
	 */
	private void stampShortcut(View containerView, Node target) {
		if (!ServiceDescriptionEditPart.MODEL_ID.equals(ASDVisualIDRegistry
				.getModelID(containerView))) {
			EAnnotation shortcutAnnotation = EcoreFactory.eINSTANCE
					.createEAnnotation();
			shortcutAnnotation.setSource("Shortcut"); //$NON-NLS-1$
			shortcutAnnotation.getDetails().put(
					"modelID", ServiceDescriptionEditPart.MODEL_ID); //$NON-NLS-1$
			target.getEAnnotations().add(shortcutAnnotation);
		}
	}

	/**
	 * @generated
	 */
	private Node createLabel(View owner, String hint) {
		DecorationNode rv = NotationFactory.eINSTANCE.createDecorationNode();
		rv.setType(hint);
		ViewUtil.insertChildView(owner, rv, ViewUtil.APPEND, true);
		return rv;
	}

	/**
	 * @generated
	 */
	private Node createCompartment(View owner, String hint,
			boolean canCollapse, boolean hasTitle, boolean canSort,
			boolean canFilter) {
		//SemanticListCompartment rv = NotationFactory.eINSTANCE.createSemanticListCompartment();
		//rv.setShowTitle(showTitle);
		//rv.setCollapsed(isCollapsed);
		Node rv;
		if (canCollapse) {
			rv = NotationFactory.eINSTANCE.createBasicCompartment();
		} else {
			rv = NotationFactory.eINSTANCE.createDecorationNode();
		}
		if (hasTitle) {
			TitleStyle ts = NotationFactory.eINSTANCE.createTitleStyle();
			ts.setShowTitle(true);
			rv.getStyles().add(ts);
		}
		if (canSort) {
			rv.getStyles().add(NotationFactory.eINSTANCE.createSortingStyle());
		}
		if (canFilter) {
			rv.getStyles()
					.add(NotationFactory.eINSTANCE.createFilteringStyle());
		}
		rv.setType(hint);
		ViewUtil.insertChildView(owner, rv, ViewUtil.APPEND, true);
		return rv;
	}

	/**
	 * @generated
	 */
	private EObject getSemanticElement(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		EObject eObject = (EObject) semanticAdapter.getAdapter(EObject.class);
		if (eObject != null) {
			return EMFCoreUtil.resolve(
					TransactionUtil.getEditingDomain(eObject), eObject);
		}
		return null;
	}

	/**
	 * @generated
	 */
	private IElementType getSemanticElementType(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		return (IElementType) semanticAdapter.getAdapter(IElementType.class);
	}
}
