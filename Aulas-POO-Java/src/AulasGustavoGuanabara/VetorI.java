package AulasGustavoGuanabara;

import java.util.Scanner;

public class VetorI 
{    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] calendario = new String[12];

        for (byte mes = 0; mes < 12; mes++)
        {
            System.out.format("Nome do mês %d: ", (mes+1));
            calendario[mes] = input.nextLine();
        }
        
        for (String item : calendario)
        {
            System.out.println("Mês: " + item);
        }
    }
}
