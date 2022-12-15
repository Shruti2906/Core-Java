package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Login;
import com.model.Register;
import com.services.LoginImpl;

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
		LoginImpl logImpl = new LoginImpl();
		List<Login> lst = new ArrayList();
		lst.add(log);
		boolean logStatus = logImpl.validateLogin(lst);
		lst.add(log);
		if(logStatus) {
			List<Register> lstUser = logImpl.getCurrentUser(lst);
			HttpSession session = request.getSession();
			session.setAttribute("CurrentUser", lstUser);
			response.sendRedirect("UserDashboard.jsp");
		}
		else {
			response.sendRedirect("ErrorPage.html");
			//response.sendRedirect("Login.jsp");
			//same loginpage with error msg
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
