package Projetos.Projeto08_Evo.ModelsSistema;

public class Servico
{
    // ***** ÁREA DE ATRIBUTOS *****
    // Atributos de Classe
    public static int totalServicos = 0;
    
    // Atributos de Instância
    private int id = 0;
    private String descricao = " ";
    private float valor = 0;

    // ***** ÁREA DE CONSTRUTORES *****
    public Servico(int id, String descricao, float valor)
    {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }
    
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
    public String getDescricao()
    {
        return this.descricao;
    }
    public float getValor()
    {
        return this.valor;
    }
    
    // Métodos Setters de Instância
    public void setId()
    {
        this.id = Servico.getTotalServicos();
    }
    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }
    public void setValor(float valor)
    {
        this.valor = valor;
    }
}