package Projetos.Projeto08_Evo.ModelsServico;

public abstract class Servico
{
    // ***** ÁREA DE ATRIBUTOS *****
    // Atributos de Classe
    public static int totalServicos;
    
    // Atributos de Instância
    private int id;
    

    // ***** ÁREA DE CONSTRUTORES *****

    
    // ***** ÁREA DE MÉTODOS *****
    // Métodos de Classe
    public static int getTotalServicos()
    {
        return Servico.totalServicos;
    }
    public static void setTotalServicos()
    {
        Servico.totalServicos += 1;
    }
    
    // Métodos Getters de Instância
    public int getId()
    {
        return this.id;
    }
    
    // Métodos Setters de Instância
    public void setId()
    {
        this.id = Servico.getTotalServicos();
    }
}