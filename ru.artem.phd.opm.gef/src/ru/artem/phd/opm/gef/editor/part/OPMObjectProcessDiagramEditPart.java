package ru.artem.phd.opm.gef.editor.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import ru.artem.phd.opm.gef.editor.policy.OPMObjectProcessDiagramXYLayoutPolice;
import ru.artem.phd.opm.model.OPMObjectProcessDiagram;
import ru.artem.phd.opm.model.OPMThing;

public class OPMObjectProcessDiagramEditPart extends AbstractGraphicalEditPart {

	private OPMObjectProcessDiagramAdapter adapter;
	
	public OPMObjectProcessDiagramEditPart() {
		super();
		adapter = new OPMObjectProcessDiagramAdapter();
	}

	@Override
	protected IFigure createFigure() {
		FreeformLayer layer = new FreeformLayer();
		layer.setLayoutManager(new FreeformLayout());
		layer.setBorder(new LineBorder(1));
		return layer;
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new OPMObjectProcessDiagramXYLayoutPolice());
	}
	
	@Override
	public void activate() {
		if (!isActive())
			((OPMObjectProcessDiagram)getModel()).eAdapters().add(adapter);
		
		super.activate();
	}

	@Override
	public void deactivate() {
		if (isActive())
			((OPMObjectProcessDiagram)getModel()).eAdapters().remove(adapter);
		
		super.deactivate();
	}
	
	@Override
	protected List<OPMThing> getModelChildren() {
		List<OPMThing> retVal = new ArrayList<>();
		OPMObjectProcessDiagram opd = (OPMObjectProcessDiagram) getModel();
		retVal.addAll(opd.getThings());
		return retVal;
	}
	
	public class OPMObjectProcessDiagramAdapter implements Adapter {

		@Override
		public void notifyChanged(Notification notification) {
			refreshChildren();
		}

		@Override
		public Notifier getTarget() {
			return (OPMObjectProcessDiagram) getModel();
		}

		@Override
		public void setTarget(Notifier newTarget) {
		}

		@Override
		public boolean isAdapterForType(Object type) {
			return type.equals(OPMObjectProcessDiagram.class);
		}
		
	}
}
