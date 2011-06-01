/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ASD.impl;

import ASD.ASDPackage;
import ASD.AssertionSet;
import ASD.Operation;
import ASD.Profile;
import ASD.ServiceDescription;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ASD.impl.ProfileImpl#getRefers <em>Refers</em>}</li>
 *   <li>{@link ASD.impl.ProfileImpl#getSets <em>Sets</em>}</li>
 *   <li>{@link ASD.impl.ProfileImpl#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProfileImpl extends NamedElementImpl implements Profile {
	/**
	 * The cached value of the '{@link #getRefers() <em>Refers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefers()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> refers;

	/**
	 * The cached value of the '{@link #getSets() <em>Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSets()
	 * @generated
	 * @ordered
	 */
	protected EList<AssertionSet> sets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ASDPackage.Literals.PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getRefers() {
		if (refers == null) {
			refers = new EObjectResolvingEList<Operation>(Operation.class, this, ASDPackage.PROFILE__REFERS);
		}
		return refers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssertionSet> getSets() {
		if (sets == null) {
			sets = new EObjectContainmentWithInverseEList<AssertionSet>(AssertionSet.class, this, ASDPackage.PROFILE__SETS, ASDPackage.ASSERTION_SET__PROFILE);
		}
		return sets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDescription getService() {
		if (eContainerFeatureID() != ASDPackage.PROFILE__SERVICE) return null;
		return (ServiceDescription)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetService(ServiceDescription newService, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newService, ASDPackage.PROFILE__SERVICE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(ServiceDescription newService) {
		if (newService != eInternalContainer() || (eContainerFeatureID() != ASDPackage.PROFILE__SERVICE && newService != null)) {
			if (EcoreUtil.isAncestor(this, newService))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newService != null)
				msgs = ((InternalEObject)newService).eInverseAdd(this, ASDPackage.SERVICE_DESCRIPTION__PROFILES, ServiceDescription.class, msgs);
			msgs = basicSetService(newService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ASDPackage.PROFILE__SERVICE, newService, newService));
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
			case ASDPackage.PROFILE__SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSets()).basicAdd(otherEnd, msgs);
			case ASDPackage.PROFILE__SERVICE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetService((ServiceDescription)otherEnd, msgs);
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
			case ASDPackage.PROFILE__SETS:
				return ((InternalEList<?>)getSets()).basicRemove(otherEnd, msgs);
			case ASDPackage.PROFILE__SERVICE:
				return basicSetService(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ASDPackage.PROFILE__SERVICE:
				return eInternalContainer().eInverseRemove(this, ASDPackage.SERVICE_DESCRIPTION__PROFILES, ServiceDescription.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ASDPackage.PROFILE__REFERS:
				return getRefers();
			case ASDPackage.PROFILE__SETS:
				return getSets();
			case ASDPackage.PROFILE__SERVICE:
				return getService();
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
			case ASDPackage.PROFILE__REFERS:
				getRefers().clear();
				getRefers().addAll((Collection<? extends Operation>)newValue);
				return;
			case ASDPackage.PROFILE__SETS:
				getSets().clear();
				getSets().addAll((Collection<? extends AssertionSet>)newValue);
				return;
			case ASDPackage.PROFILE__SERVICE:
				setService((ServiceDescription)newValue);
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
			case ASDPackage.PROFILE__REFERS:
				getRefers().clear();
				return;
			case ASDPackage.PROFILE__SETS:
				getSets().clear();
				return;
			case ASDPackage.PROFILE__SERVICE:
				setService((ServiceDescription)null);
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
			case ASDPackage.PROFILE__REFERS:
				return refers != null && !refers.isEmpty();
			case ASDPackage.PROFILE__SETS:
				return sets != null && !sets.isEmpty();
			case ASDPackage.PROFILE__SERVICE:
				return getService() != null;
		}
		return super.eIsSet(featureID);
	}

} //ProfileImpl
