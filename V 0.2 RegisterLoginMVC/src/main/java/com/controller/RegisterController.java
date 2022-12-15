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
import javax.swing.plaf.synth.SynthOptionPaneUI;

import com.model.Register;
import com.services.RegisterImpl;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in reg controller");
		Register reg = new Register();
		reg.setName(request.getParameter("name"));
		reg.setEmail(request.getParameter("email"));
		reg.setUname(request.getParameter("uname"));
		reg.setPassword(request.getParameter("psw"));
		
		List<Register> lst = new ArrayList();
		lst.add(reg);
		
		RegisterImpl regDao = new RegisterImpl();
		int i = regDao.create(lst);
		
		if(i>0) {
			//HttpSession session = request.getSession();
			//session.setAttribute("CurrUser", lst);
			response.sendRedirect("Login.jsp");
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
