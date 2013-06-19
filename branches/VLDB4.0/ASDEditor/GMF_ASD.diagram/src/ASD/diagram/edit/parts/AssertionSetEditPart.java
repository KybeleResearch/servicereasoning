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

import ASD.diagram.edit.policies.AssertionSetItemSemanticEditPolicy;
import ASD.diagram.edit.policies.OpenDiagramEditPolicy;
import ASD.diagram.part.ASDVisualIDRegistry;

/**
 * @generated
 */
public class AssertionSetEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3005;

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
	public AssertionSetEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new AssertionSetItemSemanticEditPolicy());
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
		return primaryShape = new AssertionSetFigure();
	}

	/**
	 * @generated
	 */
	public AssertionSetFigure getPrimaryShape() {
		return (AssertionSetFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AssertionSetNameEditPart) {
			((AssertionSetNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureAssertionSetLabelFigure());
			return true;
		}
		if (childEditPart instanceof AssertionSetName2EditPart) {
			((AssertionSetName2EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureNamedElementNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof AssertionSetLTypeEditPart) {
			((AssertionSetLTypeEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureAssertionSetLTypeLabelFigure());
			return true;
		}
		if (childEditPart instanceof AssertionSetAssertionSetAnnotationsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getAssertionSetAnnotationsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((AssertionSetAssertionSetAnnotationsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof AssertionSetAssertionSetAssertionsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getAssertionSetAssertionsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((AssertionSetAssertionSetAssertionsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AssertionSetNameEditPart) {
			return true;
		}
		if (childEditPart instanceof AssertionSetName2EditPart) {
			return true;
		}
		if (childEditPart instanceof AssertionSetLTypeEditPart) {
			return true;
		}
		if (childEditPart instanceof AssertionSetAssertionSetAnnotationsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getAssertionSetAnnotationsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((AssertionSetAssertionSetAnnotationsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof AssertionSetAssertionSetAssertionsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getAssertionSetAssertionsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((AssertionSetAssertionSetAssertionsCompartmentEditPart) childEditPart)
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
		if (editPart instanceof AssertionSetAssertionSetAnnotationsCompartmentEditPart) {
			return getPrimaryShape()
					.getAssertionSetAnnotationsCompartmentFigure();
		}
		if (editPart instanceof AssertionSetAssertionSetAssertionsCompartmentEditPart) {
			return getPrimaryShape()
					.getAssertionSetAssertionsCompartmentFigure();
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
				.getType(AssertionSetNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class AssertionSetFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureAssertionSetLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureNamedElementNameLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAssertionSetLTypeLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fAssertionSetAnnotationsCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fAssertionSetAssertionsCompartmentFigure;

		/**
		 * @generated
		 */
		public AssertionSetFigure() {
			this.setBackgroundColor(THIS_BACK);
			this.setSize(getMapMode().DPtoLP(200), getMapMode().DPtoLP(220));
			this.setBorder(new LineBorder(THIS_BORDER, getMapMode().DPtoLP(2)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureAssertionSetLabelFigure = new WrappingLabel();
			fFigureAssertionSetLabelFigure.setText("AssertionSet");
			fFigureAssertionSetLabelFigure
					.setForegroundColor(FFIGUREASSERTIONSETLABELFIGURE_FORE);

			fFigureAssertionSetLabelFigure
					.setFont(FFIGUREASSERTIONSETLABELFIGURE_FONT);

			fFigureAssertionSetLabelFigure.setMaximumSize(new Dimension(
					getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureAssertionSetLabelFigure);

			fFigureNamedElementNameLabelFigure = new WrappingLabel();
			fFigureNamedElementNameLabelFigure.setText("");
			fFigureNamedElementNameLabelFigure
					.setForegroundColor(FFIGURENAMEDELEMENTNAMELABELFIGURE_FORE);

			fFigureNamedElementNameLabelFigure
					.setFont(FFIGURENAMEDELEMENTNAMELABELFIGURE_FONT);

			this.add(fFigureNamedElementNameLabelFigure);

			fFigureAssertionSetLTypeLabelFigure = new WrappingLabel();
			fFigureAssertionSetLTypeLabelFigure.setText("");
			fFigureAssertionSetLTypeLabelFigure
					.setForegroundColor(FFIGUREASSERTIONSETLTYPELABELFIGURE_FORE);

			fFigureAssertionSetLTypeLabelFigure
					.setFont(FFIGUREASSERTIONSETLTYPELABELFIGURE_FONT);

			this.add(fFigureAssertionSetLTypeLabelFigure);

			fAssertionSetAssertionsCompartmentFigure = new RectangleFigure();
			fAssertionSetAssertionsCompartmentFigure.setOutline(false);

			this.add(fAssertionSetAssertionsCompartmentFigure);

			fAssertionSetAnnotationsCompartmentFigure = new RectangleFigure();
			fAssertionSetAnnotationsCompartmentFigure.setOutline(false);

			this.add(fAssertionSetAnnotationsCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAssertionSetLabelFigure() {
			return fFigureAssertionSetLabelFigure;
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
		public WrappingLabel getFigureAssertionSetLTypeLabelFigure() {
			return fFigureAssertionSetLTypeLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getAssertionSetAnnotationsCompartmentFigure() {
			return fAssertionSetAnnotationsCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getAssertionSetAssertionsCompartmentFigure() {
			return fAssertionSetAssertionsCompartmentFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 255, 204, 255);

	/**
	 * @generated
	 */
	static final Color THIS_BORDER = new Color(null, 255, 153, 255);

	/**
	 * @generated
	 */
	static final Color FFIGUREASSERTIONSETLABELFIGURE_FORE = new Color(null, 0,
			0, 0);

	/**
	 * @generated
	 */
	static final Font FFIGUREASSERTIONSETLABELFIGURE_FONT = new Font(
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
	static final Color FFIGUREASSERTIONSETLTYPELABELFIGURE_FORE = new Color(
			null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Font FFIGUREASSERTIONSETLTYPELABELFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 8, SWT.NORMAL);

}
