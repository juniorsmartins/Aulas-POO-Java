package Projetos.Projeto10_Evo2.Models;

public final class Endereco 
{
    //*******************************
    //*****  ÁREA DE ATRIBUTOS  *****
    // Atributos de Classe
    // Atributos de Instância
    // Atributos Objetificados de Instância
    private int idEndereco;
    private String rua;
    private int numero;
    private String bairro;
    private String complemento;
    private String cidade;
    private String estado;
    private String pais;
    private long cep;
    

    //*********************************
    //***** ÁREA DE CONSTRUTORES  *****
    // Construtor 1
    public Endereco(String rua, int numero, String bairro, String cidade, String estado, String pais, long cep)
    {
        //TODO
        this.setRua(rua);
        this.setNumero(numero);
        this.setBairro(bairro);
        this.setCidade(cidade);
        this.setEstado(estado);
        this.setPais(pais);
        this.setCep(cep);
    }
    // Construtor 2 - Sobrecarga
    public Endereco(String rua, int numero, String bairro, String complemento, String cidade, String estado, String pais, long cep)
    {
        //TODO
        this.setRua(rua);
        this.setNumero(numero);
        this.setBairro(bairro);
        this.setComplemento(complemento);
        this.setCidade(cidade);
        this.setEstado(estado);
        this.setPais(pais);
        this.setCep(cep);
    }
    
    
    //****************************
    //***** ÁREA DE MÉTODOS  *****
    // Métodos de Classe
    // Métodos Getters de Instância
    public int getIdEndereco()
    {
        return idEndereco;
    }
    public String getRua()
    {
        return rua;
    }
    public int getNumero()
    {
        return numero;
    }
    public String getComplemento()
    {
        return complemento;
    }
    public String getBairro()
    {
        return bairro;
    }
    public String getCidade()
    {
        return cidade;
    }
    public String getEstado()
    {
        return estado;
    }
    public String getPais()
    {
        return pais;
    }
    public long getCep()
    {
        return cep;
    }

    // Métodos Setters de Instância
    public void setIdEndereco(int id)
    {
        this.idEndereco = id;
    }
    public void setRua(String rua)
    {
        this.rua = rua;
    }
    public void setNumero(int num)
    {
        this.numero = num;
    }
    public void setComplemento(String complemento)
    {
        this.complemento = complemento;
    }
    public void setBairro(String bairro)
    {
        this.bairro = bairro;
    }
    public void setCidade(String cidade)
    {
        this.cidade = cidade;
    }
    public void setEstado(String estado)
    {
        this.estado = estado;
    }
    public void setPais(String pais)
    {
        this.pais = pais;
    }
    public void setCep(long cep)
    {
        this.cep = cep;
    }

    // Métodos Polimórficos

}