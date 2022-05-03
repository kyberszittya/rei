/**
 */
package hu.haizu.cogni.hypergraph.model.basicbuild;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Double Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.haizu.cogni.hypergraph.model.basicbuild.DoubleValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see hu.haizu.cogni.hypergraph.model.basicbuild.HypergraphmodelPackage#getDoubleValue()
 * @model
 * @generated
 */
public interface DoubleValue extends TerminalValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.HypergraphmodelPackage#getDoubleValue_Value()
	 * @model
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link hu.haizu.cogni.hypergraph.model.basicbuild.DoubleValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // DoubleValue
