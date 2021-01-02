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
            this.setStatusConta();
        }
    }
    
    // Getters and Setters    
    int getNumConta()
    {
       return this.numConta; 
    }

    String getTipoConta()
    {
        return this.tipoConta;
    }
    
    String getNomeConta()
    {
        return this.nomeConta;
    }

    float getSaldoConta()
    {
        return this.saldoConta;
    }
    void setSaldoConta(float valor)
    {
        this.saldoConta = valor;
    }
    
    boolean getStatusConta()
    {
        return this.statusConta;
    }
    void setStatusConta()
    {
        this.statusConta = false;
    }
}
