//Program: To show the  working of collections in spring.
//Author:  

package com.cybage;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollection {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	Mob mb=(Mob)context.getBean("mobid");
	
	System.out.println(mb.getLs());
	System.out.println(mb.getMp());
	System.out.println(mb.getSt());
}
}
