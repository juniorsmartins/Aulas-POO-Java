/*
 * Exercício para aprendizagem de Java
 */
package Projetos.Projeto06_BancoII.Modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Junior Martins
 * @since 18/01/21 - 17h55
 */
public class ContaPoupanca extends Conta
{
    /* --------- ÁREA DE ATRIBUTOS ---------- */
    // Atributos de Classe
    private static int numContasPoup;
    
    // Atributos de Instância
    private String dataConta;
    private String idConta;
    private double saldoConta;
    private Cliente donoConta;
    private boolean statusConta;

    /* ---------- ÁREA DE MÉTODOS ---------- */
    // Métodos Construtores
    public ContaPoupanca(PessoaFisica pessoa)
    {
        /**
         * Trilogia para geração de ID de Conta
         */
        ContaPoupanca.setNumContasPoup();
        this.setDataConta();
        this.setIdConta();
        this.setSaldoConta(0);
        this.setDonoConta(pessoa);
        this.abreConta();
    }
    public ContaPoupanca(PessoaJuridica empresa, double valorInicial)
    {
        /**
         * Trilogia para geração de ID de Conta
         */
        ContaPoupanca.setNumContasPoup();
        this.setDataConta();
        this.setIdConta();
        this.setSaldoConta(valorInicial);
        this.setDonoConta(empresa);
        this.abreConta();
    }

    // Métodos Especiais de Classe
    private static void setNumContasPoup()
    {
        ContaPoupanca.numContasPoup += 1;
    }
    public static int getNumContasPoup()
    {
        return ContaPoupanca.numContasPoup;
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
        this.idConta = (this.getDataConta() + "-" + ContaPoupanca.getNumContasPoup());
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