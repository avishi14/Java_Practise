package AgeTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PrintAge")
public class PrintAge extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<b> Welcome to our Page</b>");
		out.println("\n User name is: "+ name + " Age is: "+ age +"</b>");
			
	}

}
