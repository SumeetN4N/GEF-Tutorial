/**
 */
package ru.artem.phd.opm.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.artem.phd.opm.model.OPMLink#getOpm <em>Opm</em>}</li>
 *   <li>{@link ru.artem.phd.opm.model.OPMLink#getSource <em>Source</em>}</li>
 *   <li>{@link ru.artem.phd.opm.model.OPMLink#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.artem.phd.opm.model.OPMPackage#getOPMLink()
 * @model
 * @generated
 */
public interface OPMLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Opm</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ru.artem.phd.opm.model.ObjectProcessDiagram#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opm</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opm</em>' container reference.
	 * @see #setOpm(ObjectProcessDiagram)
	 * @see ru.artem.phd.opm.model.OPMPackage#getOPMLink_Opm()
	 * @see ru.artem.phd.opm.model.ObjectProcessDiagram#getLinks
	 * @model opposite="links" transient="false"
	 * @generated
	 */
	ObjectProcessDiagram getOpm();

	/**
	 * Sets the value of the '{@link ru.artem.phd.opm.model.OPMLink#getOpm <em>Opm</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opm</em>' container reference.
	 * @see #getOpm()
	 * @generated
	 */
	void setOpm(ObjectProcessDiagram value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ru.artem.phd.opm.model.OPMThing#getIncomingLinks <em>Incoming Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(OPMThing)
	 * @see ru.artem.phd.opm.model.OPMPackage#getOPMLink_Source()
	 * @see ru.artem.phd.opm.model.OPMThing#getIncomingLinks
	 * @model opposite="incomingLinks" transient="false"
	 * @generated
	 */
	OPMThing getSource();

	/**
	 * Sets the value of the '{@link ru.artem.phd.opm.model.OPMLink#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(OPMThing value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ru.artem.phd.opm.model.OPMThing#getOutgoingLinks <em>Outgoing Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' container reference.
	 * @see #setTarget(OPMThing)
	 * @see ru.artem.phd.opm.model.OPMPackage#getOPMLink_Target()
	 * @see ru.artem.phd.opm.model.OPMThing#getOutgoingLinks
	 * @model opposite="outgoingLinks" transient="false"
	 * @generated
	 */
	OPMThing getTarget();

	/**
	 * Sets the value of the '{@link ru.artem.phd.opm.model.OPMLink#getTarget <em>Target</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' container reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(OPMThing value);

} // OPMLink
