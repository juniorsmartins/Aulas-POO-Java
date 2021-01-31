package Treino.Model;

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
    private String nomeTorcedor;
    private int idadeTorcedor;
    private boolean statusTorcedor;
    private Plano sociedade;
    
    /* ---------- ÁREA DE MÉTODOS ---------- */
    // Métodos Construtores
    public Torcedor(String nome, int idade)
    {
        Torcedor.setTotalTorcedor();
        this.setDataCadastroTorcedor();
        this.setIdTorcedor();
        this.setNomeTorcedor(nome);
        this.setIdadeTorcedor(idade);
        this.ativaStatusTorcedor();
    }

    // Métodos Abstratos
    // Métodos Especiais de Classe

    // Métodos Especiais de Instância
    public void ativaStatusTorcedor()
    {
        this.setStatusTorcedor(true);
    }
    public void desativaStatusTorcedor()
    {
        this.setStatusTorcedor(false);
    }

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
    
    private void setNomeTorcedor(String nome)
    {
        this.nomeTorcedor = nome;
    }
    public String getNomeTorcedor()
    {
        return this.nomeTorcedor;
    }

    private void setIdadeTorcedor(int idade)
    {
        this.idadeTorcedor = idade;
    }
    public int getIdadeTorcedor()
    {
        return this.idadeTorcedor;
    }

    private void setStatusTorcedor(boolean status)
    {
        this.statusTorcedor = status;
    }
    public boolean getStatusTorcedor()
    {
        return this.statusTorcedor;
    }
    
    private void setSociedade(Plano plan)
    {
        this.sociedade = plan;
    }
    public Plano getSociedade()
    {
        return this.sociedade;
    }
}