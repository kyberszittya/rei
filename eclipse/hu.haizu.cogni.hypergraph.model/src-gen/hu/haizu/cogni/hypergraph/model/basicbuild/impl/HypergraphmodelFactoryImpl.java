/**
 */
package hu.haizu.cogni.hypergraph.model.basicbuild.impl;

import hu.haizu.cogni.hypergraph.model.basicbuild.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HypergraphmodelFactoryImpl extends EFactoryImpl implements HypergraphmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HypergraphmodelFactory init() {
		try {
			HypergraphmodelFactory theHypergraphmodelFactory = (HypergraphmodelFactory) EPackage.Registry.INSTANCE
					.getEFactory(HypergraphmodelPackage.eNS_URI);
			if (theHypergraphmodelFactory != null) {
				return theHypergraphmodelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HypergraphmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HypergraphmodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case HypergraphmodelPackage.HYPER_GRAPH_EDGE:
			return createHyperGraphEdge();
		case HypergraphmodelPackage.DOUBLE_VALUE:
			return createDoubleValue();
		case HypergraphmodelPackage.INTEGER_VALUE:
			return createIntegerValue();
		case HypergraphmodelPackage.STRING_VALUE:
			return createStringValue();
		case HypergraphmodelPackage.HYPER_GRAPH_MULTI_SET:
			return createHyperGraphMultiSet();
		case HypergraphmodelPackage.CONTAINMENT:
			return createContainment();
		case HypergraphmodelPackage.REFERENCE:
			return createReference();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HyperGraphEdge createHyperGraphEdge() {
		HyperGraphEdgeImpl hyperGraphEdge = new HyperGraphEdgeImpl();
		return hyperGraphEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleValue createDoubleValue() {
		DoubleValueImpl doubleValue = new DoubleValueImpl();
		return doubleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValue createIntegerValue() {
		IntegerValueImpl integerValue = new IntegerValueImpl();
		return integerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringValue createStringValue() {
		StringValueImpl stringValue = new StringValueImpl();
		return stringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HyperGraphMultiSet createHyperGraphMultiSet() {
		HyperGraphMultiSetImpl hyperGraphMultiSet = new HyperGraphMultiSetImpl();
		return hyperGraphMultiSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Containment createContainment() {
		ContainmentImpl containment = new ContainmentImpl();
		return containment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HypergraphmodelPackage getHypergraphmodelPackage() {
		return (HypergraphmodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HypergraphmodelPackage getPackage() {
		return HypergraphmodelPackage.eINSTANCE;
	}

} //HypergraphmodelFactoryImpl
