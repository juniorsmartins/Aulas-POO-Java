/*
 * Exercício para aprendizagem de Java
 */
package ProjetoContaBancaria.Modelo;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * @author Junior Martins
 * @since 16/01/21 - 09h00
 */
public class Conta 
{
    /* --------- ÁREA DE ATRIBUTOS ---------- */
    // Atributos de Classe
    private static int totalConta;
    
    // Atributos de Instância
    private String dataConta;
    private String idConta;
    private Cliente donoConta;
    private double saldoConta;

    /* ---------- ÁREA DE MÉTODOS ---------- */
    // Métodos Construtores
    Conta(Cliente dono)
    {
        Conta.setTotalConta();
        this.setDataConta();
        this.setIdConta();
        this.donoConta = dono;
        this.saldoConta = 0;
    }

    // Métodos Especiais de Classe
    private static void setTotalConta()
    {
        Conta.totalConta += 1;
    }
    public static int getTotalConta()
    {
        return Conta.totalConta;
    }

    // Métodos Especiais de Instância
    public void depositarConta(double valor)
    {
        this.setSaldoConta(valor);
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
        this.idConta = (this.getDataConta() + "-" + Conta.getTotalConta());
    }
    public String getIdConta()
    {
        return this.idConta;
    }
    
    public void setDonoConta(Cliente dono)
    {
        this.donoConta = dono;
    }
    public Cliente getDonoConta()
    {
        return this.donoConta;
    }

    private void setSaldoConta(double valor)
    {
        this.saldoConta += valor;
    }
    public double getSaldoConta()
    {
        return this.saldoConta;
    }
}
