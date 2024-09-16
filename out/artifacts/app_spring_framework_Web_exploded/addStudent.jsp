<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ADD STUDENT</title>
</head>
<body>
<h1>ADD STUDENT PAGE</h1>
<form action="/addStudent" method="post">
    <label>
        <input type="text" name="fullName" placeholder="Enter full name">
    </label>
    <label>
        <input type="text" name="age" placeholder="Enter age">
    </label>
    <label>
        <input type="text" name="phoneNumber" placeholder="Enter phone number">
    </label>
    <br>
    <button>Submit</button>
</form>

</body>
</html>
