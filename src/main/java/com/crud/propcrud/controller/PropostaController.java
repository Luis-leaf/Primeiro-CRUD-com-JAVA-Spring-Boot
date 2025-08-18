package com.crud.propcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.propcrud.model.Proposta;
import com.crud.propcrud.service.PropostaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    
    
}
