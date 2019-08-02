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
<h3>result page</h3>
selected option of q1: ${ans.ans1} <br><br>
<c:forEach items="${listofquestion}" var="question">
<c:if test="${question.ans}==${ans.ans1}">
<h3>correct answer</h3>
</c:if>

</c:forEach>



selected option of q2: ${ans.ans2}

</body>
</html>