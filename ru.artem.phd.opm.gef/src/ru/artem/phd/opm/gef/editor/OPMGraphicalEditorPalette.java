package ru.artem.phd.opm.gef.editor;

import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.SelectionToolEntry;

import ru.artem.phd.opm.gef.editor.factory.OPMObjectFactory;
import ru.artem.phd.opm.gef.editor.factory.OPMProcessFactory;

public class OPMGraphicalEditorPalette extends PaletteRoot {
	private PaletteGroup group;
	
	public OPMGraphicalEditorPalette()
	{
		addGroup();
		addSelectionTool();
		addOPMObjectTool();
		addOPMProcessTool();
	}
	
	private void addGroup() {
		group = new PaletteGroup("OPM Contorls");
		add(group);
	}
	
	private void addSelectionTool()
	{
		SelectionToolEntry entry = new SelectionToolEntry();
		group.add(entry);
		setDefaultEntry(entry);
	}
	
	private void addOPMObjectTool() {
		CreationToolEntry entry = new CreationToolEntry("OPMObject","Create a new Object", new OPMObjectFactory(), null, null);
		group.add(entry);
	}
	
	private void addOPMProcessTool() {
		CreationToolEntry entry = new CreationToolEntry("OPMProcess","Create a new Process", new OPMProcessFactory(), null, null);
		group.add(entry);
	}
}
