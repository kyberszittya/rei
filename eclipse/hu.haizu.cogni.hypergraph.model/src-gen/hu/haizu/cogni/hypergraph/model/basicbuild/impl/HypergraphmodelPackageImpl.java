/**
 */
package hu.haizu.cogni.hypergraph.model.basicbuild.impl;

import hu.haizu.cogni.hypergraph.model.basicbuild.Containment;
import hu.haizu.cogni.hypergraph.model.basicbuild.DoubleValue;
import hu.haizu.cogni.hypergraph.model.basicbuild.HyperGraphEdge;
import hu.haizu.cogni.hypergraph.model.basicbuild.HyperGraphEdgeOperation;
import hu.haizu.cogni.hypergraph.model.basicbuild.HyperGraphMultiSet;
import hu.haizu.cogni.hypergraph.model.basicbuild.HyperGraphNode;
import hu.haizu.cogni.hypergraph.model.basicbuild.HypergraphElement;
import hu.haizu.cogni.hypergraph.model.basicbuild.HypergraphmodelFactory;
import hu.haizu.cogni.hypergraph.model.basicbuild.HypergraphmodelPackage;
import hu.haizu.cogni.hypergraph.model.basicbuild.IntegerValue;
import hu.haizu.cogni.hypergraph.model.basicbuild.Reference;
import hu.haizu.cogni.hypergraph.model.basicbuild.StringValue;
import hu.haizu.cogni.hypergraph.model.basicbuild.TerminalValue;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HypergraphmodelPackageImpl extends EPackageImpl implements HypergraphmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hypergraphElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hyperGraphNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hyperGraphEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminalValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hyperGraphEdgeOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hyperGraphMultiSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see hu.haizu.cogni.hypergraph.model.basicbuild.HypergraphmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HypergraphmodelPackageImpl() {
		super(eNS_URI, HypergraphmodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link HypergraphmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HypergraphmodelPackage init() {
		if (isInited)
			return (HypergraphmodelPackage) EPackage.Registry.INSTANCE.getEPackage(HypergraphmodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredHypergraphmodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		HypergraphmodelPackageImpl theHypergraphmodelPackage = registeredHypergraphmodelPackage instanceof HypergraphmodelPackageImpl
				? (HypergraphmodelPackageImpl) registeredHypergraphmodelPackage
				: new HypergraphmodelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theHypergraphmodelPackage.createPackageContents();

		// Initialize created meta-data
		theHypergraphmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHypergraphmodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HypergraphmodelPackage.eNS_URI, theHypergraphmodelPackage);
		return theHypergraphmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHypergraphElement() {
		return hypergraphElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHypergraphElement_Name() {
		return (EAttribute) hypergraphElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHyperGraphNode() {
		return hyperGraphNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHyperGraphEdge() {
		return hyperGraphEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHyperGraphEdge_Operands() {
		return (EReference) hyperGraphEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminalValue() {
		return terminalValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoubleValue() {
		return doubleValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleValue_Value() {
		return (EAttribute) doubleValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerValue() {
		return integerValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerValue_Value() {
		return (EAttribute) integerValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringValue() {
		return stringValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringValue_Value() {
		return (EAttribute) stringValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHyperGraphEdgeOperation() {
		return hyperGraphEdgeOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHyperGraphMultiSet() {
		return hyperGraphMultiSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHyperGraphMultiSet_Subelements() {
		return (EReference) hyperGraphMultiSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainment() {
		return containmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainment_Element() {
		return (EReference) containmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference_Element() {
		return (EReference) referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HypergraphmodelFactory getHypergraphmodelFactory() {
		return (HypergraphmodelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		hypergraphElementEClass = createEClass(HYPERGRAPH_ELEMENT);
		createEAttribute(hypergraphElementEClass, HYPERGRAPH_ELEMENT__NAME);

		hyperGraphNodeEClass = createEClass(HYPER_GRAPH_NODE);

		hyperGraphEdgeEClass = createEClass(HYPER_GRAPH_EDGE);
		createEReference(hyperGraphEdgeEClass, HYPER_GRAPH_EDGE__OPERANDS);

		terminalValueEClass = createEClass(TERMINAL_VALUE);

		doubleValueEClass = createEClass(DOUBLE_VALUE);
		createEAttribute(doubleValueEClass, DOUBLE_VALUE__VALUE);

		integerValueEClass = createEClass(INTEGER_VALUE);
		createEAttribute(integerValueEClass, INTEGER_VALUE__VALUE);

		stringValueEClass = createEClass(STRING_VALUE);
		createEAttribute(stringValueEClass, STRING_VALUE__VALUE);

		hyperGraphEdgeOperationEClass = createEClass(HYPER_GRAPH_EDGE_OPERATION);

		hyperGraphMultiSetEClass = createEClass(HYPER_GRAPH_MULTI_SET);
		createEReference(hyperGraphMultiSetEClass, HYPER_GRAPH_MULTI_SET__SUBELEMENTS);

		containmentEClass = createEClass(CONTAINMENT);
		createEReference(containmentEClass, CONTAINMENT__ELEMENT);

		referenceEClass = createEClass(REFERENCE);
		createEReference(referenceEClass, REFERENCE__ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hyperGraphNodeEClass.getESuperTypes().add(this.getHypergraphElement());
		hyperGraphEdgeEClass.getESuperTypes().add(this.getHypergraphElement());
		terminalValueEClass.getESuperTypes().add(this.getHyperGraphNode());
		doubleValueEClass.getESuperTypes().add(this.getTerminalValue());
		integerValueEClass.getESuperTypes().add(this.getTerminalValue());
		stringValueEClass.getESuperTypes().add(this.getTerminalValue());
		hyperGraphMultiSetEClass.getESuperTypes().add(this.getHyperGraphNode());
		containmentEClass.getESuperTypes().add(this.getHyperGraphEdgeOperation());
		referenceEClass.getESuperTypes().add(this.getHyperGraphEdgeOperation());

		// Initialize classes, features, and operations; add parameters
		initEClass(hypergraphElementEClass, HypergraphElement.class, "HypergraphElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHypergraphElement_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				HypergraphElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(hyperGraphNodeEClass, HyperGraphNode.class, "HyperGraphNode", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(hyperGraphEdgeEClass, HyperGraphEdge.class, "HyperGraphEdge", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHyperGraphEdge_Operands(), this.getHyperGraphEdgeOperation(), null, "operands", null, 0, -1,
				HyperGraphEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(terminalValueEClass, TerminalValue.class, "TerminalValue", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(doubleValueEClass, DoubleValue.class, "DoubleValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoubleValue_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, DoubleValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerValueEClass, IntegerValue.class, "IntegerValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerValue_Value(), ecorePackage.getEInt(), "value", "0", 0, 1, IntegerValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringValueEClass, StringValue.class, "StringValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hyperGraphEdgeOperationEClass, HyperGraphEdgeOperation.class, "HyperGraphEdgeOperation", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hyperGraphMultiSetEClass, HyperGraphMultiSet.class, "HyperGraphMultiSet", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHyperGraphMultiSet_Subelements(), this.getHypergraphElement(), null, "subelements", null, 0,
				-1, HyperGraphMultiSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containmentEClass, Containment.class, "Containment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainment_Element(), this.getHyperGraphNode(), null, "element", null, 0, 1,
				Containment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReference_Element(), this.getHyperGraphNode(), null, "element", null, 0, 1, Reference.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //HypergraphmodelPackageImpl
