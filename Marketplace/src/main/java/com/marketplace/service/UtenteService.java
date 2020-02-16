package com.marketplace.service;

import java.util.List;
import java.util.Optional;

import com.marketplace.domain.Utente;

public interface UtenteService {

	public List<Utente> getUtenti();
	public Optional<Utente> getUtenteById(Integer id);
	public List<Utente> deleteUtenteById(Integer id);
	public List<Utente> addUtente(Utente utente);
	public Optional<Utente> updateUtentebyId(Utente utente);


}
