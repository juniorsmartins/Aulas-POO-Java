package Projetos.Projeto07_PSTE.Controller;

import static Projetos.Projeto07_PSTE.Controller.Main.*;
import static Projetos.Projeto07_PSTE.Controller.Uteis.*;
import java.util.List;

public class Read 
{
    public static void menuRead()
    {
        pulaLinha(2);
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
        
        String tipo;
        switch(opcaoSubMenu)
        {
            case 1:
                tipo = "Torcedores";
//                cabecaApresentacao(listaTorcedor, tipo);
                mostrarListaChecada(listaTorcedor, tipo);
                break;
            case 2:
                tipo = "Colaboradores";
                mostrarListaChecada(listaColaborador, tipo);
                break;
            case 3:
                tipo = "Atletas";
                mostrarListaChecada(listaAtleta, tipo);
                break;
            case 4:
                tipo = "Times";
                mostrarListaChecada(listaTime, tipo);
                break;
            case 5:
                tipo = "Entidades";
                mostrarListaChecada(listaEntidade, tipo);
                break;
            case 6:
                tipo = "Empresas";
                mostrarListaChecada(listaEmpresa, tipo);
                break;
            case 0:
                menuPrincipal();
            default:
                opcaoInvalida();
                menuRead();      
        }
        
        tecleEnter();
        menuRead();
    }
     
//    public static void cabecaApresentacao(List lista, String tipo)
//    {
//        pulaLinha(1);
//        System.out.println("*************************");
//        System.out.println("***** Lista de " + tipo);
//        System.out.println("*************************");
//        System.out.println("***** Tamanho: " + lista.size());
//    }
    
    public static void mostrarListaChecada(List lista, String tipo)
    {
        boolean checarLista = lista.isEmpty();
        if(checarLista == true)
        {
            listaVazia();
        }
        else
        {
            pulaLinha(1);
            System.out.println("*************************");
            System.out.println("***** Lista de " + tipo);
            System.out.println("*************************");
            System.out.println("***** Tamanho: " + lista.size());
            lista.forEach(objeto -> {objeto.toString();});
        }
    }
}