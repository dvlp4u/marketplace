package com.marketplace.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marketplace.domain.Utente;
import com.marketplace.service.UtenteService;

@RestController
@RequestMapping("/rest")
public class UtenteController {

	@Autowired
	private UtenteService utenteService;
		
		@GetMapping("/utenti")
		public List<Utente> getUtenti() {	
			return utenteService.getUtenti();
	}
		
		@GetMapping("/utenti/{id}")
		public Optional<Utente> getUtenteById(@PathVariable Integer id) {
			return utenteService.getUtenteById(id);
		}
		
		@DeleteMapping("/utenti/{id}")
		public void deleteUtente(@PathVariable Integer id) {
			utenteService.deleteUtenteById(id);
		}
		
		@PostMapping("/utenti/add")
		public void addUtente(@RequestBody Utente utente) {
			utenteService.addUtente(utente);
		}
		
		@PutMapping("/utenti/update")
		public void modificaUtente(@RequestBody Utente utente) {
			utenteService.updateUtentebyId(utente);
		}
		
		
}
