package AulasLoianeGroner;

public enum EnumTipoPF 
{
    Atleta("Atleta"),
    Torcedor("Torcedor"),
    Colaborador("Colaborador");

    private String tipoPF;
    
    EnumTipoPF(String tipoPF)
    {
        this.tipoPF = tipoPF;
    }

    public String getTipoPF() { return this.tipoPF; }
}