package Projetos.Projeto10_Evo2.Models;

public final class Contato 
{
    //*******************************
    //*****  ÁREA DE ATRIBUTOS  *****
    // Atributos de Classe
    // Atributos de Instância
    private int idContato;
    private long telefone;
    private String email;
    
    // Atributos Objetificados de Instância



    //*********************************
    //***** ÁREA DE CONSTRUTORES  *****
    // Construtor 1
    public Contato(long telefone, String mail)
    {
        //TODO
        this.setTelefone(telefone);
        this.setEmail(mail);
    }



    //****************************
    //***** ÁREA DE MÉTODOS  *****
    // Métodos de Classe
    // Métodos Getters de Instância
    public int getIdContato()
    {
        return idContato;
    }
    public long getTelefone()
    {
        return telefone;
    }
    public String getEmail()
    {
        return email;
    }

    // Métodos Setters de Instância
    public void setIdContato(int id)
    {
        this.idContato = id;
    }
    public void setTelefone(long tel)
    {
        this.telefone = tel;
    }
    public void setEmail(String mail)
    {
        this.email = mail;
    }

    // Métodos Polimórficos    

}