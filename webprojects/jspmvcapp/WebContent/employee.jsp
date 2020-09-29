<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:choose>

		<c:when test="${message == null}">
             Employee Id: ${empData.empId} <br>
  		     Name: ${empData.name} <br>
  		     Salary: ${empData.salary}
         </c:when>


		<c:otherwise>
              ${message}
         </c:otherwise>
	</c:choose>

</body>
</html>