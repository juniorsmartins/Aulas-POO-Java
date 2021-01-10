package AulasLoianeGroner;

public abstract class ClassAbsCliente_01 
{
    /* -------------- ÁREA DE ATRIBUTOS --------------- */
    // Atributos de Classe
    private static long totalClientes;

    // Atributos de Instância
    private String dataCliente;
    private String idCliente;
    private String paisOrigemCliente;
    private String estadoOrigemCliente;
    private String cidadeOrigemCliente;
    private EnumTipoCliente tipoCliente;

    /* -------------- ÁREA DE MÉTODOS --------------- */
    // Métodos Construtores
    protected ClassAbsCliente_01()
    {
        ClassAbsCliente_01.totalClientes += 1;
    }
    
    // Métodos Especiais de Classe
    // Métodos Especiais de Instância
    // Métodos Setters e Getters
    public abstract void setDataCliente();
    public abstract void setIdCliente();
    public abstract void setPaisOrigemCliente(String pais);
    public abstract void setEstadoOrigemCliente(String estado);
    public abstract void setCidadeOrigemCliente(String cidade);
    public abstract void setTipoCliente(EnumTipoCliente tipo);
    public abstract String getDataCliente();
    public abstract String getIdCliente();
    public abstract String getPaisOrigemCliente();
    public abstract String getEstadoOrigemCliente();
    public abstract String getCidadeOrigemCliente();
    public abstract EnumTipoCliente getTipoCliente();
}