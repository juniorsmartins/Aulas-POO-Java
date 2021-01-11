package AulasLoianeGroner;

public abstract class Mamifero extends Animal
{
    /* ---------- ÁREA DE ATRIBUTOS --------- */
    // CONSTANTES
    // Atributos de Classe
    public static int totalMamiferos;
    
    // Atributos de Instância

    /* ---------- ÁREA DE MÉTODOS ---------- */
    // Método Construtor
    public Mamifero()
    {
        Mamifero.setTotalMamiferos();
    }            
    
    // Métodos Especiais de Classe
    private static void setTotalMamiferos()
    {
        Mamifero.totalMamiferos += 1;
    }
    public static int getTotalMamiferos()
    {
        return Mamifero.totalMamiferos;
    }

    // Métodos Especiais de Instância
    public abstract void amamentar();
    
    // Métodos Getters e Setters
}