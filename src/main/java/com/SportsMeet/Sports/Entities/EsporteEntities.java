package com.SportsMeet.Sports.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table (name = "Esporte")
public class EsporteEntities {

    @Id
    private int id;

    @Column (name = "NomeEsporte")
    private String NomeEsporte;

	@Column (name = "ModalidadeID")
	private String ModalidadeID;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		EsporteEntities that = (EsporteEntities) o;
		return id == that.id && Objects.equals(NomeEsporte, that.NomeEsporte) && Objects.equals(ModalidadeID, that.ModalidadeID);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, NomeEsporte, ModalidadeID);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeEsporte() {
		return NomeEsporte;
	}

	public void setNomeEsporte(String nomeEsporte) {
		NomeEsporte = nomeEsporte;
	}

	public String getModalidadeID() {
		return ModalidadeID;
	}

	public void setModalidadeID(String modalidadeID) {
		ModalidadeID = modalidadeID;
	}
}


