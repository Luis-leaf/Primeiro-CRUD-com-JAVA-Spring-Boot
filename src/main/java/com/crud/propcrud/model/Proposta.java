package com.crud.propcrud.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;

@Entity
public class Proposta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String cliente;
    private String local;
    private String servico;
    private int validade;
    private LocalDate data;
    private double valor;

    //construtores

    public Proposta(String cliente, String local, String servico, int validade, double valor){
        this.cliente = cliente;
        this.local = local;
        this.servico = servico;
        this.validade = validade;
        this.valor = valor;
        this.data = LocalDate.now();
    }

    public Proposta(){}
    
    //Para setar a data na criação
    @PrePersist
    protected void naCriacao(){
        if(this.data == null){
            this.data = LocalDate.now();
        }
    }
    
    // getters e setters

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
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

    public int getValidade(){
        return validade;
    }

    public void setValidade(int validade){
        this.validade = validade;
    }

    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public LocalDate getData(){
        return data;
    }

    public void setData(LocalDate data){
        this.data = LocalDate.now();
    }

}
