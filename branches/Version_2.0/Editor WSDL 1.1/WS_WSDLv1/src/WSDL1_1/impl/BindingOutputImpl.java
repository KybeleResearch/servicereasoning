/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL1_1.impl;

import WSDL1_1.BindingOutput;
import WSDL1_1.BodySOAP;
import WSDL1_1.HeaderSOAP;
import WSDL1_1.MIMEContent;
import WSDL1_1.MIMEMultiPartRelated;
import WSDL1_1.MIMEXml;
import WSDL1_1.URLEncoded;
import WSDL1_1.URLReplacement;
import WSDL1_1.WSDL1_1Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WSDL1_1.impl.BindingOutputImpl#getBody <em>Body</em>}</li>
 *   <li>{@link WSDL1_1.impl.BindingOutputImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link WSDL1_1.impl.BindingOutputImpl#getMultipartRelated <em>Multipart Related</em>}</li>
 *   <li>{@link WSDL1_1.impl.BindingOutputImpl#getContent <em>Content</em>}</li>
 *   <li>{@link WSDL1_1.impl.BindingOutputImpl#getMimeXml <em>Mime Xml</em>}</li>
 *   <li>{@link WSDL1_1.impl.BindingOutputImpl#getUrlReplacement <em>Url Replacement</em>}</li>
 *   <li>{@link WSDL1_1.impl.BindingOutputImpl#getUrlEncoded <em>Url Encoded</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingOutputImpl extends ObjectImpl implements BindingOutput {
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
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected EList<HeaderSOAP> header;

	/**
	 * The cached value of the '{@link #getMultipartRelated() <em>Multipart Related</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipartRelated()
	 * @generated
	 * @ordered
	 */
	protected EList<MIMEMultiPartRelated> multipartRelated;

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
	 * The cached value of the '{@link #getUrlReplacement() <em>Url Replacement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlReplacement()
	 * @generated
	 * @ordered
	 */
	protected URLReplacement urlReplacement;

	/**
	 * The cached value of the '{@link #getUrlEncoded() <em>Url Encoded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlEncoded()
	 * @generated
	 * @ordered
	 */
	protected URLEncoded urlEncoded;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WSDL1_1Package.eINSTANCE.getBindingOutput();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BodySOAP> getBody() {
		if (body == null) {
			body = new EObjectContainmentEList<BodySOAP>(BodySOAP.class, this, WSDL1_1Package.BINDING_OUTPUT__BODY);
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HeaderSOAP> getHeader() {
		if (header == null) {
			header = new EObjectContainmentEList<HeaderSOAP>(HeaderSOAP.class, this, WSDL1_1Package.BINDING_OUTPUT__HEADER);
		}
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MIMEMultiPartRelated> getMultipartRelated() {
		if (multipartRelated == null) {
			multipartRelated = new EObjectContainmentEList<MIMEMultiPartRelated>(MIMEMultiPartRelated.class, this, WSDL1_1Package.BINDING_OUTPUT__MULTIPART_RELATED);
		}
		return multipartRelated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MIMEContent> getContent() {
		if (content == null) {
			content = new EObjectContainmentEList<MIMEContent>(MIMEContent.class, this, WSDL1_1Package.BINDING_OUTPUT__CONTENT);
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
			mimeXml = new EObjectContainmentEList<MIMEXml>(MIMEXml.class, this, WSDL1_1Package.BINDING_OUTPUT__MIME_XML);
		}
		return mimeXml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URLReplacement getUrlReplacement() {
		return urlReplacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrlReplacement(URLReplacement newUrlReplacement, NotificationChain msgs) {
		URLReplacement oldUrlReplacement = urlReplacement;
		urlReplacement = newUrlReplacement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL1_1Package.BINDING_OUTPUT__URL_REPLACEMENT, oldUrlReplacement, newUrlReplacement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrlReplacement(URLReplacement newUrlReplacement) {
		if (newUrlReplacement != urlReplacement) {
			NotificationChain msgs = null;
			if (urlReplacement != null)
				msgs = ((InternalEObject)urlReplacement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.BINDING_OUTPUT__URL_REPLACEMENT, null, msgs);
			if (newUrlReplacement != null)
				msgs = ((InternalEObject)newUrlReplacement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.BINDING_OUTPUT__URL_REPLACEMENT, null, msgs);
			msgs = basicSetUrlReplacement(newUrlReplacement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.BINDING_OUTPUT__URL_REPLACEMENT, newUrlReplacement, newUrlReplacement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URLEncoded getUrlEncoded() {
		return urlEncoded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrlEncoded(URLEncoded newUrlEncoded, NotificationChain msgs) {
		URLEncoded oldUrlEncoded = urlEncoded;
		urlEncoded = newUrlEncoded;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL1_1Package.BINDING_OUTPUT__URL_ENCODED, oldUrlEncoded, newUrlEncoded);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrlEncoded(URLEncoded newUrlEncoded) {
		if (newUrlEncoded != urlEncoded) {
			NotificationChain msgs = null;
			if (urlEncoded != null)
				msgs = ((InternalEObject)urlEncoded).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.BINDING_OUTPUT__URL_ENCODED, null, msgs);
			if (newUrlEncoded != null)
				msgs = ((InternalEObject)newUrlEncoded).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL1_1Package.BINDING_OUTPUT__URL_ENCODED, null, msgs);
			msgs = basicSetUrlEncoded(newUrlEncoded, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL1_1Package.BINDING_OUTPUT__URL_ENCODED, newUrlEncoded, newUrlEncoded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WSDL1_1Package.BINDING_OUTPUT__BODY:
				return ((InternalEList<?>)getBody()).basicRemove(otherEnd, msgs);
			case WSDL1_1Package.BINDING_OUTPUT__HEADER:
				return ((InternalEList<?>)getHeader()).basicRemove(otherEnd, msgs);
			case WSDL1_1Package.BINDING_OUTPUT__MULTIPART_RELATED:
				return ((InternalEList<?>)getMultipartRelated()).basicRemove(otherEnd, msgs);
			case WSDL1_1Package.BINDING_OUTPUT__CONTENT:
				return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
			case WSDL1_1Package.BINDING_OUTPUT__MIME_XML:
				return ((InternalEList<?>)getMimeXml()).basicRemove(otherEnd, msgs);
			case WSDL1_1Package.BINDING_OUTPUT__URL_REPLACEMENT:
				return basicSetUrlReplacement(null, msgs);
			case WSDL1_1Package.BINDING_OUTPUT__URL_ENCODED:
				return basicSetUrlEncoded(null, msgs);
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
			case WSDL1_1Package.BINDING_OUTPUT__BODY:
				return getBody();
			case WSDL1_1Package.BINDING_OUTPUT__HEADER:
				return getHeader();
			case WSDL1_1Package.BINDING_OUTPUT__MULTIPART_RELATED:
				return getMultipartRelated();
			case WSDL1_1Package.BINDING_OUTPUT__CONTENT:
				return getContent();
			case WSDL1_1Package.BINDING_OUTPUT__MIME_XML:
				return getMimeXml();
			case WSDL1_1Package.BINDING_OUTPUT__URL_REPLACEMENT:
				return getUrlReplacement();
			case WSDL1_1Package.BINDING_OUTPUT__URL_ENCODED:
				return getUrlEncoded();
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
			case WSDL1_1Package.BINDING_OUTPUT__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends BodySOAP>)newValue);
				return;
			case WSDL1_1Package.BINDING_OUTPUT__HEADER:
				getHeader().clear();
				getHeader().addAll((Collection<? extends HeaderSOAP>)newValue);
				return;
			case WSDL1_1Package.BINDING_OUTPUT__MULTIPART_RELATED:
				getMultipartRelated().clear();
				getMultipartRelated().addAll((Collection<? extends MIMEMultiPartRelated>)newValue);
				return;
			case WSDL1_1Package.BINDING_OUTPUT__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends MIMEContent>)newValue);
				return;
			case WSDL1_1Package.BINDING_OUTPUT__MIME_XML:
				getMimeXml().clear();
				getMimeXml().addAll((Collection<? extends MIMEXml>)newValue);
				return;
			case WSDL1_1Package.BINDING_OUTPUT__URL_REPLACEMENT:
				setUrlReplacement((URLReplacement)newValue);
				return;
			case WSDL1_1Package.BINDING_OUTPUT__URL_ENCODED:
				setUrlEncoded((URLEncoded)newValue);
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
			case WSDL1_1Package.BINDING_OUTPUT__BODY:
				getBody().clear();
				return;
			case WSDL1_1Package.BINDING_OUTPUT__HEADER:
				getHeader().clear();
				return;
			case WSDL1_1Package.BINDING_OUTPUT__MULTIPART_RELATED:
				getMultipartRelated().clear();
				return;
			case WSDL1_1Package.BINDING_OUTPUT__CONTENT:
				getContent().clear();
				return;
			case WSDL1_1Package.BINDING_OUTPUT__MIME_XML:
				getMimeXml().clear();
				return;
			case WSDL1_1Package.BINDING_OUTPUT__URL_REPLACEMENT:
				setUrlReplacement((URLReplacement)null);
				return;
			case WSDL1_1Package.BINDING_OUTPUT__URL_ENCODED:
				setUrlEncoded((URLEncoded)null);
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
			case WSDL1_1Package.BINDING_OUTPUT__BODY:
				return body != null && !body.isEmpty();
			case WSDL1_1Package.BINDING_OUTPUT__HEADER:
				return header != null && !header.isEmpty();
			case WSDL1_1Package.BINDING_OUTPUT__MULTIPART_RELATED:
				return multipartRelated != null && !multipartRelated.isEmpty();
			case WSDL1_1Package.BINDING_OUTPUT__CONTENT:
				return content != null && !content.isEmpty();
			case WSDL1_1Package.BINDING_OUTPUT__MIME_XML:
				return mimeXml != null && !mimeXml.isEmpty();
			case WSDL1_1Package.BINDING_OUTPUT__URL_REPLACEMENT:
				return urlReplacement != null;
			case WSDL1_1Package.BINDING_OUTPUT__URL_ENCODED:
				return urlEncoded != null;
		}
		return super.eIsSet(featureID);
	}

} //BindingOutputImpl
