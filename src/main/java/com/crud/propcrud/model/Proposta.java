package com.crud.propcrud.model;

// import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Proposta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String cliente;
    private String local;
    private String servico;
    // private LocalDate data;
    private double valor;

    //construtores

    public Proposta(String cliente, String local, String servico, double valor){
        this.cliente = cliente;
        this.local = local;
        this.servico = servico;
        this.valor = valor;
    }

    public Proposta(){}
    
    // getters e setters

    public Long getId(){
        return id;
    }

    public String getCliente(){
        return cliente;
    }

    public void setCliente(String cliente){
        this.cliente = cliente;
    }

    public String getLocal(){
        return local;
    }

    public void setLocal(String local){
        this.local = local;
    }

    public String getServico(){
        return servico;
    }

    public void setServico(String servico){
        this.servico = servico;
    }

    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

}
