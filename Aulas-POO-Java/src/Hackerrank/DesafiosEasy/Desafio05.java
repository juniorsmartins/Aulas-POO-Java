package Hackerrank.DesafiosEasy;

import java.util.Scanner;

public class Desafio05 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        int N;
        do
        {
            System.out.print("Digite num: ");
            N = Integer.parseInt(scan.nextLine());
        } while(N < 2 || N > 20);
        
        int result;
        for(int cont = 1; cont < 11; cont++ ) System.out.format("\n%d x %d = %d", N, cont, (result = N * cont));
        System.out.print("\n");
    }
}