<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

</head>
<body>
 	<form:form method="post" action="addProdotto?${_csrf.parameterName}=${_csrf.token}" modelAttribute="prodotto"  enctype="multipart/form-data">
	  <div class="form-group">
	    <form:label path="nome">Nome</form:label>
	    <form:input path="nome" class="form-control" id="nome" placeholder="Inserisci il Nome"/>
	  </div>
	  <div class="form-group">
	    <form:label path="costo">Costo</form:label>
	    <form:input path="costo" class="form-control" id="costo" placeholder="Inserisci il prezzo"/>
	  </div>
	  <div class="form-group">
	    <form:label path="descrizione">Descrizione</form:label>
	    <form:input path="descrizione" class="form-control" id="descrizione" placeholder="Inserisci la descrizione"/>
	  </div>
	  <div class="form-group">
	    <form:label path="categoria">Categoria</form:label>
	    <form:input path="categoria" class="form-control" id="categoria" placeholder="Inserisci la categoria"/>
	  </div>
     <label for="image">Immagine</label>
  	 <input name="image" id=image type="file"/>
	  <form:button type="submit" class="btn btn-secondary" value="submit" >Aggiungi Prodotto</form:button>
	</form:form>
