/*
 * 
 */
package ASD.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import ASD.diagram.edit.commands.Annotation2CreateCommand;
import ASD.diagram.providers.ASDElementTypes;

/**
 * @generated
 */
public class AssertionAssertionAnnotationsCompartmentItemSemanticEditPolicy
		extends ASDBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AssertionAssertionAnnotationsCompartmentItemSemanticEditPolicy() {
		super(ASDElementTypes.Assertion_3006);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ASDElementTypes.Annotation_3003 == req.getElementType()) {
			return getGEFWrapper(new Annotation2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
