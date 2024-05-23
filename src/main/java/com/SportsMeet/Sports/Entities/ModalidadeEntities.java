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
    private String NomeModalidade;

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         ModalidadeEntities that = (ModalidadeEntities) o;
         return id == that.id && Objects.equals(NomeModalidade, that.NomeModalidade);
     }

     @Override
     public int hashCode() {
         return Objects.hash(id, NomeModalidade);
     }

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public String getNomeModalidade() {
         return NomeModalidade;
     }

     public void setNomeModalidade(String nomeModalidade) {
         NomeModalidade = nomeModalidade;
     }
 }
