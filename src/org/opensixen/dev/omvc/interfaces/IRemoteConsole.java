package org.opensixen.dev.omvc.interfaces;

import java.util.ArrayList;
import java.util.List;

import org.opensixen.dev.omvc.model.Project;
import org.opensixen.dev.omvc.model.Revision;
import org.opensixen.dev.omvc.model.Script;

public interface IRemoteConsole extends IRienaService {

	public static final String path="/RemoteConsoleWS";
	
	public boolean save(IPO po);
	
	public <T extends IPO> T load(Class<T> clazz, int id);
	
	public <T extends IPO>ArrayList<T> getAll(Class<T> clazz);
	
	public List<Revision> getRevisions();
	
	public List<Project> getProjects();
	
	public List<Script> getScripts(Revision revision);
	
	public int uploadRevison(Revision revision);
}
