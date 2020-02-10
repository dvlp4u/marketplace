package com.marketplace.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;


@Entity
@Table(name = "prodotto")
public class Prodotto {

	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private Integer id;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "costo", nullable = false)
	private Integer costo;
	
//	private MultipartFile productImage;
	
	public Prodotto() {
		super();
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

	/*
	 * public MultipartFile getProductImage() { return productImage; }
	 * 
	 * public void setProductImage(MultipartFile productImage) { this.productImage =
	 * productImage; }
	 */
	
}
