package com.marketplace.service;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.marketplace.domain.Prodotto;

public interface ProdottoService {

	public List<Prodotto> getProdotti();
	public Optional<Prodotto> getProdottoById(Integer id);
	public void addProdotto(Prodotto prodotto);
	public void deleteProdottoById(Integer id);
	public String provaUpload(@RequestPart ("productImage") MultipartFile image, HttpServletRequest request, Prodotto prodotto);
	public List<Prodotto> filterProdottoByCategory(String category);
	
	public List<Prodotto> filtraByInput(String input);
}
