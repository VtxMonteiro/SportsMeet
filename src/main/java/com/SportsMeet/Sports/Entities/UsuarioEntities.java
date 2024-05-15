package com.SportsMeet.Sports.Entities;

import java.sql.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Usuario")

public class UsuarioEntities {

	@Id
	private int id;

	@Column(name = "nome_cadastro")
	private String nome_cadastro;

	@Column(name = "cpf_cadastro")
	private String cpf_cadastro;

	@Column(name = "email_cadastro")
	private String email_cadastro;

	@Column(name = "data_nascimento")
	private Date data_nascimento;

	@Column(name = "telefone_cadastro")
	private String telefone_cadastro;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		UsuarioEntities that = (UsuarioEntities) o;
		return id == that.id && Objects.equals(nome_cadastro, that.nome_cadastro) && Objects.equals(cpf_cadastro, that.cpf_cadastro) && Objects.equals(email_cadastro, that.email_cadastro) && Objects.equals(data_nascimento, that.data_nascimento) && Objects.equals(telefone_cadastro, that.telefone_cadastro);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome_cadastro, cpf_cadastro, email_cadastro, data_nascimento, telefone_cadastro);
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

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getTelefone_cadastro() {
		return telefone_cadastro;
	}

	public void setTelefone_cadastro(String telefone_cadastro) {
		this.telefone_cadastro = telefone_cadastro;
	}
}


