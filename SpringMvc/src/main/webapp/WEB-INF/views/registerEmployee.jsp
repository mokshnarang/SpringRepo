<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome, Enter the employee details.</h2>

<form:form action="addEmployee" method="post" modelAttribute="emp">
<table>
<tr>
<td><form:label path="name">Name</form:label></td>
<td><form:input path="name"/></td>
</tr>

<tr>
<td><form:label path="id">Employee Id</form:label></td>
<td><form:input path="id"/></td>
</tr>

<tr>
<td><form:label path="contactNumber">Contact Number</form:label></td>
<td><form:input path="contactNumber"/></td>
</tr>

<tr>
<td><input type="submit" value="Submit"></td>
</tr>

</table>

</form:form>
</body>
</html>