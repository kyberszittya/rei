/**
 */
package hu.haizu.cogni.hypergraph.model.basicbuild.impl;

import hu.haizu.cogni.hypergraph.model.basicbuild.HyperGraphNode;
import hu.haizu.cogni.hypergraph.model.basicbuild.HypergraphmodelPackage;
import hu.haizu.cogni.hypergraph.model.basicbuild.Reference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.haizu.cogni.hypergraph.model.basicbuild.impl.ReferenceImpl#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceImpl extends HyperGraphEdgeOperationImpl implements Reference {
	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
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
	protected ReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HypergraphmodelPackage.Literals.REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HyperGraphNode getElement() {
		if (element != null && element.eIsProxy()) {
			InternalEObject oldElement = (InternalEObject) element;
			element = (HyperGraphNode) eResolveProxy(oldElement);
			if (element != oldElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HypergraphmodelPackage.REFERENCE__ELEMENT,
							oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HyperGraphNode basicGetElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(HyperGraphNode newElement) {
		HyperGraphNode oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HypergraphmodelPackage.REFERENCE__ELEMENT, oldElement,
					element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HypergraphmodelPackage.REFERENCE__ELEMENT:
			if (resolve)
				return getElement();
			return basicGetElement();
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
		case HypergraphmodelPackage.REFERENCE__ELEMENT:
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
		case HypergraphmodelPackage.REFERENCE__ELEMENT:
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
		case HypergraphmodelPackage.REFERENCE__ELEMENT:
			return element != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferenceImpl
