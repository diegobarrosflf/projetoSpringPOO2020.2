package com.example.demo.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.demo.model.EntidadeBase;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Endereco extends EntidadeBase implements Serializable {
	private static final long serialVersionUID = 1L;

	private String logradouro;
	private String numero;
	private String completo;
	private String bairro;
	private String cep;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;

	@ManyToOne
	@JoinColumn(name = "cidade_id")
	private Cidade cidade;

	public Endereco() {
	}

	public Endereco(String logradouro, String numero, String completo, String bairro, String cep, Cliente cliente,
			Cidade cidade) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.completo = completo;
		this.bairro = bairro;
		this.cep = cep;
		this.cliente = cliente;
		this.cidade = cidade;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCompleto() {
		return completo;
	}

	public void setCompleto(String completo) {
		this.completo = completo;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

}
