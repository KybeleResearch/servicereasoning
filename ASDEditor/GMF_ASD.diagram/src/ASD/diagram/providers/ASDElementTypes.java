/*
 * 
 */
package ASD.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import ASD.ASDPackage;
import ASD.diagram.edit.parts.Annotation2EditPart;
import ASD.diagram.edit.parts.AnnotationEditPart;
import ASD.diagram.edit.parts.AssertionEditPart;
import ASD.diagram.edit.parts.AssertionSetEditPart;
import ASD.diagram.edit.parts.InfoType2EditPart;
import ASD.diagram.edit.parts.InfoTypeEditPart;
import ASD.diagram.edit.parts.InfoTypeImported2EditPart;
import ASD.diagram.edit.parts.InfoTypeImportedEditPart;
import ASD.diagram.edit.parts.InfoTypeRefEditPart;
import ASD.diagram.edit.parts.MessageEditPart;
import ASD.diagram.edit.parts.MessageInfoTypeEditPart;
import ASD.diagram.edit.parts.OperationEditPart;
import ASD.diagram.edit.parts.ProfileEditPart;
import ASD.diagram.edit.parts.ProfileRefersEditPart;
import ASD.diagram.edit.parts.ServiceDescriptionEditPart;
import ASD.diagram.part.ASDDiagramEditorPlugin;

/**
 * @generated
 */
public class ASDElementTypes {

	/**
	 * @generated
	 */
	private ASDElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType ServiceDescription_1000 = getElementType("GMF_ASD.diagram.ServiceDescription_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InfoTypeImported_2001 = getElementType("GMF_ASD.diagram.InfoTypeImported_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Operation_2002 = getElementType("GMF_ASD.diagram.Operation_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InfoType_2003 = getElementType("GMF_ASD.diagram.InfoType_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Profile_2004 = getElementType("GMF_ASD.diagram.Profile_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Annotation_2005 = getElementType("GMF_ASD.diagram.Annotation_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InfoTypeImported_3001 = getElementType("GMF_ASD.diagram.InfoTypeImported_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InfoType_3002 = getElementType("GMF_ASD.diagram.InfoType_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Annotation_3003 = getElementType("GMF_ASD.diagram.Annotation_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Message_3004 = getElementType("GMF_ASD.diagram.Message_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AssertionSet_3005 = getElementType("GMF_ASD.diagram.AssertionSet_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Assertion_3006 = getElementType("GMF_ASD.diagram.Assertion_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MessageInfoType_4001 = getElementType("GMF_ASD.diagram.MessageInfoType_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InfoTypeRef_4002 = getElementType("GMF_ASD.diagram.InfoTypeRef_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProfileRefers_4003 = getElementType("GMF_ASD.diagram.ProfileRefers_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return ASDDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(ServiceDescription_1000,
					ASDPackage.eINSTANCE.getServiceDescription());

			elements.put(InfoTypeImported_2001,
					ASDPackage.eINSTANCE.getInfoTypeImported());

			elements.put(Operation_2002, ASDPackage.eINSTANCE.getOperation());

			elements.put(InfoType_2003, ASDPackage.eINSTANCE.getInfoType());

			elements.put(Profile_2004, ASDPackage.eINSTANCE.getProfile());

			elements.put(Annotation_2005, ASDPackage.eINSTANCE.getAnnotation());

			elements.put(InfoTypeImported_3001,
					ASDPackage.eINSTANCE.getInfoTypeImported());

			elements.put(InfoType_3002, ASDPackage.eINSTANCE.getInfoType());

			elements.put(Annotation_3003, ASDPackage.eINSTANCE.getAnnotation());

			elements.put(Message_3004, ASDPackage.eINSTANCE.getMessage());

			elements.put(AssertionSet_3005,
					ASDPackage.eINSTANCE.getAssertionSet());

			elements.put(Assertion_3006, ASDPackage.eINSTANCE.getAssertion());

			elements.put(MessageInfoType_4001,
					ASDPackage.eINSTANCE.getMessage_InfoType());

			elements.put(InfoTypeRef_4002,
					ASDPackage.eINSTANCE.getInfoType_Ref());

			elements.put(ProfileRefers_4003,
					ASDPackage.eINSTANCE.getProfile_Refers());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(ServiceDescription_1000);
			KNOWN_ELEMENT_TYPES.add(InfoTypeImported_2001);
			KNOWN_ELEMENT_TYPES.add(Operation_2002);
			KNOWN_ELEMENT_TYPES.add(InfoType_2003);
			KNOWN_ELEMENT_TYPES.add(Profile_2004);
			KNOWN_ELEMENT_TYPES.add(Annotation_2005);
			KNOWN_ELEMENT_TYPES.add(InfoTypeImported_3001);
			KNOWN_ELEMENT_TYPES.add(InfoType_3002);
			KNOWN_ELEMENT_TYPES.add(Annotation_3003);
			KNOWN_ELEMENT_TYPES.add(Message_3004);
			KNOWN_ELEMENT_TYPES.add(AssertionSet_3005);
			KNOWN_ELEMENT_TYPES.add(Assertion_3006);
			KNOWN_ELEMENT_TYPES.add(MessageInfoType_4001);
			KNOWN_ELEMENT_TYPES.add(InfoTypeRef_4002);
			KNOWN_ELEMENT_TYPES.add(ProfileRefers_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ServiceDescriptionEditPart.VISUAL_ID:
			return ServiceDescription_1000;
		case InfoTypeImportedEditPart.VISUAL_ID:
			return InfoTypeImported_2001;
		case OperationEditPart.VISUAL_ID:
			return Operation_2002;
		case InfoTypeEditPart.VISUAL_ID:
			return InfoType_2003;
		case ProfileEditPart.VISUAL_ID:
			return Profile_2004;
		case AnnotationEditPart.VISUAL_ID:
			return Annotation_2005;
		case InfoTypeImported2EditPart.VISUAL_ID:
			return InfoTypeImported_3001;
		case InfoType2EditPart.VISUAL_ID:
			return InfoType_3002;
		case Annotation2EditPart.VISUAL_ID:
			return Annotation_3003;
		case MessageEditPart.VISUAL_ID:
			return Message_3004;
		case AssertionSetEditPart.VISUAL_ID:
			return AssertionSet_3005;
		case AssertionEditPart.VISUAL_ID:
			return Assertion_3006;
		case MessageInfoTypeEditPart.VISUAL_ID:
			return MessageInfoType_4001;
		case InfoTypeRefEditPart.VISUAL_ID:
			return InfoTypeRef_4002;
		case ProfileRefersEditPart.VISUAL_ID:
			return ProfileRefers_4003;
		}
		return null;
	}

}
