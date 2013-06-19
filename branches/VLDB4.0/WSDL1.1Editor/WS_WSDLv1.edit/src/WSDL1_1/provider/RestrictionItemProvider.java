/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL1_1.provider;


import WSDL1_1.Restriction;
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
 * This is the item provider adapter for a {@link WSDL1_1.Restriction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RestrictionItemProvider
	extends AdicionalInformationTypeItemProvider
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
	public RestrictionItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
			addBasePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_Restriction_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Restriction_id_feature", "_UI_Restriction_type"),
				 WSDL1_1Package.eINSTANCE.getRestriction_Id(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBasePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Restriction_base_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Restriction_base_feature", "_UI_Restriction_type"),
				 WSDL1_1Package.eINSTANCE.getRestriction_Base(),
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
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getRestriction_Annotation());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getRestriction_All());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getRestriction_Choice());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getRestriction_SequenceDef());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getRestriction_Group());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getRestriction_SimpleType());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getRestriction_MinExclusive());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getRestriction_MinInclusive());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getRestriction_MaxExclusive());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getRestriction_MaxInclusive());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getRestriction_TotalDigits());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getRestriction_FractionDigits());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getRestriction_Pattern());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getRestriction_Enumeration());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getRestriction_WhiteSpace());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getRestriction_Length());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getRestriction_MaxLength());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getRestriction_MinLength());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getRestriction_Attribute());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getRestriction_AttributeGroup());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getRestriction_AnyAttribute());
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
	 * This returns Restriction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Restriction"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Restriction)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_Restriction_type") :
			getString("_UI_Restriction_type") + " " + label;
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

		switch (notification.getFeatureID(Restriction.class)) {
			case WSDL1_1Package.RESTRICTION__ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WSDL1_1Package.RESTRICTION__ANNOTATION:
			case WSDL1_1Package.RESTRICTION__ALL:
			case WSDL1_1Package.RESTRICTION__CHOICE:
			case WSDL1_1Package.RESTRICTION__SEQUENCE_DEF:
			case WSDL1_1Package.RESTRICTION__GROUP:
			case WSDL1_1Package.RESTRICTION__SIMPLE_TYPE:
			case WSDL1_1Package.RESTRICTION__MIN_EXCLUSIVE:
			case WSDL1_1Package.RESTRICTION__MIN_INCLUSIVE:
			case WSDL1_1Package.RESTRICTION__MAX_EXCLUSIVE:
			case WSDL1_1Package.RESTRICTION__MAX_INCLUSIVE:
			case WSDL1_1Package.RESTRICTION__TOTAL_DIGITS:
			case WSDL1_1Package.RESTRICTION__FRACTION_DIGITS:
			case WSDL1_1Package.RESTRICTION__PATTERN:
			case WSDL1_1Package.RESTRICTION__ENUMERATION:
			case WSDL1_1Package.RESTRICTION__WHITE_SPACE:
			case WSDL1_1Package.RESTRICTION__LENGTH:
			case WSDL1_1Package.RESTRICTION__MAX_LENGTH:
			case WSDL1_1Package.RESTRICTION__MIN_LENGTH:
			case WSDL1_1Package.RESTRICTION__ATTRIBUTE:
			case WSDL1_1Package.RESTRICTION__ATTRIBUTE_GROUP:
			case WSDL1_1Package.RESTRICTION__ANY_ATTRIBUTE:
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
				(WSDL1_1Package.eINSTANCE.getRestriction_Annotation(),
				 WSDL1_1Factory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getRestriction_All(),
				 WSDL1_1Factory.eINSTANCE.createAll()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getRestriction_Choice(),
				 WSDL1_1Factory.eINSTANCE.createChoice()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getRestriction_SequenceDef(),
				 WSDL1_1Factory.eINSTANCE.createSequenceType()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getRestriction_Group(),
				 WSDL1_1Factory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getRestriction_SimpleType(),
				 WSDL1_1Factory.eINSTANCE.createSimpleType()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getRestriction_MinExclusive(),
				 WSDL1_1Factory.eINSTANCE.createMinExclusive()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getRestriction_MinInclusive(),
				 WSDL1_1Factory.eINSTANCE.createMinInclusive()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getRestriction_MaxExclusive(),
				 WSDL1_1Factory.eINSTANCE.createMaxExclusive()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getRestriction_MaxInclusive(),
				 WSDL1_1Factory.eINSTANCE.createMaxInclusive()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getRestriction_TotalDigits(),
				 WSDL1_1Factory.eINSTANCE.createTotalDigits()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getRestriction_FractionDigits(),
				 WSDL1_1Factory.eINSTANCE.createFractionDigits()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getRestriction_Pattern(),
				 WSDL1_1Factory.eINSTANCE.createPattern()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getRestriction_Enumeration(),
				 WSDL1_1Factory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getRestriction_WhiteSpace(),
				 WSDL1_1Factory.eINSTANCE.createWhiteSpace()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getRestriction_Length(),
				 WSDL1_1Factory.eINSTANCE.createLength()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getRestriction_MaxLength(),
				 WSDL1_1Factory.eINSTANCE.createMaxLength()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getRestriction_MinLength(),
				 WSDL1_1Factory.eINSTANCE.createMinLength()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getRestriction_Attribute(),
				 WSDL1_1Factory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getRestriction_AttributeGroup(),
				 WSDL1_1Factory.eINSTANCE.createAttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getRestriction_AnyAttribute(),
				 WSDL1_1Factory.eINSTANCE.createAnyAttribute()));
	}

}
