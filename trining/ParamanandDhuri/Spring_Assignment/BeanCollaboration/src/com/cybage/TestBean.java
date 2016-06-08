//Description:=Showing Bean Collobration
//Author:=
package com.cybage;

import java.util.HashMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");  //Invoking Container Using Application Context
		BookDetails bk=(BookDetails)ctx.getBean("BookDetail");        //Acessing  Bean And TypeCasting
		System.out.println(bk.getBookDetails().toString());       
		
		
		
		
	}

}

/*Output:
 
Book [bookId=129, bookName=JAva, Author=Gosling]

*/