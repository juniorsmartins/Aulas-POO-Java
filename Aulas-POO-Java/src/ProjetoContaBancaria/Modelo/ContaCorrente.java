/*
 * Exercício para aprendizagem de Java
 */
package ProjetoContaBancaria.Modelo;

import ProjetoContaBancaria.Controller.InterfaceContas;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * @author Junior Martins
 * @since 16/01/21 - 09h00
 */
public class ContaCorrente implements InterfaceContas
{
    /* --------- ÁREA DE ATRIBUTOS ---------- */
    // Atributos de Classe
    private static int totalConta;
    
    // Atributos de Instância
    private String dataConta;
    private String idConta;
    private double saldoConta;
    private PessoaFisica cidadao;
    private PessoaJuridica empresa;

    /* ---------- ÁREA DE MÉTODOS ---------- */
    // Métodos Construtores
    public ContaCorrente(PessoaFisica dono)
    {
        ContaCorrente.setTotalConta();
        this.setDataConta();
        this.setIdConta();
        this.setSaldoConta(0);
        this.setCidadao(dono);
    }
    public ContaCorrente(PessoaJuridica dono)
    {
        ContaCorrente.setTotalConta();
        this.setDataConta();
        this.setIdConta();
        this.setSaldoConta(0);
        this.setEmpresa(dono);
    }

    // Métodos Especiais de Classe
    private static void setTotalConta()
    {
        ContaCorrente.totalConta += 1;
    }
    public static int getTotalConta()
    {
        return ContaCorrente.totalConta;
    }

    // Métodos Especiais de Instância
    @Override
    public void depositarConta(double valor)
    {
        this.setSaldoConta(valor);
        System.out.println("Depósito efetuado com sucesso!");
    }
    @Override
    public void sacarConta(double valor)
    {
        if (valor > this.getSaldoConta())
        {
            this.saldoConta -= valor;
        }
        else
        {
            System.out.println("Saldo Insuficiente!");
        }
    }

    // Métodos Setters e Getters
    private void setDataConta()
    {
        Date data = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("ddMMyyyy");
        this.dataConta = formatar.format(data);
    }
    public String getDataConta()
    {
        return this.dataConta;
    }
    
    private void setIdConta()
    {
        this.idConta = (this.getDataConta() + "-" + ContaCorrente.getTotalConta());
    }
    public String getIdConta()
    {
        return this.idConta;
    }
    
    private void setSaldoConta(double valor)
    {
        this.saldoConta += valor;
    }
    public double getSaldoConta()
    {
        return this.saldoConta;
    }
    
    public void setCidadao(PessoaFisica pf)
    {
        this.cidadao = pf;
    }
    public PessoaFisica getCidadao()
    {
        return this.cidadao;
    }

    public void setEmpresa(PessoaJuridica pj)
    {
        this.empresa = pj;
    }
    public PessoaJuridica getEmpresa()
    {
        return this.empresa;
    }
}