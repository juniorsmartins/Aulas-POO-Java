package Projetos.Projeto08_Evo.Models;

public abstract class PessoaFisica extends Cliente
{
    // ***** ÁREA DE ATRIBUTOS *****
    // Atributos de Classe
    protected static long totalPessoaFisica;
    protected static long totalPessoaFisicaDel;
    
    // Atributos de Instância
    protected long idPessoaFisica;
    protected String sexo;
    
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
    public long getIdPessoaFisica()
    {
        return this.idPessoaFisica;
    }
    public String getSexo()
    {
        return this.sexo;
    }
    
    // Métodos Setters de Instância
    public void setIdPessoaFisica()
    {
        this.idPessoaFisica = PessoaFisica.getTotalCliente();
    }
    public void setSexo(String sexo)
    {
        this.sexo = sexo;
    }
}