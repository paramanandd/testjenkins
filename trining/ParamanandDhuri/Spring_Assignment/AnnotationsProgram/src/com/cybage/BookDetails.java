package com.cybage;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Required;

public class BookDetails {

	Book book;               //Book Refrence Inside BookDeatails cLass
	String action;
	int type;
	
	@Required					//required annotations which which will 
	public void setBook(Book book)	//throw exception if there is no property specified in the configuration file
	{
		this.book = book;
	}


	public Book getBookDetails()
	{
		return book;
	}


	public String getAction() {
		return action;
	}


	public void setAction(String action) {
		this.action = action;
	}


	public int getType() {
		return type;
	}

	@Required
	public void setType(int type) {
		this.type = type;
	}


	public Book getBook() {
		return book;
	}
	
	@PostConstruct
	public void initIt() throws Exception {
	  System.out.println("Init method after properties are set : " +getAction());
	}
	
	@PreDestroy
	public void cleanUp() throws Exception {
	  System.out.println("Spring Container is destroy! Customer clean up");
	}
}
