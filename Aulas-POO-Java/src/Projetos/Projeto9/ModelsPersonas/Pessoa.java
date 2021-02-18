package Projetos.Projeto9.ModelsPersonas;

public abstract class Pessoa 
{
    public static int totalCadastrosPessoa;
    
    private int id;
    private String nacionalidade;
    
    public static int getTotalCadastrosPessoa()
    {
        return Pessoa.totalCadastrosPessoa;
    }
    protected static void setTotalCadastrosPessoa()
    {
        Pessoa.totalCadastrosPessoa += 1;
    }
    
    protected int getId()
    {
        return this.id;
    }
    protected String getNacionalidade()
    {
        return this.nacionalidade;
    }

    protected void setId()
    {
        this.id = Pessoa.getTotalCadastrosPessoa() + 1;
    }
    protected void setNacionalidade(String nacional)
    {
        this.nacionalidade = nacional;
    }
}