package ru.artem.phd.opm.gef.editor.policy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;

import ru.artem.phd.opm.gef.editor.command.OPMThingCreateCommand;
import ru.artem.phd.opm.model.OPMObjectProcessDiagram;
import ru.artem.phd.opm.model.OPMThing;

public class OPMObjectProcessDiagramXYLayoutPolice extends XYLayoutEditPolicy {

	@Override
	protected Command getCreateCommand(CreateRequest request) {
		Command retValue = null;
		if (request.getNewObject() instanceof OPMThing) {
			OPMThingCreateCommand command = new OPMThingCreateCommand();
			command.setLocation(request.getLocation());
			command.setParent((OPMObjectProcessDiagram) getHost().getModel());
			command.setThing((OPMThing) request.getNewObject());
			retValue = command;
		}
		return retValue;
	}

}
