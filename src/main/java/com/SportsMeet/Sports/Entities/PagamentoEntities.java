package com.SportsMeet.Sports.Entities;


import java.sql.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Pagamento")

public class PagamentoEntities {
	
	@Id 
	private int id;
	
	@Column(name = "valor")
	private Double valor;
	
	@Column(name = "data_pagamento")
	private Date data_pagamento;
	
	@Column(name = "metodo_pagamento")
	private String metodo_pagamento;
	
	@Column(name = "status_pagamento")
	private String status_pagamento;
	

	@Override
	public int hashCode() {
		return Objects.hash(data_pagamento, id, metodo_pagamento, status_pagamento, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof PagamentoEntities)) {
			return false;
		}
		PagamentoEntities other = (PagamentoEntities) obj;
		return Objects.equals(data_pagamento, other.data_pagamento) && id == other.id
				&& Objects.equals(metodo_pagamento, other.metodo_pagamento)
				&& Objects.equals(status_pagamento, other.status_pagamento) && Objects.equals(valor, other.valor);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Date getData_pagamento() {
		return data_pagamento;
	}

	public void setData_pagamento(Date data_pagamento) {
		this.data_pagamento = data_pagamento;
	}

	public String getMetodo_pagamento() {
		return metodo_pagamento;
	}

	public void setMetodo_pagamento(String metodo_pagamento) {
		this.metodo_pagamento = metodo_pagamento;
	}

	public String getStatus_pagamento() {
		return status_pagamento;
	}

	public void setStatus_pagamento(String status_pagamento) {
		this.status_pagamento = status_pagamento;
	}
	
	

}
