package Projetos.Projeto10_Evo2.Models;

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
    public Torcedor(String nomen1, String nomen2, String doc, String dataOrigem, String sex)
    {
        //TODO
        this.setNomenclatura1(nomen1);
        this.setNomenclatura2(nomen2);
        this.setDocumento(doc);
        this.setDataDeOrigem(dataOrigem);
        this.setSexo(sex);
    }

    
    
    //****************************
    //***** ÁREA DE MÉTODOS  *****
    // Métodos de Classe
    // Métodos Getters de Instância
    // Métodos Setters de Instância
    // Métodos Polimórficos    
}