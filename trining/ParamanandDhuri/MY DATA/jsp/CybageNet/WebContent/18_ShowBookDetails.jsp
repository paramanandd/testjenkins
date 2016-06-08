<%@page import="com.cybage.dao.BookDao"%>
<%@page import="com.cybage.bean.Book"%>
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
		String bkname=request.getParameter("bookname");
		BookDao searchdao=new BookDao();
		Book bookInstance=searchdao.search(bkname);
		if(bookInstance.getBookname() !=null)
		{
		out.println(bookInstance.getBookname());
		out.println(bookInstance.getAuthor());
		out.println(bookInstance.getPrice());
		}
	%>
			
</body>
</html>