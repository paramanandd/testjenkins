

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConfigDemo
 */
@WebServlet("/ConfigDemo")
public class ConfigDemo extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletConfig sc=getServletConfig();                     //Creating Object of Config
		PrintWriter pw=response.getWriter();                     
		pw.println("From Config Parameter"+"<br>");                
		String username=sc.getInitParameter("user");				//getting the parameter 
		pw.println("Username is :"+username);						//printing value
		String pass=sc.getInitParameter("Password");
		pw.println("Password is :"+pass);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
