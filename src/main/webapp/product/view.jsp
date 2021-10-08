<%--
  Created by IntelliJ IDEA.
  User: tu
  Date: 10/8/2021
  Time: 5:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>${product.id}</p>
    <p>${product.name}</p>
    <p>${product.price}</p>
    <p>${product.quantity}</p>
    <p>${product.color}</p>
    <p>${product.description}</p>
    <p>${product.category.name}</p>

</body>
</html>
