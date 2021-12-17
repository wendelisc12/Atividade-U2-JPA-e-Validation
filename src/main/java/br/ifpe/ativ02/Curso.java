package br.ifpe.ativ02;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="WILP_CURSO")
public class Curso {
	
	@Id
	private Integer codigo;
	private String nome;
	@OneToOne
	@NotNull
	private Professor coordenador;
	private boolean ativo;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Professor getCoordenador() {
		return coordenador;
	}
	public void setCoordenador(Professor coordenador) {
		this.coordenador = coordenador;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	
}
