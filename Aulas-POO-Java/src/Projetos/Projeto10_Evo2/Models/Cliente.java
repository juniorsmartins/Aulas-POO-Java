package Projetos.Projeto10_Evo2.Models;

import java.util.Date;

abstract public class Cliente 
{
    //*******************************
    //*****  ÁREA DE ATRIBUTOS  *****
    // Atributos de Classe
    // Atributos de Instância
    private int idCliente;
    private Date dataCadastro;
    private String nomenclatura1;
    private String nomenclatura2;
    private String documento;
    private String dataDeOrigem;
    private String sexo;
    
    // Atributos Objetificados de Instância
    private Endereco endereco;
    private Contato contato;
    private Plano plano;
    

    //*********************************
    //***** ÁREA DE CONSTRUTORES  *****
    // Construtor 1 - Classe Abstrata
    
    
    //****************************
    //***** ÁREA DE MÉTODOS  *****
    // Métodos de Classe
    // Métodos Getters de Instância
    public int getIdCliente()
    {
        return idCliente;
    }
    public Date getDataCadastro()
    {
        return dataCadastro;
    }
    public String getNomenclatura1()
    {
        return nomenclatura1;
    }
    public String getNomenclatura2()
    {
        return nomenclatura2;
    }
    public String getDocumento()
    {
        return documento;
    }
    public String getDataDeOrigem()
    {
        return dataDeOrigem;
    }
    public String getSexo()
    {
        return sexo;
    }

    // Métodos Setters de Instância
    public void setIdCliente(int id)
    {
        this.idCliente = id;
    }
    public void setDataCadastro(Date data)
    {
        this.dataCadastro = data;
    }
    public void setNomenclatura1(String nomen1)
    {
        this.nomenclatura1 = nomen1;
    }
    public void setNomenclatura2(String nomen2)
    {
        this.nomenclatura2 = nomen2;
    }
    public void setDocumento(String doc)
    {
        this.documento = doc;
    }
    public void setDataDeOrigem(String data)
    {
        this.dataDeOrigem = data;
    }
    public void setSexo(String sex)
    {
        this.sexo = sex;
    }
    
    // Métodos Polimórficos
    
    // Métodos de Composição
    public Endereco getEndereco()
    {
        return endereco;
    }
    public Contato getContato()
    {
        return contato;
    }
    public Plano getPlano()
    {
        return plano;
    }
    
    public void setEndereco(Endereco endereco)
    {
        this.endereco = endereco;
    }
    public void setContato(Contato contato)
    {
        this.contato = contato;
    }
    public void setPlano(Plano plano)
    {
        this.plano = plano;
    }

}