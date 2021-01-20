package AulasUdemy;

import java.util.ArrayList;
import java.util.Scanner;

public class AulaLista3 
{
    static ArrayList<String> nome = new ArrayList<String>();
    static ArrayList<Float> nota1 = new ArrayList<Float>();
    static ArrayList<Float> nota2 = new ArrayList<Float>();
    static ArrayList<Float> media = new ArrayList<Float>();
    static int contador;

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        int numDisciplinas;
        float repositorio;
        String vaso = new String();
        
        System.out.print("Calcular a média de quantas disciplinas? ");
        numDisciplinas = scan.nextInt();

        for (contador = 0; contador < numDisciplinas; contador++)
        {
            pulaLinha();
            System.out.print("Nome do aluno: ");
            nome.add(vaso = scan.next());
            pulaLinha();
            System.out.print("Nota 1:");
            nota1.add(repositorio = scan.nextFloat());
            System.out.print("Nota 2:");
            nota2.add(repositorio = scan.nextFloat());
            pulaLinha();
            media.add((nota1.get(contador) + nota2.get(contador)) /2);
        }
        apresentacao();
    }

    public static void pulaLinha()
    {
        System.out.print("\n");
    }

    public static void apresentacao()
    {
        for (contador = 0; contador < nome.size(); contador++)
        {
            System.out.println(nome.get(contador));
            System.out.println(media.get(contador));
        }
    }
}