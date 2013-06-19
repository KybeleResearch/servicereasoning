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

import ASD.diagram.edit.policies.MessageItemSemanticEditPolicy;
import ASD.diagram.edit.policies.OpenDiagramEditPolicy;
import ASD.diagram.part.ASDVisualIDRegistry;
import ASD.diagram.providers.ASDElementTypes;

/**
 * @generated
 */
public class MessageEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3004;

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
	public MessageEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new MessageItemSemanticEditPolicy());
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
		return primaryShape = new MessageFigure();
	}

	/**
	 * @generated
	 */
	public MessageFigure getPrimaryShape() {
		return (MessageFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof MessageNameEditPart) {
			((MessageNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureMessageLabelFigure());
			return true;
		}
		if (childEditPart instanceof MessageName2EditPart) {
			((MessageName2EditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureNamedElementNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof MessageRoleEditPart) {
			((MessageRoleEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureMessageRoleLabelFigure());
			return true;
		}
		if (childEditPart instanceof MessageSubsetEditPart) {
			((MessageSubsetEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureMessageSubsetLabelFigure());
			return true;
		}
		if (childEditPart instanceof MessageMessageAnnotationsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getMessageAnnotationsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((MessageMessageAnnotationsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof MessageNameEditPart) {
			return true;
		}
		if (childEditPart instanceof MessageName2EditPart) {
			return true;
		}
		if (childEditPart instanceof MessageRoleEditPart) {
			return true;
		}
		if (childEditPart instanceof MessageSubsetEditPart) {
			return true;
		}
		if (childEditPart instanceof MessageMessageAnnotationsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getMessageAnnotationsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((MessageMessageAnnotationsCompartmentEditPart) childEditPart)
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
		if (editPart instanceof MessageMessageAnnotationsCompartmentEditPart) {
			return getPrimaryShape().getMessageAnnotationsCompartmentFigure();
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
				.getType(MessageNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ASDElementTypes.MessageInfoType_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof InfoTypeImportedEditPart) {
			types.add(ASDElementTypes.MessageInfoType_4001);
		}
		if (targetEditPart instanceof InfoTypeEditPart) {
			types.add(ASDElementTypes.MessageInfoType_4001);
		}
		if (targetEditPart instanceof InfoTypeImported2EditPart) {
			types.add(ASDElementTypes.MessageInfoType_4001);
		}
		if (targetEditPart instanceof InfoType2EditPart) {
			types.add(ASDElementTypes.MessageInfoType_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == ASDElementTypes.MessageInfoType_4001) {
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
	public class MessageFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureMessageLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureNamedElementNameLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMessageRoleLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMessageSubsetLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fMessageAnnotationsCompartmentFigure;

		/**
		 * @generated
		 */
		public MessageFigure() {
			this.setBackgroundColor(THIS_BACK);
			this.setSize(getMapMode().DPtoLP(200), getMapMode().DPtoLP(220));
			this.setBorder(new LineBorder(THIS_BORDER, getMapMode().DPtoLP(2)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureMessageLabelFigure = new WrappingLabel();
			fFigureMessageLabelFigure.setText("Message");
			fFigureMessageLabelFigure
					.setForegroundColor(FFIGUREMESSAGELABELFIGURE_FORE);

			fFigureMessageLabelFigure.setFont(FFIGUREMESSAGELABELFIGURE_FONT);

			fFigureMessageLabelFigure.setMaximumSize(new Dimension(getMapMode()
					.DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureMessageLabelFigure);

			fFigureNamedElementNameLabelFigure = new WrappingLabel();
			fFigureNamedElementNameLabelFigure.setText("");
			fFigureNamedElementNameLabelFigure
					.setForegroundColor(FFIGURENAMEDELEMENTNAMELABELFIGURE_FORE);

			fFigureNamedElementNameLabelFigure
					.setFont(FFIGURENAMEDELEMENTNAMELABELFIGURE_FONT);

			this.add(fFigureNamedElementNameLabelFigure);

			fFigureMessageRoleLabelFigure = new WrappingLabel();
			fFigureMessageRoleLabelFigure.setText("");
			fFigureMessageRoleLabelFigure
					.setForegroundColor(FFIGUREMESSAGEROLELABELFIGURE_FORE);

			fFigureMessageRoleLabelFigure
					.setFont(FFIGUREMESSAGEROLELABELFIGURE_FONT);

			this.add(fFigureMessageRoleLabelFigure);

			fFigureMessageSubsetLabelFigure = new WrappingLabel();
			fFigureMessageSubsetLabelFigure.setText("");
			fFigureMessageSubsetLabelFigure
					.setForegroundColor(FFIGUREMESSAGESUBSETLABELFIGURE_FORE);

			fFigureMessageSubsetLabelFigure
					.setFont(FFIGUREMESSAGESUBSETLABELFIGURE_FONT);

			this.add(fFigureMessageSubsetLabelFigure);

			fMessageAnnotationsCompartmentFigure = new RectangleFigure();
			fMessageAnnotationsCompartmentFigure.setOutline(false);

			this.add(fMessageAnnotationsCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMessageLabelFigure() {
			return fFigureMessageLabelFigure;
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
		public WrappingLabel getFigureMessageRoleLabelFigure() {
			return fFigureMessageRoleLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMessageSubsetLabelFigure() {
			return fFigureMessageSubsetLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getMessageAnnotationsCompartmentFigure() {
			return fMessageAnnotationsCompartmentFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 185, 242, 255);

	/**
	 * @generated
	 */
	static final Color THIS_BORDER = new Color(null, 0, 152, 255);

	/**
	 * @generated
	 */
	static final Color FFIGUREMESSAGELABELFIGURE_FORE = new Color(null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Font FFIGUREMESSAGELABELFIGURE_FONT = new Font(
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
	static final Color FFIGUREMESSAGEROLELABELFIGURE_FORE = new Color(null, 0,
			0, 0);

	/**
	 * @generated
	 */
	static final Font FFIGUREMESSAGEROLELABELFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 8, SWT.NORMAL);

	/**
	 * @generated
	 */
	static final Color FFIGUREMESSAGESUBSETLABELFIGURE_FORE = new Color(null,
			0, 0, 0);

	/**
	 * @generated
	 */
	static final Font FFIGUREMESSAGESUBSETLABELFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 8, SWT.NORMAL);

}
