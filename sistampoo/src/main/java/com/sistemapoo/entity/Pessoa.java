package com.sistemapoo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pessoa {
    @Id
    protected String cpf;
    protected String nome;

    public Pessoa() {
    }

    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
