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
<h1 style="color:green">
Bill for Re-charge on Mobile Number
</h1>
<h2 style="color:red">
    Transaction Id:${bill.offerId}
     <br/><br/>
    Offer Id:${Offer.id}
     <br/><br/>
    Valid for:${Offer.days}
     <br/><br/>
    Talk Time Amount:${Offer.talkTime}
     <br/><br/>
    Data Balance:${Offer.data}GB
    <br/><br/>
    Amount Payable:${Offer.price}
    <br/><br/>
    
     <a href="/welcomePage">Return</a>
     </h2>
  </div>

</body>
</html>