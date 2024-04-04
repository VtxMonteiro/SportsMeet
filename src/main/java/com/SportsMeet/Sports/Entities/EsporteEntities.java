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
    @Column (name = "futebol")
    private String futebol;

    @Column (name = "volei")
    private String volei;

    @Column (name = "basquete")
    private String basquete;

    @Column (name = "xadrez")
    private String xadrez;

    @Column (name = "domino")
    private String domino;

    @Column (name = "sinuca")
    private String sinuca;

    @Column (name = "ciclismo")
    private String ciclismo;

    @Column (name = "futmesa")
    private String futmesa;

	@Override
	public int hashCode() {
		return Objects.hash(basquete, ciclismo, domino, futebol, futmesa, id, sinuca, volei, xadrez);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof EsporteEntities)) {
			return false;
		}
		EsporteEntities other = (EsporteEntities) obj;
		return Objects.equals(basquete, other.basquete) && Objects.equals(ciclismo, other.ciclismo)
				&& Objects.equals(domino, other.domino) && Objects.equals(futebol, other.futebol)
				&& Objects.equals(futmesa, other.futmesa) && id == other.id && Objects.equals(sinuca, other.sinuca)
				&& Objects.equals(volei, other.volei) && Objects.equals(xadrez, other.xadrez);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFutebol() {
		return futebol;
	}

	public void setFutebol(String futebol) {
		this.futebol = futebol;
	}

	public String getVolei() {
		return volei;
	}

	public void setVolei(String volei) {
		this.volei = volei;
	}

	public String getBasquete() {
		return basquete;
	}

	public void setBasquete(String basquete) {
		this.basquete = basquete;
	}

	public String getXadrez() {
		return xadrez;
	}

	public void setXadrez(String xadrez) {
		this.xadrez = xadrez;
	}

	public String getDomino() {
		return domino;
	}

	public void setDomino(String domino) {
		this.domino = domino;
	}

	public String getSinuca() {
		return sinuca;
	}

	public void setSinuca(String sinuca) {
		this.sinuca = sinuca;
	}

	public String getCiclismo() {
		return ciclismo;
	}

	public void setCiclismo(String ciclismo) {
		this.ciclismo = ciclismo;
	}

	public String getFutmesa() {
		return futmesa;
	}

	public void setFutmesa(String futmesa) {
		this.futmesa = futmesa;
	}

    

}


