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
import Projetos.Projeto9.ModelsPersonas.Colaborador;
import Projetos.Projeto9.ModelsPersonas.Atleta;
import Projetos.Projeto9.ModelsPersonas.Time;
import Projetos.Projeto9.ModelsPersonas.Entidade;
import Projetos.Projeto9.ModelsPersonas.Empresa;

import java.util.Iterator;

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
        String nome, sobrenome, cpf, pais, time;
        int resultadoComparacao = 0;
        System.out.print("Busca por ID: ");
        int idEditavel = Integer.parseInt(scan.nextLine());
        switch(opcaoSbMen)
        {
            case 1:
                Torcedor objeto1 = new Torcedor();
                objeto1.updateId(idEditavel);
                Iterator<Torcedor> i1 = listaTorcedor.iterator();
                while(i1.hasNext())
                {
                    if(i1.next().getId() == objeto1.getId())
                    {
                        System.out.print("\nNome: ");
                        objeto1.editarNome(nome = scan.nextLine());
                        System.out.print("Sobrenome: ");
                        objeto1.editarSobrenome(sobrenome = scan.nextLine());
                        System.out.print("CPF: ");
                        objeto1.editarDocumento(cpf = scan.nextLine());
                        System.out.print("País de Nascimento: ");
                        objeto1.editarPaisOrigem(pais = scan.nextLine());
                        System.out.print("Time de FA: ");
                        objeto1.editarTime(time = scan.nextLine());
                        listaTorcedor.remove(idEditavel);
                        listaTorcedor.add(idEditavel, objeto1);
                        objetoEditado();
                        tecleEnter();
                        menuUpdate();
                    }
                }
                break;
            case 2:
                Colaborador objeto2 = new Colaborador();
                objeto2.updateId(idEditavel);
                Iterator<Colaborador> i2 = listaColaborador.iterator();
                while(i2.hasNext())
                {
                    if(i2.next().getId() == objeto2.getId())
                    {
                        System.out.print("\nNome: ");
                        objeto2.editarNome(nome = scan.nextLine());
                        System.out.print("Sobrenome: ");
                        objeto2.editarSobrenome(sobrenome = scan.nextLine());
                        System.out.print("CPF: ");
                        objeto2.editarDocumento(cpf = scan.nextLine());
                        System.out.print("País de Nascimento: ");
                        objeto2.editarPaisOrigem(pais = scan.nextLine());
                        System.out.print("Time de FA: ");
                        objeto2.editarTime(time = scan.nextLine());
                        listaColaborador.remove(idEditavel);
                        listaColaborador.add(idEditavel, objeto2);
                        objetoEditado();
                        tecleEnter();
                        menuUpdate();
                    }
                }
                break;
            case 3:
                Atleta objeto3 = new Atleta();
                objeto3.updateId(idEditavel);
                Iterator<Atleta> i3 = listaAtleta.iterator();
                while(i3.hasNext())
                {
                    if(i3.next().getId() == objeto3.getId())
                    {
                        System.out.print("\nNome: ");
                        objeto3.editarNome(nome = scan.nextLine());
                        System.out.print("Sobrenome: ");
                        objeto3.editarSobrenome(sobrenome = scan.nextLine());
                        System.out.print("CPF: ");
                        objeto3.editarDocumento(cpf = scan.nextLine());
                        System.out.print("País de Nascimento: ");
                        objeto3.editarPaisOrigem(pais = scan.nextLine());
                        System.out.print("Time de FA: ");
                        objeto3.editarTime(time = scan.nextLine());
                        listaAtleta.remove(idEditavel);
                        listaAtleta.add(idEditavel, objeto3);
                        objetoEditado();
                        tecleEnter();
                        menuUpdate();
                    }
                }
                break;
            case 4:
                Time objeto4 = new Time();
                objeto4.updateId(idEditavel);
                Iterator<Time> i4 = listaTime.iterator();
                while(i4.hasNext())
                {
                    if(i4.next().getId() == objeto4.getId())
                    {
                        System.out.print("\nNome: ");
                        objeto4.editarNome(nome = scan.nextLine());
                        System.out.print("Sobrenome: ");
                        objeto4.editarSobrenome(sobrenome = scan.nextLine());
                        System.out.print("CPF: ");
                        objeto4.editarDocumento(cpf = scan.nextLine());
                        System.out.print("País de Nascimento: ");
                        objeto4.editarPaisOrigem(pais = scan.nextLine());
                        System.out.print("Time de FA: ");
                        objeto4.editarTime(time = scan.nextLine());
                        listaTime.remove(idEditavel);
                        listaTime.add(idEditavel, objeto4);
                        objetoEditado();
                        tecleEnter();
                        menuUpdate();
                    }
                }
                break;
            case 5:
                Entidade objeto5 = new Entidade();
                objeto5.updateId(idEditavel);
                Iterator<Entidade> i5 = listaEntidade.iterator();
                while(i5.hasNext())
                {
                    if(i5.next().getId() == objeto5.getId())
                    {
                        System.out.print("\nNome: ");
                        objeto5.editarNome(nome = scan.nextLine());
                        System.out.print("Sobrenome: ");
                        objeto5.editarSobrenome(sobrenome = scan.nextLine());
                        System.out.print("CPF: ");
                        objeto5.editarDocumento(cpf = scan.nextLine());
                        System.out.print("País de Nascimento: ");
                        objeto5.editarPaisOrigem(pais = scan.nextLine());
                        System.out.print("Time de FA: ");
                        objeto5.editarTime(time = scan.nextLine());
                        listaEntidade.remove(idEditavel);
                        listaEntidade.add(idEditavel, objeto5);
                        objetoEditado();
                        tecleEnter();
                        menuUpdate();
                    }
                }
                break;
            case 6:
                Empresa objeto6 = new Empresa();
                objeto6.updateId(idEditavel);
                Iterator<Empresa> i6 = listaEmpresa.iterator();
                while(i6.hasNext())
                {
                    if(i6.next().getId() == objeto6.getId())
                    {
                        System.out.print("\nNome: ");
                        objeto6.editarNome(nome = scan.nextLine());
                        System.out.print("Sobrenome: ");
                        objeto6.editarSobrenome(sobrenome = scan.nextLine());
                        System.out.print("CPF: ");
                        objeto6.editarDocumento(cpf = scan.nextLine());
                        System.out.print("País de Nascimento: ");
                        objeto6.editarPaisOrigem(pais = scan.nextLine());
                        System.out.print("Time de FA: ");
                        objeto6.editarTime(time = scan.nextLine());
                        listaEmpresa.remove(idEditavel);
                        listaEmpresa.add(idEditavel, objeto6);
                        objetoEditado();
                        tecleEnter();
                        menuUpdate();
                    }
                }
                break;
        }
        naoEncontrado();
        tecleEnter();
        menuUpdate();
    }
}