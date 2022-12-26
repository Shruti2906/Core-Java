package com.shop.user.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.shop.admin.model.Product;
import com.shop.user.services.UserServicesImpl;



/**
 * Servlet implementation class AddProductController
 */
@WebServlet("/AddProductController")
public class AddProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	List<Product> plst;
    public AddProductController() {
        super();
        System.out.println("constructor called..");
        plst = new LinkedList<Product>();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("in addprodcontroller");
		HttpSession session= request.getSession(true);
		
		int id = Integer.parseInt(request.getParameter("add"));
		System.out.println("id: "+id);
		
		UserServicesImpl uImpl = new UserServicesImpl(); 
		List<Product> templst= uImpl.getProductById(id);
		Product p = templst.get(0);
		plst.add(p);
		
		if(plst==null)session.setAttribute("pAddStatus", null);
		else session.setAttribute("pAddStatus", "true");
		
		System.out.println("plst"+plst);
		
		session.setAttribute("cartProdLst", plst);
		for(Product prod:plst) {
			System.out.println(prod.getProductId()+"\t"+prod.getProductName()+"\t"+prod.getProductPrice()+"\t"+prod.getProductQty());
		}
		response.sendRedirect("User_DisplayAllProd.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
