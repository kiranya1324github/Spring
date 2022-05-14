package com.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidServlet
 */
@WebServlet("/ValidServlet")
public class ValidServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
	     response.setContentType("text/html");
		String un=request.getParameter("uname");
		String up=request.getParameter("upass");
		RequestDispatcher rd;
		
		if(un.equalsIgnoreCase("admin") && (up.equals("admin123"))) {
			rd=request.getRequestDispatcher("ValidServlet");
			rd.forward(request, response);
		}
		else {
			out.println("Invalid Username or Password, Try Again");
			rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);
			
			
			
		}
	
	}
			
			
			
			

		}

		
	

	


