package AulasLoianeGroner;

public enum EnumClasseSocialPF 
{
    A("A - De 21 ou mais salários mínimos."),
    B("B - De 11 a 20 salários mínimos"),
    C("C - De 5 a 10 salários mínimos"),
    D("D - De 2 a 4 salários mínimos"),
    E("E - Menos de 2 salários mínimos");

    private String descricao;

    EnumClasseSocialPF(String descricao)
    {
        this.descricao = descricao;
    }
    
    public String getDescricao() { return this.descricao; }
}
