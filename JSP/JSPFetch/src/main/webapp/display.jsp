<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, com.jsp.model.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List</title>
<style>
    table {
        border-collapse: collapse;
        width: 70%;
        margin: 20px auto;
    }
    th, td {
        border: 1px solid #333;
        padding: 8px 12px;
        text-align: center;
    }
    th {
        background-color: #f2f2f2;
    }
    tr:nth-child(even) {
        background-color: #fafafa;
    }
</style>
</head>
<body>
<%
    ArrayList<Employee> employeeList = (ArrayList<Employee>) session.getAttribute("employeeList");
    if (employeeList != null && !employeeList.isEmpty()) {
%>
    <table>
        <tr>
            <th>Employee_Id</th>
            <th>Name</th>
            <th>Designation</th>
            <th>Salary</th>
        </tr>
        <%
            for (Employee e : employeeList) {
        %>
        <tr>
            <td><%= e.getId() %></td>
            <td><%= e.getName() %></td>
            <td><%= e.getDesign() %></td>
            <td><%= e.getSalary() %></td>
        </tr>
        <%
            }
        %>
    </table>
<%
    } else {
%>
    <p>No employees found.</p>
<%
    }
%>
</body>
</html>
