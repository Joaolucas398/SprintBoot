package com.farmacia.farmacia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String descricao;
	@NotNull
	private String antibiotico;
	@NotNull
	private String antiinflamatorio;
	@NotNull
	private String analgesico;
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<Produto> porduto;
	
	
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAntibiotico() {
		return antibiotico;
	}

	public void setAntibiotico(String antibiotico) {
		this.antibiotico = antibiotico;
	}

	public String getAntiinflamatorio() {
		return antiinflamatorio;
	}

	public void setAntiinflamatorio(String antiinflamatorio) {
		this.antiinflamatorio = antiinflamatorio;
	}

	public String getAnalgesico() {
		return analgesico;
	}

	public void setAnalgesico(String analgesico) {
		this.analgesico = analgesico;
	}

	public List<Produto> getPorduto() {
		return porduto;
	}

	public void setPorduto(List<Produto> porduto) {
		this.porduto = porduto;
	}
	
	
	
	
	
}
