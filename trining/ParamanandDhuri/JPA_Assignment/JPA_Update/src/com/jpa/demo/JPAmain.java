/*
 * Program- To show the searching of the employee from table using jpa
 * Author- Paramanand Dhuri
 */
package com.jpa.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAmain {

	public static void main(String[] args) {
		//creating instance of entity manager factory
		 EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPA_Update" );
		//creating instance of entity manager 
	      EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );
	  	//creating instance of entity 
	      EmployeePOJO employee = entitymanager.find(EmployeePOJO.class, 1);
	      System.out.println("before update");
	      System.out.println(employee);
	      employee.setSalary(1111111 );
	      System.out.println("After update");
	      System.out.println(employee);
	      entitymanager.getTransaction( ).commit( );
	      entitymanager.close( );
	      emfactory.close( );

	}

}
