/*
 * 
 */
package ASD.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import ASD.diagram.part.ASDVisualIDRegistry;

/**
 * @generated
 */
public class ASDNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7018;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 7017;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof ASDNavigatorItem) {
			ASDNavigatorItem item = (ASDNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return ASDVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
