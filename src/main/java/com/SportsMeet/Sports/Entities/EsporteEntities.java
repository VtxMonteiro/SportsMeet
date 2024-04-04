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

    @Column (name = "bicicleta")
    private String bicicleta;

    @Column (name = "futmesa")
    private String futmesa;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EsporteEntities that)) return false;
        return id == that.id && Objects.equals(futebol, that.futebol) && Objects.equals(volei, that.volei) && Objects.equals(basquete, that.basquete) && Objects.equals(xadrez, that.xadrez) && Objects.equals(domino, that.domino) && Objects.equals(sinuca, that.sinuca) && Objects.equals(bicicleta, that.bicicleta) && Objects.equals(futmesa, that.futmesa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, futebol, volei, basquete, xadrez, domino, sinuca, bicicleta, futmesa);
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

    public String getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(String bicicleta) {
        this.bicicleta = bicicleta;
    }

    public String getFutmesa() {
        return futmesa;
    }

    public void setFutmesa(String futmesa) {
        this.futmesa = futmesa;
    }

}


