/**
 * 
 */
package org.opensixen.dev.omvc.jaas;


/**
 * 
 * 
 * @author Eloy Gomez
 * Indeos Consultoria http://www.indeos.es
 *
 */
public class PermissionFactory {
	
	public static OMVCPermission get(String name)	{
		OMVCPermission perm = new OMVCPermission(name);
		return perm;
		
	}

}
