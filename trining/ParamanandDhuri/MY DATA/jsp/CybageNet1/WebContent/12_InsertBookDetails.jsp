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
		out.println("<form action='14_InsertBook.jsp'>");
		out.println("Book Name<input type='text' name='t1'>");
		out.println("Book Author<input type='text' name='t2'>");
		out.println("Book Price<input type='text' name='t3'>"+"<br>"+"<br>");
		out.println("<input type='submit' value='Submit Details'>"+"</form>");
%>
</body>
</html>