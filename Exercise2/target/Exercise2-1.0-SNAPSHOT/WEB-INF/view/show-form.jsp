<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Luis's Form</title>
    <style>
        .error{
            color: red;
        }
    </style>
</head>
<body>
<h2>Create New Traveler</h2>
<form:form action="processForm" modelAttribute="traveler">
    First Name(required)<form:input path="firstname"/>
    <form:errors path="firstname" cssClass="error"/>
    <br><br>
    Last Name<form:input path="lastname"/>
    <br><br>
    Age<form:input path="age"/>
    <form:errors path="age" cssClass="error"/>
    <br><br>
    ID number<form:input path="id"/>
    <br><br>
    Cellphone number<form:input path="cellphonenumber"/>
    <br><br>
    Email<form:input path="email"/>
    <br><br>
    Your Country
    <form:select path="country">
      <form:option value="Colombia"/>
        <form:option value="United States"/>
        <form:option value="Canada"/>
        <form:option value="Netherlands"/>
   </form:select>
    <br><br>
    Favorite Countries
    Colombia <form:checkbox path="favoriteCountries" value="Colombia"/>
    Canada <form:checkbox path="favoriteCountries" value="Canada"/>
    Netherlands <form:checkbox path="favoriteCountries" value="Netherlands"/>
    Brazil <form:checkbox path="favoriteCountries" value="Brazil"/>
    <br><br>
    Redention Code<form:input path="redentionCode"/>
    <form:errors path="redentionCode" cssClass="error"/>

    <input type="submit" value="Submit"/>
</form:form>

</body>
</html>
