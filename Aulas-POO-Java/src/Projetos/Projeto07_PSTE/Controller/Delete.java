package Projetos.Projeto07_PSTE.Controller;

import static Projetos.Projeto07_PSTE.Controller.Main.*;
import static Projetos.Projeto07_PSTE.Controller.Uteis.*;
import static Projetos.Projeto07_PSTE.Controller.Main.listaTorcedor;
import static Projetos.Projeto07_PSTE.Controller.Main.listaColaborador;
import static Projetos.Projeto07_PSTE.Controller.Main.listaAtleta;
import static Projetos.Projeto07_PSTE.Controller.Main.listaTime;
import static Projetos.Projeto07_PSTE.Controller.Main.listaEntidade;
import static Projetos.Projeto07_PSTE.Controller.Main.listaEmpresa;
import Projetos.Projeto07_PSTE.ModelsPersonas.Torcedor;
import Projetos.Projeto07_PSTE.ModelsPersonas.Colaborador;
import Projetos.Projeto07_PSTE.ModelsPersonas.Atleta;
import Projetos.Projeto07_PSTE.ModelsPersonas.Time;
import Projetos.Projeto07_PSTE.ModelsPersonas.Entidade;
import Projetos.Projeto07_PSTE.ModelsPersonas.Empresa;

import java.util.Iterator;
import java.util.List;

public class Delete 
{
    public static void menuDelete()
    {
        pulaLinha(2);
        System.out.println("****************************");
        System.out.println("******   MENU DELETE   *****");
        System.out.println("****************************");
        System.out.println("**  Deletar Torcedor - 1  **");
        System.out.println("** Deletar Colaborador - 2 *");
        System.out.println("**   Deletar Atleta - 3   **");
        System.out.println("**    Deletar Time - 4    **");
        System.out.println("**  Deletar Entidade - 5  **");
        System.out.println("**  Deletar Empresa - 6   **");
        System.out.println("**       Voltar - 0       **");
        System.out.println("****************************");
        System.out.print("***** Opção Escolhida: ");
        int opcaoSubMenu = Integer.parseInt(scan.nextLine());
        switch(opcaoSubMenu)
        {
            case 1:
                qualDeletar(listaTorcedor, opcaoSubMenu);
                break;
            case 2:
                qualDeletar(listaColaborador, opcaoSubMenu);
                break;
            case 3:
                qualDeletar(listaAtleta, opcaoSubMenu);
                break;
            case 4:
                qualDeletar(listaTime, opcaoSubMenu);
                break;
            case 5:
                qualDeletar(listaEntidade, opcaoSubMenu);
                break;
            case 6:
                qualDeletar(listaEmpresa, opcaoSubMenu);
                break;
            case 0:
                menuPrincipal();
            default:
                opcaoInvalida();
                menuDelete();
        }
        tecleEnter();
        menuDelete();
    }
    
    public static void qualDeletar(List lista, int opcaoSubMenu)
    {
        checarListaVazia(lista);
        encontrarNaLista(opcaoSubMenu);

    }

    public static void checarListaVazia(List lista)
    {
        boolean listaVazia = lista.isEmpty();
        if(listaVazia == true)
        {
            listaVazia();
            tecleEnter();
            menuDelete();
        }
    }

    public static void encontrarNaLista(int opcaoSubMenu)
    {
        int posicao = 0;
        System.out.print("\nBusca por ID: ");
        int idDeletavel = Integer.parseInt(scan.nextLine());
        switch(opcaoSubMenu)
        {
            case 1:
                Iterator<Torcedor> it1 = listaTorcedor.iterator();
                while(it1.hasNext())
                {
                    if(it1.next().getId() == idDeletavel)
                    {
                        listaTorcedor.remove(posicao);
                        deletadoOK();
                    }
                    posicao++;
                }
                break;
            case 2:
                Iterator<Colaborador> it2 = listaColaborador.iterator();
                while(it2.hasNext())
                {
                    if(it2.next().getId() == idDeletavel)
                    {
                        listaColaborador.remove(posicao);
                        deletadoOK();
                    }
                    posicao++;
                }
                break;
            case 3:
                Iterator<Atleta> it3 = listaAtleta.iterator();
                while(it3.hasNext())
                {
                    if(it3.next().getId() == idDeletavel)
                    {
                        listaAtleta.remove(posicao);
                        deletadoOK();
                    }
                    posicao++;
                }
                break;
            case 4:
                Iterator<Time> it4 = listaTime.iterator();
                while(it4.hasNext())
                {
                    if(it4.next().getId() == idDeletavel)
                    {
                        listaTime.remove(posicao);
                        deletadoOK();
                    }
                    posicao++;
                }
                break;
            case 5:
                Iterator<Entidade> it5 = listaEntidade.iterator();
                while(it5.hasNext())
                {
                    if(it5.next().getId() == idDeletavel)
                    {
                        listaEntidade.remove(posicao);
                        deletadoOK();
                    }
                    posicao++;
                }
                break;
            case 6:
                Iterator<Empresa> it6 = listaEmpresa.iterator();
                while(it6.hasNext())
                {
                    if(it6.next().getId() == idDeletavel)
                    {
                        listaEmpresa.remove(posicao);
                        deletadoOK();
                    }
                    posicao++;
                }
                break;
        }
    }
}