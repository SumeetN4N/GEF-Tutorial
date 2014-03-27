package ru.artem.phd.opm.gef.editor.part;

import java.util.Random;

import org.eclipse.draw2d.IFigure;

import ru.artem.phd.opm.gef.editor.figure.OPMObjectFigure;

public class OPMObjectEditPart extends OPMThingEditPart {
	Random rand = new Random();

	@Override
	protected IFigure createFigure() {
		return new OPMObjectFigure();
	}

	@Override
	protected void createEditPolicies() {
	}
}
