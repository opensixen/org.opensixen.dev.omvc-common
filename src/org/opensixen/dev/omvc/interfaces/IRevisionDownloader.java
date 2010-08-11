package org.opensixen.dev.omvc.interfaces;

import java.util.List;

import org.opensixen.dev.omvc.model.Revision;
import org.opensixen.dev.omvc.model.Script;

public interface IRevisionDownloader extends IRienaService {

	public static final String path="/RevisionDownloaderWS";
	
	public List<Revision> getRevisions(int project_ID, int from);
	
	public List<Script> getScripts(Revision revision, String[] engines);
	
}
