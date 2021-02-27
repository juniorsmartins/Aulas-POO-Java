package Projetos.Projeto08_Evo.Models;

import java.util.Date;

public class Usuario 
{
    // ***** ÁREA DE ATRIBUTOS *****
    // Atributos de Classe
    public static long totalUsuario;
    
    // Atributos de Instância
    private long id;
    private String nome;
    private String sobrenome;
    private String cpf;
    private char sexo;
    private Date dataNascimento;
    private String login;
    private String senha;
    private String nivelAcesso;
    
    // ***** ÁREA DE CONSTRUTORES *****
    public Usuario(String nome, String sobre, String cpf)
    {
        Usuario.setTotalUsuario();
        this.setId();
        this.nome = nome;
        this.sobrenome = sobre;
        this.cpf = cpf;
    }
    
    // ***** ÁREA DE MÉTODOS *****
    // Métodos de Classe
    public static long getTotalUsuario()
    {
        return Usuario.totalUsuario;
    }
    public static void setTotalUsuario()
    {
        Usuario.totalUsuario += 1;
    }
    
    // Métodos Getters de Instância
    public long getId()
    {
        return this.id;
    }
    public String getNome()
    {
        return this.nome;
    }
    public String getSobrenome()
    {
        return this.sobrenome;
    }
    public String getCpf()
    {
        return this.cpf;
    }
    public char getSexo()
    {
        return this.sexo;
    }
    public Date getDataNascimento()
    {
        return this.dataNascimento;
    }
    public String getLogin()
    {
        return this.login;
    }
    public String getSenha()
    {
        return this.senha;
    }
    public String getNivelAcesso()
    {
        return this.nivelAcesso;
    }
    
    // Métodos Setters de Instância  
    public void setId()
    {
        this.id = Usuario.getTotalUsuario();
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public void setSobrenome(String sobre)
    {
        this.sobrenome = sobre;
    }
    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }
    public void setSexo(char sexo)
    {
        this.sexo = sexo;
    }
    public void setDataNascimento(Date data)
    {
        this.dataNascimento = data;
    }
    public void setLogin(String login)
    {
        this.login = login;
    }
    public void setSenha(String senha)
    {
        this.senha = senha;
    }
    public void setNivelAcesso(String acesso)
    {
        this.nivelAcesso = acesso;
    }
}