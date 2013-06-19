/*
 * 
 */
package ASD.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import ASD.diagram.providers.ASDElementTypes;

/**
 * @generated
 */
public class ASDPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAnnotation1CreationTool());
		paletteContainer.add(createAssertion2CreationTool());
		paletteContainer.add(createAssertionSet3CreationTool());
		paletteContainer.add(createInfoType4CreationTool());
		paletteContainer.add(createInfoTypeImported5CreationTool());
		paletteContainer.add(createMessage6CreationTool());
		paletteContainer.add(createOperation7CreationTool());
		paletteContainer.add(createProfile8CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createInfoType1CreationTool());
		paletteContainer.add(createRef2CreationTool());
		paletteContainer.add(createRefers3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAnnotation1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ASDElementTypes.Annotation_3003);
		types.add(ASDElementTypes.Annotation_2005);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Annotation1CreationTool_title,
				Messages.Annotation1CreationTool_desc, types);
		entry.setId("createAnnotation1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASDElementTypes
				.getImageDescriptor(ASDElementTypes.Annotation_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssertion2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Assertion2CreationTool_title,
				Messages.Assertion2CreationTool_desc,
				Collections.singletonList(ASDElementTypes.Assertion_3006));
		entry.setId("createAssertion2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASDElementTypes
				.getImageDescriptor(ASDElementTypes.Assertion_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssertionSet3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AssertionSet3CreationTool_title,
				Messages.AssertionSet3CreationTool_desc,
				Collections.singletonList(ASDElementTypes.AssertionSet_3005));
		entry.setId("createAssertionSet3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASDElementTypes
				.getImageDescriptor(ASDElementTypes.AssertionSet_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInfoType4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ASDElementTypes.InfoType_3002);
		types.add(ASDElementTypes.InfoType_2003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InfoType4CreationTool_title,
				Messages.InfoType4CreationTool_desc, types);
		entry.setId("createInfoType4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASDElementTypes
				.getImageDescriptor(ASDElementTypes.InfoType_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInfoTypeImported5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ASDElementTypes.InfoTypeImported_2001);
		types.add(ASDElementTypes.InfoTypeImported_3001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InfoTypeImported5CreationTool_title,
				Messages.InfoTypeImported5CreationTool_desc, types);
		entry.setId("createInfoTypeImported5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASDElementTypes
				.getImageDescriptor(ASDElementTypes.InfoTypeImported_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMessage6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Message6CreationTool_title,
				Messages.Message6CreationTool_desc,
				Collections.singletonList(ASDElementTypes.Message_3004));
		entry.setId("createMessage6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASDElementTypes
				.getImageDescriptor(ASDElementTypes.Message_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOperation7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Operation7CreationTool_title,
				Messages.Operation7CreationTool_desc,
				Collections.singletonList(ASDElementTypes.Operation_2002));
		entry.setId("createOperation7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASDElementTypes
				.getImageDescriptor(ASDElementTypes.Operation_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProfile8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Profile8CreationTool_title,
				Messages.Profile8CreationTool_desc,
				Collections.singletonList(ASDElementTypes.Profile_2004));
		entry.setId("createProfile8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASDElementTypes
				.getImageDescriptor(ASDElementTypes.Profile_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInfoType1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.InfoType1CreationTool_title,
				Messages.InfoType1CreationTool_desc,
				Collections.singletonList(ASDElementTypes.MessageInfoType_4001));
		entry.setId("createInfoType1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASDElementTypes
				.getImageDescriptor(ASDElementTypes.MessageInfoType_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRef2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Ref2CreationTool_title,
				Messages.Ref2CreationTool_desc,
				Collections.singletonList(ASDElementTypes.InfoTypeRef_4002));
		entry.setId("createRef2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASDElementTypes
				.getImageDescriptor(ASDElementTypes.InfoTypeRef_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRefers3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Refers3CreationTool_title,
				Messages.Refers3CreationTool_desc,
				Collections.singletonList(ASDElementTypes.ProfileRefers_4003));
		entry.setId("createRefers3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ASDElementTypes
				.getImageDescriptor(ASDElementTypes.ProfileRefers_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
