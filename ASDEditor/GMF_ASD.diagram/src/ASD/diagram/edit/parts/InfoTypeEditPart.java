/*
 * 
 */
package ASD.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import ASD.diagram.edit.policies.InfoTypeItemSemanticEditPolicy;
import ASD.diagram.edit.policies.OpenDiagramEditPolicy;
import ASD.diagram.part.ASDVisualIDRegistry;
import ASD.diagram.providers.ASDElementTypes;

/**
 * @generated
 */
public class InfoTypeEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2003;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public InfoTypeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new InfoTypeItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE,
				new OpenDiagramEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new InfoTypeFigure();
	}

	/**
	 * @generated
	 */
	public InfoTypeFigure getPrimaryShape() {
		return (InfoTypeFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof InfoTypeNameEditPart) {
			((InfoTypeNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureInfoTypeLabelFigure());
			return true;
		}
		if (childEditPart instanceof InfoTypeName2EditPart) {
			((InfoTypeName2EditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureNamedElementNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof InfoTypeValueTypeEditPart) {
			((InfoTypeValueTypeEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureInfoTypeValueTypeLabelFigure());
			return true;
		}
		if (childEditPart instanceof InfoTypeValueRangeEditPart) {
			((InfoTypeValueRangeEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureInfoTypeValueRangeLabelFigure());
			return true;
		}
		if (childEditPart instanceof InfoTypeSubsetEditPart) {
			((InfoTypeSubsetEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureInfoTypeSubsetLabelFigure());
			return true;
		}
		if (childEditPart instanceof InfoTypeInfoTypeAnnotationsCompartment2EditPart) {
			IFigure pane = getPrimaryShape()
					.getInfoTypeAnnotationsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((InfoTypeInfoTypeAnnotationsCompartment2EditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof InfoTypeInfoTypeInfoTypeCompartment2EditPart) {
			IFigure pane = getPrimaryShape()
					.getInfoTypeInfoTypeCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((InfoTypeInfoTypeInfoTypeCompartment2EditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof InfoTypeNameEditPart) {
			return true;
		}
		if (childEditPart instanceof InfoTypeName2EditPart) {
			return true;
		}
		if (childEditPart instanceof InfoTypeValueTypeEditPart) {
			return true;
		}
		if (childEditPart instanceof InfoTypeValueRangeEditPart) {
			return true;
		}
		if (childEditPart instanceof InfoTypeSubsetEditPart) {
			return true;
		}
		if (childEditPart instanceof InfoTypeInfoTypeAnnotationsCompartment2EditPart) {
			IFigure pane = getPrimaryShape()
					.getInfoTypeAnnotationsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((InfoTypeInfoTypeAnnotationsCompartment2EditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof InfoTypeInfoTypeInfoTypeCompartment2EditPart) {
			IFigure pane = getPrimaryShape()
					.getInfoTypeInfoTypeCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((InfoTypeInfoTypeInfoTypeCompartment2EditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof InfoTypeInfoTypeAnnotationsCompartment2EditPart) {
			return getPrimaryShape().getInfoTypeAnnotationsCompartmentFigure();
		}
		if (editPart instanceof InfoTypeInfoTypeInfoTypeCompartment2EditPart) {
			return getPrimaryShape().getInfoTypeInfoTypeCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(ASDVisualIDRegistry
				.getType(InfoTypeNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ASDElementTypes.InfoTypeRef_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof InfoTypeImportedEditPart) {
			types.add(ASDElementTypes.InfoTypeRef_4002);
		}
		if (targetEditPart instanceof ASD.diagram.edit.parts.InfoTypeEditPart) {
			types.add(ASDElementTypes.InfoTypeRef_4002);
		}
		if (targetEditPart instanceof InfoTypeImported2EditPart) {
			types.add(ASDElementTypes.InfoTypeRef_4002);
		}
		if (targetEditPart instanceof InfoType2EditPart) {
			types.add(ASDElementTypes.InfoTypeRef_4002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == ASDElementTypes.InfoTypeRef_4002) {
			types.add(ASDElementTypes.InfoTypeImported_2001);
			types.add(ASDElementTypes.InfoType_2003);
			types.add(ASDElementTypes.InfoTypeImported_3001);
			types.add(ASDElementTypes.InfoType_3002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ASDElementTypes.MessageInfoType_4001);
		types.add(ASDElementTypes.InfoTypeRef_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == ASDElementTypes.MessageInfoType_4001) {
			types.add(ASDElementTypes.Message_3004);
		} else if (relationshipType == ASDElementTypes.InfoTypeRef_4002) {
			types.add(ASDElementTypes.InfoTypeImported_2001);
			types.add(ASDElementTypes.InfoType_2003);
			types.add(ASDElementTypes.InfoTypeImported_3001);
			types.add(ASDElementTypes.InfoType_3002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations()
						.equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class InfoTypeFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureInfoTypeLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureNamedElementNameLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureInfoTypeValueTypeLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureInfoTypeValueRangeLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureInfoTypeSubsetLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fInfoTypeAnnotationsCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fInfoTypeInfoTypeCompartmentFigure;

		/**
		 * @generated
		 */
		public InfoTypeFigure() {
			this.setBackgroundColor(THIS_BACK);
			this.setSize(getMapMode().DPtoLP(200), getMapMode().DPtoLP(220));
			this.setBorder(new LineBorder(THIS_BORDER, getMapMode().DPtoLP(2)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureInfoTypeLabelFigure = new WrappingLabel();
			fFigureInfoTypeLabelFigure.setText("InfoType");
			fFigureInfoTypeLabelFigure
					.setForegroundColor(FFIGUREINFOTYPELABELFIGURE_FORE);

			fFigureInfoTypeLabelFigure.setFont(FFIGUREINFOTYPELABELFIGURE_FONT);

			fFigureInfoTypeLabelFigure.setMaximumSize(new Dimension(
					getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureInfoTypeLabelFigure);

			fFigureNamedElementNameLabelFigure = new WrappingLabel();
			fFigureNamedElementNameLabelFigure.setText("");
			fFigureNamedElementNameLabelFigure
					.setForegroundColor(FFIGURENAMEDELEMENTNAMELABELFIGURE_FORE);

			fFigureNamedElementNameLabelFigure
					.setFont(FFIGURENAMEDELEMENTNAMELABELFIGURE_FONT);

			this.add(fFigureNamedElementNameLabelFigure);

			fFigureInfoTypeValueTypeLabelFigure = new WrappingLabel();
			fFigureInfoTypeValueTypeLabelFigure.setText("");
			fFigureInfoTypeValueTypeLabelFigure
					.setForegroundColor(FFIGUREINFOTYPEVALUETYPELABELFIGURE_FORE);

			fFigureInfoTypeValueTypeLabelFigure
					.setFont(FFIGUREINFOTYPEVALUETYPELABELFIGURE_FONT);

			this.add(fFigureInfoTypeValueTypeLabelFigure);

			fFigureInfoTypeValueRangeLabelFigure = new WrappingLabel();
			fFigureInfoTypeValueRangeLabelFigure.setText("");
			fFigureInfoTypeValueRangeLabelFigure
					.setForegroundColor(FFIGUREINFOTYPEVALUERANGELABELFIGURE_FORE);

			fFigureInfoTypeValueRangeLabelFigure
					.setFont(FFIGUREINFOTYPEVALUERANGELABELFIGURE_FONT);

			this.add(fFigureInfoTypeValueRangeLabelFigure);

			fFigureInfoTypeSubsetLabelFigure = new WrappingLabel();
			fFigureInfoTypeSubsetLabelFigure.setText("");
			fFigureInfoTypeSubsetLabelFigure
					.setForegroundColor(FFIGUREINFOTYPESUBSETLABELFIGURE_FORE);

			fFigureInfoTypeSubsetLabelFigure
					.setFont(FFIGUREINFOTYPESUBSETLABELFIGURE_FONT);

			this.add(fFigureInfoTypeSubsetLabelFigure);

			fInfoTypeInfoTypeCompartmentFigure = new RectangleFigure();
			fInfoTypeInfoTypeCompartmentFigure.setOutline(false);

			this.add(fInfoTypeInfoTypeCompartmentFigure);

			fInfoTypeAnnotationsCompartmentFigure = new RectangleFigure();
			fInfoTypeAnnotationsCompartmentFigure.setOutline(false);

			this.add(fInfoTypeAnnotationsCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInfoTypeLabelFigure() {
			return fFigureInfoTypeLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNamedElementNameLabelFigure() {
			return fFigureNamedElementNameLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInfoTypeValueTypeLabelFigure() {
			return fFigureInfoTypeValueTypeLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInfoTypeValueRangeLabelFigure() {
			return fFigureInfoTypeValueRangeLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInfoTypeSubsetLabelFigure() {
			return fFigureInfoTypeSubsetLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getInfoTypeAnnotationsCompartmentFigure() {
			return fInfoTypeAnnotationsCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getInfoTypeInfoTypeCompartmentFigure() {
			return fInfoTypeInfoTypeCompartmentFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 204, 255, 204);

	/**
	 * @generated
	 */
	static final Color THIS_BORDER = new Color(null, 51, 153, 102);

	/**
	 * @generated
	 */
	static final Color FFIGUREINFOTYPELABELFIGURE_FORE = new Color(null, 0, 0,
			0);

	/**
	 * @generated
	 */
	static final Font FFIGUREINFOTYPELABELFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 10, SWT.BOLD);

	/**
	 * @generated
	 */
	static final Color FFIGURENAMEDELEMENTNAMELABELFIGURE_FORE = new Color(
			null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Font FFIGURENAMEDELEMENTNAMELABELFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 8, SWT.NORMAL);

	/**
	 * @generated
	 */
	static final Color FFIGUREINFOTYPEVALUETYPELABELFIGURE_FORE = new Color(
			null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Font FFIGUREINFOTYPEVALUETYPELABELFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 8, SWT.NORMAL);

	/**
	 * @generated
	 */
	static final Color FFIGUREINFOTYPEVALUERANGELABELFIGURE_FORE = new Color(
			null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Font FFIGUREINFOTYPEVALUERANGELABELFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 8, SWT.NORMAL);

	/**
	 * @generated
	 */
	static final Color FFIGUREINFOTYPESUBSETLABELFIGURE_FORE = new Color(null,
			0, 0, 0);

	/**
	 * @generated
	 */
	static final Font FFIGUREINFOTYPESUBSETLABELFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 8, SWT.NORMAL);

}
