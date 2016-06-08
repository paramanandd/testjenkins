

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.print.PrinterJobWrapper;


@WebServlet("/FirstPage")
public class FirstPage extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		int no1=Integer.parseInt(request.getParameter("fno"));
		int no2=Integer.parseInt(request.getParameter("sno"));
		
		String choice=request.getParameter("r");
		switch(choice)
		{
		case "ADD":
		out.println("SUM is "+(no1+no2));
	
		break;
		case "SUB":
			out.println("SUB is "+(no1-no2));
			break;
		case "MUL":
			out.println("MUL is "+(no1*no2));
			break;
		case "DIV":
			out.println("DIV is "+(no1/no2));
			break;
		
				
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
