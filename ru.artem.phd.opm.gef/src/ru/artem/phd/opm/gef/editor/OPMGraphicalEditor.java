package ru.artem.phd.opm.gef.editor;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IFileEditorMapping;
import org.eclipse.ui.PartInitException;

import ru.artem.phd.opm.gef.editor.part.OPMEditPartFactory;
import ru.artem.phd.opm.model.OPMPackage;
import ru.artem.phd.opm.model.ObjectProcessDiagram;
import ru.artem.phd.opm.model.util.OPMModelUtils;

public class OPMGraphicalEditor extends GraphicalEditorWithFlyoutPalette {

	private Resource opdResource;
	private ObjectProcessDiagram opd;
	
	public OPMGraphicalEditor() {
		setEditDomain(new DefaultEditDomain(this));

	}

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		super.init(site, input);
		
		ResourceSet reourceSet = new ResourceSetImpl();
		if (input instanceof IFileEditorInput)
		{
			IFileEditorInput fileInput = (IFileEditorInput) input;
			IFile file = fileInput.getFile();
			opdResource = reourceSet.createResource(URI.createFileURI(file.getLocationURI().toString()));
			try {
				opdResource.load(null);
				opd = (ObjectProcessDiagram) opdResource.getContents().get(0);
			} catch (IOException e) {
				e.printStackTrace();
				opdResource = null;
			}
			
		}
	}
	
	@Override
	protected void initializeGraphicalViewer() {
		super.initializeGraphicalViewer();
		getGraphicalViewer().setContents(opd);
	}
	
	@Override
	protected void configureGraphicalViewer() {
		super.configureGraphicalViewer();
		getGraphicalViewer().setEditPartFactory(new OPMEditPartFactory());
	}
	
	@Override
	protected PaletteRoot getPaletteRoot() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub

	}

}
