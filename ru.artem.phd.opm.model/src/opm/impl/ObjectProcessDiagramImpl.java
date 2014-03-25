/**
 */
package opm.impl;

import java.util.Collection;

import opm.OPMLink;
import opm.OPMObject;
import opm.OPMPackage;
import opm.OPMProcess;
import opm.ObjectProcessDiagram;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Process Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link opm.impl.ObjectProcessDiagramImpl#getObjects <em>Objects</em>}</li>
 *   <li>{@link opm.impl.ObjectProcessDiagramImpl#getProcesses <em>Processes</em>}</li>
 *   <li>{@link opm.impl.ObjectProcessDiagramImpl#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectProcessDiagramImpl extends MinimalEObjectImpl.Container implements ObjectProcessDiagram {
	/**
	 * The cached value of the '{@link #getObjects() <em>Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<OPMObject> objects;

	/**
	 * The cached value of the '{@link #getProcesses() <em>Processes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcesses()
	 * @generated
	 * @ordered
	 */
	protected EList<OPMProcess> processes;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<OPMLink> links;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectProcessDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OPMPackage.Literals.OBJECT_PROCESS_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OPMObject> getObjects() {
		if (objects == null) {
			objects = new EObjectContainmentWithInverseEList<OPMObject>(OPMObject.class, this, OPMPackage.OBJECT_PROCESS_DIAGRAM__OBJECTS, OPMPackage.OPM_OBJECT__OPD);
		}
		return objects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OPMProcess> getProcesses() {
		if (processes == null) {
			processes = new EObjectContainmentWithInverseEList<OPMProcess>(OPMProcess.class, this, OPMPackage.OBJECT_PROCESS_DIAGRAM__PROCESSES, OPMPackage.OPM_PROCESS__OPD);
		}
		return processes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OPMLink> getLinks() {
		if (links == null) {
			links = new EObjectContainmentWithInverseEList<OPMLink>(OPMLink.class, this, OPMPackage.OBJECT_PROCESS_DIAGRAM__LINKS, OPMPackage.OPM_LINK__OPM);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OPMPackage.OBJECT_PROCESS_DIAGRAM__OBJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getObjects()).basicAdd(otherEnd, msgs);
			case OPMPackage.OBJECT_PROCESS_DIAGRAM__PROCESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcesses()).basicAdd(otherEnd, msgs);
			case OPMPackage.OBJECT_PROCESS_DIAGRAM__LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLinks()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OPMPackage.OBJECT_PROCESS_DIAGRAM__OBJECTS:
				return ((InternalEList<?>)getObjects()).basicRemove(otherEnd, msgs);
			case OPMPackage.OBJECT_PROCESS_DIAGRAM__PROCESSES:
				return ((InternalEList<?>)getProcesses()).basicRemove(otherEnd, msgs);
			case OPMPackage.OBJECT_PROCESS_DIAGRAM__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OPMPackage.OBJECT_PROCESS_DIAGRAM__OBJECTS:
				return getObjects();
			case OPMPackage.OBJECT_PROCESS_DIAGRAM__PROCESSES:
				return getProcesses();
			case OPMPackage.OBJECT_PROCESS_DIAGRAM__LINKS:
				return getLinks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OPMPackage.OBJECT_PROCESS_DIAGRAM__OBJECTS:
				getObjects().clear();
				getObjects().addAll((Collection<? extends OPMObject>)newValue);
				return;
			case OPMPackage.OBJECT_PROCESS_DIAGRAM__PROCESSES:
				getProcesses().clear();
				getProcesses().addAll((Collection<? extends OPMProcess>)newValue);
				return;
			case OPMPackage.OBJECT_PROCESS_DIAGRAM__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends OPMLink>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OPMPackage.OBJECT_PROCESS_DIAGRAM__OBJECTS:
				getObjects().clear();
				return;
			case OPMPackage.OBJECT_PROCESS_DIAGRAM__PROCESSES:
				getProcesses().clear();
				return;
			case OPMPackage.OBJECT_PROCESS_DIAGRAM__LINKS:
				getLinks().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OPMPackage.OBJECT_PROCESS_DIAGRAM__OBJECTS:
				return objects != null && !objects.isEmpty();
			case OPMPackage.OBJECT_PROCESS_DIAGRAM__PROCESSES:
				return processes != null && !processes.isEmpty();
			case OPMPackage.OBJECT_PROCESS_DIAGRAM__LINKS:
				return links != null && !links.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObjectProcessDiagramImpl
