package Projetos.Projeto9.Controller;

import static Projetos.Projeto9.Controller.Create.listaTorcedor;
import static Projetos.Projeto9.Controller.Create.listaEmpresa;
import static Projetos.Projeto9.Controller.Main.*;
import static Projetos.Projeto9.Controller.Uteis.*;
import Projetos.Projeto9.ModelsPersonas.Empresa;
import Projetos.Projeto9.ModelsPersonas.Torcedor;

public class Read 
{
    public static void menuRead()
    {
        pulaLinha(1);
        System.out.println("****************************");
        System.out.println("******   MENU READ   *******");
        System.out.println("****************************");
        System.out.println("***  Lista Torcedor - 1  ***");
        System.out.println("*** Lista Colaborador - 2 **");
        System.out.println("***   Lista Atleta - 3   ***");
        System.out.println("****   Lista Time - 4   ****");
        System.out.println("**** Lista Entidade - 5 ****");
        System.out.println("****  Lista Empresa - 6  ***");
        System.out.println("****     Voltar - 0     ****");
        System.out.println("****************************");
        System.out.print("***** Opção Escolhida: ");
        int opcaoSubMenu = Integer.parseInt(scan.nextLine());
        switch(opcaoSubMenu)
        {
            case 1:
            {
                pulaLinha(1);
                System.out.println("Lista Torcedor");
                for(Torcedor item: listaTorcedor)
                {
                    pulaLinha(1);
                    System.out.println(item.verId());
                    System.out.println(item.verNome());
                    System.out.println(item.verSobrenome());
                    System.out.println(item.verDocumento());
                    System.out.println(item.verPaisOrigem());
                    System.out.println(item.verTime());
                }
                pulaLinha(1);
                System.out.println("Tecle <Enter> para continuar...");
                String opcao = scan.nextLine();
                menuRead();
            }
            case 2:
                //TODO
                pulaLinha(1);
                System.out.println("Lista Colaborador");
                menuRead();
            case 3:
                //TODO
                pulaLinha(1);
                System.out.println("Lista Atleta");
                menuRead();
            case 4:
                //TODO
                pulaLinha(1);
                System.out.println("Lista Time");
                menuRead();
            case 5:
                //TODO
                pulaLinha(1);
                System.out.println("Lista Entidade");
                menuRead();
            case 6:
                pulaLinha(1);
                System.out.println("***** Lista Empresa *****");
                for(Empresa item: listaEmpresa)
                {
                    pulaLinha(1);
                    System.out.println(item.verId());
                    System.out.println(item.verNome());
                    System.out.println(item.verSobrenome());
                    System.out.println(item.verDocumento());
                    System.out.println(item.verPaisOrigem());
                    System.out.println(item.verTime());
                }
                pulaLinha(1);
                System.out.println("Tecle <Enter> para continuar...");
                opcao = scan.nextLine();
                menuRead();
            case 0:
                pulaLinha(1);
                menuPrincipal();
            default:
                pulaLinha(2);
                System.out.print("Opção Inválida! Tecle <Enter> para continuar...");
                opcao = scan.nextLine();
                pulaLinha(1);
                menuRead();                
        }
    }
}