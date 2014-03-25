/**
 */
package ru.artem.phd.opm.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import ru.artem.phd.opm.model.OPMLink;
import ru.artem.phd.opm.model.OPMPackage;
import ru.artem.phd.opm.model.OPMThing;
import ru.artem.phd.opm.model.ObjectProcessDiagram;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.artem.phd.opm.model.impl.OPMLinkImpl#getOpm <em>Opm</em>}</li>
 *   <li>{@link ru.artem.phd.opm.model.impl.OPMLinkImpl#getSource <em>Source</em>}</li>
 *   <li>{@link ru.artem.phd.opm.model.impl.OPMLinkImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OPMLinkImpl extends MinimalEObjectImpl.Container implements OPMLink {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OPMLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OPMPackage.Literals.OPM_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectProcessDiagram getOpm() {
		if (eContainerFeatureID() != OPMPackage.OPM_LINK__OPM) return null;
		return (ObjectProcessDiagram)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpm(ObjectProcessDiagram newOpm, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOpm, OPMPackage.OPM_LINK__OPM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpm(ObjectProcessDiagram newOpm) {
		if (newOpm != eInternalContainer() || (eContainerFeatureID() != OPMPackage.OPM_LINK__OPM && newOpm != null)) {
			if (EcoreUtil.isAncestor(this, newOpm))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOpm != null)
				msgs = ((InternalEObject)newOpm).eInverseAdd(this, OPMPackage.OBJECT_PROCESS_DIAGRAM__LINKS, ObjectProcessDiagram.class, msgs);
			msgs = basicSetOpm(newOpm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPMPackage.OPM_LINK__OPM, newOpm, newOpm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMThing getSource() {
		if (eContainerFeatureID() != OPMPackage.OPM_LINK__SOURCE) return null;
		return (OPMThing)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(OPMThing newSource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSource, OPMPackage.OPM_LINK__SOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(OPMThing newSource) {
		if (newSource != eInternalContainer() || (eContainerFeatureID() != OPMPackage.OPM_LINK__SOURCE && newSource != null)) {
			if (EcoreUtil.isAncestor(this, newSource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, OPMPackage.OPM_THING__INCOMING_LINKS, OPMThing.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPMPackage.OPM_LINK__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMThing getTarget() {
		if (eContainerFeatureID() != OPMPackage.OPM_LINK__TARGET) return null;
		return (OPMThing)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(OPMThing newTarget, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTarget, OPMPackage.OPM_LINK__TARGET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(OPMThing newTarget) {
		if (newTarget != eInternalContainer() || (eContainerFeatureID() != OPMPackage.OPM_LINK__TARGET && newTarget != null)) {
			if (EcoreUtil.isAncestor(this, newTarget))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, OPMPackage.OPM_THING__OUTGOING_LINKS, OPMThing.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPMPackage.OPM_LINK__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OPMPackage.OPM_LINK__OPM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOpm((ObjectProcessDiagram)otherEnd, msgs);
			case OPMPackage.OPM_LINK__SOURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSource((OPMThing)otherEnd, msgs);
			case OPMPackage.OPM_LINK__TARGET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTarget((OPMThing)otherEnd, msgs);
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
			case OPMPackage.OPM_LINK__OPM:
				return basicSetOpm(null, msgs);
			case OPMPackage.OPM_LINK__SOURCE:
				return basicSetSource(null, msgs);
			case OPMPackage.OPM_LINK__TARGET:
				return basicSetTarget(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case OPMPackage.OPM_LINK__OPM:
				return eInternalContainer().eInverseRemove(this, OPMPackage.OBJECT_PROCESS_DIAGRAM__LINKS, ObjectProcessDiagram.class, msgs);
			case OPMPackage.OPM_LINK__SOURCE:
				return eInternalContainer().eInverseRemove(this, OPMPackage.OPM_THING__INCOMING_LINKS, OPMThing.class, msgs);
			case OPMPackage.OPM_LINK__TARGET:
				return eInternalContainer().eInverseRemove(this, OPMPackage.OPM_THING__OUTGOING_LINKS, OPMThing.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OPMPackage.OPM_LINK__OPM:
				return getOpm();
			case OPMPackage.OPM_LINK__SOURCE:
				return getSource();
			case OPMPackage.OPM_LINK__TARGET:
				return getTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OPMPackage.OPM_LINK__OPM:
				setOpm((ObjectProcessDiagram)newValue);
				return;
			case OPMPackage.OPM_LINK__SOURCE:
				setSource((OPMThing)newValue);
				return;
			case OPMPackage.OPM_LINK__TARGET:
				setTarget((OPMThing)newValue);
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
			case OPMPackage.OPM_LINK__OPM:
				setOpm((ObjectProcessDiagram)null);
				return;
			case OPMPackage.OPM_LINK__SOURCE:
				setSource((OPMThing)null);
				return;
			case OPMPackage.OPM_LINK__TARGET:
				setTarget((OPMThing)null);
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
			case OPMPackage.OPM_LINK__OPM:
				return getOpm() != null;
			case OPMPackage.OPM_LINK__SOURCE:
				return getSource() != null;
			case OPMPackage.OPM_LINK__TARGET:
				return getTarget() != null;
		}
		return super.eIsSet(featureID);
	}

} //OPMLinkImpl
