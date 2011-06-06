/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL2_0.provider;


import WSDL2_0.InterfaceOperation;
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
 * This is the item provider adapter for a {@link WSDL2_0.InterfaceOperation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InterfaceOperationItemProvider
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
	public InterfaceOperationItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addPatternPropertyDescriptor(object);
			addStylePropertyDescriptor(object);
			addWsdlx_safePropertyDescriptor(object);
			addWrpc_signaturePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InterfaceOperation_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InterfaceOperation_name_feature", "_UI_InterfaceOperation_type"),
				 WSDL2_0Package.eINSTANCE.getInterfaceOperation_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pattern feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPatternPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InterfaceOperation_pattern_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InterfaceOperation_pattern_feature", "_UI_InterfaceOperation_type"),
				 WSDL2_0Package.eINSTANCE.getInterfaceOperation_Pattern(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Style feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStylePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InterfaceOperation_style_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InterfaceOperation_style_feature", "_UI_InterfaceOperation_type"),
				 WSDL2_0Package.eINSTANCE.getInterfaceOperation_Style(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wsdlx safe feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWsdlx_safePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InterfaceOperation_wsdlx_safe_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InterfaceOperation_wsdlx_safe_feature", "_UI_InterfaceOperation_type"),
				 WSDL2_0Package.eINSTANCE.getInterfaceOperation_Wsdlx_safe(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wrpc signature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWrpc_signaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InterfaceOperation_wrpc_signature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InterfaceOperation_wrpc_signature_feature", "_UI_InterfaceOperation_type"),
				 WSDL2_0Package.eINSTANCE.getInterfaceOperation_Wrpc_signature(),
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
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getInterfaceOperation_Input());
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getInterfaceOperation_Output());
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getInterfaceOperation_Infault());
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getInterfaceOperation_Outfault());
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
	 * This returns InterfaceOperation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InterfaceOperation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((InterfaceOperation)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_InterfaceOperation_type") :
			getString("_UI_InterfaceOperation_type") + " " + label;
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

		switch (notification.getFeatureID(InterfaceOperation.class)) {
			case WSDL2_0Package.INTERFACE_OPERATION__NAME:
			case WSDL2_0Package.INTERFACE_OPERATION__PATTERN:
			case WSDL2_0Package.INTERFACE_OPERATION__STYLE:
			case WSDL2_0Package.INTERFACE_OPERATION__WSDLX_SAFE:
			case WSDL2_0Package.INTERFACE_OPERATION__WRPC_SIGNATURE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WSDL2_0Package.INTERFACE_OPERATION__INPUT:
			case WSDL2_0Package.INTERFACE_OPERATION__OUTPUT:
			case WSDL2_0Package.INTERFACE_OPERATION__INFAULT:
			case WSDL2_0Package.INTERFACE_OPERATION__OUTFAULT:
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
				(WSDL2_0Package.eINSTANCE.getInterfaceOperation_Input(),
				 WSDL2_0Factory.eINSTANCE.createInterfaceInput()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL2_0Package.eINSTANCE.getInterfaceOperation_Output(),
				 WSDL2_0Factory.eINSTANCE.createInterfaceOutput()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL2_0Package.eINSTANCE.getInterfaceOperation_Infault(),
				 WSDL2_0Factory.eINSTANCE.createInterfaceInfault()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL2_0Package.eINSTANCE.getInterfaceOperation_Outfault(),
				 WSDL2_0Factory.eINSTANCE.createInterfaceOutfault()));
	}

}
