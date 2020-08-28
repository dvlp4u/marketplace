<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand"> Logo </a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavDropdown">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="/home">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/rest/utenti">Utenti</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Contatti</a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Prodotti
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
          <a class="dropdown-item" href="/jsp/prodotti">Lista completa</a>
          <a class="dropdown-item" href="/jsp/prodotti/category/Laptop">Laptop</a>
          <a class="dropdown-item" href="/jsp/prodotti/category/Smartphone">Smartphone</a>
		  <a class="dropdown-item" href="/jsp/prodotti/category/Tablet">Tablet</a>
          <a class="dropdown-item" href="/jsp/prodotti/category/Varie">Varie</a>
        </div>
      </li>
    </ul>
  </div>
</nav>
