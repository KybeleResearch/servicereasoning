/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL1_1.provider;


import WSDL1_1.SequenceType;
import WSDL1_1.WSDL1_1Factory;
import WSDL1_1.WSDL1_1Package;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link WSDL1_1.SequenceType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SequenceTypeItemProvider
	extends ItemProviderAdapter
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
	public SequenceTypeItemProvider(AdapterFactory adapterFactory) {
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

			addMinOccursPropertyDescriptor(object);
			addMaxOccursPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Min Occurs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinOccursPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SequenceType_minOccurs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SequenceType_minOccurs_feature", "_UI_SequenceType_type"),
				 WSDL1_1Package.eINSTANCE.getSequenceType_MinOccurs(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Occurs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxOccursPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SequenceType_maxOccurs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SequenceType_maxOccurs_feature", "_UI_SequenceType_type"),
				 WSDL1_1Package.eINSTANCE.getSequenceType_MaxOccurs(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SequenceType_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SequenceType_id_feature", "_UI_SequenceType_type"),
				 WSDL1_1Package.eINSTANCE.getSequenceType_Id(),
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
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getSequenceType_Annotation());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getSequenceType_Element());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getSequenceType_Group());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getSequenceType_Choice());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getSequenceType_SequenceDef());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getSequenceType_Any());
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
	 * This returns SequenceType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SequenceType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SequenceType)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_SequenceType_type") :
			getString("_UI_SequenceType_type") + " " + label;
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

		switch (notification.getFeatureID(SequenceType.class)) {
			case WSDL1_1Package.SEQUENCE_TYPE__MIN_OCCURS:
			case WSDL1_1Package.SEQUENCE_TYPE__MAX_OCCURS:
			case WSDL1_1Package.SEQUENCE_TYPE__ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WSDL1_1Package.SEQUENCE_TYPE__ANNOTATION:
			case WSDL1_1Package.SEQUENCE_TYPE__ELEMENT:
			case WSDL1_1Package.SEQUENCE_TYPE__GROUP:
			case WSDL1_1Package.SEQUENCE_TYPE__CHOICE:
			case WSDL1_1Package.SEQUENCE_TYPE__SEQUENCE_DEF:
			case WSDL1_1Package.SEQUENCE_TYPE__ANY:
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
				(WSDL1_1Package.eINSTANCE.getSequenceType_Annotation(),
				 WSDL1_1Factory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getSequenceType_Element(),
				 WSDL1_1Factory.eINSTANCE.createElement()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getSequenceType_Element(),
				 WSDL1_1Factory.eINSTANCE.createElementImported()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getSequenceType_Group(),
				 WSDL1_1Factory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getSequenceType_Choice(),
				 WSDL1_1Factory.eINSTANCE.createChoice()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getSequenceType_SequenceDef(),
				 WSDL1_1Factory.eINSTANCE.createSequenceType()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getSequenceType_Any(),
				 WSDL1_1Factory.eINSTANCE.createAny()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Wsdl1_1EditPlugin.INSTANCE;
	}

}
