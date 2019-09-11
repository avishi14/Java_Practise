package Calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

/**
 * Servlet implementation class CalculatePrice
 */
@WebServlet("/CalculatePrice")
public class CalculatePrice extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String pname =request.getParameter("prname");
		int quantity= Integer.parseInt(request.getParameter("qty"));
		response.setContentType("text/html");
		int price=0;
		switch(pname) {
		case "Soap" : price = quantity*50;
		break;
		case "Shampoo" : price = quantity*120;
		break;
		case "ToothBrush":  price = quantity*50;
		break;
		}
		PrintWriter out = response.getWriter();
		out.println("<b> Price of "+ pname + " is: " + price +"</b>");
		
	}

}
