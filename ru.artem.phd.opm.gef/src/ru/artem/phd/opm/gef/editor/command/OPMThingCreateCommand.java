package ru.artem.phd.opm.gef.editor.command;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import ru.artem.phd.opm.model.OPMObjectProcessDiagram;
import ru.artem.phd.opm.model.OPMThing;

public class OPMThingCreateCommand extends Command {

	private static final Dimension DEFAULT_DEMENTION = new Dimension(50, 50);
	private static final String DEFAULT_NAME = "<...>";

	private OPMThing newThing;
	private Rectangle constraints;
	private OPMObjectProcessDiagram opd;

	@Override
	public void execute() {
		newThing.setName(DEFAULT_NAME);
		if (constraints != null)
			newThing.setConstraints(constraints);

		newThing.setOpd(opd);
	}

	@Override
	public void undo() {
		newThing.setOpd(null);
	}

	public void setLocation(Point location) {
		constraints = new Rectangle(location, DEFAULT_DEMENTION);
	}

	public void setParent(OPMObjectProcessDiagram opd) {
		this.opd = opd;
	}

	public void setThing(OPMThing newThing) {
		this.newThing = newThing;
	}
}