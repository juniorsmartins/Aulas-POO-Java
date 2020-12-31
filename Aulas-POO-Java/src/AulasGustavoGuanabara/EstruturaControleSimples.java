package AulasGustavoGuanabara;

import java.util.Scanner;

public class EstruturaControleSimples 
{

    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        System.out.println("MÉDIA DA NOTA");
        System.out.print("Primeira nota: ");
        float nota1 = teclado.nextFloat();
        System.out.format("Segunda nota: ");
        float nota2 = teclado.nextFloat();
        float media = (nota1 + nota2) / 2;
        System.out.println("Sua média é: " + media);
        if (media < 5) {
            System.out.println("Reprovadaço!");
        } else if (media >= 5 && media < 7) {
            System.out.println("Reprovado!");
        } else if (media >= 7 && media <= 9) {
            System.out.println("Aprovado!");
        } else if (media > 9) {
            System.out.println("Aprovadaço!");
        } else {
            System.out.println("Nota Inválida!");
        }
    }


    
}
