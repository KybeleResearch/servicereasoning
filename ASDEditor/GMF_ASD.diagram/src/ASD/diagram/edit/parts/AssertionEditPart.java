/*
 * 
 */
package ASD.diagram.edit.parts;

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
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import ASD.diagram.edit.policies.AssertionItemSemanticEditPolicy;
import ASD.diagram.edit.policies.OpenDiagramEditPolicy;
import ASD.diagram.part.ASDVisualIDRegistry;

/**
 * @generated
 */
public class AssertionEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3006;

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
	public AssertionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new AssertionItemSemanticEditPolicy());
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
		return primaryShape = new AssertionFigure();
	}

	/**
	 * @generated
	 */
	public AssertionFigure getPrimaryShape() {
		return (AssertionFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AssertionNameEditPart) {
			((AssertionNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureAssertionLabelFigure());
			return true;
		}
		if (childEditPart instanceof AssertionName2EditPart) {
			((AssertionName2EditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureNamedElementNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof AssertionDimensionEditPart) {
			((AssertionDimensionEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureAssertionDimensionLabelFigure());
			return true;
		}
		if (childEditPart instanceof AssertionDimensionTypeEditPart) {
			((AssertionDimensionTypeEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureAssertionDimensionTypeLabelFigure());
			return true;
		}
		if (childEditPart instanceof AssertionIntentionEditPart) {
			((AssertionIntentionEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureAssertionIntentionLabelFigure());
			return true;
		}
		if (childEditPart instanceof AssertionMinValEditPart) {
			((AssertionMinValEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureAssertionMinValLabelFigure());
			return true;
		}
		if (childEditPart instanceof AssertionMaxValEditPart) {
			((AssertionMaxValEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureAssertionMaxValLabelFigure());
			return true;
		}
		if (childEditPart instanceof AssertionLTypeEditPart) {
			((AssertionLTypeEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureAssertionLTypeLabelFigure());
			return true;
		}
		if (childEditPart instanceof AssertionSubsetEditPart) {
			((AssertionSubsetEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureAssertionSubsetLabelFigure());
			return true;
		}
		if (childEditPart instanceof AssertionAssertionAnnotationsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getAssertionAnnotationsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((AssertionAssertionAnnotationsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AssertionNameEditPart) {
			return true;
		}
		if (childEditPart instanceof AssertionName2EditPart) {
			return true;
		}
		if (childEditPart instanceof AssertionDimensionEditPart) {
			return true;
		}
		if (childEditPart instanceof AssertionDimensionTypeEditPart) {
			return true;
		}
		if (childEditPart instanceof AssertionIntentionEditPart) {
			return true;
		}
		if (childEditPart instanceof AssertionMinValEditPart) {
			return true;
		}
		if (childEditPart instanceof AssertionMaxValEditPart) {
			return true;
		}
		if (childEditPart instanceof AssertionLTypeEditPart) {
			return true;
		}
		if (childEditPart instanceof AssertionSubsetEditPart) {
			return true;
		}
		if (childEditPart instanceof AssertionAssertionAnnotationsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getAssertionAnnotationsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((AssertionAssertionAnnotationsCompartmentEditPart) childEditPart)
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
		if (editPart instanceof AssertionAssertionAnnotationsCompartmentEditPart) {
			return getPrimaryShape().getAssertionAnnotationsCompartmentFigure();
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
				.getType(AssertionNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class AssertionFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureAssertionLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureNamedElementNameLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAssertionDimensionLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAssertionDimensionTypeLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAssertionIntentionLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAssertionMinValLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAssertionMaxValLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAssertionLTypeLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAssertionSubsetLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fAssertionAnnotationsCompartmentFigure;

		/**
		 * @generated
		 */
		public AssertionFigure() {
			this.setBackgroundColor(THIS_BACK);
			this.setSize(getMapMode().DPtoLP(200), getMapMode().DPtoLP(220));
			this.setBorder(new LineBorder(THIS_BORDER, getMapMode().DPtoLP(2)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureAssertionLabelFigure = new WrappingLabel();
			fFigureAssertionLabelFigure.setText("Assertion");
			fFigureAssertionLabelFigure
					.setForegroundColor(FFIGUREASSERTIONLABELFIGURE_FORE);

			fFigureAssertionLabelFigure
					.setFont(FFIGUREASSERTIONLABELFIGURE_FONT);

			fFigureAssertionLabelFigure.setMaximumSize(new Dimension(
					getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureAssertionLabelFigure);

			fFigureNamedElementNameLabelFigure = new WrappingLabel();
			fFigureNamedElementNameLabelFigure.setText("");
			fFigureNamedElementNameLabelFigure
					.setForegroundColor(FFIGURENAMEDELEMENTNAMELABELFIGURE_FORE);

			fFigureNamedElementNameLabelFigure
					.setFont(FFIGURENAMEDELEMENTNAMELABELFIGURE_FONT);

			this.add(fFigureNamedElementNameLabelFigure);

			fFigureAssertionDimensionLabelFigure = new WrappingLabel();
			fFigureAssertionDimensionLabelFigure.setText("");
			fFigureAssertionDimensionLabelFigure
					.setForegroundColor(FFIGUREASSERTIONDIMENSIONLABELFIGURE_FORE);

			fFigureAssertionDimensionLabelFigure
					.setFont(FFIGUREASSERTIONDIMENSIONLABELFIGURE_FONT);

			this.add(fFigureAssertionDimensionLabelFigure);

			fFigureAssertionDimensionTypeLabelFigure = new WrappingLabel();
			fFigureAssertionDimensionTypeLabelFigure.setText("");
			fFigureAssertionDimensionTypeLabelFigure
					.setForegroundColor(FFIGUREASSERTIONDIMENSIONTYPELABELFIGURE_FORE);

			fFigureAssertionDimensionTypeLabelFigure
					.setFont(FFIGUREASSERTIONDIMENSIONTYPELABELFIGURE_FONT);

			this.add(fFigureAssertionDimensionTypeLabelFigure);

			fFigureAssertionIntentionLabelFigure = new WrappingLabel();
			fFigureAssertionIntentionLabelFigure.setText("");
			fFigureAssertionIntentionLabelFigure
					.setForegroundColor(FFIGUREASSERTIONINTENTIONLABELFIGURE_FORE);

			fFigureAssertionIntentionLabelFigure
					.setFont(FFIGUREASSERTIONINTENTIONLABELFIGURE_FONT);

			this.add(fFigureAssertionIntentionLabelFigure);

			fFigureAssertionMinValLabelFigure = new WrappingLabel();
			fFigureAssertionMinValLabelFigure.setText("");
			fFigureAssertionMinValLabelFigure
					.setForegroundColor(FFIGUREASSERTIONMINVALLABELFIGURE_FORE);

			fFigureAssertionMinValLabelFigure
					.setFont(FFIGUREASSERTIONMINVALLABELFIGURE_FONT);

			this.add(fFigureAssertionMinValLabelFigure);

			fFigureAssertionMaxValLabelFigure = new WrappingLabel();
			fFigureAssertionMaxValLabelFigure.setText("");
			fFigureAssertionMaxValLabelFigure
					.setForegroundColor(FFIGUREASSERTIONMAXVALLABELFIGURE_FORE);

			fFigureAssertionMaxValLabelFigure
					.setFont(FFIGUREASSERTIONMAXVALLABELFIGURE_FONT);

			this.add(fFigureAssertionMaxValLabelFigure);

			fFigureAssertionLTypeLabelFigure = new WrappingLabel();
			fFigureAssertionLTypeLabelFigure.setText("");
			fFigureAssertionLTypeLabelFigure
					.setForegroundColor(FFIGUREASSERTIONLTYPELABELFIGURE_FORE);

			fFigureAssertionLTypeLabelFigure
					.setFont(FFIGUREASSERTIONLTYPELABELFIGURE_FONT);

			this.add(fFigureAssertionLTypeLabelFigure);

			fFigureAssertionSubsetLabelFigure = new WrappingLabel();
			fFigureAssertionSubsetLabelFigure.setText("");
			fFigureAssertionSubsetLabelFigure
					.setForegroundColor(FFIGUREASSERTIONSUBSETLABELFIGURE_FORE);

			fFigureAssertionSubsetLabelFigure
					.setFont(FFIGUREASSERTIONSUBSETLABELFIGURE_FONT);

			this.add(fFigureAssertionSubsetLabelFigure);

			fAssertionAnnotationsCompartmentFigure = new RectangleFigure();
			fAssertionAnnotationsCompartmentFigure.setOutline(false);

			this.add(fAssertionAnnotationsCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAssertionLabelFigure() {
			return fFigureAssertionLabelFigure;
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
		public WrappingLabel getFigureAssertionDimensionLabelFigure() {
			return fFigureAssertionDimensionLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAssertionDimensionTypeLabelFigure() {
			return fFigureAssertionDimensionTypeLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAssertionIntentionLabelFigure() {
			return fFigureAssertionIntentionLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAssertionMinValLabelFigure() {
			return fFigureAssertionMinValLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAssertionMaxValLabelFigure() {
			return fFigureAssertionMaxValLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAssertionLTypeLabelFigure() {
			return fFigureAssertionLTypeLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAssertionSubsetLabelFigure() {
			return fFigureAssertionSubsetLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getAssertionAnnotationsCompartmentFigure() {
			return fAssertionAnnotationsCompartmentFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 255, 230, 255);

	/**
	 * @generated
	 */
	static final Color THIS_BORDER = new Color(null, 255, 204, 204);

	/**
	 * @generated
	 */
	static final Color FFIGUREASSERTIONLABELFIGURE_FORE = new Color(null, 0, 0,
			0);

	/**
	 * @generated
	 */
	static final Font FFIGUREASSERTIONLABELFIGURE_FONT = new Font(
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
	static final Color FFIGUREASSERTIONDIMENSIONLABELFIGURE_FORE = new Color(
			null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Font FFIGUREASSERTIONDIMENSIONLABELFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 8, SWT.NORMAL);

	/**
	 * @generated
	 */
	static final Color FFIGUREASSERTIONDIMENSIONTYPELABELFIGURE_FORE = new Color(
			null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Font FFIGUREASSERTIONDIMENSIONTYPELABELFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 8, SWT.NORMAL);

	/**
	 * @generated
	 */
	static final Color FFIGUREASSERTIONINTENTIONLABELFIGURE_FORE = new Color(
			null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Font FFIGUREASSERTIONINTENTIONLABELFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 8, SWT.NORMAL);

	/**
	 * @generated
	 */
	static final Color FFIGUREASSERTIONMINVALLABELFIGURE_FORE = new Color(null,
			0, 0, 0);

	/**
	 * @generated
	 */
	static final Font FFIGUREASSERTIONMINVALLABELFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 8, SWT.NORMAL);

	/**
	 * @generated
	 */
	static final Color FFIGUREASSERTIONMAXVALLABELFIGURE_FORE = new Color(null,
			0, 0, 0);

	/**
	 * @generated
	 */
	static final Font FFIGUREASSERTIONMAXVALLABELFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 8, SWT.NORMAL);

	/**
	 * @generated
	 */
	static final Color FFIGUREASSERTIONLTYPELABELFIGURE_FORE = new Color(null,
			0, 0, 0);

	/**
	 * @generated
	 */
	static final Font FFIGUREASSERTIONLTYPELABELFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 8, SWT.NORMAL);

	/**
	 * @generated
	 */
	static final Color FFIGUREASSERTIONSUBSETLABELFIGURE_FORE = new Color(null,
			0, 0, 0);

	/**
	 * @generated
	 */
	static final Font FFIGUREASSERTIONSUBSETLABELFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 8, SWT.NORMAL);

}
