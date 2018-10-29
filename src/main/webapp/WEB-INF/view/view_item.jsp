<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: neevor
  Date: 10/29/18
  Time: 10:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="academy.learnprogramming.util.Mappings" %>
<html>
<head>
  <title>
    Item <c:out value="${todoItem.id}"/>
  </title>
</head>
<body>
  <div align="center">
    <h2>
      <c:url var="itemList" value="${Mappings.ITEMS}"/>
      <a href="${itemList}">Back to item list</a>
    </h2>

    <h1>
      <c:out value="${todoItem.id}"/>.
      <c:out value="${todoItem.title}"/>
    </h1>

    <h4>
      Deadline: <c:out value="${todoItem.deadline}"/>
    </h4>

    <h2>
      Description:
    </h2>

    <p>
      <c:out value="${todoItem.details}"/>
    </p>
  </div>
</body>
</html>
