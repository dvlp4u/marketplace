<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="container">
    
<div id="carouselExampleFade" class="carousel slide carousel-fade col-6 offset-3" data-ride="carousel">
  <div id="act_car" class="carousel-inner">

    
	<c:forEach items="${prodotti}" var="prodotto" varStatus="i" begin="0" end="2">
	  <div id="car_item${i.index}" class="carousel-item"> 	
      	<img src="/img/${prodotto.nome}.jpg" class="d-block w-100" alt="...">
      </div>
    </c:forEach> 
<!--    <script type="text/javascript"> document.getElementById("car_item0").className = "carousel-item active";</script> -->
        <script type="text/javascript"> $("#car_item0").addClass("carousel-item active");</script>
       
  </div>
  <a class="carousel-control-prev" href="#carouselExampleFade" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" style="background-color:black;" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleFade" role="button" data-slide="next">
    <span class="carousel-control-next-icon" style="background-color:black;" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>

</div>
