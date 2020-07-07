<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


	<div class="input-group mb-3 col-4 offset-7">
	  <input id="filtro" type="text" class="form-control" style="min-width:100px" placeholder="Inserisci il nome da cercare" value="${memoria}" onkeyup="ricerca()" >
	  <div class="input-group-append">
	   <a id="cerca" href=""> <button class="btn btn-outline-secondary" type="button" id="button-addon2" >Cerca</button> </a>
	  </div>
	</div>
	
	<div class="row row-cols-1 row-cols-md-4">
	<c:forEach items="${prodotti}" var="prodotto">
	  <div class="col mb-4">
	    <div class="card">  
	    <a href="/jsp/prodotti/${prodotto.id}">	
	      <img src="/view/image/${prodotto.nome}.jpg" class="card-img-top" alt="..." style="height:200px;"/>
	    </a>
	      <div class="card-body">
	        <h5 class="card-title"><a href="/jsp/prodotti/${prodotto.id}">${prodotto.nome}</a></h5>
	        <p class="card-text">Il costo del prodotto è ${prodotto.costo}</p>
	      </div>
	      <a class="btn btn-primary" href="/jsp/delete/deleteProdotto/${prodotto.id}" role="button"><i class="fa fa-trash" aria-hidden="true"></i></a>     
	   </div>
	  </div>
	</c:forEach>  
    </div>
 
<a class="btn btn-secondary" href="/jsp/add/addProdotto">Aggiungi Prodotto</button></a>

 <script type="text/javascript">

	
 ricerca = function(){
if(event.keyCode === 13){
	let filtro = $("#filtro").val(); 
	if(filtro == ""){$(location).attr('href', "/jsp/prodotti/");
	}else{$(location).attr('href', "/jsp/prodotti/filtro/"+filtro);}
}else{
 	let filtro = $("#filtro").val(); 
	if(filtro == ""){$("#cerca").attr('href', "/jsp/prodotti/");
	}else{$("#cerca").attr('href', "/jsp/prodotti/filtro/"+filtro);}
}
}
 
 </script>