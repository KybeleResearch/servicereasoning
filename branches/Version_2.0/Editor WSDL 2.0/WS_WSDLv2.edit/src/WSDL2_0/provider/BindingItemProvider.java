/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL2_0.provider;


import WSDL2_0.Binding;
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
 * This is the item provider adapter for a {@link WSDL2_0.Binding} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BindingItemProvider
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
	public BindingItemProvider(AdapterFactory adapterFactory) {
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
			addTypePropertyDescriptor(object);
			addWsoap_versionPropertyDescriptor(object);
			addWsoap_protocolPropertyDescriptor(object);
			addWhttp_methodDefaultPropertyDescriptor(object);
			addWsoap_mepDefaultPropertyDescriptor(object);
			addWhttp_queryParameterSeparatorDefaultPropertyDescriptor(object);
			addWhttp_cookiesPropertyDescriptor(object);
			addWhttp_contentEncodingDefaultPropertyDescriptor(object);
			addInterfacePropertyDescriptor(object);
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
				 getString("_UI_Binding_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Binding_name_feature", "_UI_Binding_type"),
				 WSDL2_0Package.eINSTANCE.getBinding_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Binding_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Binding_type_feature", "_UI_Binding_type"),
				 WSDL2_0Package.eINSTANCE.getBinding_Type(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wsoap version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWsoap_versionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Binding_wsoap_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Binding_wsoap_version_feature", "_UI_Binding_type"),
				 WSDL2_0Package.eINSTANCE.getBinding_Wsoap_version(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wsoap protocol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWsoap_protocolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Binding_wsoap_protocol_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Binding_wsoap_protocol_feature", "_UI_Binding_type"),
				 WSDL2_0Package.eINSTANCE.getBinding_Wsoap_protocol(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Whttp method Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWhttp_methodDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Binding_whttp_methodDefault_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Binding_whttp_methodDefault_feature", "_UI_Binding_type"),
				 WSDL2_0Package.eINSTANCE.getBinding_Whttp_methodDefault(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wsoap mep Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWsoap_mepDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Binding_wsoap_mepDefault_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Binding_wsoap_mepDefault_feature", "_UI_Binding_type"),
				 WSDL2_0Package.eINSTANCE.getBinding_Wsoap_mepDefault(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Whttp query Parameter Separator Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWhttp_queryParameterSeparatorDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Binding_whttp_queryParameterSeparatorDefault_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Binding_whttp_queryParameterSeparatorDefault_feature", "_UI_Binding_type"),
				 WSDL2_0Package.eINSTANCE.getBinding_Whttp_queryParameterSeparatorDefault(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Whttp cookies feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWhttp_cookiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Binding_whttp_cookies_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Binding_whttp_cookies_feature", "_UI_Binding_type"),
				 WSDL2_0Package.eINSTANCE.getBinding_Whttp_cookies(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Whttp content Encoding Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWhttp_contentEncodingDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Binding_whttp_contentEncodingDefault_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Binding_whttp_contentEncodingDefault_feature", "_UI_Binding_type"),
				 WSDL2_0Package.eINSTANCE.getBinding_Whttp_contentEncodingDefault(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interface feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterfacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Binding_interface_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Binding_interface_feature", "_UI_Binding_type"),
				 WSDL2_0Package.eINSTANCE.getBinding_Interface(),
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getBinding_Fault());
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getBinding_Operation());
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getBinding_Wsoap_module());
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
	 * This returns Binding.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Binding"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Binding)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Binding_type") :
			getString("_UI_Binding_type") + " " + label;
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

		switch (notification.getFeatureID(Binding.class)) {
			case WSDL2_0Package.BINDING__NAME:
			case WSDL2_0Package.BINDING__TYPE:
			case WSDL2_0Package.BINDING__WSOAP_VERSION:
			case WSDL2_0Package.BINDING__WSOAP_PROTOCOL:
			case WSDL2_0Package.BINDING__WHTTP_METHOD_DEFAULT:
			case WSDL2_0Package.BINDING__WSOAP_MEP_DEFAULT:
			case WSDL2_0Package.BINDING__WHTTP_QUERY_PARAMETER_SEPARATOR_DEFAULT:
			case WSDL2_0Package.BINDING__WHTTP_COOKIES:
			case WSDL2_0Package.BINDING__WHTTP_CONTENT_ENCODING_DEFAULT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WSDL2_0Package.BINDING__FAULT:
			case WSDL2_0Package.BINDING__OPERATION:
			case WSDL2_0Package.BINDING__WSOAP_MODULE:
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
				(WSDL2_0Package.eINSTANCE.getBinding_Fault(),
				 WSDL2_0Factory.eINSTANCE.createBindingFault()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL2_0Package.eINSTANCE.getBinding_Operation(),
				 WSDL2_0Factory.eINSTANCE.createBindingOperation()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL2_0Package.eINSTANCE.getBinding_Wsoap_module(),
				 WSDL2_0Factory.eINSTANCE.createWsoap_Module()));
	}

}
