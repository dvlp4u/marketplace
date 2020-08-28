<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

	<div class="input-group mb-3 col-4 offset-7">
	  <input type="text" class="form-control" style="min-width:100px" placeholder="Inserisci il nome da cercare" >
	  <div class="input-group-append">
	    <button class="btn btn-outline-secondary" type="button" id="button-addon2">Cerca</button>
	  </div>
	</div>

	<table class="table table-sm table-dark">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Nick</th>
      <th scope="col">Password</th>
      <th scope="col">Role</th>
    </tr>
  </thead>
  <tbody>
  	<c:forEach items="${users}" var="user">
    <tr>
      <th scope="row"><a href="${pageContext.request.contextPath}/jsp/utenti/${user.id}">${user.id}</a></th>
      <td><a href="${pageContext.request.contextPath}/jsp/utenti/${user.id}">${user.nick}</a></td>
      <td><a href="${pageContext.request.contextPath}/jsp/utenti/${user.id}">${user.password}</a></td>
      <td><a href="${pageContext.request.contextPath}/jsp/utenti/${user.id}">${user.ruolo}</a></td>
    </tr>
	</c:forEach>
	<tr>
      <th scope="row">${user.id}</th>
      <td>${user.nick}</td>
      <td>${user.password}</td>
      <td>${user.ruolo}</td>
    </tr>
  </tbody>
</table>

<a href="add/addUtente"><button type="button" class="btn btn-secondary"  >Aggiungi Utente</button></a>