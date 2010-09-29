package org.opensixen.dev.omvc.interfaces;

import org.opensixen.riena.interfaces.IRienaService;

public interface IRemoteCentralizedIDGenerator extends IRienaService {
	public static final String path="/Centralized_IDWS";
	
	public static final String ID = "org.opensixen.dev.omvc.interfaces.IRemoteCentralizedIDGenerator";
	
	public int getNextID(String tableName);
}
