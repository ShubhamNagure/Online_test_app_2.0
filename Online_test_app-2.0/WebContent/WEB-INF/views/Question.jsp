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
				<c:if test="${question.qid==1}">
				
				<tr>
					<td>${question.qid}</td>
					<td>${question.ques}</td>
					
				</tr>
				<tr>
					<td></td>
					<td><input type="radio" value="${question.option1}" name="ans1">${question.option1}</td>
					
				</tr>
				<tr>
					<td></td>
					<td><input type="radio" value="${question.option2}" name="ans1">${question.option2}</td>
				</tr>
				<tr>
					<td></td>
					<td><input type="radio" value="${question.option3}" name="ans1">${question.option3}</td>
				</tr>
				<tr>
					<td></td>
					<td><input type="radio" value="${question.option4}" name="ans1">${question.option4}</td>
				</tr>
				</c:if>
				</c:forEach>
				
				<c:forEach items="${listofquestion}" var="question">
					<c:if test="${question.qid==2}">
				<tr>
					<td>${question.qid}</td>
					<td>${question.ques}</td>
					
				</tr>
				<tr>
					<td></td>
					<td><input type="radio" value="${question.option1}" name="ans2">${question.option1}</td>
				</tr>
				<tr>
					<td></td>
					<td><input type="radio" value="${question.option2}" name="ans2">${question.option2}</td>
				</tr>
				<tr>
					<td></td>
					<td><input type="radio" value="${question.option3}" name="ans2">${question.option3}</td>
				</tr>
				<tr>
					<td></td>
					<td><input type="radio" value="${question.option4}" name="ans2">${question.option4}</td>
				</tr>
				</c:if>
				</c:forEach>
				
				</div>
			</table>
			<div align="right">
			<input type="submit" value="Finish" >
			</div>
		</form:form>


</body>
</html>