package Projetos.Projeto9.Controller;

import static Projetos.Projeto9.Controller.Main.*;
import static Projetos.Projeto9.Controller.Uteis.*;
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
                cabecaApresentacao(listaTorcedor, tipo);
                mostrarListaChecada(listaTorcedor);
            case 2:
                tipo = "Colaboradores";
                cabecaApresentacao(listaColaborador, tipo);
                mostrarListaChecada(listaColaborador);
            case 3:
                tipo = "Atletas";
                cabecaApresentacao(listaAtleta, tipo);
                mostrarListaChecada(listaAtleta);
            case 4:
                tipo = "Time";
                cabecaApresentacao(listaTime, tipo);
                mostrarListaChecada(listaTime);
            case 5:
                tipo = "Entidade";
                cabecaApresentacao(listaEntidade, tipo);
                mostrarListaChecada(listaEntidade);
            case 6:
                tipo = "Empresa";
                cabecaApresentacao(listaEmpresa, tipo);
                mostrarListaChecada(listaEmpresa);
            case 0:
                menuPrincipal();
            default:
                opcaoInvalida();
                menuRead();      
        }
    }
     
    public static void cabecaApresentacao(List lista, String tipo)
    {
        pulaLinha(1);
        System.out.println("*************************");
        System.out.println("***** Lista de " + tipo);
        System.out.println("*************************");
        System.out.println("***** Tamanho: " + lista.size());
    }
    
    public static void mostrarListaChecada(List lista)
    {
        boolean checarLista = lista.isEmpty();
        if(checarLista == true)
        {
            listaVazia();
        }
        else
        {
            lista.forEach(objeto -> {objeto.toString();});
        }
    }
}