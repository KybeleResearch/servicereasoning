/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ASD.impl;

import ASD.ASDPackage;
import ASD.InfoType;
import ASD.Operation;
import ASD.Profile;
import ASD.ServiceDescription;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ASD.impl.ServiceDescriptionImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link ASD.impl.ServiceDescriptionImpl#getInfotypes <em>Infotypes</em>}</li>
 *   <li>{@link ASD.impl.ServiceDescriptionImpl#getProfiles <em>Profiles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceDescriptionImpl extends NamedElementImpl implements ServiceDescription {
	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operations;

	/**
	 * The cached value of the '{@link #getInfotypes() <em>Infotypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfotypes()
	 * @generated
	 * @ordered
	 */
	protected EList<InfoType> infotypes;

	/**
	 * The cached value of the '{@link #getProfiles() <em>Profiles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfiles()
	 * @generated
	 * @ordered
	 */
	protected EList<Profile> profiles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASDPackage.Literals.SERVICE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentWithInverseEList<Operation>(Operation.class, this, ASDPackage.SERVICE_DESCRIPTION__OPERATIONS, ASDPackage.OPERATION__SERVICE);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InfoType> getInfotypes() {
		if (infotypes == null) {
			infotypes = new EObjectContainmentWithInverseEList<InfoType>(InfoType.class, this, ASDPackage.SERVICE_DESCRIPTION__INFOTYPES, ASDPackage.INFO_TYPE__SERVICE);
		}
		return infotypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Profile> getProfiles() {
		if (profiles == null) {
			profiles = new EObjectContainmentWithInverseEList<Profile>(Profile.class, this, ASDPackage.SERVICE_DESCRIPTION__PROFILES, ASDPackage.PROFILE__SERVICE);
		}
		return profiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ASDPackage.SERVICE_DESCRIPTION__OPERATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperations()).basicAdd(otherEnd, msgs);
			case ASDPackage.SERVICE_DESCRIPTION__INFOTYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInfotypes()).basicAdd(otherEnd, msgs);
			case ASDPackage.SERVICE_DESCRIPTION__PROFILES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProfiles()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ASDPackage.SERVICE_DESCRIPTION__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
			case ASDPackage.SERVICE_DESCRIPTION__INFOTYPES:
				return ((InternalEList<?>)getInfotypes()).basicRemove(otherEnd, msgs);
			case ASDPackage.SERVICE_DESCRIPTION__PROFILES:
				return ((InternalEList<?>)getProfiles()).basicRemove(otherEnd, msgs);
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
			case ASDPackage.SERVICE_DESCRIPTION__OPERATIONS:
				return getOperations();
			case ASDPackage.SERVICE_DESCRIPTION__INFOTYPES:
				return getInfotypes();
			case ASDPackage.SERVICE_DESCRIPTION__PROFILES:
				return getProfiles();
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
			case ASDPackage.SERVICE_DESCRIPTION__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends Operation>)newValue);
				return;
			case ASDPackage.SERVICE_DESCRIPTION__INFOTYPES:
				getInfotypes().clear();
				getInfotypes().addAll((Collection<? extends InfoType>)newValue);
				return;
			case ASDPackage.SERVICE_DESCRIPTION__PROFILES:
				getProfiles().clear();
				getProfiles().addAll((Collection<? extends Profile>)newValue);
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
			case ASDPackage.SERVICE_DESCRIPTION__OPERATIONS:
				getOperations().clear();
				return;
			case ASDPackage.SERVICE_DESCRIPTION__INFOTYPES:
				getInfotypes().clear();
				return;
			case ASDPackage.SERVICE_DESCRIPTION__PROFILES:
				getProfiles().clear();
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
			case ASDPackage.SERVICE_DESCRIPTION__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case ASDPackage.SERVICE_DESCRIPTION__INFOTYPES:
				return infotypes != null && !infotypes.isEmpty();
			case ASDPackage.SERVICE_DESCRIPTION__PROFILES:
				return profiles != null && !profiles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceDescriptionImpl
