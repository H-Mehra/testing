<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/include.jsp"%>

<%-- Redirected because we can't set the welcome page to a virtual URL. --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head><title>User Info</title></head>
  <body>
    <h1>User Administration </h1>
    <p>First Name is <c:out value="${user.firstName}"/></p>
     <p>Last Name is <c:out value="${user.lastName}"/></p>
      <p>User Id is <c:out value="${user.userID}"/></p>
  </body>
</html>