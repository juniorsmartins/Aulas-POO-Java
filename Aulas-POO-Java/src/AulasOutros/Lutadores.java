package AulasOutros;

public class Lutadores{

    /* ----- ÁREA DE ATRIBUTOS ----- */
    // Atributos de Classe
    private static double totalLutadores;
    
    // Atributos de Instância
    private String dataCadastroLutador;
    private String horaCadastroLutador;
    private double idLutador;
    
    /* ----- ÁREA DE MÉTODOS ----- */
    // Método Construtor
    public Lutadores()
    {
        setTotalLutadores();
    }
    
    // Métodos de Classe
    public static void setTotalLutadores()
    {
        Lutadores.totalLutadores += 1;
    }

    // Métodos de Instância - Comportamentais

    // Métodos de Instância - Setters e Getters
    

}
