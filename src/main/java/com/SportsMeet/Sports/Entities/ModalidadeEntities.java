package com.SportsMeet.Sports.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "Modalidade")
public class ModalidadeEntities {
    @Id
    private int id;

    @Column
    private String quadra;

    @Column
    private String campos;

    @Column
    private String areia;

    @Column
    private String campo_sintetico;

    @Column
    private String salao;

    @Column
    private String rua;

    @Column
    private String outros;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ModalidadeEntities that)) return false;
        return id == that.id && Objects.equals(quadra, that.quadra) && Objects.equals(campos, that.campos) && Objects.equals(areia, that.areia) && Objects.equals(campo_sintetico, that.campo_sintetico) && Objects.equals(salao, that.salao) && Objects.equals(rua, that.rua) && Objects.equals(outros, that.outros);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quadra, campos, areia, campo_sintetico, salao, rua, outros);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuadra() {
        return quadra;
    }

    public void setQuadra(String quadra) {
        this.quadra = quadra;
    }

    public String getCampos() {
        return campos;
    }

    public void setCampos(String campos) {
        this.campos = campos;
    }

    public String getAreia() {
        return areia;
    }

    public void setAreia(String areia) {
        this.areia = areia;
    }

    public String getCampo_sintetico() {
        return campo_sintetico;
    }

    public void setCampo_sintetico(String campo_sintetico) {
        this.campo_sintetico = campo_sintetico;
    }

    public String getSalao() {
        return salao;
    }

    public void setSalao(String salao) {
        this.salao = salao;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getOutros() {
        return outros;
    }

    public void setOutros(String outros) {
        this.outros = outros;
    }
}
