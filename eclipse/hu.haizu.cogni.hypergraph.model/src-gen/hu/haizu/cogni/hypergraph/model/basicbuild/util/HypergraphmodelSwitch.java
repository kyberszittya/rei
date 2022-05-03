/**
 */
package hu.haizu.cogni.hypergraph.model.basicbuild.util;

import hu.haizu.cogni.hypergraph.model.basicbuild.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see hu.haizu.cogni.hypergraph.model.basicbuild.HypergraphmodelPackage
 * @generated
 */
public class HypergraphmodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HypergraphmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HypergraphmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = HypergraphmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case HypergraphmodelPackage.HYPERGRAPH_ELEMENT: {
			HypergraphElement hypergraphElement = (HypergraphElement) theEObject;
			T result = caseHypergraphElement(hypergraphElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HypergraphmodelPackage.HYPER_GRAPH_NODE: {
			HyperGraphNode hyperGraphNode = (HyperGraphNode) theEObject;
			T result = caseHyperGraphNode(hyperGraphNode);
			if (result == null)
				result = caseHypergraphElement(hyperGraphNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HypergraphmodelPackage.HYPER_GRAPH_EDGE: {
			HyperGraphEdge hyperGraphEdge = (HyperGraphEdge) theEObject;
			T result = caseHyperGraphEdge(hyperGraphEdge);
			if (result == null)
				result = caseHypergraphElement(hyperGraphEdge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HypergraphmodelPackage.TERMINAL_VALUE: {
			TerminalValue terminalValue = (TerminalValue) theEObject;
			T result = caseTerminalValue(terminalValue);
			if (result == null)
				result = caseHyperGraphNode(terminalValue);
			if (result == null)
				result = caseHypergraphElement(terminalValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HypergraphmodelPackage.DOUBLE_VALUE: {
			DoubleValue doubleValue = (DoubleValue) theEObject;
			T result = caseDoubleValue(doubleValue);
			if (result == null)
				result = caseTerminalValue(doubleValue);
			if (result == null)
				result = caseHyperGraphNode(doubleValue);
			if (result == null)
				result = caseHypergraphElement(doubleValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HypergraphmodelPackage.INTEGER_VALUE: {
			IntegerValue integerValue = (IntegerValue) theEObject;
			T result = caseIntegerValue(integerValue);
			if (result == null)
				result = caseTerminalValue(integerValue);
			if (result == null)
				result = caseHyperGraphNode(integerValue);
			if (result == null)
				result = caseHypergraphElement(integerValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HypergraphmodelPackage.STRING_VALUE: {
			StringValue stringValue = (StringValue) theEObject;
			T result = caseStringValue(stringValue);
			if (result == null)
				result = caseTerminalValue(stringValue);
			if (result == null)
				result = caseHyperGraphNode(stringValue);
			if (result == null)
				result = caseHypergraphElement(stringValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HypergraphmodelPackage.HYPER_GRAPH_EDGE_OPERATION: {
			HyperGraphEdgeOperation hyperGraphEdgeOperation = (HyperGraphEdgeOperation) theEObject;
			T result = caseHyperGraphEdgeOperation(hyperGraphEdgeOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HypergraphmodelPackage.HYPER_GRAPH_MULTI_SET: {
			HyperGraphMultiSet hyperGraphMultiSet = (HyperGraphMultiSet) theEObject;
			T result = caseHyperGraphMultiSet(hyperGraphMultiSet);
			if (result == null)
				result = caseHyperGraphNode(hyperGraphMultiSet);
			if (result == null)
				result = caseHypergraphElement(hyperGraphMultiSet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HypergraphmodelPackage.CONTAINMENT: {
			Containment containment = (Containment) theEObject;
			T result = caseContainment(containment);
			if (result == null)
				result = caseHyperGraphEdgeOperation(containment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case HypergraphmodelPackage.REFERENCE: {
			Reference reference = (Reference) theEObject;
			T result = caseReference(reference);
			if (result == null)
				result = caseHyperGraphEdgeOperation(reference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hypergraph Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hypergraph Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHypergraphElement(HypergraphElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hyper Graph Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hyper Graph Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHyperGraphNode(HyperGraphNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hyper Graph Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hyper Graph Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHyperGraphEdge(HyperGraphEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminal Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminal Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminalValue(TerminalValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleValue(DoubleValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerValue(IntegerValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringValue(StringValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hyper Graph Edge Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hyper Graph Edge Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHyperGraphEdgeOperation(HyperGraphEdgeOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hyper Graph Multi Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hyper Graph Multi Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHyperGraphMultiSet(HyperGraphMultiSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Containment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Containment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainment(Containment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //HypergraphmodelSwitch
