package AulasUdemy;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class AulaEscritaEmArquivo2 
{
    // Programa para escrever texto num arquivo de txt - escreve após conteúdo pré-existente - não sobreescreve
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);

        try
        {
            PrintStream escrever = new PrintStream(new FileOutputStream("saida.txt", true));
            
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
