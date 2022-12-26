package com.user.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.user.model.Product;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      List<Product> plst; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
        System.out.println("constructor called..");
        plst = new LinkedList<Product>();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int prodId = Integer.parseInt(request.getParameter("prodId"));
		String prodName = request.getParameter("prodName");
		float prodPrice = Float.parseFloat(request.getParameter("prodPrice"));
		int prodQty = Integer.parseInt(request.getParameter("prodQty"));
		Product prod = new Product(prodId, prodName, prodPrice, prodQty);
		plst.add(prod);
		
		
		HttpSession session= request.getSession(true);
		session.setAttribute("prodlst", plst);
		PrintWriter pw = response.getWriter();
		response.sendRedirect("confirm.jsp");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
