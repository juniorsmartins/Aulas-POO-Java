package AulasLoianeGroner;

public enum EnumPortePJ 
{
    Pequeno("Pequeno"), 
    Medio("Médio"),
    Grande("Grande");
    
    private String descricao;
    
    EnumPortePJ(String descricao)
    {
        this.descricao = descricao;
    }
    
    public String getPortePJ() { return this.descricao; }
}