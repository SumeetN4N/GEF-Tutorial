package ru.artem.phd.opm.gef.editor.part;

import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import ru.artem.phd.opm.gef.editor.figure.OPMThingFigure;
import ru.artem.phd.opm.model.OPMThing;

public abstract class OPMThingEditPart extends AbstractGraphicalEditPart {
	
	@Override
	protected void refreshVisuals() {
		OPMThingFigure figure  = (OPMThingFigure) getFigure();
		OPMThing model = (OPMThing) getModel();
		OPMObjectProcessDiagramEditPart parent = (OPMObjectProcessDiagramEditPart) getParent();
	
		figure.getNameLabel().setText(model.getName());
		parent.setLayoutConstraint(this, figure, model.getConstraints());
	}
}
