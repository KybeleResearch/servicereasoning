/*
 * 
 */
package ASD.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import ASD.diagram.edit.commands.MessageCreateCommand;
import ASD.diagram.providers.ASDElementTypes;

/**
 * @generated
 */
public class OperationOperationContentsCompartmentItemSemanticEditPolicy extends
		ASDBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public OperationOperationContentsCompartmentItemSemanticEditPolicy() {
		super(ASDElementTypes.Operation_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ASDElementTypes.Message_3004 == req.getElementType()) {
			return getGEFWrapper(new MessageCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
