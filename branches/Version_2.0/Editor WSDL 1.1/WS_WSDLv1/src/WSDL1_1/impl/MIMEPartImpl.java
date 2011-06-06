/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL1_1.impl;

import WSDL1_1.BodySOAP;
import WSDL1_1.MIMEContent;
import WSDL1_1.MIMEPart;
import WSDL1_1.MIMEXml;
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
 * An implementation of the model object '<em><b>MIME Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WSDL1_1.impl.MIMEPartImpl#getContent <em>Content</em>}</li>
 *   <li>{@link WSDL1_1.impl.MIMEPartImpl#getMimeXml <em>Mime Xml</em>}</li>
 *   <li>{@link WSDL1_1.impl.MIMEPartImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MIMEPartImpl extends EObjectImpl implements MIMEPart {
	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected EList<MIMEContent> content;

	/**
	 * The cached value of the '{@link #getMimeXml() <em>Mime Xml</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeXml()
	 * @generated
	 * @ordered
	 */
	protected EList<MIMEXml> mimeXml;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected EList<BodySOAP> body;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MIMEPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WSDL1_1Package.eINSTANCE.getMIMEPart();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MIMEContent> getContent() {
		if (content == null) {
			content = new EObjectContainmentEList<MIMEContent>(MIMEContent.class, this, WSDL1_1Package.MIME_PART__CONTENT);
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MIMEXml> getMimeXml() {
		if (mimeXml == null) {
			mimeXml = new EObjectContainmentEList<MIMEXml>(MIMEXml.class, this, WSDL1_1Package.MIME_PART__MIME_XML);
		}
		return mimeXml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BodySOAP> getBody() {
		if (body == null) {
			body = new EObjectContainmentEList<BodySOAP>(BodySOAP.class, this, WSDL1_1Package.MIME_PART__BODY);
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WSDL1_1Package.MIME_PART__CONTENT:
				return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
			case WSDL1_1Package.MIME_PART__MIME_XML:
				return ((InternalEList<?>)getMimeXml()).basicRemove(otherEnd, msgs);
			case WSDL1_1Package.MIME_PART__BODY:
				return ((InternalEList<?>)getBody()).basicRemove(otherEnd, msgs);
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
			case WSDL1_1Package.MIME_PART__CONTENT:
				return getContent();
			case WSDL1_1Package.MIME_PART__MIME_XML:
				return getMimeXml();
			case WSDL1_1Package.MIME_PART__BODY:
				return getBody();
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
			case WSDL1_1Package.MIME_PART__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends MIMEContent>)newValue);
				return;
			case WSDL1_1Package.MIME_PART__MIME_XML:
				getMimeXml().clear();
				getMimeXml().addAll((Collection<? extends MIMEXml>)newValue);
				return;
			case WSDL1_1Package.MIME_PART__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends BodySOAP>)newValue);
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
			case WSDL1_1Package.MIME_PART__CONTENT:
				getContent().clear();
				return;
			case WSDL1_1Package.MIME_PART__MIME_XML:
				getMimeXml().clear();
				return;
			case WSDL1_1Package.MIME_PART__BODY:
				getBody().clear();
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
			case WSDL1_1Package.MIME_PART__CONTENT:
				return content != null && !content.isEmpty();
			case WSDL1_1Package.MIME_PART__MIME_XML:
				return mimeXml != null && !mimeXml.isEmpty();
			case WSDL1_1Package.MIME_PART__BODY:
				return body != null && !body.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MIMEPartImpl
