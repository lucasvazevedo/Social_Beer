package br.fepi.socialbeer.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
public class Beer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@JsonInclude(Include.NON_NULL)
	private Long id;
	@JsonInclude(Include.NON_NULL)
	private String nome;
	@JsonInclude(Include.NON_NULL)
	private String fabricante;
	@JsonInclude(Include.NON_NULL)
	private String familia;
	@JsonInclude(Include.NON_NULL)
	private String graduacao;
	@JsonInclude(Include.NON_NULL)
	private String ibu;
	@JsonInclude(Include.NON_NULL)
	@OneToMany(mappedBy = "beer")
	private List<Comentario> comentarios;
	
	
	public Beer(String nome) {
		this.nome = nome;
	}
	
	public Beer() {
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getFamilia() {
		return familia;
	}
	public void setFamilia(String familia) {
		this.familia = familia;
	}
	public String getGraduacao() {
		return graduacao;
	}
	public void setGraduacao(String graduacao) {
		this.graduacao = graduacao;
	}
	public String getIbu() {
		return ibu;
	}
	public void setIbu(String ibu) {
		this.ibu = ibu;
	}
	public List<Comentario> getComentarios() {
		return comentarios;
	}
	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}
}
