package com.sistemapoo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sistemapoo.entity.Conta;
import com.sistemapoo.repository.ContaRepository;
import jakarta.annotation.PostConstruct;

@Service
public class ContaService {
	
	@Autowired
	ContaRepository contaRepository;
	
	public void salvarConta(Conta cc) {
		//Conta cc = new Conta("22132", "Helen", 1000.0, "001");
		contaRepository.save(cc);
	}
	
	public void buscarConta() {
	 Optional<Conta> c = contaRepository.findById("22132");
	 if (!c.isEmpty()) {
		 Conta conta = c.get();
		 System.out.println(conta.getSaldo());
		 
	 }
	}
	 
	 public void removerConta(Conta conta) {
		 contaRepository.delete(conta); 
	}
	 
	 public List<Conta> listarContas(){
		List<Conta> contas = contaRepository.findAll();
		return contas;
	 }
	 
	 public Conta buscarConta(String numero) {
		 Optional<Conta> conta = contaRepository.findById(numero);
		 if(conta.isPresent()) {
			 return conta.get();
		 }else {
			 return null;
		 }
	 }

}
