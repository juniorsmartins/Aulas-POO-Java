package AulasUdemy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AulaCollections 
{
    static Scanner scan = new Scanner(System.in);
    static String opcao = new String();
    static int contador = 0;
    static ArrayList<Integer> numeros = new ArrayList<Integer>();

    public static void main(String[] args) 
    {
        opcao = "S";
        numeros.add(18);
        numeros.add(9);
        numeros.add(21);
        numeros.add(13);
        
        do 
        {
            System.out.format("%s", "Digite número: ");
            numeros.add(scan.nextInt());
            pulaLinha();

            System.out.print("Deseja continuar (S ou N)? ");
            opcao = scan.next();

            pulaLinha();
        } while (opcao.equalsIgnoreCase("S"));

        apresentacao();
        scan.close();
    }

    public static void pulaLinha()
    {
        System.out.print("\n");
    }

    public static void apresentacao()
    {
        for (Integer numList: numeros)
        {
            System.out.println(numeros.get(numList));            
        }
    }
}    