package AulasGustavoGuanabara;

import java.util.Scanner;

public class ContaBancaria 
{

    public static void main(String[] args)
    {
        String nome = new String();
        String tipo = new String();

        Scanner entrada = new Scanner(System.in);        
        
        System.out.print("Qual nome: ");
        nome = entrada.next();
        System.out.println("CC para Conta Corrente e CP para Conta Poupança");
        System.out.print("Tipo conta [CC ou CP]: ");
        tipo = entrada.next();

        ProjetoContaBancaria conta = new ProjetoContaBancaria(tipo, nome);

        conta.setPagarTaxa();
        conta.setSaldoContaDepositar(73);
        
        
        System.out.println(conta.getNumConta());
        System.out.println(conta.getTipoConta());
        System.out.println(conta.getNomeConta());
        System.out.println(conta.getStatusConta());
        System.out.println(conta.getSaldoConta());
        
        
        
    }
    
}
