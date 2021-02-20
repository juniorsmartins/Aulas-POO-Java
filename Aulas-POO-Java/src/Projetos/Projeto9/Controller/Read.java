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
                readTorcedor();
            case 2:
                readColaborador();
            case 3:
                readAtleta();
            case 4:
                readTime();
            case 5:
                readEntidade();
            case 6:
                readEmpresa();
            case 0:
                menuPrincipal();
            default:
                opcaoInvalida();
                menuRead();      
        }
    }
    
    public static void readTorcedor()
    {
        pulaLinha(1);
        System.out.println("*************************");
        System.out.println("***** Lista Torcedor ****");
        System.out.println("*************************");
        System.out.println("***** Tamanho: " + listaFisica.size());
        boolean checarLista = listaFisica.isEmpty();
        if(checarLista == true)
        {
            listaVazia();
        }
        else
        {
            
            listaFisica.forEach(torcedor -> {torcedor.verTudo();});
        }
        tecleEnter();
        menuRead();
    }
    
    public static void readColaborador()
    {
        pulaLinha(1);
        System.out.println("Lista Colaborador");
        tecleEnter();
        menuRead();
    }
    
    public static void readAtleta()
    {
        pulaLinha(1);
        System.out.println("Lista Atleta");
        tecleEnter();
        menuRead();
    }
    
    public static void readTime()
    {
        pulaLinha(1);
        System.out.println("Lista Time");
        tecleEnter();
        menuRead();
    }
    
    public static void readEntidade()
    {
        pulaLinha(1);
        System.out.println("Lista Entidade");
        tecleEnter();
        menuRead();
    }
    
    public static void readEmpresa()
    {
        pulaLinha(1);
        System.out.println("*************************");
        System.out.println("***** Lista Empresa *****");
        System.out.println("*************************");
        System.out.println("***** Tamanho: " + listaJuridica.size());
        boolean checarLista = listaJuridica.isEmpty();
        if(checarLista == true)
        {
            listaVazia();
        }
        else
        {
            listaJuridica.forEach(empresa -> {empresa.verTudo();});
        }
        tecleEnter();
        menuRead();        
    }
}