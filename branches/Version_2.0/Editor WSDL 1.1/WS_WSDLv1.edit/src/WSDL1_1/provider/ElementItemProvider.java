/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL1_1.provider;


import WSDL1_1.Element;
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
 * This is the item provider adapter for a {@link WSDL1_1.Element} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ElementItemProvider
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
	public ElementItemProvider(AdapterFactory adapterFactory) {
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
			addMinOccursPropertyDescriptor(object);
			addMaxOccursPropertyDescriptor(object);
			addNillablePropertyDescriptor(object);
			addAbstractDefPropertyDescriptor(object);
			addFinalPropertyDescriptor(object);
			addBlockPropertyDescriptor(object);
			addDefaultPropertyDescriptor(object);
			addFixedPropertyDescriptor(object);
			addFormPropertyDescriptor(object);
			addRefPropertyDescriptor(object);
			addSubstitutionGroupPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
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
				 getString("_UI_Element_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_name_feature", "_UI_Element_type"),
				 WSDL1_1Package.eINSTANCE.getElement_Name(),
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
				 getString("_UI_Element_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_id_feature", "_UI_Element_type"),
				 WSDL1_1Package.eINSTANCE.getElement_Id(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_Element_minOccurs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_minOccurs_feature", "_UI_Element_type"),
				 WSDL1_1Package.eINSTANCE.getElement_MinOccurs(),
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
				 getString("_UI_Element_maxOccurs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_maxOccurs_feature", "_UI_Element_type"),
				 WSDL1_1Package.eINSTANCE.getElement_MaxOccurs(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nillable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNillablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_nillable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_nillable_feature", "_UI_Element_type"),
				 WSDL1_1Package.eINSTANCE.getElement_Nillable(),
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
				 getString("_UI_Element_abstractDef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_abstractDef_feature", "_UI_Element_type"),
				 WSDL1_1Package.eINSTANCE.getElement_AbstractDef(),
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
				 getString("_UI_Element_final_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_final_feature", "_UI_Element_type"),
				 WSDL1_1Package.eINSTANCE.getElement_Final(),
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
				 getString("_UI_Element_block_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_block_feature", "_UI_Element_type"),
				 WSDL1_1Package.eINSTANCE.getElement_Block(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_default_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_default_feature", "_UI_Element_type"),
				 WSDL1_1Package.eINSTANCE.getElement_Default(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fixed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFixedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_fixed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_fixed_feature", "_UI_Element_type"),
				 WSDL1_1Package.eINSTANCE.getElement_Fixed(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Form feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_form_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_form_feature", "_UI_Element_type"),
				 WSDL1_1Package.eINSTANCE.getElement_Form(),
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
				 getString("_UI_Element_ref_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_ref_feature", "_UI_Element_type"),
				 WSDL1_1Package.eINSTANCE.getElement_Ref(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Substitution Group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubstitutionGroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_substitutionGroup_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_substitutionGroup_feature", "_UI_Element_type"),
				 WSDL1_1Package.eINSTANCE.getElement_SubstitutionGroup(),
				 true,
				 false,
				 true,
				 null,
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
				 getString("_UI_Element_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_type_feature", "_UI_Element_type"),
				 WSDL1_1Package.eINSTANCE.getElement_Type(),
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
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getElement_Annotation());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getElement_ComplexType());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getElement_SimpleType());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getElement_UniqueDef());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getElement_Key());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getElement_Keyref());
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
	 * This returns Element.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Element"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Element)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Element_type") :
			getString("_UI_Element_type") + " " + label;
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

		switch (notification.getFeatureID(Element.class)) {
			case WSDL1_1Package.ELEMENT__NAME:
			case WSDL1_1Package.ELEMENT__ID:
			case WSDL1_1Package.ELEMENT__MIN_OCCURS:
			case WSDL1_1Package.ELEMENT__MAX_OCCURS:
			case WSDL1_1Package.ELEMENT__NILLABLE:
			case WSDL1_1Package.ELEMENT__ABSTRACT_DEF:
			case WSDL1_1Package.ELEMENT__FINAL:
			case WSDL1_1Package.ELEMENT__BLOCK:
			case WSDL1_1Package.ELEMENT__DEFAULT:
			case WSDL1_1Package.ELEMENT__FIXED:
			case WSDL1_1Package.ELEMENT__FORM:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WSDL1_1Package.ELEMENT__ANNOTATION:
			case WSDL1_1Package.ELEMENT__COMPLEX_TYPE:
			case WSDL1_1Package.ELEMENT__SIMPLE_TYPE:
			case WSDL1_1Package.ELEMENT__UNIQUE_DEF:
			case WSDL1_1Package.ELEMENT__KEY:
			case WSDL1_1Package.ELEMENT__KEYREF:
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
				(WSDL1_1Package.eINSTANCE.getElement_Annotation(),
				 WSDL1_1Factory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getElement_ComplexType(),
				 WSDL1_1Factory.eINSTANCE.createComplexType()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getElement_SimpleType(),
				 WSDL1_1Factory.eINSTANCE.createSimpleType()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getElement_UniqueDef(),
				 WSDL1_1Factory.eINSTANCE.createUnique()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getElement_Key(),
				 WSDL1_1Factory.eINSTANCE.createKey()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getElement_Keyref(),
				 WSDL1_1Factory.eINSTANCE.createKeyRef()));
	}

}
