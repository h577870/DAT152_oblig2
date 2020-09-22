<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- JSP for /cart, oppgave 2.2. -->


<!DOCTYPE html>
<html lang="en">

<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cart</title>
</head>

<body>
<p><jsp:include page="chooselanguage.jsp"/></p>
    <div class="app">
    	<fmt:bundle basename="resources.cart">
    		<h3>
    			<fmt:message key ="cart"/>	
    		</h3>
    		
    		<table border ="1">
    			<tr>
    				<th> <fmt:message key = "name"/> </th> 
    				<th> <fmt:message key = "description"/> </th>
    				<th> <fmt:message key = "price"/> </th> 
    				<th> <fmt:message key = "quantity"/> </th>
    				<th> <fmt:message key = "total"/> </th>
    			</tr>
    			<tr>
    				<td> <fmt:message key = "amount"/> </td>
    				<td> Noe pris </td>
    			</tr>
    		</table>
    		
    		<br>
    		<a href="home.jsp"> <fmt:message key ="home"/></a>
			<a href="products.jsp"> <fmt:message key = "products"/> </a>
    		
    	</fmt:bundle>
    </div>
</body>

</html>