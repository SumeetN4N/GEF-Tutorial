/**
 */
package ru.artem.phd.opm.model;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.artem.phd.opm.model.OPMThing#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link ru.artem.phd.opm.model.OPMThing#getOutgoingLinks <em>Outgoing Links</em>}</li>
 *   <li>{@link ru.artem.phd.opm.model.OPMThing#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link ru.artem.phd.opm.model.OPMThing#getName <em>Name</em>}</li>
 *   <li>{@link ru.artem.phd.opm.model.OPMThing#getOpd <em>Opd</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.artem.phd.opm.model.OPMPackage#getOPMThing()
 * @model
 * @generated
 */
public interface OPMThing extends EObject {
	/**
	 * Returns the value of the '<em><b>Incoming Links</b></em>' reference list.
	 * The list contents are of type {@link ru.artem.phd.opm.model.OPMLink}.
	 * It is bidirectional and its opposite is '{@link ru.artem.phd.opm.model.OPMLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Links</em>' reference list.
	 * @see ru.artem.phd.opm.model.OPMPackage#getOPMThing_IncomingLinks()
	 * @see ru.artem.phd.opm.model.OPMLink#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<OPMLink> getIncomingLinks();

	/**
	 * Returns the value of the '<em><b>Outgoing Links</b></em>' reference list.
	 * The list contents are of type {@link ru.artem.phd.opm.model.OPMLink}.
	 * It is bidirectional and its opposite is '{@link ru.artem.phd.opm.model.OPMLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Links</em>' reference list.
	 * @see ru.artem.phd.opm.model.OPMPackage#getOPMThing_OutgoingLinks()
	 * @see ru.artem.phd.opm.model.OPMLink#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<OPMLink> getOutgoingLinks();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' attribute.
	 * @see #setConstraints(Rectangle)
	 * @see ru.artem.phd.opm.model.OPMPackage#getOPMThing_Constraints()
	 * @model default="" dataType="ru.artem.phd.opm.model.Rectangle"
	 * @generated
	 */
	Rectangle getConstraints();

	/**
	 * Sets the value of the '{@link ru.artem.phd.opm.model.OPMThing#getConstraints <em>Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' attribute.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(Rectangle value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ru.artem.phd.opm.model.OPMPackage#getOPMThing_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ru.artem.phd.opm.model.OPMThing#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Opd</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ru.artem.phd.opm.model.OPMObjectProcessDiagram#getThings <em>Things</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opd</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opd</em>' container reference.
	 * @see #setOpd(OPMObjectProcessDiagram)
	 * @see ru.artem.phd.opm.model.OPMPackage#getOPMThing_Opd()
	 * @see ru.artem.phd.opm.model.OPMObjectProcessDiagram#getThings
	 * @model opposite="things" transient="false"
	 * @generated
	 */
	OPMObjectProcessDiagram getOpd();

	/**
	 * Sets the value of the '{@link ru.artem.phd.opm.model.OPMThing#getOpd <em>Opd</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opd</em>' container reference.
	 * @see #getOpd()
	 * @generated
	 */
	void setOpd(OPMObjectProcessDiagram value);

} // OPMThing
