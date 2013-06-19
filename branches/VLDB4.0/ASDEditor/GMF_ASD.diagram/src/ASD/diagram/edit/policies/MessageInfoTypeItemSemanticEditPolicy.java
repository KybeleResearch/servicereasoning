/*
 * 
 */
package ASD.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import ASD.diagram.providers.ASDElementTypes;

/**
 * @generated
 */
public class MessageInfoTypeItemSemanticEditPolicy extends
		ASDBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MessageInfoTypeItemSemanticEditPolicy() {
		super(ASDElementTypes.MessageInfoType_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
