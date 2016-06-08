

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

/**
 * Servlet implementation class ContextDemo
 */
@WebServlet("/ContextDemo")
public class ContextDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContextDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
     ServletContext sc=getServletContext();	              //object of Servelt Context
     Enumeration<String> elist=sc.getInitParameterNames(); //Accessing Multiple Parameter names and putting in list
     PrintWriter pw=response.getWriter();
     pw.println("Context Parameter"+"<br>");
		while(elist.hasMoreElements())
		{
			pw.println(sc.getInitParameter(elist.nextElement()));    //Displaying
			
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
