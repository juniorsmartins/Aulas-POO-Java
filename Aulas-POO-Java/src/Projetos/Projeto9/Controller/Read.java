package Projetos.Projeto9.Controller;

import static Projetos.Projeto9.Controller.Main.*;
import static Projetos.Projeto9.Controller.Uteis.*;

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
        switch(opcaoSubMenu)
        {
            case 1:
            case 2:
            case 3:
                readFisica(opcaoSubMenu);
            case 4:
            case 5:
            case 6:
                readJuridica(opcaoSubMenu);
            case 0:
                menuPrincipal();
            default:
                opcaoInvalida();
                menuRead();      
        }
    }
    
    public static void readFisica(int opcaoSubMenu)
    {

        System.out.println("***** Tamanho: " + listaTorcedor.size());
        
        String tipo;
        boolean checarLista;
        switch(opcaoSubMenu)
        {
            case 1:
                tipo = "Torcedores";
                apresentaLista(tipo);
                System.out.println("***** Tamanho: " + listaTorcedor.size());
                checarLista = listaTorcedor.isEmpty();
                if(checarLista == true)
                {
                    listaVazia();
                }
                else
                {
                    listaTorcedor.forEach(objeto -> {objeto.toString();});
                }
            case 2:
                tipo = "Colaboradores";
                apresentaLista(tipo);
                System.out.println("***** Tamanho: " + listaColaborador.size());
                checarLista = listaColaborador.isEmpty();
                if(checarLista == true)
                {
                    listaVazia();
                }
                else
                {
                    listaColaborador.forEach(objeto -> {objeto.toString();});
                }
            case 3:
                tipo = "Atletas";
                apresentaLista(tipo);
                System.out.println("***** Tamanho: " + listaAtleta.size());
                checarLista = listaAtleta.isEmpty();
                if(checarLista == true)
                {
                    listaVazia();
                }
                else
                {
                    listaAtleta.forEach(objeto -> {objeto.toString();});
                }
        }
        
        tecleEnter();
        menuRead();
    }
     
    public static void readJuridica(int opcaoSubMenu)
    {
        pulaLinha(1);
        System.out.println("*************************");
        System.out.println("******* Lista Time ******");
        System.out.println("*************************");
        System.out.println("***** Tamanho: " + listaTime.size());
        boolean checarLista = listaTime.isEmpty();
        if(checarLista == true)
        {
            listaVazia();
        }
        else
        {
            listaTime.forEach(equipe -> {equipe.toString();});
        }
        tecleEnter();
        menuRead();
    }
}