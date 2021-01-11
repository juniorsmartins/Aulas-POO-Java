package AulasLoianeGroner;

public class Gato extends Mamifero
{
    /* ---------- ÁREA DE ATRIBUTOS --------- */
    // CONSTANTES
    // Atributos de Classe
    private static int totalGatos;
    // Atributos de Instância

    /* ---------- ÁREA DE MÉTODOS ---------- */
    // Método Construtor
    public Gato()
    {
        
    }
    // Métodos Especiais de Classe
    private static void setTotalGatos()
    {
        Gato.totalGatos += 1;
    }
    public static int getTotalGatos()
    {
        return Gato.totalGatos;
    }
    
    // Métodos Especiais de Instância
    @Override
    public void amamentar()
    {
        System.out.println("Gato amamenta");
    }
    @Override
    public void emitirSom()
    {
        System.out.println("Gato emite som");
    }
    @Override
    public void alimentar()
    {
        System.out.println("Gato alimenta");
    }
    @Override
    public void levarVeterinario()
    {
        System.out.println("Gato levar veterinário");
    }
    @Override
    public void chamarVeterinario()
    {
        System.out.println("Gato chamar veterinário");
    }
    @Override 
    public void brincar()
    {
        System.out.println("Gato brinca");
    }
    @Override
    public void levarPassear()
    {
        System.out.println("Gato levar passear");
    }
    // Métodos Getters e Setters    
}
