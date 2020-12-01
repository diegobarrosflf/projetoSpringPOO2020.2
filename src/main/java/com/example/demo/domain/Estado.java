package com.example.demo.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.example.demo.model.EntidadeNomeada;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Estado  extends EntidadeNomeada implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	@OneToMany(mappedBy = "estado")
	private List<Cidade> cidades = new ArrayList<>();
	
	public Estado() {
		
	}
	
	public Estado(String nome) {
		this.setNome(nome);
	}

	public List<Cidade> getCidades() {
		return cidades;
	}

	public void setCidades(List<Cidade> cidades) {
		this.cidades = cidades;
	}
	
	

}
