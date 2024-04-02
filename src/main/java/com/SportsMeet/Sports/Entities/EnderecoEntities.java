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
	
	@Column(name = "rua")
	private String rua;
	
	@Column(name = "bairro")
	private String bairro;
	
	@Column(name = "logradouro")
	private String logradouro;
	
	@Column(name = "cidade")
	private String cidade;

	@Override
	public int hashCode() {
		return Objects.hash(bairro, cidade, id, logradouro, rua);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof EnderecoEntities)) {
			return false;
		}
		EnderecoEntities other = (EnderecoEntities) obj;
		return Objects.equals(bairro, other.bairro) && Objects.equals(cidade, other.cidade) && id == other.id
				&& Objects.equals(logradouro, other.logradouro) && Objects.equals(rua, other.rua);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
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
