<%@page import="com.cybage.bean.Review"%>
<%@page import="com.cybage.bean.Book"%>
<%@page import="com.cybage.dao.ReviewDao"%>
<%@page import="com.cybage.dao.BookDao"%>
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
		String book=request.getParameter("bookname");	
		BookDao bdao=new BookDao();
		ReviewDao rdao=new ReviewDao();
		Book bookInstance=bdao.search(book);
		//out.println(bookInstance);
		if(bookInstance.getBookname() !=null)
		{
		out.println(bookInstance.getBookname());
		out.println(bookInstance.getAuthor());
		out.println(bookInstance.getPrice());
		
		Review rinstance=rdao.search(book);
		out.println(rinstance.getUser());
		out.println(rinstance.getComment());
		}
		else
		{
			out.println("No such book available");
		}
	%>
</body>
</html>