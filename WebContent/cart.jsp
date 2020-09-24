<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="t" uri="WEB-INF/tags.tld" %>

<!-- JSP for /cart, oppgave 2.2. -->

<!-- forEach er ikke ferdig -->

<!DOCTYPE html>
<html lang="en">

<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/style.css">
    <title>Cart</title>
</head>

<body>
<p><jsp:include page="chooselanguage.jsp"/></p>
    <div class="app">
    	<fmt:bundle basename="resources.cart">
    		<h1>
    			<fmt:message key ="cart"/>	
    		</h1>
    		<table>
    			<tr>
    				<th> <fmt:message key = "name"/> </th> 
    				<th> <fmt:message key = "description"/> </th>
    				<th> <fmt:message key = "price"/> </th> 
    				<th> <fmt:message key = "quantity"/> </th>
    				<th> <fmt:message key = "total"/> </th>
    			</tr>
    			
     			<c:forEach items ="${cartlist}" var ="entry">
    				<tr>
    					<td>${entry.key.name}</td>
    					<td>${entry.key.description}</td>
						<td>${entry.key.price}</td>
						<td>${entry.value}</td> 
						<td>${entry.key.total}</td>
						
					</tr>
				</c:forEach>
				
    			<tr>
    				<td colspan = "4" class="lastRow" ><b><fmt:message key = "amount"/></b> </td>
    				<td > ${total} </td>
    			</tr>
    		</table>
    		
    		<br>
    		<a href="home"> <fmt:message key ="home"/></a>
			<a href="products"> <fmt:message key = "products"/> </a>
			<br>
    		
    	</fmt:bundle>
    </div>
    
    <t:copyright tekst="2008"> </t:copyright>
</body>

</html>