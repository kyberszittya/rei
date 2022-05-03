/**
 */
package hu.haizu.cogni.hypergraph.model.basicbuild.impl;

import hu.haizu.cogni.hypergraph.model.basicbuild.Containment;
import hu.haizu.cogni.hypergraph.model.basicbuild.HyperGraphNode;
import hu.haizu.cogni.hypergraph.model.basicbuild.HypergraphmodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Containment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.haizu.cogni.hypergraph.model.basicbuild.impl.ContainmentImpl#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainmentImpl extends HyperGraphEdgeOperationImpl implements Containment {
	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected HyperGraphNode element;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HypergraphmodelPackage.Literals.CONTAINMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HyperGraphNode getElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement(HyperGraphNode newElement, NotificationChain msgs) {
		HyperGraphNode oldElement = element;
		element = newElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					HypergraphmodelPackage.CONTAINMENT__ELEMENT, oldElement, newElement);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(HyperGraphNode newElement) {
		if (newElement != element) {
			NotificationChain msgs = null;
			if (element != null)
				msgs = ((InternalEObject) element).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - HypergraphmodelPackage.CONTAINMENT__ELEMENT, null, msgs);
			if (newElement != null)
				msgs = ((InternalEObject) newElement).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - HypergraphmodelPackage.CONTAINMENT__ELEMENT, null, msgs);
			msgs = basicSetElement(newElement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HypergraphmodelPackage.CONTAINMENT__ELEMENT,
					newElement, newElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HypergraphmodelPackage.CONTAINMENT__ELEMENT:
			return basicSetElement(null, msgs);
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
		case HypergraphmodelPackage.CONTAINMENT__ELEMENT:
			return getElement();
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
		case HypergraphmodelPackage.CONTAINMENT__ELEMENT:
			setElement((HyperGraphNode) newValue);
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
		case HypergraphmodelPackage.CONTAINMENT__ELEMENT:
			setElement((HyperGraphNode) null);
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
		case HypergraphmodelPackage.CONTAINMENT__ELEMENT:
			return element != null;
		}
		return super.eIsSet(featureID);
	}

} //ContainmentImpl
