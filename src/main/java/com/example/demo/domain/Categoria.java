package com.example.demo.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import com.example.demo.model.EntidadeNomeada;

@Entity
public class Categoria extends EntidadeNomeada implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToMany(mappedBy = "categorias")
	private List<Produto> produtos = new ArrayList<>();

	public Categoria() {

	}

	public Categoria(String nome) {
		this.setNome(nome);
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

}
