package Projetos.Projeto02_Mercado.model;

import Projetos.Projeto02_Mercado.control.Utils;

public class Produto 
{
    // Atributos de Classe
    private static int contador = 1;

    // Atributos de Instância
    private int codigo;
    private String nome;
    private Double preco;
    
    // Método Construtor
    public Produto(String nome, Double preco)
    {
        this.codigo = Produto.contador;
        this.setNome(nome);
        this.setPreco(preco);
        Produto.setContador();
    }

    // Métodos Especiais de Classe
    private static void setContador()
    {
        Produto.contador += 1;
    }
    
    // Métodos de Superclasses
    @Override
    public String toString()
    {
        return ("Código: " + this.getCodigo() + "\nNome: " + this.getNome() + "\nPreco: " + Utils.doubleParaString(this.getPreco()));
    }
    
    // Métodos Getters
    public String getNome()
    {
        return this.nome;
    }
    public Double getPreco()
    {
        return this.preco;
    }
    public int getCodigo()
    {
        return this.codigo;
    }
    
    // Métodos Setters
    private void setNome(String nome)
    {
        this.nome = nome;
    }
    private void setPreco(Double preco)
    {
        this.preco = preco;
    }
}