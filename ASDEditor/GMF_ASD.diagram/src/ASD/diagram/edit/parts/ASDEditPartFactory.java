/*
 * 
 */
package ASD.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

import ASD.diagram.part.ASDVisualIDRegistry;

/**
 * @generated
 */
public class ASDEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ASDVisualIDRegistry.getVisualID(view)) {

			case ServiceDescriptionEditPart.VISUAL_ID:
				return new ServiceDescriptionEditPart(view);

			case InfoTypeImportedEditPart.VISUAL_ID:
				return new InfoTypeImportedEditPart(view);

			case InfoTypeImportedNameEditPart.VISUAL_ID:
				return new InfoTypeImportedNameEditPart(view);

			case InfoTypeImportedName2EditPart.VISUAL_ID:
				return new InfoTypeImportedName2EditPart(view);

			case InfoTypeImportedValueTypeEditPart.VISUAL_ID:
				return new InfoTypeImportedValueTypeEditPart(view);

			case InfoTypeImportedValueRangeEditPart.VISUAL_ID:
				return new InfoTypeImportedValueRangeEditPart(view);

			case InfoTypeImportedSubsetEditPart.VISUAL_ID:
				return new InfoTypeImportedSubsetEditPart(view);

			case InfoTypeImportedUrlEditPart.VISUAL_ID:
				return new InfoTypeImportedUrlEditPart(view);

			case OperationEditPart.VISUAL_ID:
				return new OperationEditPart(view);

			case OperationNameEditPart.VISUAL_ID:
				return new OperationNameEditPart(view);

			case OperationName2EditPart.VISUAL_ID:
				return new OperationName2EditPart(view);

			case OperationMessagePatternEditPart.VISUAL_ID:
				return new OperationMessagePatternEditPart(view);

			case InfoTypeEditPart.VISUAL_ID:
				return new InfoTypeEditPart(view);

			case InfoTypeNameEditPart.VISUAL_ID:
				return new InfoTypeNameEditPart(view);

			case InfoTypeName2EditPart.VISUAL_ID:
				return new InfoTypeName2EditPart(view);

			case InfoTypeValueTypeEditPart.VISUAL_ID:
				return new InfoTypeValueTypeEditPart(view);

			case InfoTypeValueRangeEditPart.VISUAL_ID:
				return new InfoTypeValueRangeEditPart(view);

			case InfoTypeSubsetEditPart.VISUAL_ID:
				return new InfoTypeSubsetEditPart(view);

			case ProfileEditPart.VISUAL_ID:
				return new ProfileEditPart(view);

			case ProfileNameEditPart.VISUAL_ID:
				return new ProfileNameEditPart(view);

			case ProfileName2EditPart.VISUAL_ID:
				return new ProfileName2EditPart(view);

			case AnnotationEditPart.VISUAL_ID:
				return new AnnotationEditPart(view);

			case AnnotationKeyEditPart.VISUAL_ID:
				return new AnnotationKeyEditPart(view);

			case AnnotationKey2EditPart.VISUAL_ID:
				return new AnnotationKey2EditPart(view);

			case AnnotationValueEditPart.VISUAL_ID:
				return new AnnotationValueEditPart(view);

			case InfoTypeImported2EditPart.VISUAL_ID:
				return new InfoTypeImported2EditPart(view);

			case InfoTypeImportedName3EditPart.VISUAL_ID:
				return new InfoTypeImportedName3EditPart(view);

			case InfoTypeImportedName4EditPart.VISUAL_ID:
				return new InfoTypeImportedName4EditPart(view);

			case InfoTypeImportedValueType2EditPart.VISUAL_ID:
				return new InfoTypeImportedValueType2EditPart(view);

			case InfoTypeImportedValueRange2EditPart.VISUAL_ID:
				return new InfoTypeImportedValueRange2EditPart(view);

			case InfoTypeImportedSubset2EditPart.VISUAL_ID:
				return new InfoTypeImportedSubset2EditPart(view);

			case InfoTypeImportedUrl2EditPart.VISUAL_ID:
				return new InfoTypeImportedUrl2EditPart(view);

			case InfoType2EditPart.VISUAL_ID:
				return new InfoType2EditPart(view);

			case InfoTypeName3EditPart.VISUAL_ID:
				return new InfoTypeName3EditPart(view);

			case InfoTypeName4EditPart.VISUAL_ID:
				return new InfoTypeName4EditPart(view);

			case InfoTypeValueType2EditPart.VISUAL_ID:
				return new InfoTypeValueType2EditPart(view);

			case InfoTypeValueRange2EditPart.VISUAL_ID:
				return new InfoTypeValueRange2EditPart(view);

			case InfoTypeSubset2EditPart.VISUAL_ID:
				return new InfoTypeSubset2EditPart(view);

			case Annotation2EditPart.VISUAL_ID:
				return new Annotation2EditPart(view);

			case AnnotationKey3EditPart.VISUAL_ID:
				return new AnnotationKey3EditPart(view);

			case AnnotationKey4EditPart.VISUAL_ID:
				return new AnnotationKey4EditPart(view);

			case AnnotationValue2EditPart.VISUAL_ID:
				return new AnnotationValue2EditPart(view);

			case MessageEditPart.VISUAL_ID:
				return new MessageEditPart(view);

			case MessageNameEditPart.VISUAL_ID:
				return new MessageNameEditPart(view);

			case MessageName2EditPart.VISUAL_ID:
				return new MessageName2EditPart(view);

			case MessageRoleEditPart.VISUAL_ID:
				return new MessageRoleEditPart(view);

			case MessageSubsetEditPart.VISUAL_ID:
				return new MessageSubsetEditPart(view);

			case AssertionSetEditPart.VISUAL_ID:
				return new AssertionSetEditPart(view);

			case AssertionSetNameEditPart.VISUAL_ID:
				return new AssertionSetNameEditPart(view);

			case AssertionSetName2EditPart.VISUAL_ID:
				return new AssertionSetName2EditPart(view);

			case AssertionSetLTypeEditPart.VISUAL_ID:
				return new AssertionSetLTypeEditPart(view);

			case AssertionEditPart.VISUAL_ID:
				return new AssertionEditPart(view);

			case AssertionNameEditPart.VISUAL_ID:
				return new AssertionNameEditPart(view);

			case AssertionName2EditPart.VISUAL_ID:
				return new AssertionName2EditPart(view);

			case AssertionDimensionEditPart.VISUAL_ID:
				return new AssertionDimensionEditPart(view);

			case AssertionDimensionTypeEditPart.VISUAL_ID:
				return new AssertionDimensionTypeEditPart(view);

			case AssertionIntentionEditPart.VISUAL_ID:
				return new AssertionIntentionEditPart(view);

			case AssertionMinValEditPart.VISUAL_ID:
				return new AssertionMinValEditPart(view);

			case AssertionMaxValEditPart.VISUAL_ID:
				return new AssertionMaxValEditPart(view);

			case AssertionLTypeEditPart.VISUAL_ID:
				return new AssertionLTypeEditPart(view);

			case AssertionSubsetEditPart.VISUAL_ID:
				return new AssertionSubsetEditPart(view);

			case InfoTypeImportedInfoTypeImportedAnnotationsCompartmentEditPart.VISUAL_ID:
				return new InfoTypeImportedInfoTypeImportedAnnotationsCompartmentEditPart(
						view);

			case InfoTypeImportedInfoTypeImportedInfoTypeCompartmentEditPart.VISUAL_ID:
				return new InfoTypeImportedInfoTypeImportedInfoTypeCompartmentEditPart(
						view);

			case InfoTypeImportedInfoTypeImportedAnnotationsCompartment2EditPart.VISUAL_ID:
				return new InfoTypeImportedInfoTypeImportedAnnotationsCompartment2EditPart(
						view);

			case InfoTypeImportedInfoTypeImportedInfoTypeCompartment2EditPart.VISUAL_ID:
				return new InfoTypeImportedInfoTypeImportedInfoTypeCompartment2EditPart(
						view);

			case InfoTypeInfoTypeAnnotationsCompartmentEditPart.VISUAL_ID:
				return new InfoTypeInfoTypeAnnotationsCompartmentEditPart(view);

			case InfoTypeInfoTypeInfoTypeCompartmentEditPart.VISUAL_ID:
				return new InfoTypeInfoTypeInfoTypeCompartmentEditPart(view);

			case OperationOperationAnnotationsCompartmentEditPart.VISUAL_ID:
				return new OperationOperationAnnotationsCompartmentEditPart(
						view);

			case OperationOperationContentsCompartmentEditPart.VISUAL_ID:
				return new OperationOperationContentsCompartmentEditPart(view);

			case MessageMessageAnnotationsCompartmentEditPart.VISUAL_ID:
				return new MessageMessageAnnotationsCompartmentEditPart(view);

			case InfoTypeInfoTypeAnnotationsCompartment2EditPart.VISUAL_ID:
				return new InfoTypeInfoTypeAnnotationsCompartment2EditPart(view);

			case InfoTypeInfoTypeInfoTypeCompartment2EditPart.VISUAL_ID:
				return new InfoTypeInfoTypeInfoTypeCompartment2EditPart(view);

			case ProfileProfileAnnotationsCompartmentEditPart.VISUAL_ID:
				return new ProfileProfileAnnotationsCompartmentEditPart(view);

			case ProfileProfileSetsCompartmentEditPart.VISUAL_ID:
				return new ProfileProfileSetsCompartmentEditPart(view);

			case AssertionSetAssertionSetAnnotationsCompartmentEditPart.VISUAL_ID:
				return new AssertionSetAssertionSetAnnotationsCompartmentEditPart(
						view);

			case AssertionSetAssertionSetAssertionsCompartmentEditPart.VISUAL_ID:
				return new AssertionSetAssertionSetAssertionsCompartmentEditPart(
						view);

			case AssertionAssertionAnnotationsCompartmentEditPart.VISUAL_ID:
				return new AssertionAssertionAnnotationsCompartmentEditPart(
						view);

			case MessageInfoTypeEditPart.VISUAL_ID:
				return new MessageInfoTypeEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case InfoTypeRefEditPart.VISUAL_ID:
				return new InfoTypeRefEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case ProfileRefersEditPart.VISUAL_ID:
				return new ProfileRefersEditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				if (getWrapLabel().isTextWrapOn()
						&& getWrapLabel().getText().length() > 0) {
					rect.setSize(new Dimension(text.computeSize(rect.width,
							SWT.DEFAULT)));
				} else {
					int avr = FigureUtilities.getFontMetrics(text.getFont())
							.getAverageCharWidth();
					rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
							SWT.DEFAULT)).expand(avr * 2, 0));
				}
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
