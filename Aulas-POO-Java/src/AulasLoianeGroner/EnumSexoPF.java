package AulasLoianeGroner;

public enum EnumSexoPF 
{
    M("Masculino"),
    F("Feminino");
    
    private String descricao;
    
    EnumSexoPF(String descricao)
    {
        this.descricao = descricao;
    }

    public String getDescricao() { return this.descricao; }
}
