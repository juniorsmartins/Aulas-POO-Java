package Projetos.Projeto9.Controller;

import java.util.Scanner;

import static Projetos.Projeto9.Controller.Uteis.*;
import static Projetos.Projeto9.Controller.Create.menuCreate;
import static Projetos.Projeto9.Controller.Read.menuRead;
import static Projetos.Projeto9.Controller.Update.menuUpdate;
import static Projetos.Projeto9.Controller.Delete.menuDelete;
import Projetos.Projeto9.ModelsPersonas.Fisica;
import Projetos.Projeto9.ModelsPersonas.Juridica;

import java.util.ArrayList;
import java.util.List;

public class Main 
{
    public static Scanner scan = new Scanner(System.in);
    public static String opcao;
    public static List<Juridica> listaTime = new ArrayList<>();
    public static List<Juridica> listaEntidade = new ArrayList<>();
    public static List<Juridica> listaEmpresa = new ArrayList<>();
    public static List<Fisica> listaTorcedor = new ArrayList<>();
    public static List<Fisica> listaColaborador = new ArrayList<>();
    public static List<Fisica> listaAtleta = new ArrayList<>();
    
    public static void main(String[] args) 
    {
        menuPrincipal();
    }
    
    public static void menuPrincipal()
    {
        pulaLinha(3);
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
                pulaLinha(1);
                System.exit(0);
            default:
                opcaoInvalida();
                menuPrincipal();
        }
    }
}