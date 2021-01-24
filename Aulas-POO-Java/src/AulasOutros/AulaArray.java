package AulasOutros;

import java.util.Scanner;

public class AulaArray 
{
    static Scanner scan = new Scanner(System.in);
    static String disciplina;
    static int quantiaNotas;
    static float[] notas = new float[50];
    static float mediaNotas;
    
    public static void main(String[] args) 
    {
        abertura();
        parametrosIniciais();
        entradaDeNotas();
        calcularMedia();
        apresentarMedia();
    }

    public static void apresentarMedia()
    {
        pulaLinha();
        System.out.printf("Sua média em %s é: %.2f", disciplina, mediaNotas);
        pulaLinha();
    }
    
    public static void calcularMedia()
    {
        for (int contador = 0; contador < quantiaNotas; contador++)
        {
            mediaNotas += notas[contador];
        }
        mediaNotas = (mediaNotas / quantiaNotas);
    }

    public static void entradaDeNotas()
    {
        pulaLinha();
        for (int contador = 0; contador < quantiaNotas; contador++)
        {
            do
            {
                System.out.printf("Digite o valor da nota %d (0 a 10): ", (contador + 1));
                notas[contador] = scan.nextFloat();
            } while (notas[contador] < 0 || notas[contador] > 10);
        }
    }
    
    public static void parametrosIniciais()
    {
        System.out.print("Digite o nome da disciplina: ");
        disciplina = scan.nextLine();
        do
        {
            System.out.print("Quantas notas p/calcular (máximo 50): ");
            quantiaNotas = Integer.parseInt(scan.nextLine());
        } while (quantiaNotas <= 0 || quantiaNotas > 50);
    }

    public static void abertura()
    {
        System.out.println("-------------------------------");
        System.out.println("--------- Bem-Vindo! ----------");
        System.out.println("-------------------------------");
        System.out.println("-- Vamos calcular sua média! --");
        System.out.println("-------------------------------");
        pulaLinha();
    }
    
    public static void pulaLinha()
    {
        System.out.print("\n");
    }
}