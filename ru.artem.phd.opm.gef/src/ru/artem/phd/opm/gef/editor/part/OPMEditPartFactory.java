package ru.artem.phd.opm.gef.editor.part;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import ru.artem.phd.opm.model.OPMObject;
import ru.artem.phd.opm.model.OPMObjectProcessDiagram;
import ru.artem.phd.opm.model.OPMProcess;

public class OPMEditPartFactory implements EditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		EditPart part = null;

		if (model instanceof OPMObjectProcessDiagram)
			part = new OPMObjectProcessDiagramEditPart();
		else if (model instanceof OPMObject)
			part = new OPMObjectEditPart();
		else if (model instanceof OPMProcess)
			part = new OPMProcessEditorPart();
		
		if (part != null)
			part.setModel(model);

		return part;
	}

}
