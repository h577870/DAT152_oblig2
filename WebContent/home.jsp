<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="t" uri="WEB-INF/tags.tld" %>

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
			<h1>
				<fmt:message key="bedriftsnavn"/>
			</h1>
			<img alt="" src="resources/coffe.jpg" width="400" height="300"/>
			<p>
				<fmt:message key="produkter"/> <a href="../products"><fmt:message key="produktnavn"/></a>
			</p>
			
		</fmt:bundle>
    </div>
    
    <br>
    <t:copyright since="2008" present ="2020"> </t:copyright>
</body>

</html>