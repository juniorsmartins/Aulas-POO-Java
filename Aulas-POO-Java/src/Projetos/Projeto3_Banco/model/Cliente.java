package Projetos.Projeto3_Banco.model;

import Projetos.Projeto3_Banco.control.Utils;
import java.util.Date;

public class Cliente 
{
    private static int contador = 101;
    
    private int codigo;
    private String nome;
    private String email;
    private String cpf;
    private Date dataNascimento;
    private Date dataCadastro;

    // Método construtor
    public Cliente(String nome, String email, String cpf, Date dataNasc)
    {
        this.setCodigo(Cliente.contador);
        this.setNome(nome);
        this.setEmail(email);
        this.setCpf(cpf);
        this.setDataNascimento(dataNasc);
        this.setDataCadastro();
        Cliente.setContador();
    }
    
    // Métodos de Classe
    public static int getContador()
    {
        return Cliente.contador;
    }
    private static void setContador()
    {
        Cliente.contador += 1;
    }
    
    // Métodos de Superclasse
    @Override
    public String toString()
    {
        return ("Código: " + this.getCodigo() +
                "\nNome: " + this.getNome() +
                "\nCPF: " + this.getCpf() +
                "\nEmail: " + this.getEmail() +
                "\nData Nascimento: " + Utils.dateParaString(this.getDataNascimento()) +
                "\nData de Cadastro: " + Utils.dateParaString(this.getDataCadastro()));
    }
    
    // Métodos Getters
    public int getCodigo()
    {
        return this.codigo;
    }
    public String getNome()
    {
        return this.nome;
    }
    public String getEmail()
    {
        return this.email;
    }
    public String getCpf()
    {
        return this.cpf;
    }
    public Date getDataNascimento()
    {
        return this.dataNascimento;
    }
    public Date getDataCadastro()
    {
        return this.dataCadastro;
    }
    
    // Métodos Setters
    private void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }
    private void setNome(String nome)
    {
        this.nome = nome;
    }
    private void setEmail(String email)
    {
        this.email = email;
    }
    private void setCpf(String cpf)
    {
        this.cpf = cpf;
    }
    private void setDataNascimento(Date nascimento)
    {
        this.dataNascimento = nascimento;
    }
    private void setDataCadastro()
    {
        this.dataCadastro = new Date();
    }
}