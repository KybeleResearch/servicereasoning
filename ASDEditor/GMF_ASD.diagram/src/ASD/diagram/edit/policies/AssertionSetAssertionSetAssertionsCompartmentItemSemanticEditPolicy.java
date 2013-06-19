/*
 * 
 */
package ASD.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import ASD.diagram.edit.commands.AssertionCreateCommand;
import ASD.diagram.providers.ASDElementTypes;

/**
 * @generated
 */
public class AssertionSetAssertionSetAssertionsCompartmentItemSemanticEditPolicy
		extends ASDBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AssertionSetAssertionSetAssertionsCompartmentItemSemanticEditPolicy() {
		super(ASDElementTypes.AssertionSet_3005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ASDElementTypes.Assertion_3006 == req.getElementType()) {
			return getGEFWrapper(new AssertionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
