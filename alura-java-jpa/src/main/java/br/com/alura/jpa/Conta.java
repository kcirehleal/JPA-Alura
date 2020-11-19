package br.com.alura.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Conta {
	
	@Id
	private long id;
	private Integer agencia;
	private Integer numero;
	private String titular;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Integer getAgencia() {
		return agencia;
	}
	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	
}
