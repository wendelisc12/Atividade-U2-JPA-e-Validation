package br.ifpe.ativ02;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="WILP_PROJETOPESQUISA")
public class ProjetoPesquisa {
	@Id
	private Integer codigo;
	@NotNull
	@Max(100)
	private String titulo;
	@NotNull
	@Max(1000)
	private String resumo;
	private byte[] arquivoPDF;
	@OneToOne
	private Professor responsavel;
	@OneToMany
	@Size(min = 2)
	private List<Aluno> colaboradores;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	public byte[] getArquivoPDF() {
		return arquivoPDF;
	}
	public void setArquivoPDF(byte[] arquivoPDF) {
		this.arquivoPDF = arquivoPDF;
	}
	public Professor getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Professor responsavel) {
		this.responsavel = responsavel;
	}
	public List<Aluno> getColaboradores() {
		return colaboradores;
	}
	public void setColaboradores(List<Aluno> colaboradores) {
		this.colaboradores = colaboradores;
	} 
	
	
}
