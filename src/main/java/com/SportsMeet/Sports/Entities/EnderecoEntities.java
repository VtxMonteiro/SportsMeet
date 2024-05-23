package com.SportsMeet.Sports.Entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Endereco")

public class EnderecoEntities {
	
	@Id 
	private int id;
	
	@Column(name = "cep")
	private String cep;
	
	@Column(name = "uf")
	private String uf;
	
	@Column(name = "bairro")
	private String bairro;
	
	@Column(name = "logradouro")
	private String logradouro;

	@Column(name = "cidade")
	private String cidade;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		EnderecoEntities that = (EnderecoEntities) o;
		return id == that.id && Objects.equals(cep, that.cep) && Objects.equals(uf, that.uf) && Objects.equals(bairro, that.bairro) && Objects.equals(logradouro, that.logradouro) && Objects.equals(cidade, that.cidade);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, cep, uf, bairro, logradouro, cidade);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
}
