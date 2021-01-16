/*
 * Exercício para aprendizagem de Java
 */
package ProjetoContaBancaria.Modelo;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * @author Junior Martins
 * @since 16/01/21 - 10h33
 */
public class PessoaJuridica extends Cliente
{
    /* ---------- ÁREA DE ATRIBUTOS ---------- */
    // Atributos de Classe
    private static int totalPessoaJuridica;

    // Atributos de Instância
    private String dataPessoaJuridica;
    private String idPessoaJuridica;

    /* ---------- ÁREA DE MÉTODOS ---------- */
    // Métodos Construtores
    public PessoaJuridica(String nome)
    {
        PessoaJuridica.setTotalPessoaJuridica();
        this.setDataPessoaJuridica();
        this.setIdPessoaJuridica();
        this.nomeCliente = nome;
    }
    
    // Métodos Especiais de Classe
    private static void setTotalPessoaJuridica()
    {
        PessoaJuridica.totalPessoaJuridica += 1;
    }
    public static int getTotalPessoaJuridica()
    {
        return PessoaJuridica.totalPessoaJuridica;
    }

    // Métodos Especiais de Instância
    
    // Métodos Setters e Getters
    private void setDataPessoaJuridica()
    {
        Date data = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("ddMMyyyy");
        this.dataPessoaJuridica = formatar.format(data);
    }
    public String getDataPessoaJuridica()
    {
        return this.dataPessoaJuridica;
    }

    private void setIdPessoaJuridica()
    {
        this.idPessoaJuridica = (this.getDataPessoaJuridica() + "-" + PessoaJuridica.getTotalPessoaJuridica());
    }
    private String getIdPessoaJuridica()
    {
        return this.idPessoaJuridica;
    }

    // Métodos de SuperClasse
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