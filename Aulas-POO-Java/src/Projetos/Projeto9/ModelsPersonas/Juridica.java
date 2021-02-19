package Projetos.Projeto9.ModelsPersonas;

public class Juridica extends Pessoa
{
    // Atributos de Classe
    public static int totalCadastrosJuridica;
    
    // Atributos de Instância
    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;
    
    // Métodos Getters e Setters de Classe
    public static int getTotalCadastrosJuridica()
    {
        return Juridica.totalCadastrosJuridica;
    }
    protected static void setTotalCadastrosJuridica()
    {
        Juridica.totalCadastrosJuridica += 1;
    }
    
    // Métodos Getters de Instância
    protected String getRazaoSocial()
    {
        return this.razaoSocial;
    }
    protected String getNomeFantasia()
    {
        return this.nomeFantasia;
    }
    protected String getCnpj()
    {
        return this.cnpj;
    }
    
    // Métodos Setters de Instância
    protected void setRazaoSocial(String razao)
    {
        this.razaoSocial = razao;
    }
    protected void setNomeFantasia(String nome)
    {
        this.nomeFantasia = nome;
    }
    protected void setCnpj(String cnpj)
    {
        this.cnpj = cnpj;
    }
}