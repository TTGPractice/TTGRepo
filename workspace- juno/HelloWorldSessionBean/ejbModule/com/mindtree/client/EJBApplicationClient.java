package com.mindtree.client;

import javax.naming.InitialContext;
import javax.naming.NamingException;


import com.mindtree.business.HelloWorld;
import com.mindtree.businessLogic.HelloWorldBean;

public class EJBApplicationClient {

	public static void main(String[] args) {
		HelloWorld bean = doLookup();
		System.out.println(bean.sayHello());

	}
	
	
	private static HelloWorld doLookup() {
        InitialContext context = null;
        HelloWorld bean = null;
        try {
            // 1. Obtaining Context
   
        	//        context = ClientUtility.getInitialContext();
            
        	context = new InitialContext();
        	// 2. Generate JNDI Lookup name
            String lookupName = getLookupName();
            // 3. Lookup and cast
            bean = (HelloWorld) context.lookup(lookupName);
 
        } catch (NamingException e) {
            e.printStackTrace();
        }
        return bean;
    }
 
    private static String getLookupName() {
/*
The app name is the EAR name of the deployed EJB without .ear suffix.
Since we haven't deployed the application as a .ear,
the app name for us will be an empty string
*/
        String appName = "";
 
        /* The module name is the JAR name of the deployed EJB
        without the .jar suffix.
        */
        String moduleName = "HelloWorldSessionBean";
 
/*AS7 allows each deployment to have an (optional) distinct name.
This can be an empty string if distinct name is not specified.
*/
        String distinctName = "";
 
        // The EJB bean implementation class name
        String beanName = HelloWorldBean.class.getSimpleName();
 
        // Fully qualified remote interface name
        final String interfaceName = HelloWorld.class.getName();
 
        // Create a look up string name
        String name = "ejb" + appName + "/" + moduleName + "/" +
            distinctName    + "/" + beanName + "!" + interfaceName;
 
        return name;
    }

}
