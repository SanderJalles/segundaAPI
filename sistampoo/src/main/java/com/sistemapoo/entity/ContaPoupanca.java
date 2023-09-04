package com.sistemapoo.entity;

import jakarta.persistence.Entity;

@Entity
public class ContaPoupanca extends Conta{
	private Double taxaRendiemento;
	public ContaPoupanca(String numero, String usuario, double saldo, String agencia) {
		super(numero, usuario, saldo, agencia);
		// TODO Auto-generated constructor stub
	}

}
