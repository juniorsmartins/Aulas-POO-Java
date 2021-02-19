package Projetos.Projeto9.Controller;

import java.util.Scanner;
import java.util.ArrayList;

import Projetos.Projeto9.ModelsPersonas.*;

public class Main 
{
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) 
    {
        menuPrincipal();

        ArrayList<Torcedor> listaTorcedor = new ArrayList<>();
        ArrayList<Empresa> listaEmpresa = new ArrayList<>();
        Torcedor torcedor;
        Empresa empresa;
        String nome, sobrenome, cpf, pais, time, razao, fantasia, cnpj;
        int quantia, tipo;

        do
        {
            pulaLinha(1);
            System.out.print("Cadastrar quantos? ");
            quantia = Integer.parseInt(scan.nextLine());
        } while(quantia < 1);

        do
        {
            pulaLinha(1);
            System.out.println("Empresa(1) ou Torcedor(2)? ");
            tipo = Integer.parseInt(scan.nextLine());
        } while(tipo < 1 || tipo > 2);

        
        switch(tipo)
        {
            case 1:
                for(int contador = 0; contador < quantia; contador++)
                {
                    System.out.println("ENTRADA DE DADOS");
                    System.out.print("Nome: ");
                    nome = (String)scan.nextLine();
                    System.out.print("Sobrenome: ");
                    sobrenome = scan.nextLine();
                    System.out.print("CPF: ");
                    cpf = scan.nextLine();
                    System.out.print("País de origem: ");
                    pais = scan.nextLine();
                    System.out.print("Time: ");
                    time = scan.nextLine();
                    pulaLinha(2);
                    torcedor = new Torcedor(nome, sobrenome, cpf, pais, time);
                    listaTorcedor.add(torcedor);
                }
                for(Torcedor torce: listaTorcedor)
                {
                    System.out.println("TORCEDOR");
                    System.out.println("ID: " + torce.verId());
                    System.out.println("Nome completo: " + torce.verNome() + " " + torce.verSobrenome());
                    System.out.println("CPF: " + torce.verDocumento());
                    System.out.println("Nacionalidade: " + torce.verPaisOrigem());
                    System.out.println("Time: " + torce.verTime());
                    pulaLinha(1);
                }
                break;
            case 2:

                break;
        }
        

        

        
        System.out.println("Total Pessoas: " + Pessoa.getTotalCadastrosPessoa());
        System.out.println("Total Pessoas Fisica: " + Fisica.getTotalCadastrosFisica());
        System.out.println("Total Pessoas Fisica Torcedor: " + Torcedor.getTotalCadastrosTorcedor());

        pulaLinha(2);
    }
    
    public static void menuPrincipal()
    {
        System.out.println("**************************");
        System.out.println("********   MENU   ********");
        System.out.println("**************************");
        System.out.println("*****  Cadastrar - 1  ****");
        System.out.println("**************************");
    }
    
    public static void pulaLinha(int linhas)
    {
        for(int i = 0; i < linhas; i++) 
            System.out.print("\n");
    }
}