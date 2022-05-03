/**
 */
package hu.haizu.cogni.hypergraph.model.basicbuild.util;

import hu.haizu.cogni.hypergraph.model.basicbuild.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.haizu.cogni.hypergraph.model.basicbuild.HypergraphmodelPackage
 * @generated
 */
public class HypergraphmodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HypergraphmodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HypergraphmodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HypergraphmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HypergraphmodelSwitch<Adapter> modelSwitch = new HypergraphmodelSwitch<Adapter>() {
		@Override
		public Adapter caseHypergraphElement(HypergraphElement object) {
			return createHypergraphElementAdapter();
		}

		@Override
		public Adapter caseHyperGraphNode(HyperGraphNode object) {
			return createHyperGraphNodeAdapter();
		}

		@Override
		public Adapter caseHyperGraphEdge(HyperGraphEdge object) {
			return createHyperGraphEdgeAdapter();
		}

		@Override
		public Adapter caseTerminalValue(TerminalValue object) {
			return createTerminalValueAdapter();
		}

		@Override
		public Adapter caseDoubleValue(DoubleValue object) {
			return createDoubleValueAdapter();
		}

		@Override
		public Adapter caseIntegerValue(IntegerValue object) {
			return createIntegerValueAdapter();
		}

		@Override
		public Adapter caseStringValue(StringValue object) {
			return createStringValueAdapter();
		}

		@Override
		public Adapter caseHyperGraphEdgeOperation(HyperGraphEdgeOperation object) {
			return createHyperGraphEdgeOperationAdapter();
		}

		@Override
		public Adapter caseHyperGraphMultiSet(HyperGraphMultiSet object) {
			return createHyperGraphMultiSetAdapter();
		}

		@Override
		public Adapter caseContainment(Containment object) {
			return createContainmentAdapter();
		}

		@Override
		public Adapter caseReference(Reference object) {
			return createReferenceAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.haizu.cogni.hypergraph.model.basicbuild.HypergraphElement <em>Hypergraph Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.HypergraphElement
	 * @generated
	 */
	public Adapter createHypergraphElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.haizu.cogni.hypergraph.model.basicbuild.HyperGraphNode <em>Hyper Graph Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.HyperGraphNode
	 * @generated
	 */
	public Adapter createHyperGraphNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.haizu.cogni.hypergraph.model.basicbuild.HyperGraphEdge <em>Hyper Graph Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.HyperGraphEdge
	 * @generated
	 */
	public Adapter createHyperGraphEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.haizu.cogni.hypergraph.model.basicbuild.TerminalValue <em>Terminal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.TerminalValue
	 * @generated
	 */
	public Adapter createTerminalValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.haizu.cogni.hypergraph.model.basicbuild.DoubleValue <em>Double Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.DoubleValue
	 * @generated
	 */
	public Adapter createDoubleValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.haizu.cogni.hypergraph.model.basicbuild.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.IntegerValue
	 * @generated
	 */
	public Adapter createIntegerValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.haizu.cogni.hypergraph.model.basicbuild.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.StringValue
	 * @generated
	 */
	public Adapter createStringValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.haizu.cogni.hypergraph.model.basicbuild.HyperGraphEdgeOperation <em>Hyper Graph Edge Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.HyperGraphEdgeOperation
	 * @generated
	 */
	public Adapter createHyperGraphEdgeOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.haizu.cogni.hypergraph.model.basicbuild.HyperGraphMultiSet <em>Hyper Graph Multi Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.HyperGraphMultiSet
	 * @generated
	 */
	public Adapter createHyperGraphMultiSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.haizu.cogni.hypergraph.model.basicbuild.Containment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.Containment
	 * @generated
	 */
	public Adapter createContainmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.haizu.cogni.hypergraph.model.basicbuild.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //HypergraphmodelAdapterFactory
