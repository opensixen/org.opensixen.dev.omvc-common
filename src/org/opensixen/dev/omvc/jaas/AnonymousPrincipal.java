/**
 * 
 */
package org.opensixen.dev.omvc.jaas;

import java.io.Serializable;
import java.security.Principal;

/**
 * 
 * 
 * @author Eloy Gomez
 * Indeos Consultoria http://www.indeos.es
 *
 */
public class AnonymousPrincipal implements Principal, Serializable  {

	private static final long serialVersionUID = 1L;

	private String name = "anonymous";
	
	public AnonymousPrincipal(String name) {
		super();
		this.name = name;
	}



	/* (non-Javadoc)
	 * @see java.security.Principal#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

}
