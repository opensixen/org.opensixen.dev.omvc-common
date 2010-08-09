package org.opensixen.dev.omvc.interfaces;

public interface IRemoteCentralizedIDGenerator extends IRienaService {
	public static final String path="/Centralized_IDWS";
	
	public int getNextID(String tableName);
}
