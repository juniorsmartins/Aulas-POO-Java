package Projetos.Projeto9.Controller;

import java.util.Scanner;

import static Projetos.Projeto9.Controller.Uteis.pulaLinha;
import static Projetos.Projeto9.Controller.Create.menuCreate;
import static Projetos.Projeto9.Controller.Read.menuRead;
import static Projetos.Projeto9.Controller.Update.menuUpdate;
import static Projetos.Projeto9.Controller.Delete.menuDelete;
import Projetos.Projeto9.ModelsPersonas.Empresa;
import Projetos.Projeto9.ModelsPersonas.Torcedor;

import java.util.ArrayList;

public class Main 
{
    public static Scanner scan = new Scanner(System.in);
    public static String opcao;
    public static ArrayList<Empresa> listaEmpresa = new ArrayList<>();
    public static ArrayList<Torcedor> listaTorcedor = new ArrayList<>();
    
    public static void main(String[] args) 
    {
        menuPrincipal();
    }
    
    public static void menuPrincipal()
    {
        pulaLinha(1);
        System.out.println("****************************");
        System.out.println("*******  MENU CRUD  ********");
        System.out.println("****************************");
        System.out.println("*****    Create - 1    *****");
        System.out.println("*****     Read - 2     *****");
        System.out.println("*****    Update - 3    *****");
        System.out.println("*****    Delete - 4    *****");
        System.out.println("*****     Exit - 0     *****");
        System.out.println("****************************");
        System.out.print("***** Opção Escolhida: ");
        int opcaoMenu = Integer.parseInt(scan.nextLine());
        switch(opcaoMenu)
        {
            case 1:
                pulaLinha(1);
                menuCreate();
                break;
            case 2:
                pulaLinha(1);
                menuRead();
                break;
            case 3:
                pulaLinha(1);
                menuUpdate();
                break;
            case 4:
                pulaLinha(1);
                menuDelete();
                break;
            case 0:
                pulaLinha(2);
                System.out.println("Tchau! Amiguinho. Que a força esteja convosco!");
                pulaLinha(2);
                System.exit(0);
            default:
                pulaLinha(2);
                System.out.print("Opção Inválida! Tecle <Enter> para continuar...");
                opcao = scan.nextLine();
                pulaLinha(2);
                menuPrincipal();
        }
    }
}