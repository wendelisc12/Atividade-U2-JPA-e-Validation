package br.ifpe.ativ02;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="WILP_ALUNO")
public class Aluno extends Pessoa {
	
	
	@NotBlank
	@ManyToOne
	private Curso curso;
	@Size(min = 2000, max = 2020)
	private Integer anoIngresso;
	private double coeficienteRendimento;
	@Enumerated(EnumType.STRING)
	private SituacaoMatricula situacaoMatricula;
	
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Integer getAnoIngresso() {
		return anoIngresso;
	}
	public void setAnoIngresso(Integer anoIngresso) {
		this.anoIngresso = anoIngresso;
	}
	public double getCoeficienteRendimento() {
		return coeficienteRendimento;
	}
	public void setCoeficienteRendimento(double coeficienteRendimento) {
		this.coeficienteRendimento = coeficienteRendimento;
	}
	public SituacaoMatricula getSituacaoMatricula() {
		return situacaoMatricula;
	}
	public void setSituacaoMatricula(SituacaoMatricula situacaoMatricula) {
		this.situacaoMatricula = situacaoMatricula;
	}
	
}
