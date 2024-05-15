package com.SportsMeet.Sports.Entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cadastro")

public class UsuarioEntities {
	
	@Id 
	private int id;
	
	@Column(name = "nome_cadastro")
	private String nome_cadastro;
	
	@Column(name = "cpf_cadastro")
	private String cpf_cadastro;
	
	@Column(name = "email_cadastro")
	private String email_cadastro;
	
	@Column(name = "idade_cadastro")
	private String idade_cadastro;
	
	@Column(name = "telefone_cadastro")
	private String telefone_cadastro;

	@Override
	public int hashCode() {
		return Objects.hash(cpf_cadastro, email_cadastro, id, idade_cadastro, nome_cadastro, telefone_cadastro);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof UsuarioEntities)) {
			return false;
		}
		UsuarioEntities other = (UsuarioEntities) obj;
		return Objects.equals(cpf_cadastro, other.cpf_cadastro) && Objects.equals(email_cadastro, other.email_cadastro)
				&& id == other.id && Objects.equals(idade_cadastro, other.idade_cadastro)
				&& Objects.equals(nome_cadastro, other.nome_cadastro)
				&& Objects.equals(telefone_cadastro, other.telefone_cadastro);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome_cadastro() {
		return nome_cadastro;
	}

	public void setNome_cadastro(String nome_cadastro) {
		this.nome_cadastro = nome_cadastro;
	}

	public String getCpf_cadastro() {
		return cpf_cadastro;
	}

	public void setCpf_cadastro(String cpf_cadastro) {
		this.cpf_cadastro = cpf_cadastro;
	}

	public String getEmail_cadastro() {
		return email_cadastro;
	}

	public void setEmail_cadastro(String email_cadastro) {
		this.email_cadastro = email_cadastro;
	}

	public String getIdade_cadastro() {
		return idade_cadastro;
	}

	public void setIdade_cadastro(String idade_cadastro) {
		this.idade_cadastro = idade_cadastro;
	}

	public String getTelefone_cadastro() {
		return telefone_cadastro;
	}

	public void setTelefone_cadastro(String telefone_cadastro) {
		this.telefone_cadastro = telefone_cadastro;
	}


	
}
