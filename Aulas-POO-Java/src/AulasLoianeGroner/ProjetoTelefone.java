package AulasLoianeGroner;

public class ProjetoTelefone 
{
    /* ---------- ÁREA DE ATRIBUTOS ---------- */
    // Atributos de Classe
    public static int totalTelefones;
    
    // Atributos de Instância
    private int fixoTelefone;
    private int celularTelefone;
    private int emailTelefone;

    /* ---------- ÁREA DE MÉTODOS ---------- */    
    // Método Construtor
    public ProjetoTelefone()
    {
        ProjetoTelefone.setTotalTelefones();
    }
    
    // Métodos Especiais de Classe
    private static void setTotalTelefones()
    {
        ProjetoTelefone.totalTelefones += 1;
    }
    public static int getTotalTelefones()
    {
        return ProjetoTelefone.totalTelefones;
    }

    // Métodos Especiais de Instância
    public void statusTelefone()
    {
        System.out.println("---------- Contato ----------");
        System.out.println("Telefone fixo: ");
        System.out.println("Telefone Celular: ");
        System.out.println("E-mail: ");
    }

    // Métodos Setters e Getters
    protected void setFixoTelefone(int telefone)
    {
        this.fixoTelefone = telefone;
    }
    public int getFixoTelefone()
    {
        return this.fixoTelefone;
    }
}
