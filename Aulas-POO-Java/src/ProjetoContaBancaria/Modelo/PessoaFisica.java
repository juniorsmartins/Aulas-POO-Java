/*
 * Exercício para aprendizagem de Java
 */
package ProjetoContaBancaria.Modelo;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * @author Junior Martins
 * @since 16/01/21 - 08h34
 */
public class PessoaFisica extends Cliente
{
    /* ---------- ÁREA DE ATRIBUTOS ---------- */
    // Atributos de Classe
    private static int totalCliente;
    
    // Atributos de Instância
    private String dataCliente;
    private String idCliente;

    /* ---------- ÁREA DE MÉTODOS ---------- */
    // Métodos Construtor
    public PessoaFisica() {}
    public PessoaFisica(String nome)
    {
        PessoaFisica.setTotalCliente();
        this.setDataCliente();
        this.setIdCliente();
        super.nomeCliente = nome;
    }

    // Métodos Especiais de Classe
    public static int getTotalCliente()
    {
        return PessoaFisica.totalCliente;
    }
    private static void setTotalCliente()
    {
        PessoaFisica.totalCliente += 1;
    }

    // Métodos Especiais de Instância

    // Métodos Getters e Setters
    public String getDataCliente()
    {
        return this.dataCliente;
    }
    private void setDataCliente()
    {
        Date data = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("ddMMyyyy");
        this.dataCliente = formatar.format(data);
    }

    public String getIdCliente()
    {
        return this.idCliente;
    }
    private void setIdCliente()
    {
        this.idCliente = (this.getDataCliente() + "-" + PessoaFisica.getTotalCliente());
    }

    // Métodos de SuperClasse
    @Override
    public String getNomeCliente()
    {
        return super.nomeCliente;
    }
    @Override
    public void setNomeCliente(String nome)
    {
        super.nomeCliente = nome;
    }

    @Override
    public boolean getStatusCliente()
    {
        return super.statusCliente;
    }
    @Override
    protected void setStatusCliente(boolean status)
    {
        super.statusCliente = status;
    }

    @Override 
    public void ativarCliente()
    {
        this.setStatusCliente(true);
        
    }
    @Override
    public void desativarCliente()
    {
        this.setStatusCliente(false);
    }
}