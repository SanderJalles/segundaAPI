package com.sistemapoo.service;

import com.sistemapoo.entity.Pessoa;
import com.sistemapoo.repository.PessoaRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;

public class PessoaService {

    @Autowired
    PessoaRepository pessoaRepository;

    @PostConstruct
    public void salvarPessoa(){
        Pessoa cc = new Pessoa("14025432899", "san");
        pessoaRepository.save(cc);
    }
}
