package com.SportsMeet.Sports.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "Evento")
public class EventoEntities {
    @Id
    private int id;

    @Column(name = "nome_evento")
    private String nome_evento;

    @Column(name = "Data_evento")
    private String Data_evento;

    @Column(name = "vagas_disponiveis")
    private Time vagas_disponiveis;
    
    @Column (name = "Acessibilidade")
    private int  Acessibilidade;

    @Column(name = "FaixaEtariaMin")
    private String FaixaEtariaMin;

	@Column(name = "FaixaEtariaMax")
	private Date FaixaEtariaMax;

	@Column(name = "Duracao")
	private int Duracao;

	@Column(name = "Horario")
	private String Horario;

	@Column (name = "Descricao")
	private String Descricao;

	@Column(name = "MaxParticipantes")
	private int MaxParticipantes;

	@Column(name = "OrganizadorID")
	private Time OrganizadorID;

	@Column(name = "avaliacao")
	private Time avaliacao;

	@Column(name = "EnderecoID")
	private String EnderecoID;

	@Column(name = "EsporteID")
	private String EsporteID;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		EventoEntities that = (EventoEntities) o;
		return id == that.id && Acessibilidade == that.Acessibilidade && Duracao == that.Duracao && MaxParticipantes == that.MaxParticipantes && Objects.equals(nome_evento, that.nome_evento) && Objects.equals(Data_evento, that.Data_evento) && Objects.equals(vagas_disponiveis, that.vagas_disponiveis) && Objects.equals(FaixaEtariaMin, that.FaixaEtariaMin) && Objects.equals(FaixaEtariaMax, that.FaixaEtariaMax) && Objects.equals(Horario, that.Horario) && Objects.equals(Descricao, that.Descricao) && Objects.equals(OrganizadorID, that.OrganizadorID) && Objects.equals(avaliacao, that.avaliacao) && Objects.equals(EnderecoID, that.EnderecoID) && Objects.equals(EsporteID, that.EsporteID);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome_evento, Data_evento, vagas_disponiveis, Acessibilidade, FaixaEtariaMin, FaixaEtariaMax, Duracao, Horario, Descricao, MaxParticipantes, OrganizadorID, avaliacao, EnderecoID, EsporteID);
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

	public String getData_evento() {
		return Data_evento;
	}

	public void setData_evento(String data_evento) {
		Data_evento = data_evento;
	}

	public Time getVagas_disponiveis() {
		return vagas_disponiveis;
	}

	public void setVagas_disponiveis(Time vagas_disponiveis) {
		this.vagas_disponiveis = vagas_disponiveis;
	}

	public int getAcessibilidade() {
		return Acessibilidade;
	}

	public void setAcessibilidade(int acessibilidade) {
		Acessibilidade = acessibilidade;
	}

	public String getFaixaEtariaMin() {
		return FaixaEtariaMin;
	}

	public void setFaixaEtariaMin(String faixaEtariaMin) {
		FaixaEtariaMin = faixaEtariaMin;
	}

	public Date getFaixaEtariaMax() {
		return FaixaEtariaMax;
	}

	public void setFaixaEtariaMax(Date faixaEtariaMax) {
		FaixaEtariaMax = faixaEtariaMax;
	}

	public int getDuracao() {
		return Duracao;
	}

	public void setDuracao(int duracao) {
		Duracao = duracao;
	}

	public String getHorario() {
		return Horario;
	}

	public void setHorario(String horario) {
		Horario = horario;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public int getMaxParticipantes() {
		return MaxParticipantes;
	}

	public void setMaxParticipantes(int maxParticipantes) {
		MaxParticipantes = maxParticipantes;
	}

	public Time getOrganizadorID() {
		return OrganizadorID;
	}

	public void setOrganizadorID(Time organizadorID) {
		OrganizadorID = organizadorID;
	}

	public Time getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Time avaliacao) {
		this.avaliacao = avaliacao;
	}

	public String getEnderecoID() {
		return EnderecoID;
	}

	public void setEnderecoID(String enderecoID) {
		EnderecoID = enderecoID;
	}

	public String getEsporteID() {
		return EsporteID;
	}

	public void setEsporteID(String esporteID) {
		EsporteID = esporteID;
	}
}
