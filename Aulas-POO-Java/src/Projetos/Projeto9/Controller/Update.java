package Projetos.Projeto9.Controller;

import static Projetos.Projeto9.Controller.Uteis.*;
import static Projetos.Projeto9.Controller.Main.*;

public class Update 
{
    public static void menuUpdate()
    {
        pulaLinha(1);
        System.out.println("****************************");
        System.out.println("******   MENU UPDATE   *****");
        System.out.println("****************************");
        System.out.println("***  Editar Torcedor - 1  **");
        System.out.println("** Editar Colaborador - 2 **");
        System.out.println("***   Editar Atleta - 3   **");
        System.out.println("****   Editar Time - 4   ***");
        System.out.println("**** Editar Entidade - 5 ***");
        System.out.println("***  Editar Empresa - 6  ***");
        System.out.println("****     Voltar - 0     ****");
        System.out.println("****************************");
        System.out.print("***** Opção Escolhida: ");
        int opcaoSubMenu = Integer.parseInt(scan.nextLine());
        switch(opcaoSubMenu)
        {
            case 1:
                editarTorcedor();
            case 2:
                editarColaborador();
            case 3:
                editarAtleta();
            case 4:
                editarTime();
            case 5:
                editarEntidade();
            case 6:
                editarEmpresa();
            case 0:
                menuPrincipal();
            default:
                opcaoInvalida();
                menuUpdate();
        }
    }
    
    public static void editarTorcedor()
    {
        //TODO
    }
    
    public static void editarColaborador()
    {
        //TODO
    }
    
    public static void editarAtleta()
    {
        //TODO
    }
    
    public static void editarTime()
    {
        //TODO
    }
    
    public static void editarEntidade()
    {
        //TODO
    }
    
    public static void editarEmpresa()
    {
        //TODO
    }
}