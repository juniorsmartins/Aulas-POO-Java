package AulasLoianeGroner;

import java.util.Date;
import java.text.SimpleDateFormat;

public class ProjetoContato {

    /* ---------- ÁREA DE ATRIBUTOS ---------- */
    // Atributos de Classe
    public static long totalContatos;
    
    // Atributos de Instância
    private String dataContato;
    private String idContato;
    private String nomeContato;
    private String sobrenomeContato;
    private String dataNascimentoContato;
    private String cpfContato;
    private String enderecoContato;
    private String telefoneContato;

    /* ---------- ÁREA DE MÉTODOS ---------- */
    // Método Construtor
    public ProjetoContato()
    {
        ProjetoContato.setTotalContatos();
        this.setDataContato();
        this.setIdContato();
        
    }

    // Métodos de Classe
    protected static void setTotalContatos()
    {
        ProjetoContato.totalContatos += 1;
    }
    public static long getTotalContatos()
    {
        return ProjetoContato.totalContatos;
    }
    
    // Métodos Especiais de Instância
    public void statusContato()
    {
        System.out.println("Total: ");
        System.out.println("Ano: ");
        System.out.println("ID: ");
        System.out.println("Nome: " + xxxx + " Sobrenome: " + xxxx);
    }

    // Métodos Setters e Getters
    protected void setDataContato()
    {
        Date data = new Date();
        SimpleDateFormat formatarData = new SimpleDateFormat("ddMMyyyy");
        this.dataContato = formatarData.format(data);
        this.setIdContato();
    }
    public String getDataContato()
    {
        return this.dataContato;
    }
    
    protected void setIdContato()
    {
        this.idContato = (this.getDataContato() + "-" + ProjetoContato.getTotalContatos());
    }
    public String getIdContato()
    {
        return this.idContato;
    }
    
}
