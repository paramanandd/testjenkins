/*Program:- To show simple Login program in spring mvc
 * Author-:Paramanand A. Dhuri
 */


package com.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerClass {
@RequestMapping(value="/Login",method=RequestMethod.POST)//request mapping for login form
public ModelAndView LoginForm(HttpServletRequest req,HttpServletResponse res)
{
	//Authentication for correct password
	String pass=req.getParameter("pass");
	if(pass.equals("admin"))
	{
		return new ModelAndView("Welcome","msg","Welcome To Spring");
	}
	else
	{
		return new ModelAndView("Error","msg","Try again,Invalid Credentials");
	}
}

}
