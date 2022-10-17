<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<form method="get"   action="record">
<h3 style="color:blue">
Enter Mobile Number<input type="text" name="mobile"/>
</h3>
<h1 style="color:blue">
Select Plan from below
</h1>
<h3>
<table border="2">
  <tr>
    <th>Plan Id</th>
    <th>Days</th>
    <th>TalkTime</th>
    <th>Data</th>
    <th>Price</th>
     <th>SELECT</th>
    </tr>
    <c:forEach  items="${List}" var="list">
      <tr>
      <td>${list.id}</td>
      <td>${list.TalkTime}</td>
      <td>${list.data}</td>
       <td>${list.price}</td>
        <td><input type="radio" value="${list.id} name=offerId"/></td>
      </tr>  
      </c:forEach>
      </table>
  <input type="submit"  value="submit">
  </form>
  </h3>
</div>
</body>
</html>