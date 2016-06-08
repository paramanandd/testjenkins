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
		 EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPA_Delete" );
		//creating instance of entity manager 
		  EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );
	    //creating instance of entity 
	      EmployeePOJO employee = entitymanager.find(EmployeePOJO.class, 1201);
	      entitymanager.remove(employee);
	      entitymanager.getTransaction( ).commit( );
	      entitymanager.close( );
	      emfactory.close( );

	}

}
