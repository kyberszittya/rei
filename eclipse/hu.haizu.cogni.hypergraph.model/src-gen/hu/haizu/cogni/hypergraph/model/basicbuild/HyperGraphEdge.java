/**
 */
package hu.haizu.cogni.hypergraph.model.basicbuild;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hyper Graph Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.haizu.cogni.hypergraph.model.basicbuild.HyperGraphEdge#getOperands <em>Operands</em>}</li>
 * </ul>
 *
 * @see hu.haizu.cogni.hypergraph.model.basicbuild.HypergraphmodelPackage#getHyperGraphEdge()
 * @model
 * @generated
 */
public interface HyperGraphEdge extends HypergraphElement {
	/**
	 * Returns the value of the '<em><b>Operands</b></em>' containment reference list.
	 * The list contents are of type {@link hu.haizu.cogni.hypergraph.model.basicbuild.HyperGraphEdgeOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operands</em>' containment reference list.
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.HypergraphmodelPackage#getHyperGraphEdge_Operands()
	 * @model containment="true"
	 * @generated
	 */
	EList<HyperGraphEdgeOperation> getOperands();

} // HyperGraphEdge
