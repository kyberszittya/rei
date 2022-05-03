/**
 */
package hu.haizu.cogni.hypergraph.model.basicbuild;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hyper Graph Multi Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.haizu.cogni.hypergraph.model.basicbuild.HyperGraphMultiSet#getSubelements <em>Subelements</em>}</li>
 * </ul>
 *
 * @see hu.haizu.cogni.hypergraph.model.basicbuild.HypergraphmodelPackage#getHyperGraphMultiSet()
 * @model
 * @generated
 */
public interface HyperGraphMultiSet extends HyperGraphNode {
	/**
	 * Returns the value of the '<em><b>Subelements</b></em>' containment reference list.
	 * The list contents are of type {@link hu.haizu.cogni.hypergraph.model.basicbuild.HypergraphElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subelements</em>' containment reference list.
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.HypergraphmodelPackage#getHyperGraphMultiSet_Subelements()
	 * @model containment="true"
	 * @generated
	 */
	EList<HypergraphElement> getSubelements();

} // HyperGraphMultiSet
