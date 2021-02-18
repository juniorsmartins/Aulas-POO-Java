package Projetos.Projeto9.ModelsPersonas;

public abstract class Fisica extends Pessoa
{
    public static int totalCadastrosFisica;
    
    private String nome;
    private String sobrenome;
    private String cpf;
    
    public static int getTotalCadastrosFisica()
    {
        return Fisica.totalCadastrosFisica;
    }
    protected static void setTotalCadastrosFisica()
    {
        Fisica.totalCadastrosFisica += 1;
    }
    
    protected String getNome()
    {
        return nome;
    }
    protected String getSobrenome()
    {
        return sobrenome;
    }
    protected String getCpf()
    {
        return cpf;
    }
    
    protected void setNome(String nom)
    {
        nome = nom;
    }
    protected void setSobrenome(String sobre)
    {
        sobrenome = sobre;
    }
    protected void setCpf(String doc)
    {
        cpf = doc;
    }
}