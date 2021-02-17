package Projetos.Projeto9.ModelsPersonas;

public abstract class Pessoa 
{
    private int id;
    private String nacionalidade;
    
    public Pessoa()
    {
        setId();
    }
    
    public int getId()
    {
        return id;
    }
    public String getNacionalidade()
    {
        return nacionalidade;
    }

    private void setId()
    {
        id += 1;
    }
    public void setNacionalidade(String nacional)
    {
        nacionalidade = nacional;
    }
}