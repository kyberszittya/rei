/**
 */
package hu.haizu.cogni.hypergraph.model.basicbuild;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.haizu.cogni.hypergraph.model.basicbuild.HypergraphmodelFactory
 * @model kind="package"
 * @generated
 */
public interface HypergraphmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "basicbuild";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://haizu.hu/hypergraphmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hypergraphmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HypergraphmodelPackage eINSTANCE = hu.haizu.cogni.hypergraph.model.basicbuild.impl.HypergraphmodelPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link hu.haizu.cogni.hypergraph.model.basicbuild.impl.HypergraphElementImpl <em>Hypergraph Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.HypergraphElementImpl
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.HypergraphmodelPackageImpl#getHypergraphElement()
	 * @generated
	 */
	int HYPERGRAPH_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERGRAPH_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Hypergraph Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERGRAPH_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Hypergraph Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERGRAPH_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.haizu.cogni.hypergraph.model.basicbuild.impl.HyperGraphNodeImpl <em>Hyper Graph Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.HyperGraphNodeImpl
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.HypergraphmodelPackageImpl#getHyperGraphNode()
	 * @generated
	 */
	int HYPER_GRAPH_NODE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_GRAPH_NODE__NAME = HYPERGRAPH_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Hyper Graph Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_GRAPH_NODE_FEATURE_COUNT = HYPERGRAPH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hyper Graph Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_GRAPH_NODE_OPERATION_COUNT = HYPERGRAPH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.haizu.cogni.hypergraph.model.basicbuild.impl.HyperGraphEdgeImpl <em>Hyper Graph Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.HyperGraphEdgeImpl
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.HypergraphmodelPackageImpl#getHyperGraphEdge()
	 * @generated
	 */
	int HYPER_GRAPH_EDGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_GRAPH_EDGE__NAME = HYPERGRAPH_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_GRAPH_EDGE__OPERANDS = HYPERGRAPH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hyper Graph Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_GRAPH_EDGE_FEATURE_COUNT = HYPERGRAPH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hyper Graph Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_GRAPH_EDGE_OPERATION_COUNT = HYPERGRAPH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.haizu.cogni.hypergraph.model.basicbuild.impl.TerminalValueImpl <em>Terminal Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.TerminalValueImpl
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.HypergraphmodelPackageImpl#getTerminalValue()
	 * @generated
	 */
	int TERMINAL_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_VALUE__NAME = HYPER_GRAPH_NODE__NAME;

	/**
	 * The number of structural features of the '<em>Terminal Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_VALUE_FEATURE_COUNT = HYPER_GRAPH_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Terminal Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_VALUE_OPERATION_COUNT = HYPER_GRAPH_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.haizu.cogni.hypergraph.model.basicbuild.impl.DoubleValueImpl <em>Double Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.DoubleValueImpl
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.HypergraphmodelPackageImpl#getDoubleValue()
	 * @generated
	 */
	int DOUBLE_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_VALUE__NAME = TERMINAL_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_VALUE__VALUE = TERMINAL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_VALUE_FEATURE_COUNT = TERMINAL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Double Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_VALUE_OPERATION_COUNT = TERMINAL_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.haizu.cogni.hypergraph.model.basicbuild.impl.IntegerValueImpl <em>Integer Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.IntegerValueImpl
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.HypergraphmodelPackageImpl#getIntegerValue()
	 * @generated
	 */
	int INTEGER_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE__NAME = TERMINAL_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE__VALUE = TERMINAL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_FEATURE_COUNT = TERMINAL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_OPERATION_COUNT = TERMINAL_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.haizu.cogni.hypergraph.model.basicbuild.impl.StringValueImpl <em>String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.StringValueImpl
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.HypergraphmodelPackageImpl#getStringValue()
	 * @generated
	 */
	int STRING_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE__NAME = TERMINAL_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE__VALUE = TERMINAL_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_FEATURE_COUNT = TERMINAL_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_OPERATION_COUNT = TERMINAL_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.haizu.cogni.hypergraph.model.basicbuild.impl.HyperGraphEdgeOperationImpl <em>Hyper Graph Edge Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.HyperGraphEdgeOperationImpl
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.HypergraphmodelPackageImpl#getHyperGraphEdgeOperation()
	 * @generated
	 */
	int HYPER_GRAPH_EDGE_OPERATION = 7;

	/**
	 * The number of structural features of the '<em>Hyper Graph Edge Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_GRAPH_EDGE_OPERATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Hyper Graph Edge Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_GRAPH_EDGE_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.haizu.cogni.hypergraph.model.basicbuild.impl.HyperGraphMultiSetImpl <em>Hyper Graph Multi Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.HyperGraphMultiSetImpl
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.HypergraphmodelPackageImpl#getHyperGraphMultiSet()
	 * @generated
	 */
	int HYPER_GRAPH_MULTI_SET = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_GRAPH_MULTI_SET__NAME = HYPER_GRAPH_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Subelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_GRAPH_MULTI_SET__SUBELEMENTS = HYPER_GRAPH_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hyper Graph Multi Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_GRAPH_MULTI_SET_FEATURE_COUNT = HYPER_GRAPH_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hyper Graph Multi Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_GRAPH_MULTI_SET_OPERATION_COUNT = HYPER_GRAPH_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.haizu.cogni.hypergraph.model.basicbuild.impl.ContainmentImpl <em>Containment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.ContainmentImpl
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.HypergraphmodelPackageImpl#getContainment()
	 * @generated
	 */
	int CONTAINMENT = 9;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT__ELEMENT = HYPER_GRAPH_EDGE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Containment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_FEATURE_COUNT = HYPER_GRAPH_EDGE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Containment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_OPERATION_COUNT = HYPER_GRAPH_EDGE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.haizu.cogni.hypergraph.model.basicbuild.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.ReferenceImpl
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.HypergraphmodelPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 10;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__ELEMENT = HYPER_GRAPH_EDGE_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = HYPER_GRAPH_EDGE_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = HYPER_GRAPH_EDGE_OPERATION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link hu.haizu.cogni.hypergraph.model.basicbuild.HypergraphElement <em>Hypergraph Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hypergraph Element</em>'.
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.HypergraphElement
	 * @generated
	 */
	EClass getHypergraphElement();

	/**
	 * Returns the meta object for the attribute '{@link hu.haizu.cogni.hypergraph.model.basicbuild.HypergraphElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.HypergraphElement#getName()
	 * @see #getHypergraphElement()
	 * @generated
	 */
	EAttribute getHypergraphElement_Name();

	/**
	 * Returns the meta object for class '{@link hu.haizu.cogni.hypergraph.model.basicbuild.HyperGraphNode <em>Hyper Graph Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hyper Graph Node</em>'.
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.HyperGraphNode
	 * @generated
	 */
	EClass getHyperGraphNode();

	/**
	 * Returns the meta object for class '{@link hu.haizu.cogni.hypergraph.model.basicbuild.HyperGraphEdge <em>Hyper Graph Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hyper Graph Edge</em>'.
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.HyperGraphEdge
	 * @generated
	 */
	EClass getHyperGraphEdge();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.haizu.cogni.hypergraph.model.basicbuild.HyperGraphEdge#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operands</em>'.
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.HyperGraphEdge#getOperands()
	 * @see #getHyperGraphEdge()
	 * @generated
	 */
	EReference getHyperGraphEdge_Operands();

	/**
	 * Returns the meta object for class '{@link hu.haizu.cogni.hypergraph.model.basicbuild.TerminalValue <em>Terminal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal Value</em>'.
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.TerminalValue
	 * @generated
	 */
	EClass getTerminalValue();

	/**
	 * Returns the meta object for class '{@link hu.haizu.cogni.hypergraph.model.basicbuild.DoubleValue <em>Double Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Value</em>'.
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.DoubleValue
	 * @generated
	 */
	EClass getDoubleValue();

	/**
	 * Returns the meta object for the attribute '{@link hu.haizu.cogni.hypergraph.model.basicbuild.DoubleValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.DoubleValue#getValue()
	 * @see #getDoubleValue()
	 * @generated
	 */
	EAttribute getDoubleValue_Value();

	/**
	 * Returns the meta object for class '{@link hu.haizu.cogni.hypergraph.model.basicbuild.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value</em>'.
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.IntegerValue
	 * @generated
	 */
	EClass getIntegerValue();

	/**
	 * Returns the meta object for the attribute '{@link hu.haizu.cogni.hypergraph.model.basicbuild.IntegerValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.IntegerValue#getValue()
	 * @see #getIntegerValue()
	 * @generated
	 */
	EAttribute getIntegerValue_Value();

	/**
	 * Returns the meta object for class '{@link hu.haizu.cogni.hypergraph.model.basicbuild.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Value</em>'.
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.StringValue
	 * @generated
	 */
	EClass getStringValue();

	/**
	 * Returns the meta object for the attribute '{@link hu.haizu.cogni.hypergraph.model.basicbuild.StringValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.StringValue#getValue()
	 * @see #getStringValue()
	 * @generated
	 */
	EAttribute getStringValue_Value();

	/**
	 * Returns the meta object for class '{@link hu.haizu.cogni.hypergraph.model.basicbuild.HyperGraphEdgeOperation <em>Hyper Graph Edge Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hyper Graph Edge Operation</em>'.
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.HyperGraphEdgeOperation
	 * @generated
	 */
	EClass getHyperGraphEdgeOperation();

	/**
	 * Returns the meta object for class '{@link hu.haizu.cogni.hypergraph.model.basicbuild.HyperGraphMultiSet <em>Hyper Graph Multi Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hyper Graph Multi Set</em>'.
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.HyperGraphMultiSet
	 * @generated
	 */
	EClass getHyperGraphMultiSet();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.haizu.cogni.hypergraph.model.basicbuild.HyperGraphMultiSet#getSubelements <em>Subelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subelements</em>'.
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.HyperGraphMultiSet#getSubelements()
	 * @see #getHyperGraphMultiSet()
	 * @generated
	 */
	EReference getHyperGraphMultiSet_Subelements();

	/**
	 * Returns the meta object for class '{@link hu.haizu.cogni.hypergraph.model.basicbuild.Containment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Containment</em>'.
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.Containment
	 * @generated
	 */
	EClass getContainment();

	/**
	 * Returns the meta object for the containment reference '{@link hu.haizu.cogni.hypergraph.model.basicbuild.Containment#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.Containment#getElement()
	 * @see #getContainment()
	 * @generated
	 */
	EReference getContainment_Element();

	/**
	 * Returns the meta object for class '{@link hu.haizu.cogni.hypergraph.model.basicbuild.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the reference '{@link hu.haizu.cogni.hypergraph.model.basicbuild.Reference#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.Reference#getElement()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Element();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HypergraphmodelFactory getHypergraphmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hu.haizu.cogni.hypergraph.model.basicbuild.impl.HypergraphElementImpl <em>Hypergraph Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.HypergraphElementImpl
		 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.HypergraphmodelPackageImpl#getHypergraphElement()
		 * @generated
		 */
		EClass HYPERGRAPH_ELEMENT = eINSTANCE.getHypergraphElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPERGRAPH_ELEMENT__NAME = eINSTANCE.getHypergraphElement_Name();

		/**
		 * The meta object literal for the '{@link hu.haizu.cogni.hypergraph.model.basicbuild.impl.HyperGraphNodeImpl <em>Hyper Graph Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.HyperGraphNodeImpl
		 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.HypergraphmodelPackageImpl#getHyperGraphNode()
		 * @generated
		 */
		EClass HYPER_GRAPH_NODE = eINSTANCE.getHyperGraphNode();

		/**
		 * The meta object literal for the '{@link hu.haizu.cogni.hypergraph.model.basicbuild.impl.HyperGraphEdgeImpl <em>Hyper Graph Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.HyperGraphEdgeImpl
		 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.HypergraphmodelPackageImpl#getHyperGraphEdge()
		 * @generated
		 */
		EClass HYPER_GRAPH_EDGE = eINSTANCE.getHyperGraphEdge();

		/**
		 * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYPER_GRAPH_EDGE__OPERANDS = eINSTANCE.getHyperGraphEdge_Operands();

		/**
		 * The meta object literal for the '{@link hu.haizu.cogni.hypergraph.model.basicbuild.impl.TerminalValueImpl <em>Terminal Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.TerminalValueImpl
		 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.HypergraphmodelPackageImpl#getTerminalValue()
		 * @generated
		 */
		EClass TERMINAL_VALUE = eINSTANCE.getTerminalValue();

		/**
		 * The meta object literal for the '{@link hu.haizu.cogni.hypergraph.model.basicbuild.impl.DoubleValueImpl <em>Double Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.DoubleValueImpl
		 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.HypergraphmodelPackageImpl#getDoubleValue()
		 * @generated
		 */
		EClass DOUBLE_VALUE = eINSTANCE.getDoubleValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_VALUE__VALUE = eINSTANCE.getDoubleValue_Value();

		/**
		 * The meta object literal for the '{@link hu.haizu.cogni.hypergraph.model.basicbuild.impl.IntegerValueImpl <em>Integer Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.IntegerValueImpl
		 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.HypergraphmodelPackageImpl#getIntegerValue()
		 * @generated
		 */
		EClass INTEGER_VALUE = eINSTANCE.getIntegerValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VALUE__VALUE = eINSTANCE.getIntegerValue_Value();

		/**
		 * The meta object literal for the '{@link hu.haizu.cogni.hypergraph.model.basicbuild.impl.StringValueImpl <em>String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.StringValueImpl
		 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.HypergraphmodelPackageImpl#getStringValue()
		 * @generated
		 */
		EClass STRING_VALUE = eINSTANCE.getStringValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

		/**
		 * The meta object literal for the '{@link hu.haizu.cogni.hypergraph.model.basicbuild.impl.HyperGraphEdgeOperationImpl <em>Hyper Graph Edge Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.HyperGraphEdgeOperationImpl
		 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.HypergraphmodelPackageImpl#getHyperGraphEdgeOperation()
		 * @generated
		 */
		EClass HYPER_GRAPH_EDGE_OPERATION = eINSTANCE.getHyperGraphEdgeOperation();

		/**
		 * The meta object literal for the '{@link hu.haizu.cogni.hypergraph.model.basicbuild.impl.HyperGraphMultiSetImpl <em>Hyper Graph Multi Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.HyperGraphMultiSetImpl
		 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.HypergraphmodelPackageImpl#getHyperGraphMultiSet()
		 * @generated
		 */
		EClass HYPER_GRAPH_MULTI_SET = eINSTANCE.getHyperGraphMultiSet();

		/**
		 * The meta object literal for the '<em><b>Subelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYPER_GRAPH_MULTI_SET__SUBELEMENTS = eINSTANCE.getHyperGraphMultiSet_Subelements();

		/**
		 * The meta object literal for the '{@link hu.haizu.cogni.hypergraph.model.basicbuild.impl.ContainmentImpl <em>Containment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.ContainmentImpl
		 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.HypergraphmodelPackageImpl#getContainment()
		 * @generated
		 */
		EClass CONTAINMENT = eINSTANCE.getContainment();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINMENT__ELEMENT = eINSTANCE.getContainment_Element();

		/**
		 * The meta object literal for the '{@link hu.haizu.cogni.hypergraph.model.basicbuild.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.ReferenceImpl
		 * @see hu.haizu.cogni.hypergraph.model.basicbuild.impl.HypergraphmodelPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__ELEMENT = eINSTANCE.getReference_Element();

	}

} //HypergraphmodelPackage
