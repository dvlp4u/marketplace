package com.marketplace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marketplace.service.ProdottoService;

@Controller
public class HomeController {
	
	@Autowired
	private ProdottoService prodottoService;

		@RequestMapping(value= {"/","/home"})
		public String getHome(Model model) {
			model.addAttribute("prodotti", prodottoService.getProdotti());
			model.addAttribute("title", "Marketplace");
			model.addAttribute("mode", "home");
			return "index";
		}
}
