package br.fepi.socialbeer.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
public class Comentario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@JsonInclude(Include.NON_NULL)
	private String texto;

	@JsonInclude(Include.NON_NULL)
	private String usuario;

	@JsonInclude(Include.NON_NULL)
	private Date data;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn(name = "BEER_ID")
	@JsonIgnore
	private Beer beer;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Beer getBeer() {
		return beer;
	}
	public void setBeer(Beer beer) {
		this.beer = beer;
	}
	
}
