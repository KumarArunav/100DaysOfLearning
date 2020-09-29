
package com.demo;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.http.parser.Cookie;

//@WebServlet("/sq")
public class SqServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, 
			HttpServletResponse res) throws IOException {
		
		//for requestDispatcher
		//int k = (int)req.getAttribute("k");
		
		//for sendRedirect
		//int k = Integer.parseInt(req.getParameter("k"));
		
		//Session
		/*HttpSession session = req.getSession()
		int k = (int) session.getAttribute("k");*/
		
		//Cookie
		javax.servlet.http.Cookie[] cookies = req.getCookies();
		int k=0;
		for(javax.servlet.http.Cookie c : cookies) {
			if(c.getName().equals("k"))
				 k= Integer.parseInt(c.getValue());
		}
		
		
		k=k*k;
			
		PrintWriter out = res.getWriter();
		out.println("square is = " + k);
		
		
		}

}
