package com.cybage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

	public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml"); //Invoking Container Using Application Context
	
	Book bk=(Book)ctx.getBean("book");  //Acessing  Bean And TypeCasting
	
	System.out.println(bk.getAuthor()+"  "+bk.getBookId()+"  "+bk.getBookName());
	}

}
