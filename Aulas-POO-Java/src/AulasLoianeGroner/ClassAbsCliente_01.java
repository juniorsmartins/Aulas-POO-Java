package AulasLoianeGroner;

import java.util.Date;
import java.text.SimpleDateFormat;

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
    private String tipoCliente;

    /* -------------- ÁREA DE MÉTODOS --------------- */
    // Métodos Construtores
    protected ClassAbsCliente_01()
    {
        ClassAbsCliente_01.setTotalClientes();
        this.setDataCliente();
        this.setIdCliente();
    }
    
    // Métodos Especiais de Classe
    protected static void setTotalClientes()
    {
        ClassAbsCliente_01.totalClientes += 1;        
    }
    public static long getTotalClientes()
    {
        return ClassAbsCliente_01.totalClientes;
    }

    // Métodos Especiais de Instância
    // Métodos Setters e Getters
    protected void setDataCliente()
    {
        Date data = new Date();
        SimpleDateFormat formatarData = new SimpleDateFormat("ddMMyyyy");
        this.dataCliente = formatarData.format(data);
    }
    protected void setIdCliente()
    {
        this.idCliente = (this.getDataCliente() + "-" + ClassAbsCliente_01.getTotalClientes());
    }
    protected String getDataCliente()
    {
        return this.dataCliente;
    }
    protected String getIdCliente()
    {
        return this.idCliente;
    }
    
    public void setPaisOrigemCliente(String pais)
    {
        this.paisOrigemCliente = pais;
    }
    public void setEstadoOrigemCliente(String estado)
    {
        this.estadoOrigemCliente = estado;
    }
    public void setCidadeOrigemCliente(String cidade)
    {
        this.cidadeOrigemCliente = cidade;
    }
    public void setTipoCliente(String tipo)
    {
        this.tipoCliente = tipo;
    }

    public String getPaisOrigemCliente()
    {
        return this.paisOrigemCliente;
    }
    public String getEstadoOrigemCliente()
    {
        return this.estadoOrigemCliente;
    }
    public String getCidadeOrigemCliente()
    {
        return this.cidadeOrigemCliente;
    }
    public String getTipoCliente()
    {
        return this.tipoCliente;
    }
}