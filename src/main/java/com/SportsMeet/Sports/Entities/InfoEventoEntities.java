package com.SportsMeet.Sports.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "InfoEvento")

public class InfoEventoEntities {
	
	@Id
    private int id;

    @Column(name = "data_evento")
    private Date data_evento;

    @Column(name = "vagas_disponiveis")
    private int vagas_disponiveis;

    @Column(name = "tipo_evento")
    private String tipo_evento;
    
    @Column (name = "acessibilidade")
    private String acessibilidade;

    @Column(name = "faixa_etaria")
    private int faixa_etaria;
    
    @Column(name = "duracao")
    private Time duracao;
    
    @Column(name = "horario_tolerancia")
    private Time horario_tolerancia;

    @Column(name = "descricao_geral")
    private String descricao_geral;

	@Override
	public int hashCode() {
		return Objects.hash(acessibilidade, data_evento, descricao_geral, duracao, faixa_etaria, horario_tolerancia, id,
				tipo_evento, vagas_disponiveis);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof InfoEventoEntities)) {
			return false;
		}
		InfoEventoEntities other = (InfoEventoEntities) obj;
		return Objects.equals(acessibilidade, other.acessibilidade) && Objects.equals(data_evento, other.data_evento)
				&& Objects.equals(descricao_geral, other.descricao_geral) && Objects.equals(duracao, other.duracao)
				&& faixa_etaria == other.faixa_etaria && Objects.equals(horario_tolerancia, other.horario_tolerancia)
				&& id == other.id && Objects.equals(tipo_evento, other.tipo_evento)
				&& vagas_disponiveis == other.vagas_disponiveis;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData_evento() {
		return data_evento;
	}

	public void setData_evento(Date data_evento) {
		this.data_evento = data_evento;
	}

	public int getVagas_disponiveis() {
		return vagas_disponiveis;
	}

	public void setVagas_disponiveis(int vagas_disponiveis) {
		this.vagas_disponiveis = vagas_disponiveis;
	}

	public String getTipo_evento() {
		return tipo_evento;
	}

	public void setTipo_evento(String tipo_evento) {
		this.tipo_evento = tipo_evento;
	}

	public String getAcessibilidade() {
		return acessibilidade;
	}

	public void setAcessibilidade(String acessibilidade) {
		this.acessibilidade = acessibilidade;
	}

	public int getFaixa_etaria() {
		return faixa_etaria;
	}

	public void setFaixa_etaria(int faixa_etaria) {
		this.faixa_etaria = faixa_etaria;
	}

	public Time getDuracao() {
		return duracao;
	}

	public void setDuracao(Time duracao) {
		this.duracao = duracao;
	}

	public Time getHorario_tolerancia() {
		return horario_tolerancia;
	}

	public void setHorario_tolerancia(Time horario_tolerancia) {
		this.horario_tolerancia = horario_tolerancia;
	}

	public String getDescricao_geral() {
		return descricao_geral;
	}

	public void setDescricao_geral(String descricao_geral) {
		this.descricao_geral = descricao_geral;
	}
	
}


