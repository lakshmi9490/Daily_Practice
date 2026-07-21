<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int x = Integer.parseInt(request.getParameter("x"));
		int y = Integer.parseInt(request.getParameter("y"));
	%>	
	<center>
		<h1 style = "color:maroon;"><%out.println("Addition is : "+ add(x,y));%></h1><br>
		<h2 style = "color:teal;"><%out.println("Substraction is : "+ sub(x,y));%></h2><br>
		<h3 style = "color:purple;"><%out.println("Multiplication is : "+ mul(x,y));%></h3><br>
		<h4 style = "color:olive;"><%out.println("Division is : "+ div(x,y));%></h4><br>
	</center>	
		
		
	
	<%!
		int add(int a,int b) {
			return a+b;
		}
		int sub(int a,int b) {
			return a-b;
		}
		int mul(int a,int b) {
			return a*b;
		}
		int div(int a,int b) {
			return a/b;
		}
	%>
</body>
</html>