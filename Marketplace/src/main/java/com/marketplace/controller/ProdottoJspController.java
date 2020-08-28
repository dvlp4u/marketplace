package com.marketplace.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.marketplace.domain.Prodotto;
import com.marketplace.service.ProdottoService;

import java.io.Console;
import java.io.File;

@Controller
@RequestMapping("/jsp")
public class ProdottoJspController {
	
	@Autowired
	private ProdottoService prodottoService;
	
	@GetMapping("/prodotti")
	public String getProdotti(Model model, HttpServletRequest request){
		model.addAttribute("mode", "prodotti");
		model.addAttribute("title", "Lista Prodotti");
		model.addAttribute("prodotti", prodottoService.getProdotti());
		System.out.println(request.getSession().getServletContext().getRealPath("/"));
		System.out.println(request.getSession().getServletContext().getContextPath());
		System.out.println(System.getProperty("jboss.server.home.url"));
		return "index";
	}
	
	@GetMapping("/prodotti/filtro/{filter}")
	public String getProdotti(Model model, @PathVariable String filter){
		model.addAttribute("mode", "prodotti");
		model.addAttribute("title", "Lista Prodotti");
		model.addAttribute("prodotti", prodottoService.filtraByInput(filter));
		model.addAttribute("memoria", filter);
		return "index";
	}
	
	@RequestMapping("prodotti/{id}")
	public String ProdottoJps(@PathVariable Integer id,Model model) {
	model.addAttribute("prodotto", prodottoService.getProdottoById(id).get());
	model.addAttribute("mode", "prodotto");
	model.addAttribute("title", "Specifiche prodotto");
	return "index";
	}
	
	@RequestMapping("prodotti/category/{category}")
	public String ProdottoJps(@PathVariable String category,Model model) {
	model.addAttribute("prodotti", prodottoService.filterProdottoByCategory(category));
	model.addAttribute("mode", "prodotti");
	model.addAttribute("title", category);
	return "index";
	}

	@GetMapping("add/addProdotto")
	public String addUtente(Model model) {
		model.addAttribute("prodotto", new Prodotto());
		model.addAttribute("mode", "addProdotto");
		model.addAttribute("title", "Aggiungi Prodotto");	
		return "index";
	}
	
	@PostMapping("add/addProdotto")
	public String addUtente(@ModelAttribute("prodotto") Prodotto prodotto, Model model, HttpServletRequest request, @RequestPart("image") MultipartFile image) {
		prodottoService.provaUpload(image, request, prodotto);
		prodottoService.addProdotto(prodotto);
//		model.addAttribute("messaggio", "prodotto aggiunto con successo");
		return "redirect:/jsp/prodotti"; 
	}
	
	@RequestMapping("/delete/deleteProdotto/{id}")
	public String deleteProdotto(@PathVariable Integer id,Model model) {
		prodottoService.deleteProdottoById(id);
		model.addAttribute("mode", "prodotti");
		model.addAttribute("messaggio", "prodotto cancellato con successo");
		return "redirect:/jsp/prodotti";
	}
	
}
