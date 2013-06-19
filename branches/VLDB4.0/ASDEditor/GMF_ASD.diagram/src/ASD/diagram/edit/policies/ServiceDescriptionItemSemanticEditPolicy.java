/*
 * 
 */
package ASD.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import ASD.diagram.edit.commands.AnnotationCreateCommand;
import ASD.diagram.edit.commands.InfoTypeCreateCommand;
import ASD.diagram.edit.commands.InfoTypeImportedCreateCommand;
import ASD.diagram.edit.commands.OperationCreateCommand;
import ASD.diagram.edit.commands.ProfileCreateCommand;
import ASD.diagram.providers.ASDElementTypes;

/**
 * @generated
 */
public class ServiceDescriptionItemSemanticEditPolicy extends
		ASDBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ServiceDescriptionItemSemanticEditPolicy() {
		super(ASDElementTypes.ServiceDescription_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ASDElementTypes.InfoTypeImported_2001 == req.getElementType()) {
			return getGEFWrapper(new InfoTypeImportedCreateCommand(req));
		}
		if (ASDElementTypes.Operation_2002 == req.getElementType()) {
			return getGEFWrapper(new OperationCreateCommand(req));
		}
		if (ASDElementTypes.InfoType_2003 == req.getElementType()) {
			return getGEFWrapper(new InfoTypeCreateCommand(req));
		}
		if (ASDElementTypes.Profile_2004 == req.getElementType()) {
			return getGEFWrapper(new ProfileCreateCommand(req));
		}
		if (ASDElementTypes.Annotation_2005 == req.getElementType()) {
			return getGEFWrapper(new AnnotationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
