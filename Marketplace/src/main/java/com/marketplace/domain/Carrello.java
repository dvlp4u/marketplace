package com.marketplace.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "carrello")
@Data
public class Carrello {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	public Integer id;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "carrello_utente")
//	@Column(name = "utente_id")
	public Utente utenteId;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "carrello_rigaOrdine")
//	@Column(name = "riga_ordine_id")
	public List<RigaOrdine> rigaOrdineId;
	
	@Column(name = "quantita_tot")
	public Integer quantitaTot;
	
}
