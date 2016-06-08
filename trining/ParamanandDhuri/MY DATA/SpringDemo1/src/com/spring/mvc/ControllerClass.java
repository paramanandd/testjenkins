package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerClass {

	@RequestMapping("/hello1")
	
	public ModelAndView getMessage()
	{
		
	String msg="hello from msg1";
	return new ModelAndView("Hello","msggg",msg);
		
		
	}
	
	
	
	@RequestMapping("/hello2")
	public ModelAndView getMessage1()
	{

	String msg="hello from msg2";
	return new ModelAndView("Hello2","msgg",msg);
		
		
	}
	
	
}
