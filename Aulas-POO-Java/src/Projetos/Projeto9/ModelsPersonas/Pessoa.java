package Projetos.Projeto9.ModelsPersonas;

public abstract class Pessoa 
{
    private int id;
    private String nacionalidade;
    
    protected int getId()
    {
        return id;
    }
    protected String getNacionalidade()
    {
        return nacionalidade;
    }

    protected void setId()
    {
        id += 1;
    }
    protected void setNacionalidade(String nacional)
    {
        nacionalidade = nacional;
    }
}