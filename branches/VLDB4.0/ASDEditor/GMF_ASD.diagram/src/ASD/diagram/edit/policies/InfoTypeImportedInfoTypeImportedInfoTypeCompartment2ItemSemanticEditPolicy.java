/*
 * 
 */
package ASD.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import ASD.diagram.edit.commands.InfoType2CreateCommand;
import ASD.diagram.edit.commands.InfoTypeImported2CreateCommand;
import ASD.diagram.providers.ASDElementTypes;

/**
 * @generated
 */
public class InfoTypeImportedInfoTypeImportedInfoTypeCompartment2ItemSemanticEditPolicy
		extends ASDBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public InfoTypeImportedInfoTypeImportedInfoTypeCompartment2ItemSemanticEditPolicy() {
		super(ASDElementTypes.InfoTypeImported_3001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ASDElementTypes.InfoTypeImported_3001 == req.getElementType()) {
			return getGEFWrapper(new InfoTypeImported2CreateCommand(req));
		}
		if (ASDElementTypes.InfoType_3002 == req.getElementType()) {
			return getGEFWrapper(new InfoType2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
