package AulasLoianeGroner;

public class Cavalo extends Mamifero
{
    /* ---------- ÁREA DE ATRIBUTOS --------- */
    // CONSTANTES
    // Atributos de Classe
    private static int totalCavalos;
    // Atributos de Instância

    /* ---------- ÁREA DE MÉTODOS ---------- */
    // Método Construtor
    public Cavalo()
    {
        Cavalo.setTotalCavalos();
    }
    // Métodos Especiais de Classe
    private static void setTotalCavalos()
    {
        Cavalo.totalCavalos += 1;
    }
    public static int getTotalCavalos()
    {
        return Cavalo.totalCavalos;
    }
    // Métodos Especiais de Instância
    @Override
    public void amamentar()
    {
        System.out.println("Cavalo amamenta");
    }
    @Override
    public void emitirSom()
    {
        System.out.println("Cavalo emite som");
    }
    @Override
    public void alimentar()
    {
        System.out.println("Cavalo alimentar");
    }
    @Override
    public void levarVeterinario()
    {
        System.out.println("Cavalo levar veterinario");
    }
    @Override
    public void chamarVeterinario()
    {
        System.out.println("Cavalo chamar veterinário");
    }
    // Métodos Getters e Setters
}