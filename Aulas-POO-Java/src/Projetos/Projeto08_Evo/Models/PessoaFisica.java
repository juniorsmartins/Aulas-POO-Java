package Projetos.Projeto08_Evo.Models;

public abstract class PessoaFisica extends Cliente
{
    // ***** ÁREA DE ATRIBUTOS *****
    // Atributos de Classe
    public static long totalPessoaFisica;
    
    // Atributos de Instância
    private String sexo;
    
    // ***** ÁREA DE CONSTRUTORES *****
    
    // ***** ÁREA DE MÉTODOS *****
    // Métodos de Classe
    public static long getTotalPessoaFisica()
    {
        return PessoaFisica.totalPessoaFisica;
    }
    public static void setTotalPessoaFisica()
    {
        PessoaFisica.totalPessoaFisica += 1;
    }
    
    // Métodos Getters de Instância
    public String getSexo()
    {
        return this.sexo;
    }
    
    // Métodos Setters de Instância
    public void setSexo(String sexo)
    {
        this.sexo = sexo;
    }
}