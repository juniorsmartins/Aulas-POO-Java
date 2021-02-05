package Projetos.Projeto3_Banco.view;

import Projetos.Projeto3_Banco.control.*;
import Projetos.Projeto3_Banco.model.*;

import java.util.Scanner;
import java.util.ArrayList;

public class Banco 
{
    static String nome = "Geek Bank";
    static Scanner teclado = new Scanner(System.in);
    static ArrayList<Conta> contas;
    
    public static void main(String[] args) 
    {
        Banco.contas = new ArrayList<Conta>();
        Banco.menu();
        
    }
    
    public static void menu()
    {
        int opcao = 0;
        Utils.pulaLinha(1);
        System.out.println("==============================");
        System.out.println("===========  ATM  ============");
        System.out.println("========  " + Banco.nome + "  =========");
        System.out.println("==============================");
        System.out.println("====== 1 - Abrir conta =======");
        System.out.println("====== 2 - Sacar       =======");
        System.out.println("====== 3 - Depositar   =======");
        System.out.println("====== 4 - Transferir  =======");
        System.out.println("====== 5 - Listar      =======");
        System.out.println("====== 6 - Sair        =======");
        System.out.println("==============================");
        System.out.print("Escolha uma das opções acima: ");
        
        try
        {
            opcao = Integer.parseInt(Banco.teclado.nextLine());
        }
        catch (NumberFormatException e)
        {
            System.out.println("Por favor, informe uma opção válida.");
            Utils.pausar(1);
            Banco.menu();
        }
        
        switch(opcao)
        {
            case 1:
                Banco.abrirConta();
                break;
            case 2:
                Banco.efetuarSaque();
                break;
            case 3:
                Banco.efetuarDeposito();
                break;
            case 4:
                Banco.efetuarTransferencia();
                break;
            case 5:
                Banco.listarContas();
                break;
            case 6:
                Utils.pulaLinha(1);
                System.out.println("Até breve!");
                System.out.println("Que a força esteja convosco!");
                Utils.pausar(2);
                System.exit(0);
                break;
            default:
                Utils.pulaLinha(1);
                System.out.println("Opção Inválida!");
                Utils.pausar(2);
                Banco.menu();
                break;
        }
    }
    
    public static void abrirConta()
    {
        Utils.pulaLinha(1);
        System.out.println("==============================");
        System.out.println("========= ABRIR CONTA ========");
        System.out.println("==============================");

        System.out.print("Nome do cliente: ");
        String nome = Banco.teclado.nextLine();

        System.out.print("CPF do cliente: ");
        String cpf = Banco.teclado.nextLine();

        System.out.print("Data de Nascimento: ");
        String dataNascimento = Banco.teclado.nextLine();

        System.out.print("E-mail do cliente: ");
        String email = Banco.teclado.nextLine();
        
        Cliente cliente = new Cliente(nome, email, cpf, Utils.stringParaData(dataNascimento));
        Conta conta = new Conta(cliente);
        Banco.contas.add(conta);
        
        System.out.println("\nConta aberta com sucesso!");
        System.out.println(conta);
        Utils.pulaLinha(1);
        
        Utils.pausar(3);
        Banco.menu();
    }
    
    public static void efetuarSaque()
    {
        
        
        
        
        System.out.println("Efetuar Saque!");
    }
    
    public static void efetuarDeposito()
    {
        System.out.println("Efetuar Depósito!");
    }
    public static void efetuarTransferencia()
    {
        System.out.println("Efetuar Transferência!");
    }
    public static void listarContas()
    {
        System.out.println("Listar Contas!");
    }
}