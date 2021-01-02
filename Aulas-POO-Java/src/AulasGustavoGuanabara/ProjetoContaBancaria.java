/*
 * Exercício para aprendizagem de Java
 */
package AulasGustavoGuanabara;


/**
 * @author Junior Martins
 */
public class ProjetoContaBancaria 
{
    public static int totalContas; // Variável de Classe

    private int numConta; // Variável de Instância
    private String tipoConta = new String(); // Variável de Instância
    private String nomeConta = new String(); // Variável de Instância
    private float saldoConta; // Variável de Instância
    private boolean statusConta; // Variável de Instância

    // Método Construtor
    public ProjetoContaBancaria(String tipo, String nome) 
    {
        if (tipo.equalsIgnoreCase("CC"))
        {
            ProjetoContaBancaria.totalContas += 1;
            this.numConta = 100 + ProjetoContaBancaria.totalContas;
            this.tipoConta = tipo;
            this.nomeConta = nome;
            this.saldoConta = 50;
            this.statusConta = true;
        }
        else if (tipo.equalsIgnoreCase("CP"))
        {
            ProjetoContaBancaria.totalContas += 1;
            this.numConta = 100 + ProjetoContaBancaria.totalContas;
            this.tipoConta = tipo;
            this.nomeConta = nome;
            this.saldoConta = 150;
            this.statusConta = true;
        }
        else
        {
            System.out.format("Tipo de conta inválido!");
            this.setStatusContaFechar();
        }
    }
    
    // Getters and Setters    
    public int getNumConta()
    {
        if (this.statusConta == true)
        {
            return this.numConta;
        }
        else
        {
            System.out.println("Conta Inválida!");
            return (0);
        }
    }

    public String getTipoConta()
    {
        if (this.statusConta == true)
        {
            return this.tipoConta;
        }
        else
        {
            System.out.println("Conta Inválida!");
            return (" ");
        }
    }
    
    public String getNomeConta()
    {
        if (this.statusConta == true)
        {
            return this.nomeConta;
        }
        else
        {
            System.out.println("Conta Inválida!");
            return (" ");
        }
    }

    public float getSaldoConta()
    {
        if (this.statusConta == true)
        {
            return this.saldoConta;
        }
        else
        {
            System.out.println("Conta Inválida! Não há saldo.");
            return (0);
        }
    }
    public void setSaldoContaDepositar(float valor)
    {
        if (this.statusConta == true)
        {
            this.saldoConta += valor;
        }
        else
        {
            System.out.format("Conta Inválida! Não pode depositar.");
        }

    }
    public void setSaldoContaSacar(float valor)
    {
        if (this.statusConta == true)
        {
            this.saldoConta -= valor;            
        }
        else
        {
            System.out.println("Conta Inválida! Não pode retirar.");
        }
    }
    
    public boolean getStatusConta()
    {
        if (this.statusConta == true)
        {
            System.out.print("Conta Aberta! ");
           return this.statusConta;            
        }
        else
        {
            System.out.println("Conta Fechada!");
            return this.statusConta;
        }             
    }
    public void setStatusContaFechar()
    {
        this.statusConta = false;
        System.out.println("Conta Fechada!");
    }
    public void setStatusContaAbrir()
    {
        this.statusConta = true;
        System.out.println("Conta Aberta!");
    }
    
    public void setPagarTaxa()
    {
        this.saldoConta -= 15;
        System.out.println("Taxa Paga!");
    }
    
}
