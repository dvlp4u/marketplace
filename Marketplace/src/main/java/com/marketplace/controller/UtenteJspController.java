package com.marketplace.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marketplace.domain.Utente;
import com.marketplace.service.UtenteService;

@Controller
@RequestMapping("/jsp")
public class UtenteJspController {
	
	@Autowired
	private UtenteService utenteService;
		
	@RequestMapping("/utenti")
	public String ListaUtentiJsp(Model model) {
	model.addAttribute("mode", "utenti");
	model.addAttribute("users", utenteService.getUtenti());
	model.addAttribute("title", "Lista Utenti");
	return "index";
	}
	
	@RequestMapping("/utenti/{id}")
	public String UtenteJsp(@PathVariable Integer id,Model model) {
	model.addAttribute("user", utenteService.getUtenteById(id).get());
	model.addAttribute("mode", "utenti");
	model.addAttribute("title", "Profilo utente");
	return "index";
	}

	@GetMapping("/add/addUtente")
	public String addUtente(Model model) {
		model.addAttribute("utente", new Utente());
		model.addAttribute("mode", "addUtente");
		model.addAttribute("title", "Aggiungi Utente");
		
		return "index";
	}
	
	@PostMapping("/add/addUtente")
	public String addUtente(@ModelAttribute("utente") Utente utente, Model model) {
		List<Utente> utenti = utenteService.addUtente(utente);
		model.addAttribute("users", utenti);
		model.addAttribute("mode", "utenti");
		model.addAttribute("title", "Lista Utenti");
		return "index";
	}
}
