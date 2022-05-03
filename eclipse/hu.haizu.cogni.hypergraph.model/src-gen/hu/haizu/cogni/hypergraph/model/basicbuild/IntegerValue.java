/**
 */
package hu.haizu.cogni.hypergraph.model.basicbuild;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.haizu.cogni.hypergraph.model.basicbuild.IntegerValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see hu.haizu.cogni.hypergraph.model.basicbuild.HypergraphmodelPackage#getIntegerValue()
 * @model
 * @generated
 */
public interface IntegerValue extends TerminalValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.HypergraphmodelPackage#getIntegerValue_Value()
	 * @model default="0"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link hu.haizu.cogni.hypergraph.model.basicbuild.IntegerValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // IntegerValue
