package com.marketplace.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.marketplace.domain.Prodotto;
import com.marketplace.service.ProdottoService;

@RestController
public class ProdottoController {
	
	@Autowired
	private ProdottoService prodottoService;
	
	@GetMapping("/prodotti")
	public List<Prodotto> getProdotti(Model model){
		return prodottoService.getProdotti();
	}

	@GetMapping("/prodotti/{id}")
	public Optional<Prodotto> getProdottoById(@PathVariable Integer id) {
		return prodottoService.getProdottoById(id);
	}
	
	@DeleteMapping("/prodotti/{id}")
	public void deleteProdottoById(@PathVariable Integer id) {
		prodottoService.deleteProdottoById(id);
	}
	
	@PostMapping("/prodotti/add")
	public void addProdotti(@RequestBody Prodotto prodotto) {
		prodottoService.addProdotto(prodotto);
	}
}
