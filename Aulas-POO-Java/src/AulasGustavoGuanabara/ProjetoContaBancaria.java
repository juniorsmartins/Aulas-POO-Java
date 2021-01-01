/*
 * Exercício para aprendizagem de Java
 */
package AulasGustavoGuanabara;


/**
 * @author Junior Martins
 */
public class ProjetoContaBancaria 
{
    static int totalContas; // Variável de Classe

    int numConta; // Variável de Instância
    String tipoConta = new String(); // Variável de Instância
    String nomeConta = new String(); // Variável de Instância
    float saldoConta; // Variável de Instância
    boolean statusConta; // Variável de Instância
    
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
            this.statusConta = false;
        }
    }
    
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
}
