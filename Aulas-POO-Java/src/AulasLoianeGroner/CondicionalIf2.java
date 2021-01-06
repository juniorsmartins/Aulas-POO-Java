package AulasLoianeGroner;

import java.util.Scanner;

public class CondicionalIf2 {

    public static void main(String[] args)
    {
        byte idade;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.format("Digite idade: ");
        idade = teclado.nextByte();
        
        System.out.println("\n\bSua idade é: " + idade);
        
        if (idade >= 18)
        {
            System.out.printf("\n\bMaior de Idade!\n\n");
        }
        
    }


    
}
