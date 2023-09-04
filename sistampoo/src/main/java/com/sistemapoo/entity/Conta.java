package com.sistemapoo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Conta {
	@Id
	protected String numero;
	protected String usuario;
	protected double saldo;
	protected String agencia;
	
	public Conta() {
		super();
	}

	public Conta(String numero, String usuario, double saldo, String agencia) {
		super();
		this.numero = numero;
		this.usuario = usuario;
		this.saldo = saldo;
		this.agencia = agencia;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
}
