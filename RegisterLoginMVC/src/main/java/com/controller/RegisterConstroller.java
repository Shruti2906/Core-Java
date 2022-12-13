package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Register;
import com.DAO.*;
/**
 * Servlet implementation class RegisterConstroller
 */
@WebServlet("/RegisterConstroller")
public class RegisterConstroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterConstroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Register reg = new Register();
		reg.setName(request.getParameter("name"));
		reg.setEmail(request.getParameter("email"));
		reg.setUname(request.getParameter("uname"));
		reg.setPassword(request.getParameter("psw"));
		
		RegisterDAO regDAO = new RegisterDAO();
		int i = regDAO.createAccount(reg);
		if(i>0) {
			response.sendRedirect("Home.html");
		}
		else {
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
