package ru.artem.phd.opm.gef.editor;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
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
import org.eclipse.ui.PartInitException;

import ru.artem.phd.opm.gef.editor.part.OPMEditPartFactory;
import ru.artem.phd.opm.model.OPMFactory;
import ru.artem.phd.opm.model.OPMObjectProcessDiagram;
import ru.artem.phd.opm.model.OPMPackage;

public class OPMGraphicalEditor extends GraphicalEditorWithFlyoutPalette {

	private Resource opdResource;
	private OPMObjectProcessDiagram opd;
	
	public OPMGraphicalEditor() {
		setEditDomain(new DefaultEditDomain(this));

	}

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		super.init(site, input);
		
		OPMPackage.eINSTANCE.eClass();
		
		ResourceSet reourceSet = new ResourceSetImpl();
		if (input instanceof IFileEditorInput)
		{
			IFileEditorInput fileInput = (IFileEditorInput) input;
			
			
			URI uri = null;
			try {
				uri = URI.createPlatformResourceURI(fileInput.getStorage().getFullPath().toString(), true);
			} catch (CoreException e1) {
				e1.printStackTrace();
			}
			
			opdResource = reourceSet.getResource(uri, false);
			if(opdResource == null) {
				opdResource = reourceSet.createResource(uri);
				
			}
			
			try {
				opdResource.load(null);

			} catch (IOException e) {
				try {
					opd = OPMFactory.eINSTANCE.createOPMObjectProcessDiagram();
					opdResource.getContents().add(opd);
					opdResource.save(null);
				} catch (IOException ez) {
					// TODO Auto-generated catch block
					ez.printStackTrace();
				}
			}
			
			opd = (OPMObjectProcessDiagram) opdResource.getContents().get(0);
			
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
		return new OPMGraphicalEditorPalette();
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		if (opdResource == null)
			return;
		try {
			opdResource.save(null);
		} catch(IOException e) {
			e.printStackTrace();
			opdResource = null;
		}

	}

}
