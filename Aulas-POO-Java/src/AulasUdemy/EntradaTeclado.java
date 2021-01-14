package AulasUdemy;

import java.util.Scanner;

public class EntradaTeclado 
{

    public static void main(String[] args) 
    {
        String nome = new String();
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Qual teu nome? ");
        nome = teclado.nextLine();
        teclado.close();
        
        System.out.println("Teu nome é: " + nome);
    }
}
