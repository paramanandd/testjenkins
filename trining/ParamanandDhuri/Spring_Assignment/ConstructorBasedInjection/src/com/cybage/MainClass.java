


package com.cybage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
public static void main(String[] args) 
{
	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	Employee emp=(Employee) context.getBean("bean");				
	emp.display();
}
}
