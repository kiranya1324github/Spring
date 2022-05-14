package com.edu;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DbConnect
 */
@WebServlet("/DbConnect")
public class DbConnect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DbConnect() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
		//Connection with database
		static String driver="com.mysql.cj.jdbc.Driver";
		static String url="jdbc:mysql://localhost:3306/mydb";
		static String un="root";
		static String pass="root";
		static Connection con;
		public static Connection getConnection() {
		
		try {
			Class.forName(driver);
			 con=DriverManager.getConnection(url,un,pass);
			if(con==null) {
				System.out.println("Connection is null");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
		
		

		
		
	}
}

	