package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.RegisterDAO;
import com.model.Login;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Login log = new Login();
		log.setUname(request.getParameter("username"));
		log.setPassword(request.getParameter("password"));
		RegisterDAO regDAO = new RegisterDAO();
		boolean logStatus = regDAO.validateAccount(log);
		if(logStatus) {
			System.out.println("Logged IN");
			response.sendRedirect("http://www.linkcode.in/");
			PrintWriter pw = response.getWriter();
			//pw.print("<h1>Logged IN Successfully..");
			
		}
		else{
			response.sendRedirect("ErrorPage.html");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
