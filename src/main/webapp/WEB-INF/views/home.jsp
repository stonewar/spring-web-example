<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false"%>
<html>
  <head>
    <title>Web App</title>
  </head>
  <body>
    <h1><s:message code="home.welcome"/></h1>
    <h4><s:message code="home.cd"/></h4>
    <c:forEach var="cd" items="${cds}">
  		<p><c:out value="${cd.id}" /> - <c:out value="${cd.name}" /><p>
  	</c:forEach>
  </body>
</html>