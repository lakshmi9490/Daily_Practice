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
		<h1>Edit Details</h1>
		<form action="EditEmployeeServlet" method="get">
			<input type="hidden" name="empId" value="<%=session.getAttribute("empId")%>" >
			<table>
				<tr>
					<td>Name</td>
					<td><input type="text" name="name" value="<%= session.getAttribute("name") %>"></td>
				</tr>
				<tr>
					<td>Design</td>
					<td><input type="text" name="design" value="<%= session.getAttribute("design") %>"></td>
				</tr>
				<tr>
					<td>Salary</td>
					<td><input type="number" name="salary" value="<%= session.getAttribute("salary") %>"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Edit"></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>