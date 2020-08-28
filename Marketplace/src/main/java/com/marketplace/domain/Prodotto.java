package com.marketplace.domain;

import javax.persistence.*;


@Entity
@Table(name = "prodotto")
public class Prodotto {

	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private Integer id;

	@Column(name = "nome", nullable = false, unique = true)
	private String nome;
	
	@Column(name = "costo", nullable = false)
	private Integer costo;
	
	@Column(name = "descrizione")
	private String descrizione;
	
	@Column(name = "categoria", nullable = false)
	private String categoria;
	
	public Prodotto() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCosto() {
		return costo;
	}

	public void setCosto(Integer costo) {
		this.costo = costo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
}
