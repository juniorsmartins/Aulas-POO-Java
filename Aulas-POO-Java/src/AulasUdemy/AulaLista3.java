package AulasUdemy;

import java.util.ArrayList;
import java.util.Scanner;

public class AulaLista3 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        int numDisciplinas;
        float contador;
        
        ArrayList<String> nome = new ArrayList<String>();
        ArrayList<float> nota1 = new ArrayList<float>();
        ArrayList<float> nota2 = new ArrayList<float>();
        ArrayList<float> media = new ArrayList<float>();
        
        System.out.print("Calcular a média de quantas disciplinas? ");
        numDisciplinas = scan.nextInt();

        for (contador = 0; contador < numDisciplinas; contador++)
        {
            System.out.print("Nome do aluno: ");
            nome.add(scan.nextLine());
            pulaLinha();
            System.out.print("Nota 1:");
            nota1.add(scan.nextFloat());
            pulaLinha();
            System.out.print("Nota 2:");
            nota2.add(scan.nextFloat());
            pulaLinha();
            media.add(nota1.get(contador) + nota2.get(contador));
        }
    }

    public static void pulaLinha()
    {
        System.out.print("\n");
    }
}
