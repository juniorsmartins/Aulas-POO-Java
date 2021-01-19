package AulasUdemy;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintStream;

public class AulaEscritaEmArquivo 
{
    // Programa para escrever texto num arquivo txt
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        try
        {
            PrintStream escrever = new PrintStream("saida.txt");
            
            System.out.print("Escreva algo: ");
            String mensagem = teclado.nextLine();
            escrever.println(mensagem);
            escrever.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Não foi possível criar o arquivo");
        }
        teclado.close();
    }
}
