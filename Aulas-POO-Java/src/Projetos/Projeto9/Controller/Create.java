package Projetos.Projeto9.Controller;

import static Projetos.Projeto9.Controller.Main.*;
import static Projetos.Projeto9.Controller.Uteis.*;
import Projetos.Projeto9.ModelsPersonas.*;

public class Create 
{
    public static void menuCreate()
    {
        pulaLinha(2);
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
                menuPrincipal();
            default:
                opcaoInvalida();
                menuCreate();
        }
    }
    
    public static void createTorcedor()
    {
        String nome, sobrenome, cpf, pais, time;
        
        System.out.print("\nNome: ");
        nome = scan.nextLine();
        System.out.print("Sobrenome: ");
        sobrenome = scan.nextLine();
        System.out.print("CPF: ");
        cpf = scan.nextLine();
        System.out.print("País de Origem: ");
        pais = scan.nextLine();
        System.out.print("Time de FA: ");
        time = scan.nextLine();
        
        Torcedor torcedor = new Torcedor(nome, sobrenome, cpf, pais, time);
        listaTorcedor.add(torcedor);
        
        menuCreate();
    }

    public static void createColaborador()
    {
        String nome, sobrenome, cpf, pais, time;
        
        System.out.print("\nNome: ");
        nome = scan.nextLine();
        System.out.print("Sobrenome: ");
        sobrenome = scan.nextLine();
        System.out.print("CPF: ");
        cpf = scan.nextLine();
        System.out.print("País de Origem: ");
        pais = scan.nextLine();
        System.out.print("Time de FA: ");
        time = scan.nextLine();
        
        Colaborador colaborador = new Colaborador(nome, sobrenome, cpf, pais, time);
        listaColaborador.add(colaborador);
        
        menuCreate();
    }

    public static void createAtleta()
    {
        String nome, sobrenome, cpf, pais, time;
        
        System.out.print("\nNome: ");
        nome = scan.nextLine();
        System.out.print("Sobrenome: ");
        sobrenome = scan.nextLine();
        System.out.print("CPF: ");
        cpf = scan.nextLine();
        System.out.print("País de Origem: ");
        pais = scan.nextLine();
        System.out.print("Time de FA: ");
        time = scan.nextLine();
        
        Atleta atleta = new Atleta(nome, sobrenome, cpf, pais, time);
        listaAtleta.add(atleta);
        
        menuCreate();
    }

    public static void createTime()
    {
        String razaoSocial, nomeFantasia, cnpj, pais, equipe;
        
        System.out.print("\nRazão Social: ");
        razaoSocial = scan.nextLine();
        System.out.print("Nome Fantasia: ");
        nomeFantasia = scan.nextLine();
        System.out.print("CNPJ: ");
        cnpj = scan.nextLine();
        System.out.print("Pais de Origem: ");
        pais = scan.nextLine();
        System.out.print("Time de FA: ");
        equipe = scan.nextLine();
        
        Time time = new Time(razaoSocial, nomeFantasia, cnpj, pais, equipe);
        listaTime.add(time);

        menuCreate();
    }

    public static void createEntidade()
    {
        String razaoSocial, nomeFantasia, cnpj, pais, time;
        
        System.out.print("\nRazão Social: ");
        razaoSocial = scan.nextLine();
        System.out.print("Nome Fantasia: ");
        nomeFantasia = scan.nextLine();
        System.out.print("CNPJ: ");
        cnpj = scan.nextLine();
        System.out.print("Pais de Origem: ");
        pais = scan.nextLine();
        System.out.print("Time de FA: ");
        time = scan.nextLine();
        
        Entidade entidade = new Entidade(razaoSocial, nomeFantasia, cnpj, pais, time);
        listaEntidade.add(entidade);

        menuCreate();
    }

    public static void createEmpresa()
    {
        String razaoSocial, nomeFantasia, cnpj, pais, time;
        
        System.out.print("\nRazão Social: ");
        razaoSocial = scan.nextLine();
        System.out.print("Nome Fantasia: ");
        nomeFantasia = scan.nextLine();
        System.out.print("CNPJ: ");
        cnpj = scan.nextLine();
        System.out.print("Pais de Origem: ");
        pais = scan.nextLine();
        System.out.print("Time de FA: ");
        time = scan.nextLine();
        
        Empresa empresa = new Empresa(razaoSocial, nomeFantasia, cnpj, pais, time);
        listaEmpresa.add(empresa);

        menuCreate();
    }
}