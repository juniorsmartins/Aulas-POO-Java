package AulasUdemy;

import java.util.ArrayList;
import java.util.Scanner;

public class AulaList 
{
    public static void main(String[] args) 
    {   
        Scanner scan = new Scanner(System.in);
        ArrayList<String> nome = new ArrayList<String>();
        int i = 0;
        String opcao = new String();
        opcao = "N";

        do
        {
            System.out.print("Digite o nome: ");
            nome.add(scan.nextLine());
            pulaLinha();
            
            System.out.print("Continuar ('S' ou 'N')? ");
            opcao = scan.nextLine();
            pulaLinha();
            
            i++;
        } while (opcao.equalsIgnoreCase("S"));

        for (String nomeItem: nome)
            System.out.println("Nomes: " + nomeItem);

        scan.close();
    }

    public static void pulaLinha()
    {
        System.out.print("\n");
    }
}