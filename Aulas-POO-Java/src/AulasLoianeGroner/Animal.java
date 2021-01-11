package AulasLoianeGroner;

public abstract class Animal 
{
    /* ---------- ÁREA DE ATRIBUTOS --------- */
    // Constantes
    public static final String TIPO = "Animal";
    // Atributos de Classe
    public static int totalAnimais;
    // Atributos de Instância
    private String nome;

    /* ---------- ÁREA DE MÉTODOS ---------- */
    // Método Construtor
    public Animal()
    {
        Animal.setTotalAnimais();
    }

    // Métodos Especiais de Classe
    private static void setTotalAnimais()
    {
        Animal.totalAnimais += 1;
    }
    public static int getTotalAnimais()
    {
        return Animal.totalAnimais;
    }
    // Métodos Especiais de Instância
    public abstract String emitirSom();
    // Métodos Setters e Getters
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public String getNome()
    {
        return this.nome;
    }
}