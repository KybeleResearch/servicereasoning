/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL2_0.provider;


import WSDL2_0.BindingOperation;
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
 * This is the item provider adapter for a {@link WSDL2_0.BindingOperation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BindingOperationItemProvider
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
	public BindingOperationItemProvider(AdapterFactory adapterFactory) {
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

			addWsoap_mepPropertyDescriptor(object);
			addWsoap_actionPropertyDescriptor(object);
			addWhttp_locationPropertyDescriptor(object);
			addWhttp_methodPropertyDescriptor(object);
			addWhttp_inputSerializationPropertyDescriptor(object);
			addWhttp_outputSerializationPropertyDescriptor(object);
			addWhttp_faultSerializationPropertyDescriptor(object);
			addWhttp_queryParameterSeparatorPropertyDescriptor(object);
			addWhttp_contentEncodingDefaultPropertyDescriptor(object);
			addWhttp_ignoreUncitedPropertyDescriptor(object);
			addRefPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Wsoap mep feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWsoap_mepPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BindingOperation_wsoap_mep_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BindingOperation_wsoap_mep_feature", "_UI_BindingOperation_type"),
				 WSDL2_0Package.eINSTANCE.getBindingOperation_Wsoap_mep(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wsoap action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWsoap_actionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BindingOperation_wsoap_action_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BindingOperation_wsoap_action_feature", "_UI_BindingOperation_type"),
				 WSDL2_0Package.eINSTANCE.getBindingOperation_Wsoap_action(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Whttp location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWhttp_locationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BindingOperation_whttp_location_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BindingOperation_whttp_location_feature", "_UI_BindingOperation_type"),
				 WSDL2_0Package.eINSTANCE.getBindingOperation_Whttp_location(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Whttp method feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWhttp_methodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BindingOperation_whttp_method_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BindingOperation_whttp_method_feature", "_UI_BindingOperation_type"),
				 WSDL2_0Package.eINSTANCE.getBindingOperation_Whttp_method(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Whttp input Serialization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWhttp_inputSerializationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BindingOperation_whttp_inputSerialization_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BindingOperation_whttp_inputSerialization_feature", "_UI_BindingOperation_type"),
				 WSDL2_0Package.eINSTANCE.getBindingOperation_Whttp_inputSerialization(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Whttp output Serialization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWhttp_outputSerializationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BindingOperation_whttp_outputSerialization_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BindingOperation_whttp_outputSerialization_feature", "_UI_BindingOperation_type"),
				 WSDL2_0Package.eINSTANCE.getBindingOperation_Whttp_outputSerialization(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Whttp fault Serialization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWhttp_faultSerializationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BindingOperation_whttp_faultSerialization_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BindingOperation_whttp_faultSerialization_feature", "_UI_BindingOperation_type"),
				 WSDL2_0Package.eINSTANCE.getBindingOperation_Whttp_faultSerialization(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Whttp query Parameter Separator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWhttp_queryParameterSeparatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BindingOperation_whttp_queryParameterSeparator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BindingOperation_whttp_queryParameterSeparator_feature", "_UI_BindingOperation_type"),
				 WSDL2_0Package.eINSTANCE.getBindingOperation_Whttp_queryParameterSeparator(),
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
				 getString("_UI_BindingOperation_whttp_contentEncodingDefault_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BindingOperation_whttp_contentEncodingDefault_feature", "_UI_BindingOperation_type"),
				 WSDL2_0Package.eINSTANCE.getBindingOperation_Whttp_contentEncodingDefault(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Whttp ignore Uncited feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWhttp_ignoreUncitedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BindingOperation_whttp_ignoreUncited_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BindingOperation_whttp_ignoreUncited_feature", "_UI_BindingOperation_type"),
				 WSDL2_0Package.eINSTANCE.getBindingOperation_Whttp_ignoreUncited(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BindingOperation_ref_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BindingOperation_ref_feature", "_UI_BindingOperation_type"),
				 WSDL2_0Package.eINSTANCE.getBindingOperation_Ref(),
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
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getBindingOperation_Input());
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getBindingOperation_Output());
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getBindingOperation_Infault());
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getBindingOperation_Outfault());
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getBindingOperation_Wsoap_module());
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
	 * This returns BindingOperation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BindingOperation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BindingOperation)object).getWsoap_mep();
		return label == null || label.length() == 0 ?
			getString("_UI_BindingOperation_type") :
			getString("_UI_BindingOperation_type") + " " + label;
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

		switch (notification.getFeatureID(BindingOperation.class)) {
			case WSDL2_0Package.BINDING_OPERATION__WSOAP_MEP:
			case WSDL2_0Package.BINDING_OPERATION__WSOAP_ACTION:
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_LOCATION:
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_METHOD:
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_INPUT_SERIALIZATION:
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_OUTPUT_SERIALIZATION:
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_FAULT_SERIALIZATION:
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_QUERY_PARAMETER_SEPARATOR:
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_CONTENT_ENCODING_DEFAULT:
			case WSDL2_0Package.BINDING_OPERATION__WHTTP_IGNORE_UNCITED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WSDL2_0Package.BINDING_OPERATION__INPUT:
			case WSDL2_0Package.BINDING_OPERATION__OUTPUT:
			case WSDL2_0Package.BINDING_OPERATION__INFAULT:
			case WSDL2_0Package.BINDING_OPERATION__OUTFAULT:
			case WSDL2_0Package.BINDING_OPERATION__WSOAP_MODULE:
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
				(WSDL2_0Package.eINSTANCE.getBindingOperation_Input(),
				 WSDL2_0Factory.eINSTANCE.createBindingInput()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL2_0Package.eINSTANCE.getBindingOperation_Output(),
				 WSDL2_0Factory.eINSTANCE.createBindingOutput()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL2_0Package.eINSTANCE.getBindingOperation_Infault(),
				 WSDL2_0Factory.eINSTANCE.createBindingInfault()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL2_0Package.eINSTANCE.getBindingOperation_Outfault(),
				 WSDL2_0Factory.eINSTANCE.createBindingOutfault()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL2_0Package.eINSTANCE.getBindingOperation_Wsoap_module(),
				 WSDL2_0Factory.eINSTANCE.createWsoap_Module()));
	}

}
