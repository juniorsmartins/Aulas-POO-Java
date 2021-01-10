package AulasLoianeGroner;

public enum EnumTipoPJ 
{
    Empresa("Empresa"),
    Time("Time");
    
    private String descricao;
    
    EnumTipoPJ(String descricao)
    {
        this.descricao = descricao;
    }
    
    public String getTipoPJ() { return this.descricao; }
}