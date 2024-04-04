package com.SportsMeet.Sports.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

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
    private String horario;

    private int qtd_pessoa;

    @Column(name = "Organizador")
    private String Organizador;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EventoEntities that)) return false;
        return id == that.id && qtd_pessoa == that.qtd_pessoa && Objects.equals(nome_evento, that.nome_evento) && Objects.equals(descricao, that.descricao) && Objects.equals(horario, that.horario) && Objects.equals(Organizador, that.Organizador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome_evento, descricao, horario, qtd_pessoa, Organizador);
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

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getQtd_pessoa() {
        return qtd_pessoa;
    }

    public void setQtd_pessoa(int qtd_pessoa) {
        this.qtd_pessoa = qtd_pessoa;
    }

    public String getOrganizador() {
        return Organizador;
    }

    public void setOrganizador(String organizador) {
        Organizador = organizador;
    }
}
