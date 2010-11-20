package org.opensixen.dev.omvc.model;

public class RienaTools {

	public static String getURL(String host, String port, String webService)	{
		if (host == null)	{
			return null;
		}
		
		
		
		if (host.endsWith("/"))	{
			host = host.substring(0,host.lastIndexOf("/"));
		}
		
		StringBuffer buff = new StringBuffer();
		buff.append("http://");
		buff.append(host).append(":").append(port);
		buff.append("/hessian/");
		
		if (webService.startsWith("/"))	{
			webService = webService.substring(1);
		}
		buff.append(webService);
		return buff.toString();
	}
	
}
