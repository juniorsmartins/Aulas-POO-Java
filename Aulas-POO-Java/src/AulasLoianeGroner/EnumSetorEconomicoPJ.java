package AulasLoianeGroner;

public enum EnumSetorEconomicoPJ 
{
    Agronegocio("Agronegócio"),
    Extrativismo("Extrativismo"),
    Industria("Indústria"),
    ConstruçãoCivil("Construção Civil"),
    Comercio("Comércio"),
    Servicos("Serviços");
    
    private String descricao;
    
    EnumSetorEconomicoPJ(String descricao)
    {
        this.descricao = descricao;
    }

    public String getSetorEconomicoPJ() { return this.descricao; }
}
