/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package XML.impl;

import XML.Element;
import XML.Node;
import XML.XMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link XML.impl.NodeImpl#getStartLine <em>Start Line</em>}</li>
 *   <li>{@link XML.impl.NodeImpl#getStartColumn <em>Start Column</em>}</li>
 *   <li>{@link XML.impl.NodeImpl#getEndLine <em>End Line</em>}</li>
 *   <li>{@link XML.impl.NodeImpl#getEndColumn <em>End Column</em>}</li>
 *   <li>{@link XML.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link XML.impl.NodeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link XML.impl.NodeImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NodeImpl extends EObjectImpl implements Node {
	/**
	 * The default value of the '{@link #getStartLine() <em>Start Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartLine()
	 * @generated
	 * @ordered
	 */
	protected static final Integer START_LINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartLine() <em>Start Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartLine()
	 * @generated
	 * @ordered
	 */
	protected Integer startLine = START_LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartColumn() <em>Start Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartColumn()
	 * @generated
	 * @ordered
	 */
	protected static final Integer START_COLUMN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartColumn() <em>Start Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartColumn()
	 * @generated
	 * @ordered
	 */
	protected Integer startColumn = START_COLUMN_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndLine() <em>End Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndLine()
	 * @generated
	 * @ordered
	 */
	protected static final Integer END_LINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndLine() <em>End Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndLine()
	 * @generated
	 * @ordered
	 */
	protected Integer endLine = END_LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndColumn() <em>End Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndColumn()
	 * @generated
	 * @ordered
	 */
	protected static final Integer END_COLUMN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndColumn() <em>End Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndColumn()
	 * @generated
	 * @ordered
	 */
	protected Integer endColumn = END_COLUMN_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XMLPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getStartLine() {
		return startLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartLine(Integer newStartLine) {
		Integer oldStartLine = startLine;
		startLine = newStartLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XMLPackage.NODE__START_LINE, oldStartLine, startLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getStartColumn() {
		return startColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartColumn(Integer newStartColumn) {
		Integer oldStartColumn = startColumn;
		startColumn = newStartColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XMLPackage.NODE__START_COLUMN, oldStartColumn, startColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getEndLine() {
		return endLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndLine(Integer newEndLine) {
		Integer oldEndLine = endLine;
		endLine = newEndLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XMLPackage.NODE__END_LINE, oldEndLine, endLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getEndColumn() {
		return endColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndColumn(Integer newEndColumn) {
		Integer oldEndColumn = endColumn;
		endColumn = newEndColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XMLPackage.NODE__END_COLUMN, oldEndColumn, endColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XMLPackage.NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XMLPackage.NODE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getParent() {
		if (eContainerFeatureID() != XMLPackage.NODE__PARENT) return null;
		return (Element)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Element newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, XMLPackage.NODE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Element newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != XMLPackage.NODE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, XMLPackage.ELEMENT__CHILDREN, Element.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XMLPackage.NODE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XMLPackage.NODE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Element)otherEnd, msgs);
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
			case XMLPackage.NODE__PARENT:
				return basicSetParent(null, msgs);
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
			case XMLPackage.NODE__PARENT:
				return eInternalContainer().eInverseRemove(this, XMLPackage.ELEMENT__CHILDREN, Element.class, msgs);
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
			case XMLPackage.NODE__START_LINE:
				return getStartLine();
			case XMLPackage.NODE__START_COLUMN:
				return getStartColumn();
			case XMLPackage.NODE__END_LINE:
				return getEndLine();
			case XMLPackage.NODE__END_COLUMN:
				return getEndColumn();
			case XMLPackage.NODE__NAME:
				return getName();
			case XMLPackage.NODE__VALUE:
				return getValue();
			case XMLPackage.NODE__PARENT:
				return getParent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XMLPackage.NODE__START_LINE:
				setStartLine((Integer)newValue);
				return;
			case XMLPackage.NODE__START_COLUMN:
				setStartColumn((Integer)newValue);
				return;
			case XMLPackage.NODE__END_LINE:
				setEndLine((Integer)newValue);
				return;
			case XMLPackage.NODE__END_COLUMN:
				setEndColumn((Integer)newValue);
				return;
			case XMLPackage.NODE__NAME:
				setName((String)newValue);
				return;
			case XMLPackage.NODE__VALUE:
				setValue((String)newValue);
				return;
			case XMLPackage.NODE__PARENT:
				setParent((Element)newValue);
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
			case XMLPackage.NODE__START_LINE:
				setStartLine(START_LINE_EDEFAULT);
				return;
			case XMLPackage.NODE__START_COLUMN:
				setStartColumn(START_COLUMN_EDEFAULT);
				return;
			case XMLPackage.NODE__END_LINE:
				setEndLine(END_LINE_EDEFAULT);
				return;
			case XMLPackage.NODE__END_COLUMN:
				setEndColumn(END_COLUMN_EDEFAULT);
				return;
			case XMLPackage.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XMLPackage.NODE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case XMLPackage.NODE__PARENT:
				setParent((Element)null);
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
			case XMLPackage.NODE__START_LINE:
				return START_LINE_EDEFAULT == null ? startLine != null : !START_LINE_EDEFAULT.equals(startLine);
			case XMLPackage.NODE__START_COLUMN:
				return START_COLUMN_EDEFAULT == null ? startColumn != null : !START_COLUMN_EDEFAULT.equals(startColumn);
			case XMLPackage.NODE__END_LINE:
				return END_LINE_EDEFAULT == null ? endLine != null : !END_LINE_EDEFAULT.equals(endLine);
			case XMLPackage.NODE__END_COLUMN:
				return END_COLUMN_EDEFAULT == null ? endColumn != null : !END_COLUMN_EDEFAULT.equals(endColumn);
			case XMLPackage.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XMLPackage.NODE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case XMLPackage.NODE__PARENT:
				return getParent() != null;
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
		result.append(" (startLine: ");
		result.append(startLine);
		result.append(", startColumn: ");
		result.append(startColumn);
		result.append(", endLine: ");
		result.append(endLine);
		result.append(", endColumn: ");
		result.append(endColumn);
		result.append(", name: ");
		result.append(name);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
