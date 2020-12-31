package AulasGustavoGuanabara;

import java.util.Scanner;

public class EntradaDeDados 
{
    public static void main(String[] args) 
    {

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();

        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        
        System.out.print("Qual a idade do aluno? ");
        int idade = teclado.nextInt();
        
        pularLinha();
        System.out.format("Com %d anos, %s tirou a nota %.1f", idade, nome, nota);
        pularLinha();
        
    }
    
    public static void pularLinha()
    {
        System.out.format("\n \n");
    }
}
