package AulasUdemy;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

/**
 * Conjunto Set
 */
public class AulaConjuntos 
{
    public static void main(String[] args) 
    {
        Set<String> nomes = new HashSet<>();
        Scanner teclado = new Scanner(System.in);
        boolean res;
        
        for (int i = 0; i < 5; i++)
        {
            System.out.print("Informe o " + (i + 1) + "/5 nomes: ");
            String nome = teclado.nextLine();
            res = nomes.add(nome);
            if (!res)
            {
                System.out.println("O nome não pode ser repetido");
                i--;
            }
        }
        pulaLinha();
        System.out.println("No conjunto nomes temos " + nomes.size() + " elementos");
        for (String nome: nomes)
        {
            System.out.println(nome);
        }
        teclado.close();
    }
    public static void pulaLinha()
    {
        System.out.print("\n");
    }
}