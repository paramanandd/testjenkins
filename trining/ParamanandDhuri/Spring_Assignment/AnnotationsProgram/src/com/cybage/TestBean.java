//Description:=Showing use of annotations such as postconstruct predestroy and required
//Author:= Paramanand Dhuri
package com.cybage;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");  //Invoking Container Using Application Context
		BookDetails bk=(BookDetails)ctx.getBean("BookDetail");        //Acessing  Bean And TypeCasting
		
		System.out.println((bk.getBookDetails().toString())+bk.getAction()+bk.getType());       
		
		
		((AbstractApplicationContext) ctx).close();			//context is closed 
		
	}

}

/*Output:
 
Init method after properties are set : purchase
 ---------------------------------------------------
Book [bookId=129, bookName=JAva, Author=Gosling]purchase0
---------------------------------------------------------

May 12, 2016 5:37:38 PM org.springframework.context.support.AbstractApplicationContext doClose
INFO: Closing org.springframework.context.support.ClassPathXmlApplicationContext@6a4ef523: startup date [Thu May 12 17:37:37 IST 2016]; root of context hierarchy

Spring Container is destroy! Customer clean up
----------------------------------------------
May 12, 2016 5:37:38 PM org.springframework.beans.factory.support.DefaultSingletonBeanRegistry destroySingletons
INFO: Destroying singletons in org.springframework.beans.factory.support.DefaultListableBeanFactory@4373e7e5: defining beans [BookDetail,books]; root of factory hierarchy

*/