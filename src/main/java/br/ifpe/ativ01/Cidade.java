package br.ifpe.ativ01;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;

@Entity
@Table(name="WILP_CIDADE")
public class Cidade {
	
	@Id
	private Integer codigo;
	@NotNull
	@Size(min = 3, max = 50)
	private String nome;
	@Enumerated(EnumType.STRING)
	private UF uf;
	
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
	public UF getUf() {
		return uf;
	}
	public void setUf(UF uf) {
		this.uf = uf;
	}
	
	
}
