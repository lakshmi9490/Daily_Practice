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
  <h1>Add Employee</h1>
	<form action="AddEmployeeServlet" method="get">
		<table>
			<tr>
				<td>EmpId</td>
				<td><input type="number" name ="empId"></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name ="name"></td>
			</tr>
			<tr>
				<td>Design</td>
				<td><input type="text" name ="design"></td>
			</tr>
			<tr>
				<td>Salary</td>
				<td><input type="number" name ="salary"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" name ="Add"></td>
			</tr>
		</table>
	</form>
</body>
</center>
</html>