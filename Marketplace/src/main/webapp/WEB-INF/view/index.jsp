<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>

<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="/view/font-awesome/css/font-awesome.min.css">

<title>Home</title>

</head>

<body>

<div class="container-fluid">

<div class="jumbotron">
  		<a class="btn btn-secondary float-right" href="/logout">Logout</button></a>
  		<a class="btn btn-secondary float-right mr-2" href="/login">Login</button></a>
  <h1 class="display-4" >${title}</h1>
</div>

	<jsp:include page="/WEB-INF/view/navbar.jsp"/>	

<c:choose>

<c:when test="${mode=='home'}">
	<jsp:include page="/WEB-INF/view/carousel.jsp"/>
</c:when>

<c:when test="${mode=='addUtente'}">
	<jsp:include page="/WEB-INF/view/addUtente.jsp"/>
</c:when>

<c:when test="${mode=='utenti'}">
	<jsp:include page="/WEB-INF/view/listaUtenti.jsp"/>
</c:when>

<c:when test="${mode=='prodotti'}">
	<jsp:include page="/WEB-INF/view/listaProdotti.jsp"/>
</c:when>

<c:when test="${mode=='prodotto'}">
	<jsp:include page="/WEB-INF/view/dettaglioProdotto.jsp"/>
</c:when>

<c:when test="${mode=='addProdotto'}">
	<jsp:include page="/WEB-INF/view/addProdotto.jsp"/>
</c:when>
</c:choose>

</div>

</body>
</html>