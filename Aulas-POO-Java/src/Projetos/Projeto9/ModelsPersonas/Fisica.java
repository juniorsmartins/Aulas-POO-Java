package Projetos.Projeto9.ModelsPersonas;

public abstract class Fisica extends Pessoa
{
    private String nome;
    private String sobrenome;
    private String cpf;
    
    public String getNome()
    {
        return nome;
    }
    public String getSobrenome()
    {
        return sobrenome;
    }
    public String getCpf()
    {
        return cpf;
    }
    
    public void setNome(String nom)
    {
        nome = nom;
    }
    public void setSobrenome(String sobre)
    {
        sobrenome = sobre;
    }
    public void setCpf(String doc)
    {
        cpf = doc;
    }
}