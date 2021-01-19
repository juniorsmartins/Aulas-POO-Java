package AulasUdemy;

import java.util.Scanner;

public class AulaArray 
{
    static Scanner scan = new Scanner(System.in); // Declaração de variável para entrada de dados

    static int linha;
    static int coluna;

    static float[] disc = new float[6];
    static float[] nota = new float[2];
    static float[] media = new float[6];

    public static void main(String[] args)
    {
        for (linha = 0; linha < disc.length; linha++)
        {
            for (coluna = 0; coluna < nota.length; coluna++)
            {
                System.out.print("Disciplina " + (linha + 1) + ": Digite a nota" + (coluna + 1) + ": ");
                nota[coluna] = scan.nextFloat();
                disc[linha] += nota[coluna];
            }            
            media[linha] = (disc[linha] / 2);
        }
        for (float item: media)
                System.out.println("Médias: " + item);
    }
}
