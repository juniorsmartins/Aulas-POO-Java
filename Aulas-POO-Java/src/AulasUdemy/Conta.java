package AulasUdemy;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Conta 
{
    /* ---------- ÁREA DE ATRIBUTOS ---------- */
    // Atributos de Classe
    public static double totalContas;
    
    // Atributos de Instância
    private String dataAberturaConta;
    private String idConta;
    private double saldoConta;

    /* ---------- ÁREA DE MÉTODOS ---------- */
    // Métodos Construtores
    public Conta(double valor)
    {
        Conta.setTotalContas();
        this.setDataAberturaConta();
        this.setIdConta();
        this.setSaldoConta(valor);
    }
    
    // Métodos Abstratos
    
    // Métodos de Classe
    public static double getTotalContas()
    {
        return Conta.totalContas;
    }
    private static void setTotalContas()
    {
        Conta.totalContas += 1;
    }

    // Métodos de Instância
    public void depositar(double valor) 
    {
        synchronized (this) 
        {
            this.saldoConta += valor;
        }
    }

    // Métodos de Polimorfismo

    // Métodos Getters e Setters    
    public String getDataAberturaConta()
    {
        return this.dataAberturaConta;
    }
    private void setDataAberturaConta()
    {
        Date data = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("ddMMyyyy");
        this.dataAberturaConta = formatar.format(data);
    }
    
    public String getIdConta()
    {
        return this.idConta;
    }
    private void setIdConta()
    {
        this.idConta = (this.getDataAberturaConta() + " - " + Conta.getTotalContas());
    }

    public double getSaldoConta()
    {
        return this.saldoConta;
    }
    private void setSaldoConta(double valor)
    {
        this.saldoConta += valor;
    }
}