package Projetos.Projeto9.Controller;

import Projetos.Projeto9.Model.Plano;
import Projetos.Projeto9.Model.Torcedor;
import Projetos.Projeto9.Model.Armazenar;

import java.util.Scanner;

public class ProgramaMain 
{
    static Scanner scan = new Scanner(System.in);
    private static byte opcaoMenuPrincipal;

    public static void main(String[] args) 
    {
        pulaLinha();
        menuPrincipal();
        chamaSwithPrincipal();

        
    }

    
    public static void cadastrarTorcedor()
    {
        pulaLinha();
        Torcedor cliente = new Torcedor("Paulo", 31);
        
    }
    
    public static void chamaSwithPrincipal()
    {
        switch (opcaoMenuPrincipal)
        {
            case 1:
                pulaLinha();
                System.out.println("Cadastrar Torcedor!");
                cadastrarTorcedor();
                break;
            case 2:
                pulaLinha();
                System.out.println("Assinar Plano!");
                break;
            case 3:
                pulaLinha();
                System.out.println("Ver Vantagens!");
                break;
            case 4:
                pulaLinha();
                System.out.println("Sair!");
                break;
        }
    }
    
    public static void menuPrincipal()
    {
        System.out.println("------------------------------");
        System.out.println("------------ MENU ------------");
        System.out.println("------------------------------");
        System.out.println("--- Cadastrar Torcedor - 1 ---");
        System.out.println("---    Assinar Plano - 2   ---");
        System.out.println("---    Ver Vantagens - 3   ---");
        System.out.println("---        Sair - 4        ---");
        System.out.println("------------------------------");
        do
        {
            System.out.print("--- Escolha uma opcao: ");
            opcaoMenuPrincipal = scan.nextByte();
            if (opcaoMenuPrincipal < 0 | opcaoMenuPrincipal > 4)
            {
                System.out.println("Opcao Inválida! Tente de novo!");
            }
        } while (opcaoMenuPrincipal < 0 | opcaoMenuPrincipal > 4);
    }
    
    public static void pulaLinha()
    {
        System.out.print("\n");
    }
}