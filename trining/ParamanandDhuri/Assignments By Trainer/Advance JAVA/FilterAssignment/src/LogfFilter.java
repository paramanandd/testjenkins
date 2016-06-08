

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class LogfFilter
 */
@WebFilter("/LogfFilter")
public class LogfFilter implements Filter {
	File f=null;
	PrintWriter pw=null;
   

	public void destroy() {
		pw.close();
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
   String name= request.getParameter("name");			//accepting name from html page to write into the file
	pw.write(name);										//write the content to file
	pw.flush();
	chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		f=new File("Log.txt");							//initialising contents
		try {
			pw=new PrintWriter(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
