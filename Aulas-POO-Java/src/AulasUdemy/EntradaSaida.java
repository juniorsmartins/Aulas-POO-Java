/*
 * Curso Udemy
 * Aula 38 - Funções
 */
package AulasUdemy;

import java.util.Scanner;

/**
 * @author Junior Martins
 * @since 15/01/2021 - 14:05
 */

public class EntradaSaida 
{
    public static String perguntar[]; 

    public static void main(String[] args)
    {
        int respostaNumRepeticoes;
        respostaNumRepeticoes = perguntarNumRepeticoes();
        pulaLinha();
        perguntarFrutas(respostaNumRepeticoes);
        imprimirFrutasInvertidas();
    }

    protected static int perguntarNumRepeticoes()
    {
        int perguntar;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Quer incluir quantas frutas? ");
        perguntar = teclado.nextInt();
        
        return perguntar;
    }

    private static void pulaLinha()
    {
        System.out.println("\n");
    }

    protected static void perguntarFrutas(int numRepeticoes)
    {
        Scanner teclado = new Scanner(System.in);
        
        for (int contador = 0; contador < numRepeticoes; contador++)
        {
            System.out.print("Digite o nome da fruta: ");
            perguntar[contador] =  teclado.nextLine();
        }
    }

    protected static void imprimirFrutasInvertidas()
    {
        for (int contador = perguntar.length; contador > 0; contador--)
        {
            System.out.println("Fruta " + contador + ": " + perguntar[contador]);
        }    
    }
}