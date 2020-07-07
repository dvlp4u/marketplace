<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

    	<div class="row row-cols-1 row-cols-md-4">
	  <div class="col mb-4">
	    <div class="card">  	
	      <img src="/img/${prodotto.nome}.jpg" class="card-img-top" alt="...">
	      <div class="card-body">
	        <h5 class="card-title">${prodotto.nome}</h5>
	        <p class="card-text">Il costo del prodotto è ${prodotto.costo}</p>
	      </div>
	   </div>
	  </div>
    </div>

<a href="/jsp/prodotti"><button  type="button" class="btn btn-secondary">Indietro</button></a>