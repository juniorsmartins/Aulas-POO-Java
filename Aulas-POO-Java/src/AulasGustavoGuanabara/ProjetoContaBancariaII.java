package AulasGustavoGuanabara;

public class ProjetoContaBancariaII 
{
    public static int contadorContas;
    public int numConta;
    protected String tipoConta = new String();
    private String donoConta = new String();
    private double saldoConta;
    private boolean statusConta;
    
    // Método Construtor
    
    public ProjetoContaBancariaII()
    {
        contadorContas += 1;
        this.donoConta = "Vazio";
        this.saldoConta = 0;
        this.statusConta = false;
        this.tipoConta = "NN";
    }

    // Métodos Getters e Setters
    
    public int getNumConta()
    {
        return this.numConta;
    }
    public void setNumConta()
    {
        if (this.statusConta == true)
        {
            this.numConta = 100 + contadorContas;
            System.out.println("Número de conta gerado: " + this.numConta);
        }
        else
        {
            System.out.println("Não pode gerar número de conta. Status false!");
        }
    }

    public String getTipoConta()
    {
        return this.tipoConta;
    }
    public void setTipoConta(int tipinho)
    {
        if (this.statusConta == true)
        {
            if (tipinho == 1)
            {
                this.tipoConta = "CC";
            }
            if (tipinho == 2)
            {
                this.tipoConta = "CP";
            }
        }
        else 
        {
            this.tipoConta = "Indefinido";
        }
    }

    public String getDonoConta()
    {
        return this.donoConta;
    }
    public void setDonoConta(String nome)
    {
        if (this.statusConta == true)
        {
            this.donoConta = nome;            
        }
        else
        {
            System.out.println("Conta inexistente não pode ter dono. Status False!");
        }
    }
    
    public double getSaldoConta()
    {
        return this.saldoConta;
    }
    public void setSaldoConta()
    {
        if (this.statusConta == true)
        {
            if (this.tipoConta.equals("CC"))
            {
                this.saldoConta = 50;
            }
            else if (this.tipoConta.equals("CP"))
            {
               this.saldoConta = 150;
            }
            else
            {
                System.out.println("Tipo de conta indefinido!");
            }
        }
    }
    
    public boolean getStatusConta()
    {
        return this.statusConta;
    }
    public void setStatusConta()
    {
        this.statusConta = true;
    }

    // Métodos Especiais
    
    public void abrirConta(String nome, int tipo)
    {
        this.setStatusConta();
        this.setNumConta();
        this.setDonoConta(nome);
        this.setTipoConta(tipo);
        this.setSaldoConta();
    }
    
    public void fecharConta()
    {
        if (this.statusConta == true)
        {
            if (this.getSaldoConta() > 0)
            {
                System.out.println("Não pode fechar! Precisa zerar o saldo (" + getSaldoConta() + ")");
            }
            else if (this.getSaldoConta() < 0)
            {
                System.out.println("Não pode fechar! Precisa quitar dívida (" + getSaldoConta() + ")");
            }
            else
            {
                this.setDonoConta(" ");
                this.statusConta = false;
            }
        }
        else
        {
            System.out.println("Essa conta já está fechada ou nunca foi aberta!");
        }
             
    }
    
    public void depositarConta(double valor)
    {
        this.saldoConta += valor;
        System.out.println("Depósito confirmado! Saldo: " + this.getSaldoConta());
    }

    public void sacarConta(double valor)
    {
        if (this.saldoConta >= valor)
        {
            this.saldoConta -= valor;
            System.out.println("Saque realizado! Saldo: " + getSaldoConta());
        }
        else 
        {
            System.out.println("Saldo insuficiente para sacar!");
        }
             
    }

    public void pagarTaxa()
    {
        if (this.getStatusConta() == true && this.getTipoConta().equals("CC"))
        {
            System.out.println("Taxa bancária paga! " + this.getSaldoConta() + " - taxa(12) = " + (this.saldoConta -= 12));

        }
        else if (this.getStatusConta() == true && this.getTipoConta().equals("CP"))
        {
            System.out.println("Saldo inicial: " + this.getSaldoConta());
            this.saldoConta -= 20;
            System.out.println("Taxa bancária paga! Saldo atual: " + this.getSaldoConta());
        }
        else
        {
            System.out.println("Conta Inválida! Status False");
        }
    }
}
