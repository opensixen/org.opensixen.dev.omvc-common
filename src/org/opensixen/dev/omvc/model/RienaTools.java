package org.opensixen.dev.omvc.model;

public class RienaTools {

	public static String getURL(String host, String port, String service, String webService)	{
		if (host == null)	{
			return null;
		}
				
		if (host.endsWith("/"))	{
			host = host.substring(0,host.lastIndexOf("/"));
		}
		
		StringBuffer buff = new StringBuffer();
		buff.append("http://");
		buff.append(host);
		
		if (port != null)	{
			buff.append(":").append(port);
		}
		
		if(service != null && service.length() > 0)	{
			buff.append("/").append(service);
		}
				
		buff.append("/hessian/");
		
		if (webService.startsWith("/"))	{
			webService = webService.substring(1);
		}
		buff.append(webService);
		return buff.toString();
	}
	
}
