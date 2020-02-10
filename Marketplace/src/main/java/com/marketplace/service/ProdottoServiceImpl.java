package com.marketplace.service;

import java.io.File;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

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
		prodottoRepository.deleteById(id);
	}
	
	public String provaUpload(@RequestPart ("productImage") MultipartFile image, HttpServletRequest request, Prodotto prodotto){
		MultipartFile productImage = image;
		String rootDir = request.getSession().getServletContext().getRealPath("/WEB-INF/view/image/");
		if (productImage != null && !productImage.isEmpty()) {
			try {
				productImage.transferTo(new File(rootDir+prodotto.getNome()+".jpg"));
			} catch (Exception e) {
				new RuntimeException("Upload fallito", e);
			}
		}
		return "Upload eseguito";
	}
}
