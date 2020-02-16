package com.marketplace.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marketplace.domain.Prodotto;

@Repository
public interface ProdottoRepository extends JpaRepository<Prodotto, Integer> {

	public List<Prodotto> findByCategoria(String category);
}
