package com.SportsMeet.Sports.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "Evento")
public class EventoEntities {
    @Id
    private int id;

    @Column(name = "nome_evento")
    private String nome_evento;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "horario")
    private Time horario;
    
    @Column (name = "qtd_pessoa")
    private int qtd_pessoa;

    @Column(name = "organizador")
    private String organizador;

	@Override
	public int hashCode() {
		return Objects.hash(descricao, horario, id, nome_evento, organizador, qtd_pessoa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof EventoEntities)) {
			return false;
		}
		EventoEntities other = (EventoEntities) obj;
		return Objects.equals(descricao, other.descricao) && Objects.equals(horario, other.horario) && id == other.id
				&& Objects.equals(nome_evento, other.nome_evento) && Objects.equals(organizador, other.organizador)
				&& qtd_pessoa == other.qtd_pessoa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome_evento() {
		return nome_evento;
	}

	public void setNome_evento(String nome_evento) {
		this.nome_evento = nome_evento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Time getHorario() {
		return horario;
	}

	public void setHorario(Time horario) {
		this.horario = horario;
	}

	public int getQtd_pessoa() {
		return qtd_pessoa;
	}

	public void setQtd_pessoa(int qtd_pessoa) {
		this.qtd_pessoa = qtd_pessoa;
	}

	public String getOrganizador() {
		return organizador;
	}

	public void setOrganizador(String organizador) {
		this.organizador = organizador;
	}

   
}
