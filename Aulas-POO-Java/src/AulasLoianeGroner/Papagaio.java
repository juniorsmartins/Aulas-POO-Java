package AulasLoianeGroner;

public class Papagaio extends Ave
{
    /* ---------- ÁREA DE ATRIBUTOS --------- */
    // CONSTANTES
    // Atributos de Classe
    private static int totalPapagaios;
    // Atributos de Instância

    /* ---------- ÁREA DE MÉTODOS ---------- */
    // Método Construtor
    public Papagaio()
    {
        Papagaio.setTotalPapagaios();
    }
    
    // Métodos Especiais de Classe
    private static void setTotalPapagaios()
    {
        Papagaio.totalPapagaios += 1;
    }
    public static int getTotalPapagaios()
    {
        return Papagaio.totalPapagaios;
    }
    
    // Métodos Especiais de Instância
    @Override
    public void emitirSom()
    {
        System.out.println("Papagaio emite som");
    }

    @Override
    public void voar()
    {
        System.out.println("Papagaio voa");
    }
    // Métodos Getters e Setters
    
}