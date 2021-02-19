package Projetos.Projeto9.Controller;

import static Projetos.Projeto9.Controller.Main.menuPrincipal;
import static Projetos.Projeto9.Controller.Main.scan;
import static Projetos.Projeto9.Controller.Uteis.pulaLinha;

public class Create 
{
    public static void menuCreate()
    {
        pulaLinha(1);
        System.out.println("****************************");
        System.out.println("******  MENU CREATE  *******");
        System.out.println("****************************");
        System.out.println("*****   Torcedor - 1   *****");
        System.out.println("***** Colaborador - 2  *****");
        System.out.println("*****    Atleta - 3    *****");
        System.out.println("*****     Time - 4     *****");
        System.out.println("*****   Entidade - 5   *****");
        System.out.println("****     Empresa - 6   *****");
        System.out.println("****     Voltar - 0    *****");
        System.out.println("****************************");
        System.out.print("***** Opção Escolhida: ");
        int opcaoSubMenu = Integer.parseInt(scan.nextLine());
        switch(opcaoSubMenu)
        {
            case 1:
                createTorcedor();
                break;
            case 2:
                createColaborador();
                break;
            case 3:
                createAtleta();
                break;
            case 4:
                createTime();
                break;
            case 5:
                createEntidade();
                break;
            case 6:
                createEmpresa();
                break;
            case 0:
                pulaLinha(2);
                menuPrincipal();
            default:
                pulaLinha(2);
                System.out.print("Opção Inválida! Tecle enter para continuar...");
                String opcao = scan.nextLine();
                pulaLinha(2);
                menuCreate();
        }
    }
    
    public static void createTorcedor()
    {
        //TODO
    }
    public static void createColaborador()
    {
        //TODO
    }
    public static void createAtleta()
    {
        //TODO
    }
    public static void createTime()
    {
        //TODO
    }
    public static void createEntidade()
    {
        //TODO
    }
    public static void createEmpresa()
    {
        //TODO
    }
}