<%--
  Created by IntelliJ IDEA.
  User: neevor
  Date: 10/28/18
  Time: 12:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="academy.learnprogramming.util.Mappings" %>
<html>
<head>
  <title>Todo Items</title>
</head>
<body>
<div align="center">

  <c:url var="addUrl" value="${Mappings.ADD_ITEM}"/>
  <h2>
    <a href="${addUrl}">New Item</a>
  </h2>


  <table border="1" cellpadding="5">
    <caption>
      <h2>TodoItems</h2>
    </caption>

    <tr>
      <th>Title</th>
      <th>Deadline</th>
      <th>Edit</th>
      <th>Delete</th>
    </tr>

    <c:forEach var="item" items="${todoData.items}">

      <c:url var="editUrl" value="${Mappings.ADD_ITEM}">
        <c:param name="id" value="${item.id}"/>
      </c:url>

      <c:url var="deleteUrl" value="${Mappings.DELETE_ITEM}">
        <c:param name="id" value="${item.id}"/>
      </c:url>

      <tr>
        <td>
          <c:url var="viewUrl" value="${Mappings.VIEW_ITEM}">
            <c:param name="id" value="${item.id}"/>
          </c:url>
          <a href="${viewUrl}">
            <c:out value="${item.title}"/>
          </a>
        </td>
        <td><c:out value="${item.deadline}"/></td>
        <td>
          <a href="${editUrl}">Edit</a>
        </td>
        <td>
          <a href="${deleteUrl}">Delete</a>
        </td>
      </tr>

    </c:forEach>
  </table>

</div>
</body>
</html>
