package AulasLoianeGroner;

public enum EnumTipoCliente 
{

    PF("Pessoa Física"),
    PJ("Pessoa Jurídica");

    private String descricao;
    
    EnumTipoCliente(String descricao)
    {
        this.descricao = descricao;
    }
    
    public String getDescricao() { return this.descricao; }
}
