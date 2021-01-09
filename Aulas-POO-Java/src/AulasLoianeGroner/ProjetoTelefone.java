package AulasLoianeGroner;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;

public class ProjetoTelefone 
{
    /* ---------- ÁREA DE ATRIBUTOS ---------- */
    // Atributos de Classe
    public static int totalTelefones;
    
    // Atributos de Instância
    private String dataTelefone;
    private String idTelefone;
    private int fixoTelefone;
    private int celularTelefone;
    private String emailTelefone;

    /* ---------- ÁREA DE MÉTODOS ---------- */    
    // Método Construtor
    public ProjetoTelefone()
    {
        ProjetoTelefone.setTotalTelefones();
        this.setDataTelefone();
        this.setIdTelefone();
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
        System.out.println("Total: " + ProjetoTelefone.getTotalTelefones());
        System.out.println("Data: " + this.getDataTelefone());
        System.out.println("ID: " + this.getIdTelefone());
        System.out.println("Telefone fixo: ");
        System.out.println("Telefone Celular: ");
        System.out.println("E-mail: ");
    }

    // Métodos Setters e Getters
    protected void setDataTelefone()
    {
        Date data = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("ddMMyyyy");
        this.dataTelefone = formatar.format(data);
    }
    public String getDataTelefone()
    {
        return this.dataTelefone;
    }
    
    protected void setIdTelefone()
    {
        this.idTelefone = (this.getDataTelefone() + "-" + ProjetoTelefone.getTotalTelefones());
    }
    public String getIdTelefone()
    {
        return this.idTelefone;
    }

    protected void setFixoTelefone(int fixo)
    {
        this.fixoTelefone = fixo;
    }
    public int getFixoTelefone()
    {
        return this.fixoTelefone;
    }
    
    protected void setCelularTelefone(int celular)
    {
        this.celularTelefone = celular;
    }
    public int getCelularTelefone()
    {
        return this.celularTelefone;
    }
    
    protected void setEmailTelefone(String email)
    {
        this.emailTelefone = email;
    }
    public String getEmailTelefone()
    {
        return this.emailTelefone;
    }
}
