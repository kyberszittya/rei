/**
 */
package hu.haizu.cogni.hypergraph.model.basicbuild;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.haizu.cogni.hypergraph.model.basicbuild.HypergraphmodelPackage
 * @generated
 */
public interface HypergraphmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HypergraphmodelFactory eINSTANCE = hu.haizu.cogni.hypergraph.model.basicbuild.impl.HypergraphmodelFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Hyper Graph Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hyper Graph Edge</em>'.
	 * @generated
	 */
	HyperGraphEdge createHyperGraphEdge();

	/**
	 * Returns a new object of class '<em>Double Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Value</em>'.
	 * @generated
	 */
	DoubleValue createDoubleValue();

	/**
	 * Returns a new object of class '<em>Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Value</em>'.
	 * @generated
	 */
	IntegerValue createIntegerValue();

	/**
	 * Returns a new object of class '<em>String Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Value</em>'.
	 * @generated
	 */
	StringValue createStringValue();

	/**
	 * Returns a new object of class '<em>Hyper Graph Multi Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hyper Graph Multi Set</em>'.
	 * @generated
	 */
	HyperGraphMultiSet createHyperGraphMultiSet();

	/**
	 * Returns a new object of class '<em>Containment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Containment</em>'.
	 * @generated
	 */
	Containment createContainment();

	/**
	 * Returns a new object of class '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference</em>'.
	 * @generated
	 */
	Reference createReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HypergraphmodelPackage getHypergraphmodelPackage();

} //HypergraphmodelFactory
