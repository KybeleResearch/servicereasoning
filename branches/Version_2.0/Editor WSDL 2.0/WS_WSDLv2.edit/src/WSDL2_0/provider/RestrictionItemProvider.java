/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL2_0.provider;


import WSDL2_0.Restriction;
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
 * This is the item provider adapter for a {@link WSDL2_0.Restriction} object.
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
				 WSDL2_0Package.eINSTANCE.getRestriction_Id(),
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
				 WSDL2_0Package.eINSTANCE.getRestriction_Base(),
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
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getRestriction_Annotation());
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getRestriction_All());
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getRestriction_Choice());
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getRestriction_SequenceDef());
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getRestriction_Group());
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getRestriction_SimpleType());
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getRestriction_MinExclusive());
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getRestriction_MinInclusive());
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getRestriction_MaxExclusive());
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getRestriction_MaxInclusive());
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getRestriction_TotalDigits());
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getRestriction_FractionDigits());
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getRestriction_Pattern());
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getRestriction_Enumeration());
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getRestriction_WhiteSpace());
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getRestriction_Length());
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getRestriction_MaxLength());
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getRestriction_MinLength());
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getRestriction_Attribute());
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getRestriction_AttributeGroup());
			childrenFeatures.add(WSDL2_0Package.eINSTANCE.getRestriction_AnyAttribute());
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
			case WSDL2_0Package.RESTRICTION__ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WSDL2_0Package.RESTRICTION__ANNOTATION:
			case WSDL2_0Package.RESTRICTION__ALL:
			case WSDL2_0Package.RESTRICTION__CHOICE:
			case WSDL2_0Package.RESTRICTION__SEQUENCE_DEF:
			case WSDL2_0Package.RESTRICTION__GROUP:
			case WSDL2_0Package.RESTRICTION__SIMPLE_TYPE:
			case WSDL2_0Package.RESTRICTION__MIN_EXCLUSIVE:
			case WSDL2_0Package.RESTRICTION__MIN_INCLUSIVE:
			case WSDL2_0Package.RESTRICTION__MAX_EXCLUSIVE:
			case WSDL2_0Package.RESTRICTION__MAX_INCLUSIVE:
			case WSDL2_0Package.RESTRICTION__TOTAL_DIGITS:
			case WSDL2_0Package.RESTRICTION__FRACTION_DIGITS:
			case WSDL2_0Package.RESTRICTION__PATTERN:
			case WSDL2_0Package.RESTRICTION__ENUMERATION:
			case WSDL2_0Package.RESTRICTION__WHITE_SPACE:
			case WSDL2_0Package.RESTRICTION__LENGTH:
			case WSDL2_0Package.RESTRICTION__MAX_LENGTH:
			case WSDL2_0Package.RESTRICTION__MIN_LENGTH:
			case WSDL2_0Package.RESTRICTION__ATTRIBUTE:
			case WSDL2_0Package.RESTRICTION__ATTRIBUTE_GROUP:
			case WSDL2_0Package.RESTRICTION__ANY_ATTRIBUTE:
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
				(WSDL2_0Package.eINSTANCE.getRestriction_Annotation(),
				 WSDL2_0Factory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL2_0Package.eINSTANCE.getRestriction_All(),
				 WSDL2_0Factory.eINSTANCE.createAll()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL2_0Package.eINSTANCE.getRestriction_Choice(),
				 WSDL2_0Factory.eINSTANCE.createChoice()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL2_0Package.eINSTANCE.getRestriction_SequenceDef(),
				 WSDL2_0Factory.eINSTANCE.createSequenceType()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL2_0Package.eINSTANCE.getRestriction_Group(),
				 WSDL2_0Factory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL2_0Package.eINSTANCE.getRestriction_SimpleType(),
				 WSDL2_0Factory.eINSTANCE.createSimpleType()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL2_0Package.eINSTANCE.getRestriction_MinExclusive(),
				 WSDL2_0Factory.eINSTANCE.createMinExclusive()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL2_0Package.eINSTANCE.getRestriction_MinInclusive(),
				 WSDL2_0Factory.eINSTANCE.createMinInclusive()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL2_0Package.eINSTANCE.getRestriction_MaxExclusive(),
				 WSDL2_0Factory.eINSTANCE.createMaxExclusive()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL2_0Package.eINSTANCE.getRestriction_MaxInclusive(),
				 WSDL2_0Factory.eINSTANCE.createMaxInclusive()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL2_0Package.eINSTANCE.getRestriction_TotalDigits(),
				 WSDL2_0Factory.eINSTANCE.createTotalDigits()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL2_0Package.eINSTANCE.getRestriction_FractionDigits(),
				 WSDL2_0Factory.eINSTANCE.createFractionDigits()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL2_0Package.eINSTANCE.getRestriction_Pattern(),
				 WSDL2_0Factory.eINSTANCE.createPattern()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL2_0Package.eINSTANCE.getRestriction_Enumeration(),
				 WSDL2_0Factory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL2_0Package.eINSTANCE.getRestriction_WhiteSpace(),
				 WSDL2_0Factory.eINSTANCE.createWhiteSpace()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL2_0Package.eINSTANCE.getRestriction_Length(),
				 WSDL2_0Factory.eINSTANCE.createLength()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL2_0Package.eINSTANCE.getRestriction_MaxLength(),
				 WSDL2_0Factory.eINSTANCE.createMaxLength()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL2_0Package.eINSTANCE.getRestriction_MinLength(),
				 WSDL2_0Factory.eINSTANCE.createMinLength()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL2_0Package.eINSTANCE.getRestriction_Attribute(),
				 WSDL2_0Factory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL2_0Package.eINSTANCE.getRestriction_AttributeGroup(),
				 WSDL2_0Factory.eINSTANCE.createAttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL2_0Package.eINSTANCE.getRestriction_AnyAttribute(),
				 WSDL2_0Factory.eINSTANCE.createAnyAttribute()));
	}

}
