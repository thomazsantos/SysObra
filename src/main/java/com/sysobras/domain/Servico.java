package com.sysobras.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Servico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_servico;
	private String descricao;
	private BigDecimal valor;
	public long getId_servico() {
		return id_servico;
	}
	public void setId_servico(long id_servico) {
		this.id_servico = id_servico;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id_servico ^ (id_servico >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Servico other = (Servico) obj;
		if (id_servico != other.id_servico)
			return false;
		return true;
	}
	
	
	

}
