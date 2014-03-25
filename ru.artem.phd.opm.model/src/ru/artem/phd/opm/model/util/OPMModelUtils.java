package ru.artem.phd.opm.model.util;

import ru.artem.phd.opm.model.OPMFactory;
import ru.artem.phd.opm.model.OPMLink;
import ru.artem.phd.opm.model.OPMObject;
import ru.artem.phd.opm.model.OPMProcess;
import ru.artem.phd.opm.model.ObjectProcessDiagram;

public enum OPMModelUtils {
	INSTANCE;

	private OPMFactory factory = OPMFactory.eINSTANCE;

	public ObjectProcessDiagram createModel() {
		ObjectProcessDiagram opd = factory.createObjectProcessDiagram();
		OPMObject object1 = factory.createOPMObject();
		object1.setName("01");
		opd.getObjects().add(object1);

		OPMObject object2 = factory.createOPMObject();
		object2.setName("02");
		opd.getObjects().add(object2);

		OPMProcess process = factory.createOPMProcess();
		process.setName("P1");
		opd.getProcesses().add(process);

		OPMLink link = factory.createOPMLink();
		link.setSource(object1);
		link.setTarget(process);
		opd.getLinks().add(link);

		return opd;
	}
}
