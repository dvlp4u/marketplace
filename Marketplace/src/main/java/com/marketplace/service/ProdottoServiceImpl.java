package com.marketplace.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.Index;
import javax.servlet.http.HttpServletRequest;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.hibernate.query.criteria.internal.expression.function.SubstringFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.marketplace.domain.Prodotto;
import com.marketplace.repository.ProdottoRepository;

@Service
public class ProdottoServiceImpl implements ProdottoService {
	
	@Autowired
	private ProdottoRepository prodottoRepository;
	
	public List<Prodotto> getProdotti(){
		return prodottoRepository.findAll();
	}

	@Override
	public Optional<Prodotto> getProdottoById(Integer id) {
		return prodottoRepository.findById(id);
	}

	@Override
	public void addProdotto(Prodotto prodotto) {
		prodottoRepository.save(prodotto); 
	}

	@Override
	public void deleteProdottoById(Integer id) {
		cancellaImmagine(id);
		prodottoRepository.deleteById(id);
	}
	
	public String provaUpload(MultipartFile image, HttpServletRequest request, Prodotto prodotto){
		File imagesDir = new File(System.getProperty("jboss.server.data.dir"), "images");
		if (!imagesDir.exists()) {
			imagesDir.mkdir();
		}
		File immagine = new File(imagesDir, prodotto.getNome()+".jpg");
		System.out.println("file immagine:"+immagine);
		System.out.println("file immagine lunghezza:"+immagine.length());
		if (image != null && !image.isEmpty()) {
			System.out.println("sono nel transfer");
			try {
				image.transferTo(immagine);
				System.out.println("imagesDir:"+imagesDir);
				System.out.println("file immagine:"+immagine);
				System.out.println("file immagine lunghezza:"+immagine.length());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return "Upload eseguito";
	}

	public void cancellaImmagine(int prodottoId){
		System.out.println("1");
		Prodotto prodotto = prodottoRepository.findById(prodottoId);
		System.out.println("2 prodotto:" + prodotto.toString());
		File imagesDir = new File(System.getProperty("jboss.server.data.dir"), "images");
		File immagine = new File(imagesDir, prodotto.getNome()+".jpg");
		if (!immagine.exists()) throw new IllegalArgumentException("Il File o la Directory non esiste: " + immagine);
		if (!immagine.canWrite()) throw new IllegalArgumentException("Non ho il permesso di scrittura: " + immagine);
		boolean success = immagine.delete();
		System.out.println("3 success:" + success);
		if (!success) throw new IllegalArgumentException("Cancellazione fallita");
	}
	
	@Override
	public List<Prodotto> filterProdottoByCategory(String category) {
		return prodottoRepository.findByCategoria(category);
	}

	@Override
	public List<Prodotto> filtraByInput(String input) {
		List<Prodotto> prodottiFiltro = new ArrayList<Prodotto>();
		List<Prodotto> prodotti = prodottoRepository.findAll();
		for (Prodotto prodotto : prodotti) {
			if (input.toUpperCase().equals(prodotto.getNome().toUpperCase().substring(0, input.length()))) {
				prodottiFiltro.add(prodotto);
			}
		}
		return prodottiFiltro;
	}
}
