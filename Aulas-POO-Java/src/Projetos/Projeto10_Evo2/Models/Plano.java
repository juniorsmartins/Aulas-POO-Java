package Projetos.Projeto10_Evo2.Models;

import java.util.Date;

public final class Plano 
{
    //*******************************
    //*****  ÁREA DE ATRIBUTOS  *****
    // Atributos de Classe
    // Atributos de Instância
    // Atributos Objetificados de Instância
    private int idPlano;
    private String tipo;
    private String status;
    private String indicacao;
    private Date dataAssociacao;
    private Date dataRenovacao;
    private Date dataDesligamento;
    

    //*********************************
    //***** ÁREA DE CONSTRUTORES  *****
    // Construtor 1
    public Plano(String tipo, Date dataAssociacao)
    {
        //TODO
        
    }
    // Construtor 2 - Sobrecarga
    
    
    //****************************
    //***** ÁREA DE MÉTODOS  *****
    // Métodos de Classe
    // Métodos Getters de Instância
    public int getIdPlano()
    {
        return this.idPlano;
    }
    public String getTipo()
    {
        return this.tipo;
    }
    public String getStatus()
    {
        return this.status;
    }
    public String getIndicacao()
    {
        return this.indicacao;
    }
    public Date getDataAssociacao()
    {
        return this.dataAssociacao;
    }
    public Date getDataRenovacao()
    {
        return this.dataRenovacao;
    }
    public Date getDataDesligamento()
    {
        return this.dataDesligamento;
    }
    
    // Métodos Setters de Instância
    public void setIdPlano(int id)
    {
        this.idPlano = id;
    }
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }
    public void setIndicacao(String indicacao)
    {
        this.indicacao = indicacao;
    }
    public void setDataAssociacao(Date data)
    {
        this.dataAssociacao = data;
    }
    public void setDataRenovacao(Date data)
    {
        this.dataRenovacao = data;
    }
    public void setDataDesligamento(Date data)
    {
        this.dataDesligamento = data;
    }
    
    // Métodos Polimórficos     
}