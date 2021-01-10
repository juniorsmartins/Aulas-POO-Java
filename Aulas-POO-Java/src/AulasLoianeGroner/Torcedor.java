package AulasLoianeGroner;

public class Torcedor extends ClassAbsPessoaFisica_01 
{
    /* -------------- ÁREA DE ATRIBUTOS --------------- */
    // Atributos de Classe
    protected static long totalTorcedores;

    // Atributos de Instância

    
    /* -------------- ÁREA DE MÉTODOS --------------- */
    // Métodos Construtores
    protected Torcedor()
    {
        Torcedor.totalTorcedores += 1;
    }

    // Métodos Especiais de Classe
    // Métodos Especiais de Instância
    // Métodos Setters e Getters    
}
