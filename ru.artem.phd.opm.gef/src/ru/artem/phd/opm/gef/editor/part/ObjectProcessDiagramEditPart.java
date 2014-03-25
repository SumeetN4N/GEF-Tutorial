package ru.artem.phd.opm.gef.editor.part;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import ru.artem.phd.opm.model.OPMObject;
import ru.artem.phd.opm.model.ObjectProcessDiagram;

public class ObjectProcessDiagramEditPart extends AbstractGraphicalEditPart {

	@Override
	protected IFigure createFigure() {
		FreeformLayer layer = new FreeformLayer();
		layer.setLayoutManager(new FreeformLayout());
		layer.setBorder(new LineBorder(1));
		return layer;
	}

	@Override
	protected void createEditPolicies() {
	}

	@Override
	protected List<OPMObject> getModelChildren() {
		List<OPMObject> retVal = new ArrayList<>();
		ObjectProcessDiagram opd = (ObjectProcessDiagram) getModel();
		retVal.addAll(opd.getObjects());
		return retVal;
	}
}
