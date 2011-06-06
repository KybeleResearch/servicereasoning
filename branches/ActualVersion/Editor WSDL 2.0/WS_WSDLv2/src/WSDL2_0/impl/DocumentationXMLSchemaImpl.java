/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WSDL2_0.impl;

import WSDL2_0.Any;
import WSDL2_0.DocumentationXMLSchema;
import WSDL2_0.Text;
import WSDL2_0.WSDL2_0Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Documentation XML Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WSDL2_0.impl.DocumentationXMLSchemaImpl#getSource <em>Source</em>}</li>
 *   <li>{@link WSDL2_0.impl.DocumentationXMLSchemaImpl#getId <em>Id</em>}</li>
 *   <li>{@link WSDL2_0.impl.DocumentationXMLSchemaImpl#getXml_lang <em>Xml lang</em>}</li>
 *   <li>{@link WSDL2_0.impl.DocumentationXMLSchemaImpl#getAny <em>Any</em>}</li>
 *   <li>{@link WSDL2_0.impl.DocumentationXMLSchemaImpl#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentationXMLSchemaImpl extends EObjectImpl implements DocumentationXMLSchema {
	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getXml_lang() <em>Xml lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXml_lang()
	 * @generated
	 * @ordered
	 */
	protected static final String XML_LANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXml_lang() <em>Xml lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXml_lang()
	 * @generated
	 * @ordered
	 */
	protected String xml_lang = XML_LANG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected Any any;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected EList<Text> text;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentationXMLSchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WSDL2_0Package.eINSTANCE.getDocumentationXMLSchema();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.DOCUMENTATION_XML_SCHEMA__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.DOCUMENTATION_XML_SCHEMA__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXml_lang() {
		return xml_lang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXml_lang(String newXml_lang) {
		String oldXml_lang = xml_lang;
		xml_lang = newXml_lang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.DOCUMENTATION_XML_SCHEMA__XML_LANG, oldXml_lang, xml_lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Any getAny() {
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAny(Any newAny, NotificationChain msgs) {
		Any oldAny = any;
		any = newAny;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WSDL2_0Package.DOCUMENTATION_XML_SCHEMA__ANY, oldAny, newAny);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAny(Any newAny) {
		if (newAny != any) {
			NotificationChain msgs = null;
			if (any != null)
				msgs = ((InternalEObject)any).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.DOCUMENTATION_XML_SCHEMA__ANY, null, msgs);
			if (newAny != null)
				msgs = ((InternalEObject)newAny).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WSDL2_0Package.DOCUMENTATION_XML_SCHEMA__ANY, null, msgs);
			msgs = basicSetAny(newAny, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WSDL2_0Package.DOCUMENTATION_XML_SCHEMA__ANY, newAny, newAny));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Text> getText() {
		if (text == null) {
			text = new EObjectContainmentEList<Text>(Text.class, this, WSDL2_0Package.DOCUMENTATION_XML_SCHEMA__TEXT);
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WSDL2_0Package.DOCUMENTATION_XML_SCHEMA__ANY:
				return basicSetAny(null, msgs);
			case WSDL2_0Package.DOCUMENTATION_XML_SCHEMA__TEXT:
				return ((InternalEList<?>)getText()).basicRemove(otherEnd, msgs);
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
			case WSDL2_0Package.DOCUMENTATION_XML_SCHEMA__SOURCE:
				return getSource();
			case WSDL2_0Package.DOCUMENTATION_XML_SCHEMA__ID:
				return getId();
			case WSDL2_0Package.DOCUMENTATION_XML_SCHEMA__XML_LANG:
				return getXml_lang();
			case WSDL2_0Package.DOCUMENTATION_XML_SCHEMA__ANY:
				return getAny();
			case WSDL2_0Package.DOCUMENTATION_XML_SCHEMA__TEXT:
				return getText();
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
			case WSDL2_0Package.DOCUMENTATION_XML_SCHEMA__SOURCE:
				setSource((String)newValue);
				return;
			case WSDL2_0Package.DOCUMENTATION_XML_SCHEMA__ID:
				setId((String)newValue);
				return;
			case WSDL2_0Package.DOCUMENTATION_XML_SCHEMA__XML_LANG:
				setXml_lang((String)newValue);
				return;
			case WSDL2_0Package.DOCUMENTATION_XML_SCHEMA__ANY:
				setAny((Any)newValue);
				return;
			case WSDL2_0Package.DOCUMENTATION_XML_SCHEMA__TEXT:
				getText().clear();
				getText().addAll((Collection<? extends Text>)newValue);
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
			case WSDL2_0Package.DOCUMENTATION_XML_SCHEMA__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case WSDL2_0Package.DOCUMENTATION_XML_SCHEMA__ID:
				setId(ID_EDEFAULT);
				return;
			case WSDL2_0Package.DOCUMENTATION_XML_SCHEMA__XML_LANG:
				setXml_lang(XML_LANG_EDEFAULT);
				return;
			case WSDL2_0Package.DOCUMENTATION_XML_SCHEMA__ANY:
				setAny((Any)null);
				return;
			case WSDL2_0Package.DOCUMENTATION_XML_SCHEMA__TEXT:
				getText().clear();
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
			case WSDL2_0Package.DOCUMENTATION_XML_SCHEMA__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case WSDL2_0Package.DOCUMENTATION_XML_SCHEMA__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case WSDL2_0Package.DOCUMENTATION_XML_SCHEMA__XML_LANG:
				return XML_LANG_EDEFAULT == null ? xml_lang != null : !XML_LANG_EDEFAULT.equals(xml_lang);
			case WSDL2_0Package.DOCUMENTATION_XML_SCHEMA__ANY:
				return any != null;
			case WSDL2_0Package.DOCUMENTATION_XML_SCHEMA__TEXT:
				return text != null && !text.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (source: ");
		result.append(source);
		result.append(", id: ");
		result.append(id);
		result.append(", xml_lang: ");
		result.append(xml_lang);
		result.append(')');
		return result.toString();
	}

} //DocumentationXMLSchemaImpl
