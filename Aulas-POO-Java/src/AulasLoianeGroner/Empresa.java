package AulasLoianeGroner;

public class Empresa extends ClassAbsPessoaJuridica_01
{
    /* -------------- ÁREA DE ATRIBUTOS --------------- */
    // Atributos de Classe
    protected static long totalEmpresas;

    // Atributos de Instância

    
    /* -------------- ÁREA DE MÉTODOS --------------- */
    // Métodos Construtores
    protected Empresa()
    {
        Empresa.totalEmpresas += 1;
    }

    // Métodos Especiais de Classe
    // Métodos Especiais de Instância
    // Métodos Setters e Getters
}