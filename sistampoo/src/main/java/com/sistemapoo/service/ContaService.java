package com.sistemapoo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemapoo.entity.Conta;
import com.sistemapoo.repository.ContaRepository;

import jakarta.annotation.PostConstruct;

@Service
public class ContaService {
	
	@Autowired
	ContaRepository contaRepository;
	
	@PostConstruct
	public void salvarConta() {
		Conta cc = new Conta("010101", "San", 10.0, "0100");
		contaRepository.save(cc);
	}
}
