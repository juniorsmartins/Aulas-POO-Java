package Projetos.Projeto10_Evo2.Models;

abstract public class Cliente 
{
    //*****  ÁREA DE ATRIBUTOS  *****
    // Atributos de Classe
    // Atributos de Instância
    private int idCliente;
    private String dataCadastro;
    private String nomenclatura1;
    private String nomenclatura2;
    private String documento;
    private String dataDeOrigem;
    
    //***** ÁREA DE CONSTRUTORES  *****
    // Construtor 1
    public Cliente()
    {
        //TODO
    }

    //***** ÁREA DE MÉTODOS  *****
    // Métodos de Classe
    // Métodos Getters de Instância
    public int getIdCliente()
    {
        return idCliente;
    }

    // Métodos Setters de Instância
    public void setIdCliente(int id)
    {
        this.idCliente = id;
    }
    
    // Métodos Polimórficos

}