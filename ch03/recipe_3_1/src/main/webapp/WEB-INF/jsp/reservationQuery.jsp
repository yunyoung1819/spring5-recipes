<%--
  Created by IntelliJ IDEA.
  User: yunyoung
  Date: 27/03/2021
  Time: 17:55
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>ReservationQuery</title>
</head>

<body>
<form method="post">
    Court Name
    <input type="text" name="courtName" value="${courtName}" />
    <input type="submit" value="Query" />
</form>

<table border="1">
    <tr>
        <th>Court Name</th>
        <th>Date</th>
        <th>Hour</th>
        <th>Player</th>
    </tr>
    <c:forEach items="${reservation}" var="reservation">
        <tr>
            <td>${reservation.courtName}</td>
            <td><fmt:formatDate value="${reservation.date}" pattern="yyyy-MM-dd" /></td>
            <td>${reservation.hour}</td>
            <td>${reservation.player.name}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
