

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

/**
 * Servlet implementation class SerletLifecycle
 */
@WebServlet("/SerletLifecycle")
public class SerletLifecycle extends GenericServlet {
	  
	public void init(ServletConfig config) throws ServletException 
	{      
	  System.out.println("Init method Called");
	}



	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException 
	{
		System.out.println("Service method Called");
		
	}
	
	
	public void destroy() {
		System.out.println("Destroy method Called");
	}

}
