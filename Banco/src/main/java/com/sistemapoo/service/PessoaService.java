package com.sistemapoo.service;


import com.sistemapoo.entity.Pessoa;
import com.sistemapoo.repository.PessoaRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PessoaService {

    @Autowired
    PessoaRepository pessoaRepository;



    @PostConstruct
    public void salvarPessoa(Pessoa cc){
        pessoaRepository.save(cc);
    }

    public void buscarPessoa() {
        Optional<Pessoa> c = pessoaRepository.findById("22132");
        if (!c.isEmpty()) {
            Pessoa pessoa = c.get();
            System.out.println(pessoa.getNome());

        }
    }

    public void removerPessoa(Pessoa pessoa) {
        pessoaRepository.delete(pessoa);
    }


    public List<Pessoa> listarPessoas() {
        List<Pessoa> pessoas = pessoaRepository.findAll();
        return pessoas;
    }


    public Pessoa buscarPessoa(String nome) {
        Optional<Pessoa> pessoa = pessoaRepository.findById(nome);
        if(pessoa.isPresent()) return pessoa.get();
        else {
            return null;
        }
    }
}
