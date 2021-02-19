package Projetos.Projeto9.Controller;

import static Projetos.Projeto9.Controller.Main.*;
import static Projetos.Projeto9.Controller.Uteis.pulaLinha;
import Projetos.Projeto9.ModelsPersonas.Torcedor;
import Projetos.Projeto9.ModelsPersonas.Empresa;

import java.util.ArrayList;

public class Create 
{
    static ArrayList<Empresa> listaEmpresa;
    static ArrayList<Torcedor> listaTorcedor;
    public static void menuCreate()
    {
        pulaLinha(1);
        System.out.println("****************************");
        System.out.println("******  MENU CREATE  *******");
        System.out.println("****************************");
        System.out.println("*****   Torcedor - 1   *****");
        System.out.println("***** Colaborador - 2  *****");
        System.out.println("*****    Atleta - 3    *****");
        System.out.println("*****     Time - 4     *****");
        System.out.println("*****   Entidade - 5   *****");
        System.out.println("****     Empresa - 6   *****");
        System.out.println("****     Voltar - 0    *****");
        System.out.println("****************************");
        System.out.print("***** Opção Escolhida: ");
        int opcaoSubMenu = Integer.parseInt(scan.nextLine());
        switch(opcaoSubMenu)
        {
            case 1:
                createTorcedor();
                break;
            case 2:
                createColaborador();
                break;
            case 3:
                createAtleta();
                break;
            case 4:
                createTime();
                break;
            case 5:
                createEntidade();
                break;
            case 6:
                createEmpresa();
                break;
            case 0:
                pulaLinha(1);
                menuPrincipal();
            default:
                pulaLinha(2);
                System.out.print("Opção Inválida! Tecle <Enter> para continuar...");
                String opcao = scan.nextLine();
                pulaLinha(1);
                menuCreate();
        }
    }
    
    public static void createTorcedor()
    {
        Torcedor torcedor;
        listaTorcedor = new ArrayList<>();
        String nome, sobrenome, cpf, pais, time;
        
        System.out.print("\nNome: ");
        nome = scan.nextLine();
        System.out.print("\nSobrenome: ");
        sobrenome = scan.nextLine();
        System.out.print("\nCPF: ");
        cpf = scan.nextLine();
        System.out.print("\nPaís de Origem: ");
        pais = scan.nextLine();
        System.out.print("\nTime de FA: ");
        time = scan.nextLine();
        
        torcedor = new Torcedor(nome, sobrenome, cpf, pais, time);
        listaTorcedor.add(torcedor);
        
        menuCreate();
    }

    public static void createColaborador()
    {
        //TODO
        pulaLinha(2);
        System.out.println("Colaborador");
        System.out.print("Pressione <Enter> para continuar...");
        opcao = scan.nextLine();
        pulaLinha(2);
        menuCreate();        
    }

    public static void createAtleta()
    {
        //TODO
        pulaLinha(2);
        System.out.println("Atleta");
        System.out.print("Pressione <Enter> para continuar...");
        opcao = scan.nextLine();
        pulaLinha(2);
        menuCreate();
    }

    public static void createTime()
    {
        //TODO
        pulaLinha(2);
        System.out.println("Time");
        System.out.print("Pressione <Enter> para continuar...");
        opcao = scan.nextLine();
        pulaLinha(2);
        menuCreate();
    }

    public static void createEntidade()
    {
        //TODO
        pulaLinha(2);
        System.out.println("Entidade");
        System.out.print("Pressione <Enter> para continuar...");
        opcao = scan.nextLine();
        pulaLinha(2);
        menuCreate();
    }

    public static void createEmpresa()
    {
        Empresa empresa;
        listaEmpresa = new ArrayList<>();
        String razaoSocial, nomeFantasia, cnpj, pais, time;
        
        System.out.print("\nRazão Social: ");
        razaoSocial = scan.nextLine();
        System.out.print("\nNome Fantasia: ");
        nomeFantasia = scan.nextLine();
        System.out.print("\nCNPJ: ");
        cnpj = scan.nextLine();
        System.out.print("\nPais de Origem: ");
        pais = scan.nextLine();
        System.out.print("\nTime de FA: ");
        time = scan.nextLine();
        
        empresa = new Empresa(razaoSocial, nomeFantasia, cnpj, pais, time);
        listaEmpresa.add(empresa);

        menuCreate();
    }
}