/*
 * 
 */
package ASD.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
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
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import ASD.diagram.edit.policies.AnnotationItemSemanticEditPolicy;
import ASD.diagram.part.ASDVisualIDRegistry;

/**
 * @generated
 */
public class AnnotationEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2005;

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
	public AnnotationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new AnnotationItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
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
		return primaryShape = new AnnotationFigure();
	}

	/**
	 * @generated
	 */
	public AnnotationFigure getPrimaryShape() {
		return (AnnotationFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AnnotationKeyEditPart) {
			((AnnotationKeyEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureAnnotationLabelFigure());
			return true;
		}
		if (childEditPart instanceof AnnotationKey2EditPart) {
			((AnnotationKey2EditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureAnnotationKeyLabelFigure());
			return true;
		}
		if (childEditPart instanceof AnnotationValueEditPart) {
			((AnnotationValueEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureAnnotationValueLabelFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AnnotationKeyEditPart) {
			return true;
		}
		if (childEditPart instanceof AnnotationKey2EditPart) {
			return true;
		}
		if (childEditPart instanceof AnnotationValueEditPart) {
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
				.getType(AnnotationKeyEditPart.VISUAL_ID));
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
	public class AnnotationFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureAnnotationLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAnnotationKeyLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAnnotationValueLabelFigure;

		/**
		 * @generated
		 */
		public AnnotationFigure() {
			this.setBackgroundColor(THIS_BACK);
			this.setSize(getMapMode().DPtoLP(200), getMapMode().DPtoLP(220));
			this.setBorder(new LineBorder(THIS_BORDER, getMapMode().DPtoLP(2)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureAnnotationLabelFigure = new WrappingLabel();
			fFigureAnnotationLabelFigure.setText("Annotation");
			fFigureAnnotationLabelFigure
					.setForegroundColor(FFIGUREANNOTATIONLABELFIGURE_FORE);

			fFigureAnnotationLabelFigure
					.setFont(FFIGUREANNOTATIONLABELFIGURE_FONT);

			this.add(fFigureAnnotationLabelFigure);

			fFigureAnnotationKeyLabelFigure = new WrappingLabel();
			fFigureAnnotationKeyLabelFigure.setText("");
			fFigureAnnotationKeyLabelFigure
					.setForegroundColor(FFIGUREANNOTATIONKEYLABELFIGURE_FORE);

			fFigureAnnotationKeyLabelFigure
					.setFont(FFIGUREANNOTATIONKEYLABELFIGURE_FONT);

			this.add(fFigureAnnotationKeyLabelFigure);

			fFigureAnnotationValueLabelFigure = new WrappingLabel();
			fFigureAnnotationValueLabelFigure.setText("");
			fFigureAnnotationValueLabelFigure
					.setForegroundColor(FFIGUREANNOTATIONVALUELABELFIGURE_FORE);

			fFigureAnnotationValueLabelFigure
					.setFont(FFIGUREANNOTATIONVALUELABELFIGURE_FONT);

			this.add(fFigureAnnotationValueLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAnnotationLabelFigure() {
			return fFigureAnnotationLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAnnotationKeyLabelFigure() {
			return fFigureAnnotationKeyLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAnnotationValueLabelFigure() {
			return fFigureAnnotationValueLabelFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 211, 211, 211);

	/**
	 * @generated
	 */
	static final Color THIS_BORDER = new Color(null, 112, 128, 144);

	/**
	 * @generated
	 */
	static final Color FFIGUREANNOTATIONLABELFIGURE_FORE = new Color(null, 0,
			0, 0);

	/**
	 * @generated
	 */
	static final Font FFIGUREANNOTATIONLABELFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 10, SWT.BOLD);

	/**
	 * @generated
	 */
	static final Color FFIGUREANNOTATIONKEYLABELFIGURE_FORE = new Color(null,
			0, 0, 0);

	/**
	 * @generated
	 */
	static final Font FFIGUREANNOTATIONKEYLABELFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 8, SWT.NORMAL);

	/**
	 * @generated
	 */
	static final Color FFIGUREANNOTATIONVALUELABELFIGURE_FORE = new Color(null,
			0, 0, 0);

	/**
	 * @generated
	 */
	static final Font FFIGUREANNOTATIONVALUELABELFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 8, SWT.NORMAL);

}
