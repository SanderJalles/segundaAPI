package com.sistemapoo.controllers;

import com.sistemapoo.entity.Conta;
import com.sistemapoo.entity.Pessoa;
import com.sistemapoo.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PessoaController {

    @Autowired
    PessoaService pessoaService;

    @PostMapping("/cadastrarPessoa")
    public void salvarPessoa(@RequestBody Pessoa pessoa) {pessoaService.salvarPessoa(pessoa);}

    @GetMapping("/listarPessoas")
    public List<Pessoa> listarPessoas() {
        PessoaService pessoaService = new PessoaService(); // Criei uma instancia pra resolver o bo
        List<Pessoa> pessoas = pessoaService.listarPessoas(); // Chamei o metodo logo em seguida
        return pessoas;
    }

    @GetMapping("/listarPessoa/{nome}")
    public Pessoa listarPessoa(@PathVariable String nome) {
        Pessoa pessoa = pessoaService.buscarPessoa(nome);
        return pessoa;
    }


}
