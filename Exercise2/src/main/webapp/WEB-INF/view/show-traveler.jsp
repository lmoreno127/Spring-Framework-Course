<%--
  Created by IntelliJ IDEA.
  User: i531693
  Date: 13/06/22
  Time: 8:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Traveler Info</title>
</head>
<body>
  <h2>Traveler Info</h2>
<%--  This is the first form to get a paramete from sendDataForm method controllerr--%>
  Traveler Name: ${traveler.firstname}
  <br><br>
  Traveler Lastname: ${traveler.lastname}
  <br><br>
  Traveler age: ${traveler.age}
  <br><br>
  Traveler ID: ${traveler.id}
  <br><br>
  Traveler Cellphone number: ${traveler.cellphonenumber}

  <br><br>
  Traveler Email: ${traveler.email}
  <br><br>
  Traveler Country: ${traveler.country}
<br><br>
  Favorites Countries:
<ul>
    <c:forEach var="country" items="${traveler.favoriteCountries}">
      <li>${country}</li>
    </c:forEach>
</ul>

Redention code:${traveler.redentionCode}

</body>
</html>
