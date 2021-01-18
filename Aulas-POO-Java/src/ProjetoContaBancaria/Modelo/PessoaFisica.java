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
    private static int totalPessoaFisica;

    // Atributos de Instância
    private String dataPessoaFisica;
    private String idPessoaFisica;
    private String cpf;

    /* ---------- ÁREA DE MÉTODOS ---------- */
    // Métodos Construtor
    public PessoaFisica(String nome)
    {
        PessoaFisica.setTotalPessoaFisica();
        this.setDataPessoaFisica();
        this.setIdPessoaFisica();
        this.setDenominacao(nome);
        
    }

    // Métodos Especiais de Classe
    public static int getTotalPessoaFisica()
    {
        return PessoaFisica.totalPessoaFisica;
    }
    private static void setTotalPessoaFisica()
    {
        PessoaFisica.totalPessoaFisica += 1;
    }

    // Métodos Especiais de Instância

    // Métodos Getters e Setters
    public String getDataPessoaFisica()
    {
        return this.dataPessoaFisica;
    }
    private void setDataPessoaFisica()
    {
        Date data = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("ddMMyyyy");
        this.dataPessoaFisica = formatar.format(data);
    }

    public String getIdPessoaFisica()
    {
        return this.idPessoaFisica;
    }
    private void setIdPessoaFisica()
    {
        this.idPessoaFisica = (this.getDataPessoaFisica() + "-" + PessoaFisica.getTotalPessoaFisica());
    }
    
    // Métodos de SuperClasse
    @Override
    public String getDenominacao()
    {
        return super.denominacao;
    }
    @Override
    public void setDenominacao(String nome)
    {
        super.denominacao = nome;
    }
}