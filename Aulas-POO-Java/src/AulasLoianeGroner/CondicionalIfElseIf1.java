package AulasLoianeGroner;

import java.util.Scanner;

public class CondicionalIfElseIf1 {

    public static void main(String[] args)
    {
        
     float nota1, nota2, nota3;
     Scanner scan = new Scanner(System.in);
     
     System.out.format("Nota 1: ");
     nota1 = scan.nextFloat();
     System.out.format("\nNota 2: ");
     nota2 = scan.nextFloat();
     System.out.format("\nNota 3: ");
     nota3 = scan.nextFloat();
     float media = (float) ((nota1 + nota2 + nota3) / 3);
     
     if (media >= 7 && media <= 10)
     {
         System.out.println("\nAprovado!" + media);
     }
     else if (media >= 4 && media < 7)
     {
         System.out.println("\nReprovado!" + media);
     }
     else
     {
        System.out.println("\nVocê é muito burro!" + media);
     }
                
    }
}
