/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL1_1.provider;


import WSDL1_1.ComplexType;
import WSDL1_1.WSDL1_1Factory;
import WSDL1_1.WSDL1_1Package;

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
 * This is the item provider adapter for a {@link WSDL1_1.ComplexType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComplexTypeItemProvider
	extends TypeRefItemProvider
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
	public ComplexTypeItemProvider(AdapterFactory adapterFactory) {
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
			addIdPropertyDescriptor(object);
			addAbstractDefPropertyDescriptor(object);
			addFinalPropertyDescriptor(object);
			addBlockPropertyDescriptor(object);
			addMixedPropertyDescriptor(object);
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
				 getString("_UI_ComplexType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComplexType_name_feature", "_UI_ComplexType_type"),
				 WSDL1_1Package.eINSTANCE.getComplexType_Name(),
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
				 getString("_UI_ComplexType_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComplexType_id_feature", "_UI_ComplexType_type"),
				 WSDL1_1Package.eINSTANCE.getComplexType_Id(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Abstract Def feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbstractDefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComplexType_abstractDef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComplexType_abstractDef_feature", "_UI_ComplexType_type"),
				 WSDL1_1Package.eINSTANCE.getComplexType_AbstractDef(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Final feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFinalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComplexType_final_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComplexType_final_feature", "_UI_ComplexType_type"),
				 WSDL1_1Package.eINSTANCE.getComplexType_Final(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Block feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBlockPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComplexType_block_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComplexType_block_feature", "_UI_ComplexType_type"),
				 WSDL1_1Package.eINSTANCE.getComplexType_Block(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mixed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMixedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComplexType_mixed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComplexType_mixed_feature", "_UI_ComplexType_type"),
				 WSDL1_1Package.eINSTANCE.getComplexType_Mixed(),
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
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getComplexType_Annotation());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getComplexType_SimpleContent());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getComplexType_ComplexContent());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getComplexType_All());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getComplexType_Choice());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getComplexType_SequenceDef());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getComplexType_Group());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getComplexType_Attribute());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getComplexType_AttributeGroup());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getComplexType_AnyAttribute());
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
	 * This returns ComplexType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComplexType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ComplexType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ComplexType_type") :
			getString("_UI_ComplexType_type") + " " + label;
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

		switch (notification.getFeatureID(ComplexType.class)) {
			case WSDL1_1Package.COMPLEX_TYPE__NAME:
			case WSDL1_1Package.COMPLEX_TYPE__ID:
			case WSDL1_1Package.COMPLEX_TYPE__ABSTRACT_DEF:
			case WSDL1_1Package.COMPLEX_TYPE__FINAL:
			case WSDL1_1Package.COMPLEX_TYPE__BLOCK:
			case WSDL1_1Package.COMPLEX_TYPE__MIXED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WSDL1_1Package.COMPLEX_TYPE__ANNOTATION:
			case WSDL1_1Package.COMPLEX_TYPE__SIMPLE_CONTENT:
			case WSDL1_1Package.COMPLEX_TYPE__COMPLEX_CONTENT:
			case WSDL1_1Package.COMPLEX_TYPE__ALL:
			case WSDL1_1Package.COMPLEX_TYPE__CHOICE:
			case WSDL1_1Package.COMPLEX_TYPE__SEQUENCE_DEF:
			case WSDL1_1Package.COMPLEX_TYPE__GROUP:
			case WSDL1_1Package.COMPLEX_TYPE__ATTRIBUTE:
			case WSDL1_1Package.COMPLEX_TYPE__ATTRIBUTE_GROUP:
			case WSDL1_1Package.COMPLEX_TYPE__ANY_ATTRIBUTE:
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
				(WSDL1_1Package.eINSTANCE.getComplexType_Annotation(),
				 WSDL1_1Factory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getComplexType_SimpleContent(),
				 WSDL1_1Factory.eINSTANCE.createSimpleContent()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getComplexType_ComplexContent(),
				 WSDL1_1Factory.eINSTANCE.createComplexContent()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getComplexType_All(),
				 WSDL1_1Factory.eINSTANCE.createAll()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getComplexType_Choice(),
				 WSDL1_1Factory.eINSTANCE.createChoice()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getComplexType_SequenceDef(),
				 WSDL1_1Factory.eINSTANCE.createSequenceType()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getComplexType_Group(),
				 WSDL1_1Factory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getComplexType_Attribute(),
				 WSDL1_1Factory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getComplexType_AttributeGroup(),
				 WSDL1_1Factory.eINSTANCE.createAttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getComplexType_AnyAttribute(),
				 WSDL1_1Factory.eINSTANCE.createAnyAttribute()));
	}

}
