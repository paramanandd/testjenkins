<%@page import="com.cybage.dao.InsertBookDao"%>
<%@page import="com.cybage.bean.Book"%>
<%@page import="com.cybage.connection.MyConnect"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String bookName=request.getParameter("t1");
String bookAuthor=request.getParameter("t2");
int bookPrice=Integer.parseInt(request.getParameter("t3"));


Book bk=new Book(bookName,bookAuthor,bookPrice);
InsertBookDao bkdao=new InsertBookDao();

if(bkdao.insert(bk)==1)
{
	out.println("Book Inserted Successfully");
}

%>
</body>
</html>