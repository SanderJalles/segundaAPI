package com.sistemapoo.entity;

import jakarta.persistence.Entity;

@Entity
public class ContaCorrente extends Conta{
	private Double taxaAdm;
	
	public ContaCorrente(String numero, String usuario, double saldo, String agencia) {
		super(numero, usuario, saldo, agencia);
	}

}
