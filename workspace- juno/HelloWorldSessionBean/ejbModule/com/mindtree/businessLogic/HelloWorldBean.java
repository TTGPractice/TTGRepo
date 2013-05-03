package com.mindtree.businessLogic;

import com.mindtree.business.HelloWorld;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class HelloWorldBean
 */
@Stateless
public class HelloWorldBean implements HelloWorld {

    /**
     * Default constructor. 
     */
    public HelloWorldBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String sayHello() {
		return "Hello World !!!";
	}

}
