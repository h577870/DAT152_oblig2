<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- JSP for /home, oppgave 2.2. -->


<!DOCTYPE html>
<html lang="en">

<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Store Home</title>
</head>

<body>
    <p>
    	<jsp:include page="chooselanguage.jsp"/>
    </p>
    <div class="app">
		<fmt:bundle basename="resources.home">
			<h3>
				<fmt:message key="hello" />
			</h3>
			<h1>
				<fmt:message key="howAreYou"/>
			</h1>
			<h1>
				<fmt:message key="bedriftsnavn"/>
			</h1>
			<img alt="" src="resources/coffe.jpg" width="400" height="300"/>
			<p>
				<fmt:message key="produkter"/> <a href="../products"><fmt:message key="produktnavn"/></a>
			</p>
			<p>
				<fmt:message key="copyright"/>
			</p>
		</fmt:bundle>
    </div>
</body>

</html>