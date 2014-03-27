/**
 */
package ru.artem.phd.opm.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Process Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.artem.phd.opm.model.OPMObjectProcessDiagram#getLinks <em>Links</em>}</li>
 *   <li>{@link ru.artem.phd.opm.model.OPMObjectProcessDiagram#getThings <em>Things</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.artem.phd.opm.model.OPMPackage#getOPMObjectProcessDiagram()
 * @model
 * @generated
 */
public interface OPMObjectProcessDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link ru.artem.phd.opm.model.OPMLink}.
	 * It is bidirectional and its opposite is '{@link ru.artem.phd.opm.model.OPMLink#getOpd <em>Opd</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see ru.artem.phd.opm.model.OPMPackage#getOPMObjectProcessDiagram_Links()
	 * @see ru.artem.phd.opm.model.OPMLink#getOpd
	 * @model opposite="opd" containment="true"
	 * @generated
	 */
	EList<OPMLink> getLinks();

	/**
	 * Returns the value of the '<em><b>Things</b></em>' containment reference list.
	 * The list contents are of type {@link ru.artem.phd.opm.model.OPMThing}.
	 * It is bidirectional and its opposite is '{@link ru.artem.phd.opm.model.OPMThing#getOpd <em>Opd</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Things</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Things</em>' containment reference list.
	 * @see ru.artem.phd.opm.model.OPMPackage#getOPMObjectProcessDiagram_Things()
	 * @see ru.artem.phd.opm.model.OPMThing#getOpd
	 * @model opposite="opd" containment="true"
	 * @generated
	 */
	EList<OPMThing> getThings();

} // OPMObjectProcessDiagram
