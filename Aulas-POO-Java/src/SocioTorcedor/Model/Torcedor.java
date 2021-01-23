package SocioTorcedor.Model;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Torcedor 
{
    /* ---------- ÁREA DE ATRIBUTOS ---------- */
    // Atributos de Classe
    public static double totalTorcedor;
    
    // Atributos de Instância
    private String dataCadastroTorcedor;
    private String idTorcedor;
    
    /* ---------- ÁREA DE MÉTODOS ---------- */
    // Métodos Construtores
    public Torcedor()
    {
        Torcedor.setTotalTorcedor();
        this.setDataCadastroTorcedor();
        this.setIdTorcedor();

    }

    // Métodos Abstratos
    // Métodos Especiais de Classe

    // Métodos Especiais de Instância

    // Métodos Setters e Getters
    private static void setTotalTorcedor()
    {
        Torcedor.totalTorcedor += 1;
    }
    public static double getTotalTorcedor()
    {
        return Torcedor.totalTorcedor;
    }

    private void setDataCadastroTorcedor()
    {
        Date data = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("ddMMyyyy");
        this.dataCadastroTorcedor = formatar.format(data);
    }
    public String getDataCadastroTorcedor()
    {
        return this.dataCadastroTorcedor;
    }

    private void setIdTorcedor()
    {
        this.idTorcedor = (this.getDataCadastroTorcedor() + "-" + Torcedor.getTotalTorcedor());
    }
    public String getIdTorcedor()
    {
        return this.idTorcedor;
    }
}