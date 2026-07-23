<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList,com.jsp.model.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Details</title>
<style>
    body {
        font-family: Arial, sans-serif;
        text-align: center; /* centers content */
        margin: 20px;
    }
    h1 {
        color: #333;
        margin-bottom: 20px;
    }
    .card-container {
        display: flex;
        flex-wrap: wrap;
        gap: 20px;
        justify-content: center;
    }
    .card {
        width: 250px;
        border: 1px solid #ddd;
        border-radius: 8px;
        box-shadow: 0 2px 8px rgba(0,0,0,0.1);
        padding: 16px;
        background-color: #fff;
        transition: transform 0.2s;
    }
    .card:hover {
        transform: scale(1.05);
        background-color: #f9f9f9;
    }
    .card h3 {
        margin: 0 0 10px;
        font-size: 18px;
        color: #333;
    }
    .card p {
        margin: 6px 0;
        font-size: 14px;
        color: #555;
    }
    .add-btn {
        background-color: #007BFF;
        color: white;
        border: none;
        padding: 10px 18px;
        border-radius: 5px;
        cursor: pointer;
        font-size: 12px;
        margin-bottom: 20px;
    }
    .add-btn:hover {
        background-color: #0056b3;
    }
    .button-group {
    display: flex;
    gap: 10px; 
    justify-content: center; 
    margin-top: 10px;
	}
	
	.button-group form {
	    margin: 0;
	}
</style>
</head>
<body>
    <h1>Employee Details</h1>
    

    <form action="addEmployee.jsp" >
        <button type="submit" class="add-btn">Add Employee</button>
    </form>

    <%
        ArrayList<Employee> employeeList = (ArrayList<Employee>) session.getAttribute("employeeList");
        if(employeeList != null && !employeeList.isEmpty()){
    %>
        <div class="card-container">
            <% for(Employee e : employeeList){ %>
                <div class="card">
                    <h3><%= e.getName() %></h3>
                    <p><strong>ID:</strong> <%= e.getEmpId() %></p>
                    <p><strong>Designation:</strong> <%= e.getDesign() %></p>
                    <p><strong>Salary:</strong> <%= e.getSalary() %></p>
                    
                    <!-- Edit button -->
				      <div class="button-group">
				        <form action="GetEmployeeOnId" method="get">
				            <input type="hidden" name="empId" value="<%= e.getEmpId() %>">
				            <button type="submit" class="add-btn" style="background-color:#28a745;">Edit</button>
				        </form>
				        <form action="DeleteEmployeeServlet" method="get">
				            <input type="hidden" name="empId" value="<%= e.getEmpId() %>">
				            <button type="submit" class="add-btn" style="background-color:red;">Delete</button>
				        </form>
				    </div>
                </div>
            <% } %>
        </div>
    <%
        } else {
    %>
        <p>No Employee found!</p>
    <%
        }
    %>
</body>
</html>
