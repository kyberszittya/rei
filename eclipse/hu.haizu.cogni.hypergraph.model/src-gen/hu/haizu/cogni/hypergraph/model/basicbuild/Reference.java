/**
 */
package hu.haizu.cogni.hypergraph.model.basicbuild;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.haizu.cogni.hypergraph.model.basicbuild.Reference#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see hu.haizu.cogni.hypergraph.model.basicbuild.HypergraphmodelPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends HyperGraphEdgeOperation {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(HyperGraphNode)
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.HypergraphmodelPackage#getReference_Element()
	 * @model
	 * @generated
	 */
	HyperGraphNode getElement();

	/**
	 * Sets the value of the '{@link hu.haizu.cogni.hypergraph.model.basicbuild.Reference#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(HyperGraphNode value);

} // Reference
