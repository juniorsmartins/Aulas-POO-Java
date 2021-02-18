package Projetos.Projeto9.ModelsPersonas;

public abstract class Fisica extends Pessoa
{
    private String nome;
    private String sobrenome;
    private String cpf;
    
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