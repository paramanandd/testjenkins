package hashmap_Books;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Book implements Comparable<Book>
{
	String bookName;
	int bookId;                                                    //States
	int pages;
	
	
	public Book() {
		super();
	}
	
	public Book(String bookName, int bookId, int pages) {
		super();
		this.bookName = bookName;                               //Constructors
		this.bookId = bookId;
		this.pages = pages;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookId=" + bookId + ", pages="     //overriding equal method
				+ pages + "]";
	}


	static HashMap<Integer,Book> hm=new HashMap<Integer, Book>();                  //Creating Collection
	
	public static void main(String[] args)	
	{

	hm.put(11,new Book("Arhiant",11,2345));
	hm.put(11,new Book("C++",11,25));	                                 //Adding Object
	hm.put(13,new Book("Let Us C",13,145));	
	hm.put(14,new Book("JAVA",14,251));	
	
	Set set = hm.entrySet();                                           //Converting Hashmap to set
    
    Iterator i = set.iterator();
    
    while(i.hasNext()) {
       Map.Entry me = (Map.Entry)i.next();
       System.out.print(me.getKey() + ": ");                        //Iterating Hashmap
       System.out.println(me.getValue().toString());
    }

		ArrayList<Book> al = new ArrayList<Book>(hm.values());
		Collections.sort(al);                                      //Converting Hashmap To Arraylist
		System.out.println(al);
		
	}

	@Override
	public int compareTo(Book o) {
		if(this.bookId>o.bookId)
			return 1;                                              //Implementing ComapareTo Method
		else if(this.bookId<o.bookId)
		return -1;
		else 
			return 0;
	}
	
	
}
