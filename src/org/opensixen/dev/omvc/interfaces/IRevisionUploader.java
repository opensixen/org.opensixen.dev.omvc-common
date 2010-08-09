package org.opensixen.dev.omvc.interfaces;

import java.util.List;

import org.opensixen.dev.omvc.model.Project;
import org.opensixen.dev.omvc.model.Revision;


public interface IRevisionUploader  extends IRienaService {
	
	public static final String path="/RevisionUploaderWS";
	
	public boolean uploadRevison(Revision revision);
	
	public List<Project> getProjects();
	
}
