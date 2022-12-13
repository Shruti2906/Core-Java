

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculationServlet
 */
@WebServlet("/CalculationServlet")
public class CalculationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		String str1 = request.getParameter("no1");
		String str2 = request.getParameter("no2");
		int n1 = Integer.parseInt(str1);
		int n2 = Integer.parseInt(str2);
		
		String s = request.getParameter("btn");
		if(s.equals("Add")) {
			int sum = n1+n2;
			pw.print("Addition: "+sum);
		}
		else if(s.equals("Sub")) {
			int sub = n1-n2;
			pw.print("subtraction: "+sub);
		}
		else if(s.equals("Mul")) {
			int mul = n1*n2;
			pw.print("Multiplication: "+mul);
		}
		else if(s.equals("Div")) {
			int div = n1/n2;
			pw.print("Division : "+div);
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
