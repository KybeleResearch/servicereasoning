/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL1_1.provider;


import WSDL1_1.Schema;
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
 * This is the item provider adapter for a {@link WSDL1_1.Schema} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SchemaItemProvider
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
	public SchemaItemProvider(AdapterFactory adapterFactory) {
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
			addVersionPropertyDescriptor(object);
			addNdsPropertyDescriptor(object);
			addNsSchemaPropertyDescriptor(object);
			addFinalDefaultPropertyDescriptor(object);
			addBlockDefaultPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addElementFormDefaultPropertyDescriptor(object);
			addAttributeFormDefaultPropertyDescriptor(object);
			addXml_langPropertyDescriptor(object);
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
				 getString("_UI_Schema_targetNamespace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Schema_targetNamespace_feature", "_UI_Schema_type"),
				 WSDL1_1Package.eINSTANCE.getSchema_TargetNamespace(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Schema_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Schema_version_feature", "_UI_Schema_type"),
				 WSDL1_1Package.eINSTANCE.getSchema_Version(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nds feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNdsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Schema_nds_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Schema_nds_feature", "_UI_Schema_type"),
				 WSDL1_1Package.eINSTANCE.getSchema_Nds(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ns Schema feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNsSchemaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Schema_nsSchema_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Schema_nsSchema_feature", "_UI_Schema_type"),
				 WSDL1_1Package.eINSTANCE.getSchema_NsSchema(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Final Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFinalDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Schema_finalDefault_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Schema_finalDefault_feature", "_UI_Schema_type"),
				 WSDL1_1Package.eINSTANCE.getSchema_FinalDefault(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Block Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBlockDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Schema_blockDefault_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Schema_blockDefault_feature", "_UI_Schema_type"),
				 WSDL1_1Package.eINSTANCE.getSchema_BlockDefault(),
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
				 getString("_UI_Schema_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Schema_id_feature", "_UI_Schema_type"),
				 WSDL1_1Package.eINSTANCE.getSchema_Id(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Element Form Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElementFormDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Schema_elementFormDefault_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Schema_elementFormDefault_feature", "_UI_Schema_type"),
				 WSDL1_1Package.eINSTANCE.getSchema_ElementFormDefault(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Attribute Form Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttributeFormDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Schema_attributeFormDefault_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Schema_attributeFormDefault_feature", "_UI_Schema_type"),
				 WSDL1_1Package.eINSTANCE.getSchema_AttributeFormDefault(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Xml lang feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXml_langPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Schema_xml_lang_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Schema_xml_lang_feature", "_UI_Schema_type"),
				 WSDL1_1Package.eINSTANCE.getSchema_Xml_lang(),
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
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getSchema_Include());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getSchema_Import());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getSchema_Redefine());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getSchema_Annotation());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getSchema_SimpleType());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getSchema_ComplexType());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getSchema_Element());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getSchema_Attribute());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getSchema_AttributeGroup());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getSchema_Group());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getSchema_Notation());
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
	 * This returns Schema.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Schema"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Schema)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_Schema_type") :
			getString("_UI_Schema_type") + " " + label;
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

		switch (notification.getFeatureID(Schema.class)) {
			case WSDL1_1Package.SCHEMA__TARGET_NAMESPACE:
			case WSDL1_1Package.SCHEMA__VERSION:
			case WSDL1_1Package.SCHEMA__NDS:
			case WSDL1_1Package.SCHEMA__NS_SCHEMA:
			case WSDL1_1Package.SCHEMA__FINAL_DEFAULT:
			case WSDL1_1Package.SCHEMA__BLOCK_DEFAULT:
			case WSDL1_1Package.SCHEMA__ID:
			case WSDL1_1Package.SCHEMA__ELEMENT_FORM_DEFAULT:
			case WSDL1_1Package.SCHEMA__ATTRIBUTE_FORM_DEFAULT:
			case WSDL1_1Package.SCHEMA__XML_LANG:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WSDL1_1Package.SCHEMA__INCLUDE:
			case WSDL1_1Package.SCHEMA__IMPORT:
			case WSDL1_1Package.SCHEMA__REDEFINE:
			case WSDL1_1Package.SCHEMA__ANNOTATION:
			case WSDL1_1Package.SCHEMA__SIMPLE_TYPE:
			case WSDL1_1Package.SCHEMA__COMPLEX_TYPE:
			case WSDL1_1Package.SCHEMA__ELEMENT:
			case WSDL1_1Package.SCHEMA__ATTRIBUTE:
			case WSDL1_1Package.SCHEMA__ATTRIBUTE_GROUP:
			case WSDL1_1Package.SCHEMA__GROUP:
			case WSDL1_1Package.SCHEMA__NOTATION:
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
				(WSDL1_1Package.eINSTANCE.getSchema_Include(),
				 WSDL1_1Factory.eINSTANCE.createInclude()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getSchema_Import(),
				 WSDL1_1Factory.eINSTANCE.createImportXMLSchema()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getSchema_Redefine(),
				 WSDL1_1Factory.eINSTANCE.createRedefine()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getSchema_Annotation(),
				 WSDL1_1Factory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getSchema_SimpleType(),
				 WSDL1_1Factory.eINSTANCE.createSimpleType()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getSchema_ComplexType(),
				 WSDL1_1Factory.eINSTANCE.createComplexType()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getSchema_Element(),
				 WSDL1_1Factory.eINSTANCE.createElement()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getSchema_Element(),
				 WSDL1_1Factory.eINSTANCE.createElementImported()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getSchema_Attribute(),
				 WSDL1_1Factory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getSchema_AttributeGroup(),
				 WSDL1_1Factory.eINSTANCE.createAttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getSchema_Group(),
				 WSDL1_1Factory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getSchema_Notation(),
				 WSDL1_1Factory.eINSTANCE.createNotation()));
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
