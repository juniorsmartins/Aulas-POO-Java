package Projetos.Projeto07_PSTE.Controller;

import java.util.Scanner;

import static Projetos.Projeto07_PSTE.Controller.Uteis.*;
import static Projetos.Projeto07_PSTE.Controller.Create.menuCreate;
import static Projetos.Projeto07_PSTE.Controller.Read.menuRead;
import static Projetos.Projeto07_PSTE.Controller.Update.menuUpdate;
import static Projetos.Projeto07_PSTE.Controller.Delete.menuDelete;
import Projetos.Projeto07_PSTE.ModelsPersonas.Torcedor;
import Projetos.Projeto07_PSTE.ModelsPersonas.Colaborador;
import Projetos.Projeto07_PSTE.ModelsPersonas.Atleta;
import Projetos.Projeto07_PSTE.ModelsPersonas.Time;
import Projetos.Projeto07_PSTE.ModelsPersonas.Entidade;
import Projetos.Projeto07_PSTE.ModelsPersonas.Empresa;

import java.util.ArrayList;
import java.util.List;

public class Main 
{
    public static Scanner scan = new Scanner(System.in);
    public static String opcao;
    public static List<Time> listaTime = new ArrayList<>();
    public static List<Entidade> listaEntidade = new ArrayList<>();
    public static List<Empresa> listaEmpresa = new ArrayList<>();
    public static List<Torcedor> listaTorcedor = new ArrayList<>();
    public static List<Colaborador> listaColaborador = new ArrayList<>();
    public static List<Atleta> listaAtleta = new ArrayList<>();
    
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