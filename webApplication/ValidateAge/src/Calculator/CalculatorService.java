package Calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculatorService")
public class CalculatorService extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		String pname =request.getParameter("prname");
		int quantity= Integer.parseInt(request.getParameter("qty"));
		
		RequestDispatcher rd= request.getRequestDispatcher("/CalculatePrice");
		rd.forward(request,response);
	}

}
