/**
 */
package ru.artem.phd.opm.model.impl;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ru.artem.phd.opm.model.*;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class OPMFactoryImpl extends EFactoryImpl implements OPMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static OPMFactory init() {
		try {
			OPMFactory theOPMFactory = (OPMFactory)EPackage.Registry.INSTANCE.getEFactory(OPMPackage.eNS_URI);
			if (theOPMFactory != null) {
				return theOPMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OPMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public OPMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OPMPackage.OBJECT_PROCESS_DIAGRAM: return createObjectProcessDiagram();
			case OPMPackage.OPM_OBJECT: return createOPMObject();
			case OPMPackage.OPM_PROCESS: return createOPMProcess();
			case OPMPackage.OPM_LINK: return createOPMLink();
			case OPMPackage.OPM_THING: return createOPMThing();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OPMPackage.RECTANGLE:
				return createRectangleFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OPMPackage.RECTANGLE:
				return convertRectangleToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectProcessDiagram createObjectProcessDiagram() {
		ObjectProcessDiagramImpl objectProcessDiagram = new ObjectProcessDiagramImpl();
		return objectProcessDiagram;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public OPMObject createOPMObject() {
		OPMObjectImpl opmObject = new OPMObjectImpl();
		return opmObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public OPMProcess createOPMProcess() {
		OPMProcessImpl opmProcess = new OPMProcessImpl();
		return opmProcess;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public OPMLink createOPMLink() {
		OPMLinkImpl opmLink = new OPMLinkImpl();
		return opmLink;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public OPMThing createOPMThing() {
		OPMThingImpl opmThing = new OPMThingImpl();
		return opmThing;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Rectangle createRectangleFromString(EDataType eDataType,
			String initialValue) {
		if (initialValue == null)
			return null;
		initialValue.replaceAll("\\s", "");
		String[] values = initialValue.split(",");
		if (values.length != 4)
			return null;
		Rectangle rect = new Rectangle();
		try {
			rect.setLocation(Integer.parseInt(values[0]),
					Integer.parseInt(values[1]));
			rect.setSize(Integer.parseInt(values[2]),
					Integer.parseInt(values[3]));
		} catch (NumberFormatException ex) {
			EcorePlugin.INSTANCE.log(ex);
			rect = null;
		}

		return rect;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String convertRectangleToString(EDataType eDataType,
			Object instanceValue) {
		if (instanceValue == null)
			return null;
		Rectangle rect = (Rectangle) instanceValue;
		return rect.x + "," + rect.y + "," + rect.width + "," + rect.height;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public OPMPackage getOPMPackage() {
		return (OPMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OPMPackage getPackage() {
		return OPMPackage.eINSTANCE;
	}

} // OPMFactoryImpl
