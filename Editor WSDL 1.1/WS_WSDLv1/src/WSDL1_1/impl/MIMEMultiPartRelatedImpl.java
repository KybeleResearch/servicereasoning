/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL1_1.impl;

import WSDL1_1.MIMEMultiPartRelated;
import WSDL1_1.MIMEPart;
import WSDL1_1.WSDL1_1Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MIME Multi Part Related</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WSDL1_1.impl.MIMEMultiPartRelatedImpl#getPart <em>Part</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MIMEMultiPartRelatedImpl extends EObjectImpl implements MIMEMultiPartRelated {
	/**
	 * The cached value of the '{@link #getPart() <em>Part</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
	protected EList<MIMEPart> part;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MIMEMultiPartRelatedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WSDL1_1Package.eINSTANCE.getMIMEMultiPartRelated();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MIMEPart> getPart() {
		if (part == null) {
			part = new EObjectContainmentEList<MIMEPart>(MIMEPart.class, this, WSDL1_1Package.MIME_MULTI_PART_RELATED__PART);
		}
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WSDL1_1Package.MIME_MULTI_PART_RELATED__PART:
				return ((InternalEList<?>)getPart()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WSDL1_1Package.MIME_MULTI_PART_RELATED__PART:
				return getPart();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WSDL1_1Package.MIME_MULTI_PART_RELATED__PART:
				getPart().clear();
				getPart().addAll((Collection<? extends MIMEPart>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WSDL1_1Package.MIME_MULTI_PART_RELATED__PART:
				getPart().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WSDL1_1Package.MIME_MULTI_PART_RELATED__PART:
				return part != null && !part.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MIMEMultiPartRelatedImpl
