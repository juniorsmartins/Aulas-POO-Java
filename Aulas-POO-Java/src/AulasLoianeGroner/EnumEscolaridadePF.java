package AulasLoianeGroner;

public enum EnumEscolaridadePF 
{
    Doutorado("Doutorado"),
    Mestrado("Mestrado"),
    Especialista("Especialista"),
    Superior("Superior"),
    Técnico("Técnico"),
    Médio("Médio"),
    Fundamental("Fundamental");
    
    private String descricao;
    
    EnumEscolaridadePF(String descricao)
    {
        this.descricao = descricao;
    }

    public String getDescricao() { return this.descricao; }
}