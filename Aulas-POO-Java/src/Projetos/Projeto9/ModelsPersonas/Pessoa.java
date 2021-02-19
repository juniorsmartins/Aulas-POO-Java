package Projetos.Projeto9.ModelsPersonas;

public abstract class Pessoa 
{
    // Atributos de Classe
    public static int totalCadastrosPessoa;
    
    // Atributos de Instância
    private int id;
    private String paisOrigem;
    
    // Métodos Getters e Setters de Classe
    public static int getTotalCadastrosPessoa()
    {
        return Pessoa.totalCadastrosPessoa;
    }
    protected static void setTotalCadastrosPessoa()
    {
        Pessoa.totalCadastrosPessoa += 1;
    }
    
    // Métodos Getters de Instância
    protected int getId()
    {
        return this.id;
    }
    protected String getPaisOrigem()
    {
        return this.paisOrigem;
    }

    // Métodos Setters de Instância
    protected void setId()
    {
        this.id = Pessoa.getTotalCadastrosPessoa() + 1;
    }
    protected void setPaisOrigem(String pais)
    {
        this.paisOrigem = pais;
    }
}