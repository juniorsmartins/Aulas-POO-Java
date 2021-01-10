package AulasLoianeGroner;

public class EnumSexoPF 
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
