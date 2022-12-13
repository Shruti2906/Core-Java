package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Model.Calculation;

/**
 * Servlet implementation class CalculationController
 */
@WebServlet("/CalculationController")
public class CalculationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Calculation calc = new Calculation();
		PrintWriter pw = response.getWriter();
		
		String str1 = request.getParameter("no1");
		String str2 = request.getParameter("no2");
		
		int n1 = Integer.parseInt(str1);
		int n2 = Integer.parseInt(str2);
		
		calc.setNo1(n1);
		calc.setNo2(n2);
		
		HttpSession session = request.getSession();
		
		String s = request.getParameter("btn");
		if(s.equals("Add")) {
			System.out.println("in add");
			int sum = n1+n2;
			calc.setSum((calc.getNo1()+calc.getNo2()));
		}
		else if(s.equals("Sub")) {
			System.out.println("in sub");
			int sub = n1-n2;
			calc.setSub(sub);
		}
		else if(s.equals("Mul")) {
			System.out.println("in mul");
			int mul = n1*n2;
			calc.setMul(mul);
		}
		else if (s.equals("Mul")) {
			System.out.println("in mul");
			int div = n1/n2;
			calc.setDiv(div);
		}
		session.setAttribute("ans",calc);
		response.sendRedirect("NewFile.jsp");
		
		 
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
