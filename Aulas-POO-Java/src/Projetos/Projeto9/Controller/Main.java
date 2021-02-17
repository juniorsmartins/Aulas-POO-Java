package Projetos.Projeto9.Controller;

import java.util.Scanner;
import java.util.ArrayList;

import Projetos.Projeto9.ModelsPersonas.*;

public class Main 
{
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) 
    {
        ArrayList<Torcedor> listaTorcedor = new ArrayList<>();
        Torcedor torcedor;
        String nome, sobrenome, cpf, nacionalidade, time;
        
        System.out.print("Cadastrar quantos? ");
        int quantia = Integer.parseInt(scan.next());
        
        for(int contador = 0; contador < quantia; contador++)
        {
            System.out.println("ENTRADA DE DADOS");
            System.out.print("Nome: ");
            nome = scan.nextLine();
            System.out.print("Sobrenome: ");
            sobrenome = scan.nextLine();
            System.out.print("CPF: ");
            cpf = scan.nextLine();
            System.out.print("Nacionalidade: ");
            nacionalidade = scan.nextLine();
            System.out.print("Time: ");
            time = scan.nextLine();
            pulaLinha(2);
            torcedor = new Torcedor(nome, sobrenome, cpf, nacionalidade, time);
            listaTorcedor.add(torcedor);
        }

        
        for(Torcedor torce: listaTorcedor)
        {
            System.out.println("TORCEDOR");
            System.out.println("ID: " + torce.getId());
            System.out.println("Nome completo: " + torce.getNome() + " " + torce.getSobrenome());
            System.out.println("CPF: " + torce.getCpf());
            System.out.println("Nacionalidade: " + torce.getNacionalidade());
            System.out.println("Time: " + torce.getTime());
            pulaLinha(1);
        }


        pulaLinha(2);
    }
    
    public static void pulaLinha(int linhas)
    {
        for(int i = 0; i < linhas; i++) 
            System.out.print("\n");
    }
}