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
    public void ProjetoContaBancaria(String tipo, String nome) 
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
    int getNumConta()
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

    String getTipoConta()
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
    
    String getNomeConta()
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

    float getSaldoConta()
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
    void setSaldoContaDepositar(float valor)
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
    void setSaldoContaSacar(float valor)
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
    
    boolean getStatusConta()
    {
        return this.statusConta;
    }
    void setStatusContaFechar()
    {
        this.statusConta = false;
    }
    void setStatusContaAbrir()
    {
        this.statusConta = true;
    }
    
    void setPagarTaxa()
    {
        this.saldoConta -= 15;
    }
    
}
