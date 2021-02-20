package Projetos.Projeto9.Controller;

import static Projetos.Projeto9.Controller.Main.*;
import static Projetos.Projeto9.Controller.Uteis.*;
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
                System.out.println("*************************");
                System.out.println("***** Lista Torcedor ****");
                System.out.println("*************************");
                System.out.println("***** Tamanho: " + listaTorcedor.size());
                boolean checarLista = listaTorcedor.isEmpty();
                if(checarLista == true)
                {
                    pulaLinha(1);
                    System.out.println("Lista Vazia!");
                }
                else
                {
                    listaTorcedor.forEach(torcedor -> {torcedor.verTudo();});
                }
                pulaLinha(1);
                System.out.print("Tecle <Enter> para continuar...");
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
                System.out.println("*************************");
                System.out.println("***** Lista Empresa *****");
                System.out.println("*************************");
                System.out.println("***** Tamanho: " + listaEmpresa.size());
                boolean checarLista = listaEmpresa.isEmpty();
                if(checarLista == true)
                {
                    pulaLinha(1);
                    System.out.println("Lista Vazia!");
                }
                else
                {
                    listaEmpresa.forEach(empresa -> {empresa.verTudo();});
                }
                pulaLinha(1);
                System.out.print("Tecle <Enter> para continuar...");
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