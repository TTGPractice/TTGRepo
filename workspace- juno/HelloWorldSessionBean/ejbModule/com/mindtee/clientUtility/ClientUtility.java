package com.mindtee.clientUtility;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ClientUtility {
	 private static Context initialContext;
	 
	    private static final String PKG_INTERFACES = "com.sun.enterprise.naming.SerialInitContextFactory";
	 
	    public static Context getInitialContext() throws NamingException {
	        if (initialContext == null) {
	            Properties properties = new Properties();
	            properties.put(Context.URL_PKG_PREFIXES, PKG_INTERFACES);
	 
	            initialContext = new InitialContext(properties);
	        }
	        return initialContext;
}
}