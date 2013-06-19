/*
 * 
 */
package ASD.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import ASD.diagram.edit.parts.Annotation2EditPart;
import ASD.diagram.edit.parts.AnnotationEditPart;
import ASD.diagram.edit.parts.AssertionAssertionAnnotationsCompartmentEditPart;
import ASD.diagram.edit.parts.AssertionEditPart;
import ASD.diagram.edit.parts.AssertionSetAssertionSetAnnotationsCompartmentEditPart;
import ASD.diagram.edit.parts.AssertionSetAssertionSetAssertionsCompartmentEditPart;
import ASD.diagram.edit.parts.AssertionSetEditPart;
import ASD.diagram.edit.parts.InfoType2EditPart;
import ASD.diagram.edit.parts.InfoTypeEditPart;
import ASD.diagram.edit.parts.InfoTypeImported2EditPart;
import ASD.diagram.edit.parts.InfoTypeImportedEditPart;
import ASD.diagram.edit.parts.InfoTypeImportedInfoTypeImportedAnnotationsCompartment2EditPart;
import ASD.diagram.edit.parts.InfoTypeImportedInfoTypeImportedAnnotationsCompartmentEditPart;
import ASD.diagram.edit.parts.InfoTypeImportedInfoTypeImportedInfoTypeCompartment2EditPart;
import ASD.diagram.edit.parts.InfoTypeImportedInfoTypeImportedInfoTypeCompartmentEditPart;
import ASD.diagram.edit.parts.InfoTypeInfoTypeAnnotationsCompartment2EditPart;
import ASD.diagram.edit.parts.InfoTypeInfoTypeAnnotationsCompartmentEditPart;
import ASD.diagram.edit.parts.InfoTypeInfoTypeInfoTypeCompartment2EditPart;
import ASD.diagram.edit.parts.InfoTypeInfoTypeInfoTypeCompartmentEditPart;
import ASD.diagram.edit.parts.InfoTypeRefEditPart;
import ASD.diagram.edit.parts.MessageEditPart;
import ASD.diagram.edit.parts.MessageInfoTypeEditPart;
import ASD.diagram.edit.parts.MessageMessageAnnotationsCompartmentEditPart;
import ASD.diagram.edit.parts.OperationEditPart;
import ASD.diagram.edit.parts.OperationOperationAnnotationsCompartmentEditPart;
import ASD.diagram.edit.parts.OperationOperationContentsCompartmentEditPart;
import ASD.diagram.edit.parts.ProfileEditPart;
import ASD.diagram.edit.parts.ProfileProfileAnnotationsCompartmentEditPart;
import ASD.diagram.edit.parts.ProfileProfileSetsCompartmentEditPart;
import ASD.diagram.edit.parts.ProfileRefersEditPart;
import ASD.diagram.edit.parts.ServiceDescriptionEditPart;
import ASD.diagram.part.ASDVisualIDRegistry;
import ASD.diagram.part.Messages;

/**
 * @generated
 */
public class ASDNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public ASDNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<ASDNavigatorItem> result = new ArrayList<ASDNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews,
							ServiceDescriptionEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof ASDNavigatorGroup) {
			ASDNavigatorGroup group = (ASDNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof ASDNavigatorItem) {
			ASDNavigatorItem navigatorItem = (ASDNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		 * Due to plugin.xml restrictions this code will be called only for views representing
		 * shortcuts to this diagram elements created on other diagrams. 
		 */
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement)
					.getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (ASDVisualIDRegistry.getVisualID(view)) {

		case InfoTypeRefEditPart.VISUAL_ID: {
			LinkedList<ASDAbstractNavigatorItem> result = new LinkedList<ASDAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ASDNavigatorGroup target = new ASDNavigatorGroup(
					Messages.NavigatorGroupName_InfoTypeRef_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ASDNavigatorGroup source = new ASDNavigatorGroup(
					Messages.NavigatorGroupName_InfoTypeRef_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ASDVisualIDRegistry
							.getType(InfoTypeImportedEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ASDVisualIDRegistry.getType(InfoTypeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ASDVisualIDRegistry
							.getType(InfoTypeImported2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ASDVisualIDRegistry.getType(InfoType2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ASDVisualIDRegistry
							.getType(InfoTypeImportedEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ASDVisualIDRegistry.getType(InfoTypeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ASDVisualIDRegistry
							.getType(InfoTypeImported2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ASDVisualIDRegistry.getType(InfoType2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case MessageEditPart.VISUAL_ID: {
			LinkedList<ASDAbstractNavigatorItem> result = new LinkedList<ASDAbstractNavigatorItem>();
			Node sv = (Node) view;
			ASDNavigatorGroup outgoinglinks = new ASDNavigatorGroup(
					Messages.NavigatorGroupName_Message_3004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ASDVisualIDRegistry
							.getType(MessageMessageAnnotationsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ASDVisualIDRegistry.getType(Annotation2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ASDVisualIDRegistry
							.getType(MessageInfoTypeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case MessageInfoTypeEditPart.VISUAL_ID: {
			LinkedList<ASDAbstractNavigatorItem> result = new LinkedList<ASDAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ASDNavigatorGroup target = new ASDNavigatorGroup(
					Messages.NavigatorGroupName_MessageInfoType_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ASDNavigatorGroup source = new ASDNavigatorGroup(
					Messages.NavigatorGroupName_MessageInfoType_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ASDVisualIDRegistry
							.getType(InfoTypeImportedEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ASDVisualIDRegistry.getType(InfoTypeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ASDVisualIDRegistry
							.getType(InfoTypeImported2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ASDVisualIDRegistry.getType(InfoType2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ASDVisualIDRegistry.getType(MessageEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case InfoType2EditPart.VISUAL_ID: {
			LinkedList<ASDAbstractNavigatorItem> result = new LinkedList<ASDAbstractNavigatorItem>();
			Node sv = (Node) view;
			ASDNavigatorGroup incominglinks = new ASDNavigatorGroup(
					Messages.NavigatorGroupName_InfoType_3002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ASDNavigatorGroup outgoinglinks = new ASDNavigatorGroup(
					Messages.NavigatorGroupName_InfoType_3002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ASDVisualIDRegistry
							.getType(InfoTypeInfoTypeInfoTypeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ASDVisualIDRegistry
							.getType(InfoTypeImported2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ASDVisualIDRegistry
							.getType(InfoTypeInfoTypeInfoTypeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ASDVisualIDRegistry.getType(InfoType2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ASDVisualIDRegistry
							.getType(InfoTypeInfoTypeAnnotationsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ASDVisualIDRegistry.getType(Annotation2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ASDVisualIDRegistry
							.getType(MessageInfoTypeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ASDVisualIDRegistry.getType(InfoTypeRefEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ASDVisualIDRegistry.getType(InfoTypeRefEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ProfileEditPart.VISUAL_ID: {
			LinkedList<ASDAbstractNavigatorItem> result = new LinkedList<ASDAbstractNavigatorItem>();
			Node sv = (Node) view;
			ASDNavigatorGroup outgoinglinks = new ASDNavigatorGroup(
					Messages.NavigatorGroupName_Profile_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ASDVisualIDRegistry
							.getType(ProfileProfileSetsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ASDVisualIDRegistry.getType(AssertionSetEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ASDVisualIDRegistry
							.getType(ProfileProfileAnnotationsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ASDVisualIDRegistry.getType(Annotation2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ASDVisualIDRegistry
							.getType(ProfileRefersEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case OperationEditPart.VISUAL_ID: {
			LinkedList<ASDAbstractNavigatorItem> result = new LinkedList<ASDAbstractNavigatorItem>();
			Node sv = (Node) view;
			ASDNavigatorGroup incominglinks = new ASDNavigatorGroup(
					Messages.NavigatorGroupName_Operation_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ASDVisualIDRegistry
							.getType(OperationOperationContentsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ASDVisualIDRegistry.getType(MessageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ASDVisualIDRegistry
							.getType(OperationOperationAnnotationsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ASDVisualIDRegistry.getType(Annotation2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ASDVisualIDRegistry
							.getType(ProfileRefersEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case InfoTypeImported2EditPart.VISUAL_ID: {
			LinkedList<ASDAbstractNavigatorItem> result = new LinkedList<ASDAbstractNavigatorItem>();
			Node sv = (Node) view;
			ASDNavigatorGroup incominglinks = new ASDNavigatorGroup(
					Messages.NavigatorGroupName_InfoTypeImported_3001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ASDNavigatorGroup outgoinglinks = new ASDNavigatorGroup(
					Messages.NavigatorGroupName_InfoTypeImported_3001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ASDVisualIDRegistry
							.getType(InfoTypeImportedInfoTypeImportedInfoTypeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ASDVisualIDRegistry
							.getType(InfoTypeImported2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ASDVisualIDRegistry
							.getType(InfoTypeImportedInfoTypeImportedInfoTypeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ASDVisualIDRegistry.getType(InfoType2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ASDVisualIDRegistry
							.getType(InfoTypeImportedInfoTypeImportedAnnotationsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ASDVisualIDRegistry.getType(Annotation2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ASDVisualIDRegistry
							.getType(MessageInfoTypeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ASDVisualIDRegistry.getType(InfoTypeRefEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ASDVisualIDRegistry.getType(InfoTypeRefEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case InfoTypeEditPart.VISUAL_ID: {
			LinkedList<ASDAbstractNavigatorItem> result = new LinkedList<ASDAbstractNavigatorItem>();
			Node sv = (Node) view;
			ASDNavigatorGroup incominglinks = new ASDNavigatorGroup(
					Messages.NavigatorGroupName_InfoType_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ASDNavigatorGroup outgoinglinks = new ASDNavigatorGroup(
					Messages.NavigatorGroupName_InfoType_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ASDVisualIDRegistry
							.getType(InfoTypeInfoTypeInfoTypeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ASDVisualIDRegistry
							.getType(InfoTypeImported2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ASDVisualIDRegistry
							.getType(InfoTypeInfoTypeInfoTypeCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ASDVisualIDRegistry.getType(InfoType2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ASDVisualIDRegistry
							.getType(InfoTypeInfoTypeAnnotationsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ASDVisualIDRegistry.getType(Annotation2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ASDVisualIDRegistry
							.getType(MessageInfoTypeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ASDVisualIDRegistry.getType(InfoTypeRefEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ASDVisualIDRegistry.getType(InfoTypeRefEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case InfoTypeImportedEditPart.VISUAL_ID: {
			LinkedList<ASDAbstractNavigatorItem> result = new LinkedList<ASDAbstractNavigatorItem>();
			Node sv = (Node) view;
			ASDNavigatorGroup incominglinks = new ASDNavigatorGroup(
					Messages.NavigatorGroupName_InfoTypeImported_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ASDNavigatorGroup outgoinglinks = new ASDNavigatorGroup(
					Messages.NavigatorGroupName_InfoTypeImported_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ASDVisualIDRegistry
							.getType(InfoTypeImportedInfoTypeImportedInfoTypeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ASDVisualIDRegistry
							.getType(InfoTypeImported2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ASDVisualIDRegistry
							.getType(InfoTypeImportedInfoTypeImportedInfoTypeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ASDVisualIDRegistry.getType(InfoType2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ASDVisualIDRegistry
							.getType(InfoTypeImportedInfoTypeImportedAnnotationsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ASDVisualIDRegistry.getType(Annotation2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ASDVisualIDRegistry
							.getType(MessageInfoTypeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ASDVisualIDRegistry.getType(InfoTypeRefEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ASDVisualIDRegistry.getType(InfoTypeRefEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case AssertionSetEditPart.VISUAL_ID: {
			LinkedList<ASDAbstractNavigatorItem> result = new LinkedList<ASDAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ASDVisualIDRegistry
							.getType(AssertionSetAssertionSetAssertionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ASDVisualIDRegistry.getType(AssertionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ASDVisualIDRegistry
							.getType(AssertionSetAssertionSetAnnotationsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ASDVisualIDRegistry.getType(Annotation2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case AssertionEditPart.VISUAL_ID: {
			LinkedList<ASDAbstractNavigatorItem> result = new LinkedList<ASDAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ASDVisualIDRegistry
							.getType(AssertionAssertionAnnotationsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ASDVisualIDRegistry.getType(Annotation2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ServiceDescriptionEditPart.VISUAL_ID: {
			LinkedList<ASDAbstractNavigatorItem> result = new LinkedList<ASDAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			ASDNavigatorGroup links = new ASDNavigatorGroup(
					Messages.NavigatorGroupName_ServiceDescription_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ASDVisualIDRegistry
							.getType(InfoTypeImportedEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ASDVisualIDRegistry.getType(OperationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ASDVisualIDRegistry.getType(InfoTypeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ASDVisualIDRegistry.getType(ProfileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ASDVisualIDRegistry.getType(AnnotationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ASDVisualIDRegistry
							.getType(MessageInfoTypeEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ASDVisualIDRegistry.getType(InfoTypeRefEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ASDVisualIDRegistry
							.getType(ProfileRefersEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case ProfileRefersEditPart.VISUAL_ID: {
			LinkedList<ASDAbstractNavigatorItem> result = new LinkedList<ASDAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ASDNavigatorGroup target = new ASDNavigatorGroup(
					Messages.NavigatorGroupName_ProfileRefers_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ASDNavigatorGroup source = new ASDNavigatorGroup(
					Messages.NavigatorGroupName_ProfileRefers_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ASDVisualIDRegistry.getType(OperationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ASDVisualIDRegistry.getType(ProfileEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ServiceDescriptionEditPart.MODEL_ID.equals(ASDVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<ASDNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<ASDNavigatorItem> result = new ArrayList<ASDNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new ASDNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<ASDNavigatorItem> getForeignShortcuts(Diagram diagram,
			Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView)
					&& nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof ASDAbstractNavigatorItem) {
			ASDAbstractNavigatorItem abstractNavigatorItem = (ASDAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
