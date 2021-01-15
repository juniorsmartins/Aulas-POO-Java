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
    static Scanner teclado = new Scanner(System.in);
    static String nomeFrutas[]; // Declarar array de frutas
    
    public static void main(String[] args)
    {
        int totalFrutas = quantiaFrutas(); // Chamada da função para perguntará quantas frutas
        
        nomeFrutas = new String[totalFrutas]; // Definir tamanho do array de frutas
        pulaLinha();
        perguntaFrutas(totalFrutas); // Chamar função para receber nomes de frutas
        pulaLinha();        
        imprimirFrutasInvertidas(totalFrutas); // Chamar função para imprimir os nomes invertidos
        pulaLinha();
        teclado.close();
    }
    
    public static int quantiaFrutas()
    {
        System.out.print("Quantas frutas: ");
        int quantiaFrutas = Integer.parseInt(teclado.nextLine());        
        return quantiaFrutas;
    }
    
    public static void perguntaFrutas(int totalFrutas)
    {
        for (int contador = 0; contador < totalFrutas; contador++)
        {
            System.out.print("Fruta " + contador + ": ");
            nomeFrutas[contador] = teclado.nextLine();
        }
    }
    
    public static void imprimirFrutasInvertidas(int totalFrutas)
    {
        for (int cont = (totalFrutas - 1); cont >= 0; cont--)
        {
            System.out.println("Fruta " + cont + ": " + nomeFrutas[cont]);
        }
    }

    public static void pulaLinha()
    {
        System.out.println("\n");
    }
}