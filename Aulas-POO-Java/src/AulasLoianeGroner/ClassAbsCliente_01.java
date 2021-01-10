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
    private String tipoCliente;

    /* -------------- ÁREA DE MÉTODOS --------------- */
    // Métodos Construtores
    public ClassAbsCliente_01()
    {
        ClassAbsCliente_01.setTotalClientes();
    }
    
    // Métodos Especiais de Classe
    private static void setTotalClientes()
    {
        ClassAbsCliente_01.totalClientes += 1;
    }

    // Métodos Especiais de Instância
    // Métodos Setters e Getters
}