package AulasGustavoGuanabara;

import java.util.Scanner;

public class ContaBancaria 
{

    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        String nom = new String();
        String tip = new String();
        
        System.out.format("Conta Bancária");
        System.out.print("Qual nome: ");
        nom = entrada.next();
        System.out.println("CC para Conta Corrente e CP para Conta Poupança");
        System.out.print("Tipo conta: ");
        tip = entrada.next();

        ProjetoContaBancaria conta = new ProjetoContaBancaria(tip, nom);
        
        
        
    }
    
}
