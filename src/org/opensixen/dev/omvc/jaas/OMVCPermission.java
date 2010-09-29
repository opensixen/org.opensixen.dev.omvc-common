/**
 * 
 */
package org.opensixen.dev.omvc.jaas;

import java.security.BasicPermission;
import java.security.acl.Permission;

/**
 * 
 * 
 * @author Eloy Gomez
 * Indeos Consultoria http://www.indeos.es
 *
 */
public class OMVCPermission extends BasicPermission implements Permission{

	private static final long serialVersionUID = 1L;
	
	public static final String PERM_LOADPO = "loadPO";
	public static final String PERM_LISTPO = "listPO";
	public static final String PERM_SAVEPO = "savePO";
	
	public static final String PERM_LOADREV = "loadRev";
	public static final String PERM_LISTREV = "listRev";
	public static final String PERM_SAVEREV = "saveRev";
	
	public static final String PERM_GETID = "getID";
	
	
	
	
	

	public OMVCPermission(String name, String actions) {
		super(name, actions);
	}

	public OMVCPermission(String name) {
		super(name);
	}

	
	
}
