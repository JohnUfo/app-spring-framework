<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>STUDENT</title>
</head>
<body>
<h1>WELCOME TO STUDENT PAGE</h1>

<h1>${response}</h1>


<table style="border: 1px black">
<c:forEach items="${students}" var="student">
    <tr>
        <th>${student.fullName}</th>
        <th>${student.age}</th>
        <th>${student.phoneNumber}</th>
    </tr>
</c:forEach>
</table>


</body>
</html>
