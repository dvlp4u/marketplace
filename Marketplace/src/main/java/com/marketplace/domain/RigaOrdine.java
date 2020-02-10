package com.marketplace.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "riga_ordine")
@Data
public class RigaOrdine{

	@Id
	@GeneratedValue
	@Column(name = "id")
	public Integer id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "rigaOrdine_utenteId")
//	@Column(name = "utente_id")
	public Utente utenteId;
	
	@ManyToOne(fetch = FetchType.EAGER)	
	@JoinColumn(name = "rigaOrdine_prodottoId")
//	@Column(name = "prodotto_id")
	public Prodotto prodottoId;
	
	@Column(name = "quantita")
	public Integer quantita;
}
