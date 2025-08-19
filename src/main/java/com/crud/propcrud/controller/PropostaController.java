package com.crud.propcrud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.propcrud.model.Proposta;
import com.crud.propcrud.service.PropostaService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;





@RestController
@RequestMapping("/propostas")
public class PropostaController {
    @Autowired
    private PropostaService propostaService;

    @GetMapping("/todas")
    public List<Proposta> listarTodas() {
        return propostaService.listarPropostas();
    }

    @PostMapping
    public Proposta salvar(@RequestBody Proposta proposta) {
        return propostaService.salvar(proposta);
    }
    
    @GetMapping("/{id}")
    public Optional<Proposta> buscarId(@PathVariable Long id, Proposta proposta){
        return propostaService.buscaPorId(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        propostaService.deletar(id);
    }

    @PutMapping("/{id}")
    public Proposta atualizar(@PathVariable Long id, @RequestBody Proposta proposta){
        return propostaService.atualizar(id, proposta);
    }
    
}
