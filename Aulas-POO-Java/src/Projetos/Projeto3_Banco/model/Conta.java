package Projetos.Projeto3_Banco.model;

import Projetos.Projeto3_Banco.control.Utils;

public class Conta 
{
    // Atributos de Classe
    private static int codigo = 1001;
    
    // Atributos de Instância
    private int numero;
    private Cliente cliente;
    private Double saldo = 0.0;
    private Double limite = 0.0;
    private Double saldoTotal;
    
    // Método Construtor
    public Conta(Cliente cliente)
    {
        this.setNumero(Conta.codigo);
        this.setCliente(cliente);
        Conta.codigo += 1;
        this.atualizaSaldoTotal();
    }

    // Métodos Especiais de Instância
    private void atualizaSaldoTotal()
    {
        this.setSaldoTotal(this.getSaldo() + this.getLimite());
    }
    public void depositar(Double valor)
    {
        if(valor > 0)
        {
            this.setSaldo(this.getSaldo() + valor);
            this.atualizaSaldoTotal();
            System.out.println("Depósito efetuado com sucesso!");
        }
        else
        {
            System.out.println("Erro ao efetuar depósito. Tente novamente!");
        }
    }
    public void sacar(Double valor)
    {
        if(valor > 0 && this.getSaldoTotal() >= valor)
        {
            if(this.getSaldo() >= valor)
            {
                this.setSaldo(this.getSaldo() - valor);
                this.atualizaSaldoTotal();
                System.out.println("Saque efetuado com sucesso! Sacado do saldo.");
            }
            else
            {
                Double restante = this.getSaldo() - valor;
                this.setLimite(this.getLimite() + restante);
                this.setSaldo(0.0);
                this.atualizaSaldoTotal();
                System.out.println("Saque efetuado com sucesso! O limite foi usado.");
            }
        }
        else
        {
            System.out.println("Saque não realizado. Tente novamente!");
        }
    }
    public void transferir(Conta destino, Double valor)
    {
        if(valor > 0 && this.getSaldoTotal() >= valor)
        {
            if(this.getSaldo() >= valor)
            {
                this.setSaldo(this.getSaldo() - valor);
                destino.setSaldo(destino.getSaldo() + valor);
                this.atualizaSaldoTotal();
                destino.atualizaSaldoTotal();
                System.out.println("Transferência realizada com sucesso! O saldo foi usado.");
            }
            else
            {
                Double restante = this.getSaldo() - valor;
                this.setLimite(this.getLimite() + restante);
                this.setSaldo(0.0);
                destino.setSaldo(destino.getSaldo() + valor);
                this.atualizaSaldoTotal();
                destino.atualizaSaldoTotal();
                System.out.println("Transferência realizada com sucesso! O limite foi usado.");
            }
        }
        else
        {
            System.out.println("Transferência não realizada! Tente novamente.");
        }
    }
    
    // Métodos de SuperClasse
    @Override
    public String toString()
    {
        return ("\nNúmero da conta: " + this.getNumero() +
                "\nCliente: " + this.cliente.getNome() +
                "\nCPF: " + this.cliente.getCpf() +
                "\nData Nascimento: " + this.cliente.getDataNascimento() +
                "\nE-mail: " + this.cliente.getEmail() +
                "\nSaldo Total: " + Utils.doubleParaString(this.getSaldoTotal()));
    }
    
    // Métodos Getters
    public int getNumero()
    {
        return this.numero;
    }
    public Cliente getCliente()
    {
        return this.cliente;
    }
    public Double getSaldo()
    {
        return this.saldo;
    }
    public Double getLimite()
    {
        return this.limite;
    }
    public Double getSaldoTotal()
    {
        return this.saldoTotal;
    }
    
    // Métodos Setters
    private void setNumero (int num)
    {
        this.numero = num;
    }
    private void setCliente(Cliente cliente)
    {
        this.cliente = cliente;
    }
    private void setSaldo(Double valor)
    {
        this.saldo = valor;
    }
    public void setLimite(Double limite)
    {
        this.limite = limite;
        this.atualizaSaldoTotal();
    }
    private void setSaldoTotal(Double total)
    {
        this.saldoTotal = total;
    }
}