/*
 * 
 */
package ASD.diagram.providers;

import ASD.diagram.part.ASDDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = ASDDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			ASDDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
