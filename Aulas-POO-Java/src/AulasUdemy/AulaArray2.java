package AulasUdemy;

import java.util.Scanner;

/**
 * @author Junior Martins
 * 19/01/2021 - 17:11:00
 */
public class AulaArray2 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        float[][] resultado = new float[4][3];
        int linha;
        int coluna;

        for (linha = 0; linha < resultado.length; linha++)
        {
            for (coluna = 1; coluna < resultado[linha].length; coluna++)
            {
                System.out.print("Disciplina " + (linha + 1) + ": Nota " + coluna + ": ");
                resultado[linha][coluna] = scan.nextFloat();
                resultado[linha][0] += resultado[linha][coluna];
            }
            resultado[linha][0] = (resultado[linha][0] / 2);
        }
        for (linha = 0; linha < resultado.length; linha++)
            System.out.println(resultado[linha][0]);
    }
}