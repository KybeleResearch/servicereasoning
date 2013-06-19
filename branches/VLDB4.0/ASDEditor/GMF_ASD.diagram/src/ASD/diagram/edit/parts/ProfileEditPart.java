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

import ASD.diagram.edit.policies.OpenDiagramEditPolicy;
import ASD.diagram.edit.policies.ProfileItemSemanticEditPolicy;
import ASD.diagram.part.ASDVisualIDRegistry;
import ASD.diagram.providers.ASDElementTypes;

/**
 * @generated
 */
public class ProfileEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2004;

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
	public ProfileEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ProfileItemSemanticEditPolicy());
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
		return primaryShape = new ProfileFigure();
	}

	/**
	 * @generated
	 */
	public ProfileFigure getPrimaryShape() {
		return (ProfileFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ProfileNameEditPart) {
			((ProfileNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureProfileLabelFigure());
			return true;
		}
		if (childEditPart instanceof ProfileName2EditPart) {
			((ProfileName2EditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureNamedElementNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof ProfileProfileAnnotationsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getProfileAnnotationsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ProfileProfileAnnotationsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ProfileProfileSetsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getProfileSetsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ProfileProfileSetsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ProfileNameEditPart) {
			return true;
		}
		if (childEditPart instanceof ProfileName2EditPart) {
			return true;
		}
		if (childEditPart instanceof ProfileProfileAnnotationsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getProfileAnnotationsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((ProfileProfileAnnotationsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ProfileProfileSetsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getProfileSetsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((ProfileProfileSetsCompartmentEditPart) childEditPart)
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
		if (editPart instanceof ProfileProfileAnnotationsCompartmentEditPart) {
			return getPrimaryShape().getProfileAnnotationsCompartmentFigure();
		}
		if (editPart instanceof ProfileProfileSetsCompartmentEditPart) {
			return getPrimaryShape().getProfileSetsCompartmentFigure();
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
				.getType(ProfileNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ASDElementTypes.ProfileRefers_4003);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof OperationEditPart) {
			types.add(ASDElementTypes.ProfileRefers_4003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == ASDElementTypes.ProfileRefers_4003) {
			types.add(ASDElementTypes.Operation_2002);
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
	public class ProfileFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureProfileLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureNamedElementNameLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fProfileAnnotationsCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fProfileSetsCompartmentFigure;

		/**
		 * @generated
		 */
		public ProfileFigure() {
			this.setBackgroundColor(THIS_BACK);
			this.setSize(getMapMode().DPtoLP(200), getMapMode().DPtoLP(220));
			this.setBorder(new LineBorder(THIS_BORDER, getMapMode().DPtoLP(2)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureProfileLabelFigure = new WrappingLabel();
			fFigureProfileLabelFigure.setText("Profile");
			fFigureProfileLabelFigure
					.setForegroundColor(FFIGUREPROFILELABELFIGURE_FORE);

			fFigureProfileLabelFigure.setFont(FFIGUREPROFILELABELFIGURE_FONT);

			fFigureProfileLabelFigure.setMaximumSize(new Dimension(getMapMode()
					.DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureProfileLabelFigure);

			fFigureNamedElementNameLabelFigure = new WrappingLabel();
			fFigureNamedElementNameLabelFigure.setText("");
			fFigureNamedElementNameLabelFigure
					.setForegroundColor(FFIGURENAMEDELEMENTNAMELABELFIGURE_FORE);

			fFigureNamedElementNameLabelFigure
					.setFont(FFIGURENAMEDELEMENTNAMELABELFIGURE_FONT);

			this.add(fFigureNamedElementNameLabelFigure);

			fProfileSetsCompartmentFigure = new RectangleFigure();
			fProfileSetsCompartmentFigure.setOutline(false);

			this.add(fProfileSetsCompartmentFigure);

			fProfileAnnotationsCompartmentFigure = new RectangleFigure();
			fProfileAnnotationsCompartmentFigure.setOutline(false);

			this.add(fProfileAnnotationsCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureProfileLabelFigure() {
			return fFigureProfileLabelFigure;
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
		public RectangleFigure getProfileAnnotationsCompartmentFigure() {
			return fProfileAnnotationsCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getProfileSetsCompartmentFigure() {
			return fProfileSetsCompartmentFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 198, 198, 236);

	/**
	 * @generated
	 */
	static final Color THIS_BORDER = new Color(null, 0, 0, 128);

	/**
	 * @generated
	 */
	static final Color FFIGUREPROFILELABELFIGURE_FORE = new Color(null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Font FFIGUREPROFILELABELFIGURE_FONT = new Font(
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

}
