package com.cybage;
//factory method to set the values
public class BookFactory {
	
	private Book book=new Book();
	 BookFactory()
	{
		this.book.setBookId(1);
		this.book.setBookName("C");
		this.book.setAuthor("kanetkar");
	}

	 public Book getBookInstance()
	 {
		 return book;
	 }
}
 