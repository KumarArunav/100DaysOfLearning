package com.demo;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet("/add")
public class AddServlet extends HttpServlet{
	
   //method name service is compulsory. it takes two objects request and response	
	public  void doGet (HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		
		/*PrintWriter out =res.getWriter();
		out.println("result is " + k);*/
		
		//send data from one servlet to another are using session management and using forward just change the request object
		
		
		//calling a servlet from another  servlet
		//Request dispatcher
		//pass on the req res
		
		/*req.setAttribute("k", k);
		RequestDispatcher rd = req.getRequestDispatcher("/sq");
		rd.forward(req, res);*/
		
		
		//calling a servlet from another using sendRedirect
		// browser is redirected and a new response is sent
		// url redirecting
		
		//res.sendRedirect("sq?k="+k);
		
		//Redirecting using sendredirect and session
		
		/*HttpSession session = req.getSession();
		session.setAttribute("k", k);
		
		res.sendRedirect("sq");*/
		
		
		//Cookies and sendRedirect for redirecting
		Cookie cookie = new Cookie("k", k + "");
		res.addCookie(cookie);
		
		res.sendRedirect("sq");
		
		
		
		
	}
}
