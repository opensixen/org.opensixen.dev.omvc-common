package org.opensixen.dev.omvc.interfaces;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.security.auth.callback.Callback;
import javax.security.auth.login.LoginException;

import org.opensixen.dev.omvc.model.Project;
import org.opensixen.dev.omvc.model.Revision;
import org.opensixen.dev.omvc.model.Script;
import org.opensixen.riena.interfaces.IRienaService;

public interface IRemoteConsole extends IRienaService {

	public static final String path="/RemoteConsoleWS";
	
	public static final String ID = "org.opensixen.dev.omvc.interfaces.IRemoteConsole";
	
	public boolean save(IPO po);
	
	public <T extends IPO> T load(Class<T> clazz, int id);
	
	public <T extends IPO>ArrayList<T> getAll(Class<T> clazz);
	
	public List<Revision> getRevisions();
	
	public List<Project> getProjects();
	
	public List<Script> getScripts(Revision revision);
	
	public int uploadRevison(Revision revision);
	
}
