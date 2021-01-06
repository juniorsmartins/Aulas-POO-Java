package AulasLoianeGroner;

import java.util.Scanner;

public class SwitchCase1 {

    public static void main(String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        byte diaSemana;
        System.out.format("\nDia da semana (1-7): ");
        diaSemana = scan.nextByte();
        switch(diaSemana)
        {
            case 1: 
                System.out.println("\nDomingo");
                break;
            case 2:
                System.out.println("\nSegunda");
                break;
            case 3:
                System.out.println("\nTerça");
                break;
            case 4:
                System.out.println("\nQuarta");
                break;
            case 5:
                System.out.println("\nQuinta");
                break;
            case 6:
                System.out.println("\nSexta");
                break;
            case 7:
                System.out.println("\nSábado");
                break;
            default: 
                System.out.println("\nDia Inválido!\n\n");
                break;
        }
    }
    
}
