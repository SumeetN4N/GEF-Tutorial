package ru.artem.phd.opm.gef.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import ru.artem.phd.opm.model.OPMFactory;
import ru.artem.phd.opm.model.OPMObject;

public class OPMObjectFactory implements CreationFactory {

	@Override
	public Object getNewObject() {
		return OPMFactory.eINSTANCE.createOPMObject();
	}

	@Override
	public Object getObjectType() {
		return OPMObject.class;
	}
}
