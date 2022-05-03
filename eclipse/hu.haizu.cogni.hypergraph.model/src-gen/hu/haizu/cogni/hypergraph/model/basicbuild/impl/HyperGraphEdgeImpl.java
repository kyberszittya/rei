/**
 */
package hu.haizu.cogni.hypergraph.model.basicbuild.impl;

import hu.haizu.cogni.hypergraph.model.basicbuild.HyperGraphEdge;
import hu.haizu.cogni.hypergraph.model.basicbuild.HyperGraphEdgeOperation;
import hu.haizu.cogni.hypergraph.model.basicbuild.HypergraphmodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hyper Graph Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.haizu.cogni.hypergraph.model.basicbuild.impl.HyperGraphEdgeImpl#getOperands <em>Operands</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HyperGraphEdgeImpl extends HypergraphElementImpl implements HyperGraphEdge {
	/**
	 * The cached value of the '{@link #getOperands() <em>Operands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperands()
	 * @generated
	 * @ordered
	 */
	protected EList<HyperGraphEdgeOperation> operands;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HyperGraphEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HypergraphmodelPackage.Literals.HYPER_GRAPH_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HyperGraphEdgeOperation> getOperands() {
		if (operands == null) {
			operands = new EObjectContainmentEList<HyperGraphEdgeOperation>(HyperGraphEdgeOperation.class, this,
					HypergraphmodelPackage.HYPER_GRAPH_EDGE__OPERANDS);
		}
		return operands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HypergraphmodelPackage.HYPER_GRAPH_EDGE__OPERANDS:
			return ((InternalEList<?>) getOperands()).basicRemove(otherEnd, msgs);
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
		case HypergraphmodelPackage.HYPER_GRAPH_EDGE__OPERANDS:
			return getOperands();
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
		case HypergraphmodelPackage.HYPER_GRAPH_EDGE__OPERANDS:
			getOperands().clear();
			getOperands().addAll((Collection<? extends HyperGraphEdgeOperation>) newValue);
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
		case HypergraphmodelPackage.HYPER_GRAPH_EDGE__OPERANDS:
			getOperands().clear();
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
		case HypergraphmodelPackage.HYPER_GRAPH_EDGE__OPERANDS:
			return operands != null && !operands.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HyperGraphEdgeImpl
