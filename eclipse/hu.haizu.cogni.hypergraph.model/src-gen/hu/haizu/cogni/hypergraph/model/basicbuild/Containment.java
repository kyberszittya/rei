/**
 */
package hu.haizu.cogni.hypergraph.model.basicbuild;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Containment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.haizu.cogni.hypergraph.model.basicbuild.Containment#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see hu.haizu.cogni.hypergraph.model.basicbuild.HypergraphmodelPackage#getContainment()
 * @model
 * @generated
 */
public interface Containment extends HyperGraphEdgeOperation {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference.
	 * @see #setElement(HyperGraphNode)
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.HypergraphmodelPackage#getContainment_Element()
	 * @model containment="true"
	 * @generated
	 */
	HyperGraphNode getElement();

	/**
	 * Sets the value of the '{@link hu.haizu.cogni.hypergraph.model.basicbuild.Containment#getElement <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' containment reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(HyperGraphNode value);

} // Containment
