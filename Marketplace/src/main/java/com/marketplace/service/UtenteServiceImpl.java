package com.marketplace.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketplace.domain.Utente;
import com.marketplace.repository.UtenteRepository;

@Service
public class UtenteServiceImpl implements UtenteService {
	
	@Autowired
	private UtenteRepository utenteRepository;
	
	@Override
	public List<Utente> getUtenti(){
		return utenteRepository.findAll();
	}

	@Override
	public Optional<Utente> getUtenteById(Integer id) {
		return utenteRepository.findById(id);
	}

	@Override
	public List<Utente> deleteUtenteById(Integer id) {
		utenteRepository.deleteById(id);
		return utenteRepository.findAll();
	}

	@Override
	public List<Utente> addUtente(Utente utente) {
		utenteRepository.save(utente);
		return utenteRepository.findAll();
	}

	@Override
	public Optional<Utente> updateUtentebyId(Utente utente) {
		utenteRepository.save(utente);
		Integer id = utente.getId();
		return utenteRepository.findById(id);
	}


}
