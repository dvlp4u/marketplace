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
	
	<div class="row row-cols-1 row-cols-md-4">
	<c:forEach items="${prodotti}" var="prodotto">
	  <div class="col mb-4">
	    <div class="card">  
	    <a href="/jsp/prodotti/${prodotto.id}">	
	      <img src="/img/${prodotto.nome}.jpg" class="card-img-top" alt="..." style="height:200px;"/>
	    </a>
	      <div class="card-body">
	        <h5 class="card-title"><a href="/jsp/prodotti/${prodotto.id}">${prodotto.nome}</a></h5>
	        <p class="card-text">Il costo del prodotto è ${prodotto.costo}</p>
	      </div>
	     
	   </div>
	  </div>
	</c:forEach>  
    </div>
 
<c:if test="${prodotto.id != null}">
    	<div class="row row-cols-1 row-cols-md-4">
	  <div class="col mb-4">
	    <div class="card">  	
	      <img src="/img/${prodotto.id}.jpg" class="card-img-top" alt="...">
	      <div class="card-body">
	        <h5 class="card-title">${prodotto.nome}</h5>
	        <p class="card-text">Il costo del prodotto è ${prodotto.costo}</p>
	      </div>
	   </div>
	  </div>
    </div>
</c:if>




<a href="/jsp/add/addProdotto"><button  type="button" class="btn btn-secondary"  >Aggiungi Prodotto</button></a>