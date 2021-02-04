/*
 * Exercício para aprendizagem de Java
 */
package Projetos.Projeto5.Modelo;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * @author Junior Martins
 * @since 16/01/21 - 09h00
 */
public class ContaCorrente extends Conta
{
    /* --------- ÁREA DE ATRIBUTOS ---------- */
    // Atributos de Classe
    private static int numContas;
    
    // Atributos de Instância
    private String dataConta;
    private String idConta;
    private double saldoConta;
    private Cliente donoConta;
    private boolean statusConta;

    /* ---------- ÁREA DE MÉTODOS ---------- */
    // Métodos Construtores
    public ContaCorrente(Cliente pessoa)
    {
        /**
         * Trilogia para geração de ID de Conta
         */
        ContaCorrente.setNumContas();
        this.setDataConta();
        this.setIdConta();
        this.setSaldoConta(0);
        this.setDonoConta(pessoa);
        this.abreConta();
    }
    public ContaCorrente(Cliente empresa, double valorInicial)
    {
        /**
         * Trilogia para geração de ID de Conta
         */
        ContaCorrente.setNumContas();
        this.setDataConta();
        this.setIdConta();
        this.setSaldoConta(valorInicial);
        this.setDonoConta(empresa);
        this.abreConta();
    }

    // Métodos Especiais de Classe
    private static void setNumContas()
    {
        ContaCorrente.numContas += 1;
    }
    public static int getNumContas()
    {
        return ContaCorrente.numContas;
    }

    @Override
    public void abreConta()
    {
        if (this.getDonoConta().getStatusCadastro() == true)
        {
            this.ativarConta();
        }
        else
        {
            System.out.format("Cadastro Inativo! Não pode abrir conta!");
            this.desativarConta();
        }
    }
    @Override
    public void fimConta()
    {
        
    }

    @Override
    public void depositarConta(double valor)
    {
        if (this.getStatusConta() == true)
        {
            this.setSaldoConta(valor);
            System.out.println("Depósito efetuado com sucesso!");
        }
        else
        {
            System.out.println("Conta Inexistente! Depósito Impossibilitado!");
        }
    }
    @Override
    public void sacarConta(double valor)
    {
        if (this.getStatusConta() == true)
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
        else
            System.out.println("Conta Inexistente! Saque Impossibilitado!");

    }

    // Métodos Especiais de Instância
    public void ativarConta()
    {
        this.setStatusConta(true);
    }
    public void desativarConta()
    {
        this.setStatusConta(false);
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
        this.idConta = (this.getDataConta() + "-" + ContaCorrente.getNumContas());
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
    
    public void setDonoConta(Cliente dono)
    {
        this.donoConta = dono;
    }
    public Cliente getDonoConta()
    {
        return this.donoConta;
    }

    public boolean getStatusConta()
    {
        return this.statusConta;
    }
    private void setStatusConta(boolean status)
    {
        this.statusConta = status;
    }
}