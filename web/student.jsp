<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>STUDENT</title>
</head>
<body>
<h1>WELCOME TO STUDENT PAGE</h1>

<c:forEach items="${students}" var="student">
    <h1>${student}</h1>
</c:forEach>


</body>
</html>
