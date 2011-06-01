/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL1_1.provider;


import WSDL1_1.BindingInput;
import WSDL1_1.WSDL1_1Factory;
import WSDL1_1.WSDL1_1Package;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link WSDL1_1.BindingInput} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BindingInputItemProvider
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
	public BindingInputItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getBindingInput_Body());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getBindingInput_Header());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getBindingInput_UrlReplacement());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getBindingInput_UrlEncoded());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getBindingInput_MultipartRelated());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getBindingInput_Content());
			childrenFeatures.add(WSDL1_1Package.eINSTANCE.getBindingInput_MimeXml());
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
	 * This returns BindingInput.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BindingInput"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_BindingInput_type");
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

		switch (notification.getFeatureID(BindingInput.class)) {
			case WSDL1_1Package.BINDING_INPUT__BODY:
			case WSDL1_1Package.BINDING_INPUT__HEADER:
			case WSDL1_1Package.BINDING_INPUT__URL_REPLACEMENT:
			case WSDL1_1Package.BINDING_INPUT__URL_ENCODED:
			case WSDL1_1Package.BINDING_INPUT__MULTIPART_RELATED:
			case WSDL1_1Package.BINDING_INPUT__CONTENT:
			case WSDL1_1Package.BINDING_INPUT__MIME_XML:
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
				(WSDL1_1Package.eINSTANCE.getBindingInput_Body(),
				 WSDL1_1Factory.eINSTANCE.createBodySOAP()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getBindingInput_Header(),
				 WSDL1_1Factory.eINSTANCE.createHeaderSOAP()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getBindingInput_UrlReplacement(),
				 WSDL1_1Factory.eINSTANCE.createURLReplacement()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getBindingInput_UrlEncoded(),
				 WSDL1_1Factory.eINSTANCE.createURLEncoded()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getBindingInput_MultipartRelated(),
				 WSDL1_1Factory.eINSTANCE.createMIMEMultiPartRelated()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getBindingInput_Content(),
				 WSDL1_1Factory.eINSTANCE.createMIMEContent()));

		newChildDescriptors.add
			(createChildParameter
				(WSDL1_1Package.eINSTANCE.getBindingInput_MimeXml(),
				 WSDL1_1Factory.eINSTANCE.createMIMEXml()));
	}

}
