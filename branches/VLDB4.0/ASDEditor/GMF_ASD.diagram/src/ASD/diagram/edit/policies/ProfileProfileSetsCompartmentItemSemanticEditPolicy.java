/*
 * 
 */
package ASD.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import ASD.diagram.edit.commands.AssertionSetCreateCommand;
import ASD.diagram.providers.ASDElementTypes;

/**
 * @generated
 */
public class ProfileProfileSetsCompartmentItemSemanticEditPolicy extends
		ASDBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ProfileProfileSetsCompartmentItemSemanticEditPolicy() {
		super(ASDElementTypes.Profile_2004);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ASDElementTypes.AssertionSet_3005 == req.getElementType()) {
			return getGEFWrapper(new AssertionSetCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
