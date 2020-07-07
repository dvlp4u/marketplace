package com.marketplace.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marketplace.domain.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Integer> {
	

}
