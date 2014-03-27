package ru.artem.phd.opm.gef.editor.factory;

import org.eclipse.gef.requests.CreationFactory;

import ru.artem.phd.opm.model.OPMFactory;
import ru.artem.phd.opm.model.OPMProcess;

public class OPMProcessFactory implements CreationFactory {

	@Override
	public Object getNewObject() {
		return OPMFactory.eINSTANCE.createOPMProcess();
	}

	@Override
	public Object getObjectType() {
		return OPMProcess.class;
	}
}
