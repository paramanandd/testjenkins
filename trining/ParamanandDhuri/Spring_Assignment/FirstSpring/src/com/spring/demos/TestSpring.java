package com.spring.demos;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		
	
 ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
 FirstClass f1=(FirstClass)context.getBean("bean1");
 SecondClass f12=(SecondClass)context.getBean("bean2");
 f1.getMessage1();
 f12.getMessage2();
	}

}
