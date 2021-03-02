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
    private boolean status = false;
    private String indicacao = "";
    private float valorMensal = 0;
    private Date dataAssociacao;
    private Date dataRenovacao;
    private Date dataDesligamento;
    

    //*********************************
    //***** ÁREA DE CONSTRUTORES  *****
    // Construtor 1
    public Plano(String tipo, Date dataAssociacao)
    {
        //TODO
        this.setTipo(tipo);
        this.setStatus();
        this.setDataAssociacao(dataAssociacao);
        
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
    public boolean getStatus()
    {
        return this.status;
    }
    public String getIndicacao()
    {
        return this.indicacao;
    }
    public float getValorMensal()
    {
        return this.valorMensal;
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
        switch(tipo)
        {
            case "Play Easy":
                this.tipo = "Play Easy";
                this.setValorMensal(14.00F);
                break;
            case "Play Normal":
                this.tipo = "Play Normal";
                this.setValorMensal(20.00F);
                break;
            case "Play Hard":
                this.tipo = "Play Hard";
                this.setValorMensal(30.00F);
                break;
            case "Play Insane":
                this.tipo = "Play Insane";
                this.setValorMensal(150.00F);
                break;
        }
    }
    public void setStatus() //Inversor de status - O método é chamado para inverter status
    {
        if(this.getStatus() == false)
        {
            this.status = true;
        }
        else if (this.getStatus() == true)
        {
            this.status = false;            
        }
    }
    public void setIndicacao(String indicacao)
    {
        this.indicacao = indicacao;
    }
    public void setValorMensal(float valor)
    {
        this.valorMensal = valor;
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