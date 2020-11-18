package com.example.demo.domain;

import java.io.Serializable;

import javax.persistence.Entity;

import com.example.demo.model.EntidadeNomeada;

@Entity
public class Categoria extends EntidadeNomeada implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public Categoria() {
		
	}
	
	public Categoria(String nome) {
		this.setNome(nome);
	}

}
