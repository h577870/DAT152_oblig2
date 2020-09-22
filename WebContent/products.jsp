<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- JSP for /products, oppgave 2.2. -->

<!-- Finne en løsning på produktnavn, -beskrivelse osv. -->


<!DOCTYPE html>
<html lang="en">

<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Products</title>
</head>

<body>
    <p><jsp:include page="chooselanguage.jsp"/></p>
    <div class="app">
    <fmt:bundle basename="resources.products">
		<c:forEach items="${productlist}" var="p">
			<div class=product>
			<table class="product-table">
				<tr><td><fmt:message key="produktnavn"/> ${p.name}</td></tr>
				<tr><td><fmt:message key="produktpris"/> ${p.price}</td></tr>
				<tr><td><fmt:message key="produktbeskrivelse"/> ${p.description}</td></tr>
				<tr><td><button type="button"><fmt:message key="knapptekst"/></button></td></tr>
				<img src="${p.imgref}" alt="Missing photo...">
			</table>
			</div>
		</c:forEach>
		<a href="../home"><fmt:message key="hjemlenke"/></a> <a href="../cart"><fmt:message key="handlekurvlenke"/></a>
		<p><fmt:message key="copyright"/></p>
	</fmt:bundle>
    </div>
</body>

</html>