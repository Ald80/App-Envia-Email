<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <jsp:include page="modal.jsp"/>
	
	<div class="container col-6">
		<c:if test="${fn:length(msg) > 0}">
			<h1>${msg}</h1>
		</c:if>
	</div>
