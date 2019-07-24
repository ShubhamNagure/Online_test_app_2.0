<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Questions page</h3>
	<form:form action="result" method="post" modelAttribute="ques">
			<table align="center">
			<div>
				<tr>	
					<td>Question No</td>
					<td>Question</td>
				</tr>
				<c:forEach items="${listofquestion}" var="question">
				<tr>
					<td>${question.qid}</td>
					<td>${question.ques}</td>
					
				</tr>
				<tr><td></td>
					<td><input type="radio" value="option1" name="op">${question.option1}</td>
				</tr>
				<tr><td></td>
					<td><input type="radio" value="option2" name="op">${question.option2}</td>
				</tr>
				<tr><td></td>
					<td><input type="radio" value="option3" name="op">${question.option3}</td>
				</tr>
				<tr><td></td>
					<td><input type="radio" value="option4" name="op">${question.option4}</td>
				</tr>
				</c:forEach>
				</div>
			</table>
			<div align="right">
			<input type="submit" value="Finish" >
			</div>
		</form:form>


</body>
</html>