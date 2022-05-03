/**
 */
package hu.haizu.cogni.hypergraph.model.basicbuild;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hypergraph Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.haizu.cogni.hypergraph.model.basicbuild.HypergraphElement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see hu.haizu.cogni.hypergraph.model.basicbuild.HypergraphmodelPackage#getHypergraphElement()
 * @model abstract="true"
 * @generated
 */
public interface HypergraphElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.HypergraphmodelPackage#getHypergraphElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.haizu.cogni.hypergraph.model.basicbuild.HypergraphElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // HypergraphElement
