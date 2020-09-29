package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InfoServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		PrintWriter out = res.getWriter();
		out.print("Hi ");
		
		//Servlet context, object is shared within all the servlets out there how to fetch value from the web.xml
		ServletContext ctx = getServletContext();
		String str = ctx.getInitParameter("name");
		out.println(str);
		
		//Servlet Config, different value for different servlet
		ServletConfig cg = (ServletConfig) getServletConfig();
		String str1 = cg.getInitParameter("name");
		out.println(str1);
		
	}

}
