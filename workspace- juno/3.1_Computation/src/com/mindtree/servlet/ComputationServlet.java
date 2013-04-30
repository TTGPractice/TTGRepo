package com.mindtree.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class ComputationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ComputationServlet() {
        super();
        
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int n1,n2;
		String operation;
		
		PrintWriter out=response.getWriter();
		
		n1=Integer.parseInt(request.getParameter("num1"));
		n2=Integer.parseInt(request.getParameter("num2"));
		operation=request.getParameter("operation");
		
		out.println("First Number : " + n1);
		
		out.println("Second Number : " + n2);
		
		out.println("operation : " + operation);
		
		if(operation.equals("addition"))
		{
			int sum=n1+n2;
			out.println("Result : "+sum);	
		}
		else
			if(operation.equals("subtract"))
			{
				int diff= Math.abs(n1-n2);
				out.println("Result : "+diff);
			}
			else
				if(operation.equals("multiply"))
				{
					int mul= n1*n2;
					out.println("Result : "+mul);
				}
				else
					out.println("wrong operation selected");
		
		
		
		
		
		
	}

}
