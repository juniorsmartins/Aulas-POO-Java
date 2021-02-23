package Projetos.Projeto9.Controller;

import static Projetos.Projeto9.Controller.Uteis.*;
import static Projetos.Projeto9.Controller.Main.listaTorcedor;
import static Projetos.Projeto9.Controller.Main.listaColaborador;
import static Projetos.Projeto9.Controller.Main.listaAtleta;
import static Projetos.Projeto9.Controller.Main.listaTime;
import static Projetos.Projeto9.Controller.Main.listaEntidade;
import static Projetos.Projeto9.Controller.Main.listaEmpresa;
import static Projetos.Projeto9.Controller.Main.*;
import Projetos.Projeto9.ModelsPersonas.Torcedor;
import Projetos.Projeto9.ModelsPersonas.*;

import java.util.List;

public class Update 
{
    public static void menuUpdate()
    {
        pulaLinha(2);
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
                editarFlex(listaTorcedor, opcaoSubMenu);
                break;
            case 2:
                editarFlex(listaColaborador, opcaoSubMenu);
                break;
            case 3:
                editarFlex(listaAtleta, opcaoSubMenu);
                break;
            case 4:
                editarFlex(listaTime, opcaoSubMenu);
                break;
            case 5:
                editarFlex(listaEntidade, opcaoSubMenu);
                break;
            case 6:
                editarFlex(listaEmpresa, opcaoSubMenu);
                break;
            case 0:
                menuPrincipal();
            default:
                opcaoInvalida();
                menuUpdate();
        }
    }

    // 
    public static void editarFlex(List listaFlex, int opcaoSbMen)
    {
        boolean listaVaziaOuNao = listaVaziaOuNao(listaFlex);
        if(listaVaziaOuNao == true)
        {
            tecleEnter();
            menuUpdate();
        }
        else
        {
            encontrarObjetoEditavel(opcaoSbMen);
        }
    }
    
    // Verifica se há conteúdo na lista
    public static boolean listaVaziaOuNao(List listFlexivel)
    {
        boolean listaFvaziaOuNao = listFlexivel.isEmpty();
        if(listaFvaziaOuNao == true)
        {
            listaVazia();
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static void encontrarObjetoEditavel(int opcaoSbMen)
    {
        int resultadoComparacao = 0;
        System.out.print("Busca por ID: ");
        int idEditavel = Integer.parseInt(scan.nextLine());
        switch(opcaoSbMen)
        {
            case 1:
                Torcedor objeto = new Torcedor();
                objeto.updateId(idEditavel);
                
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
    }
    
    
}