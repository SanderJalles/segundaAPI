package com.sistemapoo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sistemapoo.entity.Conta;
import com.sistemapoo.service.ContaService;

@RestController
public class ContaController {
	
	@Autowired
	ContaService contaService;
	
	@PostMapping("/cadastrarConta")
	public void salvarConta(@RequestBody Conta conta) {
		contaService.salvarConta(conta);
	}
	
	@GetMapping("/listarContas")
	public List<Conta> listarContas(){
		List<Conta> contas = contaService.listarContas();
		return contas;
	}
	
	@GetMapping("/listarConta/{numero}")
	public Conta listarConta(@PathVariable String numero) {
		Conta conta = contaService.buscarConta(numero);
		return conta;
	}

}
