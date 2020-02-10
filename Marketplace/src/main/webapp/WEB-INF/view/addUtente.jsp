<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

</head>
<body>
	<form:form method="post" action="addUtente" modelAttribute="utente">
	  <div class="form-group">
	    <form:label path="nick">Nick</form:label>
	    <form:input path="nick" class="form-control" id="nick" placeholder="Inserisci il Nickname"/>
	  </div>
	  <div class="form-group">
	    <form:label path="password">Password</form:label>
	    <form:password path="password" class="form-control" id="password" placeholder="Inserisci la Password"/>
	  </div>
	  <div class="form-group">
	    <form:label path="ruolo">Ruolo</form:label>
	    <form:select path="ruolo" class="form-control" id="ruolo">
	      <form:option value="1">Administrator</form:option>
	      <form:option value="2">Utente</form:option>
	    </form:select>
	  </div>
	  <button type="submit" class="btn btn-primary" value="submit" >Aggiungi Utente</button>
	</form:form>
