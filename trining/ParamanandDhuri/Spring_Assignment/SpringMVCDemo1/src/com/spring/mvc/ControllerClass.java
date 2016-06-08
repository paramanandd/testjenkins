/*Program:- To show simple linking in spring mvc
 * Author-:Paramanand A. Dhuri
 */

package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerClass {
//request mapping for first link
	@RequestMapping("/hello1")
	public ModelAndView getMessage()
	{
		
	String msg=" from msg1";
	return new ModelAndView("Hello","msg1",msg);
		
		
	}
	
	
	//request mapping for second link
	@RequestMapping("/hello2")
	public ModelAndView getMessage1()
	{

	String msg=" from msg2";
	return new ModelAndView("Hello2","msg2",msg);
		
		
	}
	
	
}
