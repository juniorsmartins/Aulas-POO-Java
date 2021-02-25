package Projetos.Projeto07_PSTE.ModelsPersonas;

public abstract class Fisica extends Pessoa
{
    // Atributos de Classe
    public static int totalCadastrosFisica;
    
    // Atributos de Instância
    private String nome;
    private String sobrenome;
    private String cpf;
    
    // Métodos de Getters e Setters de Classe
    public static int getTotalCadastrosFisica()
    {
        return Fisica.totalCadastrosFisica;
    }
    protected static void setTotalCadastrosFisica()
    {
        Fisica.totalCadastrosFisica += 1;
    }
    
    // Métodos Getters de Instância
    protected String getNome()
    {
        return this.nome;
    }
    protected String getSobrenome()
    {
        return this.sobrenome;
    }
    protected String getCpf()
    {
        return this.cpf;
    }
    
    // Métodos Setters de Instância
    protected void setNome(String nome)
    {
        this.nome = nome;
    }
    protected void setSobrenome(String sobre)
    {
        this.sobrenome = sobre;
    }
    protected void setCpf(String cpf)
    {
        this.cpf = cpf;
    }
}