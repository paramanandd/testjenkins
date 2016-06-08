<%@page import="com.cybage.bean.Review"%>
<%@page import="com.cybage.dao.ReviewDao"%>
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
String review=request.getParameter("review");
String user=(String)request.getSession().getAttribute("user");
ReviewDao rdao=new ReviewDao();
Review rev=new Review(review, bkname, user);
int res=rdao.insertreview(rev);
if(res==1)
{
	out.println("review inserted successfully");
}
else
{
	out.println("Soory.... You Made Wrong Choices");
}
%>
</body>
</html>