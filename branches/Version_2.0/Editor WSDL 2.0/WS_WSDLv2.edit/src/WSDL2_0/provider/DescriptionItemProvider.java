/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL2_0.provider;


import WSDL2_0.Description;
import WSDL2_0.WSDL2_0Factory;
import WSDL2_0.WSDL2_0Package;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link WSDL2_0.Description} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DescriptionItemProvider
	extends ObjectItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addTargetNamespacePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Target Namespace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetNamespacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Description_targetNamespace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Description_targetNamespace_feature", "_UI_Description_type"),
				 WSDL2_0Package.eINSTANCE.getDescription_TargetNamespace(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getDescription_Import());
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getDescription_Include());
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getDescription_Types());
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getDescription_Interface());
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getDescription_Binding());
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getDescription_Service());
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getDescription_Namespace());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Description.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Description"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Description)object).getTargetNamespace();
		return label == null || label.length() == 0 ?
			getString("_UI_Description_type") :
			getString("_UI_Description_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Description.class)) {
			case WSDL2_0Package.DESCRIPTION__TARGET_NAMESPACE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WSDL2_0Package.DESCRIPTION__IMPORT:
			case WSDL2_0Package.DESCRIPTION__INCLUDE:
			case WSDL2_0Package.DESCRIPTION__TYPES:
			case WSDL2_0Package.DESCRIPTION__INTERFACE:
			case WSDL2_0Package.DESCRIPTION__BINDING:
			case WSDL2_0Package.DESCRIPTION__SERVICE:
			case WSDL2_0Package.DESCRIPTION__NAMESPACE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(WSDL2_0Package.eINSTANCE.getDescription_Import(),
				 WSDL2_0Factory.eINSTANCE.createImport()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL2_0Package.eINSTANCE.getDescription_Include(),
				 WSDL2_0Factory.eINSTANCE.createInclude()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL2_0Package.eINSTANCE.getDescription_Types(),
				 WSDL2_0Factory.eINSTANCE.createElementType()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL2_0Package.eINSTANCE.getDescription_Interface(),
				 WSDL2_0Factory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL2_0Package.eINSTANCE.getDescription_Binding(),
				 WSDL2_0Factory.eINSTANCE.createBinding()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL2_0Package.eINSTANCE.getDescription_Service(),
				 WSDL2_0Factory.eINSTANCE.createService()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL2_0Package.eINSTANCE.getDescription_Namespace(),
				 WSDL2_0Factory.eINSTANCE.createNamespace()));
	}

}
