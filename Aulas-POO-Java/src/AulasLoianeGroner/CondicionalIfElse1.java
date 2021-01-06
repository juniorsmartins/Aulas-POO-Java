package AulasLoianeGroner;

import java.util.Scanner;

public class CondicionalIfElse1 {

    public static void main(String[] args)
    {
        short idade;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.format("Digite idade: ");
        idade = teclado.nextShort();
        
        System.out.println("\n\bSua idade é: " + idade);
        
        if (idade >= 18)
        {
            System.out.printf("\n\bMaior de Idade!\n\n");
        }
        else
        {
            System.out.println("\nMenor de Idade!\n\n");
        }
             
    }
    
}
