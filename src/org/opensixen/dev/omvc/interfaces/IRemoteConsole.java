package org.opensixen.dev.omvc.interfaces;

import java.util.ArrayList;

public interface IRemoteConsole extends IRienaService {

	public static final String path="/RemoteConsoleWS";
	
	public boolean save(IPO po);
	
	public <T extends IPO> T load(Class<T> clazz, int id);
	
	public <T extends IPO>ArrayList<T> getAll(Class<T> clazz);
	
}
