<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, com.mvcspring.entity.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f6f9;
        margin: 0;
        padding: 20px;
        text-align: center;
    }
    .card-container {
        display: flex;
        justify-content: center;
        flex-wrap: wrap;
        gap: 20px;
        margin-top: 20px;
    }
    .card {
        border: 1px solid #ccc;
        border-radius: 8px;
        padding: 15px;
        width: 250px;
        box-shadow: 0 2px 6px rgba(0,0,0,0.1);
        background-color: #fff;
        transition: transform 0.2s ease;
    }
    .card:hover {
        transform: scale(1.05);
    }
    .card h3 {
        margin: 0 0 10px;
        color: #007bff;
        text-align: center;
    }
    .card p {
        margin: 5px 0;
        text-align: left;
    }
    .button-group {
        display: flex;
        justify-content: center;
        gap: 10px;
        margin-top: 10px;
    }
    .btn {
        padding: 6px 12px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
        color: #fff;
    }
    .edit-btn { background-color: #28a745; }
    .delete-btn { background-color: #dc3545; }
</style>
</head>
<body>
    <h1>Employee Details</h1>
	<a href="register"><input type="button" value="ADD EMPLOYEE"></a>
    <div class="card-container">
    <%
        ArrayList<Employee> employeeList = (ArrayList<Employee>) request.getAttribute("employeeList");
        if (employeeList != null && !employeeList.isEmpty()) {
            for (Employee emp : employeeList) {
    %>
        <div class="card">
            <h3><%= emp.geteName() %></h3>
            <p><strong>ID:</strong> <%= emp.getId() %></p>
            <p><strong>Email:</strong> <%= emp.geteEmail() %></p>
            <p><strong>Designation:</strong> <%= emp.geteDesign() %></p>
            <p><strong>Address:</strong> <%= emp.geteAddress() %></p>

            <div class="button-group">
                <!-- Edit button -->
                <form action="edit" method="get">
                    <input type="hidden" name="id" value="<%= emp.getId() %>">
                    <button type="submit" class="btn edit-btn">Edit</button>
                </form>

                <!-- Delete button -->
                <form action="delete" method="post">
                    <input type="hidden" name="id" value="<%= emp.getId() %>">
                    <button type="submit" class="btn delete-btn">Delete</button>
                </form>
            </div>
        </div>
    <%
            }
        } else {
    %>
        <p>No employees found!</p>
    <%
        }
    %>
    </div>
</body>
</html>