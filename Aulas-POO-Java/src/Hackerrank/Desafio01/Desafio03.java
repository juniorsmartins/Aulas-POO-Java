package Hackerrank.Desafio01;

import java.util.*;

public class Desafio03 
{

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) 
    {
 
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        if(N >= 1 && N <= 100)
        {
            int resto = (N % 2);
            if(N >= 2 && N <= 5 && resto == 0)
            {
                System.out.println("Not Weird");
            }
            else if (N >= 6 && N <= 20 && resto == 0)
            {
                System.out.println("Weird");
            }
            else if (N > 20 && resto == 0)
            {
                System.out.println("Not Weird");
            }
            else
            {
                System.out.println("Weird");
            }
        }
        else
        {
            System.out.println("Valor inválido!");
        }

        scanner.close();
    }
}
