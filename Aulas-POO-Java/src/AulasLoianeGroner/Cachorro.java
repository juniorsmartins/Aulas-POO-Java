package AulasLoianeGroner;

public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao
{
    /* ---------- ÁREA DE ATRIBUTOS --------- */
    // CONSTANTES
    // Atributos de Classe
    private static int totalCachorros;
    
    // Atributos de Instância
    private String racaCachorro;
    private String tamanho;

    /* ---------- ÁREA DE MÉTODOS ---------- */
    // Método Construtor
    public Cachorro()
    {
        Cachorro.setTotalCachorros();
    }
    
    // Métodos Especiais de Classe
    private static void setTotalCachorros()
    {
        Cachorro.totalCachorros += 1;
    }
    public static int getTotalCachorros()
    {
        return Cachorro.totalCachorros;
    }
    
    // Métodos Especiais de Instância
    @Override
    public void amamentar()
    {
        System.out.println("Cachorro amamenta");
    }
    @Override
    public void emitirSom()
    {
        System.out.println("Cachorro emite som");
    }
    @Override
    public void alimentar()
    {
        System.out.println("Cachorro alimentar");
    }
    @Override
    public void levarVeterinario()
    {
        System.out.println("Cachorro levar veterinário");
    }
    @Override
    public void chamarVeterinario()
    {
        System.out.println("Cachorro chamar veterinário");
    }
    @Override
    public void brincar()
    {
        System.out.println("Cachorro brincar");
    }
    @Override
    public void levarPassear()
    {
        System.out.println("Cachorro levar passear");
    }
    
    // Métodos Getters e Setters
    public String getRacaCachorro() {
        return racaCachorro;
    }
    public String getTamanho() {
        return tamanho;
    }

    public void setRacaCachorro(String raca) {
        this.racaCachorro = raca;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}