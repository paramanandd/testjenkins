//Working of the singleton scope and prototype scope
package com.cybage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
public static void main(String[] args) 
{
	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");

	//use of singleton scope
	Employee emp=(Employee) context.getBean("bean1");				
	emp.setId(1);
	emp.setName("parma");
	Employee emp1=(Employee) context.getBean("bean1");
	emp.Display();
	emp1.Display();
	
	//use of prototype scope
	Employee emp2=(Employee) context.getBean("bean2");	
	emp2.setId(2);
	emp2.setName("raj");
	Employee emp3=(Employee) context.getBean("bean2");	
	emp2.Display();
	emp3.Display();
}
}

/*
  output:
 
id :1 Name parma
id :1 Name parma
id :2 Name raj
id :0 Name null
*/