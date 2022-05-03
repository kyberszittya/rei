/**
 */
package hu.haizu.cogni.hypergraph.model.basicbuild.impl;

import hu.haizu.cogni.hypergraph.model.basicbuild.HyperGraphMultiSet;
import hu.haizu.cogni.hypergraph.model.basicbuild.HypergraphElement;
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
 * An implementation of the model object '<em><b>Hyper Graph Multi Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.haizu.cogni.hypergraph.model.basicbuild.impl.HyperGraphMultiSetImpl#getSubelements <em>Subelements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HyperGraphMultiSetImpl extends HyperGraphNodeImpl implements HyperGraphMultiSet {
	/**
	 * The cached value of the '{@link #getSubelements() <em>Subelements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubelements()
	 * @generated
	 * @ordered
	 */
	protected EList<HypergraphElement> subelements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HyperGraphMultiSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HypergraphmodelPackage.Literals.HYPER_GRAPH_MULTI_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HypergraphElement> getSubelements() {
		if (subelements == null) {
			subelements = new EObjectContainmentEList<HypergraphElement>(HypergraphElement.class, this,
					HypergraphmodelPackage.HYPER_GRAPH_MULTI_SET__SUBELEMENTS);
		}
		return subelements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HypergraphmodelPackage.HYPER_GRAPH_MULTI_SET__SUBELEMENTS:
			return ((InternalEList<?>) getSubelements()).basicRemove(otherEnd, msgs);
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
		case HypergraphmodelPackage.HYPER_GRAPH_MULTI_SET__SUBELEMENTS:
			return getSubelements();
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
		case HypergraphmodelPackage.HYPER_GRAPH_MULTI_SET__SUBELEMENTS:
			getSubelements().clear();
			getSubelements().addAll((Collection<? extends HypergraphElement>) newValue);
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
		case HypergraphmodelPackage.HYPER_GRAPH_MULTI_SET__SUBELEMENTS:
			getSubelements().clear();
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
		case HypergraphmodelPackage.HYPER_GRAPH_MULTI_SET__SUBELEMENTS:
			return subelements != null && !subelements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HyperGraphMultiSetImpl
