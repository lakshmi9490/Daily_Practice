<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	   <center>
		<h1 style = "color:navy;"><% out.println("The Addition is : "+ session.getAttribute("add")); %></h1> <br>
		<h2 style = "color:lime;"><% out.println("The Substraction is : "+ session.getAttribute("sub")); %></h2><br>
		<h3 style = "color:fuchsia;"> <% out.println("The Multiplication is : "+ session.getAttribute("mul")); %></h3><br>
		<h4 style = "color:red;"><% out.println("The Division is : "+ session.getAttribute("div")); %></h4>
	  </center>
</body>
</html>