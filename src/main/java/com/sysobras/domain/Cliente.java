package com.sysobras.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_cliente;
	private String nome;
	private String telefone;
	private String email;
	private String endereco1;
	private String endereco2;
	private String endereco3;
	public long getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(long id_cliente) {
		this.id_cliente = id_cliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco1() {
		return endereco1;
	}
	public void setEndereco1(String endereco1) {
		this.endereco1 = endereco1;
	}
	public String getEndereco2() {
		return endereco2;
	}
	public void setEndereco2(String endereco2) {
		this.endereco2 = endereco2;
	}
	public String getEndereco3() {
		return endereco3;
	}
	public void setEndereco3(String endereco3) {
		this.endereco3 = endereco3;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id_cliente ^ (id_cliente >>> 32));
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
		Cliente other = (Cliente) obj;
		if (id_cliente != other.id_cliente)
			return false;
		return true;
	}
	
	
	

}
