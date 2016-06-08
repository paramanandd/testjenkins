package com.cybage;
//Simple POJO Class With Getter  And Setter
public class Book {

int bookId;
String bookName;
String Author;

public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getAuthor() {
	return Author;
}
public void setAuthor(String author) {
	Author = author;
}
@Override
public String toString() {
	return "Book [bookId=" + bookId + ", bookName=" + bookName + ", Author=" + Author + "]";
}
	
	
}
