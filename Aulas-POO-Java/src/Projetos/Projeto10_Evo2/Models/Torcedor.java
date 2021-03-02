package Projetos.Projeto10_Evo2.Models;

import java.util.Date;

public final class Torcedor extends Cliente
{
    //*******************************
    //*****  ÁREA DE ATRIBUTOS  *****
    // Atributos de Classe
    // Atributos de Instância
    // Atributos Objetificados de Instância

    

    //*********************************
    //***** ÁREA DE CONSTRUTORES  *****
    // Construtor 1
    public Torcedor(String nomen1, String nomen2, String doc)
    {
        //TODO
        this.setNomenclatura1(nomen1);
        this.setNomenclatura2(nomen2);
        this.setDocumento(doc);
    }
    // Construtor 2 - Sobrecarga
    public Torcedor(String nomen1, String nomen2, String doc, Date dataOrigem, char sex)
    {
        //TODO
        this.setNomenclatura1(nomen1);
        this.setNomenclatura2(nomen2);
        this.setDocumento(doc);
        this.setDataDeOrigem(dataOrigem);
        this.setSexo(sex);
    }
    // Construtor 3 - Sobrecarga
    public Torcedor(String nomen1, String nomen2, String doc, Date dataOrigem, char sex, Endereco endereco, Contato contato, Plano plano)
    {
        //TODO
        this.setNomenclatura1(nomen1);
        this.setNomenclatura2(nomen2);
        this.setDocumento(doc);
        this.setDataDeOrigem(dataOrigem);
        this.setSexo(sex);
        this.setEndereco(endereco);
        this.setContato(contato);
    }

    
    
    //****************************
    //***** ÁREA DE MÉTODOS  *****
    // Métodos de Classe
    // Métodos Getters de Instância
    // Métodos Setters de Instância
    // Métodos Polimórficos    
}