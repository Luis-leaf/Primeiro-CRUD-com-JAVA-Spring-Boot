package com.crud.propcrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.propcrud.model.Proposta;
import com.crud.propcrud.repository.PropostaRepository;

@Service
public class PropostaService {
    
    @Autowired
    private PropostaRepository propostaRepository;

    //metodos de CRUD

    public List<Proposta> listarPropostas(){
        return propostaRepository.findAll();
    }

    public Optional<Proposta> buscaPorId(Long id){
        return propostaRepository.findById(id);
    }

    public Proposta salvar(Proposta proposta){
        return propostaRepository.save(proposta);
    }

    public Proposta atualizar(Long id, Proposta proposta){
        if(propostaRepository.existsById(id)){
            return propostaRepository.save(proposta);
        } else {
            throw new RuntimeException("Proposta não encontrada");
        }
    }

    public void deletar(Long id){
        propostaRepository.deleteById(id);
    }

}
